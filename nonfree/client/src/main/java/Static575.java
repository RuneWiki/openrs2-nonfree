import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static575 {

	@OriginalMember(owner = "client!wca", name = "Q", descriptor = "Lclient!sea;")
	public static Class308 aClass308_192;

	@OriginalMember(owner = "client!wca", name = "P", descriptor = "Lclient!em;")
	public static final Class83 aClass83_207 = new Class83(46, 4);

	@OriginalMember(owner = "client!wca", name = "R", descriptor = "[Lclient!tw;")
	public static final Class1_Sub24[] aClass1_Sub24Array6 = new Class1_Sub24[8];

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([I[JI)V")
	public static void method7747(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static470.method2476(0, arg1, arg0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IZI)Z")
	public static boolean method7748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}
}
