import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "I")
	public static int anInt4443;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "Lclient!pa;")
	public static final Class254 aClass254_1 = new Class254();

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_45 = new Class70(44, 7);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3606(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static16.aClass134_1 = Static441.method6960(Static584.anInterface7_12, Static499.aCanvas9, Static398.aClass270_78, Static348.aClass1_Sub30_Sub1_1.anInt4869 * 2, 0);
			if (arg0 != null) {
				Static16.aClass134_1.ja(0);
				@Pc(155) Class334 local155 = Static358.method4885(Static412.aClass270_85, Static580.anInt9540);
				@Pc(164) Class64 local164 = Static16.aClass134_1.method6899(local155, Static601.method2079(Static463.aClass270_98, Static580.anInt9540));
				Static190.method2922();
				Static152.method2206(local164, true, local155, Static16.aClass134_1, arg0);
			}
		} else {
			@Pc(5) Class134 local5 = null;
			@Pc(24) Class334 local24;
			@Pc(33) Class64 local33;
			if (arg0 != null) {
				local5 = Static441.method6960(Static584.anInterface7_12, Static499.aCanvas9, Static398.aClass270_78, 0, 0);
				local5.ja(0);
				local24 = Static358.method4885(Static412.aClass270_85, Static580.anInt9540);
				local33 = local5.method6899(local24, Static601.method2079(Static463.aClass270_98, Static580.anInt9540));
				Static190.method2922();
				Static152.method2206(local33, true, local24, local5, arg0);
			}
			try {
				Static16.aClass134_1 = Static441.method6960(Static584.anInterface7_12, Static499.aCanvas9, Static398.aClass270_78, Static348.aClass1_Sub30_Sub1_1.anInt4869 * 2, arg1);
				if (arg0 != null) {
					local5.ja(0);
					local24 = Static358.method4885(Static412.aClass270_85, Static580.anInt9540);
					local33 = local5.method6899(local24, Static601.method2079(Static463.aClass270_98, Static580.anInt9540));
					Static190.method2922();
					Static152.method2206(local33, true, local24, local5, arg0);
				}
				if (Static16.aClass134_1.method6956()) {
					@Pc(87) boolean local87 = true;
					try {
						local87 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(97) Throwable local97) {
					}
					@Pc(103) Class1_Sub5 local103;
					if (local87) {
						local103 = Static16.aClass134_1.method6964(146800640);
					} else {
						local103 = Static16.aClass134_1.method6964(104857600);
					}
					Static16.aClass134_1.method6916(local103);
				}
			} catch (@Pc(114) Throwable local114) {
				Static16.aClass134_1 = Static441.method6960(Static584.anInterface7_12, Static499.aCanvas9, Static398.aClass270_78, 0, 0);
				arg1 = 0;
			}
			if (local5 != null) {
				try {
					local5.method6939();
				} catch (@Pc(131) Throwable local131) {
				}
			}
		}
		Static113.anInt2222 = arg1;
		Static222.method3419();
		Static16.aClass134_1.va(32);
		Static458.aClass113_6 = Static16.aClass134_1.method6924();
		Static250.aClass113_2 = Static16.aClass134_1.method6924();
		Static402.method5596();
		Static16.aClass134_1.method6942(!Static348.aClass1_Sub30_Sub1_1.aBoolean387);
		if (Static16.aClass134_1.method6908()) {
			Static157.method2278(Static348.aClass1_Sub30_Sub1_1.aBoolean390);
		}
		Static382.method5232(Static471.anInt8012 >> 3, Static71.anInt1410 >> 3, Static16.aClass134_1);
		Static475.method6481();
		Static208.aClass359Array1 = null;
		Static266.aBoolean354 = false;
		Static260.aBoolean351 = true;
	}
}
