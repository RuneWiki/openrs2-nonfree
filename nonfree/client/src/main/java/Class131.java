import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class131 {

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
	private final int anInt3345;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!aq;I)V")
	public Class131(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3345 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)V")
	public void method3046(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt3345, 4864);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BC)V")
	public void method3047(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt3345 + arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	public void method3048() {
		OpenGL.glEndList();
	}
}
