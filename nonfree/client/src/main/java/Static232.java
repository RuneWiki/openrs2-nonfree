import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "[[Lclient!nk;")
	public static Class1_Sub20[][] aClass1_Sub20ArrayArray4;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "Lclient!bo;")
	public static Class24 aClass24_20 = new Class24();

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString115 = null;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "Lclient!th;")
	public static Class169 aClass169_102 = new Class169(64);

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33 = new String[8];

	@OriginalMember(owner = "client!qn", name = "G", descriptor = "Z")
	public static boolean aBoolean256 = true;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!qm;II)V")
	public static void method2980(@OriginalArg(0) Class22_Sub3_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class1_Sub10 local12 = (Class1_Sub10) Static263.aClass156_24.method3821((long) arg1);
		if (local12 == null) {
			return;
		}
		if (local12.aClass1_Sub4_Sub1_2 != null) {
			Static303.aClass1_Sub4_Sub2_2.method774(local12.aClass1_Sub4_Sub1_2);
			local12.aClass1_Sub4_Sub1_2 = null;
		}
		local12.method4616();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BI)V")
	public static void method2982() {
		Static44.aClass169_32.method4020(5);
		Static299.aClass169_159.method4020(5);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
	public static void method2984(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4) {
		Static26.method479(null, arg4, arg1, -1, arg3, arg2, arg0);
	}

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V")
	public static void method2985() {
		if (Static268.aClass2_5 != null) {
			@Pc(6) Class2 local6 = Static268.aClass2_5;
			synchronized (Static268.aClass2_5) {
				Static268.aClass2_5 = null;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILjava/lang/String;ILclient!kc;ILclient!qf;IZ)V")
	public static void method2986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class146 arg7, @OriginalArg(8) int arg8) {
		@Pc(13) int local13;
		if (Static101.anInt1895 == 4) {
			local13 = (int) Static2.aFloat1 & 0x7FF;
		} else {
			local13 = Static39.anInt794 + (int) Static2.aFloat1 & 0x7FF;
		}
		@Pc(34) int local34 = Math.max(arg7.anInt4345 / 2, arg7.anInt4371 / 2) + 10;
		@Pc(42) int local42 = arg6 * arg6 + arg0 * arg0;
		if (local34 * local34 < local42) {
			return;
		}
		@Pc(57) int local57 = Class17.anIntArray22[local13];
		@Pc(61) int local61 = Class17.anIntArray24[local13];
		if (Static101.anInt1895 != 4) {
			local61 = local61 * 256 / (Static54.anInt1055 + 256);
			local57 = local57 * 256 / (Static54.anInt1055 + 256);
		}
		@Pc(93) int local93 = arg0 * local61 - local57 * arg6 >> 16;
		@Pc(103) int local103 = arg0 * local57 + local61 * arg6 >> 16;
		@Pc(108) int local108 = arg5.method4420(arg3, 100);
		@Pc(114) int local114 = local103 - local108 / 2;
		@Pc(120) int local120 = arg5.method4422(arg3);
		if (local114 < -arg7.anInt4345 || arg7.anInt4345 < local114 || -arg7.anInt4371 > local93 || local93 > arg7.anInt4371) {
			return;
		}
		if (Static291.aBoolean404) {
			Static133.method2179((Class1_Sub1_Sub3_Sub1) arg7.method3519(false));
		} else {
			Static41.method736(arg7.anIntArray362, arg7.anIntArray363);
		}
		arg5.method4440(arg3, local114 + arg4 + arg7.anInt4345 / 2, -local120 + arg7.anInt4371 / 2 + arg8 + (-local93 - arg2), local108, 50, arg1, 0, 1, 0, 0);
		if (Static291.aBoolean404) {
			Static133.method2171();
		} else {
			Static41.method743();
		}
	}
}
