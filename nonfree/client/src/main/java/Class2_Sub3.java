import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class2_Sub3(@OriginalArg(0) Class30_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	@Override
	public void method5384() {
		super.aClass30_Sub1_42.method977(false);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5380() {
		return true;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5383(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(ZI)V")
	@Override
	public void method5386(@OriginalArg(0) boolean arg0) {
		super.aClass30_Sub1_42.method977(true);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IILclient!kv;)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1) {
		super.aClass30_Sub1_42.method916(arg1);
		super.aClass30_Sub1_42.method923(arg0);
	}
}
