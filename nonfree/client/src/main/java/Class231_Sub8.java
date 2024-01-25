import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public final class Class231_Sub8 extends Class231 {

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class231_Sub8(@OriginalArg(0) Class65_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(III)V")
	@Override
	public void method8715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)V")
	@Override
	public void method8716() {
		super.aClass65_Sub1_41.method1249(false);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8714() {
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8717(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!wj;II)V")
	@Override
	public void method8712(@OriginalArg(0) Class80 arg0, @OriginalArg(2) int arg1) {
		super.aClass65_Sub1_41.method1286(arg0);
		super.aClass65_Sub1_41.method1290(arg1);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8713(@OriginalArg(1) boolean arg0) {
		super.aClass65_Sub1_41.method1249(true);
	}
}
