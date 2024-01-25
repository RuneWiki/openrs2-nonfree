import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public final class Class102 {

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
	private final int anInt2943;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!nq;I)V")
	public Class102(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt2943 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public void method2510() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BC)V")
	public void method2512(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt2943);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public void method2513(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt2943, 4864);
	}
}
