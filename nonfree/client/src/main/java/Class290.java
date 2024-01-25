import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public final class Class290 {

	@OriginalMember(owner = "client!pha", name = "e", descriptor = "I")
	private final int anInt7829;

	@OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(Lclient!uja;I)V")
	public Class290(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt7829 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(CI)V")
	public void method6987(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt7829 + arg0);
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)V")
	public void method6988() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(II)V")
	public void method6989(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt7829 + arg0, 4864);
	}
}
