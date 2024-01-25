import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class18 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	private final int anInt767;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!gk;I)V")
	public Class18(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt767 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)V")
	public void method718(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt767 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BC)V")
	public void method720(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt767);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
	public void method723() {
		OpenGL.glEndList();
	}
}
