import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class4_Sub1_Sub1_Sub2 extends Class4_Sub1_Sub1 {

	@OriginalMember(owner = "client!cr", name = "N", descriptor = "Ljava/lang/Object;")
	private final Object anObject2;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!tp;Ljava/lang/Object;I)V")
	public Class4_Sub1_Sub1_Sub2(@OriginalArg(0) Interface8 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method1229() {
		return false;
	}

	@OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method1230() {
		return this.anObject2;
	}
}
