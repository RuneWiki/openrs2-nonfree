import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
	public static int anInt4116;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!tm;")
	public static Class197 aClass197_17 = new Class197(128);

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_23 = new Class16();

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
	public static int anInt4114 = 2;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([BB)[B")
	public static byte[] method3717(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static361.method1335(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
	public static void method3718(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub4_Sub9 local10 = Static139.method4227(arg1, 11);
		local10.method1869();
		local10.anInt2148 = arg2;
		local10.anInt2142 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public static void method3720() {
		Static312.aClass87_39.method2473(5);
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	public static void method3721() {
		if (Static4.aBoolean11) {
			return;
		}
		Static77.method1747(Static313.aClass194ArrayArrayArray3);
		if (Static91.aClass194ArrayArrayArray2 != null) {
			Static77.method1747(Static91.aClass194ArrayArrayArray2);
		}
		Static4.aBoolean11 = true;
	}
}
