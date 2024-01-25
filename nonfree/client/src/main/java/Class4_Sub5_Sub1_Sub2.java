import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public final class Class4_Sub5_Sub1_Sub2 extends Class4_Sub5_Sub1 {

	@OriginalMember(owner = "client!hi", name = "I", descriptor = "Ljava/lang/Object;")
	private final Object anObject11;

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lclient!be;Ljava/lang/Object;I)V")
	public Class4_Sub5_Sub1_Sub2(@OriginalArg(0) Interface1 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject11 = arg1;
	}

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3332() {
		return this.anObject11;
	}

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method3330() {
		return false;
	}
}
