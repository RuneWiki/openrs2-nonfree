import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class2_Sub3_Sub1 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ae", name = "Jb", descriptor = "Lclient!jd;")
	private Class41 aClass41_1;

	@OriginalMember(owner = "client!ae", name = "Lb", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V")
	public Class2_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "(II)V")
	public void method244(@OriginalArg(0) int arg0) {
		super.aByteArray4[super.anInt273++] = (byte) (this.aClass41_1.method1989() + arg0);
	}

	@OriginalMember(owner = "client!ae", name = "q", descriptor = "(II)I")
	public int method246(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt274 >> 3;
		@Pc(17) int local17 = 8 - (this.anInt274 & 0x7);
		this.anInt274 += arg0;
		@Pc(25) int local25 = 0;
		while (local17 < arg0) {
			local25 += (Static16.anIntArray44[local17] & super.aByteArray4[local10++]) << arg0 - local17;
			arg0 -= local17;
			local17 = 8;
		}
		if (local17 == arg0) {
			local25 += Static16.anIntArray44[local17] & super.aByteArray4[local10];
		} else {
			local25 += super.aByteArray4[local10] >> local17 - arg0 & Static16.anIntArray44[arg0];
		}
		return local25;
	}

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "(B)V")
	public void method247() {
		this.anInt274 = super.anInt273 * 8;
	}

	@OriginalMember(owner = "client!ae", name = "r", descriptor = "(II)I")
	public int method248(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt274;
	}

	@OriginalMember(owner = "client!ae", name = "v", descriptor = "(I)I")
	public int method251() {
		return super.aByteArray4[super.anInt273++] - this.aClass41_1.method1989() & 0xFF;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "([II)V")
	public void method252(@OriginalArg(0) int[] arg0) {
		this.aClass41_1 = new Class41(arg0);
	}

	@OriginalMember(owner = "client!ae", name = "w", descriptor = "(I)V")
	public void method253() {
		super.anInt273 = (this.anInt274 + 7) / 8;
	}
}
