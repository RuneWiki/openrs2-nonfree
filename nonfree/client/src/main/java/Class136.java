import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class136 {

	@OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
	private final int anInt3545;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ok;I)V")
	public Class136(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3545 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IC)V")
	public void method2915(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt3545);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public void method2918() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
	public void method2920(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt3545 + arg0, 4864);
	}
}
