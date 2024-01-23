import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!h", name = "Mb", descriptor = "Lclient!mh;")
	private Class86 aClass86_1;

	@OriginalMember(owner = "client!h", name = "Ub", descriptor = "I")
	private int anInt2409;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
	public Class1_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IZI[B)V")
	public void method1815(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg0; local11++) {
			arg1[local11] = (byte) (super.aByteArray29[super.anInt2395++] - this.aClass86_1.method2676());
		}
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(B)V")
	public void method1817() {
		this.anInt2409 = super.anInt2395 * 8;
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "(I)V")
	public void method1821() {
		super.anInt2395 = (this.anInt2409 + 7) / 8;
	}

	@OriginalMember(owner = "client!h", name = "x", descriptor = "(I)I")
	public int method1822() {
		return super.aByteArray29[super.anInt2395++] - this.aClass86_1.method2676() & 0xFF;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "([II)V")
	public void method1823(@OriginalArg(0) int[] arg0) {
		this.aClass86_1 = new Class86(arg0);
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(II)I")
	public int method1824(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2409;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(IB)V")
	public void method1825(@OriginalArg(0) int arg0) {
		super.aByteArray29[super.anInt2395++] = (byte) (this.aClass86_1.method2676() + arg0);
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "(II)I")
	public int method1826(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = 0;
		@Pc(15) int local15 = 8 - (this.anInt2409 & 0x7);
		@Pc(20) int local20 = this.anInt2409 >> 3;
		this.anInt2409 += arg0;
		while (local15 < arg0) {
			local7 += (super.aByteArray29[local20++] & Static205.anIntArray347[local15]) << arg0 - local15;
			arg0 -= local15;
			local15 = 8;
		}
		if (local15 == arg0) {
			local7 += Static205.anIntArray347[local15] & super.aByteArray29[local20];
		} else {
			local7 += super.aByteArray29[local20] >> local15 - arg0 & Static205.anIntArray347[arg0];
		}
		return local7;
	}
}
