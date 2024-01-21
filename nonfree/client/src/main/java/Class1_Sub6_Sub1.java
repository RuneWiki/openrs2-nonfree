import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub6_Sub1 extends Class1_Sub6 {

	@OriginalMember(owner = "client!uc", name = "fc", descriptor = "I")
	private int anInt2634;

	@OriginalMember(owner = "client!uc", name = "nc", descriptor = "Lclient!dc;")
	private Class18 aClass18_1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
	public Class1_Sub6_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(BI)I")
	public int method1873(@OriginalArg(1) int arg0) {
		@Pc(6) int local6 = this.anInt2634 >> 3;
		@Pc(13) int local13 = 8 - (this.anInt2634 & 0x7);
		this.anInt2634 += arg0;
		@Pc(32) int local32 = 0;
		while (local13 < arg0) {
			local32 += (Static22.anIntArray88[local13] & super.aByteArray27[local6++]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (local13 == arg0) {
			local32 += super.aByteArray27[local6] & Static22.anIntArray88[local13];
		} else {
			local32 += super.aByteArray27[local6] >> local13 - arg0 & Static22.anIntArray88[arg0];
		}
		return local32;
	}

	@OriginalMember(owner = "client!uc", name = "o", descriptor = "(I)I")
	public int method1874() {
		return super.aByteArray27[super.anInt2574++] - this.aClass18_1.method405() & 0xFF;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([IZ)V")
	public void method1875(@OriginalArg(0) int[] arg0) {
		this.aClass18_1 = new Class18(arg0);
	}

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "(II)V")
	public void method1877(@OriginalArg(1) int arg0) {
		super.aByteArray27[super.anInt2574++] = (byte) (arg0 + this.aClass18_1.method405());
	}

	@OriginalMember(owner = "client!uc", name = "m", descriptor = "(B)V")
	public void method1878() {
		super.anInt2574 = (this.anInt2634 + 7) / 8;
	}

	@OriginalMember(owner = "client!uc", name = "p", descriptor = "(I)V")
	public void method1879() {
		this.anInt2634 = super.anInt2574 * 8;
	}

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "(II)I")
	public int method1881(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2634;
	}
}
