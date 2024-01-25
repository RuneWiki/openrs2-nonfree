import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "J")
	private long aLong192 = 0L;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "J")
	private long aLong193 = 0L;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	private int anInt6506 = 1;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
	private int anInt6507 = 0;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V")
	public Class26_Sub2() {
		this.aLong193 = System.nanoTime();
		this.aLong192 = System.nanoTime();
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)J")
	@Override
	public long method5212() {
		return this.aLong193;
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)J")
	private long method5134() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong194;
		this.aLong194 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt6507] = local7;
			this.anInt6507 = (this.anInt6507 + 1) % 10;
			if (this.anInt6506 < 1) {
				this.anInt6506++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt6506; local54++) {
			local52 += this.aLongArray7[(this.anInt6507 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt6506;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
	@Override
	public void method5216() {
		this.aLong194 = 0L;
		if (this.aLong193 < this.aLong192) {
			this.aLong193 += this.aLong192 - this.aLong193;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I")
	@Override
	public int method5215(@OriginalArg(0) int arg0) {
		this.aLong193 += this.method5134();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong192 > this.aLong193) {
			Static81.method1477((this.aLong192 - this.aLong193) / 1000000L);
			this.aLong194 += this.aLong192 - this.aLong193;
			this.aLong193 += this.aLong192 - this.aLong193;
			this.aLong192 += local12;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			local25++;
			this.aLong192 += local12;
		} while (local25 < 10 && this.aLong192 < this.aLong193);
		if (this.aLong193 > this.aLong192) {
			this.aLong192 = this.aLong193;
		}
		return local25;
	}
}
