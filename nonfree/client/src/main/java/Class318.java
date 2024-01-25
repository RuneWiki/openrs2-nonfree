import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class318 {

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
	private final int anInt9336;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!te;I)V")
	public Class318(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt9336 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(CB)V")
	public void method7877(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt9336);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
	public void method7880(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt9336 + arg0, 4864);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public void method7881() {
		OpenGL.glEndList();
	}
}
