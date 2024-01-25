import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public final class Class213 {

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
	private final int anInt5837;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!kd;I)V")
	public Class213(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt5837 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(CB)V")
	public void method4857(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt5837);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V")
	public void method4858(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt5837, 4864);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	public void method4862() {
		OpenGL.glEndList();
	}
}
