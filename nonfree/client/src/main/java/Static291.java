import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "[I")
	public static int[] anIntArray550;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "Lclient!ea;")
	public static Class55 aClass55_11;

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "Lclient!ka;")
	public static Class109 aClass109_53 = new Class109(64);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!ij;)V")
	public static void method5026(@OriginalArg(1) Class93 arg0) {
		Static199.anInt3969 = arg0.method2393("p11_full");
		Static276.anInt5762 = arg0.method2393("p12_full");
		Static222.anInt4384 = arg0.method2393("b12_full");
		Static57.anInt5922 = arg0.method2393("hitmarks");
		Static72.anInt1380 = arg0.method2393("hitbar_default");
		Static230.anInt4649 = arg0.method2393("timerbar_default");
		Static157.anInt3039 = arg0.method2393("headicons_pk");
		Static160.anInt3176 = arg0.method2393("headicons_prayer");
		Static176.anInt3502 = arg0.method2393("hint_headicons");
		Static168.anInt3372 = arg0.method2393("hint_mapmarkers");
		Static37.anInt673 = arg0.method2393("mapflag");
		Static278.anInt5476 = arg0.method2393("cross");
		Static207.anInt4110 = arg0.method2393("mapdots");
		Static69.anInt1360 = arg0.method2393("scrollbar");
		Static178.anInt3526 = arg0.method2393("name_icons");
		Static284.anInt5593 = arg0.method2393("floorshadows");
		Static54.anInt997 = arg0.method2393("compass");
		Static167.anInt3341 = arg0.method2393("hint_mapedge");
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLjava/lang/String;IB)I")
	public static int method5028(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(22) boolean local22 = false;
		@Pc(32) boolean local32 = false;
		@Pc(34) int local34 = 0;
		@Pc(37) int local37 = arg0.length();
		for (@Pc(39) int local39 = 0; local39 < local37; local39++) {
			@Pc(44) char local44 = arg0.charAt(local39);
			if (local39 == 0) {
				if (local44 == '-') {
					local22 = true;
					continue;
				}
				if (local44 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local44 >= '0' && local44 <= '9') {
				local73 = local44 - '0';
			} else if (local44 >= 'A' && local44 <= 'Z') {
				local73 = local44 - '7';
			} else if (local44 >= 'a' && local44 <= 'z') {
				local73 = local44 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local73) {
				throw new NumberFormatException();
			}
			if (local22) {
				local73 = -local73;
			}
			@Pc(124) int local124 = local73 + arg1 * local34;
			if (local34 != local124 / arg1) {
				throw new NumberFormatException();
			}
			local34 = local124;
			local32 = true;
		}
		if (!local32) {
			throw new NumberFormatException();
		}
		return local34;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)I")
	public static int method5029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILclient!vg;)V")
	public static void method5030(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class201 arg2) {
		if (Static204.aClass201_8 != null || Static93.aBoolean128 || (arg2 == null || Static5.method91(arg2) == null)) {
			return;
		}
		Static204.aClass201_8 = arg2;
		Static342.aClass201_13 = Static5.method91(arg2);
		Static303.aBoolean489 = false;
		Static104.anInt1997 = 0;
		Static139.anInt2691 = arg1;
		Static95.anInt1816 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
	public static void method5031(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg3;
		@Pc(16) int local16 = -arg3;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static161.method2842(arg3 + arg0, Static353.anInt6760, Static163.anInt3234);
		@Pc(35) int local35 = Static161.method2842(arg0 - arg3, Static353.anInt6760, Static163.anInt3234);
		Static160.method2840(arg1, local26, local35, Static129.anIntArrayArray46[arg2]);
		while (local13 > local7) {
			local18 += 2;
			local16 += local18;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(90) int local90;
			@Pc(99) int local99;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local64 = arg2 - local13;
				local68 = local13 + arg2;
				if (Static75.anInt1447 <= local68 && Static346.anInt6668 >= local64) {
					local90 = Static161.method2842(local7 + arg0, Static353.anInt6760, Static163.anInt3234);
					local99 = Static161.method2842(arg0 - local7, Static353.anInt6760, Static163.anInt3234);
					if (local68 <= Static346.anInt6668) {
						Static160.method2840(arg1, local90, local99, Static129.anIntArrayArray46[local68]);
					}
					if (Static75.anInt1447 <= local64) {
						Static160.method2840(arg1, local90, local99, Static129.anIntArrayArray46[local64]);
					}
				}
			}
			local7++;
			local64 = arg2 - local7;
			local68 = arg2 + local7;
			if (Static75.anInt1447 <= local68 && local64 <= Static346.anInt6668) {
				local90 = Static161.method2842(arg0 + local13, Static353.anInt6760, Static163.anInt3234);
				local99 = Static161.method2842(arg0 - local13, Static353.anInt6760, Static163.anInt3234);
				if (Static346.anInt6668 >= local68) {
					Static160.method2840(arg1, local90, local99, Static129.anIntArrayArray46[local68]);
				}
				if (Static75.anInt1447 <= local64) {
					Static160.method2840(arg1, local90, local99, Static129.anIntArrayArray46[local64]);
				}
			}
		}
	}
}
