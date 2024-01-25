import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public final class Class127_Sub3 extends Class127 {

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class127_Sub3(@OriginalArg(0) Class5_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return true;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub2_42.method4997(arg0);
		super.aClass5_Sub2_42.method4953(arg1);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		super.aClass5_Sub2_42.method4960(false);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub2_42.method4960(true);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
