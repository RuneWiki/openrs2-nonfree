import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!jk", name = "Lb", descriptor = "I")
	private int anInt3630;

	@OriginalMember(owner = "client!jk", name = "Ub", descriptor = "Lclient!ao;")
	private Class12 aClass12_1;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "(I)V")
	public void method3164() {
		super.anInt3606 = (this.anInt3630 + 7) / 8;
	}

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "(I)V")
	public void method3165() {
		this.anInt3630 = super.anInt3606 * 8;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(BI)I")
	public int method3167(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3630;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(Z)Z")
	public boolean method3168() {
		@Pc(17) int local17 = super.aByteArray30[super.anInt3606] - this.aClass12_1.method247() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I[BII)V")
	public void method3170(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray30[super.anInt3606++] - this.aClass12_1.method246());
		}
	}

	@OriginalMember(owner = "client!jk", name = "m", descriptor = "(II)V")
	public void method3171(@OriginalArg(0) int arg0) {
		super.aByteArray30[super.anInt3606++] = (byte) (this.aClass12_1.method246() + arg0);
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(IZ)I")
	public int method3172(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = this.anInt3630 >> 3;
		@Pc(24) int local24 = 8 - (this.anInt3630 & 0x7);
		@Pc(26) int local26 = 0;
		this.anInt3630 += arg0;
		while (arg0 > local24) {
			local26 += (Static110.anIntArray185[local24] & super.aByteArray30[local16++]) << arg0 - local24;
			arg0 -= local24;
			local24 = 8;
		}
		if (local24 == arg0) {
			local26 += super.aByteArray30[local16] & Static110.anIntArray185[local24];
		} else {
			local26 += super.aByteArray30[local16] >> local24 - arg0 & Static110.anIntArray185[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([II)V")
	public void method3174(@OriginalArg(0) int[] arg0) {
		this.aClass12_1 = new Class12(arg0);
	}

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "(B)I")
	public int method3175() {
		@Pc(22) int local22 = super.aByteArray30[super.anInt3606++] - this.aClass12_1.method246() & 0xFF;
		return local22 < 128 ? local22 : (local22 - 128 << 8) + (super.aByteArray30[super.anInt3606++] - this.aClass12_1.method246() & 0xFF);
	}
}
