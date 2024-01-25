import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!cga;")
	public static Class60 aClass60_40;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "[Lclient!wr;")
	public static Class406[] aClass406Array1;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_4 = new Class118(52);

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "[I")
	public static final int[] anIntArray158 = new int[50];

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "Lclient!os;")
	public static final Class281 aClass281_8 = new Class281(1, 2);

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B[BLclient!mba;I)Lclient!kf;")
	public static Class208 method1859(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class145_Sub1_Sub1 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(10) int local10 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local10);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static415.anIntArray520, 0);
		if (Static415.anIntArray520[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class208(arg1, 34336, local10);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
