import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!oea", name = "cb", descriptor = "Lclient!lt;")
	public static final Class213 aClass213_6 = new Class213();

	@OriginalMember(owner = "client!oea", name = "fb", descriptor = "Lclient!fca;")
	public static final Class109 aClass109_7 = new Class109();

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "()V")
	public static void method5627() {
		for (@Pc(1) int local1 = 0; local1 < Static563.aClass356Array1.length; local1++) {
			Static563.aClass356Array1[local1].method7827();
		}
		Static563.aClass356Array1 = null;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II[BI)I")
	public static int method5628(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(17) int local17 = arg0; local17 < arg2; local17++) {
			local7 = Class6_Sub1_Sub2_Sub2.anIntArray631[(arg1[local17] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "(I)V")
	public static void method5629() {
		Static356.anIntArray441 = Static159.method2631(0.4F);
	}

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "(I)V")
	public static void method5630() {
		if (Static565.anInt9249 == 1 || Static565.anInt9249 == 3 || Static565.anInt9249 != Static469.anInt8016 && (Static565.anInt9249 == 0 || Static469.anInt8016 == 0)) {
			Static31.anInt820 = 0;
			Static416.anInt7186 = 0;
			Static544.aClass162_40.method3518();
		}
		Static469.anInt8016 = Static565.anInt9249;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BLclient!es;I)Ljava/lang/String;")
	public static String method5631(@OriginalArg(1) Class2_Sub15 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4328();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(23) byte[] local23 = new byte[local7];
			arg0.anInt5241 += Static99.aClass92_1.method1751(local23, local7, arg0.aByteArray62, 0, arg0.anInt5241);
			return Static58.method953(local7, local23, 0);
		} catch (@Pc(47) Exception local47) {
			return "Cabbage";
		}
	}
}
