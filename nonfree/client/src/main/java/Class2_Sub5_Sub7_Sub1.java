import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public final class Class2_Sub5_Sub7_Sub1 extends Class2_Sub5_Sub7 {

	@OriginalMember(owner = "client!hea", name = "E", descriptor = "Ljava/lang/Object;")
	private final Object anObject10;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!rf;Ljava/lang/Object;I)V")
	public Class2_Sub5_Sub7_Sub1(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject10 = arg1;
	}

	@OriginalMember(owner = "client!hea", name = "h", descriptor = "(I)Ljava/lang/Object;")
	@Override
	public Object method4488() {
		return this.anObject10;
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method4486() {
		return false;
	}
}
