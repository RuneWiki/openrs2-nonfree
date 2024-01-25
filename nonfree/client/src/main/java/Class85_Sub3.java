import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class85_Sub3 extends Class85 {

	@OriginalMember(owner = "client!us", name = "h", descriptor = "J")
	private long aLong258 = 0L;

	@OriginalMember(owner = "client!us", name = "g", descriptor = "J")
	private long aLong257 = 0L;

	@OriginalMember(owner = "client!us", name = "j", descriptor = "[J")
	private final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!us", name = "i", descriptor = "I")
	private int anInt9831 = 1;

	@OriginalMember(owner = "client!us", name = "k", descriptor = "I")
	private int anInt9832 = 0;

	@OriginalMember(owner = "client!us", name = "l", descriptor = "J")
	private long aLong259 = 0L;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class85_Sub3() {
		this.aLong258 = System.nanoTime();
		this.aLong257 = System.nanoTime();
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)J")
	@Override
	protected long method8291() {
		this.aLong258 += this.method8299();
		return this.aLong258 < this.aLong257 ? (this.aLong257 - this.aLong258) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(I)J")
	private long method8299() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong259;
		this.aLong259 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray16[this.anInt9832] = local7;
			this.anInt9832 = (this.anInt9832 + 1) % 10;
			if (this.anInt9831 < 1) {
				this.anInt9831++;
			}
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt9831; local48++) {
			local46 += this.aLongArray16[(this.anInt9832 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt9831;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(B)V")
	@Override
	public void method8293() {
		if (this.aLong258 < this.aLong257) {
			this.aLong258 += this.aLong257 - this.aLong258;
		}
		this.aLong259 = 0L;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(JZ)I")
	@Override
	protected int method8298(@OriginalArg(0) long arg0) {
		if (this.aLong258 < this.aLong257) {
			this.aLong259 += this.aLong257 - this.aLong258;
			this.aLong258 += this.aLong257 - this.aLong258;
			this.aLong257 += arg0;
			return 1;
		}
		@Pc(11) int local11 = 0;
		do {
			local11++;
			this.aLong257 += arg0;
		} while (local11 < 10 && this.aLong257 < this.aLong258);
		if (this.aLong257 < this.aLong258) {
			this.aLong257 = this.aLong258;
		}
		return local11;
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)J")
	@Override
	public long method8297() {
		return this.aLong258;
	}
}
