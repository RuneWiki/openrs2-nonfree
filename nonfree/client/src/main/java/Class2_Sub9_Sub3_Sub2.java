import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public final class Class2_Sub9_Sub3_Sub2 extends Class2_Sub9_Sub3 {

	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Lclient!ur;Ljava/lang/Object;I)V")
	public Class2_Sub9_Sub3_Sub2(@OriginalArg(0) Interface9 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method2499() {
		return false;
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)Ljava/lang/Object;")
	@Override
	public Object method2500() {
		return this.anObject3;
	}
}
