import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
	public static void method2011() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glClientActiveTexture(method2013());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "()V")
	public static void method2012() {
		@Pc(1) GL local1 = Static291.aGL1;
		local1.glClientActiveTexture(method2013());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!je", name = "f", descriptor = "()I")
	public static int method2013() {
		return aBoolean190 ? 33986 : 33985;
	}
}
