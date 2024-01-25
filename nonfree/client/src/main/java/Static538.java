import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!wo", name = "X", descriptor = "[J")
	public static long[] aLongArray18;

	@OriginalMember(owner = "client!wo", name = "Y", descriptor = "I")
	public static int anInt9485;

	@OriginalMember(owner = "client!wo", name = "N", descriptor = "I")
	public static int anInt9478 = 0;

	@OriginalMember(owner = "client!wo", name = "V", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_137 = new Class45("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!wo", name = "W", descriptor = "[Lclient!cb;")
	public static final Class42[] aClass42Array1 = new Class42[6];

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!kj;I)Z")
	public static boolean method8164(@OriginalArg(1) Class1_Sub17_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method4517(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(105) int local105;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (local8 == 0) {
			if (arg0.method4517(1) != 0) {
				method8164(arg0, arg1);
			}
			local31 = arg0.method4517(6);
			local36 = arg0.method4517(6);
			@Pc(48) boolean local48 = arg0.method4517(1) == 1;
			if (local48) {
				Static241.anIntArray356[Static28.anInt772++] = arg1;
			}
			if (Static511.aClass20_Sub1_Sub1_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class312 local71 = Class20_Sub1_Sub5.lb[arg1];
			@Pc(79) Class20_Sub1_Sub1_Sub1 local79 = Static511.aClass20_Sub1_Sub1_Sub1Array1[arg1] = new Class20_Sub1_Sub1_Sub1();
			local79.anInt8969 = arg1;
			if (Static316.aClass1_Sub17Array1[arg1] != null) {
				local79.method723(Static316.aClass1_Sub17Array1[arg1]);
			}
			local79.method7821(true, local71.anInt9200);
			local79.anInt9034 = local71.anInt9201;
			local105 = local71.anInt9198;
			local109 = local105 >> 28;
			local115 = local105 >> 14 & 0xFF;
			@Pc(119) int local119 = local105 & 0xFF;
			local79.aBoolean54 = local71.aBoolean689;
			local79.aByteArray116[0] = Static358.aByteArray85[arg1];
			local79.aByte108 = (byte) local109;
			local79.method729((local115 << 6) + local31 - anInt9485, -Static282.anInt5380 + (local119 << 6) - -local36);
			local79.aBoolean53 = false;
			Class20_Sub1_Sub5.lb[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg0.method4517(2);
			local36 = Class20_Sub1_Sub5.lb[arg1].anInt9198;
			Class20_Sub1_Sub5.lb[arg1].anInt9198 = (local36 & 0xFFFFFFF) + (((local36 >> 28) + local31 & 0x3) << 28);
			return false;
		} else {
			@Pc(215) int local215;
			@Pc(220) int local220;
			@Pc(228) int local228;
			if (local8 != 2) {
				local31 = arg0.method4517(18);
				local36 = local31 >> 16;
				local215 = local31 >> 8 & 0xFF;
				local220 = local31 & 0xFF;
				local228 = Class20_Sub1_Sub5.lb[arg1].anInt9198;
				local105 = (local228 >> 28) + local36 & 0x3;
				local109 = (local228 >> 14) + local215 & 0xFF;
				local115 = local220 + local228 & 0xFF;
				Class20_Sub1_Sub5.lb[arg1].anInt9198 = (local109 << 14) + (local105 << 28) + local115;
				return false;
			}
			local31 = arg0.method4517(5);
			local36 = local31 >> 3;
			local215 = local31 & 0x7;
			local220 = Class20_Sub1_Sub5.lb[arg1].anInt9198;
			local228 = local36 + (local220 >> 28) & 0x3;
			local105 = local220 >> 14 & 0xFF;
			local109 = local220 & 0xFF;
			if (local215 == 0) {
				local109--;
				local105--;
			}
			if (local215 == 1) {
				local109--;
			}
			if (local215 == 2) {
				local105++;
				local109--;
			}
			if (local215 == 3) {
				local105--;
			}
			if (local215 == 4) {
				local105++;
			}
			if (local215 == 5) {
				local105--;
				local109++;
			}
			if (local215 == 6) {
				local109++;
			}
			if (local215 == 7) {
				local105++;
				local109++;
			}
			Class20_Sub1_Sub5.lb[arg1].anInt9198 = (local105 << 14) + (local228 << 28) + local109;
			return false;
		}
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)V")
	public static void method8166() {
		if (Static80.aClass4_4 != null) {
			Static80.aClass4_4.method7150();
			Static311.aClass36_2 = null;
			Static80.aClass4_4 = null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIIIIIIIB)V")
	public static void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg4 < 128 || arg6 < 128 || Static237.anInt4563 * 128 - 256 < arg4 || Static373.anInt6694 * 128 - 256 < arg6) {
			Static32.anIntArray66[0] = Static32.anIntArray66[1] = -1;
			return;
		}
		@Pc(45) int local45 = Static508.method7754(arg6, arg4, arg2) - arg3;
		Static224.aClass128_5.TA(arg5, 0, 0);
		Static455.aClass4_11.method7198(Static224.aClass128_5);
		Static455.aClass4_11.IA(arg4, local45, arg6, Static32.anIntArray66);
		Static224.aClass128_5.TA(-arg5, 0, 0);
		Static455.aClass4_11.method7198(Static224.aClass128_5);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IFI[BIIFFIFIFLclient!tp;I)V")
	public static void method8168(@OriginalArg(1) float arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(4) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6, @OriginalArg(11) float arg7, @OriginalArg(12) Class157 arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(52) int local52;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg8.method4199(0, arg0 * 127.0F, arg3 / (float) 16, arg6, arg4 / (float) 128, arg7 / (float) 128, local12);
			@Pc(42) int local42 = arg2;
			arg4 *= 2.0F;
			arg3 *= 2.0F;
			for (local52 = 0; local52 < 16384; local52++) {
				arg1[local42] = (byte) ((float) arg1[local42] + local12[local52]);
				local42++;
			}
			arg7 *= 2.0F;
			arg0 *= arg5;
		}
		local52 = arg2;
		for (@Pc(99) int local99 = 0; local99 < 16384; local99++) {
			arg1[local52] = (byte) (arg1[local52] + 127);
			local52++;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIII)V")
	public static void method8169(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static339.anInt6286 = arg3;
		Static103.anInt2207 = arg0;
		Static442.anInt7729 = arg2;
		Static416.anInt7274 = arg1;
	}
}
