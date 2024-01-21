import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class3_Sub17_Sub1 extends Class3_Sub17 {

	@OriginalMember(owner = "client!pf", name = "W", descriptor = "Lclient!ea;")
	private Class22 aClass22_1;

	@OriginalMember(owner = "client!pf", name = "Lb", descriptor = "I")
	private int anInt2978;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([IB)V")
	public void method2144(@OriginalArg(0) int[] arg0) {
		this.aClass22_1 = new Class22(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(II)I")
	public int method2145(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2978;
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(II)V")
	public void method2146(@OriginalArg(0) int arg0) {
		super.aByteArray40[super.anInt2923++] = (byte) (this.aClass22_1.method592() + arg0);
	}

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "(B)I")
	public int method2147() {
		return super.aByteArray40[super.anInt2923++] - this.aClass22_1.method592() & 0xFF;
	}

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "(I)V")
	public void method2148() {
		super.anInt2923 = (this.anInt2978 + 7) / 8;
	}

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "(I)V")
	public void method2150() {
		this.anInt2978 = super.anInt2923 * 8;
	}

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "(II)I")
	public int method2152(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt2978 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2978 & 0x7);
		this.anInt2978 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local18) {
			local26 += (super.aByteArray40[local10++] & Static20.anIntArray69[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local26 += super.aByteArray40[local10] & Static20.anIntArray69[local18];
		} else {
			local26 += super.aByteArray40[local10] >> local18 - arg0 & Static20.anIntArray69[arg0];
		}
		return local26;
	}
}
