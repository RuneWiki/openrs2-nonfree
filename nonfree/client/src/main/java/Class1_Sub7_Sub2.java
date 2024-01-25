import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class1_Sub7_Sub2 extends Class1_Sub7 {

	@OriginalMember(owner = "client!ge", name = "Hb", descriptor = "Lclient!fa;")
	private Class52 aClass52_1;

	@OriginalMember(owner = "client!ge", name = "Mb", descriptor = "I")
	private int anInt2260;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class1_Sub7_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "(II)V")
	public void method2163(@OriginalArg(1) int arg0) {
		super.aByteArray41[super.anInt2219++] = (byte) (this.aClass52_1.method1780() + arg0);
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(ZI)I")
	public int method2164(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2260;
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(I)I")
	public int method2165() {
		@Pc(29) int local29 = super.aByteArray41[super.anInt2219++] - this.aClass52_1.method1780() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray41[super.anInt2219++] - this.aClass52_1.method1780() & 0xFF);
	}

	@OriginalMember(owner = "client!ge", name = "q", descriptor = "(I)V")
	public void method2166() {
		this.anInt2260 = super.anInt2219 * 8;
	}

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "(B)V")
	public void method2167() {
		super.anInt2219 = (this.anInt2260 + 7) / 8;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "([II)V")
	public void method2168(@OriginalArg(0) int[] arg0) {
		this.aClass52_1 = new Class52(arg0);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(IB)I")
	public int method2169(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = this.anInt2260 >> 3;
		@Pc(26) int local26 = 8 - (this.anInt2260 & 0x7);
		@Pc(28) int local28 = 0;
		this.anInt2260 += arg0;
		while (local26 < arg0) {
			local28 += (super.aByteArray41[local18++] & Static340.anIntArray488[local26]) << arg0 - local26;
			arg0 -= local26;
			local26 = 8;
		}
		if (local26 == arg0) {
			local28 += Static340.anIntArray488[local26] & super.aByteArray41[local18];
		} else {
			local28 += super.aByteArray41[local18] >> local26 - arg0 & Static340.anIntArray488[arg0];
		}
		return local28;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II[BI)V")
	public void method2170(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg0; local8++) {
			arg1[local8] = (byte) (super.aByteArray41[super.anInt2219++] - this.aClass52_1.method1780());
		}
	}

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "(I)Z")
	public boolean method2171() {
		@Pc(17) int local17 = super.aByteArray41[super.anInt2219] - this.aClass52_1.method1775() & 0xFF;
		return local17 >= 128;
	}
}
