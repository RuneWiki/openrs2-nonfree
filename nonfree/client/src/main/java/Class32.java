import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class32 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
	private final int anInt746;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!od;I)V")
	public Class32(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt746 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ZC)V")
	public void method651(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt746);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)V")
	public void method657(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt746, 4864);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V")
	public void method658() {
		OpenGL.glEndList();
	}
}
