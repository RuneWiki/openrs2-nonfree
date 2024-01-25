import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!sq", name = "B", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_88 = new Class344(31, 7);

	@OriginalMember(owner = "client!sq", name = "cb", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_126 = new Class90(84, 8);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!r;BZLclient!ll;Lclient!la;Ljava/lang/String;)V")
	public static void method7114(@OriginalArg(0) Class7 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class198 arg2, @OriginalArg(4) Class45 arg3, @OriginalArg(5) String arg4) {
		@Pc(17) boolean local17 = !Static170.aBoolean264 || Static200.method3275();
		if (!local17) {
			return;
		}
		@Pc(31) int local31;
		@Pc(40) int local40;
		if (Static170.aBoolean264 && local17) {
			@Pc(138) Class198 local138 = Static576.aClass198_13;
			@Pc(144) Class45 local144 = arg0.method7837(local138, Static253.aClass103Array1);
			local31 = local138.method4761(250, null, arg4);
			local40 = local138.method4771(250, local138.anInt6044, arg4, null);
			@Pc(163) int local163 = Static466.aClass103_3.anInt3039;
			@Pc(167) int local167 = local163 + 4;
			local40 += local167 * 2;
			local31 += local167 * 2;
			if (Static344.anInt6633 > local40) {
				local40 = Static344.anInt6633;
			}
			if (local31 < Static267.anInt5382) {
				local31 = Static267.anInt5382;
			}
			@Pc(206) int local206 = Static371.aClass347_9.method7949(Static370.anInt7124, local31) + Static252.anInt5168;
			@Pc(214) int local214 = Static208.aClass214_7.method5005(Static324.anInt6378, local40) + Static250.anInt5112;
			arg0.method7808(Static174.aClass103_2, false).DA(Static148.aClass103_1.anInt3039 + local206, Static148.aClass103_1.anInt3041 + local214, local31 - Static148.aClass103_1.anInt3039 * 2, -(Static148.aClass103_1.anInt3041 * 2) + local40, 1, 0, 0);
			arg0.method7808(Static148.aClass103_1, true).method8051(local206, local214);
			Static148.aClass103_1.method2454();
			arg0.method7808(Static148.aClass103_1, true).method8051(local206 + local31 - local163, local214);
			Static148.aClass103_1.method2457();
			arg0.method7808(Static148.aClass103_1, true).method8051(local206 + local31 - local163, local40 + local214 - local163);
			Static148.aClass103_1.method2454();
			arg0.method7808(Static148.aClass103_1, true).method8051(local206, local40 + local214 - local163);
			Static148.aClass103_1.method2457();
			arg0.method7808(Static466.aClass103_3, true).method8043(local206, Static148.aClass103_1.anInt3041 + local214, local163, local40 - Static148.aClass103_1.anInt3041 * 2);
			Static466.aClass103_3.method2453();
			arg0.method7808(Static466.aClass103_3, true).method8043(Static148.aClass103_1.anInt3039 + local206, local214, local31 - Static148.aClass103_1.anInt3039 * 2, local163);
			Static466.aClass103_3.method2453();
			arg0.method7808(Static466.aClass103_3, true).method8043(local206 + local31 - local163, Static148.aClass103_1.anInt3041 + local214, local163, local40 - Static148.aClass103_1.anInt3041 * 2);
			Static466.aClass103_3.method2453();
			arg0.method7808(Static466.aClass103_3, true).method8043(local206 + Static148.aClass103_1.anInt3039, local40 + local214 - local163, local31 - Static148.aClass103_1.anInt3039 * 2, local163);
			Static466.aClass103_3.method2453();
			local144.method4852(1, null, null, local40 - local167 * 2, 0, 0, 0, -1, local214 + local167, -(local167 * 2) + local31, Static555.anInt10137 | 0xFF000000, arg4, 1, null, local206 + local167);
			Static430.method6395(local206, local31, local214, local40);
		} else {
			local31 = arg2.method4761(250, null, arg4);
			local40 = arg2.method4766(arg4, 250, null) * 13;
			arg0.J(6, 6, local31 + 8, local40 - -4 + 4, -16777216, 0);
			arg0.method7824(6, 6, local31 + 8, local40 + 4 + 4, -1, 0);
			arg3.method4852(1, null, null, local40, 0, 0, 0, -1, 10, local31, -1, arg4, 1, null, 10);
			Static430.method6395(6, local31 + 4 + 4, 6, local40 + 4 + 4);
		}
		if (arg1) {
			try {
				arg0.method7827();
			} catch (@Pc(434) Exception_Sub1 local434) {
			}
		}
	}
}
