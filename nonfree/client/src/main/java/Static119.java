import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!eda", name = "u", descriptor = "I")
	public static int anInt2201;

	@OriginalMember(owner = "client!eda", name = "v", descriptor = "I")
	public static int anInt2202;

	@OriginalMember(owner = "client!eda", name = "h", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_23 = new Class46(75, 8);

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Z")
	public static boolean method1791() {
		try {
			return Static293.method4585();
		} catch (@Pc(14) IOException local14) {
			Static364.method5406();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static219.aClass337_68 == null ? -1 : Static219.aClass337_68.method7976()) + "," + (Static310.aClass337_94 == null ? -1 : Static310.aClass337_94.method7976()) + "," + (Static630.aClass337_165 == null ? -1 : Static630.aClass337_165.method7976()) + " - " + Static50.anInt1005 + "," + (Static565.anInt9560 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray94[0]) + "," + (Static567.anInt9589 + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anIntArray95[0]) + " - ";
			for (@Pc(79) int local79 = 0; Static50.anInt1005 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static257.aClass5_Sub22_Sub1_1.aByteArray71[local79] + ",";
			}
			Static524.method7740(local19, local77);
			Static583.method8429(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
	public static void method1798() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static433.aBooleanArray22[local7] = false;
		}
		Static438.anInt10553 = -1;
		Static118.anInt2182 = 0;
		Static563.anInt9475 = 0;
		Static642.anInt10098 = -1;
		Static529.anInt9092 = Static631.anInt10493;
		Static396.anInt6606 = -1;
		Static304.anInt5319 = -1;
		Static254.anInt4612 = 5;
		Static584.anInt9818 = Static441.anInt7550;
		Static88.anInt1811 = Static491.anInt8292;
		Static522.anInt8984 = Static19.anInt277;
		Static249.anInt4553 = Static117.anInt2170;
		Static583.anInt9804 = Static210.anInt4029;
	}
}
