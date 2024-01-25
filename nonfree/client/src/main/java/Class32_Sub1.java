import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mea")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "J")
	private long aLong143 = 0L;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
	private int anInt6074 = 0;

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
	private int anInt6075 = 1;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "()V")
	public Class32_Sub1() {
		this.aLong143 = this.aLong144 = jagmisc.nanoTime();
		if (this.aLong144 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(JI)I")
	@Override
	protected int method7216(@OriginalArg(0) long arg0) {
		if (this.aLong144 < this.aLong143) {
			this.aLong145 += this.aLong143 - this.aLong144;
			this.aLong144 += this.aLong143 - this.aLong144;
			this.aLong143 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			local15++;
			this.aLong143 += arg0;
		} while (local15 < 10 && this.aLong143 < this.aLong144);
		if (this.aLong143 < this.aLong144) {
			this.aLong143 = this.aLong144;
		}
		return local15;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)J")
	@Override
	protected long method7215() {
		this.aLong144 += this.method4933();
		return this.aLong144 < this.aLong143 ? (this.aLong143 - this.aLong144) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)J")
	@Override
	public long method7211() {
		return this.aLong144;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)J")
	private long method4933() {
		@Pc(8) long local8 = jagmisc.nanoTime();
		@Pc(14) long local14 = local8 - this.aLong145;
		this.aLong145 = local8;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray17[this.anInt6074] = local14;
			this.anInt6074 = (this.anInt6074 + 1) % 10;
			if (this.anInt6075 < 1) {
				this.anInt6075++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt6075; local57++) {
			local55 += this.aLongArray17[(this.anInt6074 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt6075;
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V")
	@Override
	public void method7212() {
		this.aLong145 = 0L;
		if (this.aLong143 > this.aLong144) {
			this.aLong144 += this.aLong143 - this.aLong144;
		}
	}
}
