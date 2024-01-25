import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class98_Sub2 extends Class98 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "J")
	private long aLong251 = 0L;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[J")
	private final long[] aLongArray18 = new long[10];

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "J")
	private long aLong253 = 0L;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	private int anInt9151 = 1;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "J")
	private long aLong252 = 0L;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	private int anInt9150 = 0;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)J")
	@Override
	protected long method9619() {
		this.aLong251 += this.method8008();
		return this.aLong253 > this.aLong251 ? (this.aLong253 - this.aLong251) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method9613(@OriginalArg(1) long arg0) {
		if (this.aLong251 < this.aLong253) {
			this.aLong252 += this.aLong253 - this.aLong251;
			this.aLong251 += this.aLong253 - this.aLong251;
			this.aLong253 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong253 += arg0;
		} while (local17 < 10 && this.aLong251 > this.aLong253);
		if (this.aLong251 > this.aLong253) {
			this.aLong253 = this.aLong251;
		}
		return local17;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)V")
	@Override
	public void method9614() {
		if (this.aLong251 < this.aLong253) {
			this.aLong251 += this.aLong253 - this.aLong251;
		}
		this.aLong252 = 0L;
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)J")
	private long method8008() {
		@Pc(9) long local9 = Static99.method1701() * 1000000L;
		@Pc(14) long local14 = local9 - this.aLong252;
		this.aLong252 = local9;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray18[this.anInt9150] = local14;
			if (this.anInt9151 < 10) {
				this.anInt9151++;
			}
			this.anInt9150 = (this.anInt9150 + 1) % 10;
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt9151; local57++) {
			local55 += this.aLongArray18[(this.anInt9150 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt9151;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)J")
	@Override
	public long method9616() {
		return this.aLong251;
	}
}
