import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "Lclient!hh;")
	public static Class109 aClass109_29;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "Lclient!qf;")
	public static final Class1_Sub14_Sub2 aClass1_Sub14_Sub2_1 = new Class1_Sub14_Sub2(5000);

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "[I")
	public static final int[] anIntArray114 = new int[3];

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	public static void method1803(@OriginalArg(0) int arg0) {
		Static124.anInt2344 = arg0;
		Static175.aClass151_134.method3298();
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)I")
	public static int method1809(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 - 1 & arg0 >> 31;
		return local19 + (arg0 + (arg0 >>> 31)) % arg1;
	}
}
