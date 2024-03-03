import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V", line = 150)
	public static void method1423() {
		Static53.aClass161Array1 = null;
		Static186.method5247(0, Static161.anInt3295, Static231.anInt4656, Class97.anInt2592, -1, 0, 0, 0);
		if (Static53.aClass161Array1 != null) {
			Static188.method3654(Static161.anInt3295, -1412584499, Static53.aClass161Array1, 0, Static233.anInt4680, 0, Static231.anInt4656, Class2_Sub3_Sub30.aClass161_13.anInt4251, Static45.anInt1255);
			Static53.aClass161Array1 = null;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!wm;Lclient!nk;)V", line = 168)
	public static void method1424(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class161 arg1) {
		@Pc(31) boolean local31 = Static290.aClass107_2.method2760(arg1.anInt4299, arg1.anInt4293, arg1.aBoolean280 ? Static17.aClass11_Sub5_Sub2_Sub1_3.aClass117_1 : null, arg0, arg1.anInt4246 | 0xFF000000, arg1.anInt4272, arg1.anInt4234) == null;
		if (local31) {
			Class99.aClass135_21.method3541(new Class2_Sub17(arg1.anInt4293, arg1.anInt4234, arg1.anInt4272, arg1.anInt4246 | 0xFF000000, arg1.anInt4299, arg1.aBoolean280));
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z", line = 184)
	public static boolean method1425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Class2_Sub3_Sub9.anInt1620; local1++) {
			@Pc(6) Class58 local6 = Static171.aClass58Array2[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1688 == 1) {
				local15 = local6.anInt1697 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1684 + (local6.anInt1699 * local15 >> 8);
					local37 = local6.anInt1690 + (local6.anInt1683 * local15 >> 8);
					local47 = local6.anInt1695 + (local6.anInt1696 * local15 >> 8);
					local57 = local6.anInt1701 + (local6.anInt1700 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1688 == 2) {
				local15 = arg0 - local6.anInt1697;
				if (local15 > 0) {
					local27 = local6.anInt1684 + (local6.anInt1699 * local15 >> 8);
					local37 = local6.anInt1690 + (local6.anInt1683 * local15 >> 8);
					local47 = local6.anInt1695 + (local6.anInt1696 * local15 >> 8);
					local57 = local6.anInt1701 + (local6.anInt1700 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1688 == 3) {
				local15 = local6.anInt1684 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1697 + (local6.anInt1691 * local15 >> 8);
					local37 = local6.anInt1693 + (local6.anInt1702 * local15 >> 8);
					local47 = local6.anInt1695 + (local6.anInt1696 * local15 >> 8);
					local57 = local6.anInt1701 + (local6.anInt1700 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1688 == 4) {
				local15 = arg2 - local6.anInt1684;
				if (local15 > 0) {
					local27 = local6.anInt1697 + (local6.anInt1691 * local15 >> 8);
					local37 = local6.anInt1693 + (local6.anInt1702 * local15 >> 8);
					local47 = local6.anInt1695 + (local6.anInt1696 * local15 >> 8);
					local57 = local6.anInt1701 + (local6.anInt1700 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1688 == 5) {
				local15 = arg1 - local6.anInt1695;
				if (local15 > 0) {
					local27 = local6.anInt1697 + (local6.anInt1691 * local15 >> 8);
					local37 = local6.anInt1693 + (local6.anInt1702 * local15 >> 8);
					local47 = local6.anInt1684 + (local6.anInt1699 * local15 >> 8);
					local57 = local6.anInt1690 + (local6.anInt1683 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
