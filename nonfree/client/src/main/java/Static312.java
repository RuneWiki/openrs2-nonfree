import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "Lclient!ph;")
	public static Class138 aClass138_91;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "[I")
	public static int[] anIntArray533 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
	public static int anInt5847 = 0;

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "[B")
	public static byte[] aByteArray73 = new byte[520];

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	public static int anInt5850 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JJ)J")
	public static long method4590(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method4591() {
		for (@Pc(12) Class1_Sub32 local12 = (Class1_Sub32) Static69.aClass156_6.method3822(); local12 != null; local12 = (Class1_Sub32) Static69.aClass156_6.method3820()) {
			@Pc(18) int local18 = local12.anInt5722;
			if (Static183.method3031(local18)) {
				@Pc(24) boolean local24 = true;
				@Pc(28) Class146[] local28 = Static313.aClass146ArrayArray1[local18];
				@Pc(30) int local30;
				for (local30 = 0; local30 < local28.length; local30++) {
					if (local28[local30] != null) {
						local24 = local28[local30].aBoolean299;
						break;
					}
				}
				if (!local24) {
					local30 = (int) local12.aLong223;
					@Pc(65) Class146 local65 = Static259.method3908(local30);
					if (local65 != null) {
						Static237.method2927(local65);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLjava/lang/String;Z)V")
	public static void method4593(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(22) int local22 = Static233.aClass1_Sub1_Sub12_3.method4420(arg0, 250);
		@Pc(29) int local29 = Static233.aClass1_Sub1_Sub12_3.method4442(arg0, 250) * 13;
		if (Static291.aBoolean404) {
			Static133.method2176(6, 6, local22 + 8, local29 + 8, 0);
			Static133.method2164(6, 6, local22 + 4 + 4, local29 - -4 + 4, 16777215);
		} else {
			Static41.method730(6, 6, local22 + 8, local29 + 8, 0);
			Static41.method729(6, 6, local22 + 4 + 4, 4 + 4 + local29, 16777215);
		}
		Static233.aClass1_Sub1_Sub12_3.method4427(arg0, 10, 10, local22, local29, 16777215, -1, 1, 1, 0);
		Static94.method1387(6, 6, local22 + 8, 4 + 4 + local29);
		if (!arg1) {
			Static247.method3813(local22, local29, 10, 10);
		} else if (Static291.aBoolean404) {
			Static291.method4294();
		} else {
			try {
				@Pc(168) Graphics local168 = Static304.aCanvas1.getGraphics();
				Static242.aClass62_1.method4466(local168);
			} catch (@Pc(176) Exception local176) {
				Static304.aCanvas1.repaint();
			}
		}
	}
}
