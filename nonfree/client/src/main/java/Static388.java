import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nv", name = "Q", descriptor = "Lclient!wp;")
	public static Class376 aClass376_28;

	@OriginalMember(owner = "client!nv", name = "R", descriptor = "Lclient!ow;")
	public static Class253 aClass253_1;

	@OriginalMember(owner = "client!nv", name = "O", descriptor = "Lclient!us;")
	public static final Class344 aClass344_86 = new Class344(33, 11);

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(III)Z")
	public static boolean method6122(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BLclient!tn;)Ljava/lang/String;")
	public static String method6124(@OriginalArg(1) Class3_Sub15 arg0) {
		return Static350.method5748(arg0);
	}

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
	public static void method6125() throws IOException {
		if (Static412.aClass51_25 == null || Static266.anInt8465 <= 0) {
			return;
		}
		Static231.aClass3_Sub15_4.anInt10282 = 0;
		while (true) {
			@Pc(18) Class3_Sub26 local18 = (Class3_Sub26) Static573.aClass276_59.method6907();
			if (local18 == null || Static231.aClass3_Sub15_4.aByteArray106.length - Static231.aClass3_Sub15_4.anInt10282 < local18.anInt5180) {
				Static412.aClass51_25.method3510(Static231.aClass3_Sub15_4.aByteArray106, Static231.aClass3_Sub15_4.anInt10282);
				Static559.anInt9555 = 0;
				Static214.anInt7032 += Static231.aClass3_Sub15_4.anInt10282;
				break;
			}
			Static231.aClass3_Sub15_4.method8430(local18.anInt5180, 0, local18.aClass3_Sub15_Sub1_3.aByteArray106);
			Static266.anInt8465 -= local18.anInt5180;
			local18.method8671();
			local18.aClass3_Sub15_Sub1_3.method8455();
			local18.method4377();
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)I")
	public static int method6126(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
