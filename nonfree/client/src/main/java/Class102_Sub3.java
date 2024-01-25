import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class102_Sub3 extends Class102 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "J")
	private long aLong296 = 0L;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "J")
	private long aLong297 = 0L;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	private int anInt10051 = 0;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "J")
	private long aLong298 = 0L;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "[J")
	private final long[] aLongArray29 = new long[10];

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
	private int anInt10052 = 1;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class102_Sub3() {
		this.aLong296 = this.aLong297 = jagmisc.nanoTime();
		if (this.aLong297 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)J")
	@Override
	public long method8799() {
		return this.aLong297;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)J")
	private long method8801() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong298;
		this.aLong298 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray29[this.anInt10051] = local7;
			this.anInt10051 = (this.anInt10051 + 1) % 10;
			if (this.anInt10052 < 1) {
				this.anInt10052++;
			}
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt10052; local56++) {
			local54 += this.aLongArray29[(this.anInt10051 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt10052;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	@Override
	public void method8796() {
		this.aLong298 = 0L;
		if (this.aLong297 < this.aLong296) {
			this.aLong297 += this.aLong296 - this.aLong297;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8795(@OriginalArg(0) long arg0) {
		if (this.aLong297 < this.aLong296) {
			this.aLong298 += this.aLong296 - this.aLong297;
			this.aLong297 += this.aLong296 - this.aLong297;
			this.aLong296 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong296 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong297 > this.aLong296);
		if (this.aLong296 < this.aLong297) {
			this.aLong296 = this.aLong297;
		}
		return local42;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)J")
	@Override
	protected long method8797() {
		this.aLong297 += this.method8801();
		return this.aLong296 > this.aLong297 ? (this.aLong296 - this.aLong297) / 1000000L : 0L;
	}
}
