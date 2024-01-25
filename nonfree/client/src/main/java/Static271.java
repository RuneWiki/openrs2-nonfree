import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "J")
	public static long aLong138;

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "Lclient!fca;")
	public static final Class114 aClass114_40 = new Class114();

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "[Lclient!mc;")
	public static final Class5_Sub41[] aClass5_Sub41Array2 = new Class5_Sub41[2048];

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIII)J")
	public static long method4670(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static158.aCalendar1.clear();
		Static158.aCalendar1.set(arg1, arg2, arg0, 12, 0, 0);
		return Static158.aCalendar1.getTime().getTime();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)V")
	public static void method4671(@OriginalArg(1) int arg0) {
		if (Static173.anInt3397 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static360.aString55 == null) {
				Static365.method5530(Static511.aString83, Static270.anInt4979, Static178.aString23);
			} else {
				Static335.method5133(Static270.anInt4979);
			}
		}
		if (arg0 != 13 && Static270.aClass244_2 != null) {
			Static270.aClass244_2.method5753();
			Static270.aClass244_2 = null;
		}
		if (arg0 == 3) {
			Static564.method5793(Static637.anInt10350 != Static84.anInt2018);
		}
		if (arg0 == 7) {
			Static404.method5945(Static84.anInt2018 != Static43.anInt681);
		}
		if (arg0 == 5) {
			if (Static360.aString55 == null) {
				Static367.method5557(Static178.aString23, Static511.aString83);
			} else {
				Static577.method7979();
			}
		} else if (arg0 == 6) {
			if (Static360.aString55 == null) {
				Static365.method5530(Static511.aString83, Static270.anInt4979, Static178.aString23);
			} else {
				Static335.method5133(Static270.anInt4979);
			}
		} else if (arg0 == 9) {
			if (Static360.aString55 == null) {
				Static365.method5530(Static511.aString83, Static270.anInt4979, Static178.aString23);
			} else {
				Static335.method5133(Static270.anInt4979);
			}
		} else if (arg0 == 12) {
			if (Static360.aString55 == null) {
				Static367.method5557(Static178.aString23, Static511.aString83);
			} else {
				Static577.method7979();
			}
		}
		if (Static315.method2586(Static173.anInt3397)) {
			Static111.aClass390_79.anInt10731 = 2;
			Static242.aClass390_56.anInt10731 = 2;
			Static161.aClass390_71.anInt10731 = 2;
			Static145.aClass390_31.anInt10731 = 2;
			Static7.aClass390_1.anInt10731 = 2;
			Static556.aClass390_110.anInt10731 = 2;
			Static143.aClass390_30.anInt10731 = 2;
		}
		if (Static315.method2586(arg0)) {
			Static596.anInt3346 = 1;
			Static310.anInt5911 = 0;
			Static318.anInt5993 = 0;
			Static39.anInt651 = 1;
			Static408.anInt7217 = 0;
			Static586.method8062(true);
			Static111.aClass390_79.anInt10731 = 1;
			Static242.aClass390_56.anInt10731 = 1;
			Static161.aClass390_71.anInt10731 = 1;
			Static145.aClass390_31.anInt10731 = 1;
			Static7.aClass390_1.anInt10731 = 1;
			Static556.aClass390_110.anInt10731 = 1;
			Static143.aClass390_30.anInt10731 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static117.method2215();
		}
		@Pc(210) boolean local210 = arg0 == 2 || Static15.method206(arg0) || Static326.method5069(arg0);
		@Pc(225) boolean local225 = Static173.anInt3397 == 2 || Static15.method206(Static173.anInt3397) || Static326.method5069(Static173.anInt3397);
		if (local225 != local210) {
			if (local210) {
				Static33.anInt545 = Static433.anInt7533;
				if (Static172.aClass5_Sub50_14.aClass12_Sub7_3.method2118() == 0) {
					Static435.method8378();
				} else {
					Static172.method2968(Static172.aClass5_Sub50_14.aClass12_Sub7_3.method2118(), Static396.aClass390_82, Static433.anInt7533);
					Static481.method6852();
				}
				Static671.aClass296_3.method7096(false);
			} else {
				Static435.method8378();
				Static671.aClass296_3.method7096(true);
			}
		}
		if (Static315.method2586(arg0) || arg0 == 13) {
			Static208.aClass65_7.method6909();
		}
		Static173.anInt3397 = arg0;
	}
}
