import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
	public static int anInt2729 = 0;

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "J")
	public static long aLong104 = 0L;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!lg;II)V")
	public static void method2218(@OriginalArg(1) Class97 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static286.anInt5602 < 2 && Static116.anInt5523 == 0 && !Static145.aBoolean386) {
			return;
		}
		@Pc(17) String local17 = Static214.method4437();
		if (arg0 == null) {
			@Pc(80) int local80 = Static86.aClass4_Sub2_Sub9_3.method4083(local17, arg2 + 4, arg1 + 15, Static202.aRandom1, Static53.anInt1192);
			Static123.method2033(15, arg1, local80 + Static86.aClass4_Sub2_Sub9_3.method4086(local17), arg2 - -4);
			return;
		}
		@Pc(25) Class4_Sub2_Sub9 local25 = arg0.method2520(Static303.aClass58Array5);
		if (local25 == null) {
			local25 = Static86.aClass4_Sub2_Sub9_3;
		}
		local25.method4094(local17, arg2, arg1, arg0.anInt3201, arg0.anInt3190, arg0.anInt3187, arg0.anInt3185, arg0.anInt3156, arg0.anInt3144, Static202.aRandom1, Static53.anInt1192, Static185.anIntArray307);
		Static123.method2033(Static185.anIntArray307[3], Static185.anIntArray307[1], Static185.anIntArray307[2], Static185.anIntArray307[0]);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
	public static void method2220(@OriginalArg(1) int arg0) {
		@Pc(4) Class4_Sub2_Sub15 local4 = Static131.method1210(arg0, 2);
		local4.method2875();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public static void method2221(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 5);
		local8.method2875();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!cg;Ljava/lang/String;)Lclient!lk;")
	public static Class100 method2222(@OriginalArg(1) Class22 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.method661(arg1);
		if (local6 == -1) {
			return new Class100(0);
		}
		@Pc(30) int[] local30 = arg0.method654(local6);
		@Pc(36) Class100 local36 = new Class100(local30.length);
		for (@Pc(38) int local38 = 0; local38 < local36.anInt3236; local38++) {
			@Pc(53) Class4_Sub24 local53 = new Class4_Sub24(arg0.method665(local6, local30[local38]));
			local36.aStringArray22[local38] = local53.method3111();
			local36.aByteArray38[local38] = local53.method3069();
			local36.anIntArray266[local38] = local53.method3084();
			local36.anIntArray265[local38] = local53.method3084();
		}
		return local36;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!wc;IIIIII)V")
	public static void method2223(@OriginalArg(0) Class13_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static178.method2921(arg0.anInt5294, arg4, arg0.anInt5334, arg1, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method2224() {
		Static262.aClass172_43.method4350();
	}
}
