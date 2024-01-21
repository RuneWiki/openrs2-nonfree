import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ff", name = "Jb", descriptor = "I")
	private int anInt1413;

	@OriginalMember(owner = "client!ff", name = "Qb", descriptor = "Lclient!lh;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "(II)I")
	public int method907(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1413;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([IB)V")
	public void method910(@OriginalArg(0) int[] arg0) {
		this.aClass52_1 = new Class52(arg0);
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(BI)I")
	public int method911(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1413 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt1413 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt1413 += arg0;
		while (arg0 > local18) {
			local20 += (super.aByteArray12[local10++] & Static39.anIntArray129[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local20 += super.aByteArray12[local10] & Static39.anIntArray129[local18];
		} else {
			local20 += super.aByteArray12[local10] >> local18 - arg0 & Static39.anIntArray129[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "(I)V")
	public void method915() {
		this.anInt1413 = super.anInt1357 * 8;
	}

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "(I)I")
	public int method917() {
		return super.aByteArray12[super.anInt1357++] - this.aClass52_1.method1677() & 0xFF;
	}

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "(I)V")
	public void method918() {
		super.anInt1357 = (this.anInt1413 + 7) / 8;
	}

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "(II)V")
	public void method919(@OriginalArg(1) int arg0) {
		super.aByteArray12[super.anInt1357++] = (byte) (this.aClass52_1.method1677() + arg0);
	}
}
