import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public static int anInt318;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
	public static int[] anIntArray19;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	public static int anInt322 = 0;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	public static int anInt324 = 0;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "[I")
	public static final int[] anIntArray20 = new int[4];

	@OriginalMember(owner = "client!al", name = "l", descriptor = "I")
	public static int anInt325 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!ss;ZI)V")
	public static void method297(@OriginalArg(0) int arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(3) int arg2) {
		if (Static138.aBoolean128) {
			@Pc(23) Class256 local23 = Static323.anInt5670 == -1 ? null : Static228.aClass243_2.method5551(Static323.anInt5670);
			if (Static53.method916(arg1).method5786() && (Static333.anInt5795 & 0x20) != 0) {
				if (local23 == null || arg1.method5121(Static323.anInt5670, local23.anInt7437) != local23.anInt7437) {
					Static423.method5681(arg1.anInt6345, arg1.anInt6422, 0L, 5, Static370.anInt6307, arg1.anInt6421, false, Static254.aString36 + " -> " + arg1.aString44, Static233.aString33, true);
				}
				return;
			}
			return;
		}
		@Pc(89) String local89;
		for (@Pc(82) int local82 = 9; local82 >= 5; local82--) {
			local89 = Static227.method3407(local82, arg1);
			if (local89 != null) {
				Static423.method5681(arg1.anInt6345, arg1.anInt6422, (long) (local82 + 1), 1010, Static334.method4675(local82, arg1), arg1.anInt6421, false, arg1.aString44, local89, true);
			}
		}
		local89 = Static437.method5858(arg1);
		if (local89 != null) {
			Static423.method5681(arg1.anInt6345, arg1.anInt6422, 0L, 57, arg1.anInt6415, arg1.anInt6421, false, arg1.aString44, local89, true);
		}
		for (@Pc(150) int local150 = 4; local150 >= 0; local150--) {
			@Pc(157) String local157 = Static227.method3407(local150, arg1);
			if (local157 != null) {
				Static423.method5681(arg1.anInt6345, arg1.anInt6422, (long) (local150 + 1), 20, Static334.method4675(local150, arg1), arg1.anInt6421, false, arg1.aString44, local157, true);
			}
		}
		if (!Static53.method916(arg1).method5787()) {
			return;
		}
		if (arg1.aString46 != null) {
			Static423.method5681(arg1.anInt6345, arg1.anInt6422, 0L, 23, -1, arg1.anInt6421, false, "", arg1.aString46, true);
			return;
		}
		Static423.method5681(arg1.anInt6345, arg1.anInt6422, 0L, 23, -1, arg1.anInt6421, false, "", Static120.aClass84_31.method1678(Static167.anInt3118), true);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	public static void method298() {
		Static254.aClass12Array1 = new Class12[50];
		Static442.anInt5016 = 0;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(CI)Z")
	public static boolean method299(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static241.method3554(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static120.aCharArray1;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static400.aCharArray6;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (local50 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
