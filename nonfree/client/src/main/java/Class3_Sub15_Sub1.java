import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class3_Sub15_Sub1 extends Class3_Sub15 {

	@OriginalMember(owner = "client!dfa", name = "Gb", descriptor = "Lclient!rr;")
	private Class294 aClass294_1;

	@OriginalMember(owner = "client!dfa", name = "Qb", descriptor = "I")
	private int anInt2473;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub15_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "p", descriptor = "(II)I")
	public int method2432(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt2473 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt2473 & 0x7);
		this.anInt2473 += arg0;
		@Pc(34) int local34 = 0;
		while (local26 < arg0) {
			local34 += (super.aByteArray106[local10++] & Static172.anIntArray226[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local34 += super.aByteArray106[local10] & Static172.anIntArray226[local26];
		} else {
			local34 += super.aByteArray106[local10] >> local26 - arg0 & Static172.anIntArray226[arg0];
		}
		return local34;
	}

	@OriginalMember(owner = "client!dfa", name = "k", descriptor = "(B)Z")
	public boolean method2433() {
		@Pc(25) int local25 = super.aByteArray106[super.anInt10282] - this.aClass294_1.method7249() & 0xFF;
		return local25 >= 128;
	}

	@OriginalMember(owner = "client!dfa", name = "c", descriptor = "(IB)I")
	public int method2434(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2473;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(B[I)V")
	public void method2435(@OriginalArg(1) int[] arg0) {
		this.aClass294_1 = new Class294(arg0);
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BLclient!rr;)V")
	public void method2436(@OriginalArg(1) Class294 arg0) {
		this.aClass294_1 = arg0;
	}

	@OriginalMember(owner = "client!dfa", name = "w", descriptor = "(I)I")
	public int method2437() {
		@Pc(28) int local28 = super.aByteArray106[super.anInt10282++] - this.aClass294_1.method7252() & 0xFF;
		return local28 < 128 ? local28 : (local28 - 128 << 8) + (super.aByteArray106[super.anInt10282++] - this.aClass294_1.method7252() & 0xFF);
	}

	@OriginalMember(owner = "client!dfa", name = "l", descriptor = "(B)V")
	public void method2438() {
		this.anInt2473 = super.anInt10282 * 8;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I[BII)V")
	public void method2439(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
			arg0[local11] = (byte) (super.aByteArray106[super.anInt10282++] - this.aClass294_1.method7252());
		}
	}

	@OriginalMember(owner = "client!dfa", name = "g", descriptor = "(Z)V")
	public void method2440() {
		super.anInt10282 = (this.anInt2473 + 7) / 8;
	}

	@OriginalMember(owner = "client!dfa", name = "e", descriptor = "(BI)V")
	public void method2441(@OriginalArg(1) int arg0) {
		super.aByteArray106[super.anInt10282++] = (byte) (arg0 + this.aClass294_1.method7252());
	}
}
