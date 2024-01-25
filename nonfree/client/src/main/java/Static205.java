import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_151 = new Class62("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	public static int anInt4226 = 1;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_117 = new Class208(93, -1);

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "[I")
	public static final int[] anIntArray308 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!oj;ILclient!vf;)V")
	public static void method3758(@OriginalArg(2) Class48 arg0, @OriginalArg(4) Class238 arg1) {
		Static340.aClass238_39.method5806();
		if (Static118.aBoolean397) {
			return;
		}
		for (@Pc(16) Class2_Sub10 local16 = (Class2_Sub10) arg1.method5795(); local16 != null; local16 = (Class2_Sub10) arg1.method5799()) {
			@Pc(24) Class212 local24 = Static20.aClass195_3.method4816(local16.anInt2183);
			if (Static232.method4183(local24)) {
				@Pc(36) boolean local36 = Static46.method4756(local24, local16, arg0);
				if (local36) {
					Static27.method2271(local24, arg0, local16);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIBZ)V")
	public static void method3761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static36.anInt2910 == 0) {
			Static291.method4805(false);
		} else {
			Static314.anInt5740 = Static36.anInt2910;
			Static364.method5791(0);
		}
		Static86.aBoolean137 = arg3;
		Static372.anInt6827 = arg1;
		Static206.anInt4236 = arg2;
		Static20.method4152(arg0);
	}
}
