import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public abstract class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
	public final int anInt5539;

	@OriginalMember(owner = "client!wv", name = "y", descriptor = "Lclient!cg;")
	public final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!cg;I)V")
	protected Class1_Sub2_Sub9(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1) {
		this.anInt5539 = arg1;
		this.anInterface2_3 = arg0;
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(B)Z")
	public abstract boolean method4433();

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4434();
}
