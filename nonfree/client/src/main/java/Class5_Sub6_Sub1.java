import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class5_Sub6_Sub1 extends Class5_Sub6 {

	@OriginalMember(owner = "client!vf", name = "Jb", descriptor = "Lclient!ni;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!vf", name = "Qb", descriptor = "I")
	private int anInt4066;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
	public Class5_Sub6_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "(I)V")
	public void method3086() {
		super.anInt4050 = (this.anInt4066 + 7) / 8;
	}

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "(II)V")
	public void method3087(@OriginalArg(0) int arg0) {
		super.aByteArray56[super.anInt4050++] = (byte) (this.aClass74_1.method2028() + arg0);
	}

	@OriginalMember(owner = "client!vf", name = "u", descriptor = "(I)V")
	public void method3088() {
		this.anInt4066 = super.anInt4050 * 8;
	}

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "(II)I")
	public int method3089(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4066;
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(BI)I")
	public int method3090(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt4066 >> 3;
		@Pc(17) int local17 = 0;
		@Pc(25) int local25 = 8 - (this.anInt4066 & 0x7);
		this.anInt4066 += arg0;
		while (arg0 > local25) {
			local17 += (Static44.anIntArray94[local25] & super.aByteArray56[local15++]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (arg0 == local25) {
			local17 += Static44.anIntArray94[local25] & super.aByteArray56[local15];
		} else {
			local17 += super.aByteArray56[local15] >> local25 - arg0 & Static44.anIntArray94[arg0];
		}
		return local17;
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(III[B)V")
	public void method3091(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray56[super.anInt4050++] - this.aClass74_1.method2028());
		}
	}

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "(B)I")
	public int method3092() {
		return super.aByteArray56[super.anInt4050++] - this.aClass74_1.method2028() & 0xFF;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B[I)V")
	public void method3093(@OriginalArg(1) int[] arg0) {
		this.aClass74_1 = new Class74(arg0);
	}
}
