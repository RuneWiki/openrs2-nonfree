import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class10_Sub10_Sub1 extends Class10_Sub10 {

	@OriginalMember(owner = "client!pa", name = "Kb", descriptor = "I")
	private int anInt2006;

	@OriginalMember(owner = "client!pa", name = "Sb", descriptor = "Lclient!hc;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
	public Class10_Sub10_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "(I)V")
	public void method1162() {
		this.anInt2006 = super.anInt1957 * 8;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(IB)I")
	public int method1164(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2006;
	}

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "(I)V")
	public void method1165() {
		super.anInt1957 = (this.anInt2006 + 7) / 8;
	}

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "(I)I")
	public int method1166() {
		return super.aByteArray9[super.anInt1957++] - this.aClass28_1.method614() & 0xFF;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(IZ)V")
	public void method1167(@OriginalArg(0) int arg0) {
		super.aByteArray9[super.anInt1957++] = (byte) (this.aClass28_1.method614() + arg0);
	}

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(II)I")
	public int method1171(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(12) int local12 = this.anInt2006 >> 3;
		@Pc(27) int local27 = 8 - (this.anInt2006 & 0x7);
		this.anInt2006 += arg0;
		while (arg0 > local27) {
			local7 += (super.aByteArray9[local12++] & Static48.anIntArray142[local27]) << arg0 - local27;
			arg0 -= local27;
			local27 = 8;
		}
		if (local27 == arg0) {
			local7 += Static48.anIntArray142[local27] & super.aByteArray9[local12];
		} else {
			local7 += super.aByteArray9[local12] >> local27 - arg0 & Static48.anIntArray142[arg0];
		}
		return local7;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "([IZ)V")
	public void method1172(@OriginalArg(0) int[] arg0) {
		this.aClass28_1 = new Class28(arg0);
	}
}
