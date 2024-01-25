import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24;

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "Lclient!ik;")
	public static Class149 aClass149_1;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_113 = new Class272(49, 12);

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
	public static int anInt3685 = 2;

	@OriginalMember(owner = "client!hda", name = "f", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_73 = new Class298(66, -1);

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)I")
	public static int method3262(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local19 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
	public static void method3263() {
		Static113.method2374(11);
		Static479.method6564();
		System.gc();
	}
}
