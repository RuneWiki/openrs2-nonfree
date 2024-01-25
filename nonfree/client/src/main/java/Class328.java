import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public final class Class328 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	private final int anInt9683;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!ji;I)V")
	public Class328(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt9683 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	public void method7868() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	public void method7870(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt9683, 4864);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IC)V")
	public void method7872(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt9683);
	}
}
