import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class13_Sub3 extends Class13 {

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "J")
	private long aLong238 = 0L;

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "[J")
	private final long[] aLongArray19 = new long[10];

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
	private int anInt7864 = 1;

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "J")
	private long aLong240 = 0L;

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
	private int anInt7865 = 0;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "()V")
	public Class13_Sub3() {
		this.aLong238 = this.aLong239 = jagmisc.nanoTime();
		if (this.aLong239 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)J")
	@Override
	public long method6678() {
		return this.aLong239;
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(B)J")
	private long method6680() {
		@Pc(6) long local6 = jagmisc.nanoTime();
		@Pc(11) long local11 = local6 - this.aLong240;
		this.aLong240 = local6;
		if (local11 > -5000000000L && local11 < 5000000000L) {
			this.aLongArray19[this.anInt7865] = local11;
			this.anInt7865 = (this.anInt7865 + 1) % 10;
			if (this.anInt7864 < 1) {
				this.anInt7864++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt7864; local52++) {
			local50 += this.aLongArray19[(this.anInt7865 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt7864;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V")
	@Override
	public void method6672() {
		this.aLong240 = 0L;
		if (this.aLong239 < this.aLong238) {
			this.aLong239 += this.aLong238 - this.aLong239;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6673(@OriginalArg(0) long arg0) {
		if (this.aLong239 < this.aLong238) {
			this.aLong240 += this.aLong238 - this.aLong239;
			this.aLong239 += this.aLong238 - this.aLong239;
			this.aLong238 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			local12++;
			this.aLong238 += arg0;
		} while (local12 < 10 && this.aLong238 < this.aLong239);
		if (this.aLong239 > this.aLong238) {
			this.aLong238 = this.aLong239;
		}
		return local12;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)J")
	@Override
	protected long method6677() {
		this.aLong239 += this.method6680();
		return this.aLong238 > this.aLong239 ? (this.aLong238 - this.aLong239) / 1000000L : 0L;
	}
}
