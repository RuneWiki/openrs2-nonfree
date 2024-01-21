import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "sb", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_3;

	@OriginalMember(owner = "client!a", name = "tb", descriptor = "I")
	public static int anInt70;

	@OriginalMember(owner = "client!a", name = "Bb", descriptor = "I")
	public static int anInt76;

	@OriginalMember(owner = "client!a", name = "wb", descriptor = "Lclient!rb;")
	public static Class60 aClass60_7 = new Class60(50);

	@OriginalMember(owner = "client!a", name = "yb", descriptor = "I")
	public static int anInt74 = 0;

	@OriginalMember(owner = "client!a", name = "zb", descriptor = "Lclient!rc;")
	public static Class61 aClass61_1 = new Class61();

	@OriginalMember(owner = "client!a", name = "Cb", descriptor = "I")
	public static int anInt77 = 0;

	@OriginalMember(owner = "client!a", name = "Db", descriptor = "I")
	public static int anInt78 = 0;

	@OriginalMember(owner = "client!a", name = "Eb", descriptor = "I")
	public static int anInt79 = 0;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!sf;Lclient!sf;II)Lclient!gf;")
	public static Class1_Sub1_Sub2_Sub2_Sub1 method43(@OriginalArg(0) int arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class5 arg2, @OriginalArg(3) int arg3) {
		return Static80.method1490(arg1, arg0, arg3) ? Static52.method1099(arg2.method107(arg3, arg0)) : null;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	public static void method44() {
		aClass61_1 = null;
		aClass60_7 = null;
		aClass5_Sub1_3 = null;
	}
}
