import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class4_Sub24_Sub1 extends Class4_Sub24 {

	@OriginalMember(owner = "client!no", name = "Nb", descriptor = "Lclient!bm;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!no", name = "Sb", descriptor = "I")
	private int anInt3851;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(I)V")
	public Class4_Sub24_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!no", name = "m", descriptor = "(II)V")
	public void method3123(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3822++] = (byte) (this.aClass15_1.method583() + arg0);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I[BII)V")
	public void method3125(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (this.aByteArray47[this.anInt3822++] - this.aClass15_1.method583());
		}
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(Z)V")
	public void method3126() {
		this.anInt3851 = this.anInt3822 * 8;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(IB)I")
	public int method3127(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3851;
	}

	@OriginalMember(owner = "client!no", name = "u", descriptor = "(I)V")
	public void method3129() {
		this.anInt3822 = (this.anInt3851 + 7) / 8;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I[I)V")
	public void method3131(@OriginalArg(1) int[] arg0) {
		this.aClass15_1 = new Class15(arg0);
	}

	@OriginalMember(owner = "client!no", name = "g", descriptor = "(IB)I")
	public int method3132(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt3851 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt3851 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt3851 += arg0;
		while (local17 < arg0) {
			local19 += (Static170.anIntArray282[local17] & this.aByteArray47[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local19 += Static170.anIntArray282[local17] & this.aByteArray47[local10];
		} else {
			local19 += this.aByteArray47[local10] >> local17 - arg0 & Static170.anIntArray282[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!no", name = "w", descriptor = "(I)I")
	public int method3133() {
		return this.aByteArray47[this.anInt3822++] - this.aClass15_1.method583() & 0xFF;
	}
}
