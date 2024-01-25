import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class139_Sub1 extends Class139 {

	@OriginalMember(owner = "client!li", name = "h", descriptor = "J")
	private long aLong119 = 0L;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "J")
	private long aLong118 = 0L;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "J")
	private long aLong120 = 0L;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	private int anInt4081 = 1;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	private int anInt4082 = 0;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class139_Sub1() {
		this.aLong118 = this.aLong119 = jagmisc.nanoTime();
		if (this.aLong119 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)I")
	@Override
	public int method4296(@OriginalArg(1) int arg0) {
		this.aLong119 += this.method3576();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong119 < this.aLong118) {
			Static215.method3855((this.aLong118 - this.aLong119) / 1000000L);
			this.aLong120 += this.aLong118 - this.aLong119;
			this.aLong119 += this.aLong118 - this.aLong119;
			this.aLong118 += local18;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong118 += local18;
			local66++;
		} while (local66 < 10 && this.aLong119 > this.aLong118);
		if (this.aLong119 > this.aLong118) {
			this.aLong118 = this.aLong119;
		}
		return local66;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)V")
	@Override
	public void method4293() {
		if (this.aLong118 > this.aLong119) {
			this.aLong119 += this.aLong118 - this.aLong119;
		}
		this.aLong120 = 0;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)J")
	@Override
	public long method4289() {
		return this.aLong119;
	}

	@OriginalMember(owner = "client!li", name = "f", descriptor = "(I)J")
	private long method3576() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong120;
		this.aLong120 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt4082] = local7;
			this.anInt4082 = (this.anInt4082 + 1) % 10;
			if (this.anInt4081 < 1) {
				this.anInt4081++;
			}
		}
		@Pc(49) long local49 = (long) 0;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt4081; local51++) {
			local49 += this.aLongArray4[(this.anInt4082 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt4081;
	}
}
