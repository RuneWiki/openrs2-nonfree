import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class140_Sub3 extends Class140 {

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "J")
	private long aLong212 = 0L;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "J")
	private long aLong213 = 0L;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
	private int anInt6984 = 1;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	private int anInt6985 = 0;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "J")
	private long aLong214 = 0L;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	public Class140_Sub3() {
		this.aLong213 = System.nanoTime();
		this.aLong212 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)J")
	private long method5404() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(13) long local13 = local1 - this.aLong214;
		this.aLong214 = local1;
		if (local13 > -5000000000L && local13 < 5000000000L) {
			this.aLongArray12[this.anInt6985] = local13;
			if (this.anInt6984 < 1) {
				this.anInt6984++;
			}
			this.anInt6985 = (this.anInt6985 + 1) % 10;
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt6984; local53++) {
			local51 += this.aLongArray12[(this.anInt6985 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt6984;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	@Override
	public void method5399() {
		if (this.aLong212 > this.aLong213) {
			this.aLong213 += this.aLong212 - this.aLong213;
		}
		this.aLong214 = 0L;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)I")
	@Override
	public int method5400(@OriginalArg(1) int arg0) {
		this.aLong213 += this.method5404();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong213 < this.aLong212) {
			Static429.method5376((this.aLong212 - this.aLong213) / 1000000L);
			this.aLong214 += this.aLong212 - this.aLong213;
			this.aLong213 += this.aLong212 - this.aLong213;
			this.aLong212 += local12;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong212 += local12;
			local30++;
		} while (local30 < 10 && this.aLong212 < this.aLong213);
		if (this.aLong213 > this.aLong212) {
			this.aLong212 = this.aLong213;
		}
		return local30;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)J")
	@Override
	public long method5403() {
		return this.aLong213;
	}
}
