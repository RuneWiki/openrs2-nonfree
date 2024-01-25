import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class53 {

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
	private final int anInt1677;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!ag;I)V")
	public Class53(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt1677 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(CI)V")
	public void method1511(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt1677);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(BI)V")
	public void method1513(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt1677 + arg0, 4864);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
	public void method1514() {
		OpenGL.glEndList();
	}
}
