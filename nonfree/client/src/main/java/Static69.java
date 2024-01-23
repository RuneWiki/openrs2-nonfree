import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "[I")
	public static int[] anIntArray244;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public static int anInt1366 = 0;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "[I")
	public static int[] anIntArray243 = new int[2];

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Lclient!qe;")
	public static Class78 aClass78_317 = null;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "Lclient!qe;")
	public static Class78 aClass78_318 = Static199.method3560("Stufe)2");

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
	public static void method1122(@OriginalArg(0) int arg0) {
		Static212.method3696();
		Static44.method590();
		@Pc(12) int local12 = Static169.method3105(arg0).anInt2831;
		if (local12 == 0) {
			return;
		}
		@Pc(22) int local22 = Static198.anIntArray724[arg0];
		if (local12 == 5) {
			Static152.anInt3472 = local22;
		}
		if (local12 == 6) {
			Static30.anInt549 = local22;
		}
		if (local12 == 9) {
			Static200.anInt4494 = local22;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[Lclient!b;I)V")
	public static void method1123(@OriginalArg(0) int arg0, @OriginalArg(2) Class9[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(12) int local12 = arg0 - 1;
		@Pc(16) int local16 = arg2 + 1;
		@Pc(22) int local22 = (arg2 + arg0) / 2;
		@Pc(26) Class9 local26 = arg1[local22];
		arg1[local22] = arg1[arg0];
		arg1[arg0] = local26;
		while (local12 < local16) {
			@Pc(40) boolean local40 = true;
			@Pc(43) int local43;
			@Pc(57) int local57;
			@Pc(60) int local60;
			do {
				local16--;
				for (local43 = 0; local43 < 4; local43++) {
					if (Static154.anIntArray576[local43] == 2) {
						local57 = arg1[local16].anInt320;
						local60 = local26.anInt320;
					} else if (Static154.anIntArray576[local43] == 1) {
						local57 = arg1[local16].anInt323;
						local60 = local26.anInt323;
						if (local57 == -1 && Static55.anIntArray155[local43] == 1) {
							local57 = 2001;
						}
						if (local60 == -1 && Static55.anIntArray155[local43] == 1) {
							local60 = 2001;
						}
					} else if (Static154.anIntArray576[local43] == 3) {
						local60 = local26.aBoolean9 ? 1 : 0;
						local57 = arg1[local16].aBoolean9 ? 1 : 0;
					} else {
						local57 = arg1[local16].anInt322;
						local60 = local26.anInt322;
					}
					if (local60 != local57) {
						if ((Static55.anIntArray155[local43] != 1 || local57 <= local60) && (Static55.anIntArray155[local43] != 0 || local60 <= local57)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			local40 = true;
			do {
				local12++;
				for (local43 = 0; local43 < 4; local43++) {
					if (Static154.anIntArray576[local43] == 2) {
						local60 = local26.anInt320;
						local57 = arg1[local12].anInt320;
					} else if (Static154.anIntArray576[local43] == 1) {
						local60 = local26.anInt323;
						if (local60 == -1 && Static55.anIntArray155[local43] == 1) {
							local60 = 2001;
						}
						local57 = arg1[local12].anInt323;
						if (local57 == -1 && Static55.anIntArray155[local43] == 1) {
							local57 = 2001;
						}
					} else if (Static154.anIntArray576[local43] == 3) {
						local60 = local26.aBoolean9 ? 1 : 0;
						local57 = arg1[local12].aBoolean9 ? 1 : 0;
					} else {
						local57 = arg1[local12].anInt322;
						local60 = local26.anInt322;
					}
					if (local60 != local57) {
						if ((Static55.anIntArray155[local43] != 1 || local57 >= local60) && (Static55.anIntArray155[local43] != 0 || local57 <= local60)) {
							local40 = false;
						}
						break;
					}
					if (local43 == 3) {
						local40 = false;
					}
				}
			} while (local40);
			if (local16 > local12) {
				@Pc(320) Class9 local320 = arg1[local12];
				arg1[local12] = arg1[local16];
				arg1[local16] = local320;
			}
		}
		method1123(arg0, arg1, local16);
		method1123(local16 + 1, arg1, arg2);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!qe;B)I")
	public static int method1124(@OriginalArg(0) Class78 arg0) {
		return arg0.method3041() + 1;
	}
}
