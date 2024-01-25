import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class164 {

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
	private final int anInt5354;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!wh;I)V")
	public Class164(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt5354 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(CZ)V")
	public void method4788(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt5354);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	public void method4790() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)V")
	public void method4791(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt5354, 4864);
	}
}
