import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "J")
	private long aLong72 = 0L;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "J")
	private long aLong73 = 0L;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
	private int anInt2178 = 0;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
	private int anInt2179 = 1;

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "[J")
	private long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class78_Sub1() {
		this.aLong72 = System.nanoTime();
		this.aLong73 = System.nanoTime();
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.aLong74 = 0L;
		if (this.aLong73 > this.aLong72) {
			this.aLong72 += this.aLong73 - this.aLong72;
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)J")
	@Override
	public long method3302() {
		return this.aLong72;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)J")
	private long method1732() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong74;
		this.aLong74 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray14[this.anInt2178] = local7;
			this.anInt2178 = (this.anInt2178 + 1) % 10;
			if (this.anInt2179 < 1) {
				this.anInt2179++;
			}
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(47) int local47 = 1; local47 <= this.anInt2179; local47++) {
			local45 += this.aLongArray14[(this.anInt2178 + 10 - local47) % 10];
		}
		return local45 / (long) this.anInt2179;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)I")
	@Override
	public int method3296(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static303.method4677((long) arg0);
		@Pc(15) long local15 = (long) arg1 * 1000000L;
		this.aLong72 += this.method1732();
		if (this.aLong73 > this.aLong72) {
			Static303.method4677((this.aLong73 - this.aLong72) / 1000000L);
			this.aLong74 += this.aLong73 - this.aLong72;
			this.aLong72 += this.aLong73 - this.aLong72;
			this.aLong73 += local15;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			local31++;
			this.aLong73 += local15;
		} while (local31 < 10 && this.aLong73 < this.aLong72);
		if (this.aLong72 > this.aLong73) {
			this.aLong73 = this.aLong72;
		}
		return local31;
	}
}
