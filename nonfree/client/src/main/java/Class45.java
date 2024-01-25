import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class45 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_5;

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
	private final int anInt830;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!cg;I)V")
	public Class45(@OriginalArg(0) Class37_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass37_Sub1_5 = arg0;
		this.anInt830 = this.aClass37_Sub1_5.anOpengl1.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	public void method947(@OriginalArg(0) int arg0) {
		this.aClass37_Sub1_5.anOpengl1.glNewList(this.anInt830 + arg0, 4864);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(C)V")
	public void method948(@OriginalArg(0) char arg0) {
		this.aClass37_Sub1_5.anOpengl1.glCallList(this.anInt830 + arg0);
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "()V")
	public void method949() {
		this.aClass37_Sub1_5.anOpengl1.glEndList();
	}
}
