import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public final class Class49_Sub1 extends Class49 implements Interface11 {

	@OriginalMember(owner = "client!eka", name = "g", descriptor = "I")
	private int anInt2801;

	@OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(Lclient!gia;I[BI)V")
	public Class49_Sub1(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2801 = arg1;
	}

	@OriginalMember(owner = "client!eka", name = "c", descriptor = "(I)J")
	@Override
	public long method2435() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!eka", name = "b", descriptor = "(I)I")
	@Override
	public int method2436() {
		return 0;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)I")
	@Override
	public int method2433() {
		return this.anInt2801;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method2434(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method8036(arg0, arg1);
		this.anInt2801 = 5123;
	}
}
