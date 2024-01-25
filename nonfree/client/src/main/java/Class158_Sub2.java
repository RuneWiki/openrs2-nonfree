import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class158_Sub2 extends Class158 {

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
	private int anInt6757 = 1;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
	private int anInt6758 = 0;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class158_Sub2() {
		this.aLong199 = this.aLong200 = jagmisc.nanoTime();
		if (this.aLong200 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)J")
	@Override
	public long method5755() {
		return this.aLong200;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)I")
	@Override
	public int method5756(@OriginalArg(0) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong200 += this.method5299();
		if (this.aLong199 > this.aLong200) {
			Static366.method5214((this.aLong199 - this.aLong200) / 1000000L);
			this.aLong201 += this.aLong199 - this.aLong200;
			this.aLong200 += this.aLong199 - this.aLong200;
			this.aLong199 += local11;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong199 += local11;
			local66++;
		} while (local66 < 10 && this.aLong200 > this.aLong199);
		if (this.aLong199 < this.aLong200) {
			this.aLong199 = this.aLong200;
		}
		return local66;
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)J")
	private long method5299() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong201;
		this.aLong201 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt6758] = local7;
			this.anInt6758 = (this.anInt6758 + 1) % 10;
			if (this.anInt6757 < 1) {
				this.anInt6757++;
			}
		}
		@Pc(49) long local49 = (long) 0;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt6757; local51++) {
			local49 += this.aLongArray7[(this.anInt6758 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt6757;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	@Override
	public void method5751() {
		this.aLong201 = 0L;
		if (this.aLong199 > this.aLong200) {
			this.aLong200 += this.aLong199 - this.aLong200;
		}
	}
}
