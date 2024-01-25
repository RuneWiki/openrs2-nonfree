import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class69_Sub1 extends Class69 {

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class69_Sub1(@OriginalArg(0) Class75_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8632(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public void method8638() {
		super.aClass75_Sub3_41.method5789(false);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8635(@OriginalArg(0) boolean arg0) {
		super.aClass75_Sub3_41.method5789(true);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLclient!ica;)V")
	@Override
	public void method8631(@OriginalArg(0) int arg0, @OriginalArg(2) Class44 arg1) {
		super.aClass75_Sub3_41.method5774(arg1);
		super.aClass75_Sub3_41.method5787(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8637() {
		return true;
	}
}
