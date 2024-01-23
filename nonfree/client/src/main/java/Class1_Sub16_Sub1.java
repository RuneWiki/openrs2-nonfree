import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub16_Sub1 extends Class1_Sub16 {

	@OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
	private int anInt4869;

	@OriginalMember(owner = "client!wi", name = "Pb", descriptor = "Lclient!nd;")
	private Class74 aClass74_1;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(I)V")
	public Class1_Sub16_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III[B)V")
	public void method3822(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray62[super.anInt4860++] - this.aClass74_1.method2407());
		}
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(ZI)V")
	public void method3823(@OriginalArg(1) int arg0) {
		super.aByteArray62[super.anInt4860++] = (byte) (arg0 + this.aClass74_1.method2407());
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(IB)I")
	public int method3824(@OriginalArg(0) int arg0) {
		@Pc(22) int local22 = 8 - (this.anInt4869 & 0x7);
		@Pc(27) int local27 = this.anInt4869 >> 3;
		@Pc(29) int local29 = 0;
		this.anInt4869 += arg0;
		while (local22 < arg0) {
			local29 += (super.aByteArray62[local27++] & Static97.anIntArray138[local22]) << arg0 - local22;
			arg0 -= local22;
			local22 = 8;
		}
		if (local22 == arg0) {
			local29 += super.aByteArray62[local27] & Static97.anIntArray138[local22];
		} else {
			local29 += super.aByteArray62[local27] >> local22 - arg0 & Static97.anIntArray138[arg0];
		}
		return local29;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(BI)I")
	public int method3825(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4869;
	}

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "(Z)V")
	public void method3826() {
		super.anInt4860 = (this.anInt4869 + 7) / 8;
	}

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "(B)V")
	public void method3827() {
		this.anInt4869 = super.anInt4860 * 8;
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "(Z)I")
	public int method3829() {
		return super.aByteArray62[super.anInt4860++] - this.aClass74_1.method2407() & 0xFF;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[I)V")
	public void method3830(@OriginalArg(1) int[] arg0) {
		this.aClass74_1 = new Class74(arg0);
	}
}
