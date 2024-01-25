import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
	public static int anInt267;

	@OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
	public static int anInt271;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V")
	public static void method241() {
		if (Static229.aFrame1 != null) {
			return;
		}
		@Pc(16) int local16 = Static179.anInt3824;
		@Pc(18) int local18 = Static140.anInt3219;
		@Pc(26) int local26 = Static255.anInt5171 - local16 - Static24.anInt496;
		@Pc(34) int local34 = Static165.anInt3522 - local18 - Static23.anInt465;
		if (local16 <= 0 && local26 <= 0 && local18 <= 0 && local34 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static308.aFrame2 == null) {
				local49 = Static1.aClass134_7.anApplet1;
			} else {
				local49 = Static308.aFrame2;
			}
			@Pc(56) int local56 = 0;
			@Pc(58) int local58 = 0;
			if (local49 == Static308.aFrame2) {
				@Pc(64) Insets local64 = Static308.aFrame2.getInsets();
				local58 = local64.top;
				local56 = local64.left;
			}
			@Pc(73) Graphics local73 = local49.getGraphics();
			local73.setColor(Color.black);
			if (local16 > 0) {
				local73.fillRect(local56, local58, local16, Static165.anInt3522);
			}
			if (local18 > 0) {
				local73.fillRect(local56, local58, Static255.anInt5171, local18);
			}
			if (local26 > 0) {
				local73.fillRect(Static255.anInt5171 + local56 - local26, local58, local26, Static165.anInt3522);
			}
			if (local34 > 0) {
				local73.fillRect(local56, local58 + Static165.anInt3522 - local34, Static255.anInt5171, local34);
				return;
			}
		} catch (@Pc(122) Exception local122) {
			return;
		}
	}

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V")
	public static void method242() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static172.aBooleanArray19[local3] = true;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLclient!ml;ILclient!lf;)V")
	public static void method243(@OriginalArg(1) Class134 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub11 arg2) {
		@Pc(9) Class4_Sub17 local9 = new Class4_Sub17();
		local9.anInt2443 = arg2.method3440();
		local9.anInt2445 = arg2.method3418();
		local9.anIntArray210 = new int[local9.anInt2443];
		local9.aClass185Array2 = new Class185[local9.anInt2443];
		local9.anIntArray209 = new int[local9.anInt2443];
		local9.aClass185Array1 = new Class185[local9.anInt2443];
		local9.anIntArray211 = new int[local9.anInt2443];
		local9.aByteArrayArrayArray7 = new byte[local9.anInt2443][][];
		for (@Pc(56) int local56 = 0; local56 < local9.anInt2443; local56++) {
			try {
				@Pc(62) int local62 = arg2.method3440();
				@Pc(74) String local74;
				@Pc(80) String local80;
				@Pc(82) int local82;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local74 = arg2.method3446();
					local80 = arg2.method3446();
					local82 = 0;
					if (local62 == 1) {
						local82 = arg2.method3418();
					}
					local9.anIntArray210[local56] = local62;
					local9.anIntArray209[local56] = local82;
					local9.aClass185Array2[local56] = arg0.method3752(local80, Static249.method4399(local74));
				} else if (local62 == 3 || local62 == 4) {
					local74 = arg2.method3446();
					local80 = arg2.method3446();
					local82 = arg2.method3440();
					@Pc(141) String[] local141 = new String[local82];
					for (@Pc(143) int local143 = 0; local143 < local82; local143++) {
						local141[local143] = arg2.method3446();
					}
					@Pc(162) byte[][] local162 = new byte[local82][];
					@Pc(175) int local175;
					if (local62 == 3) {
						for (@Pc(169) int local169 = 0; local169 < local82; local169++) {
							local175 = arg2.method3418();
							local162[local169] = new byte[local175];
							arg2.method3456(local175, local162[local169]);
						}
					}
					local9.anIntArray210[local56] = local62;
					@Pc(200) Class[] local200 = new Class[local82];
					for (local175 = 0; local175 < local82; local175++) {
						local200[local175] = Static249.method4399(local141[local175]);
					}
					local9.aClass185Array1[local56] = arg0.method3764(local80, Static249.method4399(local74), local200);
					local9.aByteArrayArrayArray7[local56] = local162;
				}
			} catch (@Pc(235) ClassNotFoundException local235) {
				local9.anIntArray211[local56] = -1;
			} catch (@Pc(242) SecurityException local242) {
				local9.anIntArray211[local56] = -2;
			} catch (@Pc(249) NullPointerException local249) {
				local9.anIntArray211[local56] = -3;
			} catch (@Pc(256) Exception local256) {
				local9.anIntArray211[local56] = -4;
			} catch (@Pc(263) Throwable local263) {
				local9.anIntArray211[local56] = -5;
			}
		}
		Static199.aClass116_35.method3274(local9);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public static void method244(@OriginalArg(1) int arg0) {
		Static285.anInt5603 = -1;
		Static116.anInt2756 = -1;
		Static8.anInt200 = arg0;
		Static95.method2223();
	}
}
