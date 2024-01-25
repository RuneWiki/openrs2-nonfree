import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class11_Sub3(@OriginalArg(0) Class100_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8725() {
		return true;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	@Override
	public void method8727() {
		super.aClass100_Sub3_41.method8867(false);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8724(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!me;ZI)V")
	@Override
	public void method8726(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		super.aClass100_Sub3_41.method8925(arg0);
		super.aClass100_Sub3_41.method8903(arg1);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)V")
	@Override
	public void method8723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8728(@OriginalArg(1) boolean arg0) {
		super.aClass100_Sub3_41.method8867(true);
	}
}
