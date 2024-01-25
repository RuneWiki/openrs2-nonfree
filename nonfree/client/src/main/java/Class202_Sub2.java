import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class202_Sub2 extends Class202 implements Interface5 {

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	private int anInt8170;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!us;I[BIZ)V")
	public Class202_Sub2(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt8170 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)I")
	@Override
	public int method6873() {
		return super.anInt8161;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I")
	@Override
	public int method6872() {
		return this.anInt8170;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6870(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6867(arg1, arg0);
		this.anInt8170 = 5123;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	@Override
	protected void method6868() {
		super.aClass43_Sub3_39.method7250(this);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)J")
	@Override
	public long method6871() {
		return 0L;
	}
}
