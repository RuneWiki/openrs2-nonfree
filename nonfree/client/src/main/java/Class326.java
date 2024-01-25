import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class326 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	private final int anInt8877;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Lclient!no;I)V")
	public Class326(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt8877 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BC)V")
	public void method7292(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt8877 + arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V")
	public void method7293(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt8877 + arg0, 4864);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Z)V")
	public void method7295() {
		OpenGL.glEndList();
	}
}
