import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class3_Sub26_Sub1 extends Class3_Sub26 {

	@OriginalMember(owner = "client!rc", name = "Lb", descriptor = "Lclient!le;")
	private Class101 aClass101_1;

	@OriginalMember(owner = "client!rc", name = "Qb", descriptor = "I")
	private int anInt4677;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub26_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B[I)V")
	public void method3950(@OriginalArg(1) int[] arg0) {
		this.aClass101_1 = new Class101(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "(II)I")
	public int method3952(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt4677;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII[B)V")
	public void method3954(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray64[this.anInt4615++] - this.aClass101_1.method2602());
		}
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "(B)I")
	public int method3955() {
		return this.aByteArray64[this.anInt4615++] - this.aClass101_1.method2602() & 0xFF;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(BI)V")
	public void method3958(@OriginalArg(1) int arg0) {
		this.aByteArray64[this.anInt4615++] = (byte) (arg0 + this.aClass101_1.method2602());
	}

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "(B)V")
	public void method3960() {
		this.anInt4677 = this.anInt4615 * 8;
	}

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "(B)V")
	public void method3961() {
		this.anInt4615 = (this.anInt4677 + 7) / 8;
	}

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "(II)I")
	public int method3962(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt4677 >> 3;
		@Pc(13) int local13 = 8 - (this.anInt4677 & 0x7);
		this.anInt4677 += arg0;
		@Pc(33) int local33 = 0;
		while (arg0 > local13) {
			local33 += (Static109.anIntArray338[local13] & this.aByteArray64[local6++]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (arg0 == local13) {
			local33 += this.aByteArray64[local6] & Static109.anIntArray338[local13];
		} else {
			local33 += this.aByteArray64[local6] >> local13 - arg0 & Static109.anIntArray338[arg0];
		}
		return local33;
	}
}
