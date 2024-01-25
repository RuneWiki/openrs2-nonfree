import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class110 {

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
	private final int anInt3236;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!rl;I)V")
	public Class110(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3236 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II)V")
	public void method2674(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt3236, 4864);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)V")
	public void method2676() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BC)V")
	public void method2677(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt3236);
	}
}
