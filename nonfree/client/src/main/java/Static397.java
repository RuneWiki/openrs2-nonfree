import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
	public static int anInt7340;

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!qj", name = "s", descriptor = "Z")
	public static boolean aBoolean512 = false;

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
	public static void method6050() {
		if (Static392.aBoolean492) {
			Static483.aClass119_29 = null;
			Static392.aBoolean492 = false;
			Static435.aClass119_25 = null;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLjava/lang/String;ZJ)V")
	public static void method6051(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) long arg2) {
		if (arg0) {
			Static441.method6645();
			if (Static369.aString49.equals("")) {
				Static417.anInt7805 = 39;
				return;
			}
		}
		@Pc(19) Class3_Sub27 local19 = new Class3_Sub27(576);
		local19.method7576(10);
		local19.method7600((int) (Math.random() * 65535.0D), 30364);
		local19.method7577(arg2);
		local19.method7600(arg0 ? Static141.anInt2895 : Static142.anInt2899, 30364);
		local19.method7594((int) (Math.random() * 9.9999999E7D));
		local19.method7608(arg1);
		local19.method7594((int) (Math.random() * 9.9999999E7D));
		if (arg0) {
			local19.method7577(Static402.method7158(Static369.aString49));
			try {
				local19.method7577(Long.parseLong(Static446.aString64));
			} catch (@Pc(105) Exception local105) {
				Static417.anInt7805 = 39;
				return;
			}
		} else {
			local19.method7594((int) (Math.random() * 9.9999999E7D));
			local19.method7594((int) (Math.random() * 9.9999999E7D));
			local19.method7594((int) (Math.random() * 9.9999999E7D));
			local19.method7594((int) (Math.random() * 9.9999999E7D));
		}
		local19.method7594((int) (Math.random() * 9.9999999E7D));
		local19.method7570(Static2.aBigInteger1, Static403.aBigInteger6);
		Static515.aClass3_Sub27_Sub1_2.anInt9191 = 0;
		Static515.aClass3_Sub27_Sub1_2.method7576(arg0 ? Static538.aClass42_12.anInt1132 : Static538.aClass42_9.anInt1132);
		Static515.aClass3_Sub27_Sub1_2.method7600(local19.anInt9191 + 28, 30364);
		Static515.aClass3_Sub27_Sub1_2.method7600(611, 30364);
		Static515.aClass3_Sub27_Sub1_2.method7576(Static193.anInt7803);
		Static515.aClass3_Sub27_Sub1_2.method7576(Static222.aClass44_2.anInt1187);
		Static328.method5242(Static515.aClass3_Sub27_Sub1_2);
		Static515.aClass3_Sub27_Sub1_2.method7569(local19.anInt9191, local19.aByteArray114);
		Static417.anInt7805 = -3;
		Static138.anInt2797 = 0;
		Static490.anInt8722 = 0;
		Static496.anInt8742 = 1;
	}
}
