import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!qa", name = "Pb", descriptor = "Lclient!td;")
	private Class55 aClass55_1;

	@OriginalMember(owner = "client!qa", name = "cc", descriptor = "I")
	private int anInt2369;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)I")
	public int method1419(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt2369 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt2369 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt2369 += arg0;
		while (arg0 > local17) {
			local19 += (super.aByteArray59[local10++] & Static56.anIntArray224[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local19 += Static56.anIntArray224[local17] & super.aByteArray59[local10];
		} else {
			local19 += Static56.anIntArray224[arg0] & super.aByteArray59[local10] >> local17 - arg0;
		}
		return local19;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([II)V")
	public void method1420(@OriginalArg(0) int[] arg0) {
		this.aClass55_1 = new Class55(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "(B)V")
	public void method1421() {
		this.anInt2369 = super.anInt2342 * 8;
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(BI)I")
	public int method1424(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2369;
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(II)V")
	public void method1425(@OriginalArg(0) int arg0) {
		super.aByteArray59[super.anInt2342++] = (byte) (arg0 + this.aClass55_1.method1703());
	}

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "(I)V")
	public void method1428() {
		super.anInt2342 = (this.anInt2369 + 7) / 8;
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "(I)I")
	public int method1429() {
		return super.aByteArray59[super.anInt2342++] - this.aClass55_1.method1703() & 0xFF;
	}
}
