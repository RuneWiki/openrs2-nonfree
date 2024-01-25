import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "J")
	private long aLong165 = 0L;

	@OriginalMember(owner = "client!qp", name = "l", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
	private int anInt5191 = 0;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
	private int anInt5190 = 1;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class70_Sub2() {
		this.aLong165 = System.nanoTime();
		this.aLong166 = System.nanoTime();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5397(@OriginalArg(0) int arg0) {
		this.aLong165 += this.method4394();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong165 < this.aLong166) {
			Static134.method2241((this.aLong166 - this.aLong165) / 1000000L);
			this.aLong167 += this.aLong166 - this.aLong165;
			this.aLong165 += this.aLong166 - this.aLong165;
			this.aLong166 += local12;
			return 1;
		}
		@Pc(64) int local64 = 0;
		do {
			this.aLong166 += local12;
			local64++;
		} while (local64 < 10 && this.aLong166 < this.aLong165);
		if (this.aLong166 < this.aLong165) {
			this.aLong166 = this.aLong165;
		}
		return local64;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)J")
	@Override
	public long method5399() {
		return this.aLong165;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	@Override
	public void method5394() {
		this.aLong167 = 0L;
		if (this.aLong166 > this.aLong165) {
			this.aLong165 += this.aLong166 - this.aLong165;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(Z)J")
	private long method4394() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong167;
		this.aLong167 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt5191] = local7;
			this.anInt5191 = (this.anInt5191 + 1) % 10;
			if (this.anInt5190 < 1) {
				this.anInt5190++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt5190; local59++) {
			local51 += this.aLongArray7[(this.anInt5191 + 10 - local59) % 10];
		}
		return local51 / (long) this.anInt5190;
	}
}
