import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class66_Sub1 extends Class66 {

	@OriginalMember(owner = "client!fh", name = "k", descriptor = "J")
	private long aLong54 = 0L;

	@OriginalMember(owner = "client!fh", name = "l", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
	private int anInt1923 = 1;

	@OriginalMember(owner = "client!fh", name = "o", descriptor = "J")
	private long aLong56 = 0L;

	@OriginalMember(owner = "client!fh", name = "n", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
	private int anInt1924 = 0;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class66_Sub1() {
		this.aLong54 = this.aLong55 = jagmisc.nanoTime();
		if (this.aLong55 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)I")
	@Override
	public int method5847(@OriginalArg(1) int arg0) {
		this.aLong55 += this.method1977();
		@Pc(17) long local17 = (long) arg0 * 1000000L;
		if (this.aLong55 < this.aLong54) {
			Static102.method2276((this.aLong54 - this.aLong55) / 1000000L);
			this.aLong56 += this.aLong54 - this.aLong55;
			this.aLong55 += this.aLong54 - this.aLong55;
			this.aLong54 += local17;
			return 1;
		}
		@Pc(67) int local67 = 0;
		do {
			local67++;
			this.aLong54 += local17;
		} while (local67 < 10 && this.aLong54 < this.aLong55);
		if (this.aLong55 > this.aLong54) {
			this.aLong54 = this.aLong55;
		}
		return local67;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)J")
	@Override
	public long method5844() {
		return this.aLong55;
	}

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)J")
	private long method1977() {
		@Pc(9) long local9 = jagmisc.nanoTime();
		@Pc(15) long local15 = local9 - this.aLong56;
		this.aLong56 = local9;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray3[this.anInt1924] = local15;
			if (this.anInt1923 < 1) {
				this.anInt1923++;
			}
			this.anInt1924 = (this.anInt1924 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt1923; local56++) {
			local54 += this.aLongArray3[(this.anInt1924 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt1923;
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(I)V")
	@Override
	public void method5851() {
		this.aLong56 = 0L;
		if (this.aLong55 < this.aLong54) {
			this.aLong55 += this.aLong54 - this.aLong55;
		}
	}
}
