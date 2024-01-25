import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class3_Sub3_Sub6_Sub1 extends Class3_Sub3_Sub6 {

	@OriginalMember(owner = "client!ep", name = "B", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class3_Sub3_Sub6_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject1 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4739() {
		return false;
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4737() {
		return this.anObject1;
	}
}
