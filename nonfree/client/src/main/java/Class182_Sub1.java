import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class182_Sub1 extends Class182 implements Interface5 {

	@OriginalMember(owner = "client!so", name = "d", descriptor = "I")
	private int anInt5713;

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	private int anInt5712;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!sq;I[BI)V")
	public Class182_Sub1(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt5713 = arg1;
		this.anInt5712 = this.aClass46_Sub2_38.method5232(this.anInt5713);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)V")
	@Override
	public void method5080(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass46_Sub2_38.anOpengl1.glDrawElements(4, arg1, this.anInt5713, this.aByteBuffer6.position(arg0 * this.anInt5712));
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "()I")
	@Override
	public int method5385() {
		return 0;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(I[BI)V")
	@Override
	public void method5081(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.method5380(arg0, arg1);
		this.anInt5713 = 5123;
		this.anInt5712 = this.aClass46_Sub2_38.method5232(this.anInt5713);
	}
}
