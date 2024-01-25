import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class Class2_Sub9_Sub3 extends Class2_Sub9 {

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "Lclient!ur;")
	public final Interface9 anInterface9_3;

	@OriginalMember(owner = "client!jq", name = "M", descriptor = "I")
	public final int anInt2739;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!ur;I)V")
	protected Class2_Sub9_Sub3(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) int arg1) {
		this.anInterface9_3 = arg0;
		this.anInt2739 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)Z")
	public abstract boolean method2499();

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2500();
}
