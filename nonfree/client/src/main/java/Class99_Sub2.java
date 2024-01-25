import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "J")
	private long aLong358 = 0L;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "J")
	private long aLong359 = 0L;

	@OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
	private int anInt6991 = 1;

	@OriginalMember(owner = "client!ts", name = "m", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "J")
	private long aLong360 = 0L;

	@OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
	private int anInt6992 = 0;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
	public Class99_Sub2() {
		this.aLong359 = this.aLong358 = jagmisc.nanoTime();
		if (this.aLong358 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)J")
	private long method5605() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong360;
		this.aLong360 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt6992] = local7;
			this.anInt6992 = (this.anInt6992 + 1) % 10;
			if (this.anInt6991 < 1) {
				this.anInt6991++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt6991; local52++) {
			local50 += this.aLongArray6[(this.anInt6992 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt6991;
	}

	@OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
	@Override
	public void method5655() {
		this.aLong360 = 0L;
		if (this.aLong359 > this.aLong358) {
			this.aLong358 += this.aLong359 - this.aLong358;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)J")
	@Override
	public long method5657() {
		return this.aLong358;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
	@Override
	public int method5656(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong358 += this.method5605();
		if (this.aLong359 > this.aLong358) {
			Static167.method6157((this.aLong359 - this.aLong358) / 1000000L);
			this.aLong360 += this.aLong359 - this.aLong358;
			this.aLong358 += this.aLong359 - this.aLong358;
			this.aLong359 += local4;
			return 1;
		}
		@Pc(64) int local64 = 0;
		do {
			this.aLong359 += local4;
			local64++;
		} while (local64 < 10 && this.aLong359 < this.aLong358);
		if (this.aLong358 > this.aLong359) {
			this.aLong359 = this.aLong358;
		}
		return local64;
	}
}
