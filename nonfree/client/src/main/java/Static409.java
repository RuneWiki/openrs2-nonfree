import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "Lclient!rn;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!qw", name = "i", descriptor = "Lclient!dn;")
	public static Class69 aClass69_79;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "J")
	public static long aLong203 = 0L;

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "[I")
	public static final int[] anIntArray697 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "[Lclient!lk;")
	public static final Class176[] aClass176Array2 = new Class176[14];

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "Lclient!raa;")
	public static final Class246 aClass246_2 = new Class246();

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V")
	public static void method6500() {
		Static197.anInt4015 = 0;
		Static105.aClass295_10.method7541();
		Static238.aBoolean354 = false;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)Lclient!dda;")
	public static Class46_Sub2 method6501() {
		@Pc(13) Class46_Sub2 local13 = (Class46_Sub2) Static437.aClass184_24.method5139();
		if (local13 == null) {
			return new Class46_Sub2();
		} else {
			Static231.anInt4488--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!md;)V")
	public static void method6503(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt8978 > Static445.anInt7791) {
			Static146.method2744(arg1);
		} else if (Static445.anInt7791 > arg1.anInt8975) {
			Static206.method3822(arg1, false);
			local9 = Static470.anInt6888;
			local7 = Static141.anInt2827;
		} else {
			Static343.method8040(arg1);
		}
		if (arg1.anInt8954 < 128 || arg1.anInt8949 < 128 || arg1.anInt8954 >= Static237.anInt4563 * 128 - 128 || arg1.anInt8949 >= (Static373.anInt6694 - 1) * 128) {
			arg1.anInt8967 = -1;
			local7 = -1;
			local9 = 0;
			arg1.anInt9022 = -1;
			arg1.anInt8978 = 0;
			arg1.anInt8970 = -1;
			arg1.anInt8975 = 0;
			arg1.anInt8954 = arg1.anIntArray780[0] * 128 + arg1.method7808() * 64;
			arg1.anInt8949 = arg1.anIntArray781[0] * 128 + arg1.method7808() * 64;
			arg1.method7807();
		}
		if (arg1 == Static107.aClass20_Sub1_Sub1_Sub1_1 && (arg1.anInt8954 < 1536 || arg1.anInt8949 < 1536 || arg1.anInt8954 >= Static237.anInt4563 * 128 - 1536 || arg1.anInt8949 >= Static373.anInt6694 * 128 - 1536)) {
			arg1.anInt9022 = -1;
			arg1.anInt8970 = -1;
			local9 = 0;
			arg1.anInt8967 = -1;
			local7 = -1;
			arg1.anInt8975 = 0;
			arg1.anInt8978 = 0;
			arg1.anInt8954 = arg1.anIntArray780[0] * 128 + arg1.method7808() * 64;
			arg1.anInt8949 = arg1.anIntArray781[0] * 128 + arg1.method7808() * 64;
			arg1.method7807();
		}
		@Pc(217) int local217 = Static187.method3601(arg1);
		Static191.method8119(arg1, local9, local7, local217);
		Static410.method6776(arg1);
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!vk;[[BI)V")
	public static void method6504(@OriginalArg(0) Class102_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static464.aByteArrayArray24.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg1[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static378.anIntArray656[local10] >> 8) * 64 - Static538.anInt9485;
				@Pc(39) int local39 = (Static378.anIntArray656[local10] & 0xFF) * 64 - Static282.anInt5380;
				Static422.method6584();
				arg0.method7854(Static362.aClass243Array5, local39, local16, Static455.aClass4_11, local29);
			}
		}
	}
}
