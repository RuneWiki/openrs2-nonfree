import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class6_Sub15_Sub1 extends Class6_Sub15 {

	@OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
	private int anInt2848;

	@OriginalMember(owner = "client!ia", name = "Kb", descriptor = "Lclient!s;")
	private Class225 aClass225_1;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "(I)I")
	public int method2603() {
		@Pc(22) int local22 = super.aByteArray51[super.anInt3487++] - this.aClass225_1.method5057() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray51[super.anInt3487++] - this.aClass225_1.method5057() & 0xFF);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(IZ)I")
	public int method2604(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt2848 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt2848 & 0x7);
		this.anInt2848 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local18) {
			local26 += (super.aByteArray51[local10++] & Static4.anIntArray2[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local26 += Static4.anIntArray2[local18] & super.aByteArray51[local10];
		} else {
			local26 += super.aByteArray51[local10] >> local18 - arg0 & Static4.anIntArray2[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(IB)V")
	public void method2605(@OriginalArg(0) int arg0) {
		super.aByteArray51[super.anInt3487++] = (byte) (arg0 + this.aClass225_1.method5057());
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I[BII)V")
	public void method2606(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = (byte) (super.aByteArray51[super.anInt3487++] - this.aClass225_1.method5057());
		}
	}

	@OriginalMember(owner = "client!ia", name = "t", descriptor = "(I)V")
	public void method2607() {
		this.anInt2848 = super.anInt3487 * 8;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(B)Z")
	public boolean method2609() {
		@Pc(17) int local17 = super.aByteArray51[super.anInt3487] - this.aClass225_1.method5054() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "(II)I")
	public int method2610(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2848;
	}

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "(Z)V")
	public void method2613() {
		super.anInt3487 = (this.anInt2848 + 7) / 8;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([IB)V")
	public void method2614(@OriginalArg(0) int[] arg0) {
		this.aClass225_1 = new Class225(arg0);
	}
}
