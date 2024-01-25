import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public final class Class371 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	private final int anInt10410;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!pi;I)V")
	public Class371(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt10410 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	public void method8902(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt10410, 4864);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	public void method8904() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IC)V")
	public void method8907(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt10410 + arg0);
	}
}
