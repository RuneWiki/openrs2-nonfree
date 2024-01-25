import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread2;

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_139 = new Class288(94, 10);

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
	public static int anInt3825 = 0;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z")
	public static boolean method3205() {
		@Pc(12) boolean local12 = true;
		if (Static283.aClass329_7 == null) {
			if (Static79.aClass380_22.method8638(Static78.anInt1411)) {
				Static283.aClass329_7 = Static655.method7414(Static79.aClass380_22, Static78.anInt1411);
			} else {
				local12 = false;
			}
		}
		if (Static166.aClass329_3 == null) {
			if (Static79.aClass380_22.method8638(Static369.anInt5833)) {
				Static166.aClass329_3 = Static655.method7414(Static79.aClass380_22, Static369.anInt5833);
			} else {
				local12 = false;
			}
		}
		if (Static8.aClass329_1 == null) {
			if (Static79.aClass380_22.method8638(Static151.anInt2702)) {
				Static8.aClass329_1 = Static655.method7414(Static79.aClass380_22, Static151.anInt2702);
			} else {
				local12 = false;
			}
		}
		if (Static469.aClass256_2 == null) {
			if (Static141.aClass380_39.method8638(Static208.anInt3519)) {
				Static469.aClass256_2 = Static3.method8590(Static141.aClass380_39, Static208.anInt3519);
			} else {
				local12 = false;
			}
		}
		if (Static276.aClass329Array1 == null) {
			if (Static79.aClass380_22.method8638(Static208.anInt3519)) {
				Static276.aClass329Array1 = Static655.method7422(Static79.aClass380_22, Static208.anInt3519);
			} else {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZBI)V")
	public static void method3206(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg0) {
			@Pc(16) Class2_Sub40 local16 = Static464.method6285(Static251.aClass131_1, Static364.aClass179_76);
			local16.aClass2_Sub22_Sub2_2.method8500(arg1);
			Static528.method7295(local16);
		} else {
			Static300.method4136(Static174.aClass260_3, arg1, -1);
		}
	}
}
