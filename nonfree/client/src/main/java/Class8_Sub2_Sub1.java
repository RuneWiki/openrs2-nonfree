import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class8_Sub2_Sub1 extends Class8_Sub2 {

	@OriginalMember(owner = "client!le", name = "Xb", descriptor = "Lclient!ug;")
	private Class165 aClass165_1;

	@OriginalMember(owner = "client!le", name = "Zb", descriptor = "I")
	private int anInt2990;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(I)V")
	public Class8_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!le", name = "n", descriptor = "(I)V")
	public void method2385() {
		this.anInt2990 = this.anInt2955 * 8;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "([II)V")
	public void method2387(@OriginalArg(0) int[] arg0) {
		this.aClass165_1 = new Class165(arg0);
	}

	@OriginalMember(owner = "client!le", name = "n", descriptor = "(B)I")
	public int method2388() {
		return this.aByteArray24[this.anInt2955++] - this.aClass165_1.method4014() & 0xFF;
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(IB)I")
	public int method2389(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2990;
	}

	@OriginalMember(owner = "client!le", name = "l", descriptor = "(II)I")
	public int method2390(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2990 >> 3;
		@Pc(12) int local12 = 0;
		@Pc(20) int local20 = 8 - (this.anInt2990 & 0x7);
		this.anInt2990 += arg0;
		while (local20 < arg0) {
			local12 += (Static284.anIntArray490[local20] & this.aByteArray24[local10++]) << arg0 - local20;
			arg0 -= local20;
			local20 = 8;
		}
		if (local20 == arg0) {
			local12 += Static284.anIntArray490[local20] & this.aByteArray24[local10];
		} else {
			local12 += this.aByteArray24[local10] >> local20 - arg0 & Static284.anIntArray490[arg0];
		}
		return local12;
	}

	@OriginalMember(owner = "client!le", name = "o", descriptor = "(B)V")
	public void method2391() {
		this.anInt2955 = (this.anInt2990 + 7) / 8;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([BIIB)V")
	public void method2395(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (this.aByteArray24[this.anInt2955++] - this.aClass165_1.method4014());
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(BI)V")
	public void method2398(@OriginalArg(1) int arg0) {
		this.aByteArray24[this.anInt2955++] = (byte) (arg0 + this.aClass165_1.method4014());
	}
}
