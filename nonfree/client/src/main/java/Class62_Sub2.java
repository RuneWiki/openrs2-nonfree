import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class62_Sub2 extends Class62 implements Interface23 {

	@OriginalMember(owner = "client!we", name = "s", descriptor = "I")
	private int anInt9398;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!ag;I[BIZ)V")
	public Class62_Sub2(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt9398 = arg1;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(B)V")
	@Override
	protected void method7761() {
		super.aClass12_Sub1_41.method410(this);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBI[B)V")
	@Override
	public void method7764(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7760(arg1, arg0);
		this.anInt9398 = 5123;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)I")
	@Override
	public int method7765() {
		return super.anInt9388;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)J")
	@Override
	public long method7766() {
		return 0L;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I")
	@Override
	public int method7763() {
		return this.anInt9398;
	}
}
