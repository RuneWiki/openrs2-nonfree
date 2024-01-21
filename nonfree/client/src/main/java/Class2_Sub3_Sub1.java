import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ai", name = "Nb", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!ai", name = "Pb", descriptor = "Lclient!mg;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "([IZ)V")
	public void method275(@OriginalArg(0) int[] arg0) {
		this.aClass58_1 = new Class58(arg0);
	}

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "(II)I")
	public int method277(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt364;
	}

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "(I)I")
	public int method278() {
		return super.aByteArray2[super.anInt340++] - this.aClass58_1.method2067() & 0xFF;
	}

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "(B)V")
	public void method279() {
		super.anInt340 = (this.anInt364 + 7) / 8;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I[BII)V")
	public void method280(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1; local8++) {
			arg0[local8] = (byte) (super.aByteArray2[super.anInt340++] - this.aClass58_1.method2067());
		}
	}

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "(BI)V")
	public void method284(@OriginalArg(1) int arg0) {
		super.aByteArray2[super.anInt340++] = (byte) (this.aClass58_1.method2067() + arg0);
	}

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "(II)I")
	public int method285(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = 8 - (this.anInt364 & 0x7);
		@Pc(20) int local20 = this.anInt364 >> 3;
		this.anInt364 += arg0;
		while (local15 < arg0) {
			local7 += (Static3.anIntArray2[local15] & super.aByteArray2[local20++]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local7 += super.aByteArray2[local20] & Static3.anIntArray2[local15];
		} else {
			local7 += super.aByteArray2[local20] >> local15 - arg0 & Static3.anIntArray2[arg0];
		}
		return local7;
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(Z)V")
	public void method287() {
		this.anInt364 = super.anInt340 * 8;
	}
}
