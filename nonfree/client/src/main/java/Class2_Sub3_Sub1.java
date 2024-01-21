import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wc", name = "Nb", descriptor = "I")
	private int anInt2599;

	@OriginalMember(owner = "client!wc", name = "Wb", descriptor = "Lclient!be;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(B)I")
	public int method1733() {
		return super.aByteArray24[super.anInt2546++] - this.aClass10_1.method231() & 0xFF;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([II)V")
	public void method1734(@OriginalArg(0) int[] arg0) {
		this.aClass10_1 = new Class10(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(II)V")
	public void method1736(@OriginalArg(1) int arg0) {
		super.aByteArray24[super.anInt2546++] = (byte) (this.aClass10_1.method231() + arg0);
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(Z)V")
	public void method1737() {
		this.anInt2599 = super.anInt2546 * 8;
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(B)V")
	public void method1739() {
		super.anInt2546 = (this.anInt2599 + 7) / 8;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(ZI)I")
	public int method1742(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2599;
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(II)I")
	public int method1743(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt2599 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt2599 & 0x7);
		this.anInt2599 += arg0;
		@Pc(34) int local34 = 0;
		while (local26 < arg0) {
			local34 += (super.aByteArray24[local10++] & Static48.anIntArray235[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (arg0 == local26) {
			local34 += Static48.anIntArray235[local26] & super.aByteArray24[local10];
		} else {
			local34 += super.aByteArray24[local10] >> local26 - arg0 & Static48.anIntArray235[arg0];
		}
		return local34;
	}
}
