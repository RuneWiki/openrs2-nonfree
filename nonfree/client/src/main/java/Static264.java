import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array14;

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	public static int anInt4384 = 0;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(CLjava/lang/String;I)I")
	public static int method3657(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
	public static void method3658() {
		if (Static155.aBoolean216) {
			return;
		}
		Static179.aBoolean252 = true;
		Static155.aBoolean216 = true;
		if (Static39.aClass79_Sub1_1.aBoolean160) {
			Static19.aFloat6 = (int) Static19.aFloat6 + 191 & 0xFFFFFF80;
		} else {
			Static292.aFloat84 += (24.0F - Static292.aFloat84) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IC)C")
	public static char method3660(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ga;I)Lclient!ga;")
	public static Class82 method3661(@OriginalArg(0) Class82 arg0) {
		if (arg0.anInt2259 != -1) {
			return Static180.method2857(arg0.anInt2259);
		}
		@Pc(21) int local21 = arg0.anInt2208 >>> 16;
		@Pc(26) Class254 local26 = new Class254(Static32.aClass140_5);
		for (@Pc(31) Class3_Sub10 local31 = (Class3_Sub10) local26.method5859(); local31 != null; local31 = (Class3_Sub10) local26.method5863()) {
			if (local31.anInt827 == local21) {
				return Static180.method2857((int) local31.aLong248);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(BII[B)[B")
	public static byte[] method3662(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(13) byte[] local13 = new byte[32768];
		Static466.method205(arg1, arg0, local13, 0, 32768);
		return local13;
	}
}
