import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!sha", name = "j", descriptor = "[Lclient!rba;")
	public static Class16_Sub1[] aClass16_Sub1Array5;

	@OriginalMember(owner = "client!sha", name = "e", descriptor = "Lclient!tba;")
	public static final Class323 aClass323_33 = new Class323(8);

	@OriginalMember(owner = "client!sha", name = "f", descriptor = "[I")
	public static final int[] anIntArray626 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!sha", name = "k", descriptor = "[Lclient!ic;")
	public static final Class2_Sub7_Sub6[] aClass2_Sub7_Sub6Array8 = new Class2_Sub7_Sub6[14];

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
	public static void method7272() {
		for (@Pc(4) Class2_Sub7_Sub20 local4 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6680(); local4 != null; local4 = (Class2_Sub7_Sub20) Static515.aClass290_7.method6673()) {
			if (local4.anInt9985 > 1) {
				local4.anInt9985 = 0;
				Static585.aClass69_64.method1917(((Class2_Sub7_Sub21) local4.aClass290_13.aClass2_Sub7_48.aClass2_Sub7_66).aLong261, local4);
				local4.aClass290_13.method6675();
			}
		}
		Static633.anInt10265 = 0;
		Static471.anInt7593 = 0;
		Static177.aClass114_19.method2768();
		Static5.aClass323_2.method7485();
		Static515.aClass290_7.method6675();
		Static113.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(ZII)Z")
	public static boolean method7273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
	public static void method7274() {
		if (Static176.anInt3533 < 0) {
			return;
		}
		@Pc(8) long local8 = Static48.method1203();
		Static176.anInt3533 = (int) ((long) Static176.anInt3533 + Static308.aLong140 - local8);
		if (Static176.anInt3533 <= 0) {
			Static39.aFloat9 = Static64.aClass299_1.aFloat148;
			Static578.anInt9443 = Static64.aClass299_1.anInt7876;
			Static413.aFloat123 = Static64.aClass299_1.aFloat146;
			Static364.aFloat117 = Static64.aClass299_1.aFloat150;
			Static532.anInt8558 = Static64.aClass299_1.anInt7881;
			Static554.aClass49_4 = Static64.aClass299_1.aClass49_2;
			Static346.aFloat112 = Static64.aClass299_1.aFloat145;
			Static176.anInt3533 = -1;
			Static19.aFloat1 = Static64.aClass299_1.aFloat147;
			Static185.anInt3702 = Static64.aClass299_1.anInt7885;
			Static63.aFloat33 = Static64.aClass299_1.aFloat149;
		} else {
			@Pc(58) int local58 = (Static176.anInt3533 << 8) / Static413.anInt6939;
			@Pc(63) int local63 = 255 - local58;
			@Pc(68) float local68 = (float) local58 / 255.0F;
			@Pc(72) float local72 = 1.0F - local68;
			Static578.anInt9443 = ((Static64.aClass299_1.anInt7876 & 0xFF00FF) * local63 + local58 * (Static272.anInt5077 & 0xFF00FF) & 0xFF00FF00) + ((Static272.anInt5077 & 0xFF00) * local58 + ((Static64.aClass299_1.anInt7876 & 0xFF00) * local63) & 0xFF0000) >>> 8;
			Static364.aFloat117 = (Static64.aClass299_1.aFloat150 - Static197.aFloat80) * local72 + Static197.aFloat80;
			Static39.aFloat9 = local72 * (Static64.aClass299_1.aFloat148 - Static31.aFloat7) + Static31.aFloat7;
			Static532.anInt8558 = (local58 * (Static137.anInt2917 & 0xFF00FF) + (Static64.aClass299_1.anInt7881 & 0xFF00FF) * local63 & 0xFF00FF00) + (local58 * (Static137.anInt2917 & 0xFF00) + ((Static64.aClass299_1.anInt7881 & 0xFF00) * local63) & 0xFF0000) >>> 8;
			Static63.aFloat33 = Static286.aFloat109 + (Static64.aClass299_1.aFloat149 - Static286.aFloat109) * local72;
			Static19.aFloat1 = (Static64.aClass299_1.aFloat147 - Static85.aFloat53) * local72 + Static85.aFloat53;
			Static185.anInt3702 = Static245.anInt4754 * local58 + local63 * Static64.aClass299_1.anInt7885 >> 8;
			Static346.aFloat112 = (Static64.aClass299_1.aFloat145 - Static645.aFloat211) * local72 + Static645.aFloat211;
			Static413.aFloat123 = (Static64.aClass299_1.aFloat146 - Static32.aFloat8) * local72 + Static32.aFloat8;
			if (Static64.aClass299_1.aClass49_2 != Static505.aClass49_3) {
				Static554.aClass49_4 = Static28.aClass13_87.method8123(Static505.aClass49_3, Static64.aClass299_1.aClass49_2, local72, Static554.aClass49_4);
			}
		}
		Static308.aLong140 = local8;
	}
}
