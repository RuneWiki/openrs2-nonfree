import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class44_Sub7 extends Class44 {

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class44_Sub7(@OriginalArg(0) Class33_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7670(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub3_34.method6323(true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	@Override
	public void method7668(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7666() {
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
	@Override
	public void method7671(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!fha;)V")
	@Override
	public void method7667(@OriginalArg(0) int arg0, @OriginalArg(2) Class116 arg1) {
		super.aClass33_Sub3_34.method6340(arg1);
		super.aClass33_Sub3_34.method6336(arg0);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	@Override
	public void method7672() {
		super.aClass33_Sub3_34.method6323(false);
	}
}
