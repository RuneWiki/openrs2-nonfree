import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "J")
	private long aLong225 = 0L;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "J")
	private long aLong226 = 0L;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "J")
	private long aLong227 = 0L;

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
	private int anInt9102 = 1;

	@OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
	private int anInt9103 = 0;

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "[J")
	private final long[] aLongArray21 = new long[10];

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class32_Sub3() {
		this.aLong226 = System.nanoTime();
		this.aLong225 = System.nanoTime();
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)J")
	private long method7217() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong227;
		this.aLong227 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray21[this.anInt9103] = local7;
			this.anInt9103 = (this.anInt9103 + 1) % 10;
			if (this.anInt9102 < 1) {
				this.anInt9102++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt9102; local54++) {
			local52 += this.aLongArray21[(this.anInt9103 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt9102;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(JI)I")
	@Override
	protected int method7216(@OriginalArg(0) long arg0) {
		if (this.aLong226 < this.aLong225) {
			this.aLong227 += this.aLong225 - this.aLong226;
			this.aLong226 += this.aLong225 - this.aLong226;
			this.aLong225 += arg0;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong225 += arg0;
		} while (local49 < 10 && this.aLong225 < this.aLong226);
		if (this.aLong225 < this.aLong226) {
			this.aLong225 = this.aLong226;
		}
		return local49;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)J")
	@Override
	public long method7211() {
		return this.aLong226;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)J")
	@Override
	protected long method7215() {
		this.aLong226 += this.method7217();
		return this.aLong225 > this.aLong226 ? (this.aLong225 - this.aLong226) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	@Override
	public void method7212() {
		if (this.aLong225 > this.aLong226) {
			this.aLong226 += this.aLong225 - this.aLong226;
		}
		this.aLong227 = 0L;
	}
}
