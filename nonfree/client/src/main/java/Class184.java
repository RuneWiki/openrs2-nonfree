import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class184 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private final int anInt5214;

	static {
		new Class119("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!ur;I)V")
	public Class184(@OriginalArg(0) Class34_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt5214 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)V")
	public void method4094(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt5214, 4864);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public void method4095() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(CI)V")
	public void method4096(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt5214 + arg0);
	}
}
