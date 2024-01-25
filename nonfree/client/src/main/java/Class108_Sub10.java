import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public final class Class108_Sub10 extends Class108 {

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!rv;)V")
	public Class108_Sub10(@OriginalArg(0) Class126_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		super.aClass126_Sub2_23.method5440(true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		super.aClass126_Sub2_23.method5449(arg0);
		super.aClass126_Sub2_23.method5513(arg1);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		super.aClass126_Sub2_23.method5440(false);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return true;
	}
}
