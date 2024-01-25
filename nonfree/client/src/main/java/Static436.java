import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "[I")
	public static final int[] anIntArray578 = new int[1];

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!jj;Ljava/lang/String;I)Lclient!rv;")
	public static Class261 method6215(@OriginalArg(1) Class62_Sub3 arg0, @OriginalArg(2) String arg1) {
		@Pc(5) int local5 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local5);
		OpenGL.glProgramStringARB(34336, 34933, arg1);
		OpenGL.glGetIntegerv(34379, Static38.anIntArray66, 0);
		if (Static38.anIntArray66[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class261(arg0, 34336, local5);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZI)V")
	public static void method6218(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static110.aClass62_15 = Static390.method7056(Static300.aClass5_Sub28_Sub1_1.anInt4872 * 2, Static36.anInterface8_21, 0, Static209.aCanvas6, Static337.aClass117_149);
		} else {
			if (arg0) {
				Static110.aClass62_15 = Static390.method7056(0, Static36.anInterface8_21, 0, Static209.aCanvas6, Static337.aClass117_149);
				Static110.aClass62_15.Z(0);
				@Pc(41) Class256 local41 = Static242.method4123(Static357.anInt6718, Static145.aClass117_76);
				@Pc(50) Class13 local50 = Static110.aClass62_15.method7054(local41, Static551.method2429(Static533.aClass117_228, Static357.anInt6718));
				Static513.method7097(Static6.aClass40_2.method1063(Static194.anInt3737), local50, true);
				Static275.method4502();
				Static110.aClass62_15.method7061();
			}
			try {
				Static110.aClass62_15 = Static390.method7056(Static300.aClass5_Sub28_Sub1_1.anInt4872 * 2, Static36.anInterface8_21, arg1, Static209.aCanvas6, Static337.aClass117_149);
				if (Static110.aClass62_15.method7063()) {
					@Pc(81) boolean local81 = true;
					try {
						local81 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(93) Throwable local93) {
					}
					@Pc(99) Class5_Sub29 local99;
					if (local81) {
						local99 = Static110.aClass62_15.method7010(146800640);
					} else {
						local99 = Static110.aClass62_15.method7010(104857600);
					}
					Static110.aClass62_15.method6991(local99);
				}
			} catch (@Pc(110) Throwable local110) {
				Static110.aClass62_15 = Static390.method7056(0, Static36.anInterface8_21, 0, Static209.aCanvas6, Static337.aClass117_149);
				arg1 = 0;
			}
		}
		Static17.anInt459 = arg1;
		Static466.method6499();
		if (!Static110.aClass62_15.method7000()) {
			Static453.anInt7860 = 1;
		}
		Static110.aClass62_15.method6997(Static453.anInt7860);
		Static110.aClass62_15.method7001(0);
		Static110.aClass62_15.L(8);
		Static267.aClass78_3 = Static110.aClass62_15.method7011();
		Static434.aClass78_5 = Static110.aClass62_15.method7011();
		Static304.method4997();
		Static110.aClass62_15.method7058(!Static300.aClass5_Sub28_Sub1_1.aBoolean337);
		if (Static110.aClass62_15.method7050()) {
			Static194.method3241(Static300.aClass5_Sub28_Sub1_1.aBoolean335);
		}
		Static54.method1118(Static460.anInt7894 >> 3, Static235.anInt4493 >> 3, Static110.aClass62_15);
		Static81.method1438();
		Static495.aBoolean612 = false;
	}
}
