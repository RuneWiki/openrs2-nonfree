import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
	private int anInt4707 = 0;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	private int anInt4706 = 1;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "J")
	private long aLong146 = 0L;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	@Override
	public void method4871() {
		this.aLong144 = 0L;
		if (this.aLong145 > this.aLong146) {
			this.aLong146 += this.aLong145 - this.aLong146;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)J")
	@Override
	public long method4867() {
		return this.aLong146;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
	@Override
	public int method4870(@OriginalArg(1) int arg0) {
		this.aLong146 += this.method4049();
		@Pc(20) long local20 = (long) arg0 * 1000000L;
		if (this.aLong145 > this.aLong146) {
			Static248.method4401((this.aLong145 - this.aLong146) / 1000000L);
			this.aLong144 += this.aLong145 - this.aLong146;
			this.aLong146 += this.aLong145 - this.aLong146;
			this.aLong145 += local20;
			return 1;
		}
		@Pc(28) int local28 = 0;
		do {
			local28++;
			this.aLong145 += local20;
		} while (local28 < 10 && this.aLong146 > this.aLong145);
		if (this.aLong145 < this.aLong146) {
			this.aLong145 = this.aLong146;
		}
		return local28;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)J")
	private long method4049() {
		@Pc(4) long local4 = Static22.method285() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong144;
		this.aLong144 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray6[this.anInt4707] = local10;
			this.anInt4707 = (this.anInt4707 + 1) % 10;
			if (this.anInt4706 < 10) {
				this.anInt4706++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt4706; local53++) {
			local51 += this.aLongArray6[(this.anInt4707 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt4706;
	}
}
