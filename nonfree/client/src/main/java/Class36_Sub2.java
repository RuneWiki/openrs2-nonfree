import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!t", name = "j", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!t", name = "q", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!t", name = "f", descriptor = "I")
	private int anInt3525 = 256;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "I")
	private int anInt3534 = 0;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "I")
	private int anInt3535 = 1;

	@OriginalMember(owner = "client!t", name = "g", descriptor = "J")
	private long aLong128 = Static23.method507();

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "()V")
	public Class36_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray8[local22] = this.aLong128;
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
	@Override
	public void method2681() {
		for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
			this.aLongArray8[local13] = 0L;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BII)I")
	@Override
	public int method2684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt3525;
		@Pc(11) int local11 = this.anInt3535;
		this.anInt3535 = 1;
		this.anInt3525 = 300;
		this.aLong128 = Static23.method507();
		if (this.aLongArray8[this.anInt3528] == 0L) {
			this.anInt3535 = local11;
			this.anInt3525 = local8;
		} else if (this.aLongArray8[this.anInt3528] < this.aLong128) {
			this.anInt3525 = (int) ((long) (arg0 * 2560) / (this.aLong128 - this.aLongArray8[this.anInt3528]));
		}
		if (this.anInt3525 < 25) {
			this.anInt3525 = 25;
		}
		if (this.anInt3525 > 256) {
			this.anInt3525 = 256;
			this.anInt3535 = (int) ((long) arg0 - (this.aLong128 - this.aLongArray8[this.anInt3528]) / 10L);
		}
		if (this.anInt3535 > arg0) {
			this.anInt3535 = arg0;
		}
		this.aLongArray8[this.anInt3528] = this.aLong128;
		this.anInt3528 = (this.anInt3528 + 1) % 10;
		@Pc(126) int local126;
		if (this.anInt3535 > 1) {
			for (local126 = 0; local126 < 10; local126++) {
				if (this.aLongArray8[local126] != 0L) {
					this.aLongArray8[local126] += this.anInt3535;
				}
			}
		}
		if (arg1 > this.anInt3535) {
			this.anInt3535 = arg1;
		}
		Static133.method2259((long) this.anInt3535);
		local126 = 0;
		while (this.anInt3534 < 256) {
			this.anInt3534 += this.anInt3525;
			local126++;
		}
		this.anInt3534 &= 0xFF;
		return local126;
	}
}
