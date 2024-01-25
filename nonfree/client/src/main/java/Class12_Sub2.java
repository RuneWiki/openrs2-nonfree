import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "J")
	private long aLong241 = 0L;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "J")
	private long aLong242 = 0L;

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	private int anInt8345 = 1;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
	private int anInt8346 = 0;

	@OriginalMember(owner = "client!rt", name = "n", descriptor = "J")
	private long aLong243 = 0L;

	@OriginalMember(owner = "client!rt", name = "l", descriptor = "[J")
	private final long[] aLongArray16 = new long[10];

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "()V")
	public Class12_Sub2() {
		this.aLong241 = System.nanoTime();
		this.aLong242 = System.nanoTime();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(JB)I")
	@Override
	protected int method8265(@OriginalArg(0) long arg0) {
		if (this.aLong242 > this.aLong241) {
			this.aLong243 += this.aLong242 - this.aLong241;
			this.aLong241 += this.aLong242 - this.aLong241;
			this.aLong242 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			this.aLong242 += arg0;
			local46++;
		} while (local46 < 10 && this.aLong241 > this.aLong242);
		if (this.aLong241 > this.aLong242) {
			this.aLong242 = this.aLong241;
		}
		return local46;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)J")
	@Override
	public long method8273() {
		return this.aLong241;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	@Override
	public void method8266() {
		if (this.aLong242 > this.aLong241) {
			this.aLong241 += this.aLong242 - this.aLong241;
		}
		this.aLong243 = (long) 0;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)J")
	private long method6868() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong243;
		this.aLong243 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray16[this.anInt8346] = local6;
			if (this.anInt8345 < 1) {
				this.anInt8345++;
			}
			this.anInt8346 = (this.anInt8346 + 1) % 10;
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt8345; local53++) {
			local45 += this.aLongArray16[(this.anInt8346 + 10 - local53) % 10];
		}
		return local45 / (long) this.anInt8345;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)J")
	@Override
	protected long method8271() {
		this.aLong241 += this.method6868();
		return this.aLong242 <= this.aLong241 ? 0L : (this.aLong242 - this.aLong241) / 1000000L;
	}
}
