import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public final class Class251 {

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
	private final int anInt7384;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(Lclient!gia;I)V")
	public Class251(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt7384 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V")
	public void method6183() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(CB)V")
	public void method6186(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7384);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V")
	public void method6187(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt7384 + arg0, 4864);
	}
}
