import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!lk", name = "yc", descriptor = "I")
	public static int anInt5109;

	@OriginalMember(owner = "client!lk", name = "Ic", descriptor = "[I")
	public static final int[] anIntArray452 = new int[8];

	@OriginalMember(owner = "client!lk", name = "Mc", descriptor = "[Lclient!hca;")
	public static final Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array1 = new Class1_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!lk", name = "Qc", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(CI)I")
	public static int method4396(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class2_Sub7_Sub29.anIntArray569.length > arg0 ? Class2_Sub7_Sub29.anIntArray569[arg0] : -1;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4402(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static12.anInt264; local11++) {
			if (arg0.equalsIgnoreCase(Static145.aStringArray15[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static266.aClass1_Sub1_Sub2_Sub1_1.aString83);
	}
}
