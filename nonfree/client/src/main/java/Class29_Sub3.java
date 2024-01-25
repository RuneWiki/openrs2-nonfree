import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uca")
public final class Class29_Sub3 extends Class29 {

	@OriginalMember(owner = "client!uca", name = "i", descriptor = "J")
	private long aLong306 = 0L;

	@OriginalMember(owner = "client!uca", name = "l", descriptor = "J")
	private long aLong307 = 0L;

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "I")
	private int anInt9581 = 0;

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "I")
	private int anInt9582 = 1;

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "J")
	private long aLong308 = 0L;

	@OriginalMember(owner = "client!uca", name = "m", descriptor = "[J")
	private final long[] aLongArray19 = new long[10];

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
	public Class29_Sub3() {
		this.aLong307 = this.aLong306 = jagmisc.nanoTime();
		if (this.aLong306 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)J")
	@Override
	protected long method8353() {
		this.aLong306 += this.method8358();
		return this.aLong307 > this.aLong306 ? (this.aLong307 - this.aLong306) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)J")
	private long method8358() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong308;
		this.aLong308 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray19[this.anInt9581] = local6;
			if (this.anInt9582 < 1) {
				this.anInt9582++;
			}
			this.anInt9581 = (this.anInt9581 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(62) int local62 = 1; local62 <= this.anInt9582; local62++) {
			local51 += this.aLongArray19[(this.anInt9581 + 10 - local62) % 10];
		}
		return local51 / (long) this.anInt9582;
	}

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "(Z)J")
	@Override
	public long method8356() {
		return this.aLong306;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8354(@OriginalArg(1) long arg0) {
		if (this.aLong306 < this.aLong307) {
			this.aLong308 += this.aLong307 - this.aLong306;
			this.aLong306 += this.aLong307 - this.aLong306;
			this.aLong307 += arg0;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			this.aLong307 += arg0;
			local49++;
		} while (local49 < 10 && this.aLong307 < this.aLong306);
		if (this.aLong307 < this.aLong306) {
			this.aLong307 = this.aLong306;
		}
		return local49;
	}

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "(I)V")
	@Override
	public void method8349() {
		if (this.aLong307 > this.aLong306) {
			this.aLong306 += this.aLong307 - this.aLong306;
		}
		this.aLong308 = 0L;
	}
}
