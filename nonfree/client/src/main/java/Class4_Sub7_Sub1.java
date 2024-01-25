import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class4_Sub7_Sub1 extends Class4_Sub7 {

	@OriginalMember(owner = "client!ea", name = "Qb", descriptor = "I")
	private int anInt1513;

	@OriginalMember(owner = "client!ea", name = "Rb", descriptor = "Lclient!co;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(I)V")
	public Class4_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([IB)V")
	public void method1236(@OriginalArg(0) int[] arg0) {
		this.aClass40_1 = new Class40(arg0);
	}

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "(II)V")
	public void method1237(@OriginalArg(1) int arg0) {
		super.aByteArray42[super.anInt2667++] = (byte) (arg0 + this.aClass40_1.method923());
	}

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "(I)I")
	public int method1238() {
		return super.aByteArray42[super.anInt2667++] - this.aClass40_1.method923() & 0xFF;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(Z)V")
	public void method1239() {
		this.anInt1513 = super.anInt2667 * 8;
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(B)V")
	public void method1241() {
		super.anInt2667 = (this.anInt1513 + 7) / 8;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "([BBII)V")
	public void method1244(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray42[super.anInt2667++] - this.aClass40_1.method923());
		}
	}

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "(II)I")
	public int method1246(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt1513;
	}

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "(II)I")
	public int method1247(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt1513 >> 3;
		@Pc(25) int local25 = 8 - (this.anInt1513 & 0x7);
		this.anInt1513 += arg0;
		@Pc(33) int local33 = 0;
		while (arg0 > local25) {
			local33 += (super.aByteArray42[local10++] & Static9.anIntArray511[local25]) << arg0 - local25;
			arg0 -= local25;
			local25 = 8;
		}
		if (arg0 == local25) {
			local33 += Static9.anIntArray511[local25] & super.aByteArray42[local10];
		} else {
			local33 += super.aByteArray42[local10] >> local25 - arg0 & Static9.anIntArray511[arg0];
		}
		return local33;
	}
}
