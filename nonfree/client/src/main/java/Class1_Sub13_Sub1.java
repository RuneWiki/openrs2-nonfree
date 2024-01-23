import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!ha", name = "Nb", descriptor = "I")
	private int anInt2067;

	@OriginalMember(owner = "client!ha", name = "Pb", descriptor = "Lclient!ok;")
	private Class127 aClass127_1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "m", descriptor = "(II)I")
	public int method1883(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2067 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt2067 & 0x7);
		this.anInt2067 += arg0;
		@Pc(25) int local25 = 0;
		while (arg0 > local17) {
			local25 += (this.aByteArray63[local10++] & Static141.anIntArray241[local17]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local25 += this.aByteArray63[local10] & Static141.anIntArray241[local17];
		} else {
			local25 += this.aByteArray63[local10] >> local17 - arg0 & Static141.anIntArray241[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "(II)I")
	public int method1886(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2067;
	}

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "(II)V")
	public void method1887(@OriginalArg(1) int arg0) {
		this.aByteArray63[this.anInt2018++] = (byte) (arg0 + this.aClass127_1.method3421());
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)I")
	public int method1888() {
		return this.aByteArray63[this.anInt2018++] - this.aClass127_1.method3421() & 0xFF;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "([II)V")
	public void method1889(@OriginalArg(0) int[] arg0) {
		this.aClass127_1 = new Class127(arg0);
	}

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "(B)V")
	public void method1890() {
		this.anInt2018 = (this.anInt2067 + 7) / 8;
	}

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "(I)V")
	public void method1892() {
		this.anInt2067 = this.anInt2018 * 8;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B[BII)V")
	public void method1893(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < arg1; local13++) {
			arg0[local13] = (byte) (this.aByteArray63[this.anInt2018++] - this.aClass127_1.method3421());
		}
	}
}
