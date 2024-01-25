import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public final class Class358 {

	@OriginalMember(owner = "client!up", name = "i", descriptor = "I")
	private final int anInt9973;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Lclient!pq;I)V")
	public Class358(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt9973 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
	public void method8417() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IC)V")
	public void method8418(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt9973);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IB)V")
	public void method8419(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt9973 + arg0, 4864);
	}
}
