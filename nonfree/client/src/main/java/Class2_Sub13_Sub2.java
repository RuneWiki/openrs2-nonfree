import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class2_Sub13_Sub2 extends Class2_Sub13 {

	@OriginalMember(owner = "client!nf", name = "Lb", descriptor = "Lclient!qr;")
	private Class206 aClass206_1;

	@OriginalMember(owner = "client!nf", name = "Pb", descriptor = "I")
	private int anInt4391;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "(B)I")
	public int method3606() {
		@Pc(29) int local29 = super.aByteArray52[super.anInt4347++] - this.aClass206_1.method4457() & 0xFF;
		return local29 < 128 ? local29 : (super.aByteArray52[super.anInt4347++] - this.aClass206_1.method4457() & 0xFF) + (local29 - 128 << 8);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI[BI)V")
	public void method3610(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray52[super.anInt4347++] - this.aClass206_1.method4457());
		}
	}

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "(II)V")
	public void method3611(@OriginalArg(0) int arg0) {
		super.aByteArray52[super.anInt4347++] = (byte) (this.aClass206_1.method4457() + arg0);
	}

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "(B)V")
	public void method3612() {
		this.anInt4391 = super.anInt4347 * 8;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([IB)V")
	public void method3614(@OriginalArg(0) int[] arg0) {
		this.aClass206_1 = new Class206(arg0);
	}

	@OriginalMember(owner = "client!nf", name = "p", descriptor = "(II)I")
	public int method3615(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt4391 >> 3;
		@Pc(22) int local22 = 8 - (this.anInt4391 & 0x7);
		@Pc(24) int local24 = 0;
		this.anInt4391 += arg0;
		while (arg0 > local22) {
			local24 += (super.aByteArray52[local10++] & Static149.anIntArray206[local22]) << arg0 - local22;
			arg0 -= local22;
			local22 = 8;
		}
		if (arg0 == local22) {
			local24 += super.aByteArray52[local10] & Static149.anIntArray206[local22];
		} else {
			local24 += super.aByteArray52[local10] >> local22 - arg0 & Static149.anIntArray206[arg0];
		}
		return local24;
	}

	@OriginalMember(owner = "client!nf", name = "D", descriptor = "(I)V")
	public void method3617() {
		super.anInt4347 = (this.anInt4391 + 7) / 8;
	}

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "(I)Z")
	public boolean method3618() {
		@Pc(19) int local19 = super.aByteArray52[super.anInt4347] - this.aClass206_1.method4461() & 0xFF;
		return local19 >= 128;
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(BI)I")
	public int method3619(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4391;
	}
}
