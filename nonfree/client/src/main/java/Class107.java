import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public final class Class107 {

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	private final int anInt3678;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!ac;I)V")
	public Class107(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3678 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V")
	public void method3154() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V")
	public void method3155(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt3678, 4864);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(CZ)V")
	public void method3156(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt3678);
	}
}
