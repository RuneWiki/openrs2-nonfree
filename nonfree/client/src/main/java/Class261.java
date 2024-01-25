import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class261 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
	private final int anInt7660;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!qfa;I)V")
	public Class261(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt7660 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZC)V")
	public void method6285(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7660);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)V")
	public void method6286(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt7660 + arg0, 4864);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public void method6287() {
		OpenGL.glEndList();
	}
}
