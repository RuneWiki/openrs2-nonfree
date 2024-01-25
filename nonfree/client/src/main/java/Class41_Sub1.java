import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "J")
	private long aLong40 = 0L;

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "J")
	private long aLong41 = 0L;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
	private int anInt1337 = 1;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	private int anInt1338 = 0;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "J")
	private long aLong42 = 0L;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class41_Sub1() {
		this.aLong41 = System.nanoTime();
		this.aLong40 = System.nanoTime();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)J")
	@Override
	public long method6918() {
		return this.aLong41;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6923() {
		this.aLong41 += this.method1371();
		return this.aLong40 <= this.aLong41 ? 0L : (this.aLong40 - this.aLong41) / 1000000L;
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)J")
	private long method1371() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong42;
		this.aLong42 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray2[this.anInt1338] = local6;
			this.anInt1338 = (this.anInt1338 + 1) % 10;
			if (this.anInt1337 < 1) {
				this.anInt1337++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt1337; local54++) {
			local52 += this.aLongArray2[(this.anInt1338 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt1337;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
	@Override
	public void method6920() {
		this.aLong42 = 0L;
		if (this.aLong41 < this.aLong40) {
			this.aLong41 += this.aLong40 - this.aLong41;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6922(@OriginalArg(0) long arg0) {
		if (this.aLong40 > this.aLong41) {
			this.aLong42 += this.aLong40 - this.aLong41;
			this.aLong41 += this.aLong40 - this.aLong41;
			this.aLong40 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong40 += arg0;
		} while (local17 < 10 && this.aLong41 > this.aLong40);
		if (this.aLong40 < this.aLong41) {
			this.aLong40 = this.aLong41;
		}
		return local17;
	}
}
