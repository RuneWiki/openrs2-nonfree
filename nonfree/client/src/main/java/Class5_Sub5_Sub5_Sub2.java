import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class5_Sub5_Sub5_Sub2 extends Class5_Sub5_Sub5 {

	@OriginalMember(owner = "client!vr", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject20;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!pt;Ljava/lang/Object;I)V")
	public Class5_Sub5_Sub5_Sub2(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject20 = arg1;
	}

	@OriginalMember(owner = "client!vr", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method8985() {
		return this.anObject20;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8986() {
		return false;
	}
}
