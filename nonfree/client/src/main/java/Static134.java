import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!es", name = "p", descriptor = "[I")
	public static int[] anIntArray558;

	@OriginalMember(owner = "client!es", name = "s", descriptor = "Lclient!pj;")
	public static Class248 aClass248_83;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!es", name = "r", descriptor = "[I")
	public static final int[] anIntArray559 = new int[5];

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!gu;")
	public static RuntimeException_Sub1 method6229(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString33 = local9.aString33 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!es", name = "i", descriptor = "(I)V")
	private static void method6231() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static427.aClass283Array1[local3] = null;
		}
		Static422.anInt7485 = 0;
	}

	@OriginalMember(owner = "client!es", name = "j", descriptor = "(I)V")
	public static void method6232() {
		Static536.aClient1.method1025();
		Static340.aClass6_Sub12_Sub2_1.anInt7556 = 0;
		Static446.aClass98_124 = null;
		Static84.aClass98_23 = null;
		Static429.aClass6_Sub12_Sub2_2.anInt7556 = 0;
		Static111.aClass98_28 = null;
		Static503.anInt8751 = 0;
		Static221.anInt4092 = 0;
		method6231();
		Static569.anInt9840 = 0;
		Static212.anInt9970 = 0;
		Static181.anInt3476 = 0;
		Static486.aString71 = null;
		Static175.aClass264Array1 = null;
	}
}
