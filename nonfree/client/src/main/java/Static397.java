import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static397 {

	@OriginalMember(owner = "client!nka", name = "d", descriptor = "[[Lclient!mj;")
	public static Class238[][] aClass238ArrayArray2;

	@OriginalMember(owner = "client!nka", name = "D", descriptor = "Lclient!v;")
	public static final Class370 aClass370_5 = new Class370(128);

	@OriginalMember(owner = "client!nka", name = "x", descriptor = "[I")
	public static final int[] anIntArray382 = new int[1];

	@OriginalMember(owner = "client!nka", name = "ab", descriptor = "Lclient!mj;")
	public static Class238 aClass238_12 = null;

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(Lclient!ha;IIIII)V")
	public static void method5818(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		Static548.aClass100_13 = arg0;
		Static500.aClass10_9 = Static548.aClass100_13.method8623();
		Static479.aClass10_8 = Static548.aClass100_13.method8623();
		Static83.aClass10_1 = Static548.aClass100_13.method8623();
		Static181.anInt3401 = 0;
		Static111.anInterface24Array1 = null;
		Static519.anInt8230 = 100;
		Static483.anIntArray454 = null;
		Static287.anInt5049 = 100;
		Static142.method6602(arg2, arg1);
		Static110.anInt9536 = -1;
		Static503.anInt9738 = -1;
		Static518.anInt8219 = -1;
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(BI)V")
	public static void method5820(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static383.aBooleanArray19[arg0]) {
			Static90.aClass126_53.method3071(arg0);
			aClass238ArrayArray2[arg0] = null;
			Static17.aClass238ArrayArray1[arg0] = null;
			Static383.aBooleanArray19[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!nka", name = "a", descriptor = "(III)Z")
	public static boolean method5823(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
