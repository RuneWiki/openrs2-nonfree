import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class1_Sub3_Sub9_Sub1 extends Class1_Sub3_Sub9 {

	@OriginalMember(owner = "client!ih", name = "G", descriptor = "Ljava/lang/Object;")
	private final Object anObject12;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!dc;Ljava/lang/Object;I)V")
	public Class1_Sub3_Sub9_Sub1(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject12 = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4597() {
		return this.anObject12;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method4596() {
		return false;
	}
}
