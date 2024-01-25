import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "J")
	private long aLong69 = 0L;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
	private int anInt2724 = 0;

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	private int anInt2725 = 1;

	@OriginalMember(owner = "client!ha", name = "g", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class6_Sub1() {
		this.aLong70 = System.nanoTime();
		this.aLong69 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)J")
	@Override
	public long method4655() {
		return this.aLong70;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)J")
	private long method2390() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong71;
		this.aLong71 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt2724] = local7;
			if (this.anInt2725 < 1) {
				this.anInt2725++;
			}
			this.anInt2724 = (this.anInt2724 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt2725; local50++) {
			local48 += this.aLongArray2[(this.anInt2724 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt2725;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	@Override
	public void method4659() {
		if (this.aLong70 < this.aLong69) {
			this.aLong70 += this.aLong69 - this.aLong70;
		}
		this.aLong71 = 0L;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
	@Override
	public int method4658(@OriginalArg(0) int arg0) {
		this.aLong70 += this.method2390();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong69 > this.aLong70) {
			Static249.method4396((this.aLong69 - this.aLong70) / 1000000L);
			this.aLong71 += this.aLong69 - this.aLong70;
			this.aLong70 += this.aLong69 - this.aLong70;
			this.aLong69 += local12;
			return 1;
		}
		@Pc(26) int local26 = 0;
		do {
			local26++;
			this.aLong69 += local12;
		} while (local26 < 10 && this.aLong69 < this.aLong70);
		if (this.aLong69 < this.aLong70) {
			this.aLong69 = this.aLong70;
		}
		return local26;
	}
}
