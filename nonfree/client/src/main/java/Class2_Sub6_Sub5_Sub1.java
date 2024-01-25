import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class2_Sub6_Sub5_Sub1 extends Class2_Sub6_Sub5 {

	@OriginalMember(owner = "client!jq", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!tm;Ljava/lang/Object;I)V")
	public Class2_Sub6_Sub5_Sub1(@OriginalArg(0) Interface23 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8120() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8119() {
		return false;
	}
}
