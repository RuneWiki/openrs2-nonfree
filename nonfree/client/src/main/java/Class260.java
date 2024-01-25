import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class260 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
	private final int anInt7335;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!bt;I)V")
	public Class260(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt7335 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IB)V")
	public void method5892(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt7335, 4864);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
	public void method5894() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(CB)V")
	public void method5895(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7335);
	}
}
