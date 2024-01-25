import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
	public static int anInt3828;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "Lclient!tq;")
	public static Class191 aClass191_126;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
	public static int anInt3834 = 0;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_76 = new Class93("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
	public static int anInt3850 = -1;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)Lclient!nd;")
	public static Class2_Sub31 method3523() {
		if (Static127.aClass216_21 == null || Static355.aClass115_1 == null) {
			return null;
		}
		for (@Pc(24) Class2_Sub31 local24 = (Class2_Sub31) Static355.aClass115_1.method3268(); local24 != null; local24 = (Class2_Sub31) Static355.aClass115_1.method3268()) {
			@Pc(31) Class120 local31 = Static278.method5042(local24.anInt4062);
			if (local31 != null && local31.aBoolean324 && local31.method3337()) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[[I)V")
	public static void method3524(@OriginalArg(1) int[][] arg0) {
		Static146.anIntArrayArray91 = arg0;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZ)V")
	public static void method3527(@OriginalArg(0) boolean arg0) {
		if (arg0 != Static29.aBoolean64) {
			Static29.aBoolean64 = arg0;
			Static267.method4828();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIB)V")
	public static void method3529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static74.aClass2_Sub10_Sub1_2.method4450(arg1);
		Static74.aClass2_Sub10_Sub1_2.method4435(arg0);
		Static74.aClass2_Sub10_Sub1_2.method4410(arg2);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)I")
	public static int method3531() {
		if (Static285.aClass146_14 == null) {
			if (!Static29.aBoolean66 && Static117.anInt2590 > 0) {
				if (Static296.aBoolean536 && Static92.aClass97_2.method5672(81) && Static117.anInt2590 > 2) {
					return ((Class2_Sub13) Static91.aClass216_22.aClass2_251.aClass2_249.aClass2_249).anInt1321;
				}
				return ((Class2_Sub13) Static91.aClass216_22.aClass2_251.aClass2_249).anInt1321;
			}
			@Pc(48) int local48 = Static284.aClass61_1.method2658();
			@Pc(54) int local54 = Static284.aClass61_1.method2659();
			@Pc(56) int local56 = Static194.anInt3816;
			@Pc(58) int local58 = Static11.anInt293;
			@Pc(60) int local60 = Static120.anInt2599;
			if (local56 < local48 && local60 + local56 > local48) {
				@Pc(78) int local78 = -1;
				@Pc(97) int local97;
				for (@Pc(80) int local80 = 0; local80 < Static117.anInt2590; local80++) {
					if (Static97.aBoolean602) {
						local97 = (Static117.anInt2590 - local80 - 1) * 16 + local58 + 33;
						if (local97 - 13 < local54 && local97 + 3 >= local54) {
							local78 = local80;
						}
					} else {
						local97 = (Static117.anInt2590 - local80 - 1) * 16 + local58 + 31;
						if (local54 > local97 - 13 && local97 + 3 >= local54) {
							local78 = local80;
						}
					}
				}
				if (local78 != -1) {
					local97 = 0;
					@Pc(158) Class115 local158 = new Class115(Static91.aClass216_22);
					for (@Pc(163) Class2_Sub13 local163 = (Class2_Sub13) local158.method3270(); local163 != null; local163 = (Class2_Sub13) local158.method3268()) {
						if (local78 == local97++) {
							return local163.anInt1321;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)I")
	public static int method3533(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)Lclient!nd;")
	public static Class2_Sub31 method3534() {
		if (Static127.aClass216_21 == null || Static355.aClass115_1 == null) {
			return null;
		}
		Static355.aClass115_1.method3271(Static127.aClass216_21);
		@Pc(23) Class2_Sub31 local23 = (Class2_Sub31) Static355.aClass115_1.method3270();
		if (local23 == null) {
			return null;
		} else {
			@Pc(32) Class120 local32 = Static278.method5042(local23.anInt4062);
			return local32 != null && local32.aBoolean324 && local32.method3337() ? local23 : method3523();
		}
	}
}
