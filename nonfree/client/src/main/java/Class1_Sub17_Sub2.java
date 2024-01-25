import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class1_Sub17_Sub2 extends Class1_Sub17 {

	@OriginalMember(owner = "client!kj", name = "Gb", descriptor = "I")
	private int anInt4883;

	@OriginalMember(owner = "client!kj", name = "Ob", descriptor = "Lclient!vl;")
	private Class306 aClass306_1;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(I)V")
	public Class1_Sub17_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "(II)V")
	public void method4508(@OriginalArg(0) int arg0) {
		super.aByteArray58[super.anInt4872++] = (byte) (this.aClass306_1.method7868() + arg0);
	}

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "(I)I")
	public int method4509() {
		@Pc(30) int local30 = super.aByteArray58[super.anInt4872++] - this.aClass306_1.method7868() & 0xFF;
		return local30 < 128 ? local30 : (super.aByteArray58[super.anInt4872++] - this.aClass306_1.method7868() & 0xFF) + (local30 - 128 << 8);
	}

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "(I)V")
	public void method4510() {
		this.anInt4883 = super.anInt4872 * 8;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "([IB)V")
	public void method4511(@OriginalArg(0) int[] arg0) {
		this.aClass306_1 = new Class306(arg0);
	}

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "(B)Z")
	public boolean method4513() {
		@Pc(22) int local22 = super.aByteArray58[super.anInt4872] - this.aClass306_1.method7864() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "(II)I")
	public int method4515(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt4883;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB[B)V")
	public void method4516(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray58[super.anInt4872++] - this.aClass306_1.method7868());
		}
	}

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "(II)I")
	public int method4517(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt4883 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt4883 & 0x7);
		this.anInt4883 += arg0;
		@Pc(25) int local25 = 0;
		while (arg0 > local17) {
			local25 += (Static439.anIntArray723[local17] & super.aByteArray58[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local25 += super.aByteArray58[local10] & Static439.anIntArray723[local17];
		} else {
			local25 += super.aByteArray58[local10] >> local17 - arg0 & Static439.anIntArray723[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "(B)V")
	public void method4518() {
		super.anInt4872 = (this.anInt4883 + 7) / 8;
	}
}
