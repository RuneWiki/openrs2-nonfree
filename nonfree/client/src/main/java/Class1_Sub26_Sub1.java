import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class1_Sub26_Sub1 extends Class1_Sub26 {

	@OriginalMember(owner = "client!re", name = "Nb", descriptor = "Lclient!lf;")
	private Class72 aClass72_1;

	@OriginalMember(owner = "client!re", name = "Xb", descriptor = "I")
	private int anInt4090;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(I)V")
	public Class1_Sub26_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(II)V")
	public void method3000(@OriginalArg(0) int arg0) {
		super.aByteArray52[super.anInt4021++] = (byte) (arg0 + this.aClass72_1.method2086());
	}

	@OriginalMember(owner = "client!re", name = "u", descriptor = "(I)V")
	public void method3001() {
		super.anInt4021 = (this.anInt4090 + 7) / 8;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(Z)I")
	public int method3003() {
		return super.aByteArray52[super.anInt4021++] - this.aClass72_1.method2086() & 0xFF;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(Z)V")
	public void method3004() {
		this.anInt4090 = super.anInt4021 * 8;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(IB)I")
	public int method3007(@OriginalArg(0) int arg0) {
		@Pc(6) int local6 = this.anInt4090 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt4090 & 0x7);
		this.anInt4090 += arg0;
		@Pc(31) int local31 = 0;
		while (local23 < arg0) {
			local31 += (super.aByteArray52[local6++] & Static200.anIntArray306[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local31 += super.aByteArray52[local6] & Static200.anIntArray306[local23];
		} else {
			local31 += super.aByteArray52[local6] >> local23 - arg0 & Static200.anIntArray306[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!re", name = "m", descriptor = "(II)I")
	public int method3008(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt4090;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(II[BI)V")
	public void method3010(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = (byte) (super.aByteArray52[super.anInt4021++] - this.aClass72_1.method2086());
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I[I)V")
	public void method3011(@OriginalArg(1) int[] arg0) {
		this.aClass72_1 = new Class72(arg0);
	}
}
