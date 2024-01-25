import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class99_Sub3 extends Class99 {

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "J")
	private long aLong365 = 0L;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
	private int anInt7050 = 0;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "J")
	private long aLong366 = 0L;

	@OriginalMember(owner = "client!uh", name = "n", descriptor = "J")
	private long aLong367 = 0L;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
	private int anInt7051 = 1;

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	@Override
	public void method5655() {
		this.aLong365 = 0L;
		if (this.aLong366 < this.aLong367) {
			this.aLong366 += this.aLong367 - this.aLong366;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)J")
	@Override
	public long method5657() {
		return this.aLong366;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)J")
	private long method5658() {
		@Pc(4) long local4 = Static432.method5870() * 1000000L;
		@Pc(16) long local16 = local4 - this.aLong365;
		this.aLong365 = local4;
		if (local16 > -5000000000L && local16 < 5000000000L) {
			this.aLongArray7[this.anInt7050] = local16;
			if (this.anInt7051 < 10) {
				this.anInt7051++;
			}
			this.anInt7050 = (this.anInt7050 + 1) % 10;
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt7051; local55++) {
			local53 += this.aLongArray7[(this.anInt7050 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt7051;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)I")
	@Override
	public int method5656(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong366 += this.method5658();
		if (this.aLong366 < this.aLong367) {
			Static167.method6157((this.aLong367 - this.aLong366) / 1000000L);
			this.aLong365 += this.aLong367 - this.aLong366;
			this.aLong366 += this.aLong367 - this.aLong366;
			this.aLong367 += local4;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			local31++;
			this.aLong367 += local4;
		} while (local31 < 10 && this.aLong366 > this.aLong367);
		if (this.aLong367 < this.aLong366) {
			this.aLong367 = this.aLong366;
		}
		return local31;
	}
}
