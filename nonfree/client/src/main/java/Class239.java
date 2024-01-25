import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class239 {

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
	private final int anInt6662;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!da;I)V")
	public Class239(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt6662 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BI)V")
	public void method5221(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt6662, 4864);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	public void method5222() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IC)V")
	public void method5224(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt6662);
	}
}
