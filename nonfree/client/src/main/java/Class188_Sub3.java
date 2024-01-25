import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class188_Sub3 extends Class188 {

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "J")
	private long aLong255 = 0L;

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "J")
	private long aLong256 = 0L;

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "I")
	private int anInt9288 = 0;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "I")
	private int anInt9289 = 1;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "[J")
	private final long[] aLongArray15 = new long[10];

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "J")
	private long aLong257 = 0L;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
	public Class188_Sub3() {
		this.aLong255 = System.nanoTime();
		this.aLong256 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)J")
	private long method7569() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong257;
		this.aLong257 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray15[this.anInt9288] = local6;
			if (this.anInt9289 < 1) {
				this.anInt9289++;
			}
			this.anInt9288 = (this.anInt9288 + 1) % 10;
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt9289; local49++) {
			local47 += this.aLongArray15[(this.anInt9288 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt9289;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)J")
	@Override
	public long method7565() {
		return this.aLong255;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
	@Override
	public void method7568() {
		this.aLong257 = 0L;
		if (this.aLong256 > this.aLong255) {
			this.aLong255 += this.aLong256 - this.aLong255;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7561(@OriginalArg(1) long arg0) {
		if (this.aLong255 < this.aLong256) {
			this.aLong257 += this.aLong256 - this.aLong255;
			this.aLong255 += this.aLong256 - this.aLong255;
			this.aLong256 += arg0;
			return 1;
		}
		@Pc(46) int local46 = 0;
		do {
			local46++;
			this.aLong256 += arg0;
		} while (local46 < 10 && this.aLong256 < this.aLong255);
		if (this.aLong255 > this.aLong256) {
			this.aLong256 = this.aLong255;
		}
		return local46;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)J")
	@Override
	protected long method7564() {
		this.aLong255 += this.method7569();
		return this.aLong256 <= this.aLong255 ? 0L : (this.aLong256 - this.aLong255) / 1000000L;
	}
}
