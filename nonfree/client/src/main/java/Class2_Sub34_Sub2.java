import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class2_Sub34_Sub2 extends Class2_Sub34 {

	@OriginalMember(owner = "client!rca", name = "Bb", descriptor = "Lclient!sp;")
	private Class310 aClass310_1;

	@OriginalMember(owner = "client!rca", name = "Db", descriptor = "I")
	private int anInt8245;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(I)V")
	public Class2_Sub34_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "(IB)V")
	public void method6921(@OriginalArg(0) int arg0) {
		super.aByteArray77[super.anInt8188++] = (byte) (this.aClass310_1.method7344() + arg0);
	}

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "(BI)I")
	public int method6922(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt8245;
	}

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "(Z)V")
	public void method6923() {
		super.anInt8188 = (this.anInt8245 + 7) / 8;
	}

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "(B)Z")
	public boolean method6924() {
		@Pc(22) int local22 = super.aByteArray77[super.anInt8188] - this.aClass310_1.method7340() & 0xFF;
		return local22 >= 128;
	}

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "(II)I")
	public int method6925(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = this.anInt8245 >> 3;
		@Pc(15) int local15 = 8 - (this.anInt8245 & 0x7);
		this.anInt8245 += arg0;
		@Pc(23) int local23 = 0;
		while (arg0 > local15) {
			local23 += (super.aByteArray77[local8++] & Static116.anIntArray200[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (arg0 == local15) {
			local23 += Static116.anIntArray200[local15] & super.aByteArray77[local8];
		} else {
			local23 += super.aByteArray77[local8] >> local15 - arg0 & Static116.anIntArray200[arg0];
		}
		return local23;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[I)V")
	public void method6926(@OriginalArg(1) int[] arg0) {
		this.aClass310_1 = new Class310(arg0);
	}

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "(B)V")
	public void method6927() {
		this.anInt8245 = super.anInt8188 * 8;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!sp;I)V")
	public void method6928(@OriginalArg(0) Class310 arg0) {
		this.aClass310_1 = arg0;
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "([BIII)V")
	public void method6930(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray77[super.anInt8188++] - this.aClass310_1.method7344());
		}
	}

	@OriginalMember(owner = "client!rca", name = "v", descriptor = "(I)I")
	public int method6934() {
		@Pc(22) int local22 = super.aByteArray77[super.anInt8188++] - this.aClass310_1.method7344() & 0xFF;
		return local22 < 128 ? local22 : (super.aByteArray77[super.anInt8188++] - this.aClass310_1.method7344() & 0xFF) + (local22 - 128 << 8);
	}
}
