import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class12_Sub3 extends Class12 {

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "J")
	private long aLong278 = 0L;

	@OriginalMember(owner = "client!ui", name = "j", descriptor = "J")
	private long aLong279 = 0L;

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "[J")
	private final long[] aLongArray19 = new long[10];

	@OriginalMember(owner = "client!ui", name = "k", descriptor = "J")
	private long aLong280 = 0L;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	private int anInt10141 = 1;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	private int anInt10142 = 0;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class12_Sub3() {
		this.aLong278 = this.aLong279 = jagmisc.nanoTime();
		if (this.aLong279 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)J")
	@Override
	public long method8273() {
		return this.aLong279;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	@Override
	public void method8266() {
		this.aLong280 = (long) 0;
		if (this.aLong278 > this.aLong279) {
			this.aLong279 += this.aLong278 - this.aLong279;
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)J")
	private long method8274() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong280;
		this.aLong280 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray19[this.anInt10142] = local6;
			this.anInt10142 = (this.anInt10142 + 1) % 10;
			if (this.anInt10141 < 1) {
				this.anInt10141++;
			}
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt10141; local53++) {
			local45 += this.aLongArray19[(this.anInt10142 + 10 - local53) % 10];
		}
		return local45 / (long) this.anInt10141;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(JB)I")
	@Override
	protected int method8265(@OriginalArg(0) long arg0) {
		if (this.aLong279 < this.aLong278) {
			this.aLong280 += this.aLong278 - this.aLong279;
			this.aLong279 += this.aLong278 - this.aLong279;
			this.aLong278 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			this.aLong278 += arg0;
			local12++;
		} while (local12 < 10 && this.aLong278 < this.aLong279);
		if (this.aLong279 > this.aLong278) {
			this.aLong278 = this.aLong279;
		}
		return local12;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)J")
	@Override
	protected long method8271() {
		this.aLong279 += this.method8274();
		return this.aLong279 < this.aLong278 ? (this.aLong278 - this.aLong279) / 1000000L : 0L;
	}
}
