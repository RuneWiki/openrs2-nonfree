import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class2_Sub11_Sub7_Sub1 extends Class2_Sub11_Sub7 {

	@OriginalMember(owner = "client!mr", name = "Y", descriptor = "Ljava/lang/Object;")
	private final Object anObject3;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!mn;Ljava/lang/Object;)V")
	public Class2_Sub11_Sub7_Sub1(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Object arg1) {
		super(arg0);
		this.anObject3 = arg1;
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method3992() {
		return false;
	}

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method3998() {
		return this.anObject3;
	}
}
