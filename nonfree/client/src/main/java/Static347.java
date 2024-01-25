import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "Lclient!dj;")
	public static final Class71 aClass71_8 = new Class71();

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public static int anInt6073 = 1;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(BLclient!et;)Lclient!bo;")
	public static Class38 method5127(@OriginalArg(1) Class41_Sub2_Sub1 arg0) {
		@Pc(17) Class38 local17;
		if (Static558.aClass38_3 == null) {
			local17 = new Class38();
		} else {
			local17 = Static558.aClass38_3;
			Static558.aClass38_3 = Static558.aClass38_3.aClass38_1;
			Static219.anInt3915--;
			local17.aClass38_1 = null;
		}
		local17.aClass41_Sub2_Sub1_1 = arg0;
		return local17;
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)V")
	public static void method5128() {
		@Pc(9) int[] local9 = new int[Static6.aClass92_1.anInt2968];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static6.aClass92_1.anInt2968; local13++) {
			@Pc(20) Class197 local20 = Static6.aClass92_1.method2673(local13);
			if (local20.anInt5236 >= 0 || local20.anInt5231 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static136.anIntArray135 = new int[local11];
		for (@Pc(44) int local44 = 0; local44 < local11; local44++) {
			Static136.anIntArray135[local44] = local9[local44];
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!np;Z)V")
	public static void method5130(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method5217();
		Static529.aClass163Array1 = new Class163[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static529.aClass163Array1[local14] = new Class163();
			Static529.aClass163Array1[local14].anInt4533 = arg0.method5217();
			Static529.aClass163Array1[local14].aString28 = arg0.method5210();
		}
		Static245.anInt4334 = arg0.method5217();
		Static24.anInt485 = arg0.method5217();
		Static320.anInt5439 = arg0.method5217();
		Static317.aClass119_Sub1Array1 = new Class119_Sub1[Static24.anInt485 + 1 - Static245.anInt4334];
		for (@Pc(70) int local70 = 0; local70 < Static320.anInt5439; local70++) {
			@Pc(80) int local80 = arg0.method5217();
			@Pc(88) Class119_Sub1 local88 = Static317.aClass119_Sub1Array1[local80] = new Class119_Sub1();
			local88.anInt3543 = arg0.method5175();
			local88.anInt3539 = arg0.method5186();
			local88.anInt3548 = local80 + Static245.anInt4334;
			local88.aString21 = arg0.method5210();
			local88.aString20 = arg0.method5210();
		}
		Static64.anInt1498 = arg0.method5186();
		Static49.aBoolean76 = true;
	}
}
