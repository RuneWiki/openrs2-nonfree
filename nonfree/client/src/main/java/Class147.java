import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class147 {

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_27;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private final int anInt4564;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!ig;I)V")
	public Class147(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass47_Sub2_27 = arg0;
		this.anInt4564 = this.aClass47_Sub2_27.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(C)V")
	public void method4034(@OriginalArg(0) char arg0) {
		this.aClass47_Sub2_27.anOpengl2.glCallList(this.anInt4564 + arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public void method4035(@OriginalArg(0) int arg0) {
		this.aClass47_Sub2_27.anOpengl2.glNewList(this.anInt4564 + arg0, 4864);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	public void method4036() {
		this.aClass47_Sub2_27.anOpengl2.glEndList();
	}
}
