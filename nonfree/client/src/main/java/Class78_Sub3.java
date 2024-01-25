import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class78_Sub3 extends Class78 {

	@OriginalMember(owner = "client!r", name = "j", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!r", name = "k", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!r", name = "l", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!r", name = "m", descriptor = "I")
	private int anInt7874 = 0;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	private int anInt7875 = 1;

	@OriginalMember(owner = "client!r", name = "o", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class78_Sub3() {
		this.aLong181 = System.nanoTime();
		this.aLong182 = System.nanoTime();
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
	@Override
	public void method6582() {
		this.aLong183 = 0L;
		if (this.aLong181 < this.aLong182) {
			this.aLong181 += this.aLong182 - this.aLong181;
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(B)J")
	@Override
	public long method6575() {
		return this.aLong181;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method6576(@OriginalArg(1) long arg0) {
		if (this.aLong181 < this.aLong182) {
			this.aLong183 += this.aLong182 - this.aLong181;
			this.aLong181 += this.aLong182 - this.aLong181;
			this.aLong182 += arg0;
			return 1;
		}
		@Pc(48) int local48 = 0;
		do {
			this.aLong182 += arg0;
			local48++;
		} while (local48 < 10 && this.aLong181 > this.aLong182);
		if (this.aLong182 < this.aLong181) {
			this.aLong182 = this.aLong181;
		}
		return local48;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)J")
	@Override
	protected long method6573() {
		this.aLong181 += this.method6584();
		return this.aLong182 <= this.aLong181 ? 0L : (this.aLong182 - this.aLong181) / 1000000L;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)J")
	private long method6584() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong183;
		this.aLong183 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt7874] = local7;
			this.anInt7874 = (this.anInt7874 + 1) % 10;
			if (this.anInt7875 < 1) {
				this.anInt7875++;
			}
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt7875; local58++) {
			local56 += this.aLongArray8[(this.anInt7874 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt7875;
	}
}
