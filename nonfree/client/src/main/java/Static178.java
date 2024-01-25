import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!tm;")
	public static Class227 aClass227_1;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "I")
	public static int anInt3223;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "I")
	public static int anInt3224;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "[I")
	public static final int[] anIntArray272 = new int[250];

	@OriginalMember(owner = "client!in", name = "f", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!iv;)V")
	public static void method2762(@OriginalArg(1) Class1_Sub19 arg0) {
		if (Static268.aClass211ArrayArrayArray4 == null) {
			return;
		}
		@Pc(14) Interface6 local14 = null;
		if (arg0.anInt3378 == 0) {
			local14 = (Interface6) Static259.method5039(arg0.anInt3385, arg0.anInt3387, arg0.anInt3386);
		}
		if (arg0.anInt3378 == 1) {
			local14 = (Interface6) Static81.method1400(arg0.anInt3385, arg0.anInt3387, arg0.anInt3386);
		}
		if (arg0.anInt3378 == 2) {
			local14 = (Interface6) Static278.method5819(arg0.anInt3385, arg0.anInt3387, arg0.anInt3386, jv.class);
		}
		if (arg0.anInt3378 == 3) {
			local14 = (Interface6) Static366.method4342(arg0.anInt3385, arg0.anInt3387, arg0.anInt3386);
		}
		if (local14 == null) {
			arg0.anInt3377 = 0;
			arg0.anInt3381 = -1;
			arg0.anInt3379 = 0;
		} else {
			arg0.anInt3381 = local14.method4665();
			arg0.anInt3379 = local14.method4666();
			arg0.anInt3377 = local14.method4670();
		}
	}
}
