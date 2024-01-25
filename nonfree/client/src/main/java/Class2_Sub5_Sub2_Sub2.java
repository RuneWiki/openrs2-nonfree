import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class2_Sub5_Sub2_Sub2 extends Class2_Sub5_Sub2 {

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject6;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!jo;Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub2_Sub2(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject6 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2955() {
		return this.anObject6;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method2956() {
		return false;
	}
}
