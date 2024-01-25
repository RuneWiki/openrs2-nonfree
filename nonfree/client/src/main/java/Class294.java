import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public final class Class294 {

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
	private final int anInt8867;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lclient!gi;I)V")
	public Class294(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt8867 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(CZ)V")
	public void method7284(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt8867);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public void method7287(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(this.anInt8867 + arg0, 4864);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public void method7288() {
		OpenGL.glEndList();
	}
}
