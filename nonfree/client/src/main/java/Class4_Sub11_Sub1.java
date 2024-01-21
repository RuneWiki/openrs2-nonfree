import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class4_Sub11_Sub1 extends Class4_Sub11 {

	@OriginalMember(owner = "client!gh", name = "Pb", descriptor = "[I")
	public static final int[] anIntArray154 = new int[99];

	@OriginalMember(owner = "client!gh", name = "Ob", descriptor = "I")
	private int anInt1627;

	@OriginalMember(owner = "client!gh", name = "Qb", descriptor = "Lclient!va;")
	private Class89 aClass89_1;

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 99; local12++) {
			@Pc(17) int local17 = local12 + 1;
			@Pc(30) int local30 = (int) (Math.pow(2.0D, (double) local17 / 7.0D) * 300.0D + (double) local17);
			local10 += local30;
			anIntArray154[local12] = local10 / 4;
		}
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "(II)I")
	public int method1280(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt1627;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "([IZ)V")
	public void method1283(@OriginalArg(0) int[] arg0) {
		this.aClass89_1 = new Class89(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)I")
	public int method1284() {
		return super.aByteArray19[super.anInt1597++] - this.aClass89_1.method3011() & 0xFF;
	}

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "(II)V")
	public void method1285(@OriginalArg(0) int arg0) {
		super.aByteArray19[super.anInt1597++] = (byte) (arg0 + this.aClass89_1.method3011());
	}

	@OriginalMember(owner = "client!gh", name = "v", descriptor = "(I)V")
	public void method1286() {
		super.anInt1597 = (this.anInt1627 + 7) / 8;
	}

	@OriginalMember(owner = "client!gh", name = "w", descriptor = "(I)V")
	public void method1287() {
		this.anInt1627 = super.anInt1597 * 8;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(BI)I")
	public int method1288(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt1627 >> 3;
		@Pc(12) int local12 = 0;
		@Pc(20) int local20 = 8 - (this.anInt1627 & 0x7);
		this.anInt1627 += arg0;
		while (local20 < arg0) {
			local12 += (super.aByteArray19[local10++] & Static106.anIntArray246[local20]) << arg0 - local20;
			arg0 -= local20;
			local20 = 8;
		}
		if (arg0 == local20) {
			local12 += Static106.anIntArray246[local20] & super.aByteArray19[local10];
		} else {
			local12 += super.aByteArray19[local10] >> local20 - arg0 & Static106.anIntArray246[arg0];
		}
		return local12;
	}
}
