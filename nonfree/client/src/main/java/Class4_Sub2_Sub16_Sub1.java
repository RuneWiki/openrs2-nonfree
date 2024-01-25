import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public final class Class4_Sub2_Sub16_Sub1 extends Class4_Sub2_Sub16 {

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "Ljava/lang/Object;")
	private final Object anObject17;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!hf;Ljava/lang/Object;I)V")
	public Class4_Sub2_Sub16_Sub1(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject17 = arg1;
	}

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4973() {
		return this.anObject17;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4974() {
		return false;
	}
}
