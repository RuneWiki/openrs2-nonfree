import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public final class Class7_Sub8 extends Class7 {

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(Lclient!pga;)V")
	public Class7_Sub8(@OriginalArg(0) Class95_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
	@Override
	public void method8127() {
		super.aClass95_Sub3_23.method7029(false);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8125(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8135() {
		return true;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IILclient!lo;)V")
	@Override
	public void method8126(@OriginalArg(0) int arg0, @OriginalArg(2) Interface17 arg1) {
		super.aClass95_Sub3_23.method7112(arg1);
		super.aClass95_Sub3_23.method7026(arg0);
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method8128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8120(@OriginalArg(1) boolean arg0) {
		super.aClass95_Sub3_23.method7029(true);
	}
}
