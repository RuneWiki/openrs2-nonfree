import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!le", name = "z", descriptor = "I")
	private int anInt1875;

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!le", name = "p", descriptor = "I")
	private int anInt1870 = 1;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	private int anInt1873 = 256;

	@OriginalMember(owner = "client!le", name = "q", descriptor = "I")
	private int anInt1871 = 0;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "J")
	private long aLong56 = Static44.method861();

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray4[local22] = this.aLong56;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)I")
	@Override
	public int method1574(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt1873;
		this.anInt1873 = 300;
		@Pc(14) int local14 = this.anInt1870;
		this.anInt1870 = 1;
		this.aLong56 = Static44.method861();
		if (this.aLongArray4[this.anInt1875] == 0L) {
			this.anInt1873 = local8;
			this.anInt1870 = local14;
		} else if (this.aLong56 > this.aLongArray4[this.anInt1875]) {
			this.anInt1873 = (int) ((long) (arg0 * 2560) / (this.aLong56 - this.aLongArray4[this.anInt1875]));
		}
		if (this.anInt1873 < 25) {
			this.anInt1873 = 25;
		}
		if (this.anInt1873 > 256) {
			this.anInt1873 = 256;
			this.anInt1870 = (int) ((long) arg0 - (this.aLong56 - this.aLongArray4[this.anInt1875]) / 10L);
		}
		if (this.anInt1870 > arg0) {
			this.anInt1870 = arg0;
		}
		this.aLongArray4[this.anInt1875] = this.aLong56;
		this.anInt1875 = (this.anInt1875 + 1) % 10;
		@Pc(131) int local131;
		if (this.anInt1870 > 1) {
			for (local131 = 0; local131 < 10; local131++) {
				if (this.aLongArray4[local131] != 0L) {
					this.aLongArray4[local131] += this.anInt1870;
				}
			}
		}
		if (arg1 > this.anInt1870) {
			this.anInt1870 = arg1;
		}
		Static46.method889((long) this.anInt1870);
		local131 = 0;
		while (this.anInt1871 < 256) {
			this.anInt1871 += this.anInt1873;
			local131++;
		}
		this.anInt1871 &= 0xFF;
		return local131;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	@Override
	public void method1573() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray4[local3] = 0L;
		}
	}
}
