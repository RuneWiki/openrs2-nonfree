import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class3_Sub4_Sub6_Sub2 extends Class3_Sub4_Sub6 {

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!ut;Ljava/lang/Object;I)V")
	public Class3_Sub4_Sub6_Sub2(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method3848() {
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3849() {
		return this.anObject9;
	}
}
