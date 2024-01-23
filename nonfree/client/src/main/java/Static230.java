import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
	public static boolean aBoolean288 = false;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
	public static void method3553() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glClientActiveTexture(method3556());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "()V")
	public static void method3554() {
		@Pc(1) GL local1 = Static156.aGL1;
		local1.glClientActiveTexture(method3556());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "()I")
	public static int method3556() {
		return aBoolean288 ? 33986 : 33985;
	}
}
