import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "J")
	private long aLong192 = 0L;

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "J")
	private long aLong193 = 0L;

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
	private int anInt7343 = 0;

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "[J")
	private final long[] aLongArray22 = new long[10];

	@OriginalMember(owner = "client!oda", name = "k", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "I")
	private int anInt7344 = 1;

	@OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V")
	public Class23_Sub3() {
		this.aLong192 = System.nanoTime();
		this.aLong193 = System.nanoTime();
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)V")
	@Override
	public void method6160() {
		this.aLong194 = 0L;
		if (this.aLong192 < this.aLong193) {
			this.aLong192 += this.aLong193 - this.aLong192;
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)J")
	@Override
	protected long method6165() {
		this.aLong192 += this.method6166();
		return this.aLong192 < this.aLong193 ? (this.aLong193 - this.aLong192) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)J")
	@Override
	public long method6159() {
		return this.aLong192;
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method6158(@OriginalArg(1) long arg0) {
		if (this.aLong192 < this.aLong193) {
			this.aLong194 += this.aLong193 - this.aLong192;
			this.aLong192 += this.aLong193 - this.aLong192;
			this.aLong193 += arg0;
			return 1;
		}
		@Pc(19) int local19 = 0;
		do {
			this.aLong193 += arg0;
			local19++;
		} while (local19 < 10 && this.aLong193 < this.aLong192);
		if (this.aLong193 < this.aLong192) {
			this.aLong193 = this.aLong192;
		}
		return local19;
	}

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)J")
	private long method6166() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong194;
		this.aLong194 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray22[this.anInt7343] = local6;
			this.anInt7343 = (this.anInt7343 + 1) % 10;
			if (this.anInt7344 < 1) {
				this.anInt7344++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt7344; local52++) {
			local50 += this.aLongArray22[(this.anInt7343 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt7344;
	}
}
