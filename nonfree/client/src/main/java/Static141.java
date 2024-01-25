import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
	public static int anInt3583;

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Lclient!sca;")
	public static final Class300 aClass300_1 = new Class300();

	@OriginalMember(owner = "client!fb", name = "U", descriptor = "Lclient!qi;")
	public static final Class275 aClass275_1 = new Class275(4, 1);

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString29 = "";

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	public static void method3156() {
		if (Static99.aClass348_1 != null) {
			Static99.aClass348_1.method8103();
		}
		if (Static42.aThread1 == null) {
			return;
		}
		while (true) {
			try {
				Static42.aThread1.join();
				return;
			} catch (@Pc(19) InterruptedException local19) {
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)[B")
	public static byte[] method3157(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub1_Sub20 local17 = (Class3_Sub1_Sub20) Static150.aClass345_2.method8056((long) arg0);
		if (local17 == null) {
			@Pc(22) byte[] local22 = new byte[512];
			@Pc(28) Random local28 = new Random((long) arg0);
			for (@Pc(30) int local30 = 0; local30 < 255; local30++) {
				local22[local30] = (byte) local30;
			}
			for (@Pc(45) int local45 = 0; local45 < 255; local45++) {
				@Pc(52) int local52 = 255 - local45;
				@Pc(57) int local57 = Static106.method2589(local28, local52);
				@Pc(61) byte local61 = local22[local57];
				local22[local57] = local22[local52];
				local22[local52] = local22[511 - local45] = local61;
			}
			local17 = new Class3_Sub1_Sub20(local22);
			Static150.aClass345_2.method8058(local17, (long) arg0);
		}
		return local17.aByteArray91;
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
	public static void method3158() {
		for (@Pc(10) Class3_Sub1_Sub8 local10 = (Class3_Sub1_Sub8) Static267.aClass276_38.method6907(); local10 != null; local10 = (Class3_Sub1_Sub8) Static267.aClass276_38.method6912()) {
			@Pc(15) Class2_Sub3_Sub1_Sub3 local15 = local10.aClass2_Sub3_Sub1_Sub3_1;
			if (local15.anInt4178 < Static251.anInt5580) {
				local10.method8671();
				local15.method3610();
			} else if (local15.anInt4196 <= Static251.anInt5580) {
				local15.method3608();
				if (local15.anInt4200 > 0) {
					@Pc(39) Class3_Sub49 local39 = (Class3_Sub49) Static60.aClass307_6.method7424((long) (local15.anInt4200 - 1));
					if (local39 != null) {
						@Pc(44) Class2_Sub3_Sub1_Sub2_Sub1 local44 = local39.aClass2_Sub3_Sub1_Sub2_Sub1_2;
						if (local44.anInt10428 >= 0 && Static394.anInt7540 * 512 > local44.anInt10428 && local44.anInt10424 >= 0 && local44.anInt10424 < Static462.anInt8391 * 512) {
							local15.method3613(Static202.method3958(local44.anInt10424, local15.aByte128, local44.anInt10428) - local15.anInt4191, Static251.anInt5580, local44.anInt10428, local44.anInt10424);
						}
					}
				}
				if (local15.anInt4200 < 0) {
					@Pc(105) int local105 = -local15.anInt4200 - 1;
					@Pc(114) Class2_Sub3_Sub1_Sub2_Sub2 local114;
					if (Static399.anInt7626 == local105) {
						local114 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2;
					} else {
						local114 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local105];
					}
					if (local114 != null && local114.anInt10428 >= 0 && local114.anInt10428 < Static394.anInt7540 * 512 && local114.anInt10424 >= 0 && Static462.anInt8391 * 512 > local114.anInt10424) {
						local15.method3613(Static202.method3958(local114.anInt10424, local15.aByte128, local114.anInt10428) - local15.anInt4191, Static251.anInt5580, local114.anInt10428, local114.anInt10424);
					}
				}
				local15.method3609(Static550.anInt9371);
				Static286.method4985(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)V")
	public static void method3161() {
		Static174.aClass33_7.xa(((float) Static552.aClass3_Sub48_30.aClass23_Sub3_1.method1150() * 0.1F + 0.7F) * 1.1523438F);
		Static174.aClass33_7.ZA(Static621.anInt10313, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static174.aClass33_7.L(Static315.anInt6423, -1, 0);
		Static174.aClass33_7.method6219(Static312.aClass4_13);
	}
}
