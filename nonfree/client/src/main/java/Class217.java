import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class217 {

	@OriginalMember(owner = "client!t", name = "a", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_35;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "I")
	private final int anInt5825;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lclient!qi;I)V")
	public Class217(@OriginalArg(0) Class82_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass82_Sub2_35 = arg0;
		this.anInt5825 = this.aClass82_Sub2_35.anOpengl2.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public void method5088(@OriginalArg(0) int arg0) {
		this.aClass82_Sub2_35.anOpengl2.glNewList(this.anInt5825 + arg0, 4864);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(C)V")
	public void method5089(@OriginalArg(0) char arg0) {
		this.aClass82_Sub2_35.anOpengl2.glCallList(this.anInt5825 + arg0);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	public void method5090() {
		this.aClass82_Sub2_35.anOpengl2.glEndList();
	}
}
