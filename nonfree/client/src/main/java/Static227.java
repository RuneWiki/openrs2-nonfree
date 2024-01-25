import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_71 = new Class286(77, -1);

	@OriginalMember(owner = "client!in", name = "c", descriptor = "(I)Lclient!bc;")
	public static Class15 method3534() {
		try {
			return new Class15_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class15) Class.forName("Class15_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(14) Throwable local14) {
				return new Class15_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZI)Z")
	public static boolean method3535(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
	public static void method3536() {
		for (@Pc(6) Class2_Sub5 local6 = (Class2_Sub5) Static375.aClass8_38.method210(); local6 != null; local6 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			if (Static42.method711(local6.anInt902)) {
				Static458.method6492(local6);
			}
		}
		if (Static347.anInt6255 == 1) {
			Static128.method2159();
			return;
		}
		Static50.method898(Static23.anInt642, Static202.anInt3966, Static306.anInt5446, Static344.anInt6231);
		@Pc(55) int local55 = Static83.aClass294_6.method6718(Static290.aClass198_26.method4365(Static52.anInt1264));
		for (@Pc(60) Class2_Sub5 local60 = (Class2_Sub5) Static375.aClass8_38.method210(); local60 != null; local60 = (Class2_Sub5) Static375.aClass8_38.method218()) {
			@Pc(66) int local66 = Static210.method3354(local60);
			if (local55 < local66) {
				local55 = local66;
			}
		}
		Static306.anInt5446 = (Static316.aBoolean475 ? 26 : 22) + Static347.anInt6255 * 16;
		Static23.anInt642 = local55 + 8;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B[BLclient!lm;I)Lclient!ml;")
	public static Class223 method3537(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class100_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local14);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static188.anIntArray217, 0);
		if (Static188.anIntArray217[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class223(arg1, 34336, local14);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
