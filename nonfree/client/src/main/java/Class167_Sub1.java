import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public final class Class167_Sub1 extends Class167 implements Interface23 {

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
	private int anInt4382;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Lclient!ok;I[BI)V")
	public Class167_Sub1(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt4382 = arg1;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)I")
	@Override
	public int method5062() {
		return 0;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I[BBI)V")
	@Override
	public void method5061(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.method3855(arg1, arg0);
		this.anInt4382 = 5123;
	}

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)I")
	@Override
	public int method5063() {
		return this.anInt4382;
	}

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)J")
	@Override
	public long method5064() {
		return super.aBuffer3.getAddress();
	}
}
