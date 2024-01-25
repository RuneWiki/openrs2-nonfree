import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public final class Class113 {

	@OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
	private final int anInt2989;

	@OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lclient!vf;I)V")
	public Class113(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt2989 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)V")
	public void method2789(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt2989, 4864);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Z)V")
	public void method2790() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(IC)V")
	public void method2793(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt2989);
	}
}
