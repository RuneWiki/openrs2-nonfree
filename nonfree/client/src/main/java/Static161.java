import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
	public static void method2489() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glClientActiveTexture(method2490());
		local1.glEnableClientState(32888);
		local1.glClientActiveTexture(33984);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public static int method2490() {
		return aBoolean225 ? 33986 : 33985;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()V")
	public static void method2491() {
		@Pc(1) GL local1 = Static240.aGL1;
		local1.glClientActiveTexture(method2490());
		local1.glDisableClientState(32888);
		local1.glClientActiveTexture(33984);
	}
}
