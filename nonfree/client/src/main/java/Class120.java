import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class120 {

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
	private final int anInt3427;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!bo;I)V")
	public Class120(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3427 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	public void method2781() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(CI)V")
	public void method2782(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt3427);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)V")
	public void method2784(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3427 + arg0, 4864);
	}
}
