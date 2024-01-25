import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class85_Sub2 extends Class85 {

	@OriginalMember(owner = "client!rfa", name = "g", descriptor = "J")
	private long aLong216 = 0L;

	@OriginalMember(owner = "client!rfa", name = "h", descriptor = "J")
	private long aLong217 = 0L;

	@OriginalMember(owner = "client!rfa", name = "i", descriptor = "J")
	private long aLong218 = 0L;

	@OriginalMember(owner = "client!rfa", name = "j", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
	private int anInt8429 = 0;

	@OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
	private int anInt8430 = 1;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
	public Class85_Sub2() {
		this.aLong216 = this.aLong217 = jagmisc.nanoTime();
		if (this.aLong217 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!rfa", name = "c", descriptor = "(I)J")
	private long method7269() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong218;
		this.aLong218 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray13[this.anInt8429] = local7;
			if (this.anInt8430 < 1) {
				this.anInt8430++;
			}
			this.anInt8429 = (this.anInt8429 + 1) % 10;
		}
		@Pc(47) long local47 = (long) 0;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt8430; local49++) {
			local47 += this.aLongArray13[(this.anInt8429 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt8430;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(B)V")
	@Override
	public void method8293() {
		this.aLong218 = 0L;
		if (this.aLong216 > this.aLong217) {
			this.aLong217 += this.aLong216 - this.aLong217;
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)J")
	@Override
	protected long method8291() {
		this.aLong217 += this.method7269();
		return this.aLong216 > this.aLong217 ? (this.aLong216 - this.aLong217) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)J")
	@Override
	public long method8297() {
		return this.aLong217;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(JZ)I")
	@Override
	protected int method8298(@OriginalArg(0) long arg0) {
		if (this.aLong216 > this.aLong217) {
			this.aLong218 += this.aLong216 - this.aLong217;
			this.aLong217 += this.aLong216 - this.aLong217;
			this.aLong216 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			local46++;
			this.aLong216 += arg0;
		} while (local46 < 10 && this.aLong217 > this.aLong216);
		if (this.aLong217 > this.aLong216) {
			this.aLong216 = this.aLong217;
		}
		return local46;
	}
}
