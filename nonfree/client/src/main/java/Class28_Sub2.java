import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "J")
	private long aLong240 = 0L;

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!sm", name = "h", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
	private int anInt8877 = 1;

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	private int anInt8876 = 0;

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "J")
	private long aLong241 = 0L;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	public Class28_Sub2() {
		this.aLong239 = this.aLong240 = jagmisc.nanoTime();
		if (this.aLong240 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)J")
	@Override
	public long method8214() {
		return this.aLong240;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)J")
	@Override
	protected long method8215() {
		this.aLong240 += this.method7615();
		return this.aLong239 > this.aLong240 ? (this.aLong239 - this.aLong240) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8217(@OriginalArg(1) long arg0) {
		if (this.aLong240 < this.aLong239) {
			this.aLong241 += this.aLong239 - this.aLong240;
			this.aLong240 += this.aLong239 - this.aLong240;
			this.aLong239 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong239 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong239 < this.aLong240);
		if (this.aLong240 > this.aLong239) {
			this.aLong239 = this.aLong240;
		}
		return local42;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)J")
	private long method7615() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong241;
		this.aLong241 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray17[this.anInt8876] = local6;
			if (this.anInt8877 < 1) {
				this.anInt8877++;
			}
			this.anInt8876 = (this.anInt8876 + 1) % 10;
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt8877; local49++) {
			local47 += this.aLongArray17[(this.anInt8876 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt8877;
	}

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V")
	@Override
	public void method8220() {
		this.aLong241 = 0L;
		if (this.aLong239 > this.aLong240) {
			this.aLong240 += this.aLong239 - this.aLong240;
		}
	}
}
