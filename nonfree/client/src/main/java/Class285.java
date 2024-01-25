import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class285 {

	@OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
	private final int anInt7681;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!lj;I)V")
	public Class285(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt7681 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public void method6133() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IC)V")
	public void method6136(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt7681 + arg0);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)V")
	public void method6137(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt7681 + arg0, 4864);
	}
}
