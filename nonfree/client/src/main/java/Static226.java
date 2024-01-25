import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!in", name = "od", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!in", name = "hd", descriptor = "Lclient!hw;")
	public static final Class148 aClass148_3 = new Class148();

	@OriginalMember(owner = "client!in", name = "nd", descriptor = "Lclient!go;")
	public static final Class121 aClass121_5 = new Class121(0, 2, 2, 1);

	@OriginalMember(owner = "client!in", name = "pd", descriptor = "Lclient!em;")
	public static final Class83 aClass83_91 = new Class83(53, -1);

	@OriginalMember(owner = "client!in", name = "qd", descriptor = "[B")
	public static final byte[] aByteArray34 = new byte[2048];

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BLclient!lj;ILjava/lang/String;)Lclient!n;")
	public static Class230 method3357(@OriginalArg(1) Class78_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(11) long local11 = OpenGL.glCreateShaderObjectARB(arg1);
		OpenGL.glShaderSourceARB(local11, arg2);
		OpenGL.glCompileShaderARB(local11);
		OpenGL.glGetObjectParameterivARB(local11, 35713, Static57.anIntArray51, 0);
		if (Static57.anIntArray51[0] == 0) {
			if (Static57.anIntArray51[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			OpenGL.glGetObjectParameterivARB(local11, 35716, Static57.anIntArray51, 1);
			if (Static57.anIntArray51[1] > 1) {
				@Pc(55) byte[] local55 = new byte[Static57.anIntArray51[1]];
				OpenGL.glGetInfoLogARB(local11, Static57.anIntArray51[1], Static57.anIntArray51, 0, local55, 0);
				System.out.println(new String(local55));
			}
			if (Static57.anIntArray51[0] == 0) {
				OpenGL.glDeleteObjectARB(local11);
				return null;
			}
		}
		return new Class230(arg0, local11, arg1);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!laa;B)[Lclient!baa;")
	public static Class19[] method3367(@OriginalArg(0) Class198 arg0) {
		if (!arg0.method4286()) {
			return new Class19[0];
		}
		@Pc(16) Class191 local16 = arg0.method4302();
		while (local16.anInt5014 == 0) {
			Static408.method5841(10L);
		}
		if (local16.anInt5014 == 2) {
			return new Class19[0];
		}
		@Pc(40) int[] local40 = (int[]) local16.anObject11;
		@Pc(46) Class19[] local46 = new Class19[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(54) Class19 local54 = new Class19();
			local46[local48] = local54;
			local54.anInt637 = local40[local48 << 2];
			local54.anInt642 = local40[(local48 << 2) + 1];
			local54.anInt639 = local40[(local48 << 2) + 2];
			local54.anInt640 = local40[(local48 << 2) + 3];
		}
		return local46;
	}
}
