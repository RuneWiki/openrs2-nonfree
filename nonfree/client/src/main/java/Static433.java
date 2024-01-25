import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	public static int anInt7405;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "[Lclient!g;")
	public static final Class6_Sub4_Sub4[] aClass6_Sub4_Sub4Array5 = new Class6_Sub4_Sub4[14];

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "Z")
	public static boolean aBoolean498 = false;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
	public static void method6407() {
		Static649.method8846();
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;ZILclient!pq;)Lclient!cca;")
	public static Class48 method6408(@OriginalArg(0) String arg0, @OriginalArg(3) Class132_Sub3 arg1) {
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramStringARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static676.anIntArray716, 0);
		if (Static676.anIntArray716[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class48(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZI)V")
	public static void method6413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static308.anInt5228 = arg1;
		Static424.anInt7323 = arg0;
		if (Static353.anInt6019 == 0) {
			Static457.anInt7638 = Static424.anInt7323 + Static583.anInt9586 * 2;
			Static554.anInt9288 = Static308.anInt5228 + Static43.anInt964 * 2;
		} else if (Static353.anInt6019 == 1) {
			Static519.anInt8647 = Static230.anInt3916 + Static424.anInt7323 / Static208.anInt3594 + 2;
			Static415.anInt7233 = Static236.anInt4272 + Static308.anInt5228 / Static263.anInt4574 + 2;
			Static457.anInt7638 = Static208.anInt3594 * Static519.anInt8647;
			Static554.anInt9288 = Static263.anInt4574 * Static415.anInt7233;
			Static583.anInt9586 = Static457.anInt7638 - Static424.anInt7323 >> 1;
			Static43.anInt964 = Static554.anInt9288 - Static308.anInt5228 >> 1;
		} else if (Static353.anInt6019 == 2) {
			Static554.anInt9288 = Static308.anInt5228;
			Static457.anInt7638 = Static424.anInt7323;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIB)V")
	public static void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static280.anInt4829 = arg2;
		Static145.anInt2480 = arg1;
		Static26.anInt607 = arg3;
		Static345.anInt5929 = arg0;
	}
}
