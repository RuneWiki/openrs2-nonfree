import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class53_Sub1 extends Class53 implements Interface4 {

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	private int anInt2936;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!bo;I[BI)V")
	public Class53_Sub1(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2936 = arg1;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "([BIII)V")
	@Override
	public void method3583(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method2597(arg0, arg1);
		this.anInt2936 = 5123;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I")
	@Override
	public int method3585() {
		return this.anInt2936;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)J")
	@Override
	public long method3584() {
		return super.aNativeBuffer3.a();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
	@Override
	public int method3582() {
		return 0;
	}
}
