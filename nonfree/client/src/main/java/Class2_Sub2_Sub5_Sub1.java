import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public final class Class2_Sub2_Sub5_Sub1 extends Class2_Sub2_Sub5 {

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "Ljava/lang/Object;")
	private final Object anObject4;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub2_Sub5_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject4 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4971() {
		return this.anObject4;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4970() {
		return false;
	}
}
