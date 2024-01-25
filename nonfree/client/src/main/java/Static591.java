import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!so", name = "x", descriptor = "Lclient!tea;")
	public static Class351 aClass351_6;

	@OriginalMember(owner = "client!so", name = "r", descriptor = "Lclient!si;")
	public static Class337 aClass337_3;

	@OriginalMember(owner = "client!so", name = "s", descriptor = "Z")
	public static boolean aBoolean812 = false;

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(III)V")
	public static void method8377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 != null) {
			Static192.method2751(local7.aClass4_Sub2_Sub2_1);
			if (local7.aClass4_Sub2_Sub2_1 != null) {
				local7.aClass4_Sub2_Sub2_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "f", descriptor = "(I)V")
	public static void method8378() {
		Static33.aClass85_3.method1741();
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(III)Lclient!ss;")
	public static Class4_Sub2_Sub5 method8379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(15) Class4_Sub2_Sub5 local15 = local7.aClass4_Sub2_Sub5_1;
			local7.aClass4_Sub2_Sub5_1 = null;
			Static192.method2751(local15);
			return local15;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLjava/lang/String;I)V")
	public static void method8380(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static268.anInt4162;
		@Pc(9) int[] local9 = Static597.anIntArray677;
		@Pc(11) boolean local11 = false;
		for (@Pc(20) int local20 = 0; local20 < local7; local20++) {
			@Pc(28) Class4_Sub2_Sub1_Sub2_Sub1 local28 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local9[local20]];
			if (local28 != null && local28 != Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 && local28.aString4 != null && local28.aString4.equalsIgnoreCase(arg0)) {
				@Pc(49) Class349 local49 = null;
				if (arg1 == 1) {
					local49 = Static13.aClass349_5;
				} else if (arg1 == 4) {
					local49 = Static30.aClass349_10;
				} else if (arg1 == 5) {
					local49 = Static435.aClass349_98;
				} else if (arg1 == 6) {
					local49 = Static38.aClass349_12;
				} else if (arg1 == 7) {
					local49 = Static129.aClass349_37;
				} else if (arg1 == 9) {
					local49 = Static577.aClass349_137;
				}
				local11 = true;
				if (local49 != null) {
					@Pc(106) Class2_Sub33 local106 = Static592.method8154(local49, Static487.aClass221_2.aClass48_1);
					local106.aClass2_Sub20_Sub2_1.method8551(local9[local20]);
					local106.aClass2_Sub20_Sub2_1.method8597(0);
					Static487.aClass221_2.method5173(local106);
				}
				break;
			}
		}
		if (!local11) {
			Static79.method1194(Static289.aClass191_21.method4067(Static414.anInt9485) + arg0);
		}
	}
}
