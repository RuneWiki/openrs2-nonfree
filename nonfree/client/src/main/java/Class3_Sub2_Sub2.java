import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class3_Sub2_Sub2 extends Class3_Sub2 {

	@OriginalMember(owner = "client!wt", name = "Hb", descriptor = "I")
	private int anInt7680;

	@OriginalMember(owner = "client!wt", name = "Ob", descriptor = "Lclient!fj;")
	private Class76 aClass76_1;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "s", descriptor = "(I)V")
	public void method6056() {
		this.anInt7680 = super.anInt7620 * 8;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(BI)I")
	public int method6057(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = this.anInt7680 >> 3;
		@Pc(16) int local16 = 8 - (this.anInt7680 & 0x7);
		@Pc(18) int local18 = 0;
		this.anInt7680 += arg0;
		while (arg0 > local16) {
			local18 += (Static360.anIntArray465[local16] & super.aByteArray95[local8++]) << arg0 - local16;
			arg0 -= local16;
			local16 = 8;
		}
		if (local16 == arg0) {
			local18 += super.aByteArray95[local8] & Static360.anIntArray465[local16];
		} else {
			local18 += super.aByteArray95[local8] >> local16 - arg0 & Static360.anIntArray465[arg0];
		}
		return local18;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(ZI)V")
	public void method6058(@OriginalArg(1) int arg0) {
		super.aByteArray95[super.anInt7620++] = (byte) (this.aClass76_1.method2103() + arg0);
	}

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "(I)V")
	public void method6059() {
		super.anInt7620 = (this.anInt7680 + 7) / 8;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(IZ)I")
	public int method6060(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt7680;
	}

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "(B)I")
	public int method6061() {
		@Pc(21) int local21 = super.aByteArray95[super.anInt7620++] - this.aClass76_1.method2103() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray95[super.anInt7620++] - this.aClass76_1.method2103() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Z[I)V")
	public void method6062(@OriginalArg(1) int[] arg0) {
		this.aClass76_1 = new Class76(arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB[BI)V")
	public void method6063(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0; local1++) {
			arg1[local1] = (byte) (super.aByteArray95[super.anInt7620++] - this.aClass76_1.method2103());
		}
	}

	@OriginalMember(owner = "client!wt", name = "u", descriptor = "(I)Z")
	public boolean method6064() {
		@Pc(25) int local25 = super.aByteArray95[super.anInt7620] - this.aClass76_1.method2100() & 0xFF;
		return local25 >= 128;
	}
}
