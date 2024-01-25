import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class203 {

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
	private final int anInt5303;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!ml;I)V")
	public Class203(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt5303 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	public void method4854() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(CB)V")
	public void method4855(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt5303 + arg0);
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IB)V")
	public void method4857(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt5303, 4864);
	}
}
