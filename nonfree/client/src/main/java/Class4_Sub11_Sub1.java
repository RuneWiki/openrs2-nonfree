import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class4_Sub11_Sub1 extends Class4_Sub11 {

	@OriginalMember(owner = "client!cb", name = "Eb", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!cb", name = "Fb", descriptor = "Lclient!qa;")
	private Class162 aClass162_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "(B)I")
	public int method704() {
		return super.aByteArray55[super.anInt3768++] - this.aClass162_1.method4450() & 0xFF;
	}

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "(B)V")
	public void method705() {
		this.anInt961 = super.anInt3768 * 8;
	}

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "(II)V")
	public void method706(@OriginalArg(1) int arg0) {
		super.aByteArray55[super.anInt3768++] = (byte) (this.aClass162_1.method4450() + arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[I)V")
	public void method707(@OriginalArg(1) int[] arg0) {
		this.aClass162_1 = new Class162(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)I")
	public int method708(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt961;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([BBII)V")
	public void method709(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray55[super.anInt3768++] - this.aClass162_1.method4450());
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(BI)I")
	public int method711(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt961 >> 3;
		@Pc(22) int local22 = 8 - (this.anInt961 & 0x7);
		this.anInt961 += arg0;
		@Pc(30) int local30 = 0;
		while (arg0 > local22) {
			local30 += (Static265.anIntArray432[local22] & super.aByteArray55[local10++]) << arg0 - local22;
			arg0 -= local22;
			local22 = 8;
		}
		if (local22 == arg0) {
			local30 += super.aByteArray55[local10] & Static265.anIntArray432[local22];
		} else {
			local30 += super.aByteArray55[local10] >> local22 - arg0 & Static265.anIntArray432[arg0];
		}
		return local30;
	}

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "(I)V")
	public void method712() {
		super.anInt3768 = (this.anInt961 + 7) / 8;
	}
}
