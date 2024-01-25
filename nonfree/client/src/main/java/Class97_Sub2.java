import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class97_Sub2 extends Class97 implements Interface8 {

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	private int anInt4835;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!bl;I[BI)V")
	public Class97_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4835 = arg1;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)I")
	@Override
	public int method4285() {
		return 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)I")
	@Override
	public int method4286() {
		return this.anInt4835;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)J")
	@Override
	public long method4283() {
		return super.aNativeBuffer3.b();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[BIB)V")
	@Override
	public void method4284(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method4282(arg0, arg1);
		this.anInt4835 = 5123;
	}
}
