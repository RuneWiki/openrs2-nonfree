import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class41 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
	private final int anInt860;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!uca;I)V")
	public Class41(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt860 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(CI)V")
	public void method821(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt860 + arg0);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public void method822() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)V")
	public void method823(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt860 + arg0, 4864);
	}
}
