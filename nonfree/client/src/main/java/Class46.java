import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class46 {

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
	private final int anInt933;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lclient!qg;I)V")
	public Class46(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt933 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
	public void method778(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt933 + arg0, 4864);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	public void method779() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(CI)V")
	public void method781(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt933 + arg0);
	}
}
