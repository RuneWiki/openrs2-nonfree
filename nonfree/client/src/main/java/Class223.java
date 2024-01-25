import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public final class Class223 {

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	private final int anInt6128;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!vj;I)V")
	public Class223(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt6128 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public void method4784() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(CZ)V")
	public void method4785(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt6128 + arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IB)V")
	public void method4786(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt6128, 4864);
	}
}
