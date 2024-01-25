import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class279 {

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "I")
	private final int anInt8190;

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!kga;I)V")
	public Class279(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt8190 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)V")
	public void method6794(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt8190 + arg0, 4864);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BC)V")
	public void method6798(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt8190);
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)V")
	public void method6799() {
		OpenGL.glEndList();
	}
}
