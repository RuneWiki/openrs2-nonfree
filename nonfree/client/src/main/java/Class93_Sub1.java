import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class93_Sub1 extends Class93 implements Interface7 {

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	private int anInt2667;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!bi;I[BIZ)V")
	public Class93_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt2667 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J")
	@Override
	public long method4613() {
		return 0L;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	@Override
	public int method4612() {
		return this.anInt2667;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method4615(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method4790(arg0, arg1);
		this.anInt2667 = 5123;
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	@Override
	protected void method4789() {
		super.aClass13_Sub2_25.method1080(this);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I")
	@Override
	public int method4614() {
		return super.anInt5487;
	}
}
