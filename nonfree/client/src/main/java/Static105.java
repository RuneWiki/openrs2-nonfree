import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dia", name = "P", descriptor = "[Lclient!ds;")
	public static Class68[] aClass68Array1;

	@OriginalMember(owner = "client!dia", name = "Q", descriptor = "Lclient!ql;")
	public static Class154 aClass154_1;

	@OriginalMember(owner = "client!dia", name = "F", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_35 = new Class268(115, 3);

	@OriginalMember(owner = "client!dia", name = "O", descriptor = "Lclient!oo;")
	public static final Class244 aClass244_4 = new Class244(10, 8);

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I[BZLclient!no;)Lclient!dw;")
	public static Class70 method1740(@OriginalArg(1) byte[] arg0, @OriginalArg(3) Class100_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static580.anIntArray590, 0);
		if (Static580.anIntArray590[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class70(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!dia", name = "b", descriptor = "(II)Lclient!gq;")
	public static Class120 method1741(@OriginalArg(0) int arg0) {
		@Pc(10) Class120 local10 = (Class120) Static494.aClass166_46.method4805((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static249.aClass353_45.method8404(0, arg0);
		local10 = new Class120();
		if (local27 != null) {
			local10.method3397(new Class6_Sub40(local27));
		}
		local10.method3391();
		Static494.aClass166_46.method4803(local10, (long) arg0);
		return local10;
	}
}
