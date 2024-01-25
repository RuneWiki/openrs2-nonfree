import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_182 = new Class221("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "[C")
	public static final char[] aCharArray9 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	public static int anInt5442 = 0;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	public static int anInt5443 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method4753() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static370.aBooleanArray143[local7] = true;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)I")
	public static int method4754(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)V")
	public static void method4755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class227 local7 = Static297.aClass227ArrayArrayArray7[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class227 local28 = Static297.aClass227ArrayArrayArray7[local9][arg0][arg1] = Static297.aClass227ArrayArrayArray7[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte69--;
				for (@Pc(40) Class164 local40 = local28.aClass164_25; local40 != null; local40 = local40.aClass164_19) {
					@Pc(44) Class12_Sub1 local44 = local40.aClass12_Sub1_2;
					if (local44.aShort97 == arg0 && local44.aShort94 == arg1) {
						local44.aByte74--;
					}
				}
			}
		}
		if (Static297.aClass227ArrayArrayArray7[0][arg0][arg1] == null) {
			Static297.aClass227ArrayArrayArray7[0][arg0][arg1] = new Class227(0, arg0, arg1);
			Static297.aClass227ArrayArrayArray7[0][arg0][arg1].aByte68 = 1;
		}
		Static297.aClass227ArrayArrayArray7[0][arg0][arg1].aClass227_1 = local7;
		Static297.aClass227ArrayArrayArray7[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!vf;ZBZ)V")
	public static void method4757(@OriginalArg(0) Class2_Sub41 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt6411;
		@Pc(12) int local12 = (int) arg0.aLong208;
		arg0.method5745();
		if (arg1) {
			Static117.method2166(local8);
		}
		Static136.method2376(local8);
		@Pc(37) Class155 local37 = Static240.method3886(local12);
		if (local37 != null) {
			Static295.method4664(local37);
		}
		Static82.method1454();
		if (!arg2 && Static226.anInt4223 != -1) {
			Static61.method1131(Static226.anInt4223, 1);
		}
		@Pc(60) Class187 local60 = new Class187(Static362.aClass214_32);
		for (@Pc(65) Class2_Sub41 local65 = (Class2_Sub41) local60.method4423(); local65 != null; local65 = (Class2_Sub41) local60.method4421()) {
			if (!local65.method5744()) {
				local65 = (Class2_Sub41) local60.method4423();
				if (local65 == null) {
					return;
				}
			}
			if (local65.anInt6413 == 3) {
				@Pc(89) int local89 = (int) local65.aLong208;
				if (local89 >>> 16 == local8) {
					method4757(local65, true, arg2);
				}
			}
		}
	}
}
