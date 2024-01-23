import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Z")
	public static boolean aBoolean287 = false;

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "()V")
	public static void method3579() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glClientActiveTexture(method3581());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "()V")
	public static void method3580() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glClientActiveTexture(method3581());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "()I")
	public static int method3581() {
		return aBoolean287 ? 33986 : 33985;
	}
}
