import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!ku", name = "O", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_1 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_2 = new Class184(Static84.aClass64_4);

	@OriginalMember(owner = "client!ku", name = "m", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_3 = new Class184(Static84.aClass64_4);

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_4 = new Class184(Static84.aClass64_4);

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_5 = new Class184(Static84.aClass64_4);

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_6 = new Class184(Static84.aClass64_4);

	@OriginalMember(owner = "client!ku", name = "q", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_7 = new Class184(Static84.aClass64_4);

	@OriginalMember(owner = "client!ku", name = "r", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_8 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "s", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_9 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "t", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_10 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "u", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_11 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "v", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_12 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_13 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "x", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_14 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_15 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "z", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_16 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "A", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_17 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "B", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_18 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "C", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_19 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "D", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_20 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "E", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_21 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "F", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_22 = new Class184(Static84.aClass64_2);

	@OriginalMember(owner = "client!ku", name = "G", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_23 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "I", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_24 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "J", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_25 = new Class184(Static84.aClass64_1);

	@OriginalMember(owner = "client!ku", name = "K", descriptor = "Lclient!ku;")
	public static final Class184 aClass184_26 = new Class184(Static84.aClass64_3);

	@OriginalMember(owner = "client!ku", name = "L", descriptor = "I")
	public static int anInt5214 = -1;

	@OriginalMember(owner = "client!ku", name = "M", descriptor = "F")
	public static float aFloat131 = 0.0F;

	@OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
	public static int anInt5215 = 0;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!w;III[Z)V")
	public static void method4497(@OriginalArg(0) Class6_Sub2_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static133.aClass59Array3 == Static49.aClass59Array2) {
			return;
		}
		@Pc(9) int local9 = Static273.aClass59Array4[arg1].sa(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class59 local22 = Static273.aClass59Array4[local11];
				if (local22 != null) {
					local22.FA(arg0, arg2, local9 - local22.sa(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!oa;IIIIIB)Lclient!ba;")
	public static Class20 method4498(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(12) Class20 local12 = (Class20) Static354.aClass136_96.method3473(local6);
		if (local12 == null) {
			@Pc(22) Class220 local22 = Static489.method6690(arg3, Static145.aClass251_40);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt6196 < 13) {
				local22.method5294();
			}
			local12 = arg0.method6833(local22, 2055, Static349.anInt6234, 64, 768);
			Static354.aClass136_96.method3482(local6, local12);
		}
		local12 = local12.method7264((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.I(arg4);
		}
		if (arg2 != 0) {
			local12.AA(arg2);
		}
		if (arg1 != 0) {
			local12.v(arg1);
		}
		if (arg5 != 0) {
			local12.m(0, arg5, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)[Lclient!ku;")
	public static Class184[] method4499() {
		return new Class184[] { aClass184_1, aClass184_2, aClass184_3, aClass184_4, aClass184_5, aClass184_6, aClass184_7, aClass184_8, aClass184_9, aClass184_10, aClass184_11, aClass184_12, aClass184_13, aClass184_14, aClass184_15, aClass184_16, aClass184_17, aClass184_18, aClass184_19, aClass184_20, aClass184_21, aClass184_22, aClass184_23, aClass184_24, aClass184_25, aClass184_26 };
	}
}
