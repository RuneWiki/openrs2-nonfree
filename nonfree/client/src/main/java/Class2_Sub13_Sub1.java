import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub13_Sub1 extends Class2_Sub13 {

	@OriginalMember(owner = "client!ke", name = "Ub", descriptor = "I")
	private int anInt2188;

	@OriginalMember(owner = "client!ke", name = "Vb", descriptor = "Lclient!fe;")
	private Class24 aClass24_1;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "(I)I")
	public int method1451() {
		return super.aByteArray14[super.anInt2154++] - this.aClass24_1.method857() & 0xFF;
	}

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "(II)I")
	public int method1452(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2188;
	}

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "(Z)V")
	public void method1454() {
		this.anInt2188 = super.anInt2154 * 8;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(BI)V")
	public void method1455(@OriginalArg(1) int arg0) {
		super.aByteArray14[super.anInt2154++] = (byte) (this.aClass24_1.method857() + arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "([IB)V")
	public void method1456(@OriginalArg(0) int[] arg0) {
		this.aClass24_1 = new Class24(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "(Z)V")
	public void method1457() {
		super.anInt2154 = (this.anInt2188 + 7) / 8;
	}

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "(IB)I")
	public int method1458(@OriginalArg(0) int arg0) {
		@Pc(23) int local23 = 8 - (this.anInt2188 & 0x7);
		@Pc(25) int local25 = 0;
		@Pc(30) int local30 = this.anInt2188 >> 3;
		this.anInt2188 += arg0;
		while (local23 < arg0) {
			local25 += (super.aByteArray14[local30++] & Static182.anIntArray405[local23]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (arg0 == local23) {
			local25 += super.aByteArray14[local30] & Static182.anIntArray405[local23];
		} else {
			local25 += super.aByteArray14[local30] >> local23 - arg0 & Static182.anIntArray405[arg0];
		}
		return local25;
	}
}
