import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_127 = new Class265(68, 1);

	@OriginalMember(owner = "client!qo", name = "i", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	public static void method4556() {
		if (Static150.aFrame5 != null) {
			return;
		}
		@Pc(12) Container local12;
		if (Static149.aFrame4 == null) {
			local12 = Static43.aClass59_5.anApplet1;
		} else {
			local12 = Static149.aFrame4;
		}
		Static15.anInt349 = local12.getSize().width;
		Static6.anInt215 = local12.getSize().height;
		@Pc(31) Insets local31;
		if (Static149.aFrame4 == local12) {
			local31 = Static149.aFrame4.getInsets();
			Static6.anInt215 -= local31.bottom + local31.top;
			Static15.anInt349 -= local31.right + local31.left;
		}
		if (Static359.method4899() == 1) {
			Static434.anInt7172 = (Static15.anInt349 - Static361.anInt6116) / 2;
			Static11.anInt287 = 0;
			Static395.anInt6582 = Static41.anInt771;
			Static86.anInt4394 = Static361.anInt6116;
		} else if (Static7.anInt219 < 96 && Static399.anInt6653 == 0) {
			@Pc(68) int local68 = Static15.anInt349 > 1024 ? 1024 : Static15.anInt349;
			@Pc(75) int local75 = Static6.anInt215 <= 768 ? Static6.anInt215 : 768;
			Static434.anInt7172 = (Static15.anInt349 - local68) / 2;
			Static86.anInt4394 = local68;
			Static11.anInt287 = 0;
			Static395.anInt6582 = local75;
		} else {
			Static11.anInt287 = 0;
			Static434.anInt7172 = 0;
			Static395.anInt6582 = Static6.anInt215;
			Static86.anInt4394 = Static15.anInt349;
		}
		if (Static23.aClass56_1 != Static53.aClass56_2) {
			@Pc(122) boolean local122;
			if (Static86.anInt4394 < 1024 && Static395.anInt6582 < 768) {
				local122 = true;
			} else {
				local122 = false;
			}
		}
		Static339.aCanvas7.setSize(Static86.anInt4394, Static395.anInt6582);
		if (Static33.aClass49_1 != null) {
			Static33.aClass49_1.method4419(Static339.aCanvas7);
		}
		if (Static149.aFrame4 == local12) {
			local31 = Static149.aFrame4.getInsets();
			Static339.aCanvas7.setLocation(Static434.anInt7172 + local31.left, Static11.anInt287 + local31.top);
		} else {
			Static339.aCanvas7.setLocation(Static434.anInt7172, Static11.anInt287);
		}
		if (Static410.anInt6841 != -1) {
			Static64.method1245(true);
		}
		Static137.method2320();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V")
	public static void method4558() {
		for (@Pc(15) Class2_Sub5_Sub17 local15 = (Class2_Sub5_Sub17) Static391.aClass14_36.method309(); local15 != null; local15 = (Class2_Sub5_Sub17) Static391.aClass14_36.method311()) {
			@Pc(20) Class3_Sub2_Sub3 local20 = local15.aClass3_Sub2_Sub3_1;
			if (Static383.anInt6436 != local20.aByte89 || Static131.anInt2821 > local20.anInt4243) {
				local15.method5866();
				local20.method3459();
			} else if (Static131.anInt2821 >= local20.anInt4244) {
				if (local20.anInt4246 > 0) {
					@Pc(50) Class3_Sub2_Sub1_Sub1 local50 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local20.anInt4246 - 1];
					if (local50 != null && local50.anInt6119 >= 0 && local50.anInt6119 < Static229.anInt4427 * 128 && local50.anInt6121 >= 0 && local50.anInt6121 < Static379.anInt6422 * 128) {
						local20.method3456(local50.anInt6119, local50.anInt6121, Static131.anInt2821, Static85.method1695(local20.aByte89, local50.anInt6121, local50.anInt6119) - local20.anInt4250);
					}
				}
				if (local20.anInt4246 < 0) {
					@Pc(110) int local110 = -local20.anInt4246 - 1;
					@Pc(117) Class3_Sub2_Sub1_Sub2 local117;
					if (local110 == Static399.anInt6656) {
						local117 = Static375.aClass3_Sub2_Sub1_Sub2_7;
					} else {
						local117 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local110];
					}
					if (local117 != null && local117.anInt6119 >= 0 && local117.anInt6119 < Static229.anInt4427 * 128 && local117.anInt6121 >= 0 && local117.anInt6121 < Static379.anInt6422 * 128) {
						local20.method3456(local117.anInt6119, local117.anInt6121, Static131.anInt2821, Static85.method1695(local20.aByte89, local117.anInt6121, local117.anInt6119) - local20.anInt4250);
					}
				}
				local20.method3460(Static377.anInt6400);
				Static313.method4402(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)Z")
	public static boolean method4559(@OriginalArg(1) int arg0) {
		return arg0 == 9 || arg0 == 57 || arg0 == 1003 || arg0 == 15 || arg0 == 4;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	public static void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static440.aClass106ArrayArrayArray3[0][arg1][arg2] != null && Static440.aClass106ArrayArrayArray3[0][arg1][arg2].aClass106_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static440.aClass106ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class106 local46 = Static440.aClass106ArrayArrayArray3[local22][arg1][arg2] = new Class106(local22, arg1, arg2);
				if (local20) {
					local46.aByte43++;
				}
			}
		}
	}
}
