import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static15 {

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public static int anInt375;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!jf;")
	public static Class42 aClass42_4 = new Class42(8);

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_254 = Static28.method504("<col=ff7000>");

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Lclient!c;")
	public static Class12 aClass12_13 = new Class12(64);

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!ja;")
	private static Class39 aClass39_255 = Static28.method504("Error connecting to server)3");

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_256 = aClass39_255;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!ja;")
	private static Class39 aClass39_259 = Static28.method504("Login");

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_257 = aClass39_259;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_258 = Static28.method504("mapmarker");

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIILclient!pd;IZI)V")
	public static void method245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3) {
		Static40.anInt1002 = 1;
		Static14.aClass20_10 = arg3;
		Static54.anInt1478 = 2;
		Static130.anInt3174 = arg1;
		Static20.anInt563 = arg2;
		Static77.aBoolean100 = false;
		Static78.anInt1860 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIB)I")
	public static int method246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static131.aByteArrayArrayArray7[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static131.aByteArrayArrayArray7[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method247() {
		aClass39_256 = null;
		aClass39_254 = null;
		aClass12_13 = null;
		aClass39_255 = null;
		aClass39_258 = null;
		aClass39_257 = null;
		aClass39_259 = null;
		aClass42_4 = null;
	}
}
