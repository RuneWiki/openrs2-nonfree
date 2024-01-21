import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!m", name = "s", descriptor = "I")
	private int anInt1697;

	@OriginalMember(owner = "client!m", name = "u", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "I")
	private int anInt1699;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "I")
	private int anInt1702;

	@OriginalMember(owner = "client!m", name = "G", descriptor = "I")
	private int anInt1705;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class19_Sub2() {
		this.method1168();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	@Override
	public void method1164() {
		for (@Pc(16) int local16 = 0; local16 < 10; local16++) {
			this.aLongArray5[local16] = 0L;
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	@Override
	public void method1168() {
		this.anInt1705 = 0;
		this.anInt1699 = 256;
		this.anInt1702 = 1;
		this.aLong62 = Static1.method3();
		for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
			this.aLongArray5[local25] = this.aLong62;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III)I")
	@Override
	public int method1163(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt1702;
		this.anInt1702 = 1;
		@Pc(14) int local14 = this.anInt1699;
		this.anInt1699 = 300;
		this.aLong62 = Static1.method3();
		if (this.aLongArray5[this.anInt1697] == 0L) {
			this.anInt1702 = local8;
			this.anInt1699 = local14;
		} else if (this.aLong62 > this.aLongArray5[this.anInt1697]) {
			this.anInt1699 = (int) ((long) (arg0 * 2560) / (this.aLong62 - this.aLongArray5[this.anInt1697]));
		}
		if (this.anInt1699 < 25) {
			this.anInt1699 = 25;
		}
		if (this.anInt1699 > 256) {
			this.anInt1699 = 256;
			this.anInt1702 = (int) ((long) arg0 - (this.aLong62 - this.aLongArray5[this.anInt1697]) / 10L);
		}
		if (arg0 < this.anInt1702) {
			this.anInt1702 = arg0;
		}
		this.aLongArray5[this.anInt1697] = this.aLong62;
		this.anInt1697 = (this.anInt1697 + 1) % 10;
		@Pc(130) int local130;
		if (this.anInt1702 > 1) {
			for (local130 = 0; local130 < 10; local130++) {
				if (this.aLongArray5[local130] != 0L) {
					this.aLongArray5[local130] += this.anInt1702;
				}
			}
		}
		if (this.anInt1702 < arg1) {
			this.anInt1702 = arg1;
		}
		Static58.method1193((long) this.anInt1702);
		local130 = 0;
		while (this.anInt1705 < 256) {
			local130++;
			this.anInt1705 += this.anInt1699;
		}
		this.anInt1705 &= 0xFF;
		return local130;
	}
}
