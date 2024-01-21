import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class8_Sub20_Sub1 extends Class8_Sub20 {

	@OriginalMember(owner = "client!ud", name = "Pb", descriptor = "I")
	private int anInt2880;

	@OriginalMember(owner = "client!ud", name = "ec", descriptor = "Lclient!le;")
	private Class47 aClass47_1;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I)V")
	public Class8_Sub20_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(Z)V")
	public void method1897() {
		this.anInt2880 = super.anInt2853 * 8;
	}

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "(II)I")
	public int method1899(@OriginalArg(0) int arg0) {
		@Pc(17) int local17 = 8 - (this.anInt2880 & 0x7);
		@Pc(22) int local22 = this.anInt2880 >> 3;
		@Pc(24) int local24 = 0;
		this.anInt2880 += arg0;
		while (arg0 > local17) {
			local24 += (super.aByteArray44[local22++] & Static79.anIntArray244[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local24 += Static79.anIntArray244[local17] & super.aByteArray44[local22];
		} else {
			local24 += super.aByteArray44[local22] >> local17 - arg0 & Static79.anIntArray244[arg0];
		}
		return local24;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([II)V")
	public void method1904(@OriginalArg(0) int[] arg0) {
		this.aClass47_1 = new Class47(arg0);
	}

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "(I)V")
	public void method1905() {
		super.anInt2853 = (this.anInt2880 + 7) / 8;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(IZ)I")
	public int method1906(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2880;
	}

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "(II)V")
	public void method1907(@OriginalArg(0) int arg0) {
		super.aByteArray44[super.anInt2853++] = (byte) (arg0 + this.aClass47_1.method1087());
	}

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "(I)I")
	public int method1909() {
		return super.aByteArray44[super.anInt2853++] - this.aClass47_1.method1087() & 0xFF;
	}
}
