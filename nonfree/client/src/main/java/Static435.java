import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!qfa", name = "C", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!qfa", name = "n", descriptor = "Z")
	public static boolean aBoolean574 = false;

	@OriginalMember(owner = "client!qfa", name = "B", descriptor = "I")
	public static int anInt6992 = 0;

	@OriginalMember(owner = "client!qfa", name = "D", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_116 = new Class349(45, -1);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIII)V")
	public static void method5706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		Static437.method5735(arg3 - arg2, Static238.anIntArrayArray36[arg1], arg2 + arg3, arg0);
		@Pc(27) int local27 = -1;
		while (local7 < local9) {
			local27 += 2;
			local7++;
			local12 += local27;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(50) int[] local50 = Static238.anIntArrayArray36[local9 + arg1];
				@Pc(57) int[] local57 = Static238.anIntArrayArray36[arg1 - local9];
				@Pc(61) int local61 = arg3 + local7;
				@Pc(66) int local66 = arg3 - local7;
				Static437.method5735(local66, local50, local61, arg0);
				Static437.method5735(local66, local57, local61, arg0);
			}
			@Pc(83) int local83 = arg3 + local9;
			@Pc(88) int local88 = arg3 - local9;
			@Pc(94) int[] local94 = Static238.anIntArrayArray36[arg1 + local7];
			@Pc(100) int[] local100 = Static238.anIntArrayArray36[arg1 - local7];
			Static437.method5735(local88, local94, local83, arg0);
			Static437.method5735(local88, local100, local83, arg0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method5712(@OriginalArg(0) Class162 arg0) {
		if (Static572.aBoolean774) {
			Static134.method1820(arg0);
		} else {
			Static69.method4395(arg0);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BC)C")
	public static char method5714(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!r;)V")
	public static void method5715(@OriginalArg(1) Class162 arg0) {
		if (Static78.aClass70_4.method1267() == 0) {
			return;
		}
		@Pc(25) Class2_Sub1 local25;
		if (Static226.anInt3318 == 0) {
			for (local25 = (Class2_Sub1) Static78.aClass70_4.method1264(); local25 != null; local25 = (Class2_Sub1) Static78.aClass70_4.method1261()) {
				Static466.aClass130_2.method2318(local25.anInt11, Static71.aClass37_11, false, local25.anInt15, local25.anInt14, local25.aBoolean1 ? Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1 : null, false, arg0, local25.anInt17, arg0, local25.anInt16);
				local25.method7657();
			}
			Static549.method7175();
			return;
		}
		if (Static541.aClass162_11 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Static541.aClass162_11 = Static451.method6877(Static49.aClass229_31, Static45.anInterface9_1, local72, 0, 0);
			Static271.aClass37_10 = Static541.aClass162_11.method6864(Static226.method2755(Static164.anInt2535, Static191.aClass229_45), Static603.method7121(Static241.aClass229_54, Static164.anInt2535));
		}
		for (local25 = (Class2_Sub1) Static78.aClass70_4.method1264(); local25 != null; local25 = (Class2_Sub1) Static78.aClass70_4.method1261()) {
			Static466.aClass130_2.method2318(local25.anInt11, Static271.aClass37_10, false, local25.anInt15, local25.anInt14, local25.aBoolean1 ? Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aClass300_1 : null, false, arg0, local25.anInt17, Static541.aClass162_11, local25.anInt16);
			local25.method7657();
		}
	}
}
