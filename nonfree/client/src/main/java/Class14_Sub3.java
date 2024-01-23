import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "J")
	private long aLong163 = 0L;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "J")
	private long aLong164 = 0L;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	private int anInt4441 = 0;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	private int anInt4442 = 1;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "[J")
	private long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class14_Sub3() {
		this.aLong163 = this.aLong162 = jagmisc.nanoTime();
		if (this.aLong162 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIB)I")
	@Override
	public int method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static312.method4734((long) arg1);
		this.aLong162 += this.method3264();
		@Pc(23) long local23 = (long) arg0 * 1000000L;
		if (this.aLong163 > this.aLong162) {
			Static312.method4734((this.aLong163 - this.aLong162) / 1000000L);
			this.aLong164 += this.aLong163 - this.aLong162;
			this.aLong162 += this.aLong163 - this.aLong162;
			this.aLong163 += local23;
			return 1;
		}
		@Pc(73) int local73 = 0;
		do {
			this.aLong163 += local23;
			local73++;
		} while (local73 < 10 && this.aLong163 < this.aLong162);
		if (this.aLong163 < this.aLong162) {
			this.aLong163 = this.aLong162;
		}
		return local73;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
	@Override
	public void method3261() {
		if (this.aLong162 < this.aLong163) {
			this.aLong162 += this.aLong163 - this.aLong162;
		}
		this.aLong164 = 0L;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)J")
	private long method3264() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong164;
		this.aLong164 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray7[this.anInt4441] = local6;
			if (this.anInt4442 < 1) {
				this.anInt4442++;
			}
			this.anInt4441 = (this.anInt4441 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt4442; local48++) {
			local46 += this.aLongArray7[(this.anInt4441 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt4442;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)J")
	@Override
	public long method3263() {
		return this.aLong162;
	}
}
