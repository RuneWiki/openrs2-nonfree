import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "Lclient!ah;")
	public static Interface2 anInterface2_5;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "S")
	public static short aShort65 = 256;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "S")
	public static short aShort66 = 1;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString164 = "yellow:";

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIZ)Lclient!jd;")
	public static Class10_Sub3_Sub3 method4009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class213 local11 = Static98.aClass213ArrayArrayArray2[arg0][arg1][arg2];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class10_Sub3_Sub3 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class81 local22 = local11.aClass81_4; local22 != null; local22 = local22.aClass81_3) {
			@Pc(32) Class10_Sub3 local32 = local22.aClass10_Sub3_1;
			if (local32 instanceof Class10_Sub3_Sub3) {
				@Pc(38) Class10_Sub3_Sub3 local38 = (Class10_Sub3_Sub3) local32;
				@Pc(48) int local48 = (local38.method5353() - 1) * 64 + 60;
				@Pc(56) int local56 = local38.anInt5910 - local48 >> 7;
				@Pc(64) int local64 = local38.anInt5908 - local48 >> 7;
				@Pc(71) int local71 = local38.anInt5910 + local48 >> 7;
				@Pc(78) int local78 = local38.anInt5908 + local48 >> 7;
				if (local56 <= arg1 && arg2 >= local64 && arg1 <= local71 && arg2 <= local78) {
					@Pc(112) int local112 = (local78 + 1 - arg2) * (-arg1 + 1 + local71);
					if (local19 < local112) {
						local19 = local112;
						local17 = local38;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Lclient!oh;")
	public static Class6_Sub1 method4010() {
		Static161.anInt3401 = 0;
		return Static307.method2748();
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)I")
	public static int method4011(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public static void method4012(@OriginalArg(0) int arg0) {
		if (!Static126.method2624(arg0)) {
			return;
		}
		@Pc(16) Class146[] local16 = Static182.aClass146ArrayArray1[arg0];
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class146 local24 = local16[local18];
			if (local24 != null) {
				local24.anInt4201 = 0;
				local24.anInt4155 = 0;
				local24.anInt4147 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!wg;Lclient!mo;ILclient!mo;)V")
	public static void method4013(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(3) Class143 arg2) {
		Static263.anInterface9_1 = arg0;
		Static233.aClass143_87 = arg2;
		Static111.aClass143_56 = arg1;
		if (Static233.aClass143_87 != null) {
			Static96.anInt2230 = Static233.aClass143_87.method3732(1);
		}
		if (Static111.aClass143_56 != null) {
			Static288.anInt5569 = Static111.aClass143_56.method3732(1);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
	public static void method4014() {
		@Pc(8) int local8 = Static276.method4686();
		if (local8 == 0) {
			Static124.aByteArrayArrayArray6 = null;
			Static228.method4034(0);
		} else if (local8 == 1) {
			Static330.method5668((byte) 0);
			Static228.method4034(512);
			if (Static108.aByteArrayArrayArray5 != null) {
				Static283.method4783();
			}
		} else {
			Static330.method5668((byte) (Static295.anInt5671 - 4 & 0xFF));
			Static228.method4034(2);
		}
		Static266.anInt5050 = Static219.anInt4400;
	}
}
