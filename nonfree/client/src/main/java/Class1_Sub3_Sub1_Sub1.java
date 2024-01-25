import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public final class Class1_Sub3_Sub1_Sub1 extends Class1_Sub3_Sub1 {

	@OriginalMember(owner = "client!ad", name = "O", descriptor = "Ljava/lang/Object;")
	private final Object anObject1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!vs;Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub1_Sub1(@OriginalArg(0) Interface12 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject1 = arg1;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4229() {
		return this.anObject1;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4230() {
		return false;
	}
}
