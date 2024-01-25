import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class6_Sub1_Sub4_Sub1 extends Class6_Sub1_Sub4 {

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject9;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub1_Sub4_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject9 = arg0;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4029() {
		return false;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4027() {
		return this.anObject9;
	}
}
