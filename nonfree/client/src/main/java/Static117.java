import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "Lclient!kc;")
	public static Class202 aClass202_3;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_41 = new Class126(103, -1);

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "[[F")
	public static final float[][] aFloatArrayArray1 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)I")
	public static int method2128() {
		return Static647.anInt9957;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBI)I")
	public static int method2131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method2133(@OriginalArg(1) String arg0) {
		@Pc(14) String local14 = Static477.method6824(Static359.method5381(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IZ)V")
	public static void method2134(@OriginalArg(0) int arg0) {
		if (!Static368.method5461(arg0)) {
			return;
		}
		@Pc(14) Class208[] local14 = Static562.aClass208ArrayArray3[arg0];
		for (@Pc(20) int local20 = 0; local20 < local14.length; local20++) {
			@Pc(26) Class208 local26 = local14[local20];
			if (local26 != null) {
				local26.anInt5591 = 1;
				local26.anInt5656 = 0;
				local26.anInt5655 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZIIIII)V")
	public static void method2135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static227.aClass3_Sub15_11.aClass17_Sub3_4.method741() != 0 && arg0 != 0 && Static228.anInt2286 < 50 && arg1 != -1) {
			Static631.aClass303Array2[Static228.anInt2286++] = new Class303((byte) 1, arg1, arg0, arg2, arg3, 0, arg4, (Class23_Sub2) null);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB[BIII)V")
	public static void method2137(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(24) int local24 = arg3 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg2 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(33) int local33 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg0[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg0[local38] = 1;
			arg1 = local43 + 1;
			arg0[local43] = 1;
		}
	}
}
