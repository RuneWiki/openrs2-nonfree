import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "I")
	public static int anInt8946 = -1;

	@OriginalMember(owner = "client!sca", name = "f", descriptor = "Lclient!us;")
	public static final Class344 aClass344_108 = new Class344(57, 7);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIB)Z")
	public static boolean method7378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	public static void method7379() {
		if (Static474.anIntArray530 != null) {
			return;
		}
		Static474.anIntArray530 = new int[65536];
		@Pc(27) double local27 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 512; local31++) {
			@Pc(44) float local44 = ((float) (local31 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(53) float local53 = (float) (local31 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(55) int local55 = 0; local55 < 128; local55++) {
				@Pc(62) float local62 = (float) local55 / 128.0F;
				@Pc(64) float local64 = 0.0F;
				@Pc(66) float local66 = 0.0F;
				@Pc(68) float local68 = 0.0F;
				@Pc(72) float local72 = local44 / 60.0F;
				@Pc(75) int local75 = (int) local72;
				@Pc(79) int local79 = local75 % 6;
				@Pc(84) float local84 = local72 - (float) local75;
				@Pc(91) float local91 = (1.0F - local53) * local62;
				@Pc(100) float local100 = local62 * (1.0F - local84 * local53);
				@Pc(112) float local112 = (1.0F - local53 * (1.0F - local84)) * local62;
				if (local79 == 0) {
					local68 = local91;
					local66 = local112;
					local64 = local62;
				} else if (local79 == 1) {
					local68 = local91;
					local64 = local100;
					local66 = local62;
				} else if (local79 == 2) {
					local64 = local91;
					local66 = local62;
					local68 = local112;
				} else if (local79 == 3) {
					local66 = local100;
					local68 = local62;
					local64 = local91;
				} else if (local79 == 4) {
					local66 = local91;
					local68 = local62;
					local64 = local112;
				} else if (local79 == 5) {
					local64 = local62;
					local66 = local91;
					local68 = local100;
				}
				local64 = (float) Math.pow((double) local64, local27);
				local66 = (float) Math.pow((double) local66, local27);
				local68 = (float) Math.pow((double) local68, local27);
				@Pc(205) int local205 = (int) (local64 * 256.0F);
				@Pc(210) int local210 = (int) (local66 * 256.0F);
				@Pc(215) int local215 = (int) (local68 * 256.0F);
				@Pc(228) int local228 = local215 + (local205 << 16) + (local210 << 8) - 16777216;
				Static474.anIntArray530[local29++] = local228;
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "()V")
	public static void method7380() {
		for (@Pc(1) int local1 = Static155.anInt3811; local1 < Static626.anInt10336; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static642.anInt10523; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static158.anInt3845; local7++) {
					@Pc(16) Class106 local16 = Static170.aClass106ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class2_Sub3_Sub2 local21 = local16.aClass2_Sub3_Sub2_2;
						@Pc(24) Class2_Sub3_Sub2 local24 = local16.aClass2_Sub3_Sub2_1;
						if (local21 != null && local21.method8564()) {
							Static475.method7029(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method8564()) {
								Static475.method7029(local24, local1, local4, local7, 1, 1);
								local24.method8569(false, local21, Static185.aClass33_8, 0, 0, 0);
								local24.method8563();
							}
							local21.method8563();
						}
						for (@Pc(68) Class243 local68 = local16.aClass243_1; local68 != null; local68 = local68.aClass243_3) {
							@Pc(72) Class2_Sub3_Sub1 local72 = local68.aClass2_Sub3_Sub1_1;
							if (local72 != null && local72.method8564()) {
								Static475.method7029(local72, local1, local4, local7, local72.aShort122 + 1 - local72.aShort121, local72.aShort123 - local72.aShort124 + 1);
								local72.method8563();
							}
						}
						@Pc(108) Class2_Sub3_Sub5 local108 = local16.aClass2_Sub3_Sub5_1;
						if (local108 != null && local108.method8564()) {
							Static170.method3545(local108, local1, local4, local7);
							local108.method8563();
						}
					}
				}
			}
		}
	}
}
