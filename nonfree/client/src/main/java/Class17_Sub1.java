import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!wga;)V")
	public Class17_Sub1(@OriginalArg(0) Class20_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(B)V")
	@Override
	public void method8057() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
	@Override
	public void method8063(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8062(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!du;I)V")
	@Override
	public void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super.aClass20_Sub2_22.method1484(arg1);
		super.aClass20_Sub2_22.method1557(arg0);
	}

	@OriginalMember(owner = "client!al", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method8067() {
		return false;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8058(@OriginalArg(0) boolean arg0) {
	}
}
