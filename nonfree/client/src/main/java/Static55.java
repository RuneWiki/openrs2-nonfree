import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
	public static int[] anIntArray272;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] aClass3_Sub2_Sub2_Sub3Array4;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "I")
	public static int anInt1559;

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3 aClass3_Sub2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!eh;")
	public static Class28 aClass28_465 = Static170.method3101(":chalreq:");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "I")
	public static int anInt1552 = 0;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!eh;")
	public static Class28 aClass28_466 = Static170.method3101("<col=ff3000>");

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_467 = Static170.method3101("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_468 = Static170.method3101("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method1225() {
		aClass28_468 = null;
		aClass28_465 = null;
		aClass28_466 = null;
		aClass28_467 = null;
		aClass3_Sub2_Sub2_Sub3Array4 = null;
		anIntArray272 = null;
		aClass3_Sub2_Sub2_Sub3_1 = null;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIB)I")
	public static int method1226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(28) int local28 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local28;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIB)V")
	public static void method1227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class33 local16 = Static27.method739(arg1, arg0);
		if (local16 != null && local16.anObjectArray23 != null) {
			@Pc(25) Class3_Sub6 local25 = new Class3_Sub6();
			local25.aClass33_3 = local16;
			local25.anObjectArray2 = local16.anObjectArray23;
			Static163.method3014(local25);
		}
		Static38.anInt1094 = arg1;
		Static171.anInt4101 = arg2;
		Static176.anInt4193 = arg0;
		Static67.aBoolean109 = true;
		Static16.method534(local16);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!dh;I)V")
	public static void method1228(@OriginalArg(0) Class3_Sub2_Sub2_Sub3 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static2.anIntArray17.length; local7++) {
			Static2.anIntArray17[local7] = 0;
		}
		@Pc(28) int local28;
		for (@Pc(19) int local19 = 0; local19 < 5000; local19++) {
			local28 = (int) (Math.random() * 128.0D * (double) 256);
			Static2.anIntArray17[local28] = (int) (Math.random() * 256.0D);
		}
		@Pc(48) int local48;
		@Pc(51) int local51;
		@Pc(59) int local59;
		for (local28 = 0; local28 < 20; local28++) {
			for (local48 = 1; local48 < 255; local48++) {
				for (local51 = 1; local51 < 127; local51++) {
					local59 = local51 + (local48 << 7);
					Static58.anIntArray330[local59] = (Static2.anIntArray17[local59 + 128] + Static2.anIntArray17[local59 + 1] + Static2.anIntArray17[local59 + -1] + Static2.anIntArray17[local59 + -128]) / 4;
				}
			}
			@Pc(103) int[] local103 = Static2.anIntArray17;
			Static2.anIntArray17 = Static58.anIntArray330;
			Static58.anIntArray330 = local103;
		}
		if (arg0 == null) {
			return;
		}
		local48 = 0;
		for (local51 = 0; local51 < arg0.anInt1014; local51++) {
			for (local59 = 0; local59 < arg0.anInt1013; local59++) {
				if (arg0.aByteArray12[local48++] != 0) {
					@Pc(137) int local137 = arg0.anInt1011 + local51 + 16;
					@Pc(144) int local144 = arg0.anInt1012 + local59 + 16;
					@Pc(151) int local151 = local144 + (local137 << 7);
					Static2.anIntArray17[local151] = 0;
				}
			}
		}
	}
}
