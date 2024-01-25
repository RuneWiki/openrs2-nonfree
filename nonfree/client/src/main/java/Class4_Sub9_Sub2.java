import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class4_Sub9_Sub2 extends Class4_Sub9 {

	@OriginalMember(owner = "client!tf", name = "Kb", descriptor = "I")
	private int anInt6267;

	@OriginalMember(owner = "client!tf", name = "Tb", descriptor = "Lclient!jq;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(I)V")
	public Class4_Sub9_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(Z)I")
	public int method5066() {
		@Pc(29) int local29 = super.aByteArray81[super.anInt6207++] - this.aClass141_1.method2776() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray81[super.anInt6207++] - this.aClass141_1.method2776() & 0xFF);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([IZ)V")
	public void method5068(@OriginalArg(0) int[] arg0) {
		this.aClass141_1 = new Class141(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "(I)Z")
	public boolean method5069() {
		@Pc(23) int local23 = super.aByteArray81[super.anInt6207] - this.aClass141_1.method2777() & 0xFF;
		return local23 >= 128;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(BI)I")
	public int method5070(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt6267;
	}

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "(II)I")
	public int method5071(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt6267 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt6267 & 0x7);
		this.anInt6267 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray81[local15++] & Static402.anIntArray514[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += super.aByteArray81[local15] & Static402.anIntArray514[local23];
		} else {
			local31 += super.aByteArray81[local15] >> local23 - arg0 & Static402.anIntArray514[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "(I)V")
	public void method5074() {
		super.anInt6207 = (this.anInt6267 + 7) / 8;
	}

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "(Z)V")
	public void method5076() {
		this.anInt6267 = super.anInt6207 * 8;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI[BI)V")
	public void method5077(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray81[super.anInt6207++] - this.aClass141_1.method2776());
		}
	}

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "(II)V")
	public void method5078(@OriginalArg(1) int arg0) {
		super.aByteArray81[super.anInt6207++] = (byte) (this.aClass141_1.method2776() + arg0);
	}
}
