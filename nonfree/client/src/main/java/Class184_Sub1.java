import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class184_Sub1 extends Class184 implements Interface21 {

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
	private int anInt5851;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!ji;I[BIZ)V")
	public Class184_Sub1(@OriginalArg(0) Class15_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5851 = arg1;
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
	@Override
	protected void method7024() {
		super.aClass15_Sub3_30.method4433(this);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7918(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method7022(arg1, arg0);
		this.anInt5851 = 5123;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)I")
	@Override
	public int method7916() {
		return this.anInt5851;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)J")
	@Override
	public long method7919() {
		return 0L;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)I")
	@Override
	public int method7917() {
		return super.anInt8573;
	}
}
