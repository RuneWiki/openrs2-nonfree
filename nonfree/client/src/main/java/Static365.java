import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!md", name = "d", descriptor = "I")
	public static int anInt5854;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "[B")
	public static byte[] aByteArray63 = null;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZILclient!jp;)Ljava/lang/String;")
	public static String method5318(@OriginalArg(2) Class3_Sub25 arg0) {
		try {
			@Pc(7) int local7 = arg0.method8604();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(24) byte[] local24 = new byte[local7];
			arg0.anInt9765 += Static404.aClass245_1.method5906(local7, 0, arg0.anInt9765, local24, arg0.aByteArray106);
			return Static426.method6150(local24, 0, local7);
		} catch (@Pc(48) Exception local48) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "([Ljava/lang/Object;II[JI)V")
	public static void method5319(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) long local16 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg2; local52 < arg1; local52++) {
			if ((long) (local50 & local52) + local16 > arg3[local52]) {
				@Pc(73) long local73 = arg3[local52];
				arg3[local52] = arg3[local12];
				arg3[local12] = local73;
				@Pc(87) Object local87 = arg0[local52];
				arg0[local52] = arg0[local12];
				arg0[local12++] = local87;
			}
		}
		arg3[arg1] = arg3[local12];
		arg3[local12] = local16;
		arg0[arg1] = arg0[local12];
		arg0[local12] = local30;
		method5319(arg0, local12 - 1, arg2, arg3);
		method5319(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	public static void method5320() {
		Static669.aClass165_84.method4400();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)V")
	public static void method5322(@OriginalArg(1) int arg0) {
		Static41.anInt961 = arg0;
		Static46.anInt1071 = 2;
		Static191.method3505("", Static342.aString58.equals(""), Static342.aString58, true);
	}
}
