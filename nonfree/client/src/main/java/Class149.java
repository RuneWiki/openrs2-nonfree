import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class149 {

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
	private final int anInt4465;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!dw;I)V")
	public Class149(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt4465 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZI)V")
	public void method3800(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt4465 + arg0, 4864);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
	public void method3803() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZC)V")
	public void method3804(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt4465 + arg0);
	}
}
