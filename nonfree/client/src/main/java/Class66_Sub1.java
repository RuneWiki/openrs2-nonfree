import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class66_Sub1 extends Class66 implements Interface14 {

	@OriginalMember(owner = "client!daa", name = "u", descriptor = "I")
	private int anInt2213;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!kfa;I[BIZ)V")
	public Class66_Sub1(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2213 = arg1;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)I")
	@Override
	public int method4148() {
		return this.anInt2213;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)J")
	@Override
	public long method4146() {
		return 0L;
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(I)V")
	@Override
	protected void method6360() {
		super.aClass7_Sub2_35.method4342(this);
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)I")
	@Override
	public int method4149() {
		return super.anInt8171;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "([BIII)V")
	@Override
	public void method4147(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.method6362(arg0, arg1);
		this.anInt2213 = 5123;
	}
}
