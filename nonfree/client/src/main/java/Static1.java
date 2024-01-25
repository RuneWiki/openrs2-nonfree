import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "Z")
	public static boolean aBoolean1;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "[I")
	public static final int[] anIntArray1 = new int[14];

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!fg;)I")
	public static int method43(@OriginalArg(1) Class4_Sub18 arg0) {
		@Pc(12) String local12 = Static23.method438(arg0);
		@Pc(14) int[] local14 = null;
		if (Static165.method3185(arg0.anInt3158)) {
			local14 = Static195.aClass99_1.method2798((int) arg0.aLong74).anIntArray476;
		} else if (arg0.anInt3157 != -1) {
			local14 = Static195.aClass99_1.method2798(arg0.anInt3157).anIntArray476;
		} else if (Static543.method7528(arg0.anInt3158)) {
			@Pc(101) Class4_Sub50 local101 = (Class4_Sub50) Static106.aClass183_8.method4289((long) arg0.aLong74);
			if (local101 != null) {
				@Pc(106) Class10_Sub1_Sub2_Sub1 local106 = local101.aClass10_Sub1_Sub2_Sub1_1;
				@Pc(109) Class54 local109 = local106.aClass54_1;
				if (local109.anIntArray150 != null) {
					local109 = local109.method1118(Static511.aClass335_2);
				}
				if (local109 != null) {
					local14 = local109.anIntArray152;
				}
			}
		} else if (Static226.method3959(arg0.anInt3158)) {
			@Pc(66) Class25 local66;
			if (arg0.anInt3158 == 1010) {
				local66 = Static553.aClass288_4.method6419((int) arg0.aLong74);
			} else {
				local66 = Static553.aClass288_4.method6419((int) (arg0.aLong74 >>> 32 & 0x7FFFFFFFL));
			}
			if (local66.anIntArray115 != null) {
				local66 = local66.method578(Static511.aClass335_2);
			}
			if (local66 != null) {
				local14 = local66.anIntArray113;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static315.method4804(local14);
		}
		@Pc(141) int local141 = Static195.aClass196_5.method4377(Static367.aClass13Array24, local12);
		if (arg0.aBoolean248) {
			local141 += Static399.aClass13_29.QA() + 4;
		}
		return local141;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;II)V")
	public static void method45(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) int arg3) {
		Static435.method6180(-1, arg3, true, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BLclient!eh;)Lclient!ica;")
	public static Class156 method46(@OriginalArg(1) Class4_Sub9 arg0) {
		@Pc(7) int local7 = arg0.method5982();
		@Pc(14) Class297 local14 = Static192.method3526()[arg0.method6015()];
		@Pc(21) Class58 local21 = Static458.method6443()[arg0.method6015()];
		@Pc(33) int local33 = arg0.method6003();
		@Pc(37) int local37 = arg0.method6003();
		return new Class156(local7, local14, local21, local33, local37);
	}
}
