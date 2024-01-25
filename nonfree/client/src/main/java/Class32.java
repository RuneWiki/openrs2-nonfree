import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class32 {

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
	private final int anInt667;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!ug;I)V")
	public Class32(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt667 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(CI)V")
	public void method547(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt667);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
	public void method548() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)V")
	public void method550(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt667 + arg0, 4864);
	}
}
