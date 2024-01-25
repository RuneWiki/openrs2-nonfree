import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
	public static int anInt4292;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_65 = new Class45(41, 3);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method3665(@OriginalArg(0) Class42 arg0) {
		for (@Pc(1) int local1 = Static477.anInt8709; local1 < Static36.anInt8450; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static537.anInt9566; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static509.anInt9164; local7++) {
					@Pc(16) Class37 local16 = Static120.aClass37ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class30_Sub2 local21 = local16.aClass30_Sub2_2;
						@Pc(24) Class30_Sub2 local24 = local16.aClass30_Sub2_1;
						if (local21 != null && local21.method7901()) {
							Static259.method4397(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7901()) {
								Static259.method4397(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7904(0, false, 0, local21, 0, arg0);
								local24.method7909();
							}
							local21.method7909();
						}
						for (@Pc(70) Class243 local70 = local16.aClass243_3; local70 != null; local70 = local70.aClass243_11) {
							@Pc(74) Class30_Sub1 local74 = local70.aClass30_Sub1_2;
							if (local74 != null && local74.method7901()) {
								Static259.method4397(arg0, local74, local1, local4, local7, local74.aShort113 + 1 - local74.aShort115, local74.aShort114 - local74.aShort112 + 1);
								local74.method7909();
							}
						}
						@Pc(111) Class30_Sub3 local111 = local16.aClass30_Sub3_1;
						if (local111 != null && local111.method7901()) {
							Static249.method4293(arg0, local111, local1, local4, local7);
							local111.method7909();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(III)Z")
	public static boolean method3667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLclient!mc;Z)V")
	public static void method3668(@OriginalArg(1) Class198 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt5758 == 0 ? arg0.anInt5762 : arg0.anInt5758;
		@Pc(24) int local24 = arg0.anInt5733 == 0 ? arg0.anInt5715 : arg0.anInt5733;
		Static96.method2047(Static71.aClass198ArrayArray1[arg0.anInt5739 >> 16], local24, local15, arg1, arg0.anInt5739);
		if (arg0.aClass198Array1 != null) {
			Static96.method2047(arg0.aClass198Array1, local24, local15, arg1, arg0.anInt5739);
		}
		@Pc(64) Class12_Sub34 local64 = (Class12_Sub34) Static456.aClass68_67.method1917((long) arg0.anInt5739);
		if (local64 != null) {
			Static64.method7548(local15, local24, local64.anInt5831, arg1);
		}
	}
}
