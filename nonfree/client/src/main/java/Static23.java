import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	public static void method314() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glClientActiveTexture(method315());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "()I")
	public static int method315() {
		return aBoolean21 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "()V")
	public static void method316() {
		@Pc(1) GL local1 = Static94.aGL1;
		local1.glClientActiveTexture(method315());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
