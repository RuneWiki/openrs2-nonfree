import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public final class Class41_Sub2 extends Class41 implements Interface7 {

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
	private int anInt7941;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!te;I[BIZ)V")
	public Class41_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7941 = arg1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
	@Override
	public int method6740() {
		return super.anInt7923;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	@Override
	protected void method6735() {
		super.aClass9_Sub3_39.method6703(this);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method6741(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method6736(arg1, arg0);
		this.anInt7941 = 5123;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	@Override
	public int method6743() {
		return this.anInt7941;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)J")
	@Override
	public long method6742() {
		return 0L;
	}
}
