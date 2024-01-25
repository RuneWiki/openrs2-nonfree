import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class26_Sub3 extends Class26 {

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "J")
	private long aLong197 = 0L;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
	private int anInt6584 = 0;

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
	private int anInt6585 = 1;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	public Class26_Sub3() {
		this.aLong198 = this.aLong197 = jagmisc.nanoTime();
		if (this.aLong197 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)J")
	private long method5217() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong199;
		this.aLong199 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray8[this.anInt6584] = local12;
			if (this.anInt6585 < 1) {
				this.anInt6585++;
			}
			this.anInt6584 = (this.anInt6584 + 1) % 10;
		}
		@Pc(53) long local53 = 0L;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt6585; local55++) {
			local53 += this.aLongArray8[(this.anInt6584 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt6585;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
	@Override
	public int method5215(@OriginalArg(0) int arg0) {
		this.aLong197 += this.method5217();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong198 > this.aLong197) {
			Static81.method1477((this.aLong198 - this.aLong197) / 1000000L);
			this.aLong199 += this.aLong198 - this.aLong197;
			this.aLong197 += this.aLong198 - this.aLong197;
			this.aLong198 += local19;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			this.aLong198 += local19;
			local31++;
		} while (local31 < 10 && this.aLong198 < this.aLong197);
		if (this.aLong197 > this.aLong198) {
			this.aLong198 = this.aLong197;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)J")
	@Override
	public long method5212() {
		return this.aLong197;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	@Override
	public void method5216() {
		this.aLong199 = 0L;
		if (this.aLong198 > this.aLong197) {
			this.aLong197 += this.aLong198 - this.aLong197;
		}
	}
}
