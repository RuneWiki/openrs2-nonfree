import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qq", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!qq", name = "o", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_87 = new Class177(14, 6);

	@OriginalMember(owner = "client!qq", name = "s", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_164 = new Class158("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!qq", name = "u", descriptor = "I")
	public static int anInt6175 = -60;

	@OriginalMember(owner = "client!qq", name = "v", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!ia;I)Lclient!pm;")
	public static Class199 method4742(@OriginalArg(0) Class1_Sub3 arg0) {
		@Pc(14) Class199 local14 = new Class199();
		local14.anInt5845 = arg0.method1177();
		local14.aClass1_Sub1_Sub13_1 = Static439.aClass127_2.method3086(local14.anInt5845);
		return local14;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIBI)I")
	public static int method4744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 <= arg0) {
			return arg0 <= arg1 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}
}
