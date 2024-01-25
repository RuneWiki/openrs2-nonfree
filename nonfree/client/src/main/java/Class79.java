import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public final class Class79 {

	@OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
	private final int anInt2178;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Lclient!vj;I)V")
	public Class79(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt2178 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II)V")
	public void method1921(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt2178, 4864);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(CB)V")
	public void method1924(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt2178);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public void method1925() {
		OpenGL.glEndList();
	}
}
