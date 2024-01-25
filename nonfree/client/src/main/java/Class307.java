import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public final class Class307 {

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	private final int anInt8612;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lclient!er;I)V")
	public Class307(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt8612 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(CI)V")
	public void method6699(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt8612);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V")
	public void method6701(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt8612 + arg0, 4864);
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V")
	public void method6702() {
		OpenGL.glEndList();
	}
}
