import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "J")
	private long aLong77 = 0L;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
	private int anInt2345 = 1;

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "J")
	private long aLong78 = 0L;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
	private int anInt2346 = 0;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class77_Sub1() {
		this.aLong77 = System.nanoTime();
		this.aLong76 = System.nanoTime();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I")
	@Override
	public int method3069(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong77 += this.method2085();
		if (this.aLong77 < this.aLong76) {
			Static224.method3441((this.aLong76 - this.aLong77) / 1000000L);
			this.aLong78 += this.aLong76 - this.aLong77;
			this.aLong77 += this.aLong76 - this.aLong77;
			this.aLong76 += local4;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			local29++;
			this.aLong76 += local4;
		} while (local29 < 10 && this.aLong76 < this.aLong77);
		if (this.aLong77 > this.aLong76) {
			this.aLong76 = this.aLong77;
		}
		return local29;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)J")
	private long method2085() {
		@Pc(7) long local7 = System.nanoTime();
		@Pc(12) long local12 = local7 - this.aLong78;
		this.aLong78 = local7;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray1[this.anInt2346] = local12;
			this.anInt2346 = (this.anInt2346 + 1) % 10;
			if (this.anInt2345 < 1) {
				this.anInt2345++;
			}
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt2345; local58++) {
			local56 += this.aLongArray1[(this.anInt2346 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt2345;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	@Override
	public void method3067() {
		this.aLong78 = 0L;
		if (this.aLong76 > this.aLong77) {
			this.aLong77 += this.aLong76 - this.aLong77;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)J")
	@Override
	public long method3074() {
		return this.aLong77;
	}
}
