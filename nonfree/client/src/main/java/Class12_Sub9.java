import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public final class Class12_Sub9 extends Class12 {

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class12_Sub9(@OriginalArg(0) Class43_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(ZB)V")
	@Override
	public void method6838(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILclient!hw;)V")
	@Override
	public void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
		super.aClass43_Sub1_21.method4298(arg1);
		super.aClass43_Sub1_21.method4183(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
	@Override
	public void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6836(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	@Override
	public void method6842() {
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6846() {
		return false;
	}
}
