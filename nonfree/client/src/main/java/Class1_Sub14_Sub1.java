import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!lf", name = "Jb", descriptor = "I")
	private int anInt3293;

	@OriginalMember(owner = "client!lf", name = "Tb", descriptor = "Lclient!cf;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II[BI)V")
	public void method2652(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (this.aByteArray34[this.anInt3290++] - this.aClass28_1.method530());
		}
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "(B)I")
	public int method2654() {
		return this.aByteArray34[this.anInt3290++] - this.aClass28_1.method530() & 0xFF;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(II)I")
	public int method2657(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt3293 & 0x7);
		@Pc(18) int local18 = this.anInt3293 >> 3;
		this.anInt3293 += arg0;
		@Pc(31) int local31 = 0;
		while (local13 < arg0) {
			local31 += (this.aByteArray34[local18++] & Static245.anIntArray195[local13]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (arg0 == local13) {
			local31 += this.aByteArray34[local18] & Static245.anIntArray195[local13];
		} else {
			local31 += this.aByteArray34[local18] >> local13 - arg0 & Static245.anIntArray195[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(I[I)V")
	public void method2658(@OriginalArg(1) int[] arg0) {
		this.aClass28_1 = new Class28(arg0);
	}

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "(I)V")
	public void method2659() {
		this.anInt3293 = this.anInt3290 * 8;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(ZI)V")
	public void method2661(@OriginalArg(1) int arg0) {
		this.aByteArray34[this.anInt3290++] = (byte) (this.aClass28_1.method530() + arg0);
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(II)I")
	public int method2662(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3293;
	}

	@OriginalMember(owner = "client!lf", name = "A", descriptor = "(I)V")
	public void method2663() {
		this.anInt3290 = (this.anInt3293 + 7) / 8;
	}
}
