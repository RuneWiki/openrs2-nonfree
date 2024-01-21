import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!pe", name = "Tb", descriptor = "Lclient!bc;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!pe", name = "fc", descriptor = "I")
	private int anInt2226;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "(I)I")
	public int method1513() {
		return super.aByteArray11[super.anInt2209++] - this.aClass7_1.method246() & 0xFF;
	}

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "(II)I")
	public int method1514(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2226;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(IB)V")
	public void method1515(@OriginalArg(0) int arg0) {
		super.aByteArray11[super.anInt2209++] = (byte) (this.aClass7_1.method246() + arg0);
	}

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "(II)I")
	public int method1519(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2226 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2226 & 0x7);
		this.anInt2226 += arg0;
		@Pc(26) int local26 = 0;
		while (local18 < arg0) {
			local26 += (super.aByteArray11[local10++] & Static75.anIntArray211[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local26 += super.aByteArray11[local10] & Static75.anIntArray211[local18];
		} else {
			local26 += Static75.anIntArray211[arg0] & super.aByteArray11[local10] >> local18 - arg0;
		}
		return local26;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[I)V")
	public void method1522(@OriginalArg(1) int[] arg0) {
		this.aClass7_1 = new Class7(arg0);
	}

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "(B)V")
	public void method1523() {
		super.anInt2209 = (this.anInt2226 + 7) / 8;
	}

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "(B)V")
	public void method1524() {
		this.anInt2226 = super.anInt2209 * 8;
	}
}
