import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static633 {

	@OriginalMember(owner = "client!via", name = "t", descriptor = "Lclient!cb;")
	public static Class50 aClass50_176;

	@OriginalMember(owner = "client!via", name = "w", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_321 = new Class196(126, -2);

	@OriginalMember(owner = "client!via", name = "x", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_102 = new Class187(55, 2);

	@OriginalMember(owner = "client!via", name = "y", descriptor = "I")
	public static int anInt10108 = 0;

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(BII[I[J)V")
	public static void method8419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) long[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg0 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) long local29 = arg3[local23];
		arg3[local23] = arg3[arg0];
		arg3[arg0] = local29;
		@Pc(43) int local43 = arg2[local23];
		arg2[local23] = arg2[arg0];
		arg2[arg0] = local43;
		@Pc(63) int local63 = ~local29 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg1; local65 < arg0; local65++) {
			if (local29 + (long) (local63 & local65) > arg3[local65]) {
				@Pc(87) long local87 = arg3[local65];
				arg3[local65] = arg3[local25];
				arg3[local25] = local87;
				@Pc(101) int local101 = arg2[local65];
				arg2[local65] = arg2[local25];
				arg2[local25++] = local101;
			}
		}
		arg3[arg0] = arg3[local25];
		arg3[local25] = local29;
		arg2[arg0] = arg2[local25];
		arg2[local25] = local43;
		method8419(local25 - 1, arg1, arg2, arg3);
		method8419(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(II)I")
	public static int method8420(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(IIZLjava/lang/String;I)V")
	public static void method8421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class394 local12 = Static622.method7590(arg0, arg3);
		if (local12 == null) {
			return;
		}
		if (local12.anObjectArray5 != null) {
			@Pc(22) Class5_Sub28 local22 = new Class5_Sub28();
			local22.anInt3835 = arg1;
			local22.aClass394_2 = local12;
			local22.anObjectArray2 = local12.anObjectArray5;
			local22.aString32 = arg2;
			Static497.method7205(local22);
		}
		if (Static539.anInt8853 != 10 || !Static81.method1268(local12).method6630(arg1 - 1)) {
			return;
		}
		@Pc(66) Class5_Sub16 local66;
		if (arg1 == 1) {
			local66 = Static455.method6717(Static82.aClass187_26, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 2) {
			local66 = Static455.method6717(Static48.aClass187_15, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 3) {
			local66 = Static455.method6717(Static474.aClass187_75, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 4) {
			local66 = Static455.method6717(Static101.aClass187_29, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 5) {
			local66 = Static455.method6717(Static664.aClass187_111, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 6) {
			local66 = Static455.method6717(Static226.aClass187_48, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 7) {
			local66 = Static455.method6717(Static577.aClass187_94, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 8) {
			local66 = Static455.method6717(Static649.aClass187_108, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 9) {
			local66 = Static455.method6717(Static271.aClass187_53, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
		if (arg1 == 10) {
			local66 = Static455.method6717(Static648.aClass187_106, Static16.aClass332_8);
			Static526.method7363(arg3, local12.anInt10469, local66, arg0);
			Static479.method7038(local66);
		}
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V")
	public static void method8422() {
		if (Static150.aClass202_2.aBoolean384 && Static617.aClass365_6.anInt9973 != -1) {
			Static66.method953(Static617.aClass365_6.anInt9973, Static617.aClass365_6.aString112);
		}
	}
}
