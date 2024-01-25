import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_81 = new Class45("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!gn;I)Lclient!pv;")
	public static Class232 method4869(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub1 arg1) {
		@Pc(15) Class232 local15;
		if (Static17.aClass232_1 == null) {
			local15 = new Class232();
		} else {
			local15 = Static17.aClass232_1;
			Static17.aClass232_1 = Static17.aClass232_1.aClass232_3;
			Static397.anInt6992--;
			local15.aClass232_3 = null;
		}
		local15.anInt6822 = arg0;
		local15.aClass20_Sub1_2 = arg1;
		return local15;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!mh;IBIII)Lclient!wo;")
	public static Class164_Sub3_Sub1 method4871(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean430 || Static329.method5606(arg4) && Static329.method5606(arg1)) {
			return new Class164_Sub3_Sub1(arg0, 3553, arg2, arg3, arg4, arg1, true);
		} else if (arg0.aBoolean433) {
			return new Class164_Sub3_Sub1(arg0, 34037, arg2, arg3, arg4, arg1, true);
		} else {
			return new Class164_Sub3_Sub1(arg0, arg2, arg3, arg4, arg1, Static184.method3549(arg4), Static184.method3549(arg1), true);
		}
	}
}
