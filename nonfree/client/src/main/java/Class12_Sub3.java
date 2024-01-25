import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class12_Sub3(@OriginalArg(0) Class43_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return true;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
		super.aClass43_Sub1_21.method4170(true);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
		super.aClass43_Sub1_21.method4170(false);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass43_Sub1_21.method4298(arg1);
		super.aClass43_Sub1_21.method4183(arg0);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
	}
}
