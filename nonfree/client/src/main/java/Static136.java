import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!gu", name = "n", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_7 = new Class214(3, 6);

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "[F")
	public static final float[] aFloatArray25 = new float[4];

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V")
	public static void method2313() {
		Static94.aClass26_1.method5216();
		for (@Pc(15) int local15 = 0; local15 < 32; local15++) {
			Static36.aLongArray2[local15] = 0L;
		}
		for (@Pc(27) int local27 = 0; local27 < 32; local27++) {
			Static47.aLongArray3[local27] = 0L;
		}
		Static322.anInt5617 = 0;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	public static void method2314() {
		for (@Pc(3) int local3 = 0; local3 < Static66.anInt133; local3++) {
			@Pc(14) Class218 local14 = Static62.aClass218Array1[local3];
			if (local14.aByte87 == 2) {
				if (local14.aClass2_Sub3_Sub3_4 == null) {
					local14.anInt5948 = Integer.MIN_VALUE;
				} else {
					Static260.aClass2_Sub3_Sub1_2.method1826(local14.aClass2_Sub3_Sub3_4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(CB)C")
	public static char method2315(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)I")
	public static int method2316(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)I")
	public static int method2317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local9 ^ local9 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local20 * 15731 * local20 + 789221) * local20 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!em;IILclient!ya;ILclient!ma;III)V")
	public static void method2318(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Class48 local15 = Static357.aClass215_4.method4741(arg1);
		if (local15 == null || !local15.aBoolean67 || !local15.method932(Static344.aClass108_1)) {
			return;
		}
		@Pc(35) int local35;
		if (local15.anIntArray86 != null) {
			@Pc(33) int[] local33 = new int[local15.anIntArray86.length];
			@Pc(47) int local47;
			for (local35 = 0; local35 < local33.length / 2; local35++) {
				if (Static159.anInt3195 == 4) {
					local47 = (int) Static202.aFloat62 & 0x3FFF;
				} else {
					local47 = Static166.anInt3321 + (int) Static202.aFloat62 & 0x3FFF;
				}
				@Pc(60) int local60 = Class162.anIntArray388[local47];
				@Pc(64) int local64 = Class162.anIntArray387[local47];
				if (Static159.anInt3195 != 4) {
					local60 = local60 * 256 / (Static261.anInt4889 + 256);
					local64 = local64 * 256 / (Static261.anInt4889 + 256);
				}
				local33[local35 * 2] = ((local15.anIntArray86[local35 * 2 + 1] * 4 + arg7) * local60 + (arg2 + local15.anIntArray86[local35 * 2] * 4) * local64 >> 15) + arg0.anInt2188 / 2 + arg4;
				local33[local35 * 2 + 1] = arg6 + arg0.anInt2252 / 2 - ((arg7 + local15.anIntArray86[local35 * 2 + 1] * 4) * local64 - (local15.anIntArray86[local35 * 2] * 4 + arg2) * local60 >> 15);
			}
			Static433.method5664(arg3, local33, local15.anInt1199, arg0.anIntArray163, arg0.anIntArray161);
			for (local47 = 0; local47 < local33.length / 2 - 1; local47++) {
				arg3.method4472(local33[local47 * 2], local33[local47 * 2 + 1], local33[(local47 + 1) * 2], local33[(local47 + 1) * 2 + 1], local15.anInt1223, arg5, arg4, arg6);
			}
			arg3.method4472(local33[local33.length - 2], local33[local33.length - 1], local33[0], local33[1], local15.anInt1223, arg5, arg4, arg6);
		}
		@Pc(271) Class17 local271 = null;
		if (local15.anInt1227 != -1) {
			local271 = local15.method923(arg3, false);
			if (local271 != null) {
				Static216.method4816(arg2, arg5, arg4, local271, arg7, arg6, arg0);
			}
		}
		if (local15.aString7 == null) {
			return;
		}
		local35 = 0;
		if (local271 != null) {
			local35 = local271.ma();
		}
		@Pc(306) Class116 local306 = Static291.aClass116_3;
		@Pc(308) Class58 local308 = Static86.aClass58_10;
		if (local15.anInt1209 == 1) {
			local308 = Static270.aClass58_11;
			local306 = Static368.aClass116_4;
		}
		if (local15.anInt1209 == 2) {
			local308 = Static172.aClass58_5;
			local306 = Static114.aClass116_1;
		}
		Static265.method3968(arg6, arg0, arg4, arg5, local35, local308, arg7, local15.aString7, local306, local15.anInt1214, arg2);
		return;
	}
}
