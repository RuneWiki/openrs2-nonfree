import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public final class Class169 {

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
	private final int anInt4477;

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lclient!rs;I)V")
	public Class169(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt4477 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BC)V")
	public void method4025(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt4477);
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
	public void method4027() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)V")
	public void method4029(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt4477, 4864);
	}
}
