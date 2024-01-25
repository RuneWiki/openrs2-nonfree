import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class117 {

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
	private final int anInt3252;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!ef;I)V")
	public Class117(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3252 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IC)V")
	public void method2645(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt3252);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public void method2647() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)V")
	public void method2648(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt3252 + arg0, 4864);
	}
}
