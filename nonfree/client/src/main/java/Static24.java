import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Z")
	public static boolean aBoolean44 = false;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "()I")
	public static int method479() {
		return aBoolean44 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "()V")
	public static void method480() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glClientActiveTexture(method479());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "()V")
	public static void method481() {
		@Pc(1) GL local1 = Static60.aGL1;
		local1.glClientActiveTexture(method479());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
