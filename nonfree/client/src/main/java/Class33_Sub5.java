import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class33_Sub5 extends Class33 {

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class33_Sub5(@OriginalArg(0) Class55_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	@Override
	public void method6042(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "()V")
	@Override
	public void method6043() {
		this.aClass55_Sub1_42.method3637(false);
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
	@Override
	public void method6046(@OriginalArg(0) boolean arg0) {
		this.aClass55_Sub1_42.method3637(true);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!t;)V")
	@Override
	public void method6045(@OriginalArg(0) Class60 arg0) {
		this.aClass55_Sub1_42.method3677(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "()Z")
	@Override
	public boolean method6041() {
		return true;
	}
}
