import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!ul;")
	public static Class246 aClass246_184;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
	public static int anInt5770 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)Z")
	public static boolean method4807(@OriginalArg(0) boolean arg0) {
		@Pc(12) boolean local12 = Static415.aClass39_11.method4547();
		if (arg0 == local12) {
			return true;
		}
		if (!arg0) {
			Static415.aClass39_11.method4517();
		} else if (!Static415.aClass39_11.method4538()) {
			arg0 = false;
		}
		if (arg0 == local12) {
			return false;
		} else {
			Static38.aClass135_Sub1_1.aBoolean359 = arg0;
			Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
			return true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILclient!hp;)V")
	public static void method4808(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(6) byte[] local6 = new byte[24];
		if (Static312.aClass26_4 != null) {
			@Pc(18) int local18;
			try {
				Static312.aClass26_4.method669(0L);
				Static312.aClass26_4.method671(local6);
				for (local18 = 0; local18 < 24 && local6[local18] == 0; local18++) {
				}
				if (local18 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(41) Exception local41) {
				for (local18 = 0; local18 < 24; local18++) {
					local6[local18] = -1;
				}
			}
		}
		arg0.method5367(local6, 24);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!oe;Lclient!ya;BII)V")
	public static void method4809(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class39 arg1) {
		Static137.aClass181_23.method4101();
		if (Static233.aBoolean81) {
			return;
		}
		for (@Pc(21) Class1_Sub26 local21 = (Class1_Sub26) arg0.method4112(); local21 != null; local21 = (Class1_Sub26) arg0.method4104()) {
			@Pc(29) Class202 local29 = Static168.aClass78_2.method2110(local21.anInt3922);
			if (Static114.method2108(local29)) {
				@Pc(41) boolean local41 = Static367.method5047(arg1, local29, local21);
				if (local41) {
					Static59.method1260(arg1, local21, local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method4811() {
		for (@Pc(12) int local12 = 0; local12 < Static372.anInt6091; local12++) {
			@Pc(18) int local18 = Static237.anIntArray546[local12];
			@Pc(22) Class31_Sub2_Sub1_Sub2 local22 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = Static206.aClass1_Sub5_Sub1_2.method5366();
			if ((local26 & 0x2) != 0) {
				local26 += Static206.aClass1_Sub5_Sub1_2.method5366() << 8;
			}
			if ((local26 & 0x10) != 0) {
				local22.aString72 = Static206.aClass1_Sub5_Sub1_2.method5401();
				local22.anInt7313 = 100;
			}
			@Pc(64) int local64;
			@Pc(75) int local75;
			if ((local26 & 0x40) != 0) {
				local64 = Static206.aClass1_Sub5_Sub1_2.method5398();
				if (local64 == 65535) {
					local64 = -1;
				}
				local75 = Static206.aClass1_Sub5_Sub1_2.method5374();
				Static2.method64(local64, local22, local75);
			}
			if ((local26 & 0x8) != 0) {
				local64 = Static206.aClass1_Sub5_Sub1_2.method5361();
				local75 = Static206.aClass1_Sub5_Sub1_2.method5374();
				local22.method5995(local75, local64, Static378.anInt4244);
			}
			if ((local26 & 0x1000) != 0) {
				local22.aByte102 = Static206.aClass1_Sub5_Sub1_2.method5379();
				local22.aByte104 = Static206.aClass1_Sub5_Sub1_2.method5414();
				local22.aByte105 = Static206.aClass1_Sub5_Sub1_2.method5416();
				local22.aByte103 = (byte) Static206.aClass1_Sub5_Sub1_2.method5374();
				local22.anInt7360 = Static378.anInt4244 + Static206.aClass1_Sub5_Sub1_2.method5363();
				local22.anInt7339 = Static378.anInt4244 + Static206.aClass1_Sub5_Sub1_2.method5398();
			}
			if ((local26 & 0x800) != 0) {
				local22.anInt7353 = Static206.aClass1_Sub5_Sub1_2.method5379();
				local22.anInt7324 = Static206.aClass1_Sub5_Sub1_2.method5416();
				local22.anInt7358 = Static206.aClass1_Sub5_Sub1_2.method5416();
				local22.anInt7308 = Static206.aClass1_Sub5_Sub1_2.method5414();
				local22.anInt7351 = Static206.aClass1_Sub5_Sub1_2.method5362() + Static378.anInt4244;
				local22.anInt7312 = Static206.aClass1_Sub5_Sub1_2.method5400() + Static378.anInt4244;
				local22.anInt7362 = Static206.aClass1_Sub5_Sub1_2.method5383();
				local22.anInt7378 = 1;
				local22.anInt7308 += local22.anIntArray657[0];
				local22.anInt7324 += local22.anIntArray657[0];
				local22.anInt7353 += local22.anIntArray658[0];
				local22.anInt7358 += local22.anIntArray658[0];
				local22.anInt7379 = 0;
			}
			@Pc(258) int local258;
			if ((local26 & 0x1) != 0) {
				local64 = Static206.aClass1_Sub5_Sub1_2.method5362();
				if (local64 == 65535) {
					local64 = -1;
				}
				local75 = Static206.aClass1_Sub5_Sub1_2.method5369();
				local258 = Static206.aClass1_Sub5_Sub1_2.method5366();
				local22.method5993(local75, local258, false, local64);
			}
			if ((local26 & 0x20) != 0) {
				local64 = Static206.aClass1_Sub5_Sub1_2.method5361();
				local75 = Static206.aClass1_Sub5_Sub1_2.method5366();
				local22.method5995(local75, local64, Static378.anInt4244);
				local22.anInt7340 = Static378.anInt4244 + 300;
				local22.anInt7366 = Static206.aClass1_Sub5_Sub1_2.method5383();
			}
			if ((local26 & 0x200) != 0) {
				local22.anInt7394 = Static206.aClass1_Sub5_Sub1_2.method5400();
				local22.anInt7397 = Static206.aClass1_Sub5_Sub1_2.method5363();
			}
			if ((local26 & 0x400) != 0) {
				local64 = Static206.aClass1_Sub5_Sub1_2.method5400();
				local22.anInt7330 = Static206.aClass1_Sub5_Sub1_2.method5366();
				local22.anInt7325 = Static206.aClass1_Sub5_Sub1_2.method5383();
				local22.aBoolean504 = (local64 & 0x8000) != 0;
				local22.anInt7352 = local64 & 0x7FFF;
				local22.anInt7348 = local22.anInt7330 + Static378.anInt4244 + local22.anInt7352;
			}
			if ((local26 & 0x2000) != 0) {
				local64 = Static206.aClass1_Sub5_Sub1_2.method5383();
				@Pc(363) int[] local363 = new int[local64];
				@Pc(366) int[] local366 = new int[local64];
				@Pc(369) int[] local369 = new int[local64];
				for (@Pc(371) int local371 = 0; local371 < local64; local371++) {
					@Pc(377) int local377 = Static206.aClass1_Sub5_Sub1_2.method5363();
					if (local377 == 65535) {
						local377 = -1;
					}
					local363[local371] = local377;
					local366[local371] = Static206.aClass1_Sub5_Sub1_2.method5374();
					local369[local371] = Static206.aClass1_Sub5_Sub1_2.method5398();
				}
				Static295.method4253(local366, local369, local363, local22);
			}
			if ((local26 & 0x100) != 0) {
				local64 = Static206.aClass1_Sub5_Sub1_2.method5400();
				local75 = Static206.aClass1_Sub5_Sub1_2.method5395();
				if (local64 == 65535) {
					local64 = -1;
				}
				local258 = Static206.aClass1_Sub5_Sub1_2.method5366();
				local22.method5993(local75, local258, true, local64);
			}
			if ((local26 & 0x80) != 0) {
				local22.anInt7372 = Static206.aClass1_Sub5_Sub1_2.method5398();
				if (local22.anInt7372 == 65535) {
					local22.anInt7372 = -1;
				}
			}
			if ((local26 & 0x4) != 0) {
				if (local22.aClass53_1.method1505()) {
					Static422.method5611(local22);
				}
				local22.method5997(Static238.aClass116_2.method2822(Static206.aClass1_Sub5_Sub1_2.method5398()));
				local22.method5979(local22.aClass53_1.anInt1728);
				local22.anInt7345 = local22.aClass53_1.anInt1726 << 3;
				if (local22.aClass53_1.method1505()) {
					Static84.method1594(local22.anIntArray657[0], null, local22.aByte100, local22, 0, local22.anIntArray658[0], null);
				}
			}
		}
	}
}
