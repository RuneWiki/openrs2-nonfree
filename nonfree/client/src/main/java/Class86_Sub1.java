import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class86_Sub1 extends Class86 implements Interface12 {

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	private int anInt2546;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!lj;I[BI)V")
	public Class86_Sub1(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt2546 = arg1;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)J")
	@Override
	public long method4198() {
		return super.aBuffer3.getAddress();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)I")
	@Override
	public int method4196() {
		return 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4195(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method7522(arg1, arg0);
		this.anInt2546 = 5123;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)I")
	@Override
	public int method4197() {
		return this.anInt2546;
	}
}
