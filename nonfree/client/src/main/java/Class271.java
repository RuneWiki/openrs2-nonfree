import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public final class Class271 {

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
	private final int anInt7105;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!us;I)V")
	public Class271(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt7105 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
	public void method6054() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZC)V")
	public void method6056(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7105);
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
	public void method6059(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt7105 + arg0, 4864);
	}
}
