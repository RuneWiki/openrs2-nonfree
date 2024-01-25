import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class63_Sub1 extends Class63 {

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class63_Sub1(@OriginalArg(0) Class22_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)V")
	@Override
	public void method9536() {
		super.aClass22_Sub1_43.method966(false);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9539(@OriginalArg(0) boolean arg0) {
		super.aClass22_Sub1_43.method966(true);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9540(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BII)V")
	@Override
	public void method9534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9538() {
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!rha;II)V")
	@Override
	public void method9535(@OriginalArg(0) Class125 arg0, @OriginalArg(2) int arg1) {
		super.aClass22_Sub1_43.method955(arg0);
		super.aClass22_Sub1_43.method894(arg1);
	}
}
