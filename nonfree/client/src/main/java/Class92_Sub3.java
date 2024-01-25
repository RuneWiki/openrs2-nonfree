import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class92_Sub3 extends Class92 {

	@OriginalMember(owner = "client!kf", name = "g", descriptor = "J")
	private long aLong209 = 0L;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "J")
	private long aLong207 = 0L;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "J")
	private long aLong208 = 0L;

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	private int anInt5023 = 0;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
	private int anInt5024 = 1;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(I)J")
	private long method4211() {
		@Pc(4) long local4 = Static255.method4035() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong208;
		this.aLong208 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray13[this.anInt5023] = local10;
			this.anInt5023 = (this.anInt5023 + 1) % 10;
			if (this.anInt5024 < 10) {
				this.anInt5024++;
			}
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt5024; local60++) {
			local58 += this.aLongArray13[(this.anInt5023 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt5024;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method4206(@OriginalArg(1) long arg0) {
		if (this.aLong209 < this.aLong207) {
			this.aLong208 += this.aLong207 - this.aLong209;
			this.aLong209 += this.aLong207 - this.aLong209;
			this.aLong207 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			this.aLong207 += arg0;
			local14++;
		} while (local14 < 10 && this.aLong209 > this.aLong207);
		if (this.aLong209 > this.aLong207) {
			this.aLong207 = this.aLong209;
		}
		return local14;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)J")
	@Override
	public long method4209() {
		return this.aLong209;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)J")
	@Override
	protected long method4210() {
		this.aLong209 += this.method4211();
		return this.aLong209 < this.aLong207 ? (this.aLong207 - this.aLong209) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	@Override
	public void method4208() {
		if (this.aLong209 < this.aLong207) {
			this.aLong209 += this.aLong207 - this.aLong209;
		}
		this.aLong208 = 0L;
	}
}
