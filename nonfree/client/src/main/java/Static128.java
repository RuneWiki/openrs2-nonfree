import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "()I")
	public static int method2102() {
		return aBoolean179 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "()V")
	public static void method2103() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glClientActiveTexture(method2102());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "()V")
	public static void method2105() {
		@Pc(1) GL local1 = Static178.aGL1;
		local1.glClientActiveTexture(method2102());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
