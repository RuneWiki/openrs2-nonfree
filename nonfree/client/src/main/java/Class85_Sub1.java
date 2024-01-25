import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	private int anInt2588 = 0;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
	private int anInt2589 = 1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(JZ)I")
	@Override
	protected int method8298(@OriginalArg(0) long arg0) {
		if (this.aLong74 < this.aLong76) {
			this.aLong75 += this.aLong76 - this.aLong74;
			this.aLong74 += this.aLong76 - this.aLong74;
			this.aLong76 += arg0;
			return 1;
		}
		@Pc(13) int local13 = 0;
		do {
			local13++;
			this.aLong76 += arg0;
		} while (local13 < 10 && this.aLong74 > this.aLong76);
		if (this.aLong74 > this.aLong76) {
			this.aLong76 = this.aLong74;
		}
		return local13;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)J")
	@Override
	public long method8297() {
		return this.aLong74;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)J")
	@Override
	protected long method8291() {
		this.aLong74 += this.method2222();
		return this.aLong74 < this.aLong76 ? (this.aLong76 - this.aLong74) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "(I)J")
	private long method2222() {
		@Pc(6) long local6 = Static32.method595() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong75;
		this.aLong75 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray2[this.anInt2588] = local12;
			this.anInt2588 = (this.anInt2588 + 1) % 10;
			if (this.anInt2589 < 10) {
				this.anInt2589++;
			}
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt2589; local60++) {
			local58 += this.aLongArray2[(this.anInt2588 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt2589;
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
	@Override
	public void method8293() {
		this.aLong75 = 0L;
		if (this.aLong74 < this.aLong76) {
			this.aLong74 += this.aLong76 - this.aLong74;
		}
	}
}
