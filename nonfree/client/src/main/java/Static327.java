import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "Lclient!ud;")
	public static Class344 aClass344_1;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!ei;")
	public static final Class2_Sub17_Sub1 aClass2_Sub17_Sub1_1 = new Class2_Sub17_Sub1(7500);

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "[I")
	public static int[] anIntArray367 = new int[2];

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "Z")
	public static boolean aBoolean416 = false;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	public static void method4980() {
		Static649.anInt10495 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static365.aClass2_Sub17Array1[local14] = null;
			Static645.aByteArray107[local14] = 1;
			Static44.aClass122Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)V")
	public static void method4981(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static639.anInt10307 = 1;
		Static297.anInt5356 = -1;
		Static171.method2966(false, arg0, arg1);
	}
}
