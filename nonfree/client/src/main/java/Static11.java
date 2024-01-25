import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	public static int anInt126 = -1;

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
	public static int anInt128 = 0;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "[I")
	public static final int[] anIntArray18 = new int[13];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)V")
	public static void method181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static84.anInt1667 < arg4 || arg0 < Static374.anInt5986) {
			return;
		}
		@Pc(27) boolean local27;
		if (arg1 < Static7.anInt93) {
			local27 = false;
			arg1 = Static7.anInt93;
		} else if (arg1 <= Static115.anInt2377) {
			local27 = true;
		} else {
			arg1 = Static115.anInt2377;
			local27 = false;
		}
		@Pc(47) boolean local47;
		if (arg3 < Static7.anInt93) {
			arg3 = Static7.anInt93;
			local47 = false;
		} else if (arg3 <= Static115.anInt2377) {
			local47 = true;
		} else {
			arg3 = Static115.anInt2377;
			local47 = false;
		}
		if (arg4 < Static374.anInt5986) {
			arg4 = Static374.anInt5986;
		} else {
			Static483.method7014(Static392.anIntArrayArray39[arg4++], arg1, arg3, arg2);
		}
		if (arg0 > Static84.anInt1667) {
			arg0 = Static84.anInt1667;
		} else {
			Static483.method7014(Static392.anIntArrayArray39[arg0--], arg1, arg3, arg2);
		}
		@Pc(105) int local105;
		if (local27 && local47) {
			for (local105 = arg4; local105 <= arg0; local105++) {
				@Pc(143) int[] local143 = Static392.anIntArrayArray39[local105];
				local143[arg1] = local143[arg3] = arg2;
			}
		} else if (local27) {
			for (local105 = arg4; local105 <= arg0; local105++) {
				Static392.anIntArrayArray39[local105][arg1] = arg2;
			}
		} else if (local47) {
			for (local105 = arg4; local105 <= arg0; local105++) {
				Static392.anIntArrayArray39[local105][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)J")
	public static long method182() {
		return Static210.aClass102_2.method8799();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZB)V")
	public static void method184(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static110.anInt2265 != -1) {
				Static344.method5168(Static110.anInt2265);
			}
			for (@Pc(14) Class3_Sub46 local14 = (Class3_Sub46) Static455.aClass83_31.method2375(); local14 != null; local14 = (Class3_Sub46) Static455.aClass83_31.method2370()) {
				if (!local14.method9378()) {
					local14 = (Class3_Sub46) Static455.aClass83_31.method2375();
					if (local14 == null) {
						break;
					}
				}
				Static647.method8986(false, true, local14);
			}
			Static110.anInt2265 = -1;
			Static455.aClass83_31 = new Class83(8);
			Static351.method5211();
			Static110.anInt2265 = Static371.anInt5965;
			Static198.method9275(false);
			Static540.method7765();
			Static565.method8006(Static110.anInt2265);
		}
		Static176.method3163();
		Static44.aBoolean75 = false;
		Static107.method2050();
		Static21.anInt510 = -1;
		Static124.method2350(Static508.anInt8219);
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 = new Class28_Sub1_Sub1_Sub1_Sub1();
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 = Static158.anInt927 * 512 / 2;
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0] = Static158.anInt927 / 2;
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 = Static515.anInt8292 * 512 / 2;
		Static652.anInt10382 = 0;
		Static509.anInt8222 = 0;
		Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0] = Static515.anInt8292 / 2;
		if (Static428.anInt6834 == 2) {
			Static652.anInt10382 = Static38.anInt905 << 9;
			Static509.anInt8222 = Static547.anInt8967 << 9;
		} else {
			Static273.method4432();
		}
		Static225.method3837();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method188(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
