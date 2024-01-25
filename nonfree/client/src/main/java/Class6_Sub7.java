import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class6_Sub7(@OriginalArg(0) Class82_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		super.aClass82_Sub1_41.method2050(true);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		super.aClass82_Sub1_41.method2029(arg0);
		super.aClass82_Sub1_41.method2068(arg1);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		super.aClass82_Sub1_41.method2050(false);
	}
}
