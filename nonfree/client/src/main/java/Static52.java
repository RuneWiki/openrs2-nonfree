import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
	public static int anInt1623;

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
	public static int anInt1625 = 0;

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
	public static int anInt1626 = 0;

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_374 = Static158.method3034("You have only just left another world)3");

	@OriginalMember(owner = "client!fb", name = "Z", descriptor = "Lclient!ob;")
	public static Class60 aClass60_375 = aClass60_374;

	@OriginalMember(owner = "client!fb", name = "ab", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_376 = Static158.method3034("compass");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILclient!pe;I)Z")
	public static boolean method1229(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg1.method521(arg2, arg0);
		if (local14 == null) {
			return false;
		} else {
			Static11.method310(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V")
	public static void method1232() {
		@Pc(14) boolean local14 = false;
		while (!local14) {
			local14 = true;
			for (@Pc(20) int local20 = 0; local20 < Static169.anInt4148 - 1; local20++) {
				if (Static140.aShortArray53[local20] < 1000 && Static140.aShortArray53[local20 + 1] > 1000) {
					@Pc(40) Class60 local40 = Static196.aClass60Array26[local20];
					Static196.aClass60Array26[local20] = Static196.aClass60Array26[local20 + 1];
					Static196.aClass60Array26[local20 + 1] = local40;
					local14 = false;
					@Pc(60) Class60 local60 = Static22.aClass60Array5[local20];
					Static22.aClass60Array5[local20] = Static22.aClass60Array5[local20 + 1];
					Static22.aClass60Array5[local20 + 1] = local60;
					@Pc(78) int local78 = Static6.anIntArray27[local20];
					Static6.anIntArray27[local20] = Static6.anIntArray27[local20 + 1];
					Static6.anIntArray27[local20 + 1] = local78;
					@Pc(96) int local96 = Static120.anIntArray375[local20];
					Static120.anIntArray375[local20] = Static120.anIntArray375[local20 + 1];
					Static120.anIntArray375[local20 + 1] = local96;
					@Pc(114) short local114 = Static140.aShortArray53[local20];
					Static140.aShortArray53[local20] = Static140.aShortArray53[local20 + 1];
					Static140.aShortArray53[local20 + 1] = local114;
					@Pc(132) long local132 = Static144.aLongArray7[local20];
					Static144.aLongArray7[local20] = Static144.aLongArray7[local20 + 1];
					Static144.aLongArray7[local20 + 1] = local132;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZLclient!ob;)V")
	public static void method1233(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class60 arg1) {
		@Pc(19) int local19 = Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3.method1797(arg1, 250);
		@Pc(30) int local30 = Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3.method1778(arg1, 250) * 13;
		Static133.method2120(6, 6, local19 + 4 + 4, local30 + 4 + 4, 0);
		Static133.method2111(6, 6, local19 + 8, local30 - -8, 16777215);
		Static113.aClass2_Sub1_Sub7_Sub3_Sub1_3.method1791(arg1, 10, 10, local19, local30, 16777215, -1, 1, 1, 0);
		Static129.method2731(6, 6, local19 + 4 + 4, local30 + 4 + 4);
		if (!arg0) {
			Static155.method2995(local30, local19, 10, 10);
			return;
		}
		try {
			@Pc(119) Graphics local119 = Static159.aCanvas36.getGraphics();
			Static192.aClass44_1.method2450(local119);
		} catch (@Pc(127) Exception local127) {
			Static159.aCanvas36.repaint();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)I")
	public static int method1234(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
