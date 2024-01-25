import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fja", name = "m", descriptor = "I")
	public static int anInt2720;

	@OriginalMember(owner = "client!fja", name = "r", descriptor = "Lclient!tp;")
	public static Class4_Sub3_Sub5 aClass4_Sub3_Sub5_3;

	@OriginalMember(owner = "client!fja", name = "s", descriptor = "I")
	public static int anInt2724;

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_55 = new Class216(79, 6);

	@OriginalMember(owner = "client!fja", name = "l", descriptor = "I")
	public static int anInt2719 = 0;

	@OriginalMember(owner = "client!fja", name = "o", descriptor = "Z")
	public static boolean aBoolean198 = true;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IIIZ)V")
	public static void method2590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static494.anInt7907 == arg1 && Static423.anInt6689 == arg2 && arg0 == Static633.anInt9789) {
			return;
		}
		Static494.anInt7907 = arg1;
		Static42.aBoolean73 = true;
		Static423.anInt6689 = arg2;
		Static633.anInt9789 = arg0;
		@Pc(39) double local39 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static380.aDouble24 = local52 * local58;
		Static419.aDouble25 = 0.0D;
		Static395.aDouble13 = local61 * -local52;
		Static278.aDouble18 = local61;
		Static603.aDouble27 = local52;
		Static246.aDouble16 = local55;
		Static201.aDouble15 = local58 * -local55;
		Static284.aDouble20 = local55 * local61;
		Static310.aDouble21 = local58;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!bn;B)V")
	public static void method2591(@OriginalArg(0) Class4_Sub11_Sub1 arg0) {
		arg0.method986();
		@Pc(10) int local10 = Static184.anInt3149;
		@Pc(20) Class3_Sub1_Sub2_Sub2_Sub1 local20 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local10] = new Class3_Sub1_Sub2_Sub2_Sub1();
		local20.anInt9961 = local10;
		@Pc(28) int local28 = arg0.method988(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray693[0] = local39 - Static445.anInt6949;
		local20.anInt9925 = (local20.anIntArray693[0] << 9) + (local20.method8514() << 8);
		local20.anIntArray694[0] = local43 - Static321.anInt5000;
		local20.anInt9917 = (local20.anIntArray694[0] << 9) + (local20.method8514() << 8);
		Static296.anInt4684 = local20.aByte141 = local20.aByte142 = local33;
		if (Static547.method7286(local20.anIntArray693[0], local20.anIntArray694[0])) {
			local20.aByte142++;
		}
		if (Static57.aClass4_Sub11Array1[local10] != null) {
			local20.method3537(Static57.aClass4_Sub11Array1[local10]);
		}
		Static518.anInt10290 = 0;
		Static489.anIntArray519[Static518.anInt10290++] = local10;
		Static663.aByteArray104[local10] = 0;
		Static535.anInt8296 = 0;
		for (@Pc(147) int local147 = 1; local147 < 2048; local147++) {
			if (local10 != local147) {
				@Pc(161) int local161 = arg0.method988(18);
				@Pc(165) int local165 = local161 >> 16;
				@Pc(171) int local171 = local161 >> 8 & 0xFF;
				@Pc(175) int local175 = local161 & 0xFF;
				@Pc(183) Class228 local183 = Static58.aClass228Array1[local147] = new Class228();
				local183.aBoolean421 = false;
				local183.anInt5579 = 0;
				local183.anInt5578 = (local171 << 14) + ((local165 << 28) + local175);
				local183.aBoolean420 = false;
				local183.anInt5577 = -1;
				Static414.anIntArray449[Static535.anInt8296++] = local147;
				Static663.aByteArray104[local147] = 0;
			}
		}
		arg0.method992();
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Ljava/lang/String;IC)I")
	public static int method2592(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (arg0.charAt(local18) == arg1) {
				local13++;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IB)I")
	public static int method2593(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(34) int local34 = local28 | local28 >>> 16;
		return local34 + 1;
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(B)V")
	public static void method2595() {
		Static475.aClass17_56 = null;
		Static128.aClass17Array3 = null;
		Static563.aClass17_53 = null;
		Static376.aClass17_50 = null;
		Static16.aClass17_2 = null;
		Static312.aClass17_46 = null;
		Static9.aClass17_77 = null;
		Static191.aClass17_31 = null;
		Static191.aClass17_30 = null;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(II)Z")
	public static boolean method2596(@OriginalArg(1) int arg0) {
		return arg0 == 8 || arg0 == 51 || arg0 == 48 || arg0 == 30 || arg0 == 44 || arg0 == 58 || arg0 == 5;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(BI)Z")
	public static boolean method2597(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
