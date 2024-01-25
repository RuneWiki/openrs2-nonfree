import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class131 {

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "[Lclient!aj;")
	private static final Class14[] aClass14Array1 = new Class14[32];

	@OriginalMember(owner = "client!hea", name = "f", descriptor = "I")
	private final int anInt3238;

	static {
		@Pc(92) Class14[] local92 = Static122.method1853();
		for (@Pc(94) int local94 = 0; local94 < local92.length; local94++) {
			aClass14Array1[local92[local94].anInt222] = local92[local94];
		}
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!pea;I)V")
	public Class131(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt3238 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(BC)V")
	public void method2752(@OriginalArg(1) char arg0) {
		OpenGL.glCallList(this.anInt3238 + arg0);
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
	public void method2754() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)V")
	public void method2755(@OriginalArg(1) int arg0) {
		OpenGL.glNewList(arg0 + this.anInt3238, 4864);
	}
}
