import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "I")
	public static int anInt6876;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_227 = new Class189("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!va", name = "c", descriptor = "Lclient!ku;")
	public static final Class138 aClass138_7 = new Class138();

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
	public static final int[] anIntArray499 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public static final int anInt6877 = 52;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
	public static boolean method5370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static74.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == -Static361.anInt6112) {
			return false;
		} else if (local7 == Static361.anInt6112) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static336.anInt5747;
			@Pc(26) int local26 = arg2 << Static336.anInt5747;
			if (Static328.method4427(local22 + 1, Static444.aClass159Array3[arg0].I(arg1, arg2), local26 + 1) && Static328.method4427(local22 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1 + 1, arg2), local26 + 1) && Static328.method4427(local22 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1 + 1, arg2 + 1), local26 + Static205.anInt3992 - 1) && Static328.method4427(local22 + 1, Static444.aClass159Array3[arg0].I(arg1, arg2 + 1), local26 + Static205.anInt3992 - 1) && Static328.method4427(local22 + Static421.anInt6887, Static444.aClass159Array3[arg0].I(arg1, arg2), local26 + 1) && Static328.method4427(local22 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1 + 1, arg2), local26 + Static421.anInt6887) && Static328.method4427(local22 + Static421.anInt6887, Static444.aClass159Array3[arg0].I(arg1, arg2 + 1), local26 + Static205.anInt3992 - 1) && Static328.method4427(local22 + Static205.anInt3992 - 1, Static444.aClass159Array3[arg0].I(arg1, arg2), local26 + Static421.anInt6887) && Static328.method4427(local22 + Static421.anInt6887, Static444.aClass159Array3[arg0].I(arg1, arg2), local26 + Static421.anInt6887)) {
				Static74.anIntArrayArrayArray3[arg0][arg1][arg2] = Static361.anInt6112;
				return true;
			} else {
				Static74.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static361.anInt6112;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)Z")
	public static boolean method5371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static164.method2715(arg1, arg0) || Static348.method4624(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static120.method1956(arg1, arg0);
		}
	}
}
