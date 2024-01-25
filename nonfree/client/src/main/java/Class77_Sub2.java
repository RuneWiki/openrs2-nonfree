import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "J")
	private long aLong243 = 0L;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "J")
	private long aLong244 = 0L;

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
	private int anInt8426 = 1;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "J")
	private long aLong245 = 0L;

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	private int anInt8427 = 0;

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	public Class77_Sub2() {
		this.aLong244 = this.aLong243 = jagmisc.nanoTime();
		if (this.aLong243 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)J")
	private long method7063() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong245;
		this.aLong245 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray14[this.anInt8427] = local6;
			this.anInt8427 = (this.anInt8427 + 1) % 10;
			if (this.anInt8426 < 1) {
				this.anInt8426++;
			}
		}
		@Pc(43) long local43 = 0L;
		for (@Pc(45) int local45 = 1; local45 <= this.anInt8426; local45++) {
			local43 += this.aLongArray14[(this.anInt8427 + 10 - local45) % 10];
		}
		return local43 / (long) this.anInt8426;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)J")
	@Override
	protected long method7573() {
		this.aLong243 += this.method7063();
		return this.aLong244 > this.aLong243 ? (this.aLong244 - this.aLong243) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7578(@OriginalArg(1) long arg0) {
		if (this.aLong244 > this.aLong243) {
			this.aLong245 += this.aLong244 - this.aLong243;
			this.aLong243 += this.aLong244 - this.aLong243;
			this.aLong244 += arg0;
			return 1;
		}
		@Pc(18) int local18 = 0;
		do {
			this.aLong244 += arg0;
			local18++;
		} while (local18 < 10 && this.aLong243 > this.aLong244);
		if (this.aLong243 > this.aLong244) {
			this.aLong244 = this.aLong243;
		}
		return local18;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	@Override
	public void method7575() {
		if (this.aLong244 > this.aLong243) {
			this.aLong243 += this.aLong244 - this.aLong243;
		}
		this.aLong245 = 0L;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)J")
	@Override
	public long method7581() {
		return this.aLong243;
	}
}
