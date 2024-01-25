import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	public static int anInt3266;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	public static int anInt3273;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public static int anInt3265 = 0;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Z")
	public static boolean aBoolean290 = false;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_83 = new Class211(9, 6);

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_84 = new Class211(0, -2);

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "Lclient!sh;")
	public static Class211 aClass211_85 = null;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ui;I)I")
	public static int method2665(@OriginalArg(0) Class230 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method4966(Static263.anInt4585)) {
			local5++;
		}
		if (arg0.method4966(Static16.anInt280)) {
			local5++;
		}
		if (arg0.method4966(Static308.anInt5220)) {
			local5++;
		}
		if (arg0.method4966(Static257.anInt4441)) {
			local5++;
		}
		if (arg0.method4966(Static28.anInt625)) {
			local5++;
		}
		if (arg0.method4966(Static275.anInt4799)) {
			local5++;
		}
		if (arg0.method4966(Static46.anInt909)) {
			local5++;
		}
		if (arg0.method4966(Static291.anInt5038)) {
			local5++;
		}
		if (arg0.method4966(Static268.anInt4680)) {
			local5++;
		}
		if (arg0.method4966(Static337.anInt5594)) {
			local5++;
		}
		if (arg0.method4966(Static202.anInt3547)) {
			local5++;
		}
		if (arg0.method4966(Static82.anInt1521)) {
			local5++;
		}
		if (arg0.method4966(Static196.anInt3486)) {
			local5++;
		}
		if (arg0.method4966(Static279.anInt4857)) {
			local5++;
		}
		if (arg0.method4966(Static97.anInt1744)) {
			local5++;
		}
		if (arg0.method4966(Static216.anInt3711)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method2667() {
		Static259.aClass158_6.method3162();
		Static140.aClass214_28.method4733();
		Static183.aClass146_2.method2953();
		Static54.aClass153_1.method3079();
		Static168.aClass196_2.method4451();
		Static263.aClass102_2.method2178();
		Static25.aClass67_1.method1228();
		Static10.aClass246_1.method5427();
		Static371.aClass147_5.method2955();
		Static158.aClass229_3.method4879();
		Static160.aClass163_1.method3325();
		Static309.aClass184_3.method4221();
		Static16.aClass249_1.method5524();
		Static27.aClass232_1.method5051();
		Static232.aClass47_2.method892();
		Static274.aClass63_1.method1192();
		Static301.aClass31_1.method521();
		Static68.aClass252_1.method5574();
		Static175.aClass52_1.method973();
		Static72.aClass37_1.method631();
		Static150.method2270();
		Static293.method4442();
		Static193.method2755();
		Static52.method853();
		Static17.aClass227_2.method4858();
		Static309.aClass227_42.method4858();
		Static297.aClass227_41.method4858();
		Static298.aClass227_18.method4858();
		Static387.aClass227_54.method4858();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lclient!ja;")
	public static Class114 method2671() {
		try {
			return (Class114) Class.forName("Class114_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method2673() {
		@Pc(1) Class227 local1 = Static329.aClass227_30;
		synchronized (Static329.aClass227_30) {
			Static329.aClass227_30.method4871();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lclient!mp;")
	public static Class25_Sub5 method2676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class132 local7 = Static25.aClass132ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass25_Sub5_1;
	}
}
