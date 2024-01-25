import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public final class Class164 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	private final int anInt4498;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lclient!lf;I)V")
	public Class164(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt4498 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(CI)V")
	public void method3843(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt4498 + arg0);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
	public void method3846(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt4498 + arg0, 4864);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	public void method3848() {
		OpenGL.glEndList();
	}
}
