import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub16_Sub1 extends Class2_Sub16 {

	@OriginalMember(owner = "client!ih", name = "Kb", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!ih", name = "Sb", descriptor = "Lclient!fj;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
	public Class2_Sub16_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "(BI)V")
	public void method2198(@OriginalArg(1) int arg0) {
		this.aByteArray17[this.anInt2789++] = (byte) (this.aClass52_1.method1483() + arg0);
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([BIBI)V")
	public void method2199(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			arg0[local15] = (byte) (this.aByteArray17[this.anInt2789++] - this.aClass52_1.method1483());
		}
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "(B)I")
	public int method2200() {
		return this.aByteArray17[this.anInt2789++] - this.aClass52_1.method1483() & 0xFF;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZ)I")
	public int method2201(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2862;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(BI)I")
	public int method2202(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt2862 & 0x7);
		@Pc(18) int local18 = this.anInt2862 >> 3;
		@Pc(20) int local20 = 0;
		this.anInt2862 += arg0;
		while (arg0 > local13) {
			local20 += (Static218.anIntArray444[local13] & this.aByteArray17[local18++]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (local13 == arg0) {
			local20 += this.aByteArray17[local18] & Static218.anIntArray444[local13];
		} else {
			local20 += this.aByteArray17[local18] >> local13 - arg0 & Static218.anIntArray444[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!ih", name = "o", descriptor = "(B)V")
	public void method2204() {
		this.anInt2862 = this.anInt2789 * 8;
	}

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "(B)V")
	public void method2205() {
		this.anInt2789 = (this.anInt2862 + 7) / 8;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([II)V")
	public void method2206(@OriginalArg(0) int[] arg0) {
		this.aClass52_1 = new Class52(arg0);
	}
}
