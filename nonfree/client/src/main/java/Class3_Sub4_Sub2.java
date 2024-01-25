import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ni", name = "Jb", descriptor = "Lclient!sg;")
	private Class179 aClass179_1;

	@OriginalMember(owner = "client!ni", name = "Pb", descriptor = "I")
	private int anInt4320;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V")
	public Class3_Sub4_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([BIBI)V")
	public void method3676(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray70[super.anInt4268++] - this.aClass179_1.method4890());
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)I")
	public int method3677(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt4320;
	}

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "(I)V")
	public void method3680() {
		super.anInt4268 = (this.anInt4320 + 7) / 8;
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "(IB)I")
	public int method3681(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt4320 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt4320 & 0x7);
		@Pc(19) int local19 = 0;
		this.anInt4320 += arg0;
		while (local17 < arg0) {
			local19 += (Static130.anIntArray179[local17] & super.aByteArray70[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local19 += super.aByteArray70[local10] & Static130.anIntArray179[local17];
		} else {
			local19 += super.aByteArray70[local10] >> local17 - arg0 & Static130.anIntArray179[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "(II)V")
	public void method3682(@OriginalArg(1) int arg0) {
		super.aByteArray70[super.anInt4268++] = (byte) (this.aClass179_1.method4890() + arg0);
	}

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "(I)I")
	public int method3686() {
		return super.aByteArray70[super.anInt4268++] - this.aClass179_1.method4890() & 0xFF;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([IZ)V")
	public void method3687(@OriginalArg(0) int[] arg0) {
		this.aClass179_1 = new Class179(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "(B)V")
	public void method3688() {
		this.anInt4320 = super.anInt4268 * 8;
	}
}
