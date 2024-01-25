import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public final class Class329 {

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
	private final int anInt9398;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!kw;I)V")
	public Class329(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt9398 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Z)V")
	public void method8094() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
	public void method8097(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt9398 + arg0, 4864);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IC)V")
	public void method8098(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt9398);
	}
}
