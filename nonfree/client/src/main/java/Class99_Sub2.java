import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	private int anInt6717 = 0;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[J")
	private final long[] aLongArray29 = new long[10];

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	private int anInt6718 = 1;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	public Class99_Sub2() {
		this.aLong203 = this.aLong202 = jagmisc.nanoTime();
		if (this.aLong202 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6866(@OriginalArg(0) long arg0) {
		if (this.aLong202 < this.aLong203) {
			this.aLong204 += this.aLong203 - this.aLong202;
			this.aLong202 += this.aLong203 - this.aLong202;
			this.aLong203 += arg0;
			return 1;
		}
		@Pc(13) int local13 = 0;
		do {
			local13++;
			this.aLong203 += arg0;
		} while (local13 < 10 && this.aLong202 > this.aLong203);
		if (this.aLong203 < this.aLong202) {
			this.aLong203 = this.aLong202;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)J")
	@Override
	public long method6869() {
		return this.aLong202;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J")
	@Override
	protected long method6865() {
		this.aLong202 += this.method5704();
		return this.aLong202 < this.aLong203 ? (this.aLong203 - this.aLong202) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	@Override
	public void method6863() {
		if (this.aLong202 < this.aLong203) {
			this.aLong202 += this.aLong203 - this.aLong202;
		}
		this.aLong204 = 0L;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)J")
	private long method5704() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong204;
		this.aLong204 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray29[this.anInt6717] = local7;
			if (this.anInt6718 < 1) {
				this.anInt6718++;
			}
			this.anInt6717 = (this.anInt6717 + 1) % 10;
		}
		@Pc(44) long local44 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt6718; local51++) {
			local44 += this.aLongArray29[(this.anInt6717 + 10 - local51) % 10];
		}
		return local44 / (long) this.anInt6718;
	}
}
