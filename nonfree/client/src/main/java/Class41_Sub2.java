import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class41_Sub2 extends Class41 {

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
	private int anInt4491 = 0;

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "J")
	private long aLong131 = 0L;

	@OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
	private int anInt4492 = 1;

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!jga", name = "j", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6922(@OriginalArg(0) long arg0) {
		if (this.aLong131 < this.aLong132) {
			this.aLong130 += this.aLong132 - this.aLong131;
			this.aLong131 += this.aLong132 - this.aLong131;
			this.aLong132 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong132 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong131 > this.aLong132);
		if (this.aLong131 > this.aLong132) {
			this.aLong132 = this.aLong131;
		}
		return local42;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6923() {
		this.aLong131 += this.method4062();
		return this.aLong131 < this.aLong132 ? (this.aLong132 - this.aLong131) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)J")
	@Override
	public long method6918() {
		return this.aLong131;
	}

	@OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)J")
	private long method4062() {
		@Pc(4) long local4 = Static429.method5935() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong130;
		this.aLong130 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray6[this.anInt4491] = local9;
			this.anInt4491 = (this.anInt4491 + 1) % 10;
			if (this.anInt4492 < 10) {
				this.anInt4492++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt4492; local58++) {
			local48 += this.aLongArray6[(this.anInt4491 + 10 - local58) % 10];
		}
		return local48 / (long) this.anInt4492;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)V")
	@Override
	public void method6920() {
		this.aLong130 = 0L;
		if (this.aLong132 > this.aLong131) {
			this.aLong131 += this.aLong132 - this.aLong131;
		}
	}
}
