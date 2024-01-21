import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array3;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	public static int anInt1140 = 0;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "Lclient!kb;")
	public static Class46 aClass46_343 = Static65.method1172(")4col");

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
	public static int anInt1141 = -1;

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "Lclient!kb;")
	public static Class46 aClass46_344 = Static65.method1172("str=");

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "Lclient!kb;")
	public static Class46 aClass46_345 = Static65.method1172("img=");

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "Lclient!kb;")
	public static Class46 aClass46_346 = Static65.method1172("u=");

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "Lclient!kb;")
	public static Class46 aClass46_347 = Static65.method1172("shad");

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
	public static int anInt1142 = -1;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Lclient!kb;")
	public static Class46 aClass46_348 = Static65.method1172("shad=");

	@OriginalMember(owner = "client!rb", name = "P", descriptor = "Lclient!kb;")
	public static Class46 aClass46_349 = Static65.method1172("reg");

	@OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
	public static int anInt1143 = 0;

	@OriginalMember(owner = "client!rb", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_350 = Static65.method1172("str");

	@OriginalMember(owner = "client!rb", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_351 = Static65.method1172("euro");

	@OriginalMember(owner = "client!rb", name = "V", descriptor = "Lclient!kb;")
	public static Class46 aClass46_352 = Static65.method1172("shy");

	@OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
	public static int anInt1144 = -1;

	@OriginalMember(owner = "client!rb", name = "X", descriptor = "Lclient!kb;")
	public static Class46 aClass46_353 = Static65.method1172("br");

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_354 = Static65.method1172(")4shad");

	@OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_355 = Static65.method1172("nbsp");

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "Lclient!kb;")
	public static Class46 aClass46_356 = Static65.method1172("copy");

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
	public static int anInt1146 = 0;

	@OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
	public static int anInt1147 = 256;

	@OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
	public static int anInt1148 = 0;

	@OriginalMember(owner = "client!rb", name = "jb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_357 = Static65.method1172("col=");

	@OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
	public static int anInt1149 = -1;

	@OriginalMember(owner = "client!rb", name = "lb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_358 = Static65.method1172("u");

	@OriginalMember(owner = "client!rb", name = "mb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_359 = Static65.method1172("gt");

	@OriginalMember(owner = "client!rb", name = "nb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_360 = Static65.method1172(")4str");

	@OriginalMember(owner = "client!rb", name = "ob", descriptor = "I")
	public static int anInt1150 = 256;

	@OriginalMember(owner = "client!rb", name = "qb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_361 = Static65.method1172("lt");

	@OriginalMember(owner = "client!rb", name = "sb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_362 = Static65.method1172("times");

	@OriginalMember(owner = "client!rb", name = "tb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_363 = Static65.method1172(")4u");

	@OriginalMember(owner = "client!rb", name = "ub", descriptor = "[Lclient!kb;")
	public static Class46[] aClass46Array7 = new Class46[100];

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([I[BIIIIIIII)V")
	public static void method801(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(17) int local17 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		@Pc(21) int local21 = 256 - arg9;
		for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
			for (@Pc(28) int local28 = -arg5; local28 < 0; local28++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					@Pc(38) int local38 = arg0[arg4];
					arg0[arg4++] = (((local38 & 0xFF00FF) * local21 & 0xFF00FF00) + ((local38 & 0xFF00) * local21 & 0xFF0000) >> 8) + local17;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([I[BIIIIIII)V")
	public static void method809(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(4) int local4 = -(arg5 >> 2);
		@Pc(9) int local9 = -(arg5 & 0x3);
		for (@Pc(12) int local12 = -arg6; local12 < 0; local12++) {
			for (@Pc(15) int local15 = local4; local15 < 0; local15++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			for (@Pc(69) int local69 = local9; local69 < 0; local69++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}
			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "()V")
	public static void method814() {
		aClass46_361 = null;
		aClass46_359 = null;
		aClass46_355 = null;
		aClass46_352 = null;
		aClass46_362 = null;
		aClass46_351 = null;
		aClass46_356 = null;
		aClass46_349 = null;
		aClass46_345 = null;
		aClass46_353 = null;
		aClass46_357 = null;
		aClass46_343 = null;
		aClass46_346 = null;
		aClass46_358 = null;
		aClass46_363 = null;
		aClass46_348 = null;
		aClass46_347 = null;
		aClass46_354 = null;
		aClass46_344 = null;
		aClass46_350 = null;
		aClass46_360 = null;
		aClass3_Sub2_Sub3_Sub2Array3 = null;
		aClass46Array7 = null;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(Lclient!kb;)Lclient!kb;")
	public static Class46 method815(@OriginalArg(0) Class46 arg0) {
		@Pc(3) int local3 = arg0.method1376();
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(13) byte local13 = arg0.aByteArray17[local7];
			if (local13 == 60 || local13 == 62) {
				local5 += 3;
			}
		}
		@Pc(28) Class46 local28 = new Class46();
		local28.anInt2034 = local3 + local5;
		local28.aByteArray17 = new byte[local28.anInt2034];
		@Pc(40) int local40 = 0;
		for (@Pc(42) int local42 = 0; local42 < local3; local42++) {
			@Pc(48) byte local48 = arg0.aByteArray17[local42];
			if (local48 == 60) {
				local28.aByteArray17[local40++] = 60;
				local28.aByteArray17[local40++] = 108;
				local28.aByteArray17[local40++] = 116;
				local28.aByteArray17[local40++] = 62;
			} else if (local48 == 62) {
				local28.aByteArray17[local40++] = 60;
				local28.aByteArray17[local40++] = 103;
				local28.aByteArray17[local40++] = 116;
				local28.aByteArray17[local40++] = 62;
			} else {
				local28.aByteArray17[local40++] = local48;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([[B[[B[I[I[III)I")
	public static int method830(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg2[arg5];
		@Pc(9) int local9 = local3 + arg4[arg5];
		@Pc(13) int local13 = arg2[arg6];
		@Pc(19) int local19 = local13 + arg4[arg6];
		@Pc(21) int local21 = local3;
		if (local13 > local3) {
			local21 = local13;
		}
		@Pc(28) int local28 = local9;
		if (local19 < local9) {
			local28 = local19;
		}
		@Pc(37) int local37 = arg3[arg5];
		if (arg3[arg6] < local37) {
			local37 = arg3[arg6];
		}
		@Pc(50) byte[] local50 = arg1[arg5];
		@Pc(54) byte[] local54 = arg0[arg6];
		@Pc(58) int local58 = local21 - local3;
		@Pc(62) int local62 = local21 - local13;
		for (@Pc(64) int local64 = local21; local64 < local28; local64++) {
			@Pc(75) int local75 = local50[local58++] + local54[local62++];
			if (local75 < local37) {
				local37 = local75;
			}
		}
		return -local37;
	}
}
