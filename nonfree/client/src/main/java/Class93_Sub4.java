import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public final class Class93_Sub4 extends Class93 {

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class93_Sub4(@OriginalArg(0) Class39_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7490() {
		return true;
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7493(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7489(@OriginalArg(0) boolean arg0) {
		super.aClass39_Sub3_40.method5713(true);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
	@Override
	public void method7494() {
		super.aClass39_Sub3_40.method5713(false);
	}

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(Lclient!baa;IB)V")
	@Override
	public void method7495(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1) {
		super.aClass39_Sub3_40.method5719(arg0);
		super.aClass39_Sub3_40.method5699(arg1);
	}
}
