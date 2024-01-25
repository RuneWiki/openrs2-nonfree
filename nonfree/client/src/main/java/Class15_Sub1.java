import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public final class Class15_Sub1 extends Class15 implements Interface19 {

	@OriginalMember(owner = "client!sea", name = "r", descriptor = "I")
	private int anInt7832;

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lclient!pea;I[BIZ)V")
	public Class15_Sub1(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7832 = arg1;
	}

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)I")
	@Override
	public int method6485() {
		return super.anInt8425;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6484(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method6949(arg1, arg0);
		this.anInt7832 = 5123;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
	@Override
	protected void method6948() {
		super.aClass121_Sub3_39.method5696(this);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)I")
	@Override
	public int method6483() {
		return this.anInt7832;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)J")
	@Override
	public long method6486() {
		return 0L;
	}
}
