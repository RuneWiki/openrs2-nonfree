import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class3_Sub11_Sub1 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ib", name = "Ub", descriptor = "I")
	private int anInt1567;

	@OriginalMember(owner = "client!ib", name = "oc", descriptor = "Lclient!jc;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I)V")
	public Class3_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(BI)I")
	public int method1027(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1567;
	}

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "(II)V")
	public void method1029(@OriginalArg(0) int arg0) {
		super.aByteArray13[super.anInt1562++] = (byte) (arg0 + this.aClass33_1.method1091());
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(Z)I")
	public int method1030() {
		return super.aByteArray13[super.anInt1562++] - this.aClass33_1.method1091() & 0xFF;
	}

	@OriginalMember(owner = "client!ib", name = "n", descriptor = "(II)I")
	public int method1031(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = this.anInt1567 >> 3;
		@Pc(19) int local19 = 0;
		@Pc(26) int local26 = 8 - (this.anInt1567 & 0x7);
		this.anInt1567 += arg0;
		while (arg0 > local26) {
			local19 += (super.aByteArray13[local17++] & Static6.anIntArray13[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (local26 == arg0) {
			local19 += Static6.anIntArray13[local26] & super.aByteArray13[local17];
		} else {
			local19 += super.aByteArray13[local17] >> local26 - arg0 & Static6.anIntArray13[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "(B)V")
	public void method1036() {
		this.anInt1567 = super.anInt1562 * 8;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IB)V")
	public void method1038(@OriginalArg(0) int[] arg0) {
		this.aClass33_1 = new Class33(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "(B)V")
	public void method1039() {
		super.anInt1562 = (this.anInt1567 + 7) / 8;
	}
}
