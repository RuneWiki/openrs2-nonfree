import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class150 {

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
	private final int anInt3720;

	static {
		new Class231("Select", "Auswählen", "Sélectionner", "Selecionar");
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!na;I)V")
	public Class150(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3720 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public void method3066() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZC)V")
	public void method3067(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt3720 + arg0);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)V")
	public void method3069(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt3720, 4864);
	}
}
