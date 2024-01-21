import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class3_Sub6_Sub1 extends Class3_Sub6 {

	@OriginalMember(owner = "client!sb", name = "Sb", descriptor = "Lclient!tb;")
	private Class62 aClass62_1;

	@OriginalMember(owner = "client!sb", name = "Wb", descriptor = "I")
	private int anInt2460;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
	public Class3_Sub6_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "(II)I")
	public int method1638(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2460;
	}

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "(I)V")
	public void method1639() {
		this.anInt2460 = super.anInt2416 * 8;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([II)V")
	public void method1640(@OriginalArg(0) int[] arg0) {
		this.aClass62_1 = new Class62(arg0);
	}

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "(I)V")
	public void method1641() {
		super.anInt2416 = (this.anInt2460 + 7) / 8;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(BI)V")
	public void method1645(@OriginalArg(1) int arg0) {
		super.aByteArray17[super.anInt2416++] = (byte) (arg0 + this.aClass62_1.method1666());
	}

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "(II)I")
	public int method1646(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt2460 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt2460 & 0x7);
		this.anInt2460 += arg0;
		@Pc(25) int local25 = 0;
		while (arg0 > local17) {
			local25 += (Static56.anIntArray171[local17] & super.aByteArray17[local6++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local25 += super.aByteArray17[local6] & Static56.anIntArray171[local17];
		} else {
			local25 += super.aByteArray17[local6] >> local17 - arg0 & Static56.anIntArray171[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!sb", name = "x", descriptor = "(I)I")
	public int method1647() {
		return super.aByteArray17[super.anInt2416++] - this.aClass62_1.method1666() & 0xFF;
	}
}
