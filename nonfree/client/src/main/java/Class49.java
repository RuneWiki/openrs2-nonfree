import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public final class Class49 {

	@OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
	private final int anInt1639;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class49(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt1639 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public void method1151() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(CI)V")
	public void method1153(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt1639);
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
	public void method1154(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt1639 + arg0, 4864);
	}
}
