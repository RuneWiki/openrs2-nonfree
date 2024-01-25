import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public final class Class3_Sub6_Sub4_Sub2 extends Class3_Sub6_Sub4 {

	@OriginalMember(owner = "client!qaa", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject14;

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lclient!wf;Ljava/lang/Object;I)V")
	public Class3_Sub6_Sub4_Sub2(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject14 = arg1;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6816() {
		return false;
	}

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6818() {
		return this.anObject14;
	}
}
