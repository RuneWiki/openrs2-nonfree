import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class16_Sub5 extends Class16 {

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class16_Sub5(@OriginalArg(0) Class5_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
	@Override
	public void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8759() {
		return true;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Lclient!cu;ZI)V")
	@Override
	public void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub1_42.method352(arg0);
		super.aClass5_Sub1_42.method385(arg1);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8760(@OriginalArg(1) boolean arg0) {
		super.aClass5_Sub1_42.method394(true);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8763(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
	@Override
	public void method8765() {
		super.aClass5_Sub1_42.method394(false);
	}
}
