import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class3_Sub7_Sub1 extends Class3_Sub7 {

	@OriginalMember(owner = "client!fa", name = "Nb", descriptor = "I")
	private int anInt1000;

	@OriginalMember(owner = "client!fa", name = "Pb", descriptor = "Lclient!kf;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(IB)I")
	public int method655(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1000;
	}

	@OriginalMember(owner = "client!fa", name = "l", descriptor = "(B)I")
	public int method656() {
		return super.aByteArray15[super.anInt964++] - this.aClass44_1.method1111() & 0xFF;
	}

	@OriginalMember(owner = "client!fa", name = "m", descriptor = "(B)V")
	public void method658() {
		this.anInt1000 = super.anInt964 * 8;
	}

	@OriginalMember(owner = "client!fa", name = "n", descriptor = "(B)V")
	public void method659() {
		super.anInt964 = (this.anInt1000 + 7) / 8;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(IB)I")
	public int method661(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt1000 & 0x7);
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = this.anInt1000 >> 3;
		this.anInt1000 += arg0;
		while (local13 < arg0) {
			local15 += (Static63.anIntArray199[local13] & super.aByteArray15[local20++]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (arg0 == local13) {
			local15 += Static63.anIntArray199[local13] & super.aByteArray15[local20];
		} else {
			local15 += Static63.anIntArray199[arg0] & super.aByteArray15[local20] >> local13 - arg0;
		}
		return local15;
	}

	@OriginalMember(owner = "client!fa", name = "h", descriptor = "(II)V")
	public void method662(@OriginalArg(1) int arg0) {
		super.aByteArray15[super.anInt964++] = (byte) (arg0 + this.aClass44_1.method1111());
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[I)V")
	public void method665(@OriginalArg(1) int[] arg0) {
		this.aClass44_1 = new Class44(arg0);
	}
}
