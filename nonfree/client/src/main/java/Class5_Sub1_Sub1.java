import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ae", name = "yb", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!ae", name = "Eb", descriptor = "Lclient!dk;")
	private Class48 aClass48_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([II)V")
	public void method173(@OriginalArg(0) int[] arg0) {
		this.aClass48_1 = new Class48(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "(II)V")
	public void method174(@OriginalArg(0) int arg0) {
		super.aByteArray18[super.anInt2029++] = (byte) (this.aClass48_1.method1223() + arg0);
	}

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "(I)V")
	public void method175() {
		super.anInt2029 = (this.anInt165 + 7) / 8;
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "([BIII)V")
	public void method176(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray18[super.anInt2029++] - this.aClass48_1.method1223());
		}
	}

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "(B)V")
	public void method178() {
		this.anInt165 = super.anInt2029 * 8;
	}

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "(BI)I")
	public int method179(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt165;
	}

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "(I)I")
	public int method181() {
		return super.aByteArray18[super.anInt2029++] - this.aClass48_1.method1223() & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "l", descriptor = "(II)I")
	public int method182(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt165 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt165 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt165 += arg0;
		while (arg0 > local18) {
			local20 += (Static298.anIntArray440[local18] & super.aByteArray18[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += super.aByteArray18[local10] & Static298.anIntArray440[local18];
		} else {
			local20 += super.aByteArray18[local10] >> local18 - arg0 & Static298.anIntArray440[arg0];
		}
		return local20;
	}
}
