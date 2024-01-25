import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!aba", name = "Mb", descriptor = "I")
	private int anInt211;

	@OriginalMember(owner = "client!aba", name = "Eb", descriptor = "Lclient!eca;")
	private Class88 aClass88_1;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(I)V")
	public Class3_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "(II)I")
	public int method216(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt211 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt211 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt211 += arg0;
		while (arg0 > local18) {
			local20 += (Static577.anIntArray645[local18] & super.aByteArray20[local10++]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (arg0 == local18) {
			local20 += Static577.anIntArray645[local18] & super.aByteArray20[local10];
		} else {
			local20 += super.aByteArray20[local10] >> local18 - arg0 & Static577.anIntArray645[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "(BI)I")
	public int method217(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt211;
	}

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "(B)I")
	public int method218() {
		@Pc(21) int local21 = super.aByteArray20[super.anInt2178++] - this.aClass88_1.method2367() & 0xFF;
		return local21 < 128 ? local21 : (super.aByteArray20[super.anInt2178++] - this.aClass88_1.method2367() & 0xFF) + (local21 - 128 << 8);
	}

	@OriginalMember(owner = "client!aba", name = "E", descriptor = "(I)V")
	public void method219() {
		super.anInt2178 = (this.anInt211 + 7) / 8;
	}

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "(BI)V")
	public void method220(@OriginalArg(1) int arg0) {
		super.aByteArray20[super.anInt2178++] = (byte) (this.aClass88_1.method2367() + arg0);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BLclient!eca;)V")
	public void method221(@OriginalArg(1) Class88 arg0) {
		this.aClass88_1 = arg0;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(B[I)V")
	public void method222(@OriginalArg(1) int[] arg0) {
		this.aClass88_1 = new Class88(arg0);
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I[BII)V")
	public void method223(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray20[super.anInt2178++] - this.aClass88_1.method2367());
		}
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(Z)Z")
	public boolean method224() {
		@Pc(24) int local24 = super.aByteArray20[super.anInt2178] - this.aClass88_1.method2368() & 0xFF;
		return local24 >= 128;
	}

	@OriginalMember(owner = "client!aba", name = "D", descriptor = "(I)V")
	public void method225() {
		this.anInt211 = super.anInt2178 * 8;
	}
}
