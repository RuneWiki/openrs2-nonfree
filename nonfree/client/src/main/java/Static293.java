import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "F")
	public static float aFloat137;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZB)Z")
	public static boolean method6183(@OriginalArg(0) boolean arg0) {
		@Pc(13) boolean local13 = Static273.aClass100_6.method8656();
		if (local13 == arg0) {
			return true;
		}
		if (!arg0) {
			Static273.aClass100_6.method8616();
		} else if (!Static273.aClass100_6.method8650()) {
			arg0 = false;
		}
		if (arg0 == local13) {
			return false;
		} else {
			Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub17_1, arg0 ? 1 : 0);
			Static111.method1655();
			return true;
		}
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)Lclient!hu;")
	public static Class51_Sub1 method6184() {
		Static411.anInt6960 = 0;
		return Static505.method7008();
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
	public static void method6186() {
		if (Static130.aClass40_22 != null) {
			Static510.aClass216_1 = new Class216();
			Static510.aClass216_1.method4933(Static130.aClass40_22.anInt705, Static273.aLong140, Static130.aClass40_22.aClass131_1.method3168(Static375.anInt7800), Static130.aClass40_22);
			Static340.aThread2 = new Thread(Static510.aClass216_1, "");
			Static340.aThread2.start();
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "([BB)Z")
	public static boolean method6187(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub36 local8 = new Class5_Sub36(arg0);
		@Pc(12) int local12 = local8.method7291();
		if (local12 != 2) {
			return false;
		}
		@Pc(30) boolean local30 = local8.method7291() == 1;
		if (local30) {
			Static47.method858(local8);
		}
		Static402.method5855(local8);
		return true;
	}
}
