import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lclient!xa;")
	public static Class37[] aClass37Array6;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!fd;)Ljava/lang/String;")
	public static String method5659(@OriginalArg(2) Class3_Sub7 arg0) {
		try {
			@Pc(7) int local7 = arg0.method6542();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt7869 += Static192.aClass197_3.method4992(local7, local19, arg0.aByteArray86, arg0.anInt7869, 0);
			return Static456.method7058(local19, local7, 0);
		} catch (@Pc(43) Exception local43) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)I")
	public static int method5660(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public static void method5661() throws IOException {
		if (Static393.aClass8_2 == null || Static210.anInt4339 <= 0) {
			return;
		}
		@Pc(8) int local8 = 0;
		while (true) {
			@Pc(13) Class3_Sub9 local13 = (Class3_Sub9) Static64.aClass183_5.method4795();
			if (local13 == null) {
				Static43.anInt10255 += local8;
				Static484.anInt9039 = 0;
				break;
			}
			Static393.aClass8_2.method361(local13.anInt1629, local13.aClass3_Sub7_Sub1_1.aByteArray86);
			local8 += local13.anInt1629;
			Static210.anInt4339 -= local13.anInt1629;
			local13.method8412();
			local13.aClass3_Sub7_Sub1_1.method6543();
			local13.method1590();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5662(@OriginalArg(1) String arg0) {
		Static348.method2212(0, "", 0, "", arg0, "");
	}
}
