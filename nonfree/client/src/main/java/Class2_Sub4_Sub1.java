import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 {

	@OriginalMember(owner = "client!jf", name = "Rb", descriptor = "I")
	private int anInt1337;

	@OriginalMember(owner = "client!jf", name = "Zb", descriptor = "Lclient!ab;")
	private Class3 aClass3_1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(Z)I")
	public int method951() {
		return super.aByteArray20[super.anInt1298++] - this.aClass3_1.method72() & 0xFF;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(BI)I")
	public int method953(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1337 >> 3;
		@Pc(19) int local19 = 0;
		@Pc(27) int local27 = 8 - (this.anInt1337 & 0x7);
		this.anInt1337 += arg0;
		while (arg0 > local27) {
			local19 += (Static28.anIntArray74[local27] & super.aByteArray20[local10++]) << arg0 - local27;
			arg0 -= local27;
			local27 = 8;
		}
		if (local27 == arg0) {
			local19 += super.aByteArray20[local10] & Static28.anIntArray74[local27];
		} else {
			local19 += super.aByteArray20[local10] >> local27 - arg0 & Static28.anIntArray74[arg0];
		}
		return local19;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(B)V")
	public void method954() {
		this.anInt1337 = super.anInt1298 * 8;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[I)V")
	public void method958(@OriginalArg(1) int[] arg0) {
		this.aClass3_1 = new Class3(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "(II)I")
	public int method960(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1337;
	}

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "(II)V")
	public void method962(@OriginalArg(0) int arg0) {
		super.aByteArray20[super.anInt1298++] = (byte) (this.aClass3_1.method72() + arg0);
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "(B)V")
	public void method963() {
		super.anInt1298 = (this.anInt1337 + 7) / 8;
	}
}
