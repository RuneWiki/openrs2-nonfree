import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class4_Sub13_Sub1 extends Class4_Sub13 {

	@OriginalMember(owner = "client!kf", name = "Bb", descriptor = "I")
	private int anInt1681;

	@OriginalMember(owner = "client!kf", name = "Jb", descriptor = "Lclient!ja;")
	private Class34 aClass34_1;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
	public Class4_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "(I)V")
	public void method1258() {
		super.anInt1643 = (this.anInt1681 + 7) / 8;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([IB)V")
	public void method1259(@OriginalArg(0) int[] arg0) {
		this.aClass34_1 = new Class34(arg0);
	}

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "(II)I")
	public int method1260(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = 8 - (this.anInt1681 & 0x7);
		@Pc(19) int local19 = this.anInt1681 >> 3;
		this.anInt1681 += arg0;
		while (local14 < arg0) {
			local7 += (super.aByteArray68[local19++] & Static17.anIntArray29[local14]) << arg0 - local14;
			arg0 -= local14;
			local14 = 8;
		}
		if (local14 == arg0) {
			local7 += Static17.anIntArray29[local14] & super.aByteArray68[local19];
		} else {
			local7 += super.aByteArray68[local19] >> local14 - arg0 & Static17.anIntArray29[arg0];
		}
		return local7;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(IB)I")
	public int method1261(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1681;
	}

	@OriginalMember(owner = "client!kf", name = "p", descriptor = "(I)I")
	public int method1262() {
		return super.aByteArray68[super.anInt1643++] - this.aClass34_1.method977() & 0xFF;
	}

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "(B)V")
	public void method1263() {
		this.anInt1681 = super.anInt1643 * 8;
	}

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "(IB)V")
	public void method1265(@OriginalArg(0) int arg0) {
		super.aByteArray68[super.anInt1643++] = (byte) (this.aClass34_1.method977() + arg0);
	}
}
