import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public final class Class34_Sub6 extends Class34 {

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!gj;)V")
	public Class34_Sub6(@OriginalArg(0) Class90_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return true;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass90_Sub3_19.method7624(arg0);
		super.aClass90_Sub3_19.method7620(arg1);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		super.aClass90_Sub3_19.method7572(false);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		super.aClass90_Sub3_19.method7572(true);
	}
}
