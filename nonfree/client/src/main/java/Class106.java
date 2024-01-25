import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class106 {

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	private final int anInt2825;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!qj;I)V")
	public Class106(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt2825 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public void method2292(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt2825 + arg0, 4864);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public void method2293() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IC)V")
	public void method2294(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt2825 + arg0);
	}
}
