import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class130_Sub2 extends Class130 implements Interface7 {

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	private int anInt5266;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!bi;I[BI)V")
	public Class130_Sub2(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5266 = arg1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)J")
	@Override
	public long method4613() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method4615(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4611(arg0, arg1);
		this.anInt5266 = 5123;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	@Override
	public int method4612() {
		return this.anInt5266;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)I")
	@Override
	public int method4614() {
		return 0;
	}
}
