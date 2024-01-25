import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "I")
	public static int anInt8978;

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "Lclient!ip;")
	public static Class137 aClass137_2;

	@OriginalMember(owner = "client!wca", name = "r", descriptor = "Lclient!ha;")
	public static Class12 aClass12_22;

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "[Lclient!pc;")
	public static Class47_Sub2[] aClass47_Sub2Array3;

	@OriginalMember(owner = "client!wca", name = "z", descriptor = "Lclient!vn;")
	public static Class308 aClass308_2;

	@OriginalMember(owner = "client!wca", name = "A", descriptor = "Lclient!oa;")
	public static Class210 aClass210_6;

	@OriginalMember(owner = "client!wca", name = "w", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_116 = new Class186(34, 8);

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(III)Z")
	public static boolean method7542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static34.method1307(arg0, arg1) & Static198.method3659(arg0, arg1);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZII)I")
	public static int method7543(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1_Sub49 local10 = Static393.method5919(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray746.length > arg0) {
			return local10.anIntArray746[arg0];
		} else {
			return 0;
		}
	}
}
