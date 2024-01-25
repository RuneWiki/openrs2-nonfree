import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "[I")
	public static int[] anIntArray51;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!efa;")
	public static final Class90 aClass90_2 = new Class90(16);

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_11 = new Class349(21, 0);

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Z")
	public static boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_12 = new Class349(70, -2);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[III[J)V")
	public static void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg2) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) long local25 = arg3[local19];
		arg3[local19] = arg3[arg2];
		arg3[arg2] = local25;
		@Pc(39) int local39 = arg1[local19];
		arg1[local19] = arg1[arg2];
		arg1[arg2] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg0; local61 < arg2; local61++) {
			if (local25 + (long) (local61 & local59) > arg3[local61]) {
				@Pc(79) long local79 = arg3[local61];
				arg3[local61] = arg3[local21];
				arg3[local21] = local79;
				@Pc(93) int local93 = arg1[local61];
				arg1[local61] = arg1[local21];
				arg1[local21++] = local93;
			}
		}
		arg3[arg2] = arg3[local21];
		arg3[local21] = local25;
		arg1[arg2] = arg1[local21];
		arg1[local21] = local39;
		method392(arg0, arg1, local21 - 1, arg3);
		method392(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)[Lclient!tca;")
	public static Class322[] method394() {
		return new Class322[] { Static12.aClass322_1, Static398.aClass322_8, Static445.aClass322_10 };
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILclient!fg;Lclient!fg;)V")
	public static void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12_Sub2_Sub4 arg3, @OriginalArg(4) Class12_Sub2_Sub4 arg4) {
		@Pc(4) Class228 local4 = Static199.method2502(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass12_Sub2_Sub4_1 = arg3;
		local4.aClass12_Sub2_Sub4_2 = arg4;
		@Pc(19) int local19 = Static114.aClass151Array1 == Static320.aClass151Array3 ? 1 : 0;
		if (!arg3.method7513()) {
			Static585.aClass12_Sub2ArrayArray3[local19][Static535.anIntArray577[local19]++] = arg3;
		} else if (arg3.method7503()) {
			Static310.aClass12_Sub2ArrayArray2[local19][Static503.anIntArray540[local19]++] = arg3;
		} else {
			Static146.aClass12_Sub2ArrayArray1[local19][Static313.anIntArray359[local19]++] = arg3;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7513()) {
			if (arg4.method7503()) {
				Static310.aClass12_Sub2ArrayArray2[local19][Static503.anIntArray540[local19]++] = arg4;
				return;
			}
			Static146.aClass12_Sub2ArrayArray1[local19][Static313.anIntArray359[local19]++] = arg4;
			return;
		}
		Static585.aClass12_Sub2ArrayArray3[local19][Static535.anIntArray577[local19]++] = arg4;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZZII)V")
	public static void method398(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		Static73.method1204(arg1, arg2, Static495.aClass86_Sub1Array2.length - 1, arg0, arg3, 0);
		Static28.anInt486 = 0;
		Static348.aClass2_Sub8_1 = null;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
	public static void method399() {
		Static417.anInt8887++;
		Static579.anInt9393 = 0;
		Static549.anInt9008 = 0;
		Static206.method2564();
		Static416.method2251();
		Static559.method7308();
		@Pc(28) boolean local28 = false;
		@Pc(36) int local36;
		for (@Pc(30) int local30 = 0; local30 < Static579.anInt9393; local30++) {
			local36 = Static19.anIntArray48[local30];
			@Pc(43) Class2_Sub5 local43 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local36);
			@Pc(46) Class12_Sub2_Sub1_Sub4_Sub2 local46 = local43.aClass12_Sub2_Sub1_Sub4_Sub2_1;
			if (Static572.aBoolean774 && Static129.method1762(local36)) {
				Static312.method4449();
			}
			if (Static417.anInt8887 != local46.anInt8367) {
				if (local46.aClass295_1.method5945()) {
					Static238.method3429(local46);
				}
				local46.method6784(null);
				local28 = true;
				local43.method7657();
			}
		}
		if (local28) {
			Static51.anInt912 = Static436.aClass90_26.method1679();
			Static436.aClass90_26.method1677(Static379.aClass2_Sub5Array1);
		}
		if (Static528.anInt8479 != Static361.aClass2_Sub7_Sub2_1.anInt5186) {
			throw new RuntimeException("gnp1 pos:" + Static361.aClass2_Sub7_Sub2_1.anInt5186 + " psize:" + Static528.anInt8479);
		}
		for (local36 = 0; local36 < Static365.anInt6148; local36++) {
			if (Static436.aClass90_26.method1685((long) Static461.anIntArray562[local36]) == null) {
				throw new RuntimeException("gnp2 pos:" + local36 + " size:" + Static365.anInt6148);
			}
		}
		if (Static51.anInt912 - Static365.anInt6148 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static51.anInt912 - Static365.anInt6148));
		}
		for (@Pc(169) int local169 = 0; local169 < Static51.anInt912; local169++) {
			if (Static379.aClass2_Sub5Array1[local169].aClass12_Sub2_Sub1_Sub4_Sub2_1.anInt8367 != Static417.anInt8887) {
				throw new RuntimeException("gnp4 uk:" + Static379.aClass2_Sub5Array1[local169].aClass12_Sub2_Sub1_Sub4_Sub2_1.anInt8406);
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!eh;II)Z")
	public static boolean method401(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1) {
		Static313.aClass25_5.method5881(arg0.anIntArray173[arg1], arg0.anIntArray175[arg1], arg0.anIntArray174[arg1], Static422.anIntArray451);
		@Pc(22) int local22 = Static422.anIntArray451[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray55[arg1] = (short) (Static422.anIntArray451[0] * Static491.anInt7778 / local22 + Static519.anInt1794);
			arg0.aShortArray57[arg1] = (short) (Static394.anInt6526 + Static422.anIntArray451[1] * Static249.anInt4134 / local22);
			arg0.aShortArray56[arg1] = (short) local22;
			return true;
		}
	}
}
