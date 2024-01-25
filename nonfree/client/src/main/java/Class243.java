import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class243 {

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
	private final int anInt6933;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!ck;I)V")
	public Class243(@OriginalArg(0) Class65_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt6933 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IC)V")
	public void method5740(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt6933 + arg0);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public void method5741() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V")
	public void method5742(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt6933, 4864);
	}
}
