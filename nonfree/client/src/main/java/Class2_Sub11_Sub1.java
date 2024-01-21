import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!jh", name = "Cb", descriptor = "Lclient!qd;")
	private Class82 aClass82_1;

	@OriginalMember(owner = "client!jh", name = "Pb", descriptor = "I")
	private int anInt2287;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III[B)V")
	public void method1583(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray26[super.anInt2235++] - this.aClass82_1.method2373());
		}
	}

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "(II)I")
	public int method1584(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt2287 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2287 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt2287 += arg0;
		while (arg0 > local18) {
			local20 += (Static94.anIntArray199[local18] & super.aByteArray26[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += Static94.anIntArray199[local18] & super.aByteArray26[local10];
		} else {
			local20 += super.aByteArray26[local10] >> local18 - arg0 & Static94.anIntArray199[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!jh", name = "r", descriptor = "(I)V")
	public void method1585() {
		super.anInt2235 = (this.anInt2287 + 7) / 8;
	}

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "(B)V")
	public void method1586() {
		this.anInt2287 = super.anInt2235 * 8;
	}

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "(I)I")
	public int method1587() {
		return super.aByteArray26[super.anInt2235++] - this.aClass82_1.method2373() & 0xFF;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(IB)I")
	public int method1588(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2287;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[I)V")
	public void method1592(@OriginalArg(1) int[] arg0) {
		this.aClass82_1 = new Class82(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "(II)V")
	public void method1595(@OriginalArg(0) int arg0) {
		super.aByteArray26[super.anInt2235++] = (byte) (arg0 + this.aClass82_1.method2373());
	}
}
