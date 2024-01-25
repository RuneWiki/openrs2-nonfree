import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	public static int anInt3315;

	@OriginalMember(owner = "client!er", name = "w", descriptor = "I")
	public static int anInt3322;

	@OriginalMember(owner = "client!er", name = "u", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_47 = new Class73(66, 1);

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ef;I)I")
	public static int method2766(@OriginalArg(0) Class80 arg0) {
		if (Static522.aClass80_4 == arg0) {
			return 5890;
		} else if (Static512.aClass80_3 == arg0) {
			return 34167;
		} else if (Static115.aClass80_1 == arg0) {
			return 34168;
		} else if (arg0 == Static347.aClass80_2) {
			return 34166;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public static void method2768() {
		if (Static333.anInt6626 == 9) {
			Static119.method2558(5);
		} else if (Static333.anInt6626 == 5 || Static333.anInt6626 == 6) {
			Static119.method2558(3);
		} else if (Static333.anInt6626 == 12) {
			Static119.method2558(3);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method2769(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static496.aClass104_4.aBoolean290) {
			Static184.aClass358_1 = new Class358();
			Static184.aClass358_1.aString107 = arg1;
			Static184.aClass358_1.anInt10266 = arg0;
			if (Static86.aClass212_19 != Static630.aClass212_18) {
				Static184.aClass358_1.anInt10268 = Static184.aClass358_1.anInt10266 + 50000;
				Static184.aClass358_1.anInt10271 = Static184.aClass358_1.anInt10266 + 40000;
			}
			if (Static56.aClass67_Sub1Array1.length > arg0 && Static56.aClass67_Sub1Array1[arg0] != null) {
				Static552.anInt9484 = Static56.aClass67_Sub1Array1[arg0].anInt5764;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static630.aClass212_18 != Static86.aClass212_19) {
			local48 = ":" + (arg0 + 7000);
		}
		@Pc(63) String local63 = "";
		if (Static162.aString39 != null) {
			local63 = "/p=" + Static162.aString39;
		}
		@Pc(111) String local111 = "http://" + arg1 + local48 + "/l=" + Static638.anInt10709 + "/a=" + Static234.anInt5227 + local63 + "/j" + (Static296.aBoolean473 ? "1" : "0") + ",o" + (Static257.aBoolean439 ? "1" : "0") + ",a2";
		try {
			Static545.aClient1.getAppletContext().showDocument(new URL(local111), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}
}
