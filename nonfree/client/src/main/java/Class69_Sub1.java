import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class69_Sub1 extends Class69 implements Interface1 {

	@OriginalMember(owner = "client!ep", name = "w", descriptor = "I")
	private int anInt2007;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lclient!da;I[BIZ)V")
	public Class69_Sub1(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2007 = arg1;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "([BIII)V")
	@Override
	public void method1769(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method5472(arg0, arg1);
		this.anInt2007 = 5123;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)J")
	@Override
	public long method1768() {
		return 0L;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)I")
	@Override
	public int method1767() {
		return super.anInt6969;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I")
	@Override
	public int method1766() {
		return this.anInt2007;
	}

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)V")
	@Override
	protected void method5475() {
		super.aClass50_Sub1_39.method1304(this);
	}
}
