import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public final class Class234_Sub2 extends Class234 implements Interface10 {

	@OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
	private int anInt7680;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lclient!ih;I[BIZ)V")
	public Class234_Sub2(@OriginalArg(0) Class106_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7680 = arg1;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method5857(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5850(arg1, arg0);
		this.anInt7680 = 5123;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)I")
	@Override
	public int method5859() {
		return this.anInt7680;
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)V")
	@Override
	protected void method5854() {
		super.aClass106_Sub2_41.method2910(this);
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I")
	@Override
	public int method5858() {
		return super.anInt7670;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)J")
	@Override
	public long method5856() {
		return 0L;
	}
}
