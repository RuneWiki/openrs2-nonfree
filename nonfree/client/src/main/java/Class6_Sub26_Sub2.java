import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lt")
public final class Class6_Sub26_Sub2 extends Class6_Sub26 {

	@OriginalMember(owner = "client!lt", name = "Ib", descriptor = "Lclient!ffa;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!lt", name = "Kb", descriptor = "I")
	private int anInt5834;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(I)V")
	public Class6_Sub26_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([BIBI)V")
	public void method5001(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray65[super.anInt5769++] - this.aClass105_1.method2658());
		}
	}

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "(B)V")
	public void method5002() {
		this.anInt5834 = super.anInt5769 * 8;
	}

	@OriginalMember(owner = "client!lt", name = "x", descriptor = "(I)I")
	public int method5003() {
		@Pc(27) int local27 = super.aByteArray65[super.anInt5769++] - this.aClass105_1.method2658() & 0xFF;
		return local27 < 128 ? local27 : (super.aByteArray65[super.anInt5769++] - this.aClass105_1.method2658() & 0xFF) + (local27 - 128 << 8);
	}

	@OriginalMember(owner = "client!lt", name = "y", descriptor = "(I)Z")
	public boolean method5004() {
		@Pc(24) int local24 = super.aByteArray65[super.anInt5769] - this.aClass105_1.method2659() & 0xFF;
		return local24 >= 128;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "([IB)V")
	public void method5005(@OriginalArg(0) int[] arg0) {
		this.aClass105_1 = new Class105(arg0);
	}

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "(B)V")
	public void method5006() {
		super.anInt5769 = (this.anInt5834 + 7) / 8;
	}

	@OriginalMember(owner = "client!lt", name = "k", descriptor = "(II)I")
	public int method5007(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt5834;
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(IB)I")
	public int method5008(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = this.anInt5834 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt5834 & 0x7);
		@Pc(28) int local28 = 0;
		this.anInt5834 += arg0;
		while (local26 < arg0) {
			local28 += (super.aByteArray65[local18++] & Static551.anIntArray815[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local28 += Static551.anIntArray815[local26] & super.aByteArray65[local18];
		} else {
			local28 += super.aByteArray65[local18] >> local26 - arg0 & Static551.anIntArray815[arg0];
		}
		return local28;
	}

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "(IZ)V")
	public void method5010(@OriginalArg(0) int arg0) {
		super.aByteArray65[super.anInt5769++] = (byte) (arg0 + this.aClass105_1.method2658());
	}
}
