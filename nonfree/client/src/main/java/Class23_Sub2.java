import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
	private int anInt3694 = 1;

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
	private int anInt3695 = 0;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
	public Class23_Sub2() {
		this.aLong74 = this.aLong75 = jagmisc.nanoTime();
		if (this.aLong75 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method6158(@OriginalArg(1) long arg0) {
		if (this.aLong74 > this.aLong75) {
			this.aLong76 += this.aLong74 - this.aLong75;
			this.aLong75 += this.aLong74 - this.aLong75;
			this.aLong74 += arg0;
			return 1;
		}
		@Pc(48) int local48 = 0;
		do {
			local48++;
			this.aLong74 += arg0;
		} while (local48 < 10 && this.aLong74 < this.aLong75);
		if (this.aLong75 > this.aLong74) {
			this.aLong74 = this.aLong75;
		}
		return local48;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)J")
	@Override
	public long method6159() {
		return this.aLong75;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)J")
	@Override
	protected long method6165() {
		this.aLong75 += this.method3172();
		return this.aLong75 < this.aLong74 ? (this.aLong74 - this.aLong75) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	@Override
	public void method6160() {
		this.aLong76 = 0L;
		if (this.aLong75 < this.aLong74) {
			this.aLong75 += this.aLong74 - this.aLong75;
		}
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(B)J")
	private long method3172() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong76;
		this.aLong76 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray11[this.anInt3695] = local6;
			if (this.anInt3694 < 1) {
				this.anInt3694++;
			}
			this.anInt3695 = (this.anInt3695 + 1) % 10;
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt3694; local53++) {
			local45 += this.aLongArray11[(this.anInt3695 + 10 - local53) % 10];
		}
		return local45 / (long) this.anInt3694;
	}
}
