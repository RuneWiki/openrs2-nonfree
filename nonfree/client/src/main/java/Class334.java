import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public final class Class334 {

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
	private final int anInt9864;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!kfa;I)V")
	public Class334(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt9864 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)V")
	public void method7573(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt9864, 4864);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	public void method7574() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IC)V")
	public void method7575(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt9864);
	}
}
