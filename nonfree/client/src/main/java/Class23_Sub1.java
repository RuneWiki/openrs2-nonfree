import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	private int anInt1061;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	private int anInt1063 = 0;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	private int anInt1064 = 1;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	private int anInt1066 = 256;

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "J")
	private long aLong36 = Static101.method1795();

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class23_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray3[local22] = this.aLong36;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	@Override
	public void method1618() {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			this.aLongArray3[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I")
	@Override
	public int method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt1064;
		@Pc(11) int local11 = this.anInt1066;
		this.anInt1064 = 1;
		this.anInt1066 = 300;
		this.aLong36 = Static101.method1795();
		if (this.aLongArray3[this.anInt1061] == 0L) {
			this.anInt1066 = local11;
			this.anInt1064 = local8;
		} else if (this.aLong36 > this.aLongArray3[this.anInt1061]) {
			this.anInt1066 = (int) ((long) (arg0 * 2560) / (this.aLong36 - this.aLongArray3[this.anInt1061]));
		}
		if (this.anInt1066 < 25) {
			this.anInt1066 = 25;
		}
		if (this.anInt1066 > 256) {
			this.anInt1066 = 256;
			this.anInt1064 = (int) ((long) arg0 - (this.aLong36 - this.aLongArray3[this.anInt1061]) / 10L);
		}
		if (this.anInt1064 > arg0) {
			this.anInt1064 = arg0;
		}
		this.aLongArray3[this.anInt1061] = this.aLong36;
		this.anInt1061 = (this.anInt1061 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt1064 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray3[local136] != 0L) {
					this.aLongArray3[local136] += this.anInt1064;
				}
			}
		}
		local136 = 0;
		if (arg1 > this.anInt1064) {
			this.anInt1064 = arg1;
		}
		Static27.method564((long) this.anInt1064);
		while (this.anInt1063 < 256) {
			this.anInt1063 += this.anInt1066;
			local136++;
		}
		this.anInt1063 &= 0xFF;
		return local136;
	}
}
