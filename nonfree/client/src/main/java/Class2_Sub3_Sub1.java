import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ae", name = "Rb", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!ae", name = "ec", descriptor = "Lclient!nd;")
	private Class66 aClass66_1;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "(II)I")
	public int method219(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt280 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt280 & 0x7);
		this.anInt280 += arg0;
		@Pc(31) int local31 = 0;
		while (local18 < arg0) {
			local31 += (Static194.anIntArray496[local18] & super.aByteArray4[local6++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local31 += super.aByteArray4[local6] & Static194.anIntArray496[local18];
		} else {
			local31 += super.aByteArray4[local6] >> local18 - arg0 & Static194.anIntArray496[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[BZI)V")
	public void method220(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			arg1[local12] = (byte) (super.aByteArray4[super.anInt239++] - this.aClass66_1.method2090());
		}
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)V")
	public void method221(@OriginalArg(1) int arg0) {
		super.aByteArray4[super.anInt239++] = (byte) (arg0 + this.aClass66_1.method2090());
	}

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "(ZI)I")
	public int method222(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt280;
	}

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "(B)I")
	public int method224() {
		return super.aByteArray4[super.anInt239++] - this.aClass66_1.method2090() & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "(I)V")
	public void method225() {
		this.anInt280 = super.anInt239 * 8;
	}

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "(I)V")
	public void method226() {
		super.anInt239 = (this.anInt280 + 7) / 8;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([IB)V")
	public void method227(@OriginalArg(0) int[] arg0) {
		this.aClass66_1 = new Class66(arg0);
	}
}
