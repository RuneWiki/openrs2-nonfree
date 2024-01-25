import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!kl", name = "zb", descriptor = "I")
	private int anInt3515;

	@OriginalMember(owner = "client!kl", name = "Ib", descriptor = "Lclient!gq;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
	public Class1_Sub8_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(ZI)V")
	public void method3229(@OriginalArg(1) int arg0) {
		super.aByteArray81[super.anInt5182++] = (byte) (this.aClass79_1.method2111() + arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[I)V")
	public void method3231(@OriginalArg(1) int[] arg0) {
		this.aClass79_1 = new Class79(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "q", descriptor = "(I)I")
	public int method3233() {
		return super.aByteArray81[super.anInt5182++] - this.aClass79_1.method2111() & 0xFF;
	}

	@OriginalMember(owner = "client!kl", name = "r", descriptor = "(I)V")
	public void method3234() {
		this.anInt3515 = super.anInt5182 * 8;
	}

	@OriginalMember(owner = "client!kl", name = "s", descriptor = "(I)V")
	public void method3235() {
		super.anInt5182 = (this.anInt3515 + 7) / 8;
	}

	@OriginalMember(owner = "client!kl", name = "o", descriptor = "(II)I")
	public int method3237(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3515;
	}

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "(II)I")
	public int method3238(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt3515 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt3515 & 0x7);
		this.anInt3515 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray81[local10++] & Static167.anIntArray329[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += Static167.anIntArray329[local23] & super.aByteArray81[local10];
		} else {
			local31 += super.aByteArray81[local10] >> local23 - arg0 & Static167.anIntArray329[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([BIII)V")
	public void method3239(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray81[super.anInt5182++] - this.aClass79_1.method2111());
		}
	}
}
