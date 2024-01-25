import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	public static int anInt3881;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
	public static final int[] anIntArray386 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	public static int anInt3883 = 0;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	public static int anInt3884 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)I")
	public static int method3459() {
		if (Static204.aClass201_8 == null) {
			if (!Static93.aBoolean128 && Static160.anInt3181 > 0) {
				if (Static317.aBoolean513 && Static174.aClass2_1.method1425(81) && Static160.anInt3181 > 2) {
					return ((Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.aClass5_114.aClass5_252.aClass5_252).anInt2096;
				}
				return ((Class5_Sub20) Class4_Sub3_Sub2.aClass103_139.aClass5_114.aClass5_252).anInt2096;
			}
			@Pc(23) int local23 = Static316.aClass118_3.method4054();
			@Pc(27) int local27 = Static316.aClass118_3.method4050();
			@Pc(29) int local29 = Static187.anInt3710;
			@Pc(31) int local31 = Static141.anInt2737;
			@Pc(33) int local33 = Static334.anInt6466;
			if (local29 < local23 && local29 + local33 > local23) {
				@Pc(47) int local47 = -1;
				@Pc(67) int local67;
				for (@Pc(49) int local49 = 0; local49 < Static160.anInt3181; local49++) {
					if (Static133.aBoolean203) {
						local67 = local31 + (Static160.anInt3181 - local49 - 1) * 16 + 33;
						if (local27 > local67 - 13 && local27 <= local67 + 3) {
							local47 = local49;
						}
					} else {
						local67 = (Static160.anInt3181 - local49 - 1) * 16 + local31 + 31;
						if (local67 - 13 < local27 && local67 + 3 >= local27) {
							local47 = local49;
						}
					}
				}
				if (local47 != -1) {
					local67 = 0;
					@Pc(136) Class29 local136 = new Class29(Class4_Sub3_Sub2.aClass103_139);
					for (@Pc(141) Class5_Sub20 local141 = (Class5_Sub20) local136.method576(); local141 != null; local141 = (Class5_Sub20) local136.method577()) {
						if (local67++ == local47) {
							return local141.anInt2096;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZC)Z")
	public static boolean method3460(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!h;I)V")
	public static void method3461(@OriginalArg(0) Class5_Sub20 arg0) {
		if (!Static93.aBoolean128) {
			arg0.method6005();
			Static160.anInt3181--;
		}
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public static void method3462() {
		for (@Pc(13) int local13 = 0; local13 < Static42.aClass65ArrayArray1.length; local13++) {
			for (@Pc(16) int local16 = 0; local16 < Static42.aClass65ArrayArray1[local13].length; local16++) {
				Static42.aClass65ArrayArray1[local13][local16] = Static322.aClass65_3;
			}
		}
	}
}
