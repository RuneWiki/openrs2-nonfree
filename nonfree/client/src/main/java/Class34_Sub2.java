import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class34_Sub2 extends Class34 {

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "J")
	private long aLong161 = 0L;

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "J")
	private long aLong162 = 0L;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "J")
	private long aLong163 = 0L;

	@OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
	private int anInt4921 = 0;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
	private int anInt4922 = 1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
	public Class34_Sub2() {
		this.aLong161 = System.nanoTime();
		this.aLong162 = System.nanoTime();
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)J")
	private long method4297() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong163;
		this.aLong163 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt4921] = local7;
			this.anInt4921 = (this.anInt4921 + 1) % 10;
			if (this.anInt4922 < 1) {
				this.anInt4922++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt4922; local50++) {
			local48 += this.aLongArray6[(this.anInt4921 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt4922;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)J")
	@Override
	public long method5275() {
		return this.aLong161;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	@Override
	public void method5280() {
		this.aLong163 = 0L;
		if (this.aLong161 < this.aLong162) {
			this.aLong161 += this.aLong162 - this.aLong161;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)I")
	@Override
	public int method5276(@OriginalArg(0) int arg0) {
		this.aLong161 += this.method4297();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong162 > this.aLong161) {
			Static129.method2634((this.aLong162 - this.aLong161) / 1000000L);
			this.aLong163 += this.aLong162 - this.aLong161;
			this.aLong161 += this.aLong162 - this.aLong161;
			this.aLong162 += local12;
			return 1;
		}
		@Pc(65) int local65 = 0;
		do {
			this.aLong162 += local12;
			local65++;
		} while (local65 < 10 && this.aLong161 > this.aLong162);
		if (this.aLong161 > this.aLong162) {
			this.aLong162 = this.aLong161;
		}
		return local65;
	}
}
