import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	private static int anInt3870 = 2;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
	public static void method3047(@OriginalArg(0) int arg0) {
		anInt3870 = arg0;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "()V")
	public static void method3048() {
		@Pc(1) GL local1 = Static240.aGL1;
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

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "()V")
	public static void method3049() {
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "()I")
	public static int method3050() {
		return anInt3870;
	}
}
