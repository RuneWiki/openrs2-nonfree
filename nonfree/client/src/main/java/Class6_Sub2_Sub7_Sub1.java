import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public final class Class6_Sub2_Sub7_Sub1 extends Class6_Sub2_Sub7 {

	@OriginalMember(owner = "client!lia", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject17;

	@OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(Lclient!rc;Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub7_Sub1(@OriginalArg(0) Interface22 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject17 = arg1;
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method7670() {
		return this.anObject17;
	}

	@OriginalMember(owner = "client!lia", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7671() {
		return false;
	}
}
