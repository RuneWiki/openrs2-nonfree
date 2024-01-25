import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "I")
	private final int anInt342;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!mh;I)V")
	public Class11(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt342 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)V")
	public void method532(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt342, 4864);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IC)V")
	public void method534(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt342 + arg0);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public void method537() {
		OpenGL.glEndList();
	}
}
