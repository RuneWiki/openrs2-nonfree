import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public final class Class144 {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	private final int anInt3675;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!bl;I)V")
	public Class144(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3675 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
	public void method3283(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3675 + arg0, 4864);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
	public void method3284() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BC)V")
	public void method3285(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt3675 + arg0);
	}
}
