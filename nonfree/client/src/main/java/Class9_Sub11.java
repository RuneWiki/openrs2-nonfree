import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class9_Sub11 extends Class9 {

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class9_Sub11(@OriginalArg(0) Class7_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lclient!aj;II)V")
	@Override
	public void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
		super.aClass7_Sub1_23.method5694(arg0);
		super.aClass7_Sub1_23.method5757(arg1);
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8030(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8028() {
		return false;
	}

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V")
	@Override
	public void method8021() {
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)V")
	@Override
	public void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8022(@OriginalArg(0) boolean arg0) {
	}
}
