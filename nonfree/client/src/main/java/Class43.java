import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class43 {

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
	private final int anInt1095;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!fd;I)V")
	public Class43(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt1095 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(CI)V")
	public void method989(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt1095);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZ)V")
	public void method990(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt1095 + arg0, 4864);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	public void method991() {
		OpenGL.glEndList();
	}
}
