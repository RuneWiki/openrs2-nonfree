import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class93 {

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	private final int anInt2158;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!kv;I)V")
	public Class93(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt2158 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public void method1948() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
	public void method1950(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt2158, 4864);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BC)V")
	public void method1952(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(arg0 + this.anInt2158);
	}
}
