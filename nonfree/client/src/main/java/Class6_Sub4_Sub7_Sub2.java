import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public final class Class6_Sub4_Sub7_Sub2 extends Class6_Sub4_Sub7 {

	@OriginalMember(owner = "client!kr", name = "C", descriptor = "Ljava/lang/Object;")
	private final Object anObject15;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub4_Sub7_Sub2(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject15 = arg0;
	}

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method4574() {
		return false;
	}

	@OriginalMember(owner = "client!kr", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4575() {
		return this.anObject15;
	}
}
