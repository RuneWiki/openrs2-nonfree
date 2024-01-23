import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "()V")
	public static void method451() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glClientActiveTexture(method452());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "()I")
	public static int method452() {
		return aBoolean33 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "()V")
	public static void method454() {
		@Pc(1) GL local1 = Static116.aGL1;
		local1.glClientActiveTexture(method452());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
