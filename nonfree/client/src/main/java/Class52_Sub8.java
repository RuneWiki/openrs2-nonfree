import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class52_Sub8 extends Class52 {

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class52_Sub8(@OriginalArg(0) Class121_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!wq;I)V")
	@Override
	public void method7604(@OriginalArg(1) Class35 arg0, @OriginalArg(2) int arg1) {
		super.aClass121_Sub3_43.method5713(arg0);
		super.aClass121_Sub3_43.method5684(arg1);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	@Override
	public void method7598() {
		super.aClass121_Sub3_43.method5655(false);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7601() {
		return true;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7605(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub3_43.method5655(true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7603(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
