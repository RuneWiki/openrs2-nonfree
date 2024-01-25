import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!wn", name = "K", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!wn", name = "N", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
	public static int anInt7048 = -1;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method6071(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static183.method3405(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V")
	public static void method6072() {
		Static321.aClass2_Sub24_Sub2_34.method5792();
		@Pc(13) int local13 = Static321.aClass2_Sub24_Sub2_34.method5793(8);
		@Pc(18) int local18;
		if (local13 < Static123.anInt5933) {
			for (local18 = local13; local18 < Static123.anInt5933; local18++) {
				Static55.anIntArray86[Static86.anInt1844++] = Static373.anIntArray577[local18];
			}
		}
		if (Static123.anInt5933 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static123.anInt5933 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static373.anIntArray577[local18];
			@Pc(64) Class1_Sub2_Sub1_Sub2 local64 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local60];
			@Pc(69) int local69 = Static321.aClass2_Sub24_Sub2_34.method5793(1);
			if (local69 == 0) {
				Static373.anIntArray577[Static123.anInt5933++] = local60;
				local64.anInt5399 = Static339.anInt6265;
			} else {
				@Pc(89) int local89 = Static321.aClass2_Sub24_Sub2_34.method5793(2);
				if (local89 == 0) {
					Static373.anIntArray577[Static123.anInt5933++] = local60;
					local64.anInt5399 = Static339.anInt6265;
					Static4.anIntArray13[Static287.anInt5316++] = local60;
				} else {
					@Pc(131) int local131;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static373.anIntArray577[Static123.anInt5933++] = local60;
						local64.anInt5399 = Static339.anInt6265;
						local131 = Static321.aClass2_Sub24_Sub2_34.method5793(3);
						local64.method4803(local131, 1);
						local143 = Static321.aClass2_Sub24_Sub2_34.method5793(1);
						if (local143 == 1) {
							Static4.anIntArray13[Static287.anInt5316++] = local60;
						}
					} else if (local89 == 2) {
						Static373.anIntArray577[Static123.anInt5933++] = local60;
						local64.anInt5399 = Static339.anInt6265;
						if (Static321.aClass2_Sub24_Sub2_34.method5793(1) == 1) {
							local131 = Static321.aClass2_Sub24_Sub2_34.method5793(3);
							local64.method4803(local131, 2);
							local143 = Static321.aClass2_Sub24_Sub2_34.method5793(3);
							local64.method4803(local143, 2);
						} else {
							local131 = Static321.aClass2_Sub24_Sub2_34.method5793(3);
							local64.method4803(local131, 0);
						}
						local131 = Static321.aClass2_Sub24_Sub2_34.method5793(1);
						if (local131 == 1) {
							Static4.anIntArray13[Static287.anInt5316++] = local60;
						}
					} else if (local89 == 3) {
						Static55.anIntArray86[Static86.anInt1844++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V")
	public static void method6073() {
		Static261.aClass2_Sub43_2 = new Class2_Sub43(Static57.aClass62_37.method1389(Static200.anInt4144), "", Static190.anInt3987, 1009, -1, 0L, 0, 0, true, false);
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(III)I")
	public static int method6074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static323.anIntArray518[arg1 & 0x3] : 256;
	}
}
