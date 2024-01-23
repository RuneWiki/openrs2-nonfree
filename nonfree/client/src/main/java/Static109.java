import java.nio.FloatBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!id", name = "f", descriptor = "I")
	private static int anInt2286 = 2;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
	public static void method1757() {
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "()I")
	public static int method1758() {
		return anInt2286;
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public static void method1760(@OriginalArg(0) int arg0) {
		anInt2286 = arg0;
	}

	@OriginalMember(owner = "client!id", name = "d", descriptor = "()V")
	public static void method1761() {
		@Pc(1) GL local1 = Static178.aGL1;
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
