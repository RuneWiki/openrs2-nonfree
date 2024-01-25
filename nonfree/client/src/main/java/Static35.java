import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bn", name = "G", descriptor = "I")
	public static int anInt1000;

	@OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
	public static int anInt997 = 0;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BB)C")
	public static char method718(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(40) char local40 = Static455.aCharArray9[local7 - 128];
			if (local40 == '\u0000') {
				local40 = '?';
			}
			local7 = local40;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BI)Z")
	public static boolean method719(@OriginalArg(1) int arg0) {
		@Pc(7) Class117_Sub1 local7 = Static132.method2050(arg0);
		if (local7 == null) {
			return false;
		} else if (Static227.anInt4227 == 3) {
			@Pc(37) String local37 = "";
			if (Static10.aClass182_1 != Static191.aClass182_6) {
				local37 = ":" + (local7.anInt7359 + 7000);
			}
			@Pc(53) String local53 = "";
			if (Static152.aString21 != null) {
				local53 = "/p=" + Static152.aString21;
			}
			@Pc(102) String local102 = "http://" + local7.aString65 + local37 + "/l=" + Static53.anInt1454 + "/a=" + Static17.anInt475 + local53 + "/j" + (Static364.aBoolean534 ? "1" : "0") + ",o" + (Static386.aBoolean556 ? "1" : "0") + ",a2";
			try {
				Static332.aClient1.getAppletContext().showDocument(new URL(local102), "_self");
				return true;
			} catch (@Pc(119) Exception local119) {
				return false;
			}
		} else {
			Static101.anInt6819 = local7.anInt7359;
			Static452.aString67 = local7.aString65;
			if (Static191.aClass182_6 != Static10.aClass182_1) {
				Static306.anInt5453 = Static101.anInt6819 + 40000;
				Static219.anInt4144 = Static101.anInt6819 + 50000;
				Static417.anInt6845 = Static306.anInt5453;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V")
	public static void method720() {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < Static40.anInt1089; local15++) {
			for (@Pc(18) int local18 = 0; local18 < Static44.anInt7276; local18++) {
				if (Static228.method3432(local15, local18, local13, true, Static263.aClass118ArrayArrayArray2)) {
					local13++;
				}
				if (local13 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!mq;ILclient!qa;)V")
	public static void method721(@OriginalArg(0) Class156 arg0, @OriginalArg(2) Class172 arg1) {
		@Pc(33) boolean local33 = Static314.aClass12_2.method326(arg0.anInt4876 | 0xFF000000, arg0.anInt4810, arg0.anInt4791, arg0.anInt4838, arg1, arg0.anInt4826, arg0.aBoolean419 ? Static379.aClass7_Sub2_Sub3_Sub2_2.aClass206_1 : null) == null;
		if (local33) {
			Static265.aClass243_31.method5198(new Class3_Sub11(arg0.anInt4826, arg0.anInt4838, arg0.anInt4791, arg0.anInt4876 | 0xFF000000, arg0.anInt4810, arg0.aBoolean419));
			Static386.method5010(arg0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method722(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static202.anInt3950; local9++) {
			if (arg0.equalsIgnoreCase(Static388.aStringArray45[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
