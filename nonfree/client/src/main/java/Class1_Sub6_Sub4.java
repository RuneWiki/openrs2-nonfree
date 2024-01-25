import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class Class1_Sub6_Sub4 extends Class1_Sub6 {

	@OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
	public final int anInt7023;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "Lclient!qt;")
	public final Interface17 anInterface17_3;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!qt;I)V")
	protected Class1_Sub6_Sub4(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1) {
		this.anInt7023 = arg1;
		this.anInterface17_3 = arg0;
	}

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "(B)Z")
	public abstract boolean method5583();

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5584();
}
