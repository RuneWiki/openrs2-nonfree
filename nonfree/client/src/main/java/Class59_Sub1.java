import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class59_Sub1 extends Class59 {

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "J")
	private long aLong54 = 0L;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "J")
	private long aLong56 = 0L;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
	private int anInt1999 = 1;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
	private int anInt2000 = 0;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	public Class59_Sub1() {
		this.aLong55 = this.aLong54 = jagmisc.nanoTime();
		if (this.aLong54 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(II)I")
	@Override
	public int method4362(@OriginalArg(0) int arg0) {
		this.aLong54 += this.method1475();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong54 < this.aLong55) {
			Static443.method5991((this.aLong55 - this.aLong54) / 1000000L);
			this.aLong56 += this.aLong55 - this.aLong54;
			this.aLong54 += this.aLong55 - this.aLong54;
			this.aLong55 += local19;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			this.aLong55 += local19;
			local31++;
		} while (local31 < 10 && this.aLong54 > this.aLong55);
		if (this.aLong55 < this.aLong54) {
			this.aLong55 = this.aLong54;
		}
		return local31;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)J")
	private long method1475() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong56;
		this.aLong56 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt2000] = local7;
			if (this.anInt1999 < 1) {
				this.anInt1999++;
			}
			this.anInt2000 = (this.anInt2000 + 1) % 10;
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt1999; local52++) {
			local50 += this.aLongArray1[(this.anInt2000 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt1999;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
	@Override
	public void method4363() {
		this.aLong56 = 0L;
		if (this.aLong55 > this.aLong54) {
			this.aLong54 += this.aLong55 - this.aLong54;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)J")
	@Override
	public long method4364() {
		return this.aLong54;
	}
}
