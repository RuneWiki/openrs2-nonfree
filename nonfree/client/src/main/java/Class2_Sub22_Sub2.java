import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class2_Sub22_Sub2 extends Class2_Sub22 {

	@OriginalMember(owner = "client!wn", name = "Bb", descriptor = "I")
	private int anInt10262;

	@OriginalMember(owner = "client!wn", name = "Ib", descriptor = "Lclient!haa;")
	private Class131 aClass131_2;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I)V")
	public Class2_Sub22_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B[I)V")
	public void method8557(@OriginalArg(1) int[] arg0) {
		this.aClass131_2 = new Class131(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "(BI)V")
	public void method8559(@OriginalArg(1) int arg0) {
		super.aByteArray115[super.anInt10247++] = (byte) (arg0 + this.aClass131_2.method2844());
	}

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "(B)V")
	public void method8560() {
		super.anInt10247 = (this.anInt10262 + 7) / 8;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!haa;I)V")
	public void method8561(@OriginalArg(0) Class131 arg0) {
		this.aClass131_2 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "(II)I")
	public int method8562(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt10262;
	}

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "(I)I")
	public int method8563() {
		@Pc(22) int local22 = super.aByteArray115[super.anInt10247++] - this.aClass131_2.method2844() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray115[super.anInt10247++] - this.aClass131_2.method2844() & 0xFF) + (local22 - 128 << 8);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II[BI)V")
	public void method8564(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray115[super.anInt10247++] - this.aClass131_2.method2844());
		}
	}

	@OriginalMember(owner = "client!wn", name = "x", descriptor = "(I)Z")
	public boolean method8565() {
		@Pc(16) int local16 = super.aByteArray115[super.anInt10247] - this.aClass131_2.method2843() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!wn", name = "y", descriptor = "(I)V")
	public void method8566() {
		this.anInt10262 = super.anInt10247 * 8;
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "(II)I")
	public int method8569(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt10262 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt10262 & 0x7);
		this.anInt10262 += arg0;
		@Pc(25) int local25 = 0;
		while (arg0 > local17) {
			local25 += (Static114.anIntArray144[local17] & super.aByteArray115[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (arg0 == local17) {
			local25 += super.aByteArray115[local10] & Static114.anIntArray144[local17];
		} else {
			local25 += super.aByteArray115[local10] >> local17 - arg0 & Static114.anIntArray144[arg0];
		}
		return local25;
	}
}
