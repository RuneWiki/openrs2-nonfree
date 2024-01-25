import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class170 {

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
	private final int anInt5899;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!qo;I)V")
	public Class170(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt5899 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
	public void method5083() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(CI)V")
	public void method5086(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt5899 + arg0);
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BI)V")
	public void method5087(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt5899, 4864);
	}
}
