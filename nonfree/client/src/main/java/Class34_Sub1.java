import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!en", name = "f", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "J")
	private long aLong54 = 0L;

	@OriginalMember(owner = "client!en", name = "h", descriptor = "I")
	private int anInt1322 = 0;

	@OriginalMember(owner = "client!en", name = "g", descriptor = "J")
	private long aLong56 = 0L;

	@OriginalMember(owner = "client!en", name = "i", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!en", name = "j", descriptor = "I")
	private int anInt1323 = 1;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
	public Class34_Sub1() {
		this.aLong55 = this.aLong54 = jagmisc.nanoTime();
		if (this.aLong54 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(III)I")
	@Override
	public int method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static150.method2552((long) arg1);
		this.aLong54 += this.method1102();
		@Pc(26) long local26 = (long) arg0 * 1000000L;
		if (this.aLong54 < this.aLong55) {
			Static150.method2552((this.aLong55 - this.aLong54) / 1000000L);
			this.aLong56 += this.aLong55 - this.aLong54;
			this.aLong54 += this.aLong55 - this.aLong54;
			this.aLong55 += local26;
			return 1;
		}
		@Pc(74) int local74 = 0;
		do {
			local74++;
			this.aLong55 += local26;
		} while (local74 < 10 && this.aLong54 > this.aLong55);
		if (this.aLong54 > this.aLong55) {
			this.aLong55 = this.aLong54;
		}
		return local74;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)J")
	@Override
	public long method5033() {
		return this.aLong54;
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)J")
	private long method1102() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong56;
		this.aLong56 = local1;
		@Pc(12) long local12 = 0L;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt1322] = local7;
			this.anInt1322 = (this.anInt1322 + 1) % 10;
			if (this.anInt1323 < 1) {
				this.anInt1323++;
			}
		}
		for (@Pc(50) int local50 = 1; local50 <= this.anInt1323; local50++) {
			local12 += this.aLongArray2[(this.anInt1322 + 10 - local50) % 10];
		}
		return local12 / (long) this.anInt1323;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
	@Override
	public void method5034() {
		this.aLong56 = 0L;
		if (this.aLong55 > this.aLong54) {
			this.aLong54 += this.aLong55 - this.aLong54;
		}
	}
}
