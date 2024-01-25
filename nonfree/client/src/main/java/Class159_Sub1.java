import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class159_Sub1 extends Class159 {

	@OriginalMember(owner = "client!mp", name = "i", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
	private int anInt4757 = 0;

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
	private int anInt4758 = 1;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "J")
	private long aLong146 = 0L;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class159_Sub1() {
		this.aLong144 = System.nanoTime();
		this.aLong145 = System.nanoTime();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)J")
	private long method3871() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong146;
		this.aLong146 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt4757] = local7;
			this.anInt4757 = (this.anInt4757 + 1) % 10;
			if (this.anInt4758 < 1) {
				this.anInt4758++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt4758; local51++) {
			local49 += this.aLongArray5[(this.anInt4757 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt4758;
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
	@Override
	public void method5790() {
		this.aLong146 = 0L;
		if (this.aLong145 > this.aLong144) {
			this.aLong144 += this.aLong145 - this.aLong144;
		}
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)J")
	@Override
	public long method5791() {
		return this.aLong144;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5789(@OriginalArg(0) int arg0) {
		this.aLong144 += this.method3871();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong145 > this.aLong144) {
			Static135.method2458((this.aLong145 - this.aLong144) / 1000000L);
			this.aLong146 += this.aLong145 - this.aLong144;
			this.aLong144 += this.aLong145 - this.aLong144;
			this.aLong145 += local17;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			this.aLong145 += local17;
			local68++;
		} while (local68 < 10 && this.aLong144 > this.aLong145);
		if (this.aLong145 < this.aLong144) {
			this.aLong145 = this.aLong144;
		}
		return local68;
	}
}
