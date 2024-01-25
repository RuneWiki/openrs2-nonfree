import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class145_Sub3 extends Class145 {

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "J")
	private long aLong274 = 0L;

	@OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
	private int anInt10337 = 0;

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "J")
	private long aLong275 = 0L;

	@OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
	private int anInt10338 = 1;

	@OriginalMember(owner = "client!wk", name = "j", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!wk", name = "m", descriptor = "J")
	private long aLong276 = 0L;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(JI)I")
	@Override
	protected int method8784(@OriginalArg(0) long arg0) {
		if (this.aLong274 < this.aLong275) {
			this.aLong276 += this.aLong275 - this.aLong274;
			this.aLong274 += this.aLong275 - this.aLong274;
			this.aLong275 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			local15++;
			this.aLong275 += arg0;
		} while (local15 < 10 && this.aLong274 > this.aLong275);
		if (this.aLong275 < this.aLong274) {
			this.aLong275 = this.aLong274;
		}
		return local15;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)J")
	@Override
	protected long method8781() {
		this.aLong274 += this.method8786();
		return this.aLong274 < this.aLong275 ? (this.aLong275 - this.aLong274) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V")
	@Override
	public void method8779() {
		if (this.aLong274 < this.aLong275) {
			this.aLong274 += this.aLong275 - this.aLong274;
		}
		this.aLong276 = 0L;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)J")
	@Override
	public long method8780() {
		return this.aLong274;
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)J")
	private long method8786() {
		@Pc(6) long local6 = Static205.method3179() * 1000000L;
		@Pc(11) long local11 = local6 - this.aLong276;
		this.aLong276 = local6;
		if (local11 > -5000000000L && local11 < 5000000000L) {
			this.aLongArray17[this.anInt10337] = local11;
			if (this.anInt10338 < 10) {
				this.anInt10338++;
			}
			this.anInt10337 = (this.anInt10337 + 1) % 10;
		}
		@Pc(53) long local53 = (long) 0;
		for (@Pc(55) int local55 = 1; local55 <= this.anInt10338; local55++) {
			local53 += this.aLongArray17[(this.anInt10337 + 10 - local55) % 10];
		}
		return local53 / (long) this.anInt10338;
	}
}
