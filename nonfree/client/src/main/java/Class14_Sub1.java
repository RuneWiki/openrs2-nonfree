import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "J")
	private long aLong95 = 0L;

	@OriginalMember(owner = "client!gia", name = "g", descriptor = "J")
	private long aLong94 = 0L;

	@OriginalMember(owner = "client!gia", name = "j", descriptor = "I")
	private int anInt3515 = 1;

	@OriginalMember(owner = "client!gia", name = "i", descriptor = "J")
	private long aLong96 = 0L;

	@OriginalMember(owner = "client!gia", name = "l", descriptor = "I")
	private int anInt3516 = 0;

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "()V")
	public Class14_Sub1() {
		this.aLong94 = this.aLong95 = jagmisc.nanoTime();
		if (this.aLong95 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)J")
	@Override
	protected long method3831() {
		this.aLong95 += this.method3171();
		return this.aLong95 < this.aLong94 ? (this.aLong94 - this.aLong95) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(JI)I")
	@Override
	protected int method3830(@OriginalArg(0) long arg0) {
		if (this.aLong95 < this.aLong94) {
			this.aLong96 += this.aLong94 - this.aLong95;
			this.aLong95 += this.aLong94 - this.aLong95;
			this.aLong94 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			this.aLong94 += arg0;
			local43++;
		} while (local43 < 10 && this.aLong95 > this.aLong94);
		if (this.aLong94 < this.aLong95) {
			this.aLong94 = this.aLong95;
		}
		return local43;
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)J")
	@Override
	public long method3833() {
		return this.aLong95;
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V")
	@Override
	public void method3834() {
		if (this.aLong94 > this.aLong95) {
			this.aLong95 += this.aLong94 - this.aLong95;
		}
		this.aLong96 = 0L;
	}

	@OriginalMember(owner = "client!gia", name = "d", descriptor = "(I)J")
	private long method3171() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong96;
		this.aLong96 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray10[this.anInt3516] = local7;
			if (this.anInt3515 < 1) {
				this.anInt3515++;
			}
			this.anInt3516 = (this.anInt3516 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt3515; local52++) {
			local50 += this.aLongArray10[(this.anInt3516 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt3515;
	}
}
