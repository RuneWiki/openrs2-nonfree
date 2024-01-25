import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class41_Sub3 extends Class41 {

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "J")
	private long aLong237 = 0L;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "J")
	private long aLong238 = 0L;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
	private int anInt7961 = 1;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "J")
	private long aLong239 = 0L;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	private int anInt7962 = 0;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "[J")
	private final long[] aLongArray18 = new long[10];

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class41_Sub3() {
		this.aLong237 = this.aLong238 = jagmisc.nanoTime();
		if (this.aLong238 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6923() {
		this.aLong238 += this.method6924();
		return this.aLong237 > this.aLong238 ? (this.aLong237 - this.aLong238) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)J")
	@Override
	public long method6918() {
		return this.aLong238;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6922(@OriginalArg(0) long arg0) {
		if (this.aLong238 < this.aLong237) {
			this.aLong239 += this.aLong237 - this.aLong238;
			this.aLong238 += this.aLong237 - this.aLong238;
			this.aLong237 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			this.aLong237 += arg0;
			local43++;
		} while (local43 < 10 && this.aLong237 < this.aLong238);
		if (this.aLong237 < this.aLong238) {
			this.aLong237 = this.aLong238;
		}
		return local43;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)J")
	private long method6924() {
		@Pc(9) long local9 = jagmisc.nanoTime();
		@Pc(15) long local15 = local9 - this.aLong239;
		this.aLong239 = local9;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray18[this.anInt7962] = local15;
			if (this.anInt7961 < 1) {
				this.anInt7961++;
			}
			this.anInt7962 = (this.anInt7962 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt7961; local56++) {
			local54 += this.aLongArray18[(this.anInt7962 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt7961;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V")
	@Override
	public void method6920() {
		if (this.aLong238 < this.aLong237) {
			this.aLong238 += this.aLong237 - this.aLong238;
		}
		this.aLong239 = 0L;
	}
}
