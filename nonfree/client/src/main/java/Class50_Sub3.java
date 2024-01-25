import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class50_Sub3 extends Class50 {

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "J")
	private long aLong189 = 0L;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "J")
	private long aLong190 = 0L;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "J")
	private long aLong191 = 0L;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	private int anInt7695 = 0;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	private int anInt7694 = 1;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "[J")
	private final long[] aLongArray15 = new long[10];

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class50_Sub3() {
		this.aLong189 = System.nanoTime();
		this.aLong190 = System.nanoTime();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)J")
	@Override
	protected long method6599() {
		this.aLong189 += this.method6604();
		return this.aLong190 > this.aLong189 ? (this.aLong190 - this.aLong189) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)V")
	@Override
	public void method6597() {
		this.aLong191 = 0L;
		if (this.aLong189 < this.aLong190) {
			this.aLong189 += this.aLong190 - this.aLong189;
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)J")
	private long method6604() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong191;
		this.aLong191 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray15[this.anInt7695] = local7;
			if (this.anInt7694 < 1) {
				this.anInt7694++;
			}
			this.anInt7695 = (this.anInt7695 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt7694; local58++) {
			local56 += this.aLongArray15[(this.anInt7695 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt7694;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method6600(@OriginalArg(1) long arg0) {
		if (this.aLong190 > this.aLong189) {
			this.aLong191 += this.aLong190 - this.aLong189;
			this.aLong189 += this.aLong190 - this.aLong189;
			this.aLong190 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			local12++;
			this.aLong190 += arg0;
		} while (local12 < 10 && this.aLong189 > this.aLong190);
		if (this.aLong190 < this.aLong189) {
			this.aLong190 = this.aLong189;
		}
		return local12;
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)J")
	@Override
	public long method6603() {
		return this.aLong189;
	}
}
