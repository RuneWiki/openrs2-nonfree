import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class121 {

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
	private final int anInt3961;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ap;I)V")
	public Class121(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3961 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(CB)V")
	public void method3522(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt3961);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)V")
	public void method3523(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3961 + arg0, 4864);
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public void method3524() {
		OpenGL.glEndList();
	}
}
