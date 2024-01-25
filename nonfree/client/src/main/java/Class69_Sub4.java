import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class69_Sub4 extends Class69 {

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class69_Sub4(@OriginalArg(0) Class117_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5862(@OriginalArg(0) boolean arg0) {
		super.aClass117_Sub1_43.method2486(true);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
	@Override
	public void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5852() {
		return true;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!sv;IB)V")
	@Override
	public void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1) {
		super.aClass117_Sub1_43.method2504(arg0);
		super.aClass117_Sub1_43.method2535(arg1);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5853() {
		super.aClass117_Sub1_43.method2486(false);
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5861(@OriginalArg(0) boolean arg0) {
	}
}
