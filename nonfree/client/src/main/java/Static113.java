import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "Z")
	public static boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "()I")
	public static int method2036() {
		return aBoolean198 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "()V")
	public static void method2037() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glClientActiveTexture(method2036());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "()V")
	public static void method2039() {
		@Pc(1) GL local1 = Static71.aGL1;
		local1.glClientActiveTexture(method2036());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
