import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!je", name = "k", descriptor = "[I")
	public static int[] anIntArray146;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "Lclient!re;")
	public static Class4_Sub13 aClass4_Sub13_2;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "Lclient!he;")
	public static Class30 aClass30_6;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!mf;")
	public static Class48 aClass48_35 = new Class48(50);

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_538 = Static121.method2047("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!je", name = "l", descriptor = "I")
	public static int anInt1425 = -1;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "Lclient!qc;")
	public static Class60 aClass60_539 = Static121.method2047("Okay");

	@OriginalMember(owner = "client!je", name = "v", descriptor = "Lclient!qc;")
	public static Class60 aClass60_540 = Static121.method2047("Hierhin gehen");

	@OriginalMember(owner = "client!je", name = "y", descriptor = "I")
	public static volatile int anInt1432 = 0;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "Lclient!kf;")
	public static Class4_Sub13_Sub1 aClass4_Sub13_Sub1_1 = new Class4_Sub13_Sub1(5000);

	@OriginalMember(owner = "client!je", name = "B", descriptor = "Lclient!mf;")
	public static Class48 aClass48_36 = new Class48(30);

	@OriginalMember(owner = "client!je", name = "C", descriptor = "Lclient!qc;")
	public static Class60 aClass60_541 = Static121.method2047("(U");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII)I")
	public static int method1032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) int local8 = arg0 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(19) int local19 = arg5;
			arg5 = arg4;
			arg4 = local19;
		}
		if (local8 == 0) {
			return arg1;
		} else if (local8 == 1) {
			return 7 + 1 - arg3 - arg5;
		} else if (local8 == 2) {
			return 1 + 7 - arg4 - arg1;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(ILclient!re;)Lclient!qc;")
	public static Class60 method1039(@OriginalArg(1) Class4_Sub13 arg0) {
		return Static3.method9(arg0);
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
	public static void method1042() {
		aClass4_Sub13_Sub1_1 = null;
		aClass60_538 = null;
		aClass48_35 = null;
		aClass60_540 = null;
		anIntArray146 = null;
		aClass48_36 = null;
		aClass60_541 = null;
		aClass4_Sub13_2 = null;
		aClass30_6 = null;
		aClass60_539 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method1043(@OriginalArg(0) Class60 arg0) {
		if (Static24.anInt688 >= 2) {
			if (arg0.method1661(Static71.aClass60_701)) {
				System.gc();
			}
			if (arg0.method1661(Static61.aClass60_586)) {
				Static58.method1050();
			}
			if (arg0.method1661(Static71.aClass60_699)) {
				Static112.aBoolean117 = true;
			}
			if (arg0.method1661(Static5.aClass60_33)) {
				Static112.aBoolean117 = false;
			}
			if (arg0.method1661(Static89.aClass60_856)) {
				for (@Pc(48) int local48 = 0; local48 < 4; local48++) {
					for (@Pc(52) int local52 = 1; local52 < 103; local52++) {
						for (@Pc(56) int local56 = 1; local56 < 103; local56++) {
							Static119.aClass45Array1[local48].anIntArrayArray15[local52][local56] = 0;
						}
					}
				}
			}
			if (arg0.method1661(Static37.aClass60_390) && Static105.anInt2515 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1646(Static81.aClass60_794)) {
				Static31.anInt847 = arg0.method1662(12).method1666().method1639();
				Static73.method1386(Static125.method2072(new Class60[] { Static81.aClass60_800, Static120.method1450(Static31.anInt847) }), 0, null);
			}
			if (arg0.method1661(Static45.aClass60_457)) {
				Static128.aBoolean113 = true;
			}
		}
		aClass4_Sub13_Sub1_1.method1265(208);
		aClass4_Sub13_Sub1_1.method1209(arg0.method1644() - 1);
		aClass4_Sub13_Sub1_1.method1225(arg0.method1662(2));
	}
}
