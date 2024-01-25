import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	private final int anInt69;

	static {
		new Class142("", 73);
	}

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!jj;I)V")
	public Class3(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt69 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V")
	public void method205(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt69 + arg0, 4864);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(BC)V")
	public void method207(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt69);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
	public void method210() {
		OpenGL.glEndList();
	}
}
