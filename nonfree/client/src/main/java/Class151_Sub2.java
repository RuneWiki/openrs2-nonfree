import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class151_Sub2 extends Class151 {

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "J")
	private long aLong151 = 0L;

	@OriginalMember(owner = "client!ln", name = "i", descriptor = "J")
	private long aLong152 = 0L;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	private int anInt6111 = 1;

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
	private int anInt6110 = 0;

	@OriginalMember(owner = "client!ln", name = "j", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "()V")
	public Class151_Sub2() {
		this.aLong151 = this.aLong152 = jagmisc.nanoTime();
		if (this.aLong152 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6453(@OriginalArg(0) long arg0) {
		if (this.aLong152 < this.aLong151) {
			this.aLong153 += this.aLong151 - this.aLong152;
			this.aLong152 += this.aLong151 - this.aLong152;
			this.aLong151 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			local46++;
			this.aLong151 += arg0;
		} while (local46 < 10 && this.aLong151 < this.aLong152);
		if (this.aLong152 > this.aLong151) {
			this.aLong151 = this.aLong152;
		}
		return local46;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)J")
	@Override
	protected long method6455() {
		this.aLong152 += this.method5219();
		return this.aLong151 > this.aLong152 ? (this.aLong151 - this.aLong152) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)J")
	@Override
	public long method6451() {
		return this.aLong152;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	@Override
	public void method6452() {
		this.aLong153 = 0L;
		if (this.aLong151 > this.aLong152) {
			this.aLong152 += this.aLong151 - this.aLong152;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)J")
	private long method5219() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong153;
		this.aLong153 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt6110] = local7;
			if (this.anInt6111 < 1) {
				this.anInt6111++;
			}
			this.anInt6110 = (this.anInt6110 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt6111; local48++) {
			local46 += this.aLongArray12[(this.anInt6110 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt6111;
	}
}
