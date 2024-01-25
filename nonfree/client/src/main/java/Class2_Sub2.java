import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class2_Sub2 extends Class2 {

	@OriginalMember(owner = "client!po", name = "l", descriptor = "J")
	private long aLong217 = 0L;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "J")
	private long aLong218 = 0L;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "[J")
	private final long[] aLongArray17 = new long[10];

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	private int anInt8201 = 0;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "I")
	private int anInt8202 = 1;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "J")
	private long aLong219 = 0L;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class2_Sub2() {
		this.aLong217 = this.aLong218 = jagmisc.nanoTime();
		if (this.aLong218 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	@Override
	public void method8987() {
		if (this.aLong218 < this.aLong217) {
			this.aLong218 += this.aLong217 - this.aLong218;
		}
		this.aLong219 = 0L;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)J")
	@Override
	protected long method8983() {
		this.aLong218 += this.method7139();
		return this.aLong218 < this.aLong217 ? (this.aLong217 - this.aLong218) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8990(@OriginalArg(1) long arg0) {
		if (this.aLong218 < this.aLong217) {
			this.aLong219 += this.aLong217 - this.aLong218;
			this.aLong218 += this.aLong217 - this.aLong218;
			this.aLong217 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			local45++;
			this.aLong217 += arg0;
		} while (local45 < 10 && this.aLong217 < this.aLong218);
		if (this.aLong217 < this.aLong218) {
			this.aLong217 = this.aLong218;
		}
		return local45;
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)J")
	private long method7139() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(13) long local13 = local7 - this.aLong219;
		this.aLong219 = local7;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray17[this.anInt8201] = local13;
			this.anInt8201 = (this.anInt8201 + 1) % 10;
			if (this.anInt8202 < 1) {
				this.anInt8202++;
			}
		}
		@Pc(62) long local62 = 0L;
		for (@Pc(64) int local64 = 1; local64 <= this.anInt8202; local64++) {
			local62 += this.aLongArray17[(this.anInt8201 + 10 - local64) % 10];
		}
		return local62 / (long) this.anInt8202;
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)J")
	@Override
	public long method8989() {
		return this.aLong218;
	}
}
