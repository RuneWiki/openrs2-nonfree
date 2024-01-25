import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public final class Class94 {

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
	private final int anInt2648;

	static {
		new Class198("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!tt;I)V")
	public Class94(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt2648 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
	public void method2130(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt2648, 4864);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZC)V")
	public void method2132(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt2648);
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public void method2133() {
		OpenGL.glEndList();
	}
}
