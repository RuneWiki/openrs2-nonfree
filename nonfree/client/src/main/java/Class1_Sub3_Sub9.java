import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public abstract class Class1_Sub3_Sub9 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "Lclient!dc;")
	public final Interface3 anInterface3_3;

	@OriginalMember(owner = "client!wca", name = "v", descriptor = "I")
	public final int anInt5382;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lclient!dc;I)V")
	protected Class1_Sub3_Sub9(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_3 = arg0;
		this.anInt5382 = arg1;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)Z")
	public abstract boolean method4596();

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4597();
}
