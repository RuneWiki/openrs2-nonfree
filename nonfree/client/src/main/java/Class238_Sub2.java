import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public final class Class238_Sub2 extends Class238 implements Interface5 {

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	private int anInt9884;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!pc;I[BIZ)V")
	public Class238_Sub2(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt9884 = arg1;
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)I")
	@Override
	public int method8460() {
		return super.anInt9872;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8458(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method8452(arg1, arg0);
		this.anInt9884 = 5123;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V")
	@Override
	protected void method8456() {
		super.aClass33_Sub3_40.method6300(this);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
	@Override
	public int method8461() {
		return this.anInt9884;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J")
	@Override
	public long method8459() {
		return 0L;
	}
}
