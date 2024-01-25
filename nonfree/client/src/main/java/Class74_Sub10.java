import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class74_Sub10 extends Class74 {

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class74_Sub10(@OriginalArg(0) Class87_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	@Override
	public void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
	@Override
	public void method8249() {
		super.aClass87_Sub1_22.method5114(false);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8245() {
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1) {
		super.aClass87_Sub1_22.method5079(arg0);
		super.aClass87_Sub1_22.method5062(arg1);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8253(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8251(@OriginalArg(0) boolean arg0) {
		super.aClass87_Sub1_22.method5114(true);
	}
}
