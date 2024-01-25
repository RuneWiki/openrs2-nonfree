import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class199_Sub3 extends Class199 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "J")
	private long aLong330 = 0L;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "J")
	private long aLong331 = 0L;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	private int anInt9624 = 1;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "[J")
	private final long[] aLongArray24 = new long[10];

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	private int anInt9625 = 0;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "J")
	private long aLong332 = 0L;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	private Class199_Sub3() {
		this.aLong331 = System.nanoTime();
		this.aLong330 = System.nanoTime();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	@Override
	public void method8108() {
		if (this.aLong331 < this.aLong330) {
			this.aLong331 += this.aLong330 - this.aLong331;
		}
		this.aLong332 = 0L;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method8112(@OriginalArg(1) long arg0) {
		if (this.aLong331 < this.aLong330) {
			this.aLong332 += this.aLong330 - this.aLong331;
			this.aLong331 += this.aLong330 - this.aLong331;
			this.aLong330 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			local16++;
			this.aLong330 += arg0;
		} while (local16 < 10 && this.aLong330 < this.aLong331);
		if (this.aLong330 < this.aLong331) {
			this.aLong330 = this.aLong331;
		}
		return local16;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)J")
	@Override
	public long method8105() {
		return this.aLong331;
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)J")
	@Override
	protected long method8110() {
		this.aLong331 += this.method8115();
		return this.aLong331 < this.aLong330 ? (this.aLong330 - this.aLong331) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)J")
	private long method8115() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong332;
		this.aLong332 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray24[this.anInt9625] = local7;
			this.anInt9625 = (this.anInt9625 + 1) % 10;
			if (this.anInt9624 < 1) {
				this.anInt9624++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt9624; local59++) {
			local57 += this.aLongArray24[(this.anInt9625 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt9624;
	}
}
