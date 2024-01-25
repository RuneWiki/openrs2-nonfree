import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bga", name = "j", descriptor = "Lclient!jj;")
	public static final Class187 aClass187_5 = new Class187();

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "([BLclient!tia;IB)Lclient!wja;")
	public static Class394 method8304(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class100_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(17) int local17 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local17);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static415.anIntArray418, 0);
		if (Static415.anIntArray418[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class394(arg1, 34336, local17);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "(B)V")
	public static void method8306() {
		@Pc(7) int local7 = 0;
		if (Static577.aClass5_Sub19_25 != null) {
			local7 = Static577.aClass5_Sub19_25.aClass17_Sub26_1.method8454();
		}
		@Pc(36) int local36;
		@Pc(53) int local53;
		if (local7 == 2) {
			local36 = Static166.anInt3250 > 800 ? 800 : Static166.anInt3250;
			Static304.anInt5288 = (Static166.anInt3250 - local36) / 2;
			Static85.anInt9921 = local36;
			local53 = Static249.anInt4342 > 600 ? 600 : Static249.anInt4342;
			Static256.anInt4629 = local53;
			Static517.anInt8215 = 0;
		} else if (local7 == 1) {
			local36 = Static166.anInt3250 <= 1024 ? Static166.anInt3250 : 1024;
			Static85.anInt9921 = local36;
			Static304.anInt5288 = (Static166.anInt3250 - local36) / 2;
			local53 = Static249.anInt4342 <= 768 ? Static249.anInt4342 : 768;
			Static256.anInt4629 = local53;
			Static517.anInt8215 = 0;
		} else {
			Static517.anInt8215 = 0;
			Static304.anInt5288 = 0;
			Static256.anInt4629 = Static249.anInt4342;
			Static85.anInt9921 = Static166.anInt3250;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method8307(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static600.method8238(Static361.method5252(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
