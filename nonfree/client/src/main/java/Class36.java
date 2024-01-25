import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public final class Class36 {

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
	private final int anInt1033;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!eq;I)V")
	public Class36(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt1033 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(CI)V")
	public void method1112(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt1033);
	}

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
	public void method1115() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IB)V")
	public void method1116(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt1033, 4864);
	}
}
