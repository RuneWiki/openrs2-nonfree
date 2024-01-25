import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class212_Sub3 extends Class212 {

	@OriginalMember(owner = "client!tha", name = "e", descriptor = "J")
	private long aLong271 = 0L;

	@OriginalMember(owner = "client!tha", name = "f", descriptor = "J")
	private long aLong272 = 0L;

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "[J")
	private final long[] aLongArray21 = new long[10];

	@OriginalMember(owner = "client!tha", name = "i", descriptor = "J")
	private long aLong273 = 0L;

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
	private int anInt9133 = 1;

	@OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
	private int anInt9132 = 0;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "()V")
	public Class212_Sub3() {
		this.aLong271 = this.aLong272 = jagmisc.nanoTime();
		if (this.aLong272 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
	@Override
	public void method7746() {
		if (this.aLong271 > this.aLong272) {
			this.aLong272 += this.aLong271 - this.aLong272;
		}
		this.aLong273 = 0L;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)J")
	private long method7752() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(13) long local13 = local7 - this.aLong273;
		this.aLong273 = local7;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray21[this.anInt9132] = local13;
			if (this.anInt9133 < 1) {
				this.anInt9133++;
			}
			this.anInt9132 = (this.anInt9132 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt9133; local56++) {
			local54 += this.aLongArray21[(this.anInt9132 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt9133;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7751(@OriginalArg(1) long arg0) {
		if (this.aLong271 > this.aLong272) {
			this.aLong273 += this.aLong271 - this.aLong272;
			this.aLong272 += this.aLong271 - this.aLong272;
			this.aLong271 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong271 += arg0;
		} while (local42 < 10 && this.aLong272 > this.aLong271);
		if (this.aLong272 > this.aLong271) {
			this.aLong271 = this.aLong272;
		}
		return local42;
	}

	@OriginalMember(owner = "client!tha", name = "c", descriptor = "(B)J")
	@Override
	protected long method7750() {
		this.aLong272 += this.method7752();
		return this.aLong272 < this.aLong271 ? (this.aLong271 - this.aLong272) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "(B)J")
	@Override
	public long method7749() {
		return this.aLong272;
	}
}
