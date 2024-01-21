import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!k", name = "Hb", descriptor = "Lclient!si;")
	private Class82 aClass82_1;

	@OriginalMember(owner = "client!k", name = "Jb", descriptor = "I")
	private int anInt2314;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!k", name = "r", descriptor = "(I)V")
	public void method1755() {
		super.anInt2306 = (this.anInt2314 + 7) / 8;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(IB)I")
	public int method1756(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = this.anInt2314 >> 3;
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = 8 - (this.anInt2314 & 0x7);
		this.anInt2314 += arg0;
		while (local18 < arg0) {
			local10 += (super.aByteArray29[local8++] & Static132.anIntArray374[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local10 += super.aByteArray29[local8] & Static132.anIntArray374[local18];
		} else {
			local10 += super.aByteArray29[local8] >> local18 - arg0 & Static132.anIntArray374[arg0];
		}
		return local10;
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "(BI)I")
	public int method1758(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2314;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(Z)V")
	public void method1759() {
		this.anInt2314 = super.anInt2306 * 8;
	}

	@OriginalMember(owner = "client!k", name = "l", descriptor = "(II)V")
	public void method1761(@OriginalArg(1) int arg0) {
		super.aByteArray29[super.anInt2306++] = (byte) (this.aClass82_1.method2927() + arg0);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([BIIB)V")
	public void method1762(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(5) int local5 = 0; local5 < arg1; local5++) {
			arg0[local5] = (byte) (super.aByteArray29[super.anInt2306++] - this.aClass82_1.method2927());
		}
	}

	@OriginalMember(owner = "client!k", name = "m", descriptor = "(B)I")
	public int method1765() {
		return super.aByteArray29[super.anInt2306++] - this.aClass82_1.method2927() & 0xFF;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "([II)V")
	public void method1766(@OriginalArg(0) int[] arg0) {
		this.aClass82_1 = new Class82(arg0);
	}
}
