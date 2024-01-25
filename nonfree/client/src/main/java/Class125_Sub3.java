import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class125_Sub3 extends Class125 {

	@OriginalMember(owner = "client!wv", name = "h", descriptor = "J")
	private long aLong264 = 0L;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "J")
	private long aLong265 = 0L;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "J")
	private long aLong266 = 0L;

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
	private int anInt10336 = 1;

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "[J")
	private final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
	private int anInt10335 = 0;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "()V")
	public Class125_Sub3() {
		this.aLong265 = this.aLong264 = jagmisc.nanoTime();
		if (this.aLong264 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
	@Override
	public void method8178() {
		if (this.aLong264 < this.aLong265) {
			this.aLong264 += this.aLong265 - this.aLong264;
		}
		this.aLong266 = 0L;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)J")
	private long method8183() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong266;
		this.aLong266 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray16[this.anInt10335] = local6;
			this.anInt10335 = (this.anInt10335 + 1) % 10;
			if (this.anInt10336 < 1) {
				this.anInt10336++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt10336; local54++) {
			local52 += this.aLongArray16[(this.anInt10335 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt10336;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8181(@OriginalArg(0) long arg0) {
		if (this.aLong265 > this.aLong264) {
			this.aLong266 += this.aLong265 - this.aLong264;
			this.aLong264 += this.aLong265 - this.aLong264;
			this.aLong265 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong265 += arg0;
		} while (local42 < 10 && this.aLong264 > this.aLong265);
		if (this.aLong265 < this.aLong264) {
			this.aLong265 = this.aLong264;
		}
		return local42;
	}

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)J")
	@Override
	public long method8182() {
		return this.aLong264;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)J")
	@Override
	protected long method8176() {
		this.aLong264 += this.method8183();
		return this.aLong265 > this.aLong264 ? (this.aLong265 - this.aLong264) / 1000000L : 0L;
	}
}
