import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
	public static int[] anIntArray754;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_127 = new Class45("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZIII)I")
	public static int method7511(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub8 local8 = Static271.method4828(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray118.length > arg1) {
			return local8.anIntArray118[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLclient!vn;Lclient!qa;)I")
	public static int method7512(@OriginalArg(1) Class307 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.anInt9145 != -1) {
			return arg0.anInt9145;
		}
		if (arg0.anInt9141 != -1) {
			@Pc(25) Class296 local25 = arg1.anInterface13_13.method5789(arg1.method7166() ? arg0.anInt9141 : arg0.anInt9143);
			if (!local25.aBoolean640) {
				return local25.aShort116;
			}
		}
		return arg0.anInt9138;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBIIZ)V")
	public static void method7514(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static537.aLong248 = 0L;
		@Pc(8) int local8 = Static226.method4065();
		if (arg0 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static455.aClass4_11.method7171()) {
			arg3 = true;
		}
		Static381.method6107(arg0, arg2, arg3, local8, arg1);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!md;I)V")
	public static void method7515(@OriginalArg(0) Class20_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class20_Sub1_Sub1_Sub2) {
			@Pc(9) Class20_Sub1_Sub1_Sub2 local9 = (Class20_Sub1_Sub1_Sub2) arg0;
			if (local9.aClass283_1 != null) {
				Static427.method6644(local9, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 != local9.aByte108);
			}
		} else if (arg0 instanceof Class20_Sub1_Sub1_Sub1) {
			@Pc(31) Class20_Sub1_Sub1_Sub1 local31 = (Class20_Sub1_Sub1_Sub1) arg0;
			Static375.method7393(local31, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 != local31.aByte108);
		}
	}
}
