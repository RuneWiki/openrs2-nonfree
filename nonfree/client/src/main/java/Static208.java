import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
	public static int anInt4335;

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "Lclient!e;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "Lclient!nk;")
	public static Class2_Sub3_Sub5 aClass2_Sub3_Sub5_3;

	@OriginalMember(owner = "client!pm", name = "W", descriptor = "[[[Lclient!a;")
	public static Class1[][][] aClass1ArrayArrayArray1;

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "[I")
	public static int[] anIntArray357;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString217 = " ";

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "[I")
	public static int[] anIntArray356 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BZ)V")
	public static void method3526(@OriginalArg(1) boolean arg0) {
		Static222.method3717(Static257.anInt5343, arg0, Static20.anInt1235, Static17.anInt427);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	public static void method3527() {
		@Pc(8) int local8 = Static18.aByteArrayArray13.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			if (Static18.aByteArrayArray13[local10] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static56.anInt1266; local24++) {
					if (Static63.anIntArray105[local10] == Static22.anIntArray18[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static22.anIntArray18[Static56.anInt1266] = Static63.anIntArray105[local10];
					local22 = Static56.anInt1266++;
				}
				@Pc(58) int local58 = 0;
				@Pc(65) Class2_Sub26 local65 = new Class2_Sub26(Static18.aByteArrayArray13[local10]);
				while (Static18.aByteArrayArray13[local10].length > local65.anInt5328 && local58 < 511) {
					@Pc(81) int local81 = local65.method4242();
					@Pc(85) int local85 = local81 >> 14;
					@Pc(92) int local92 = local22 | local58++ << 6;
					@Pc(96) int local96 = local81 & 0x3F;
					@Pc(109) int local109 = local96 + (Static63.anIntArray105[local10] & 0xFF) * 64 - Static203.anInt4236;
					@Pc(115) int local115 = local81 >> 7 & 0x3F;
					@Pc(127) int local127 = local115 + (Static63.anIntArray105[local10] >> 8) * 64 - Static125.anInt5772;
					@Pc(133) Class33 local133 = Static112.method2081(local65.method4242());
					if (Static201.aClass36_Sub3_Sub1Array1[local92] == null && (local133.aByte5 & 0x1) > 0 && local85 == Static8.anInt271 && local127 >= 0 && local133.anInt888 + local127 < 104 && local109 >= 0 && local133.anInt888 + local109 < 104) {
						Static201.aClass36_Sub3_Sub1Array1[local92] = new Class36_Sub3_Sub1();
						@Pc(182) Class36_Sub3_Sub1 local182 = Static201.aClass36_Sub3_Sub1Array1[local92];
						Static9.anIntArray12[Static71.anInt1550++] = local92;
						local182.anInt5091 = Static148.anInt3168;
						local182.method2418(local133);
						local182.method4098(local182.aClass33_1.anInt888);
						local182.anInt5063 = local182.anInt5069 = Static134.anIntArray204[local182.aClass33_1.aByte3];
						local182.anInt5132 = local182.aClass33_1.anInt853;
						if (local182.anInt5132 == 0) {
							local182.anInt5069 = 0;
						}
						local182.anInt5140 = local182.aClass33_1.anInt864;
						local182.method4092(local127, local182.method4097(), true, local109);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "(II)Lclient!tn;")
	public static Class167 method3532(@OriginalArg(0) int arg0) {
		@Pc(17) Class167 local17 = (Class167) Static108.aClass46_16.method1074((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(32) byte[] local32 = Static218.aClass84_100.method2127(Static221.method3711(arg0), Static152.method2621(arg0));
		local17 = new Class167();
		local17.anInt5420 = arg0;
		if (local32 != null) {
			local17.method4338(new Class2_Sub26(local32));
		}
		Static108.aClass46_16.method1071(local17, (long) arg0);
		return local17;
	}
}
