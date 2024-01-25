import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class1_Sub21_Sub2 extends Class1_Sub21 {

	@OriginalMember(owner = "client!wf", name = "Fb", descriptor = "I")
	private int anInt6645;

	@OriginalMember(owner = "client!wf", name = "Sb", descriptor = "Lclient!qd;")
	private Class165 aClass165_1;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V")
	public Class1_Sub21_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)I")
	public int method5755(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6645;
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(IB)I")
	public int method5756(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt6645 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt6645 & 0x7);
		this.anInt6645 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local18) {
			local31 += (Static72.anIntArray113[local18] & super.aByteArray82[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local31 += super.aByteArray82[local10] & Static72.anIntArray113[local18];
		} else {
			local31 += super.aByteArray82[local10] >> local18 - arg0 & Static72.anIntArray113[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "(II)V")
	public void method5757(@OriginalArg(1) int arg0) {
		super.aByteArray82[super.anInt6611++] = (byte) (this.aClass165_1.method4405() + arg0);
	}

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "(B)I")
	public int method5758() {
		return super.aByteArray82[super.anInt6611++] - this.aClass165_1.method4405() & 0xFF;
	}

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "(I)V")
	public void method5759() {
		super.anInt6611 = (this.anInt6645 + 7) / 8;
	}

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "(B)V")
	public void method5763() {
		this.anInt6645 = super.anInt6611 * 8;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([II)V")
	public void method5764(@OriginalArg(0) int[] arg0) {
		this.aClass165_1 = new Class165(arg0);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIB[B)V")
	public void method5766(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			arg1[local12] = (byte) (super.aByteArray82[super.anInt6611++] - this.aClass165_1.method4405());
		}
	}
}
