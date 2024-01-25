import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
	public static int anInt1370 = 0;

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "[B")
	public static final byte[] aByteArray16 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "[I")
	public static final int[] anIntArray205 = new int[50];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public static void method1094() {
		Static200.aClass7_Sub3_Sub2_3.method2808();
		@Pc(15) int local15 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
		if (local15 == 0) {
			return;
		}
		@Pc(28) int local28 = Static200.aClass7_Sub3_Sub2_3.method2806(2);
		if (local28 == 0) {
			Static71.anIntArray241[Static85.anInt2209++] = 2047;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (local28 == 1) {
			local49 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
			Static252.aClass22_Sub2_Sub1_Sub1_4.method4406(local49, 1);
			local59 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
			if (local59 == 1) {
				Static71.anIntArray241[Static85.anInt2209++] = 2047;
			}
		} else if (local28 == 2) {
			if (Static200.aClass7_Sub3_Sub2_3.method2806(1) == 1) {
				local49 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
				Static252.aClass22_Sub2_Sub1_Sub1_4.method4406(local49, 2);
				local59 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
				Static252.aClass22_Sub2_Sub1_Sub1_4.method4406(local59, 2);
			} else {
				local49 = Static200.aClass7_Sub3_Sub2_3.method2806(3);
				Static252.aClass22_Sub2_Sub1_Sub1_4.method4406(local49, 0);
			}
			local49 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
			if (local49 == 1) {
				Static71.anIntArray241[Static85.anInt2209++] = 2047;
			}
		} else if (local28 == 3) {
			local49 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
			if (local49 == 1) {
				Static71.anIntArray241[Static85.anInt2209++] = 2047;
			}
			local59 = Static200.aClass7_Sub3_Sub2_3.method2806(1);
			@Pc(167) int local167 = Static200.aClass7_Sub3_Sub2_3.method2806(7);
			Static168.anInt3508 = Static200.aClass7_Sub3_Sub2_3.method2806(2);
			@Pc(181) int local181 = Static200.aClass7_Sub3_Sub2_3.method2806(7);
			Static252.aClass22_Sub2_Sub1_Sub1_4.method822(local167, local59 == 1, Static168.anInt3508, local181);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!ap;)Lclient!no;")
	public static Class43_Sub3 method1095(@OriginalArg(1) Class7_Sub3 arg0) {
		return new Class43_Sub3(arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2744(), arg0.method2791(), arg0.method2772());
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V")
	public static void method1096() {
		Static175.aClass10_32.method156();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Ljava/lang/String;CI)I")
	public static int method1097(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = 0;
		@Pc(13) int local13 = arg0.length();
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (arg0.charAt(local15) == arg1) {
				local10++;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILclient!pe;Lclient!we;IIIII)Lclient!kb;")
	public static Class52 method1098(@OriginalArg(1) Class89 arg0, @OriginalArg(2) Class214 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static159.aClass177_1.anInt5324 = arg0.anInt6390;
		Static159.aClass177_1.anInt5317 = arg2;
		Static159.aClass177_1.aBoolean396 = arg1 != null;
		Static159.aClass177_1.anInt5322 = arg4;
		Static159.aClass177_1.anInt5327 = arg5;
		Static159.aClass177_1.anInt5316 = arg3;
		Static159.aClass177_1.anInt5318 = arg6;
		return (Class52) Static17.aClass62_3.method1385(Static159.aClass177_1);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)I")
	public static int method1101(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
