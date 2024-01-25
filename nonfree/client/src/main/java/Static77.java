import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
	public static int anInt1100 = 0;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ci", name = "o", descriptor = "[I")
	public static final int[] anIntArray64 = new int[32];

	@OriginalMember(owner = "client!ci", name = "q", descriptor = "F")
	public static float aFloat10 = 1.0F;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;BZI)V")
	public static void method1011(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		Static532.method7473();
		if (arg2 == 0) {
			Static208.aClass65_7 = Static208.method3307(0, Static172.aClass5_Sub50_14.aClass12_Sub6_1.method1989() * 2, Static141.aCanvas7, Static305.aClass390_77, Static476.anInterface4_10);
			if (arg0 != null) {
				Static208.aClass65_7.GA(0);
				@Pc(31) Class247 local31 = Static244.method4626(Static536.aClass390_104, Static575.anInt9390);
				@Pc(40) Class73 local40 = Static208.aClass65_7.method6886(local31, Static689.method8535(Static257.aClass390_60, Static575.anInt9390));
				Static236.method3643();
				Static270.method4168(arg0, Static208.aClass65_7, local40, true, local31);
			}
		} else {
			@Pc(54) Class65 local54 = null;
			@Pc(82) Class73 local82;
			if (arg0 != null) {
				local54 = Static208.method3307(0, 0, Static141.aCanvas7, Static305.aClass390_77, Static476.anInterface4_10);
				local54.GA(0);
				@Pc(73) Class247 local73 = Static244.method4626(Static536.aClass390_104, Static575.anInt9390);
				local82 = local54.method6886(local73, Static689.method8535(Static257.aClass390_60, Static575.anInt9390));
				Static236.method3643();
				Static270.method4168(arg0, local54, local82, true, local73);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static208.aClass65_7 = Static208.method3307(arg2, Static172.aClass5_Sub50_14.aClass12_Sub6_1.method1989() * 2, Static141.aCanvas7, Static305.aClass390_77, Static476.anInterface4_10);
					if (arg0 != null) {
						local54.GA(0);
						@Pc(115) Class247 local115 = Static244.method4626(Static536.aClass390_104, Static575.anInt9390);
						@Pc(124) Class73 local124 = local54.method6886(local115, Static689.method8535(Static257.aClass390_60, Static575.anInt9390));
						Static236.method3643();
						Static270.method4168(arg0, local54, local124, true, local115);
					}
					if (Static208.aClass65_7.method6953()) {
						@Pc(138) boolean local138 = true;
						try {
							local138 = Static580.aClass5_Sub30_1.anInt4762 > 256;
						} catch (@Pc(150) Throwable local150) {
						}
						@Pc(156) Class5_Sub14 local156;
						if (local138) {
							local156 = Static208.aClass65_7.method6954(146800640);
						} else {
							local156 = Static208.aClass65_7.method6954(104857600);
						}
						Static208.aClass65_7.method6921(local156);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(166) Throwable local166) {
					@Pc(171) int local171 = Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616();
					if (local171 == 2) {
						Static637.aBoolean879 = true;
					}
					Static172.aClass5_Sub50_14.method7531(0, Static172.aClass5_Sub50_14.aClass12_Sub16_2);
					method1011(arg0, arg1, local171);
					@Pc(190) Object local190 = null;
					var14 = false;
				} finally {
					if (var14) {
						local82 = null;
						if (local54 != null) {
							try {
								local54.method6923();
							} catch (@Pc(342) Throwable local342) {
							}
						}
					}
				}
				if (local54 != null) {
					try {
						local54.method6923();
					} catch (@Pc(322) Throwable local322) {
					}
				}
				return;
			}
			local82 = null;
			if (local54 != null) {
				try {
					local54.method6923();
				} catch (@Pc(332) Throwable local332) {
				}
			}
		}
		Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3617(!arg1);
		Static172.aClass5_Sub50_14.method7531(arg2, Static172.aClass5_Sub50_14.aClass12_Sub16_2);
		Static352.method8971();
		Static208.aClass65_7.method6913();
		Static208.aClass65_7.X(32);
		Static546.aClass254_8 = Static208.aClass65_7.method6955();
		Static109.aClass254_2 = Static208.aClass65_7.method6955();
		Static282.method4537();
		Static208.aClass65_7.method6914(Static172.aClass5_Sub50_14.aClass12_Sub26_1.method7550() == 1);
		if (Static208.aClass65_7.method6884()) {
			Static477.method6823(Static172.aClass5_Sub50_14.aClass12_Sub15_1.method3450() == 1);
		}
		Static159.method572(Static208.aClass65_7, Static201.anInt3834 >> 3, Static626.anInt10238 >> 3);
		Static459.method6575();
		Static442.aClass310Array1 = null;
		Static244.aBoolean480 = false;
		Static592.aBoolean826 = true;
		Static517.method7322();
	}
}
