import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
	private static int anInt4593 = 2;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	public static void method3617() {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method3619(@OriginalArg(0) int arg0) {
		anInt4593 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()I")
	public static int method3620() {
		return anInt4593;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
	public static void method3621() {
		@Pc(1) GL local1 = Static277.aGL1;
		if (local1.isExtensionAvailable("GL_ARB_point_parameters")) {
			@Pc(20) float[] local20 = new float[] { 1.0F, 0.0F, 5.0E-7F };
			local1.glPointParameterfvARB(33065, local20, 0);
			@Pc(28) FloatBuffer local28 = FloatBuffer.allocate(1);
			local1.glGetFloatv(33063, local28);
			@Pc(36) float local36 = local28.get(0);
			if (local36 > 64.0F) {
				local36 = 64.0F;
			}
			local1.glPointParameterfARB(33062, 1.0F);
			local1.glPointParameterfARB(33063, local36);
		}
		if (local1.isExtensionAvailable("GL_ARB_point_sprite")) {
		}
	}
}
