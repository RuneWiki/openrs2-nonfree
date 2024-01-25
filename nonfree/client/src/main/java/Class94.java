import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class94 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	private final int anInt2128;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lclient!ih;I)V")
	public Class94(@OriginalArg(0) Class117_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt2128 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(CI)V")
	public void method1738(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt2128 + arg0);
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
	public void method1744(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt2128, 4864);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	public void method1745() {
		OpenGL.glEndList();
	}
}
