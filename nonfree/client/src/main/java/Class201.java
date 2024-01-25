import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class201 {

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
	private final int anInt6009;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Lclient!os;I)V")
	public Class201(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt6009 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CZ)V")
	public void method5132(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt6009);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
	public void method5135(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt6009, 4864);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	public void method5136() {
		OpenGL.glEndList();
	}
}
