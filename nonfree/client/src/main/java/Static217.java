import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "[I")
	public static final int[] anIntArray787 = new int[200];

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "[I")
	public static final int[] anIntArray788 = new int[32];

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method7159(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static151.anInt2788 != 3) {
			Static52.aClass4_1 = new Class4();
			Static52.aClass4_1.aString2 = arg1;
			Static52.aClass4_1.anInt111 = arg0;
			if (Static71.aClass21_1 != Static145.aClass21_4) {
				Static52.aClass4_1.anInt113 = Static52.aClass4_1.anInt111 + 40000;
				Static52.aClass4_1.anInt114 = Static52.aClass4_1.anInt111 + 50000;
			}
			if (arg0 < Static234.aClass185_Sub1Array1.length && Static234.aClass185_Sub1Array1[arg0] != null) {
				Static192.anInt3400 = Static234.aClass185_Sub1Array1[arg0].anInt7761;
			}
			return true;
		}
		@Pc(52) String local52 = "";
		if (Static71.aClass21_1 != Static145.aClass21_4) {
			local52 = ":" + (arg0 + 7000);
		}
		@Pc(67) String local67 = "";
		if (Static285.aString48 != null) {
			local67 = "/p=" + Static285.aString48;
		}
		@Pc(115) String local115 = "http://" + arg1 + local52 + "/l=" + Static179.anInt3168 + "/a=" + Static543.anInt9158 + local67 + "/j" + (Static488.aBoolean570 ? "1" : "0") + ",o" + (Static474.aBoolean564 ? "1" : "0") + ",a2";
		try {
			Static230.aClient2.getAppletContext().showDocument(new URL(local115), "_self");
			return true;
		} catch (@Pc(125) Exception local125) {
			return false;
		}
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIFZI)[I")
	public static int[] method7161(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class1_Sub3_Sub35 local10 = new Class1_Sub3_Sub35();
		local10.anInt7689 = (int) (arg0 * 4096.0F);
		local10.anInt7691 = 4;
		local10.aBoolean552 = true;
		local10.anInt7700 = 8;
		local10.anInt7693 = 8;
		local10.anInt7686 = 35;
		local10.method7126();
		Static190.method2953(2048, 1);
		local10.method6401(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZLclient!of;ZZ)V")
	public static void method7162(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub35 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt6103;
		@Pc(12) int local12 = (int) arg1.aLong392;
		arg1.method7525();
		if (arg2) {
			Static210.method3584(local8);
		}
		Static304.method4805(local8);
		@Pc(27) Class156 local27 = Static182.method2888(local12);
		if (local27 != null) {
			Static473.method6593(local27);
		}
		Static309.method4868();
		if (!arg0 && Static170.anInt3050 != -1) {
			Static168.method4650(1, Static170.anInt3050);
		}
		@Pc(48) Class274 local48 = new Class274(Static468.aClass17_36);
		for (@Pc(53) Class1_Sub35 local53 = (Class1_Sub35) local48.method6418(); local53 != null; local53 = (Class1_Sub35) local48.method6421()) {
			if (!local53.method7527()) {
				local53 = (Class1_Sub35) local48.method6418();
				if (local53 == null) {
					return;
				}
			}
			if (local53.anInt6102 == 3) {
				@Pc(77) int local77 = (int) local53.aLong392;
				if (local77 >>> 16 == local8) {
					method7162(arg0, local53, true);
				}
			}
		}
	}
}
