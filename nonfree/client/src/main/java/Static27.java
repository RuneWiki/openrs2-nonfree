import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Lclient!fp;")
	public static final Class83 aClass83_2 = new Class83(10, 2, 2, 0);

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
	public static final int anInt396 = 1338;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
	public static void method304(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg1 != Static58.anInt1052) {
			Static185.anIntArray298 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static185.anIntArray298[local13] = (local13 << 12) / arg1;
			}
			Static58.anInt1052 = arg1;
			Static410.anInt6497 = arg1 - 1;
			Static322.anInt5332 = arg1 * 32;
		}
		if (Static383.anInt6175 == arg0) {
			return;
		}
		if (Static58.anInt1052 == arg0) {
			Static203.anIntArray322 = Static185.anIntArray298;
		} else {
			Static203.anIntArray322 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static203.anIntArray322[local13] = (local13 << 12) / arg0;
			}
		}
		Static383.anInt6175 = arg0;
		Static25.anInt366 = arg0 - 1;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(CB)C")
	public static char method305(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!sr;)I")
	public static int method306(@OriginalArg(1) Class26_Sub2_Sub4_Sub1 arg0) {
		@Pc(8) Class249 local8 = arg0.aClass249_1;
		if (local8.anIntArray579 != null) {
			local8 = local8.method5179(Static224.aClass239_7);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt6520;
		@Pc(27) Class78 local27 = arg0.method5507();
		if (arg0.aBoolean475) {
			local23 = local8.anInt6542;
		} else if (local27.anInt2289 == arg0.anInt7103 || arg0.anInt7103 == local27.anInt2291 || local27.anInt2263 == arg0.anInt7103 || local27.anInt2274 == arg0.anInt7103) {
			local23 = local8.anInt6512;
		} else if (local27.anInt2273 == arg0.anInt7103 || arg0.anInt7103 == local27.anInt2268 || local27.anInt2272 == arg0.anInt7103 || local27.anInt2296 == arg0.anInt7103) {
			local23 = local8.anInt6519;
		}
		return local23;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)V")
	public static void method307() {
		Static102.anInt2085 = 0;
		Static237.aClass85_26.method2008();
		Static237.aClass85_26.method2011(Static351.aClass7_Sub39_2);
		Static102.anInt2085++;
	}
}
