import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class67_Sub3 extends Class67 {

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
	private int anInt6394 = 0;

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
	private int anInt6395 = 1;

	@OriginalMember(owner = "client!mk", name = "h", descriptor = "[J")
	private final long[] aLongArray20 = new long[10];

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class67_Sub3() {
		this.aLong198 = this.aLong199 = jagmisc.nanoTime();
		if (this.aLong199 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)J")
	@Override
	protected long method5457() {
		this.aLong199 += this.method5462();
		return this.aLong199 < this.aLong198 ? (this.aLong198 - this.aLong199) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	@Override
	public void method5454() {
		if (this.aLong199 < this.aLong198) {
			this.aLong199 += this.aLong198 - this.aLong199;
		}
		this.aLong200 = 0L;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)J")
	private long method5462() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong200;
		this.aLong200 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray20[this.anInt6394] = local7;
			if (this.anInt6395 < 1) {
				this.anInt6395++;
			}
			this.anInt6394 = (this.anInt6394 + 1) % 10;
		}
		@Pc(64) long local64 = 0L;
		for (@Pc(66) int local66 = 1; local66 <= this.anInt6395; local66++) {
			local64 += this.aLongArray20[(this.anInt6394 + 10 - local66) % 10];
		}
		return local64 / (long) this.anInt6395;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method5460(@OriginalArg(1) long arg0) {
		if (this.aLong199 < this.aLong198) {
			this.aLong200 += this.aLong198 - this.aLong199;
			this.aLong199 += this.aLong198 - this.aLong199;
			this.aLong198 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			this.aLong198 += arg0;
			local44++;
		} while (local44 < 10 && this.aLong198 < this.aLong199);
		if (this.aLong198 < this.aLong199) {
			this.aLong198 = this.aLong199;
		}
		return local44;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)J")
	@Override
	public long method5453() {
		return this.aLong199;
	}
}
