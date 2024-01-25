import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class Class7_Sub1_Sub9 extends Class7_Sub1 {

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "Lclient!pc;")
	public final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!pc;)V")
	protected Class7_Sub1_Sub9(@OriginalArg(0) Interface5 arg0) {
		this.anInterface5_3 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)Z")
	public abstract boolean method4766();

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4768();
}
