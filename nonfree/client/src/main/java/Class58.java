import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public final class Class58 {

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
	private final int anInt1685;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!hk;I)V")
	public Class58(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt1685 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V")
	public void method1620() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(II)V")
	public void method1621(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt1685 + arg0, 4864);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(CI)V")
	public void method1625(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt1685 + arg0);
	}
}
