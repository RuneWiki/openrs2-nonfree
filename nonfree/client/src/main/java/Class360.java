import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public final class Class360 {

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
	private final int anInt9910;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!rda;I)V")
	public Class360(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt9910 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public void method8433(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt9910, 4864);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BC)V")
	public void method8434(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt9910 + arg0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public void method8436() {
		OpenGL.glEndList();
	}
}
