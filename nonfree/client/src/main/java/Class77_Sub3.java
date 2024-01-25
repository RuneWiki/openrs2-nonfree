import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class77_Sub3 extends Class77 {

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	private int anInt9156 = 1;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "J")
	private long aLong256 = 0L;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "[J")
	private final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "J")
	private long aLong257 = 0L;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "J")
	private long aLong258 = 0L;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
	private int anInt9155 = 0;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)J")
	@Override
	protected long method7573() {
		this.aLong258 += this.method7583();
		return this.aLong256 > this.aLong258 ? (this.aLong256 - this.aLong258) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7578(@OriginalArg(1) long arg0) {
		if (this.aLong258 < this.aLong256) {
			this.aLong257 += this.aLong256 - this.aLong258;
			this.aLong258 += this.aLong256 - this.aLong258;
			this.aLong256 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong256 += arg0;
		} while (local42 < 10 && this.aLong256 < this.aLong258);
		if (this.aLong256 < this.aLong258) {
			this.aLong256 = this.aLong258;
		}
		return local42;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
	@Override
	public void method7575() {
		if (this.aLong256 > this.aLong258) {
			this.aLong258 += this.aLong256 - this.aLong258;
		}
		this.aLong257 = 0L;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)J")
	private long method7583() {
		@Pc(4) long local4 = Static587.method7753() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong257;
		this.aLong257 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray16[this.anInt9155] = local10;
			this.anInt9155 = (this.anInt9155 + 1) % 10;
			if (this.anInt9156 < 10) {
				this.anInt9156++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt9156; local53++) {
			local51 += this.aLongArray16[(this.anInt9155 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt9156;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)J")
	@Override
	public long method7581() {
		return this.aLong258;
	}
}
