import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class2_Sub6_Sub5_Sub2 extends Class2_Sub6_Sub5 {

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject15;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub6_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject15 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6812() {
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method6810() {
		return this.anObject15;
	}
}
