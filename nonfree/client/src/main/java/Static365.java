import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	public static int anInt6882;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "[Lclient!ls;")
	public static Class178_Sub1[] aClass178_Sub1Array1;

	@OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
	public static final int anInt6876 = 52;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_198 = new Class202("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_136 = new Class239(66, 7);

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
	public static int anInt6883 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILclient!dda;)Lclient!ts;")
	public static Class2_Sub13_Sub16 method5855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class53 arg2) {
		@Pc(12) Class2_Sub29 local12 = new Class2_Sub29(arg2.method1616(arg1, arg0));
		@Pc(45) Class2_Sub13_Sub16 local45 = new Class2_Sub13_Sub16(arg1, local12.method5194(), local12.method5194(), local12.method5198(), local12.method5198(), local12.method5170() == 1, local12.method5170(), local12.method5170());
		@Pc(49) int local49 = local12.method5170();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass249_65.method6523(new Class2_Sub14(local12.method5170(), local12.method5229(), local12.method5229(), local12.method5229(), local12.method5229(), local12.method5229(), local12.method5229(), local12.method5229(), local12.method5229()));
		}
		local45.method7034();
		return local45;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(CI)Z")
	public static boolean method5857(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)Z")
	public static boolean method5858() {
		return Static455.aClass320_15 != Static414.aClass320_17 || Static475.anInt8486 >= 2;
	}
}
