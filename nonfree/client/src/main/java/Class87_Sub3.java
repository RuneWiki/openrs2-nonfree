import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class87_Sub3 extends Class87 {

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "J")
	private long aLong258 = 0L;

	@OriginalMember(owner = "client!pfa", name = "j", descriptor = "J")
	private long aLong259 = 0L;

	@OriginalMember(owner = "client!pfa", name = "g", descriptor = "[J")
	private final long[] aLongArray20 = new long[10];

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "J")
	private long aLong260 = 0L;

	@OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
	private int anInt7860 = 0;

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
	private int anInt7859 = 1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "()V")
	private Class87_Sub3() {
		this.aLong258 = System.nanoTime();
		this.aLong259 = System.nanoTime();
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6749() {
		this.aLong258 += this.method6751();
		return this.aLong259 > this.aLong258 ? (this.aLong259 - this.aLong258) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)V")
	@Override
	public void method6747() {
		if (this.aLong259 > this.aLong258) {
			this.aLong258 += this.aLong259 - this.aLong258;
		}
		this.aLong260 = 0L;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(JB)I")
	@Override
	protected int method6744(@OriginalArg(0) long arg0) {
		if (this.aLong258 < this.aLong259) {
			this.aLong260 += this.aLong259 - this.aLong258;
			this.aLong258 += this.aLong259 - this.aLong258;
			this.aLong259 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			this.aLong259 += arg0;
			local15++;
		} while (local15 < 10 && this.aLong258 > this.aLong259);
		if (this.aLong259 < this.aLong258) {
			this.aLong259 = this.aLong258;
		}
		return local15;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)J")
	@Override
	public long method6750() {
		return this.aLong258;
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(I)J")
	private long method6751() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(15) long local15 = local1 - this.aLong260;
		this.aLong260 = local1;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray20[this.anInt7860] = local15;
			if (this.anInt7859 < 1) {
				this.anInt7859++;
			}
			this.anInt7860 = (this.anInt7860 + 1) % 10;
		}
		@Pc(62) long local62 = 0L;
		for (@Pc(64) int local64 = 1; local64 <= this.anInt7859; local64++) {
			local62 += this.aLongArray20[(this.anInt7860 + 10 - local64) % 10];
		}
		return local62 / (long) this.anInt7859;
	}
}
