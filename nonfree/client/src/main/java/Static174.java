import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
	public static int anInt10833;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!saa;")
	public static final Class310 aClass310_20 = new Class310(0, 1);

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!dt;")
	public static final Class77 aClass77_11 = new Class77("runescape", "RuneScape", 0);

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_73 = new Class262();

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
	public static int anInt10838 = -1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
	public static int method9028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static676.anIntArrayArray62 == null ? 0 : Static676.anIntArrayArray62[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([Lclient!mv;ILclient!qfa;)Lclient!hw;")
	public static Class152 method9031(@OriginalArg(0) Class237[] arg0, @OriginalArg(2) Class137_Sub3 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] == null || arg0[local7].aLong192 <= 0L) {
				return null;
			}
		}
		@Pc(33) long local33 = OpenGL.glCreateProgramObjectARB();
		for (@Pc(35) int local35 = 0; local35 < arg0.length; local35++) {
			OpenGL.glAttachObjectARB(local33, arg0[local35].aLong192);
		}
		OpenGL.glLinkProgramARB(local33);
		OpenGL.glGetObjectParameterivARB(local33, 35714, Static494.anIntArray652, 0);
		if (Static494.anIntArray652[0] == 0) {
			if (Static494.anIntArray652[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			OpenGL.glGetObjectParameterivARB(local33, 35716, Static494.anIntArray652, 1);
			if (Static494.anIntArray652[1] > 1) {
				@Pc(81) byte[] local81 = new byte[Static494.anIntArray652[1]];
				OpenGL.glGetInfoLogARB(local33, Static494.anIntArray652[1], Static494.anIntArray652, 0, local81, 0);
				System.out.println(new String(local81));
			}
			if (Static494.anIntArray652[0] == 0) {
				for (@Pc(105) int local105 = 0; local105 < arg0.length; local105++) {
					OpenGL.glDetachObjectARB(local33, arg0[local105].aLong192);
				}
				OpenGL.glDeleteObjectARB(local33);
				return null;
			}
		}
		return new Class152(arg1, local33, arg0);
	}
}
