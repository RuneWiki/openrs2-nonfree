import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "J")
	private long aLong92 = 0L;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "J")
	private long aLong91 = 0L;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
	private int anInt4435 = 1;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "J")
	private long aLong93 = 0L;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
	private int anInt4434 = 0;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
	public Class116_Sub1() {
		this.aLong91 = System.nanoTime();
		this.aLong92 = System.nanoTime();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method7958(@OriginalArg(1) long arg0) {
		if (this.aLong91 < this.aLong92) {
			this.aLong93 += this.aLong92 - this.aLong91;
			this.aLong91 += this.aLong92 - this.aLong91;
			this.aLong92 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			this.aLong92 += arg0;
			local17++;
		} while (local17 < 10 && this.aLong91 > this.aLong92);
		if (this.aLong91 > this.aLong92) {
			this.aLong92 = this.aLong91;
		}
		return local17;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)J")
	private long method3780() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong93;
		this.aLong93 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt4434] = local7;
			if (this.anInt4435 < 1) {
				this.anInt4435++;
			}
			this.anInt4434 = (this.anInt4434 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt4435; local48++) {
			local46 += this.aLongArray4[(this.anInt4434 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt4435;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
	@Override
	public void method7962() {
		if (this.aLong92 > this.aLong91) {
			this.aLong91 += this.aLong92 - this.aLong91;
		}
		this.aLong93 = 0L;
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)J")
	@Override
	protected long method7963() {
		this.aLong91 += this.method3780();
		return this.aLong92 <= this.aLong91 ? 0L : (this.aLong92 - this.aLong91) / 1000000L;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)J")
	@Override
	public long method7956() {
		return this.aLong91;
	}
}
