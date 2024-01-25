import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class6_Sub4_Sub5_Sub2 extends Class6_Sub4_Sub5 {

	@OriginalMember(owner = "client!pv", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject14;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub5_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject14 = arg0;
	}

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method6328() {
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6327() {
		return this.anObject14;
	}
}
