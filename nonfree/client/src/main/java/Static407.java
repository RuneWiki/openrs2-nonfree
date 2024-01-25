import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "Lclient!za;")
	public static Class200 aClass200_9;

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "Lclient!be;")
	public static Class20 aClass20_2;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
	public static int anInt6817 = -1;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
	public static int anInt6821 = 1;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	private static void method5392(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static226.anInt3761 = 1;
		Static93.anInt1623 = -1;
		Static157.method2214(arg1, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
	public static void method5394(@OriginalArg(0) int arg0) {
		if (arg0 == Static376.anInt6324) {
			return;
		}
		if (Static376.anInt6324 == 0) {
			Static255.method3304();
		}
		if (arg0 == 12) {
			Static253.method3242(Static390.aString67, Static342.aString60, Static93.anInt1623);
		}
		if (arg0 != 12 && Static2.aClass99_10 != null) {
			Static2.aClass99_10.method4963();
			Static2.aClass99_10 = null;
		}
		if (arg0 == 2) {
			Static293.method3665(Static433.anInt7212 != Static199.anInt3319);
		}
		if (arg0 == 6) {
			Static281.method5921(Static199.anInt3319 != Static121.anInt2155);
		}
		if (arg0 == 4) {
			method5392(Static390.aString67, Static342.aString60);
		} else if (arg0 == 5) {
			Static253.method3242(Static390.aString67, Static342.aString60, Static93.anInt1623);
		} else if (arg0 == 8) {
			Static253.method3242(Static390.aString67, Static342.aString60, Static93.anInt1623);
		} else if (arg0 == 11) {
			method5392(Static390.aString67, Static342.aString60);
		}
		if (Static175.method1913(Static376.anInt6324)) {
			Static322.aClass243_181.anInt6915 = 2;
			Static373.aClass243_217.anInt6915 = 2;
			Static136.aClass243_256.anInt6915 = 2;
			Static415.aClass243_237.anInt6915 = 2;
			Static125.aClass243_70.anInt6915 = 2;
			Static204.aClass243_115.anInt6915 = 2;
			Static5.aClass243_4.anInt6915 = 2;
		}
		if (Static175.method1913(arg0)) {
			Static168.anInt4861 = 0;
			Static273.anInt4302 = 1;
			Static198.anInt3281 = 0;
			Static192.anInt3195 = 0;
			Static323.anInt5039 = 1;
			Static182.method2493(true);
			Static322.aClass243_181.anInt6915 = 1;
			Static373.aClass243_217.anInt6915 = 1;
			Static136.aClass243_256.anInt6915 = 1;
			Static415.aClass243_237.anInt6915 = 1;
			Static125.aClass243_70.anInt6915 = 1;
			Static204.aClass243_115.anInt6915 = 1;
			Static5.aClass243_4.anInt6915 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static462.method6055();
		}
		if (arg0 == 1) {
			Static89.method1305(aClass200_9, Static344.aClass243_196);
		} else {
			Static245.method3169();
		}
		@Pc(220) boolean local220 = arg0 == 1 || Static112.method1554(arg0) || Static67.method1032(arg0);
		@Pc(239) boolean local239 = Static376.anInt6324 == 1 || Static112.method1554(Static376.anInt6324) || Static67.method1032(Static376.anInt6324);
		if (local220 != local239) {
			if (local220) {
				Static172.anInt3753 = Static75.anInt1373;
				if (Static216.aClass1_Sub1_1.anInt4509 == 0) {
					Static125.method1761();
				} else {
					Static117.method5579(Static216.aClass1_Sub1_1.anInt4509, Static75.anInt1373, Static451.aClass243_252);
				}
				Static247.aClass87_2.method1862(false);
			} else {
				Static125.method1761();
				Static247.aClass87_2.method1862(true);
			}
		}
		if (Static175.method1913(arg0) || arg0 == 12) {
			aClass200_9.method5829();
		}
		Static376.anInt6324 = arg0;
	}
}
