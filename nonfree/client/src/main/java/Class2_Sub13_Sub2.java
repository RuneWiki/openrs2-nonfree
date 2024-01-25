import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class2_Sub13_Sub2 extends Class2_Sub13 {

	@OriginalMember(owner = "client!pf", name = "Cb", descriptor = "I")
	private int anInt4849;

	@OriginalMember(owner = "client!pf", name = "Jb", descriptor = "Lclient!od;")
	private Class168 aClass168_1;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "(I)V")
	public void method4252() {
		this.anInt4849 = super.anInt4788 * 8;
	}

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "(IB)V")
	public void method4253(@OriginalArg(0) int arg0) {
		super.aByteArray77[super.anInt4788++] = (byte) (arg0 + this.aClass168_1.method4003());
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(BI)I")
	public int method4257(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt4849 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt4849 & 0x7);
		this.anInt4849 += arg0;
		@Pc(31) int local31 = 0;
		while (local18 < arg0) {
			local31 += (super.aByteArray77[local10++] & Static59.anIntArray158[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local31 += super.aByteArray77[local10] & Static59.anIntArray158[local18];
		} else {
			local31 += super.aByteArray77[local10] >> local18 - arg0 & Static59.anIntArray158[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III[B)V")
	public void method4259(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0; local7++) {
			arg1[local7] = (byte) (super.aByteArray77[super.anInt4788++] - this.aClass168_1.method4003());
		}
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "(B)I")
	public int method4260() {
		@Pc(21) int local21 = super.aByteArray77[super.anInt4788++] - this.aClass168_1.method4003() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray77[super.anInt4788++] - this.aClass168_1.method4003() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[I)V")
	public void method4261(@OriginalArg(1) int[] arg0) {
		this.aClass168_1 = new Class168(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "(B)V")
	public void method4262() {
		super.anInt4788 = (this.anInt4849 + 7) / 8;
	}

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "(IB)I")
	public int method4263(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt4849;
	}

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "(B)Z")
	public boolean method4264() {
		@Pc(21) int local21 = super.aByteArray77[super.anInt4788] - this.aClass168_1.method4005() & 0xFF;
		return local21 >= 128;
	}
}
