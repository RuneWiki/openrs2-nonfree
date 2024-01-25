import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class266 {

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
	private final int anInt7264;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!jaa;I)V")
	public Class266(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt7264 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IB)V")
	public void method5983(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt7264 + arg0, 4864);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BC)V")
	public void method5987(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7264);
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(Z)V")
	public void method5989() {
		OpenGL.glEndList();
	}
}
