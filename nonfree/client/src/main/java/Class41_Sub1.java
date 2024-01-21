import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
	private int anInt1687;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
	private int anInt1686 = 0;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
	private int anInt1690 = 256;

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
	private int anInt1691 = 1;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "J")
	private long aLong52 = Static68.method1276();

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class41_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong52;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	@Override
	public void method1580() {
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			this.aLongArray1[local11] = 0L;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)I")
	@Override
	public int method1581(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt1690;
		@Pc(11) int local11 = this.anInt1691;
		this.anInt1690 = 300;
		this.anInt1691 = 1;
		this.aLong52 = Static68.method1276();
		if (this.aLongArray1[this.anInt1687] == 0L) {
			this.anInt1691 = local11;
			this.anInt1690 = local8;
		} else if (this.aLong52 > this.aLongArray1[this.anInt1687]) {
			this.anInt1690 = (int) ((long) (arg0 * 2560) / (this.aLong52 - this.aLongArray1[this.anInt1687]));
		}
		if (this.anInt1690 < 25) {
			this.anInt1690 = 25;
		}
		if (this.anInt1690 > 256) {
			this.anInt1690 = 256;
			this.anInt1691 = (int) ((long) arg0 - (this.aLong52 - this.aLongArray1[this.anInt1687]) / 10L);
		}
		if (this.anInt1691 > arg0) {
			this.anInt1691 = arg0;
		}
		this.aLongArray1[this.anInt1687] = this.aLong52;
		this.anInt1687 = (this.anInt1687 + 1) % 10;
		@Pc(131) int local131;
		if (this.anInt1691 > 1) {
			for (local131 = 0; local131 < 10; local131++) {
				if (this.aLongArray1[local131] != 0L) {
					this.aLongArray1[local131] += this.anInt1691;
				}
			}
		}
		if (this.anInt1691 < arg1) {
			this.anInt1691 = arg1;
		}
		local131 = 0;
		Static119.method2069((long) this.anInt1691);
		while (this.anInt1686 < 256) {
			this.anInt1686 += this.anInt1690;
			local131++;
		}
		this.anInt1686 &= 0xFF;
		return local131;
	}
}
