import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
	public static int anInt1163;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	public static int anInt1169;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
	public static int anInt1170;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
	public static int anInt1162 = 0;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_22 = new Class117("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString10 = null;

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_23 = new Class117("wave2:", "welle2:", "ondulation2:", "onda2:");

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(II)V")
	public static void method928(@OriginalArg(0) int arg0) {
		if (!Static79.aBoolean341) {
			arg0 = -1;
		}
		if (Static340.anInt5687 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(18) Class131 local18 = Static206.method3694(arg0);
			@Pc(22) Class125 local22 = local18.method3522();
			if (local22 == null) {
				arg0 = -1;
			} else {
				Static77.aClass118_7.method2697(Static34.aCanvas1, local22.method2858(), local22.method2866(), new Point(local18.anInt3954, local18.anInt3952), local22.method2860());
				Static340.anInt5687 = arg0;
			}
		}
		if (arg0 == -1 && Static340.anInt5687 != -1) {
			Static77.aClass118_7.method2697(Static34.aCanvas1, null, -1, new Point(), -1);
			Static340.anInt5687 = -1;
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)V")
	public static void method932() {
		while (true) {
			if (Static246.aClass11_Sub25_Sub1_3.method2466(Static315.anInt6163) >= 11) {
				@Pc(17) int local17 = Static246.aClass11_Sub25_Sub1_3.method2462(11);
				if (local17 != 2047) {
					@Pc(24) boolean local24 = false;
					if (Static105.aClass67_Sub3_Sub3_Sub2Array1[local17] == null) {
						Static105.aClass67_Sub3_Sub3_Sub2Array1[local17] = new Class67_Sub3_Sub3_Sub2();
						Static105.aClass67_Sub3_Sub3_Sub2Array1[local17].anInt5038 = local17;
						if (Static39.aClass11_Sub25Array1[local17] != null) {
							Static105.aClass67_Sub3_Sub3_Sub2Array1[local17].method4390(Static39.aClass11_Sub25Array1[local17]);
						}
						local24 = true;
					}
					Static87.anIntArray104[Static331.anInt6366++] = local17;
					@Pc(65) Class67_Sub3_Sub3_Sub2 local65 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local17];
					local65.anInt5010 = Static293.anInt5807;
					@Pc(73) int local73 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
					@Pc(78) int local78 = Static246.aClass11_Sub25_Sub1_3.method2462(5);
					if (local78 > 15) {
						local78 -= 32;
					}
					@Pc(89) int local89 = Static246.aClass11_Sub25_Sub1_3.method2462(5);
					if (local89 > 15) {
						local89 -= 32;
					}
					@Pc(102) int local102 = Static153.anIntArray194[Static246.aClass11_Sub25_Sub1_3.method2462(3)];
					@Pc(107) int local107 = Static246.aClass11_Sub25_Sub1_3.method2462(1);
					if (local107 == 1) {
						Static309.anIntArray498[Static90.anInt4650++] = local17;
					}
					if (local24) {
						local65.method4371(local102);
					}
					local65.method4384(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] + local89, local73 == 1, local78 + Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static322.anInt6250);
					continue;
				}
			}
			Static246.aClass11_Sub25_Sub1_3.method2461();
			return;
		}
	}
}
