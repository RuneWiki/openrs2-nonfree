import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class8_Sub2 extends Class8 implements Interface13 {

	@OriginalMember(owner = "client!og", name = "z", descriptor = "I")
	private int anInt5119;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!nq;I[BIZ)V")
	public Class8_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5119 = arg1;
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)J")
	@Override
	public long method4216() {
		return 0L;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI[BI)V")
	@Override
	public void method4215(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method4211(arg1, arg0);
		this.anInt5119 = 5123;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
	@Override
	public int method4214() {
		return this.anInt5119;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
	@Override
	public int method4217() {
		return super.anInt5109;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)V")
	@Override
	protected void method4213() {
		super.aClass167_Sub1_28.method3984(this);
	}
}
