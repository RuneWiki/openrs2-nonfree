import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public static int anInt4514;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!cc;")
	public static Class42 aClass42_1;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public static int anInt4517;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[Lclient!fe;")
	public static final Class87_Sub1[] aClass87_Sub1Array1 = new Class87_Sub1[32];

	@OriginalMember(owner = "client!je", name = "g", descriptor = "Lclient!mo;")
	public static final Class196 aClass196_4 = new Class196();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)V")
	public static void method3952(@OriginalArg(1) boolean arg0) {
		Static280.anInt5512 = 0;
		Static159.anInt3491 = 0;
		Static400.method6046();
		Static246.method4149(arg0);
		Static458.method6744();
		@Pc(16) boolean local16 = false;
		@Pc(23) int local23;
		for (@Pc(18) int local18 = 0; local18 < Static159.anInt3491; local18++) {
			local23 = Static269.anIntArray369[local18];
			@Pc(30) Class1_Sub10 local30 = (Class1_Sub10) Static258.aClass174_15.method4422((long) local23);
			@Pc(33) Class47_Sub2_Sub3_Sub1 local33 = local30.aClass47_Sub2_Sub3_Sub1_2;
			if (Static25.aBoolean94 && Static444.method6414(local23)) {
				Static73.method1943();
			}
			if (local33.anInt5038 != Static416.anInt7252) {
				if (local33.aClass238_1.method5861()) {
					Static59.method1643(local33);
				}
				local33.method3708(null);
				local30.method7983();
				local16 = true;
			}
		}
		if (local16) {
			Static198.anInt4112 = Static258.aClass174_15.method4426();
			Static258.aClass174_15.method4427(Static395.aClass1_Sub10Array1);
		}
		if (Static255.aClass1_Sub13_Sub2_2.anInt3400 != Static45.anInt1403) {
			throw new RuntimeException("gnp1 pos:" + Static255.aClass1_Sub13_Sub2_2.anInt3400 + " psize:" + Static45.anInt1403);
		}
		for (local23 = 0; local23 < Static457.anInt7857; local23++) {
			if (Static258.aClass174_15.method4422((long) Static386.anIntArray503[local23]) == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static457.anInt7857);
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIB)V")
	public static void method3953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1007) {
			Static387.method5836(Static485.aClass266_11, arg2, arg1);
		} else if (arg0 == 1008) {
			Static387.method5836(Static202.aClass266_6, arg2, arg1);
		} else if (arg0 == 1010) {
			Static387.method5836(Static468.aClass266_10, arg2, arg1);
		} else if (arg0 == 1003) {
			Static387.method5836(Static462.aClass266_9, arg2, arg1);
		} else if (arg0 == 1004) {
			Static387.method5836(Static46.aClass266_2, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method3954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
