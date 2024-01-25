import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!wu", name = "Db", descriptor = "I")
	public static int anInt9806;

	@OriginalMember(owner = "client!wu", name = "Fb", descriptor = "I")
	public static int anInt9808;

	@OriginalMember(owner = "client!wu", name = "Lb", descriptor = "I")
	public static int anInt9813;

	@OriginalMember(owner = "client!wu", name = "Gb", descriptor = "[I")
	public static final int[] anIntArray619 = new int[500];

	@OriginalMember(owner = "client!wu", name = "Nb", descriptor = "Z")
	public static final boolean aBoolean718 = false;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z[Lclient!in;I)V")
	public static void method7978(@OriginalArg(1) Class160[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class160 local13 = arg0[local7];
			if (local13 != null) {
				if (local13.anInt4166 == 0) {
					if (local13.aClass160Array1 != null) {
						method7978(local13.aClass160Array1, arg1);
					}
					@Pc(34) Class1_Sub38 local34 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local13.anInt4199);
					if (local34 != null) {
						Static568.method7207(local34.anInt7676, arg1);
					}
				}
				@Pc(53) Class1_Sub22 local53;
				if (arg1 == 0 && local13.anObjectArray14 != null) {
					local53 = new Class1_Sub22();
					local53.aClass160_10 = local13;
					local53.anObjectArray1 = local13.anObjectArray14;
					Static451.method6311(local53);
				}
				if (arg1 == 1 && local13.anObjectArray4 != null) {
					if (local13.anInt4146 >= 0) {
						@Pc(81) Class160 local81 = Static512.method7155(local13.anInt4199);
						if (local81 == null || local81.aClass160Array1 == null || local81.aClass160Array1.length <= local13.anInt4146 || local13 != local81.aClass160Array1[local13.anInt4146]) {
							continue;
						}
					}
					local53 = new Class1_Sub22();
					local53.anObjectArray1 = local13.anObjectArray4;
					local53.aClass160_10 = local13;
					Static451.method6311(local53);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIBIIIIII)V")
	public static void method7981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg5 < 1 || Static458.anInt9736 - 2 < arg0 || Static378.anInt6747 - 2 < arg5) {
			return;
		}
		@Pc(29) int local29 = arg2;
		if (arg2 < 3 && Static34.method641(arg0, arg5)) {
			local29 = arg2 + 1;
		}
		if (!Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239) && !Static271.method3983(Static398.anInt7155, local29, arg0, arg5)) {
			return;
		}
		if (Static568.aClass360ArrayArrayArray22 == null) {
			return;
		}
		Static211.aClass234_Sub1_1.method7749(arg0, Static590.aClass240Array1[arg2], arg6, arg5, arg2, Static31.aClass78_18);
		if (arg7 < 0) {
			return;
		}
		@Pc(73) boolean local73 = Static86.aClass1_Sub30_Sub1_1.aBoolean487;
		Static86.aClass1_Sub30_Sub1_1.aBoolean487 = true;
		Static211.aClass234_Sub1_1.method7746(arg5, arg0, arg1, arg3, Static31.aClass78_18, arg4, arg7, local29, arg2, Static590.aClass240Array1[arg2]);
		Static86.aClass1_Sub30_Sub1_1.aBoolean487 = local73;
		return;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Z")
	public static boolean method7982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method7983(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(28) int local28 = local6 + 3 & 0xFFFFFFFC;
		@Pc(34) int local34 = local28 / 4 * 3;
		if (local28 - 2 >= local6 || Static120.method2184(arg0.charAt(local28 - 2)) == -1) {
			local34 -= 2;
		} else if (local28 - 1 >= local6 || Static120.method2184(arg0.charAt(local28 - 1)) == -1) {
			local34--;
		}
		@Pc(71) byte[] local71 = new byte[local34];
		Static437.method6207(0, local71, arg0);
		return local71;
	}
}
