import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class1_Sub28_Sub1 extends Class1_Sub28 {

	@OriginalMember(owner = "client!kh", name = "Ib", descriptor = "Lclient!rp;")
	private Class214 aClass214_1;

	@OriginalMember(owner = "client!kh", name = "Kb", descriptor = "I")
	private int anInt3756;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub28_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "(I)V")
	public void method3077() {
		this.anInt3756 = super.anInt6812 * 8;
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(IB)V")
	public void method3078(@OriginalArg(0) int arg0) {
		super.aByteArray86[super.anInt6812++] = (byte) (arg0 + this.aClass214_1.method4757());
	}

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "(I)I")
	public int method3079() {
		@Pc(26) int local26 = super.aByteArray86[super.anInt6812++] - this.aClass214_1.method4757() & 0xFF;
		return local26 < 128 ? local26 : (local26 - 128 << 8) + (super.aByteArray86[super.anInt6812++] - this.aClass214_1.method4757() & 0xFF);
	}

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "(ZI)I")
	public int method3080(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3756;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I[I)V")
	public void method3082(@OriginalArg(1) int[] arg0) {
		this.aClass214_1 = new Class214(arg0);
	}

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "(Z)V")
	public void method3083() {
		super.anInt6812 = (this.anInt3756 + 7) / 8;
	}

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "(II)I")
	public int method3084(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt3756 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt3756 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt3756 += arg0;
		while (arg0 > local18) {
			local20 += (super.aByteArray86[local10++] & Static316.anIntArray368[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += Static316.anIntArray368[local18] & super.aByteArray86[local10];
		} else {
			local20 += super.aByteArray86[local10] >> local18 - arg0 & Static316.anIntArray368[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "(Z)Z")
	public boolean method3085() {
		@Pc(22) int local22 = super.aByteArray86[super.anInt6812] - this.aClass214_1.method4758() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I[BII)V")
	public void method3087(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray86[super.anInt6812++] - this.aClass214_1.method4757());
		}
	}
}
