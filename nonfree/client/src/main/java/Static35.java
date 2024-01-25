import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
	public static int anInt651;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_15 = new Class85("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_9 = new Class109(4);

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean44 = true;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public static void method572() {
		Static169.anInt6215 = 0;
		@Pc(17) int local17 = (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7) + Static172.anInt4394;
		@Pc(24) int local24 = (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7) + Static12.anInt3797;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static169.anInt6215 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static169.anInt6215 = 1;
		}
		if (Static169.anInt6215 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static169.anInt6215 = 0;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(CI)C")
	public static char method574(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
	public static void method575() {
		Static160.anInt3181 = 0;
		Class4_Sub3_Sub2.aClass103_139.method2751();
		Class4_Sub3_Sub2.aClass103_139.method2745(Static221.aClass5_Sub20_1);
		Static160.anInt3181++;
	}
}
