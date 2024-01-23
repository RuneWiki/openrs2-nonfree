import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class2_Sub23_Sub1 extends Class2_Sub23 {

	@OriginalMember(owner = "client!l", name = "Nb", descriptor = "Lclient!pa;")
	private Class73 aClass73_1;

	@OriginalMember(owner = "client!l", name = "Xb", descriptor = "I")
	private int anInt2731;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IB)I")
	public int method2143(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2731;
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "(I)V")
	public void method2144() {
		this.anInt2731 = super.anInt2703 * 8;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I[I)V")
	public void method2148(@OriginalArg(1) int[] arg0) {
		this.aClass73_1 = new Class73(arg0);
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(B)V")
	public void method2149() {
		super.anInt2703 = (this.anInt2731 + 7) / 8;
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "(B)I")
	public int method2152() {
		return super.aByteArray41[super.anInt2703++] - this.aClass73_1.method2744() & 0xFF;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II[BI)V")
	public void method2153(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray41[super.anInt2703++] - this.aClass73_1.method2744());
		}
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "(II)I")
	public int method2154(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt2731 >> 3;
		@Pc(16) int local16 = 8 - (this.anInt2731 & 0x7);
		this.anInt2731 += arg0;
		@Pc(24) int local24 = 0;
		while (local16 < arg0) {
			local24 += (super.aByteArray41[local8++] & Static34.anIntArray102[local16]) << arg0 - local16;
			arg0 -= local16;
			local16 = 8;
		}
		if (local16 == arg0) {
			local24 += Static34.anIntArray102[local16] & super.aByteArray41[local8];
		} else {
			local24 += super.aByteArray41[local8] >> local16 - arg0 & Static34.anIntArray102[arg0];
		}
		return local24;
	}

	@OriginalMember(owner = "client!l", name = "q", descriptor = "(II)V")
	public void method2155(@OriginalArg(0) int arg0) {
		super.aByteArray41[super.anInt2703++] = (byte) (this.aClass73_1.method2744() + arg0);
	}
}
