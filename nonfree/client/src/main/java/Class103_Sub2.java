import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "J")
	private long aLong100 = 0L;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "J")
	private long aLong99 = 0L;

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
	private int anInt3069 = 1;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "J")
	private long aLong101 = 0L;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	private int anInt3070 = 0;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "()V")
	public Class103_Sub2() {
		this.aLong100 = this.aLong99 = jagmisc.nanoTime();
		if (this.aLong99 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)J")
	private long method2819() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong101;
		this.aLong101 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray8[this.anInt3070] = local6;
			this.anInt3070 = (this.anInt3070 + 1) % 10;
			if (this.anInt3069 < 1) {
				this.anInt3069++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt3069; local57++) {
			local55 += this.aLongArray8[(this.anInt3070 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt3069;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)J")
	@Override
	public long method4084() {
		return this.aLong99;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)I")
	@Override
	public int method4086(@OriginalArg(1) int arg0) {
		this.aLong99 += this.method2819();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong99 < this.aLong100) {
			Static185.method3004((this.aLong100 - this.aLong99) / 1000000L);
			this.aLong101 += this.aLong100 - this.aLong99;
			this.aLong99 += this.aLong100 - this.aLong99;
			this.aLong100 += local12;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			local70++;
			this.aLong100 += local12;
		} while (local70 < 10 && this.aLong100 < this.aLong99);
		if (this.aLong100 < this.aLong99) {
			this.aLong100 = this.aLong99;
		}
		return local70;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	@Override
	public void method4087() {
		if (this.aLong99 < this.aLong100) {
			this.aLong99 += this.aLong100 - this.aLong99;
		}
		this.aLong101 = 0L;
	}
}
