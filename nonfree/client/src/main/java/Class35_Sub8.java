import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class35_Sub8 extends Class35 {

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class35_Sub8(@OriginalArg(0) Class9_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)V")
	@Override
	public void method7419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7416(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub3_41.method6662(true);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IILclient!jl;)V")
	@Override
	public void method7420(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1) {
		super.aClass9_Sub3_41.method6701(arg1);
		super.aClass9_Sub3_41.method6670(arg0);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7414() {
		return true;
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
	@Override
	public void method7418() {
		super.aClass9_Sub3_41.method6662(false);
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7417(@OriginalArg(1) boolean arg0) {
	}
}
