import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "J")
	private long aLong2;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	private int anInt69;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
	private int anInt79;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	public Class4_Sub1() {
		this.method708();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	@Override
	public void method706() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray1[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	@Override
	public void method708() {
		this.anInt79 = 0;
		this.anInt71 = 1;
		this.anInt69 = 256;
		this.aLong2 = Static50.method959();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray1[local24] = this.aLong2;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)I")
	@Override
	public int method707(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt69;
		@Pc(11) int local11 = this.anInt71;
		this.anInt71 = 1;
		this.anInt69 = 300;
		this.aLong2 = Static50.method959();
		if (this.aLongArray1[this.anInt75] == 0L) {
			this.anInt69 = local8;
			this.anInt71 = local11;
		} else if (this.aLong2 > this.aLongArray1[this.anInt75]) {
			this.anInt69 = (int) ((long) (arg1 * 2560) / (this.aLong2 - this.aLongArray1[this.anInt75]));
		}
		if (this.anInt69 < 25) {
			this.anInt69 = 25;
		}
		if (this.anInt69 > 256) {
			this.anInt69 = 256;
			this.anInt71 = (int) ((long) arg1 - (this.aLong2 - this.aLongArray1[this.anInt75]) / 10L);
		}
		if (this.anInt71 > arg1) {
			this.anInt71 = arg1;
		}
		this.aLongArray1[this.anInt75] = this.aLong2;
		this.anInt75 = (this.anInt75 + 1) % 10;
		@Pc(137) int local137;
		if (this.anInt71 > 1) {
			for (local137 = 0; local137 < 10; local137++) {
				if (this.aLongArray1[local137] != 0L) {
					this.aLongArray1[local137] += this.anInt71;
				}
			}
		}
		if (arg0 > this.anInt71) {
			this.anInt71 = arg0;
		}
		local137 = 0;
		Static23.method546((long) this.anInt71);
		while (this.anInt79 < 256) {
			this.anInt79 += this.anInt69;
			local137++;
		}
		this.anInt79 &= 0xFF;
		return local137;
	}
}
