import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "m", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!aba", name = "u", descriptor = "[I")
	public static final int[] anIntArray6 = new int[14];

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IBILclient!ha;Lclient!qia;)V")
	public static void method65(@OriginalArg(3) Class33 arg0, @OriginalArg(4) Class276 arg1) {
		Static529.aClass276_54.method6910();
		if (Static378.aBoolean622) {
			return;
		}
		for (@Pc(24) Class3_Sub22 local24 = (Class3_Sub22) arg1.method6907(); local24 != null; local24 = (Class3_Sub22) arg1.method6912()) {
			@Pc(32) Class269 local32 = Static361.aClass115_3.method3752(local24.anInt4123);
			if (Static83.method5847(local32)) {
				@Pc(44) boolean local44 = Static552.method7798(local24, local32, arg0);
				if (local44) {
					Static576.method8018(local24, local32, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ILclient!gaa;Lclient!gaa;)V")
	public static void method66(@OriginalArg(1) Class108 arg0, @OriginalArg(2) Class108 arg1) {
		@Pc(12) Class3_Sub26 local12 = Static640.method8636(Static615.aClass344_121, Static403.aClass294_3);
		local12.aClass3_Sub15_Sub1_3.method8419(arg0.anInt4043);
		local12.aClass3_Sub15_Sub1_3.method8464(arg0.anInt4083);
		local12.aClass3_Sub15_Sub1_3.method8423(arg1.anInt4083);
		local12.aClass3_Sub15_Sub1_3.method8408(arg1.anInt4059);
		local12.aClass3_Sub15_Sub1_3.method8399(arg1.anInt4043);
		local12.aClass3_Sub15_Sub1_3.method8464(arg0.anInt4059);
		Static472.method5189(local12);
	}
}
