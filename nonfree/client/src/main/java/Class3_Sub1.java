import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 implements Interface9 {

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
	private int anInt32;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lclient!oea;I[BIZ)V")
	public Class3_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt32 = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)I")
	@Override
	public int method6316() {
		return this.anInt32;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
	@Override
	protected void method3633() {
		super.aClass87_Sub2_10.method6165(this);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)J")
	@Override
	public long method6317() {
		return 0L;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[B)V")
	@Override
	public void method6318(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method3634(arg1, arg0);
		this.anInt32 = 5123;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)I")
	@Override
	public int method6315() {
		return super.anInt4376;
	}
}
