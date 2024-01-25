import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static312 {

	@OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
	public static int anInt5608;

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "[I")
	public static int[] anIntArray480;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_70 = new Class242("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!qa;)V")
	public static void method4314(@OriginalArg(1) Class30 arg0) {
		if (Static113.aClass258_16.method5535() == 0) {
			return;
		}
		@Pc(17) Class4_Sub19 local17;
		if (Static286.anInt5207 == 0) {
			for (local17 = (Class4_Sub19) Static113.aClass258_16.method5538(); local17 != null; local17 = (Class4_Sub19) Static113.aClass258_16.method5528()) {
				Static390.aClass204_2.method4626(arg0, false, Static162.aClass105_6, false, local17.anInt3007, local17.anInt3013, arg0, local17.anInt3012, local17.anInt3009, local17.anInt3008, local17.aBoolean215 ? Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1 : null);
				local17.method5854();
			}
			Static262.method3574();
			return;
		}
		if (Static156.aClass30_7 == null) {
			@Pc(65) Canvas local65 = new Canvas();
			local65.setSize(36, 32);
			Static156.aClass30_7 = Static316.method4691(0, Static222.anInterface10_6, Static89.aClass114_3, local65, 0);
			Static200.aClass105_2 = Static156.aClass30_7.method4690(Static437.method5652(Static240.anInt4396, Static439.aClass166_293), Static464.method4784(Static149.aClass166_105, Static240.anInt4396));
		}
		for (local17 = (Class4_Sub19) Static113.aClass258_16.method5538(); local17 != null; local17 = (Class4_Sub19) Static113.aClass258_16.method5528()) {
			Static390.aClass204_2.method4626(Static156.aClass30_7, false, Static200.aClass105_2, false, local17.anInt3007, local17.anInt3013, arg0, local17.anInt3012, local17.anInt3009, local17.anInt3008, local17.aBoolean215 ? Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1 : null);
			local17.method5854();
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
	public static void method4315() {
		if (Static261.anIntArray393 != null) {
			return;
		}
		Static261.anIntArray393 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(88) float local88 = (1.0F - local50) * local59;
				@Pc(96) float local96 = (1.0F - local81 * local50) * local59;
				@Pc(107) float local107 = local59 * (1.0F - local50 * (1.0F - local81));
				if (local76 == 0) {
					local61 = local59;
					local63 = local107;
					local65 = local88;
				} else if (local76 == 1) {
					local61 = local96;
					local65 = local88;
					local63 = local59;
				} else if (local76 == 2) {
					local61 = local88;
					local65 = local107;
					local63 = local59;
				} else if (local76 == 3) {
					local65 = local59;
					local61 = local88;
					local63 = local96;
				} else if (local76 == 4) {
					local61 = local107;
					local63 = local88;
					local65 = local59;
				} else if (local76 == 5) {
					local61 = local59;
					local63 = local88;
					local65 = local96;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(198) int local198 = (int) (local61 * 256.0F);
				@Pc(203) int local203 = (int) (local63 * 256.0F);
				@Pc(208) int local208 = (int) (local65 * 256.0F);
				@Pc(221) int local221 = local208 + (local198 << 16) + (local203 << 8) - 16777216;
				Static261.anIntArray393[local21++] = local221;
			}
		}
	}
}
