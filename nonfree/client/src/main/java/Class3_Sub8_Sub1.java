import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class3_Sub8_Sub1 extends Class3_Sub8 {

	@OriginalMember(owner = "client!vc", name = "Zb", descriptor = "I")
	private int anInt2758;

	@OriginalMember(owner = "client!vc", name = "dc", descriptor = "Lclient!s;")
	private Class56 aClass56_1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "(B)V")
	public void method1816() {
		this.anInt2758 = super.anInt2704 * 8;
	}

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "(I)I")
	public int method1818() {
		return super.aByteArray26[super.anInt2704++] - this.aClass56_1.method1533() & 0xFF;
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(II)I")
	public int method1820(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2758;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([II)V")
	public void method1821(@OriginalArg(0) int[] arg0) {
		this.aClass56_1 = new Class56(arg0);
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(IB)I")
	public int method1822(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt2758 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2758 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt2758 += arg0;
		while (arg0 > local18) {
			local20 += (super.aByteArray26[local10++] & Static74.anIntArray227[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += Static74.anIntArray227[local18] & super.aByteArray26[local10];
		} else {
			local20 += super.aByteArray26[local10] >> local18 - arg0 & Static74.anIntArray227[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	public void method1823() {
		super.anInt2704 = (this.anInt2758 + 7) / 8;
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(BI)V")
	public void method1824(@OriginalArg(1) int arg0) {
		super.aByteArray26[super.anInt2704++] = (byte) (arg0 + this.aClass56_1.method1533());
	}
}
