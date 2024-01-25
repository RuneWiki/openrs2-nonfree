import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public final class Class46_Sub8 extends Class46 {

	@OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class46_Sub8(@OriginalArg(0) Class45_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7200(@OriginalArg(1) boolean arg0) {
		super.aClass45_Sub3_40.method7501(true);
	}

	@OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
	@Override
	public void method7205() {
		super.aClass45_Sub3_40.method7501(false);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(IILclient!av;)V")
	@Override
	public void method7208(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1) {
		super.aClass45_Sub3_40.method7475(arg1);
		super.aClass45_Sub3_40.method7500(arg0);
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7207() {
		return true;
	}

	@OriginalMember(owner = "client!pda", name = "a", descriptor = "(III)V")
	@Override
	public void method7202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
