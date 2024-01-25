import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public final class Class91 {

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "I")
	private final int anInt2904;

	@OriginalMember(owner = "client!eha", name = "<init>", descriptor = "(Lclient!oea;I)V")
	public Class91(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt2904 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V")
	public void method2495() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(BC)V")
	public void method2497(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt2904);
	}

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(II)V")
	public void method2499(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt2904 + arg0, 4864);
	}
}
