import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!rn", name = "h", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
	public static int anInt6139 = 0;

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "Lclient!la;")
	public static final Class136 aClass136_169 = new Class136(18, -1);

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Z")
	public static boolean aBoolean422 = false;

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "[I")
	public static final int[] anIntArray376 = new int[13];

	@OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
	public static int anInt6141 = 0;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z[B)Lclient!ew;")
	public static Class3_Sub3_Sub8 method5046(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub3_Sub8 local9 = new Class3_Sub3_Sub8();
		@Pc(14) Class3_Sub25 local14 = new Class3_Sub25(arg0);
		local14.anInt4974 = local14.aByteArray88.length - 2;
		@Pc(25) int local25 = local14.method4083();
		@Pc(36) int local36 = local14.aByteArray88.length - local25 - 2 - 12;
		local14.anInt4974 = local36;
		@Pc(43) int local43 = local14.method4108();
		local9.anInt1858 = local14.method4083();
		local9.anInt1859 = local14.method4083();
		local9.anInt1861 = local14.method4083();
		local9.anInt1860 = local14.method4083();
		@Pc(71) int local71 = local14.method4096();
		@Pc(79) int local79;
		@Pc(85) int local85;
		if (local71 > 0) {
			local9.aClass140Array1 = new Class140[local71];
			for (local79 = 0; local79 < local71; local79++) {
				local85 = local14.method4083();
				@Pc(92) Class140 local92 = new Class140(Static342.method4774(local85));
				local9.aClass140Array1[local79] = local92;
				while (local85-- > 0) {
					@Pc(103) int local103 = local14.method4108();
					@Pc(107) int local107 = local14.method4108();
					local92.method3494((long) local103, new Class3_Sub30(local107));
				}
			}
		}
		local14.anInt4974 = 0;
		local9.aString28 = local14.method4089();
		local9.anIntArray90 = new int[local43];
		local9.aStringArray12 = new String[local43];
		local9.anIntArray91 = new int[local43];
		local79 = 0;
		while (local36 > local14.anInt4974) {
			local85 = local14.method4083();
			if (local85 == 3) {
				local9.aStringArray12[local79] = local14.method4073().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local9.anIntArray90[local79] = local14.method4096();
			} else {
				local9.anIntArray90[local79] = local14.method4108();
			}
			local9.anIntArray91[local79++] = local85;
		}
		return local9;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public static void method5047() {
		@Pc(3) Class194[] local3 = Class23.aClass194Array12;
		synchronized (Class23.aClass194Array12) {
			for (@Pc(12) int local12 = 0; local12 < Class23.aClass194Array12.length; local12++) {
				Class23.aClass194Array12[local12] = new Class194();
				Static112.anIntArray98[local12] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Lclient!ga;")
	public static Class82 method5048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class82 local7 = Static180.method2857(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass82Array1 == null || arg0 >= local7.aClass82Array1.length) {
			return null;
		} else {
			return local7.aClass82Array1[arg0];
		}
	}
}
