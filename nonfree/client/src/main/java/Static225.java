import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "[I")
	public static int[] anIntArray250;

	@OriginalMember(owner = "client!ia", name = "F", descriptor = "J")
	public static long aLong114;

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
	public static int anInt4563 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method3899(@OriginalArg(1) Class82 arg0) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = 0;
		if (Static80.aBoolean118) {
			local12 = Static211.method3297();
			local14 = Static551.method7856();
		}
		Static10.method194(arg0, local12 + Static491.anInt8355, Static388.anInt6963 + local14, Static355.anInt10008, Static415.anInt7312);
		Static374.aClass63_9.method7751(Static491.anInt8355 + local12 + 3, -1, Static369.aClass235_27.method5893(Static455.anInt7738), -10660793, Static388.anInt6963 + local14 + 14);
		@Pc(64) int local64 = local12 + Static281.aClass49_1.method2426();
		@Pc(70) int local70 = local14 + Static281.aClass49_1.method2429();
		@Pc(74) int local74;
		@Pc(92) int local92;
		if (Static515.aBoolean645) {
			local74 = 0;
			for (@Pc(79) Class3_Sub7_Sub13 local79 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8414(); local79 != null; local79 = (Class3_Sub7_Sub13) Static561.aClass363_53.method8415()) {
				local92 = local74 * 16 + Static388.anInt6963 + local14 + 31;
				local74++;
				if (local79.anInt4660 == 1) {
					Static619.method8433(local12 + Static491.anInt8355, (Class3_Sub7_Sub19) local79.aClass363_21.aClass3_Sub7_66.aClass3_Sub7_63, Static355.anInt10008, -256, -1, local92, Static415.anInt7312, Static388.anInt6963 + local14, local70, local64, arg0);
				} else {
					Static280.method4571(local79, Static415.anInt7312, Static355.anInt10008, Static388.anInt6963 + local14, local12 + Static491.anInt8355, local70, local64, -1, arg0, local92, -256);
				}
			}
			if (Static254.aClass3_Sub7_Sub13_2 != null) {
				Static10.method194(arg0, Static641.anInt10142, Static97.anInt1966, Static231.anInt4645, Static386.anInt8229);
				Static374.aClass63_9.method7751(Static641.anInt10142 + 3, -1, Static254.aClass3_Sub7_Sub13_2.aString35, -10660793, Static97.anInt1966 + 14);
				local74 = 0;
				for (@Pc(182) Class3_Sub7_Sub19 local182 = (Class3_Sub7_Sub19) Static254.aClass3_Sub7_Sub13_2.aClass363_21.method8414(); local182 != null; local182 = (Class3_Sub7_Sub19) Static254.aClass3_Sub7_Sub13_2.aClass363_21.method8415()) {
					@Pc(192) int local192 = local74 * 16 + Static97.anInt1966 + 31;
					local74++;
					Static619.method8433(Static641.anInt10142, local182, Static231.anInt4645, -256, -1, local192, Static386.anInt8229, Static97.anInt1966, local70, local64, arg0);
				}
				Static436.method6611(Static231.anInt4645, Static386.anInt8229, Static641.anInt10142, Static97.anInt1966);
			}
		} else {
			local74 = 0;
			for (@Pc(229) Class3_Sub7_Sub19 local229 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5457(); local229 != null; local229 = (Class3_Sub7_Sub19) Static544.aClass216_66.method5458()) {
				local92 = Static388.anInt6963 + local14 + (Static285.anInt7798 - (local74 + 1)) * 16 + 31;
				local74++;
				Static619.method8433(Static491.anInt8355 + local12, local229, Static355.anInt10008, -256, -1, local92, Static415.anInt7312, local14 + Static388.anInt6963, local70, local64, arg0);
			}
		}
		Static436.method6611(Static355.anInt10008, Static415.anInt7312, local12 + Static491.anInt8355, local14 + Static388.anInt6963);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
	public static boolean method3900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
	public static void method3905() {
		for (@Pc(3) int local3 = 0; local3 < Static546.aByteArrayArrayArray18.length; local3++) {
			for (@Pc(7) int local7 = 0; local7 < Static546.aByteArrayArrayArray18[0].length; local7++) {
				for (@Pc(11) int local11 = 0; local11 < Static546.aByteArrayArrayArray18[0][0].length; local11++) {
					Static546.aByteArrayArrayArray18[local3][local7][local11] = 0;
				}
			}
		}
	}
}
