import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class75_Sub8 extends Class75 {

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class75_Sub8(@OriginalArg(0) Class15_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8293(@OriginalArg(1) boolean arg0) {
		super.aClass15_Sub3_42.method4455(true);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	@Override
	public void method8290() {
		super.aClass15_Sub3_42.method4455(false);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8296(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!gq;)V")
	@Override
	public void method8289(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		super.aClass15_Sub3_42.method4377(arg1);
		super.aClass15_Sub3_42.method4432(arg0);
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8295() {
		return true;
	}
}
