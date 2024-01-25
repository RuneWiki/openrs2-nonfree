import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public final class Class60_Sub6 extends Class60 {

	@OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class60_Sub6(@OriginalArg(0) Class14_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7478() {
		return true;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIB)V")
	@Override
	public void method7472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	@Override
	public void method7474() {
		super.aClass14_Sub3_42.method3931(false);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILclient!tj;)V")
	@Override
	public void method7475(@OriginalArg(0) int arg0, @OriginalArg(2) Class51 arg1) {
		super.aClass14_Sub3_42.method3985(arg1);
		super.aClass14_Sub3_42.method3925(arg0);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7476(@OriginalArg(0) boolean arg0) {
		super.aClass14_Sub3_42.method3931(true);
	}
}
