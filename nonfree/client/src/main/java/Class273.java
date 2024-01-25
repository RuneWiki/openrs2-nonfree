import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public final class Class273 {

	@OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
	private final int anInt8373;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(Lclient!nv;I)V")
	public Class273(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt8373 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IB)V")
	public void method6909(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt8373, 4864);
	}

	@OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V")
	public void method6915() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(CI)V")
	public void method6916(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt8373);
	}
}
