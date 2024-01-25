import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public final class Class204 {

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
	private final int anInt6152;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!en;I)V")
	public Class204(@OriginalArg(0) Class90_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt6152 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BC)V")
	public void method4982(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt6152 + arg0);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public void method4985(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt6152, 4864);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	public void method4987() {
		OpenGL.glEndList();
	}
}
