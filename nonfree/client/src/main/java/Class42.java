import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public final class Class42 {

	@OriginalMember(owner = "client!bia", name = "g", descriptor = "I")
	private final int anInt795;

	@OriginalMember(owner = "client!bia", name = "<init>", descriptor = "(Lclient!ffa;I)V")
	public Class42(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt795 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IC)V")
	public void method758(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt795);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IB)V")
	public void method759(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt795 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
	public void method760() {
		OpenGL.glEndList();
	}
}
