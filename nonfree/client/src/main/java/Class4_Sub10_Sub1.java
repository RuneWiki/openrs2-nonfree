import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class4_Sub10_Sub1 extends Class4_Sub10 {

	@OriginalMember(owner = "client!wa", name = "Ob", descriptor = "Lclient!m;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!wa", name = "Yb", descriptor = "I")
	private int anInt5776;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V")
	public Class4_Sub10_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([II)V")
	public void method4676(@OriginalArg(0) int[] arg0) {
		this.aClass115_1 = new Class115(arg0);
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(I)V")
	public void method4679() {
		this.anInt5776 = this.anInt5713 * 8;
	}

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "(I)V")
	public void method4681() {
		this.anInt5713 = (this.anInt5776 + 7) / 8;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(Z)I")
	public int method4683() {
		return this.aByteArray71[this.anInt5713++] - this.aClass115_1.method2691() & 0xFF;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BII)V")
	public void method4684(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (this.aByteArray71[this.anInt5713++] - this.aClass115_1.method2691());
		}
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(II)V")
	public void method4687(@OriginalArg(1) int arg0) {
		this.aByteArray71[this.anInt5713++] = (byte) (this.aClass115_1.method2691() + arg0);
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(II)I")
	public int method4688(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt5776;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(II)I")
	public int method4689(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt5776 & 0x7);
		@Pc(18) int local18 = this.anInt5776 >> 3;
		this.anInt5776 += arg0;
		@Pc(26) int local26 = 0;
		while (arg0 > local13) {
			local26 += (this.aByteArray71[local18++] & Static302.anIntArray647[local13]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (local13 == arg0) {
			local26 += Static302.anIntArray647[local13] & this.aByteArray71[local18];
		} else {
			local26 += this.aByteArray71[local18] >> local13 - arg0 & Static302.anIntArray647[arg0];
		}
		return local26;
	}
}
