import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
	public static int anInt4458;

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
	public static int anInt4465 = 0;

	@OriginalMember(owner = "client!ns", name = "q", descriptor = "I")
	public static int anInt4466 = 0;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
	public static void method3942() {
		Static33.anInt735 = 0;
		Static76.aClass74_8.method1803();
		Static76.aClass74_8.method1802(Static314.aClass7_Sub32_1);
		Static33.anInt735++;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!ap;)V")
	public static void method3943(@OriginalArg(1) Class7_Sub3 arg0) {
		if (arg0.aByteArray33.length - arg0.anInt3005 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method2772();
		if (local21 < 0 || local21 > 14) {
			return;
		}
		@Pc(40) byte local40;
		if (local21 == 14) {
			local40 = 36;
		} else if (local21 == 13) {
			local40 = 35;
		} else if (local21 == 12) {
			local40 = 34;
		} else if (local21 == 11) {
			local40 = 33;
		} else if (local21 == 10) {
			local40 = 32;
		} else if (local21 == 9) {
			local40 = 31;
		} else if (local21 == 8) {
			local40 = 30;
		} else if (local21 == 7) {
			local40 = 29;
		} else if (local21 == 6) {
			local40 = 28;
		} else if (local21 == 5) {
			local40 = 28;
		} else if (local21 == 4) {
			local40 = 24;
		} else if (local21 == 3) {
			local40 = 23;
		} else if (local21 == 2) {
			local40 = 22;
		} else if (local21 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (local40 > arg0.aByteArray33.length - arg0.anInt3005) {
			return;
		}
		Static289.anInt2339 = arg0.method2772();
		if (Static289.anInt2339 < 1) {
			Static289.anInt2339 = 1;
		} else if (Static289.anInt2339 > 4) {
			Static289.anInt2339 = 4;
		}
		Static252.method5176(arg0.method2772() == 1);
		Class22_Sub2_Sub5.lb = arg0.method2772() == 1;
		Static155.aBoolean244 = arg0.method2772() == 1;
		Static342.aBoolean471 = arg0.method2772() == 1;
		Static2.anInt18 = arg0.method2772() == 1 ? 1 : 0;
		Static308.aBoolean431 = arg0.method2772() == 1;
		Static70.aBoolean128 = arg0.method2772() == 1;
		Static231.aBoolean341 = arg0.method2772() == 1;
		Static336.anInt4180 = arg0.method2772();
		if (Static336.anInt4180 > 2) {
			Static336.anInt4180 = 2;
		}
		if (local21 >= 2) {
			Static325.aBoolean452 = arg0.method2772() == 1;
		} else {
			Static325.aBoolean452 = arg0.method2772() == 1;
			arg0.method2772();
		}
		Static140.aBoolean228 = arg0.method2772() == 1;
		Static296.aBoolean432 = arg0.method2772() == 1;
		Static27.anInt622 = arg0.method2772();
		if (Static27.anInt622 > 2) {
			Static27.anInt622 = 2;
		}
		Static206.anInt4115 = Static27.anInt622;
		Static108.aBoolean108 = arg0.method2772() == 1;
		Static110.anInt2524 = arg0.method2772();
		if (Static110.anInt2524 > 127) {
			Static110.anInt2524 = 127;
		}
		Static254.anInt4943 = arg0.method2772();
		Static165.anInt3445 = arg0.method2772();
		if (Static165.anInt3445 > 127) {
			Static165.anInt3445 = 127;
		}
		if (local21 >= 1) {
			Static345.anInt6528 = arg0.method2764();
			Static227.anInt6305 = arg0.method2764();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method2772();
		}
		@Pc(403) int local403;
		if (local21 >= 4) {
			local403 = arg0.method2772();
			if (local403 < 0 || local403 > 2) {
				local403 = 0;
			}
			if (Static194.anInt1874 < 96) {
				local403 = 0;
			}
			Static218.method3851(local403);
		}
		if (local21 >= 5) {
			Static275.anInt5447 = arg0.method2767();
		}
		local403 = 0;
		if (local21 >= 6) {
			Static6.anInt126 = local403 = arg0.method2772();
		}
		if (Static6.anInt126 != 1 && Static6.anInt126 != 2) {
			Static6.anInt126 = 2;
		}
		if (local21 >= 7) {
			Static294.aBoolean459 = arg0.method2772() == 1;
		}
		if (local21 >= 8) {
			Static268.aBoolean393 = arg0.method2772() == 1;
		}
		if (local21 >= 9) {
			Static186.anInt3771 = arg0.method2772();
		}
		if (Static186.anInt3771 < 0 || Static186.anInt3771 > 3) {
			Static186.anInt3771 = 0;
		}
		if (local21 >= 10) {
			Static324.aBoolean451 = arg0.method2772() != 0;
		}
		if (local21 >= 11) {
			Static35.aBoolean76 = arg0.method2772() != 0;
		}
		if (local21 >= 12) {
			Static2.anInt18 = arg0.method2772();
		}
		if (Static2.anInt18 < 0 || Static2.anInt18 > 2) {
			Static2.anInt18 = 1;
		}
		if (local21 >= 13) {
			Static53.aBoolean112 = arg0.method2772() == 1;
		}
		if (local21 >= 14) {
			Static244.anInt4807 = arg0.method2772();
		} else if (local403 == 0) {
			Static244.anInt4807 = 2;
		} else {
			Static244.anInt4807 = 1;
		}
		if (Static244.anInt4807 < 0 || Static244.anInt4807 > 3) {
			Static244.anInt4807 = 2;
		}
	}
}
