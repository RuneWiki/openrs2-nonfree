import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class115 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!fu;")
	private final Class63_Sub2 aClass63_Sub2_22;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	private final int anInt3028;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!fu;I)V")
	public Class115(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass63_Sub2_22 = arg0;
		this.anInt3028 = this.aClass63_Sub2_22.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method2846(@OriginalArg(0) int arg0) {
		this.aClass63_Sub2_22.anOpengl2.glNewList(this.anInt3028 + arg0, 4864);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(C)V")
	public void method2847(@OriginalArg(0) char arg0) {
		this.aClass63_Sub2_22.anOpengl2.glCallList(this.anInt3028 + arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
	public void method2848() {
		this.aClass63_Sub2_22.anOpengl2.glEndList();
	}
}
