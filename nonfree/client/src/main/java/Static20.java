import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!ap", name = "d", descriptor = "[Lclient!jb;")
	public static Class3_Sub1_Sub3[] aClass3_Sub1_Sub3Array1;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
	public static int anInt389;

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "Lclient!jr;")
	public static final Class169 aClass169_4 = new Class169(260);

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[1000][];

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
	public static void method583() {
		Static189.aClass169_72.method5009();
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZIIII)V")
	public static void method584(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 0) {
			Static328.method5641(false);
		} else {
			Static357.anInt7109 = Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945();
			Static316.method5509(true, 0);
		}
		Static323.aBoolean492 = arg0;
		Static114.anInt3043 = arg1;
		Static340.anInt6864 = arg2;
		Static303.method151(arg3);
	}
}
