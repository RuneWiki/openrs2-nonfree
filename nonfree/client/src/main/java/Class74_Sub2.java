import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "J")
	private long aLong86 = 0L;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "J")
	private long aLong87 = 0L;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	private int anInt2959 = 1;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
	private int anInt2960 = 0;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class74_Sub2() {
		this.aLong87 = System.nanoTime();
		this.aLong86 = System.nanoTime();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I")
	@Override
	public int method6075(@OriginalArg(0) int arg0) {
		this.aLong87 += this.method2173();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong86 > this.aLong87) {
			Static289.method4249((this.aLong86 - this.aLong87) / 1000000L);
			this.aLong88 += this.aLong86 - this.aLong87;
			this.aLong87 += this.aLong86 - this.aLong87;
			this.aLong86 += local18;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			this.aLong86 += local18;
			local30++;
		} while (local30 < 10 && this.aLong86 < this.aLong87);
		if (this.aLong86 < this.aLong87) {
			this.aLong86 = this.aLong87;
		}
		return local30;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
	@Override
	public void method6077() {
		this.aLong88 = 0L;
		if (this.aLong87 < this.aLong86) {
			this.aLong87 += this.aLong86 - this.aLong87;
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)J")
	private long method2173() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong88;
		this.aLong88 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt2960] = local7;
			this.anInt2960 = (this.anInt2960 + 1) % 10;
			if (this.anInt2959 < 1) {
				this.anInt2959++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt2959; local54++) {
			local52 += this.aLongArray4[(this.anInt2960 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt2959;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)J")
	@Override
	public long method6076() {
		return this.aLong87;
	}
}
