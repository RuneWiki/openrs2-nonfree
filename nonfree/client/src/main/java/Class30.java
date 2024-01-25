import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public final class Class30 {

	@OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
	private final int anInt947;

	@OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lclient!lea;I)V")
	public Class30(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt947 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(CI)V")
	public void method940(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt947);
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V")
	public void method941() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(II)V")
	public void method944(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt947, 4864);
	}
}
