import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!hu", name = "l", descriptor = "J")
	private long aLong111 = 0L;

	@OriginalMember(owner = "client!hu", name = "k", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!hu", name = "n", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!hu", name = "o", descriptor = "I")
	private int anInt4073 = 1;

	@OriginalMember(owner = "client!hu", name = "p", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!hu", name = "m", descriptor = "I")
	private int anInt4072 = 0;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	public Class43_Sub3() {
		this.aLong110 = this.aLong111 = jagmisc.nanoTime();
		if (this.aLong111 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)J")
	@Override
	public long method3557() {
		return this.aLong111;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)V")
	@Override
	public void method3556() {
		this.aLong112 = 0L;
		if (this.aLong110 > this.aLong111) {
			this.aLong111 += this.aLong110 - this.aLong111;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Z)J")
	@Override
	protected long method3561() {
		this.aLong111 += this.method3564();
		return this.aLong110 > this.aLong111 ? (this.aLong110 - this.aLong111) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)J")
	private long method3564() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong112;
		this.aLong112 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray11[this.anInt4072] = local7;
			if (this.anInt4073 < 1) {
				this.anInt4073++;
			}
			this.anInt4072 = (this.anInt4072 + 1) % 10;
		}
		@Pc(44) long local44 = 0L;
		for (@Pc(46) int local46 = 1; local46 <= this.anInt4073; local46++) {
			local44 += this.aLongArray11[(this.anInt4072 + 10 - local46) % 10];
		}
		return local44 / (long) this.anInt4073;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(JI)I")
	@Override
	protected int method3558(@OriginalArg(0) long arg0) {
		if (this.aLong111 < this.aLong110) {
			this.aLong112 += this.aLong110 - this.aLong111;
			this.aLong111 += this.aLong110 - this.aLong111;
			this.aLong110 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			this.aLong110 += arg0;
			local43++;
		} while (local43 < 10 && this.aLong111 > this.aLong110);
		if (this.aLong111 > this.aLong110) {
			this.aLong110 = this.aLong111;
		}
		return local43;
	}
}
