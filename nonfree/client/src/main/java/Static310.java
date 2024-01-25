import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!o;")
	public static final Class171 aClass171_6 = new Class171("LOCAL", 4);

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	public static final int anInt5346 = 205;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_79 = new Class57(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)V")
	public static void method4763(@OriginalArg(1) int arg0) {
		if (Static348.anInt4439 == arg0) {
			return;
		}
		if (Static348.anInt4439 == 0) {
			Static134.method2120();
		}
		if (arg0 == 40) {
			Static114.method1850();
		}
		if (arg0 != 40 && Static268.aClass145_4 != null) {
			Static268.aClass145_4.method3136();
			Static268.aClass145_4 = null;
		}
		if (Static348.anInt4439 == 25 || Static348.anInt4439 == 28) {
			Static32.aClass20_14.anInt223 = 2;
			Static289.aClass20_70.anInt223 = 2;
			Static103.aClass20_25.anInt223 = 2;
			Static370.aClass20_96.anInt223 = 2;
			Static109.aClass20_32.anInt223 = 2;
			Static198.aClass20_50.anInt223 = 2;
			Static340.aClass20_88.anInt223 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static55.anInt1126 = 0;
			Static241.anInt4239 = 0;
			Static135.anInt2589 = 0;
			Static83.anInt1723 = 1;
			Static176.anInt3532 = 1;
			Static348.method4050(true);
			Static32.aClass20_14.anInt223 = 1;
			Static289.aClass20_70.anInt223 = 1;
			Static103.aClass20_25.anInt223 = 1;
			Static370.aClass20_96.anInt223 = 1;
			Static109.aClass20_32.anInt223 = 1;
			Static198.aClass20_50.anInt223 = 1;
			Static340.aClass20_88.anInt223 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static185.method2923();
		}
		if (arg0 == 5) {
			Static32.method489(Static77.aClass20_19, Static347.aClass155_9);
		} else {
			Static239.method5186();
		}
		@Pc(157) boolean local157 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(174) boolean local174 = Static348.anInt4439 == 5 || Static348.anInt4439 == 10 || Static348.anInt4439 == 28;
		if (local157 != local174) {
			if (local157) {
				Static4.anInt110 = Static66.anInt1301;
				if (Static164.aClass154_Sub1_1.anInt6064 == 0) {
					Static130.method2060();
				} else {
					Static206.method3189(Static66.anInt1301, Static103.aClass20_26, Static164.aClass154_Sub1_1.anInt6064);
				}
				Static328.aClass11_3.method160(false);
			} else {
				Static130.method2060();
				Static328.aClass11_3.method160(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static347.aClass155_9.method4895();
		}
		Static348.anInt4439 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZC)Z")
	public static boolean method4768(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static340.method5151(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static26.aCharArray1;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static101.aCharArray12;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(57) char local57 = local46[local48];
				if (arg0 == local57) {
					return true;
				}
			}
			return false;
		}
	}
}
