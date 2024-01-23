import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_138;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[S")
	public static short[] aShortArray162;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "[I")
	public static int[] anIntArray498;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "I")
	public static int anInt4778 = 0;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt4779 = 0;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "I")
	public static int anInt4780 = 0;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public static int anInt4782 = 1;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!i;")
	public static Class41 aClass41_1279 = Static184.method2923("<)4col>");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Z")
	public static boolean aBoolean291 = false;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_1280 = Static184.method2923("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!g", name = "s", descriptor = "I")
	public static int anInt4785 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method3311(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(17) byte[] local17 = (byte[]) arg1;
			return arg0 ? Static160.method2588(local17) : local17;
		} else if (arg1 instanceof Class1) {
			@Pc(31) Class1 local31 = (Class1) arg1;
			return local31.method2632();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II)Lclient!ke;")
	public static Class2_Sub2_Sub10 method3312(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub2_Sub10 local12 = (Class2_Sub2_Sub10) Static16.aClass43_3.method1464((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(26) byte[] local26 = Static31.aClass15_5.method387(arg0, 5);
		local12 = new Class2_Sub2_Sub10();
		if (local26 != null) {
			local12.method1722(new Class2_Sub3(local26));
		}
		Static16.aClass43_3.method1462((long) arg0, local12);
		return local12;
	}
}
