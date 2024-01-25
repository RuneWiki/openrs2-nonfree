import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!vt", name = "db", descriptor = "I")
	public static int anInt6607;

	@OriginalMember(owner = "client!vt", name = "fb", descriptor = "I")
	public static int anInt6609;

	@OriginalMember(owner = "client!vt", name = "W", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_234 = new Class221("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BLclient!fr;)Z")
	public static boolean method5643(@OriginalArg(1) Class80 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean155) {
			return false;
		} else if (!arg0.method1849(Static302.anInterface2_2)) {
			return false;
		} else if (Static265.aClass214_26.method5059((long) arg0.anInt2045) == null) {
			return Static214.aClass214_23.method5059((long) arg0.anInt2039) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIIB)Lclient!es;")
	public static Class12_Sub1_Sub2 method5644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) Class227 local11 = Static297.aClass227ArrayArrayArray7[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class12_Sub1_Sub2 local17 = null;
		@Pc(27) int local27 = -1;
		for (@Pc(30) Class164 local30 = local11.aClass164_25; local30 != null; local30 = local30.aClass164_19) {
			@Pc(34) Class12_Sub1 local34 = local30.aClass12_Sub1_2;
			if (local34 instanceof Class12_Sub1_Sub2) {
				@Pc(40) Class12_Sub1_Sub2 local40 = (Class12_Sub1_Sub2) local34;
				@Pc(50) int local50 = (local40.method4706() - 1) * 64 + 60;
				@Pc(58) int local58 = local40.anInt6328 - local50 >> 7;
				@Pc(66) int local66 = local40.anInt6317 - local50 >> 7;
				@Pc(73) int local73 = local50 + local40.anInt6328 >> 7;
				@Pc(80) int local80 = local50 + local40.anInt6317 >> 7;
				if (local58 <= arg2 && local66 <= arg1 && local73 >= arg2 && arg1 <= local80) {
					@Pc(118) int local118 = (local73 + 1 - arg2) * (-arg1 + local80 + 1);
					if (local27 < local118) {
						local17 = local40;
						local27 = local118;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(B)Lclient!wj;")
	public static Class141_Sub1 method5647() {
		Static149.anInt2702 = 0;
		return Static107.method2074();
	}

	@OriginalMember(owner = "client!vt", name = "g", descriptor = "(I)Z")
	public static boolean method5649() {
		return Static337.aClass143_27 != Static91.aClass143_12 || Static287.anInt5112 >= 2;
	}

	@OriginalMember(owner = "client!vt", name = "h", descriptor = "(I)V")
	public static void method5650() {
		Static35.aClass154_2.method3748();
	}
}
