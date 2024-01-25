import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public abstract class Class3_Sub6_Sub4 extends Class3_Sub6 {

	@OriginalMember(owner = "client!ria", name = "x", descriptor = "I")
	public final int anInt8104;

	@OriginalMember(owner = "client!ria", name = "y", descriptor = "Lclient!wf;")
	public final Interface25 anInterface25_3;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lclient!wf;I)V")
	protected Class3_Sub6_Sub4(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) int arg1) {
		this.anInt8104 = arg1;
		this.anInterface25_3 = arg0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)Z")
	public abstract boolean method6816();

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method6818();
}
