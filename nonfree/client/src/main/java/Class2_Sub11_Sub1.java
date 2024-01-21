import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!kg", name = "Fb", descriptor = "I")
	private int anInt2083;

	@OriginalMember(owner = "client!kg", name = "Sb", descriptor = "Lclient!sf;")
	private Class75 aClass75_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "(II)I")
	public int method1490(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = 8 - (this.anInt2083 & 0x7);
		@Pc(23) int local23 = this.anInt2083 >> 3;
		this.anInt2083 += arg0;
		@Pc(31) int local31 = 0;
		while (local13 < arg0) {
			local31 += (super.aByteArray24[local23++] & Static29.anIntArray63[local13]) << arg0 - local13;
			arg0 -= local13;
			local13 = 8;
		}
		if (arg0 == local13) {
			local31 += super.aByteArray24[local23] & Static29.anIntArray63[local13];
		} else {
			local31 += super.aByteArray24[local23] >> local13 - arg0 & Static29.anIntArray63[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "(II)I")
	public int method1491(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt2083;
	}

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "(I)I")
	public int method1492() {
		return super.aByteArray24[super.anInt2077++] - this.aClass75_1.method2284() & 0xFF;
	}

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "(I)V")
	public void method1494() {
		super.anInt2077 = (this.anInt2083 + 7) / 8;
	}

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "(II)V")
	public void method1495(@OriginalArg(0) int arg0) {
		super.aByteArray24[super.anInt2077++] = (byte) (arg0 + this.aClass75_1.method2284());
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "([IB)V")
	public void method1496(@OriginalArg(0) int[] arg0) {
		this.aClass75_1 = new Class75(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "(B)V")
	public void method1498() {
		this.anInt2083 = super.anInt2077 * 8;
	}
}
