import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Z")
	public static boolean aBoolean313 = false;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "()V")
	public static void method3767() {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glClientActiveTexture(method3770());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "()V")
	public static void method3768() {
		@Pc(1) GL local1 = Static294.aGL1;
		local1.glClientActiveTexture(method3770());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "()I")
	public static int method3770() {
		return aBoolean313 ? 33986 : 33985;
	}
}
