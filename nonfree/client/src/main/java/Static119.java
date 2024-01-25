import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "[I")
	public static int[] anIntArray301;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "Lclient!dp;")
	public static Class53 aClass53_67;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "Z")
	public static boolean aBoolean190 = true;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
	public static void method2413() {
		for (@Pc(10) int local10 = 0; local10 < Static149.anInt2759; local10++) {
			@Pc(16) int local16 = Static191.anIntArray428[local10];
			@Pc(20) Class44_Sub4_Sub4_Sub2 local20 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local16];
			if (local20 != null) {
				Static103.method2101(local20.aClass18_1.anInt409, local20);
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIIIB)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg4 == arg3) {
			Static349.method5742(arg0, arg2, arg3, arg1);
		} else if (Static311.anInt5837 <= arg0 - arg3 && Static265.anInt4933 >= arg0 + arg3 && Static327.anInt3039 <= arg1 - arg4 && Static230.anInt4308 >= arg4 + arg1) {
			Static135.method5228(arg0, arg2, arg4, arg1, arg3);
		} else {
			Static343.method5635(arg4, arg0, arg3, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(CI)C")
	public static char method2415(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!pc;")
	public static Class85 method2417(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class85_Sub2");
			@Pc(15) Class85 local15 = (Class85) local11.getDeclaredConstructor().newInstance();
			local15.method2520(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class85_Sub1 local26 = new Class85_Sub1();
			local26.method2520(arg0);
			return local26;
		}
	}
}
