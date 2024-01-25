import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class62_Sub3 extends Class62 {

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "J")
	private long aLong135 = 0L;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "J")
	private long aLong134 = 0L;

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "J")
	private long aLong136 = 0L;

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
	private int anInt4339 = 1;

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
	private int anInt4340 = 0;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class62_Sub3() {
		this.aLong134 = this.aLong135 = jagmisc.nanoTime();
		if (this.aLong135 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)J")
	@Override
	public long method3917() {
		return this.aLong135;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)I")
	@Override
	public int method3914(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong135 += this.method3921();
		if (this.aLong134 > this.aLong135) {
			Static190.method3690((this.aLong134 - this.aLong135) / 1000000L);
			this.aLong136 += this.aLong134 - this.aLong135;
			this.aLong135 += this.aLong134 - this.aLong135;
			this.aLong134 += local4;
			return 1;
		}
		@Pc(65) int local65 = 0;
		do {
			this.aLong134 += local4;
			local65++;
		} while (local65 < 10 && this.aLong134 < this.aLong135);
		if (this.aLong134 < this.aLong135) {
			this.aLong134 = this.aLong135;
		}
		return local65;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)J")
	private long method3921() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong136;
		this.aLong136 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt4340] = local7;
			this.anInt4340 = (this.anInt4340 + 1) % 10;
			if (this.anInt4339 < 1) {
				this.anInt4339++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt4339; local52++) {
			local50 += this.aLongArray7[(this.anInt4340 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt4339;
	}

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(B)V")
	@Override
	public void method3920() {
		if (this.aLong134 > this.aLong135) {
			this.aLong135 += this.aLong134 - this.aLong135;
		}
		this.aLong136 = 0L;
	}
}
