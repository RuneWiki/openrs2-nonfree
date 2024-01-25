import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!br", name = "O", descriptor = "Lclient!bk;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!br", name = "Q", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!br", name = "M", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_6 = new Class179(51, 8);

	@OriginalMember(owner = "client!br", name = "N", descriptor = "I")
	public static int anInt790 = -1;

	@OriginalMember(owner = "client!br", name = "P", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_17 = new Class7("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!br", name = "R", descriptor = "I")
	public static int anInt791 = -1;

	@OriginalMember(owner = "client!br", name = "e", descriptor = "(III)Z")
	public static boolean method715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static102.method1860(arg0, arg1) | (arg0 & 0x70000) != 0 || Static285.method4143(arg1, arg0);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!cg;IIIII)V")
	public static void method716(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5265 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static61.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class243 local35 = Static124.aClass243Array5[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5265; local37++) {
							if (arg0.aClass1_Sub31Array3[local37] == local35.aClass1_Sub31_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass1_Sub31Array3[arg0.anInt5265++] = local35.aClass1_Sub31_2;
						if (arg0.anInt5265 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5265; local7 < 4; local7++) {
			arg0.aClass1_Sub31Array3[local7] = null;
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIII)V")
	public static void method719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 == arg4) {
			Static195.method3023(arg0, arg3, arg1, arg2);
		} else if (arg1 - arg2 >= Static28.anInt644 && arg1 + arg2 <= Static125.anInt2545 && Static108.anInt2276 <= arg0 - arg4 && arg0 + arg4 <= Static173.anInt3208) {
			Static48.method865(arg3, arg4, arg2, arg0, arg1);
		} else {
			Static259.method3865(arg2, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!ul;)I")
	public static int method720(@OriginalArg(1) Class246 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method5497(Static350.anInt5830)) {
			local5++;
		}
		if (arg0.method5497(Static287.anInt5019)) {
			local5++;
		}
		if (arg0.method5497(Static390.anInt6279)) {
			local5++;
		}
		if (arg0.method5497(Static117.anInt2416)) {
			local5++;
		}
		if (arg0.method5497(Static278.anInt4902)) {
			local5++;
		}
		if (arg0.method5497(Static20.anInt4991)) {
			local5++;
		}
		if (arg0.method5497(Static158.anInt2981)) {
			local5++;
		}
		if (arg0.method5497(Static426.anInt6882)) {
			local5++;
		}
		if (arg0.method5497(Static156.anInt2955)) {
			local5++;
		}
		if (arg0.method5497(Static180.anInt6842)) {
			local5++;
		}
		if (arg0.method5497(Static174.anInt3226)) {
			local5++;
		}
		if (arg0.method5497(Static191.anInt3422)) {
			local5++;
		}
		if (arg0.method5497(Static245.anInt4499)) {
			local5++;
		}
		if (arg0.method5497(Static269.anInt4765)) {
			local5++;
		}
		if (arg0.method5497(Static310.anInt5356)) {
			local5++;
		}
		if (arg0.method5497(Static242.anInt4444)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(II)I")
	public static int method721(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
