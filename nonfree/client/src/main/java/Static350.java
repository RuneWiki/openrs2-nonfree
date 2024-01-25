import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
	public static int anInt6875;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "B")
	public static byte aByte93;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZII)V")
	public static void method5747(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class3_Sub1_Sub21 local12 = Static57.method8561(arg2, 9);
		local12.method8631();
		local12.anInt10490 = arg0;
		local12.anInt10489 = arg1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILclient!tn;I)Ljava/lang/String;")
	public static String method5748(@OriginalArg(1) Class3_Sub15 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8465();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local7];
			arg0.anInt10282 += Static388.aClass253_1.method6532(arg0.aByteArray106, local7, local24, arg0.anInt10282, 0);
			return Static89.method2282(local24, 0, local7);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(III)Z")
	public static boolean method5749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([II[III)V")
	public static void method5750(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) int local16 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local16;
		@Pc(30) int local30 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local30;
		@Pc(49) int local49 = ~local16 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(51) int local51 = arg3; local51 < arg1; local51++) {
			if (local16 + (local49 & local51) > arg0[local51]) {
				@Pc(70) int local70 = arg0[local51];
				arg0[local51] = arg0[local12];
				arg0[local12] = local70;
				@Pc(84) int local84 = arg2[local51];
				arg2[local51] = arg2[local12];
				arg2[local12++] = local84;
			}
		}
		arg0[arg1] = arg0[local12];
		arg0[local12] = local16;
		arg2[arg1] = arg2[local12];
		arg2[local12] = local30;
		method5750(arg0, local12 - 1, arg2, arg3);
		method5750(arg0, arg1, arg2, local12 + 1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!tn;B)Lclient!qs;")
	public static Class71_Sub4 method5751(@OriginalArg(0) Class3_Sub15 arg0) {
		return new Class71_Sub4(arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8421(), arg0.method8401());
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIB)Z")
	public static boolean method5752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static509.method7394(arg0, arg1)) {
			return (arg1 & 0x9000) != 0 | Static281.method5317(arg0, arg1) | Static43.method789(arg1, arg0) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static297.method5114(arg1, arg0) | Static620.method8467(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!da;)V")
	public static void method5753(@OriginalArg(0) Class25 arg0) {
		Static259.aClass25_9 = arg0;
	}
}
