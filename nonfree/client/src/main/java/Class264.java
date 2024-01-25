import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public final class Class264 {

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
	private final int anInt7416;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!dia;I)V")
	public Class264(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt7416 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZ)V")
	public void method6556(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt7416 + arg0, 4864);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(CB)V")
	public void method6557(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7416);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	public void method6558() {
		OpenGL.glEndList();
	}
}
