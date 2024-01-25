import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!np", name = "j", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_164 = new Class209(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!np", name = "p", descriptor = "[I")
	public static final int[] anIntArray630 = new int[100];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)I")
	public static int method5787(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!mg;Lclient!mg;I)I")
	public static int method5788(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1) {
		@Pc(5) int local5 = 0;
		if (arg1.method3716(Static400.anInt7453)) {
			local5++;
		}
		if (arg1.method3716(Static192.anInt3704)) {
			local5++;
		}
		if (arg1.method3716(Static398.anInt6645)) {
			local5++;
		}
		if (arg0.method3716(Static400.anInt7453)) {
			local5++;
		}
		if (arg0.method3716(Static192.anInt3704)) {
			local5++;
		}
		if (arg0.method3716(Static398.anInt6645)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(III)V")
	public static void method5789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg0, 14);
		local8.method4547();
		local8.anInt5641 = arg1;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
	public static void method5790() {
		Static60.aClass68ArrayArray1 = new Class68[Static277.aClass160_56.method3715()][];
		Static344.aClass68ArrayArray2 = new Class68[Static277.aClass160_56.method3715()][];
		Static214.aBooleanArray18 = new boolean[Static277.aClass160_56.method3715()];
	}
}
