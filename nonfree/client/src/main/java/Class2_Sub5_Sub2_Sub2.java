import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class2_Sub5_Sub2_Sub2 extends Class2_Sub5_Sub2 {

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub2_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject3 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method1877() {
		return this.anObject3;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method1871() {
		return false;
	}
}
