import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public final class Class6_Sub2_Sub3_Sub1 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!iaa", name = "x", descriptor = "Ljava/lang/Object;")
	private final Object anObject14;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
	public Class6_Sub2_Sub3_Sub1(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		super(arg1);
		this.anObject14 = arg0;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method4998() {
		return false;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method4999() {
		return this.anObject14;
	}
}
