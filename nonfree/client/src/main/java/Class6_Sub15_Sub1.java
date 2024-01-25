import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eea")
public final class Class6_Sub15_Sub1 extends Class6_Sub15 {

	@OriginalMember(owner = "client!eea", name = "Lb", descriptor = "Lclient!oja;")
	private Class270 aClass270_1;

	@OriginalMember(owner = "client!eea", name = "Pb", descriptor = "I")
	private int anInt2522;

	@OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(I)V")
	public Class6_Sub15_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!eea", name = "o", descriptor = "(II)I")
	public int method2468(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2522 >> 3;
		@Pc(24) int local24 = 8 - (this.anInt2522 & 0x7);
		@Pc(26) int local26 = 0;
		this.anInt2522 += arg0;
		while (local24 < arg0) {
			local26 += (super.aByteArray20[local10++] & Static393.anIntArray406[local24]) << arg0 - local24;
			arg0 -= local24;
			local24 = 8;
		}
		if (arg0 == local24) {
			local26 += super.aByteArray20[local10] & Static393.anIntArray406[local24];
		} else {
			local26 += super.aByteArray20[local10] >> local24 - arg0 & Static393.anIntArray406[arg0];
		}
		return local26;
	}

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "(I)V")
	public void method2469() {
		this.anInt2522 = super.anInt3174 * 8;
	}

	@OriginalMember(owner = "client!eea", name = "e", descriptor = "(IB)V")
	public void method2471(@OriginalArg(0) int arg0) {
		super.aByteArray20[super.anInt3174++] = (byte) (this.aClass270_1.method6569() + arg0);
	}

	@OriginalMember(owner = "client!eea", name = "v", descriptor = "(I)V")
	public void method2472() {
		super.anInt3174 = (this.anInt2522 + 7) / 8;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "([IB)V")
	public void method2473(@OriginalArg(0) int[] arg0) {
		this.aClass270_1 = new Class270(arg0);
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILclient!oja;)V")
	public void method2474(@OriginalArg(1) Class270 arg0) {
		this.aClass270_1 = arg0;
	}

	@OriginalMember(owner = "client!eea", name = "s", descriptor = "(I)I")
	public int method2475() {
		@Pc(21) int local21 = super.aByteArray20[super.anInt3174++] - this.aClass270_1.method6569() & 0xFF;
		return local21 < 128 ? local21 : (local21 - 128 << 8) + (super.aByteArray20[super.anInt3174++] - this.aClass270_1.method6569() & 0xFF);
	}

	@OriginalMember(owner = "client!eea", name = "t", descriptor = "(I)Z")
	public boolean method2476() {
		@Pc(16) int local16 = super.aByteArray20[super.anInt3174] - this.aClass270_1.method6572() & 0xFF;
		return local16 >= 128;
	}

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "(BI)I")
	public int method2477(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2522;
	}

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "([BIII)V")
	public void method2478(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray20[super.anInt3174++] - this.aClass270_1.method6569());
		}
	}
}
