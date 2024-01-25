import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class6_Sub4_Sub8_Sub2 extends Class6_Sub4_Sub8 {

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!lo;Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub8_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4615() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4614() {
		return false;
	}
}
