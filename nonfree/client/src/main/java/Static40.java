import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bj", name = "O", descriptor = "F")
	public static float aFloat25;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
	public static void method758(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		Static120.anInt1966 = 1;
		Static623.anInt9970 = -1;
		Static365.aClass389_9 = Static4.aClass389_16;
		Static357.method5231(false, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
	public static void method759() {
		if (Static486.aClass40Array1 == null) {
			Static486.aClass40Array1 = Static43.method772();
			Static130.aClass40_22 = Static486.aClass40Array1[0];
			Static273.aLong140 = Static480.method6763();
		}
		if (Static510.aClass216_1 == null) {
			Static293.method6186();
		}
		@Pc(27) Class40 local27 = Static130.aClass40_22;
		@Pc(30) int local30 = Static411.method6061();
		if (Static130.aClass40_22 == local27) {
			Static542.aString98 = Static130.aClass40_22.aClass131_1.method3168(Static375.anInt7800);
			if (Static130.aClass40_22.aBoolean46) {
				Static349.anInt5754 = Static130.aClass40_22.anInt705 + (Static130.aClass40_22.anInt710 - Static130.aClass40_22.anInt705) * local30 / 100;
			}
			if (Static130.aClass40_22.aBoolean47) {
				Static542.aString98 = Static542.aString98 + Static349.anInt5754 + "%";
			}
		} else if (Static43.aClass40_21 == Static130.aClass40_22) {
			Static510.aClass216_1 = null;
			Static411.method6060(3, -3);
		} else {
			Static542.aString98 = local27.aClass131_2.method3168(Static375.anInt7800);
			Static349.anInt5754 = local27.anInt710;
			if (Static130.aClass40_22.aBoolean47) {
				Static542.aString98 = Static542.aString98 + local27.anInt710 + "%";
			}
			if (Static130.aClass40_22.aBoolean46 || local27.aBoolean46) {
				Static273.aLong140 = Static480.method6763();
			}
		}
		if (Static510.aClass216_1 == null) {
			return;
		}
		Static510.aClass216_1.method4933(Static349.anInt5754, Static273.aLong140, Static542.aString98, Static130.aClass40_22);
		if (Static673.anInterface18Array1 == null) {
			return;
		}
		for (@Pc(150) int local150 = Static542.anInt8609 + 1; local150 < Static673.anInterface18Array1.length; local150++) {
			if (Static673.anInterface18Array1[local150].method5203() >= 100 && local150 - 1 == Static542.anInt8609 && Static652.anInt10664 >= 1 && Static510.aClass216_1.method4934()) {
				try {
					Static673.anInterface18Array1[local150].method5204();
				} catch (@Pc(194) Exception local194) {
					Static673.anInterface18Array1 = null;
					break;
				}
				Static510.aClass216_1.method4937(Static673.anInterface18Array1[local150]);
				Static542.anInt8609++;
				if (Static673.anInterface18Array1.length - 1 <= Static542.anInt8609 && Static673.anInterface18Array1.length > 1) {
					Static542.anInt8609 = Static294.aClass195_1.method4555() ? 0 : -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B[B)V")
	public static void method760(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class5_Sub36 local10 = new Class5_Sub36(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method7291();
				if (local16 == 0) {
					if (local12) {
						return;
					}
					if (Static254.anIntArray252 == null) {
						Static125.anIntArray124 = new int[4];
						Static254.anIntArray252 = new int[4];
						Static197.anInt3594 = 4;
					}
					for (local16 = 0; local16 < Static254.anIntArray252.length; local16++) {
						Static254.anIntArray252[local16] = 0;
						Static125.anIntArray124[local16] = local16 * 20;
					}
					return;
				}
				if (local16 == 1) {
					if (Static254.anIntArray252 == null) {
						Static254.anIntArray252 = new int[4];
						Static125.anIntArray124 = new int[4];
						Static197.anInt3594 = 4;
					}
					for (@Pc(95) int local95 = 0; local95 < Static254.anIntArray252.length; local95++) {
						Static254.anIntArray252[local95] = local10.method7303();
						Static125.anIntArray124[local95] = local10.method7303();
					}
					local12 = true;
				} else if (local16 == 2) {
					Static577.anInt9007 = local10.method7333();
				} else if (local16 == 3) {
					Static197.anInt3594 = local10.method7291();
					Static254.anIntArray252 = new int[Static197.anInt3594];
					Static125.anIntArray124 = new int[Static197.anInt3594];
				} else if (local16 == 5) {
					Static598.anInt10850 = local10.method7331();
				} else if (local16 == 6) {
					Static549.anInt8708 = local10.method7331();
				}
			}
		}
	}
}
