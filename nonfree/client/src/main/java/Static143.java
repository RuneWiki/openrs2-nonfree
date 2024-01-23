import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!la", name = "a", descriptor = "[I")
	private static int[] anIntArray230 = new int[2];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([Lclient!a;)Lclient!la;")
	public static Class99 method2266(@OriginalArg(0) Class1[] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			if (arg0[local1] == null || arg0[local1].anInt2 <= 0) {
				return null;
			}
		}
		@Pc(20) GL local20 = Static116.aGL1;
		@Pc(23) int local23 = local20.glCreateProgramObjectARB();
		@Pc(25) int local25;
		for (local25 = 0; local25 < arg0.length; local25++) {
			local20.glAttachObjectARB(local23, arg0[local25].anInt2);
		}
		local20.glLinkProgramARB(local23);
		local20.glGetObjectParameterivARB(local23, 35714, anIntArray230, 0);
		if (anIntArray230[0] == 0) {
			if (anIntArray230[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			local20.glGetObjectParameterivARB(local23, 35716, anIntArray230, 1);
			if (anIntArray230[1] > 1) {
				@Pc(74) byte[] local74 = new byte[anIntArray230[1]];
				local20.glGetInfoLogARB(local23, anIntArray230[1], anIntArray230, 0, local74, 0);
				System.out.println(new String(local74));
			}
			if (anIntArray230[0] == 0) {
				for (local25 = 0; local25 < arg0.length; local25++) {
					local20.glDetachObjectARB(local23, arg0[local25].anInt2);
				}
				local20.glDeleteObjectARB(local23);
				return null;
			}
		}
		return new Class99(local23, arg0);
	}
}
