import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class3_Sub7_Sub16_Sub2 extends Class3_Sub7_Sub16 {

	@OriginalMember(owner = "client!pda", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject14;

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!qaa;Ljava/lang/Object;I)V")
	public Class3_Sub7_Sub16_Sub2(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject14 = arg1;
	}

	@OriginalMember(owner = "client!pda", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6645() {
		return false;
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6647() {
		return this.anObject14;
	}
}
