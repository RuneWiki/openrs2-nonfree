import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public final class Class6_Sub2_Sub10_Sub2 extends Class6_Sub2_Sub10 {

	@OriginalMember(owner = "client!qca", name = "F", descriptor = "Ljava/lang/Object;")
	private final Object anObject19;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!vm;Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub10_Sub2(@OriginalArg(0) Interface26 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject19 = arg1;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6997() {
		return false;
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method6996() {
		return this.anObject19;
	}
}
