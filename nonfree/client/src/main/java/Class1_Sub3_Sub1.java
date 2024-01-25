import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public abstract class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "Lclient!vs;")
	public final Interface12 anInterface12_3;

	@OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
	public final int anInt5419;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!vs;I)V")
	protected Class1_Sub3_Sub1(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) int arg1) {
		this.anInterface12_3 = arg0;
		this.anInt5419 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4229();

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)Z")
	public abstract boolean method4230();
}
