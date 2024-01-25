import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public final class Class72_Sub8 extends Class72 {

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class72_Sub8(@OriginalArg(0) Class172_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	@Override
	public void method5960() {
		super.aClass172_Sub2_43.method5626(false);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5966(@OriginalArg(0) boolean arg0) {
		super.aClass172_Sub2_43.method5626(true);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5970(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!ih;)V")
	@Override
	public void method5963(@OriginalArg(1) int arg0, @OriginalArg(2) Class112 arg1) {
		super.aClass172_Sub2_43.method5630(arg1);
		super.aClass172_Sub2_43.method5629(arg0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5961() {
		return true;
	}
}
