import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class6_Sub2_Sub2_Sub1 extends Class6_Sub2_Sub2 {

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!mc;Ljava/lang/Object;)V")
	public Class6_Sub2_Sub2_Sub1(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method577() {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method578() {
		return this.anObject1;
	}
}
