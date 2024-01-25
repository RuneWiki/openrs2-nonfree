import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class51 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
	private final int anInt1323;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!uq;I)V")
	public Class51(@OriginalArg(0) Class122_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt1323 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(CI)V")
	public void method1248(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt1323);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V")
	public void method1250(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt1323 + arg0, 4864);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method1253() {
		OpenGL.glEndList();
	}
}
