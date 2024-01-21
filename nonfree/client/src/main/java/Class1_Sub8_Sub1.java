import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ja", name = "C", descriptor = "I")
	private int anInt2238;

	@OriginalMember(owner = "client!ja", name = "Nb", descriptor = "Lclient!qh;")
	private Class73 aClass73_1;

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(IZ)V")
	public void method1654(@OriginalArg(0) int arg0) {
		super.aByteArray27[super.anInt2195++] = (byte) (arg0 + this.aClass73_1.method2537());
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)I")
	public int method1656(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt2238 & 0x7);
		@Pc(18) int local18 = this.anInt2238 >> 3;
		this.anInt2238 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local13) {
			local31 += (Static25.anIntArray110[local13] & super.aByteArray27[local18++]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (local13 == arg0) {
			local31 += Static25.anIntArray110[local13] & super.aByteArray27[local18];
		} else {
			local31 += super.aByteArray27[local18] >> local13 - arg0 & Static25.anIntArray110[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "(I)V")
	public void method1657() {
		this.anInt2238 = super.anInt2195 * 8;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(ZI)I")
	public int method1659(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2238;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B[I)V")
	public void method1660(@OriginalArg(1) int[] arg0) {
		this.aClass73_1 = new Class73(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "(Z)V")
	public void method1662() {
		super.anInt2195 = (this.anInt2238 + 7) / 8;
	}

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "(I)I")
	public int method1663() {
		return super.aByteArray27[super.anInt2195++] - this.aClass73_1.method2537() & 0xFF;
	}
}
