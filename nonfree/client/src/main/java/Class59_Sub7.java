import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class59_Sub7 extends Class59 {

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class59_Sub7(@OriginalArg(0) Class13_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8593(@OriginalArg(0) boolean arg0) {
		super.aClass13_Sub2_43.method1027(true);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
	@Override
	public void method8590() {
		super.aClass13_Sub2_43.method1027(false);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8588() {
		return true;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8591(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IILclient!cj;)V")
	@Override
	public void method8587(@OriginalArg(1) int arg0, @OriginalArg(2) Class10 arg1) {
		super.aClass13_Sub2_43.method1096(arg1);
		super.aClass13_Sub2_43.method1046(arg0);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
