import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
	public static final int anInt4854 = 50;

	@OriginalMember(owner = "client!jh", name = "H", descriptor = "[I")
	public static final int[] anIntArray427 = new int[anInt4854];

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "[I")
	public static final int[] anIntArray428 = new int[anInt4854];

	@OriginalMember(owner = "client!jh", name = "L", descriptor = "[I")
	public static final int[] anIntArray429 = new int[anInt4854];

	@OriginalMember(owner = "client!jh", name = "P", descriptor = "[I")
	public static final int[] anIntArray430 = new int[anInt4854];

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[anInt4854];

	@OriginalMember(owner = "client!jh", name = "U", descriptor = "[I")
	public static final int[] anIntArray431 = new int[anInt4854];

	@OriginalMember(owner = "client!jh", name = "W", descriptor = "[I")
	public static final int[] anIntArray432 = new int[anInt4854];

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)V")
	public static void method4150() {
		Static529.aClass223_62.method4932();
		Static401.aClass223_47.method4932();
		Static304.aClass223_43.method4932();
		Static258.aClass223_37.method4932();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB[Lclient!gba;IZI)V")
	public static void method4151(@OriginalArg(0) int arg0, @OriginalArg(2) Class115[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(21) Class115 local21 = arg1[local7];
			if (local21 != null && arg4 == local21.anInt3441) {
				Static591.method7953(arg3, local21, arg2, arg0);
				Static451.method8012(arg2, local21, arg0);
				if (local21.anInt3485 > local21.anInt3462 - local21.anInt3474) {
					local21.anInt3485 = local21.anInt3462 - local21.anInt3474;
				}
				if (local21.anInt3484 - local21.anInt3481 < local21.anInt3526) {
					local21.anInt3526 = local21.anInt3484 - local21.anInt3481;
				}
				if (local21.anInt3485 < 0) {
					local21.anInt3485 = 0;
				}
				if (local21.anInt3526 < 0) {
					local21.anInt3526 = 0;
				}
				if (local21.anInt3519 == 0) {
					Static424.method6072(local21, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZIIII[B)V")
	public static void method4152(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(24) int local24 = arg2 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg2 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(33) int local33 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(38) int local38 = local33 + 1;
			arg3[local33] = 1;
			@Pc(43) int local43 = local38 + 1;
			arg3[local38] = 1;
			arg1 = local43 + 1;
			arg3[local43] = 1;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
	public static void method4153(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static392.aClass4_Sub7_Sub13_2 != null) {
			Static213.anInt4349 = Static392.aClass4_Sub7_Sub13_2.anInt6629;
		} else {
			Static213.anInt4349 = -1;
		}
		Static392.aClass4_Sub7_Sub13_2 = null;
		Static355.anInt6196 = 0;
		Static457.aClass124_51 = null;
		Static593.aClass115_15 = null;
		Static392.method7240();
		Static392.aClass124_60.method3265();
		Static112.aClass189_3 = null;
		Static142.aClass189_4 = null;
		Static413.aClass189_8 = null;
		Static382.aClass189_7 = null;
		Static40.aClass189_1 = null;
		Static70.anInt1454 = -1;
		Static533.aClass189_9 = null;
		Static300.aClass189_6 = null;
		Static439.anInt9627 = -1;
		Static56.aClass13_4 = null;
		Static74.aClass189_2 = null;
		Static392.aClass67_3 = null;
		if (Static392.aClass337_4 != null) {
			Static392.aClass337_4.method7440();
			Static392.aClass337_4.method7445(64, 128);
		}
		if (Static392.aClass190_4 != null) {
			Static392.aClass190_4.method4348(64, 64);
		}
		if (Static392.aClass288_3 != null) {
			Static392.aClass288_3.method6420(64);
		}
		Static538.aClass101_1.method2823(64);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!dw;III)V")
	public static void method4154(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static348.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt7407 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass4_Sub32Array5[arg0.anInt7407++] = Static22.aClass32Array1[local21 - 1].aClass4_Sub32_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt7407; local21 < 4; local21++) {
			arg0.aClass4_Sub32Array5[local21] = null;
		}
	}
}
