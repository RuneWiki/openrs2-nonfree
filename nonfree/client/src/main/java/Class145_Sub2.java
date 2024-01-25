import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class145_Sub2 extends Class145 {

	@OriginalMember(owner = "client!it", name = "h", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "J")
	private long aLong133 = 0L;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "I")
	private int anInt4143 = 0;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "I")
	private int anInt4142 = 1;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!it", name = "m", descriptor = "J")
	private long aLong134 = 0L;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
	public Class145_Sub2() {
		this.aLong132 = this.aLong133 = jagmisc.nanoTime();
		if (this.aLong133 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8784(@OriginalArg(0) long arg0) {
		if (this.aLong132 > this.aLong133) {
			this.aLong134 += this.aLong132 - this.aLong133;
			this.aLong133 += this.aLong132 - this.aLong133;
			this.aLong132 += arg0;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			this.aLong132 += arg0;
			local49++;
		} while (local49 < 10 && this.aLong132 < this.aLong133);
		if (this.aLong133 > this.aLong132) {
			this.aLong132 = this.aLong133;
		}
		return local49;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)J")
	@Override
	public long method8780() {
		return this.aLong133;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)J")
	private long method3771() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong134;
		this.aLong134 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt4143] = local7;
			if (this.anInt4142 < 1) {
				this.anInt4142++;
			}
			this.anInt4143 = (this.anInt4143 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt4142; local58++) {
			local56 += this.aLongArray5[(this.anInt4143 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt4142;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)J")
	@Override
	protected long method8781() {
		this.aLong133 += this.method3771();
		return this.aLong133 < this.aLong132 ? (this.aLong132 - this.aLong133) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)V")
	@Override
	public void method8779() {
		this.aLong134 = 0L;
		if (this.aLong132 > this.aLong133) {
			this.aLong133 += this.aLong132 - this.aLong133;
		}
	}
}
