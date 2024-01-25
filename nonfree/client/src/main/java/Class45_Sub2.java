import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public final class Class45_Sub2 extends Class45 implements Interface5 {

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	private int anInt8141;

	@OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(Lclient!os;I[BI)V")
	public Class45_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt8141 = arg1;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)I")
	@Override
	public int method6822() {
		return this.anInt8141;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)J")
	@Override
	public long method6821() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6824(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6820(arg1, arg0);
		this.anInt8141 = 5123;
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(B)I")
	@Override
	public int method6823() {
		return 0;
	}
}
