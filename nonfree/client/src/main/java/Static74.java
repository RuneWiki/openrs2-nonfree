import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "()I")
	public static int method1131() {
		return aBoolean124 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "()V")
	public static void method1133() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glClientActiveTexture(method1131());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "()V")
	public static void method1134() {
		@Pc(1) GL local1 = Static283.aGL1;
		local1.glClientActiveTexture(method1131());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
