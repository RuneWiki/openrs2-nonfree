import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	private int anInt16;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
	private int anInt22 = 1;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
	private int anInt19 = 0;

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
	private int anInt24 = 256;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "J")
	private long aLong1 = Static42.method793();

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)I")
	@Override
	public int method1398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt24;
		this.anInt24 = 300;
		@Pc(14) int local14 = this.anInt22;
		this.anInt22 = 1;
		this.aLong1 = Static42.method793();
		if (this.aLongArray1[this.anInt16] == 0L) {
			this.anInt24 = local8;
			this.anInt22 = local14;
		} else if (this.aLong1 > this.aLongArray1[this.anInt16]) {
			this.anInt24 = (int) ((long) (arg0 * 2560) / (this.aLong1 - this.aLongArray1[this.anInt16]));
		}
		if (this.anInt24 < 25) {
			this.anInt24 = 25;
		}
		if (this.anInt24 > 256) {
			this.anInt24 = 256;
			this.anInt22 = (int) ((long) arg0 - (this.aLong1 - this.aLongArray1[this.anInt16]) / 10L);
		}
		if (this.anInt22 > arg0) {
			this.anInt22 = arg0;
		}
		this.aLongArray1[this.anInt16] = this.aLong1;
		this.anInt16 = (this.anInt16 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt22 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray1[local136] != 0L) {
					this.aLongArray1[local136] += this.anInt22;
				}
			}
		}
		if (arg1 > this.anInt22) {
			this.anInt22 = arg1;
		}
		Static6.method84((long) this.anInt22);
		local136 = 0;
		while (this.anInt19 < 256) {
			this.anInt19 += this.anInt24;
			local136++;
		}
		this.anInt19 &= 0xFF;
		return local136;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	@Override
	public void method1399() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray1[local3] = 0L;
		}
	}
}
