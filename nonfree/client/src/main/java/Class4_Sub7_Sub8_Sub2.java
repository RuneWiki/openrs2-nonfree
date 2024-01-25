import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public final class Class4_Sub7_Sub8_Sub2 extends Class4_Sub7_Sub8 {

	@OriginalMember(owner = "client!im", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject27;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!hg;Ljava/lang/Object;I)V")
	public Class4_Sub7_Sub8_Sub2(@OriginalArg(0) Interface11 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject27 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3887() {
		return this.anObject27;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3886() {
		return false;
	}
}
