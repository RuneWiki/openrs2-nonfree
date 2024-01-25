import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "Lclient!io;")
	public static final Class148 aClass148_3 = new Class148(8, 0, 4, 1);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public static void method2095() {
		Static4.aClass220Array7 = null;
		Static171.method3012(-1, Static383.anInt6994, 0, 0, Static456.anInt7874, Static395.anInt7085, 0, 0);
		if (Static4.aClass220Array7 != null) {
			Static317.method5109(Static297.anInt7032, Static383.anInt6994, Static26.anInt530, 0, -1412584499, Static456.anInt7874, Static178.aClass220_8.anInt6607, 0, Static4.aClass220Array7);
			Static4.aClass220Array7 = null;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BJLjava/lang/String;Z)V")
	public static void method2097(@OriginalArg(1) long arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (arg2) {
			Static463.method6459();
			if (Static125.aString32.equals("")) {
				Static464.anInt7964 = 39;
				return;
			}
		}
		@Pc(19) Class5_Sub3 local19 = new Class5_Sub3(576);
		local19.method4192(10);
		local19.method4181((int) (Math.random() * 65535.0D));
		local19.method4203(arg0);
		local19.method4181(arg2 ? Static137.anInt1382 : Static433.anInt7630);
		local19.method4184((int) (Math.random() * 9.9999999E7D));
		local19.method4208(arg1);
		local19.method4184((int) (Math.random() * 9.9999999E7D));
		if (arg2) {
			local19.method4203(Static525.method7179(Static125.aString32));
			try {
				local19.method4203(Long.parseLong(Static380.aString68));
			} catch (@Pc(107) Exception local107) {
				Static464.anInt7964 = 39;
				return;
			}
		} else {
			local19.method4184((int) (Math.random() * 9.9999999E7D));
			local19.method4184((int) (Math.random() * 9.9999999E7D));
			local19.method4184((int) (Math.random() * 9.9999999E7D));
			local19.method4184((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4184((int) (Math.random() * 9.9999999E7D));
		local19.method4209(Static154.aBigInteger5, Static111.aBigInteger2);
		Static164.aClass5_Sub3_Sub1_2.anInt4960 = 0;
		Static164.aClass5_Sub3_Sub1_2.method4192(arg2 ? Static357.aClass243_12.anInt7052 : Static357.aClass243_9.anInt7052);
		Static164.aClass5_Sub3_Sub1_2.method4181(local19.anInt4960 + 28);
		Static164.aClass5_Sub3_Sub1_2.method4181(608);
		Static164.aClass5_Sub3_Sub1_2.method4192(Static194.anInt3737);
		Static164.aClass5_Sub3_Sub1_2.method4192(Static525.aClass155_4.anInt4200);
		Static255.method4327(Static164.aClass5_Sub3_Sub1_2);
		Static164.aClass5_Sub3_Sub1_2.method4207(local19.anInt4960, local19.aByteArray66);
		Static464.anInt7964 = -3;
		Static353.anInt6598 = 0;
		Static83.anInt1578 = 1;
		Static296.anInt5925 = 0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V")
	public static void method2098() {
		for (@Pc(10) Class5_Sub2_Sub8 local10 = (Class5_Sub2_Sub8) Static98.aClass99_17.method2526(); local10 != null; local10 = (Class5_Sub2_Sub8) Static98.aClass99_17.method2519()) {
			@Pc(15) Class15_Sub2_Sub5 local15 = local10.aClass15_Sub2_Sub5_1;
			if (local15.aBoolean532) {
				local10.method7425();
				local15.method6081();
			} else if (local15.anInt7487 <= Static481.anInt8318) {
				local15.method6079(Static168.anInt7198);
				if (local15.aBoolean532) {
					local10.method7425();
				} else {
					Static68.method1297(local15, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BII)V")
	public static void method2099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static415.method5995(Static515.aClass236_29);
		Static164.aClass5_Sub3_Sub1_2.method4221(arg1);
		Static164.aClass5_Sub3_Sub1_2.method4229(arg0);
	}
}
