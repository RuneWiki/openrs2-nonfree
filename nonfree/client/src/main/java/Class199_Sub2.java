import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class199_Sub2 extends Class199 implements Interface20 {

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
	private int anInt7581;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!lea;I[BIZ)V")
	public Class199_Sub2(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7581 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)J")
	@Override
	public long method6707() {
		return 0L;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
	@Override
	public int method6708() {
		return this.anInt7581;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V")
	@Override
	protected void method6703() {
		super.aClass101_Sub2_23.method5629(this);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I")
	@Override
	public int method6706() {
		return super.anInt7577;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6705(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method6702(arg1, arg0);
		this.anInt7581 = 5123;
	}
}
