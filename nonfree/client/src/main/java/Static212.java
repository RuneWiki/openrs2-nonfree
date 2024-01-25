import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "[I")
	public static final int[] anIntArray379 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
	public static void method3815(@OriginalArg(0) int arg0) {
		@Pc(13) Class14_Sub2_Sub13 local13 = Static1.method5711(11, arg0);
		local13.method3539();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3820(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static280.method5743(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static217.anInt4354; local21++) {
			@Pc(29) String local29 = Static280.method5743(Static38.aStringArray20[local21]);
			if (local29 != null && local29.equals(local12)) {
				Static217.anInt4354--;
				for (@Pc(41) int local41 = local21; local41 < Static217.anInt4354; local41++) {
					Static38.aStringArray20[local41] = Static38.aStringArray20[local41 + 1];
					Static326.aStringArray71[local41] = Static326.aStringArray71[local41 + 1];
					Static143.aStringArray40[local41] = Static143.aStringArray40[local41 + 1];
					Static222.aStringArray58[local41] = Static222.aStringArray58[local41 + 1];
					Static112.aBooleanArray11[local41] = Static112.aBooleanArray11[local41 + 1];
				}
				Static342.anInt6538 = Static348.anInt5338;
				Static164.aClass14_Sub4_Sub2_3.method2557(124);
				Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(arg0));
				Static164.aClass14_Sub4_Sub2_3.method2527(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZI)V")
	public static void method3823(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class169 local12 = Static267.method4558(arg0);
		@Pc(15) int local15 = local12.anInt4997;
		@Pc(18) int local18 = local12.anInt4998;
		@Pc(21) int local21 = local12.anInt5002;
		@Pc(28) int local28 = Class45.anIntArray129[local21 - local18];
		if (arg1 < 0 || arg1 > local28) {
			arg1 = 0;
		}
		local28 <<= local18;
		Static307.method2747(local15, Static86.anIntArray191[local15] & ~local28 | local28 & arg1 << local18);
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
	public static void method3824() {
		for (@Pc(10) Class14_Sub28 local10 = (Class14_Sub28) Static257.aClass18_24.method459(); local10 != null; local10 = (Class14_Sub28) Static257.aClass18_24.method453()) {
			if (local10.aBoolean350) {
				local10.method4729();
			}
		}
		for (@Pc(35) Class14_Sub28 local35 = (Class14_Sub28) Static51.aClass18_3.method459(); local35 != null; local35 = (Class14_Sub28) Static51.aClass18_3.method453()) {
			if (local35.aBoolean350) {
				local35.method4729();
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
	public static void method3828(@OriginalArg(0) int arg0) {
		Static154.anInt3269 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static233.anInt4556; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static180.anInt3712; local6++) {
				if (Static98.aClass213ArrayArrayArray2[arg0][local3][local6] == null) {
					Static98.aClass213ArrayArrayArray2[arg0][local3][local6] = new Class213(arg0, local3, local6);
				}
			}
		}
	}
}
