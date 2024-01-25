import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class84_Sub2 extends Class84 implements Interface5 {

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "I")
	private int anInt7701;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lclient!os;I[BIZ)V")
	public Class84_Sub2(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7701 = arg1;
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	@Override
	protected void method6454() {
		super.aClass39_Sub3_31.method5718(this);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)J")
	@Override
	public long method6821() {
		return 0L;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)I")
	@Override
	public int method6822() {
		return this.anInt7701;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6824(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method6452(arg0, arg1);
		this.anInt7701 = 5123;
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)I")
	@Override
	public int method6823() {
		return super.anInt7695;
	}
}
