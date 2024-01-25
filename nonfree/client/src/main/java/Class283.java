import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public final class Class283 {

	@OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
	private final int anInt7420;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!pc;I)V")
	public Class283(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt7420 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IC)V")
	public void method6453(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7420);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
	public void method6454() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IB)V")
	public void method6455(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt7420, 4864);
	}
}
