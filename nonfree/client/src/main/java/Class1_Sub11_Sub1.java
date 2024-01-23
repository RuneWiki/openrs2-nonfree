import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class1_Sub11_Sub1 extends Class1_Sub11 {

	@OriginalMember(owner = "client!lh", name = "Hb", descriptor = "Lclient!dh;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!lh", name = "Rb", descriptor = "I")
	private int anInt3324;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V")
	public Class1_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "(I)V")
	public void method2692() {
		this.anInt3264 = (this.anInt3324 + 7) / 8;
	}

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "(BI)I")
	public int method2693(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3324;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[I)V")
	public void method2694(@OriginalArg(1) int[] arg0) {
		this.aClass30_1 = new Class30(arg0);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BIII)V")
	public void method2695(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray47[this.anInt3264++] - this.aClass30_1.method932());
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V")
	public void method2697(@OriginalArg(0) int arg0) {
		this.aByteArray47[this.anInt3264++] = (byte) (arg0 + this.aClass30_1.method932());
	}

	@OriginalMember(owner = "client!lh", name = "t", descriptor = "(I)V")
	public void method2699() {
		this.anInt3324 = this.anInt3264 * 8;
	}

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "(II)I")
	public int method2701(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = 8 - (this.anInt3324 & 0x7);
		@Pc(25) int local25 = this.anInt3324 >> 3;
		this.anInt3324 += arg0;
		@Pc(33) int local33 = 0;
		while (local12 < arg0) {
			local33 += (Static61.anIntArray132[local12] & this.aByteArray47[local25++]) << arg0 - local12;
			arg0 -= local12;
			local12 = 8;
		}
		if (arg0 == local12) {
			local33 += this.aByteArray47[local25] & Static61.anIntArray132[local12];
		} else {
			local33 += this.aByteArray47[local25] >> local12 - arg0 & Static61.anIntArray132[arg0];
		}
		return local33;
	}

	@OriginalMember(owner = "client!lh", name = "o", descriptor = "(B)I")
	public int method2702() {
		return this.aByteArray47[this.anInt3264++] - this.aClass30_1.method932() & 0xFF;
	}
}
