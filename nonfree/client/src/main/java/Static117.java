import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "Z")
	public static boolean aBoolean202 = false;

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()I")
	public static int method1914() {
		return aBoolean202 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "()V")
	public static void method1915() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glClientActiveTexture(method1914());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "()V")
	public static void method1916() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glClientActiveTexture(method1914());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
