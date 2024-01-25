import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class269 {

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
	private final int anInt7848;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ht;I)V")
	public Class269(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt7848 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public void method6086(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt7848 + arg0, 4864);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IC)V")
	public void method6088(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt7848);
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	public void method6090() {
		OpenGL.glEndList();
	}
}
