import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!kb;")
	public static final Class154 aClass154_1 = new Class154(0, 3, Static268.aClass171_14);

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Lclient!kb;")
	public static final Class154 aClass154_2 = new Class154(1, 3, Static268.aClass171_14);

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Lclient!kb;")
	public static final Class154 aClass154_3 = new Class154(2, 4, Static268.aClass171_10);

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Lclient!kb;")
	public static final Class154 aClass154_4 = new Class154(3, 1, Static268.aClass171_14);

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "Lclient!kb;")
	public static final Class154 aClass154_5 = new Class154(4, 2, Static268.aClass171_14);

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!kb;")
	public static final Class154 aClass154_6 = new Class154(5, 3, Static268.aClass171_14);

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!kb;")
	private static final Class154 aClass154_7 = new Class154(6, 4, Static268.aClass171_14);

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public static final int anInt4315 = Static451.method6881(16);

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("b5cdc2d7fc4fafa9ff483bec98fd679e8b75be8bd7fc7239f7a6f8436f19eb8bc475f1461e7ac07b5a61f9b8e9c4bf9fa5a1ba9aab6111af84c28f52a06c497f0bdf9a76532ad422929fcc498fae5ca83e15ae61bca9522691bf48dbe6d34d01fbdf01235ce126ccb273b57eee477685a23df6bd53e355f5a2d81fdd246b3574f9bac514630f36f855a8d62e20af72258b67a9ced6c6cd2de5c2c2497a66d65d4c59e0494c19a6fb3fc028434766ed6aac71532af4d628fee0cab26d17118a219e328dbf59f4098e5770357bf692e29dd501379377e20ec994a3581dcf9505fcbf695340b2bee5e80ac06d5f11be488224f36a3fda289e74a87fc69bcb83137af727daa8bc7c07ba6ab0062f30b2b6a64e651dca9477b2da4562b08d0fd041eca45065ecfea82e81bf21cbf8ccbfa5872fc1a051b5b5e91dd6d53969720e236a0062c9577043cd7d3a136f6c0a99f4509364f03ff515f3db1233e99e5fd6e0e9f48522dff91fe60d899f30092ab598bc94204e14406b98c3be20e68010ed09679ce53f4efc7771ed3e928134949b64822fac79de0fe92c6768776785c5ca9e14db6ecb1a30d0909b7ba9f1c5e29875fcd717d0fe185361e2e84a583ec6ad84f88475cebaa388e0a5c0c69fbeca1ce781632d0c4b3333d7ed07980e11a4cfb85f211f9b1c9305ac5d3669e8665fa56bbbdf65a610e0e4cccbea9cf24382e74459", 16);

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_137 = new Class202("M", "M", "M", "M");

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_138 = new Class202("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_139 = new Class202("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public static void method3721() {
		Static374.anInt6954 = 0;
		Static469.aClass141Array1 = new Class141[50];
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIZII)V")
	public static void method3722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(26) int local26 = arg4 - 334;
		if (local26 < 0) {
			local26 = 0;
		} else if (local26 > 100) {
			local26 = 100;
		}
		@Pc(51) int local51 = Static232.aShort81 + local26 * (Static5.aShort9 - Static232.aShort81) / 100;
		if (Static213.aShort75 > local51) {
			local51 = Static213.aShort75;
		} else if (Static460.aShort153 < local51) {
			local51 = Static460.aShort153;
		}
		@Pc(77) int local77 = local51 * arg4 * 512 / (arg0 * 334);
		@Pc(114) int local114;
		@Pc(120) int local120;
		@Pc(89) short local89;
		if (local77 < Static54.aShort19) {
			local89 = Static54.aShort19;
			local51 = local89 * arg0 * 334 / (arg4 * 512);
			if (local51 > Static460.aShort153) {
				local51 = Static460.aShort153;
				local114 = local51 * 512 * arg4 / (local89 * 334);
				local120 = (arg0 - local114) / 2;
				if (arg2) {
					Static103.aClass39_3.n();
					Static103.aClass39_3.method6052(arg3, -16777216, arg1, arg4, local120);
					Static103.aClass39_3.method6052(arg3, -16777216, arg1 + arg0 - local120, arg4, local120);
				}
				arg1 += local120;
				arg0 -= local120 * 2;
			}
		} else if (local77 > Static263.aShort96) {
			local89 = Static263.aShort96;
			local51 = arg0 * local89 * 334 / (arg4 * 512);
			if (local51 < Static213.aShort75) {
				local51 = Static213.aShort75;
				local114 = arg0 * 334 * local89 / (local51 * 512);
				local120 = (arg4 - local114) / 2;
				if (arg2) {
					Static103.aClass39_3.n();
					Static103.aClass39_3.method6052(arg3, -16777216, arg1, local120, arg0);
					Static103.aClass39_3.method6052(arg3 + arg4 - local120, -16777216, arg1, local120, arg0);
				}
				arg3 += local120;
				arg4 -= local120 * 2;
			}
		}
		Static77.anInt1645 = arg3;
		Static273.anInt4974 = (short) arg0;
		Static32.anInt592 = local51 * arg4 / 334;
		Static265.anInt6990 = arg1;
		Static104.anInt2002 = (short) arg4;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)[Lclient!kb;")
	public static Class154[] method3724() {
		return new Class154[] { aClass154_1, aClass154_2, aClass154_3, aClass154_4, aClass154_5, aClass154_6, aClass154_7 };
	}
}
