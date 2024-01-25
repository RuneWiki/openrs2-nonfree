import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!oia", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString80;

	@OriginalMember(owner = "client!oia", name = "k", descriptor = "[I")
	public static final int[] anIntArray456 = new int[2];

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(ZB)V")
	public static void method6470(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static307.anInt5465 != -1) {
				Static248.method4014(Static307.anInt5465);
			}
			for (@Pc(18) Class3_Sub29 local18 = (Class3_Sub29) Static356.aClass280_29.method7110(); local18 != null; local18 = (Class3_Sub29) Static356.aClass280_29.method7108()) {
				if (!local18.method8770()) {
					local18 = (Class3_Sub29) Static356.aClass280_29.method7110();
					if (local18 == null) {
						break;
					}
				}
				Static54.method1546(true, false, local18);
			}
			Static307.anInt5465 = -1;
			Static356.aClass280_29 = new Class280(8);
			Static619.method8587();
			Static307.anInt5465 = Static96.anInt2226;
			Static422.method6616(false);
			Static40.method1343();
			Static304.method4838(Static307.anInt5465);
		}
		Static48.aBoolean92 = true;
	}

	@OriginalMember(owner = "client!oia", name = "b", descriptor = "(B)V")
	public static void method6471() {
		if (!Static613.aBoolean716) {
			Static395.aBoolean521 = true;
			Static613.aBoolean716 = true;
			Static83.aFloat69 += (-Static83.aFloat69 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method6472(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static205.aClass138_2.aBoolean276) {
			Static4.aClass363_1 = new Class363();
			Static4.aClass363_1.anInt9891 = arg0;
			Static4.aClass363_1.aString109 = arg1;
			if (Static42.aClass135_2 != Static2.aClass135_1) {
				Static4.aClass363_1.anInt9890 = Static4.aClass363_1.anInt9891 + 50000;
				Static4.aClass363_1.anInt9884 = Static4.aClass363_1.anInt9891 + 40000;
			}
			if (arg0 < Static528.aClass96_Sub1Array2.length && Static528.aClass96_Sub1Array2[arg0] != null) {
				Static331.anInt6182 = Static528.aClass96_Sub1Array2[arg0].anInt3293;
			}
			return true;
		}
		@Pc(49) String local49 = "";
		if (Static2.aClass135_1 != Static42.aClass135_2) {
			local49 = ":" + (arg0 + 7000);
		}
		@Pc(64) String local64 = "";
		if (Static330.aString66 != null) {
			local64 = "/p=" + Static330.aString66;
		}
		@Pc(117) String local117 = "http://" + arg1 + local49 + "/l=" + Static325.anInt6083 + "/a=" + Static58.anInt1583 + local64 + "/j" + (Static515.aBoolean636 ? "1" : "0") + ",o" + (Static458.aBoolean561 ? "1" : "0") + ",a2";
		try {
			Static116.aClient1.getAppletContext().showDocument(new URL(local117), "_self");
			return true;
		} catch (@Pc(127) Exception local127) {
			return false;
		}
	}
}
