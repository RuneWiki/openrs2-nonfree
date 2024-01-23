import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "()V")
	public static void method3561() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glClientActiveTexture(method3562());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "()I")
	public static int method3562() {
		return aBoolean239 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "()V")
	public static void method3563() {
		@Pc(1) GL local1 = Static296.aGL1;
		local1.glClientActiveTexture(method3562());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
