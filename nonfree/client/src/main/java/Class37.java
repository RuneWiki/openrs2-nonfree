import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class37 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private final int anInt735;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!vd;I)V")
	public Class37(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt735 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IC)V")
	public void method600(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt735);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V")
	public void method601(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt735, 4864);
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public void method606() {
		OpenGL.glEndList();
	}
}
