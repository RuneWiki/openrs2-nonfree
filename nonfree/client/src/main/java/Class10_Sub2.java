import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
	private int anInt723 = 0;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
	private int anInt716 = 256;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
	private int anInt721 = 1;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "J")
	private long aLong26 = Static54.method1236();

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class10_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong26;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
	@Override
	public int method543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = this.anInt716;
		this.anInt716 = 300;
		@Pc(21) int local21 = this.anInt721;
		this.anInt721 = 1;
		this.aLong26 = Static54.method1236();
		if (this.aLongArray1[this.anInt719] == 0L) {
			this.anInt721 = local21;
			this.anInt716 = local15;
		} else if (this.aLong26 > this.aLongArray1[this.anInt719]) {
			this.anInt716 = (int) ((long) (arg0 * 2560) / (this.aLong26 - this.aLongArray1[this.anInt719]));
		}
		if (this.anInt716 < 25) {
			this.anInt716 = 25;
		}
		if (this.anInt716 > 256) {
			this.anInt716 = 256;
			this.anInt721 = (int) ((long) arg0 - (this.aLong26 - this.aLongArray1[this.anInt719]) / 10L);
		}
		if (this.anInt721 > arg0) {
			this.anInt721 = arg0;
		}
		this.aLongArray1[this.anInt719] = this.aLong26;
		this.anInt719 = (this.anInt719 + 1) % 10;
		@Pc(144) int local144;
		if (this.anInt721 > 1) {
			for (local144 = 0; local144 < 10; local144++) {
				if (this.aLongArray1[local144] != 0L) {
					this.aLongArray1[local144] += this.anInt721;
				}
			}
		}
		if (this.anInt721 < arg1) {
			this.anInt721 = arg1;
		}
		Static13.method399((long) this.anInt721);
		local144 = 0;
		while (this.anInt723 < 256) {
			local144++;
			this.anInt723 += this.anInt716;
		}
		this.anInt723 &= 0xFF;
		return local144;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	@Override
	public void method539() {
		for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
			this.aLongArray1[local12] = 0L;
		}
	}
}
