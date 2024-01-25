import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_98 = new Class208(75, -1);

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6550(@OriginalArg(0) String arg0) {
		if (!Static563.aBoolean697 || (Static420.anInt7401 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static75.anInt1461;
		@Pc(18) int[] local18 = Static167.anIntArray145;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(33) Class11_Sub1_Sub1_Sub3_Sub1 local33 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local18[local20]];
			if (local33.aString35 != null && local33.aString35.equalsIgnoreCase(arg0) && (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == local33 && (Static420.anInt7401 & 0x10) != 0 || local33 != null && (Static420.anInt7401 & 0x8) != 0)) {
				@Pc(68) Class1_Sub9 local68 = Static123.method2194(Static469.aClass235_2, Static307.aClass208_91);
				local68.aClass1_Sub3_Sub1_1.method7937(Static253.anInt4623);
				local68.aClass1_Sub3_Sub1_1.method7923(local18[local20]);
				local68.aClass1_Sub3_Sub1_1.method7917(0);
				local68.aClass1_Sub3_Sub1_1.method7956(Static594.anInt9808);
				local68.aClass1_Sub3_Sub1_1.method7923(Static299.anInt5617);
				Static42.method746(local68);
				Static590.method7873(local33.anIntArray454[0], true, 0, -2, local33.anIntArray455[0], 0, local33.method6058(), local33.method6058());
				local14 = true;
				break;
			}
		}
		if (!local14) {
			Static193.method3073(Static375.aClass253_25.method5453(Static161.anInt3095) + arg0);
		}
		if (Static563.aBoolean697) {
			Static193.method3074();
		}
	}

	@OriginalMember(owner = "client!sea", name = "c", descriptor = "(B)V")
	public static void method6560() {
		if (Static517.anInt8881 == 6) {
			Static517.anInt8881 = 7;
		}
	}
}
