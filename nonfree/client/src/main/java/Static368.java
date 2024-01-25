import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!od", name = "A", descriptor = "J")
	public static long aLong165;

	@OriginalMember(owner = "client!od", name = "C", descriptor = "Lclient!q;")
	public static Class34 aClass34_5;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "[[[Lclient!wg;")
	public static Class360[][][] aClass360ArrayArrayArray18;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!od", name = "z", descriptor = "Z")
	public static final boolean aBoolean518 = false;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_84 = new Class208(47, 3);

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(CI)C")
	public static char method5399(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!r;ILclient!gca;)V")
	public static void method5400(@OriginalArg(2) Class78 arg0, @OriginalArg(4) Class111 arg1) {
		Static49.aClass111_4.method2555();
		if (Static39.aBoolean48) {
			return;
		}
		for (@Pc(16) Class1_Sub51 local16 = (Class1_Sub51) arg1.method2547(); local16 != null; local16 = (Class1_Sub51) arg1.method2554()) {
			@Pc(24) Class345 local24 = Static287.aClass113_3.method2595(local16.anInt9675);
			if (Static119.method2166(local24)) {
				@Pc(36) boolean local36 = Static175.method2777(arg0, local24, local16);
				if (local36) {
					Static171.method2747(local24, arg0, local16);
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V")
	public static void method5401() {
		@Pc(12) Class1_Sub9 local12 = Static123.method2194(Static469.aClass235_2, Static62.aClass208_27);
		local12.aClass1_Sub3_Sub1_1.method7917(Static470.method2475());
		local12.aClass1_Sub3_Sub1_1.method7937(Static349.anInt6422);
		local12.aClass1_Sub3_Sub1_1.method7937(Static594.anInt9806);
		local12.aClass1_Sub3_Sub1_1.method7917(Static86.aClass1_Sub30_Sub1_1.anInt6186);
		Static42.method746(local12);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5402(@OriginalArg(1) String arg0) {
		return arg0.length() + 2;
	}
}
