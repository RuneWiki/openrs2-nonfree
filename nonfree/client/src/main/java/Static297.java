import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	public static int anInt5627;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray46;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "[Lclient!in;")
	public static Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array17;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString190 = "skill: ";

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public static int anInt5629 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)I")
	public static int method4446(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ph;IIB)[Lclient!in;")
	public static Class1_Sub1_Sub3[] method4448(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1) {
		return Static27.method486(arg1, 0, arg0) ? Static251.method3842() : null;
	}
}
