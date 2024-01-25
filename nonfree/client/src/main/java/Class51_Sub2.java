import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class51_Sub2 extends Class51 {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "J")
	private long aLong48 = 0L;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "J")
	private long aLong49 = 0L;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	private int anInt1484 = 1;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "J")
	private long aLong50 = 0L;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private int anInt1485 = 0;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class51_Sub2() {
		this.aLong49 = this.aLong48 = jagmisc.nanoTime();
		if (this.aLong48 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)J")
	@Override
	public long method4763() {
		return this.aLong48;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)J")
	private long method1369() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong50;
		this.aLong50 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray2[this.anInt1485] = local7;
			this.anInt1485 = (this.anInt1485 + 1) % 10;
			if (this.anInt1484 < 1) {
				this.anInt1484++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt1484; local58++) {
			local48 += this.aLongArray2[(this.anInt1485 + 10 - local58) % 10];
		}
		return local48 / (long) this.anInt1484;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	@Override
	public void method4765() {
		this.aLong50 = 0L;
		if (this.aLong49 > this.aLong48) {
			this.aLong48 += this.aLong49 - this.aLong48;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
	@Override
	public int method4764(@OriginalArg(0) int arg0) {
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		this.aLong48 += this.method1369();
		if (this.aLong49 > this.aLong48) {
			Static328.method5696((this.aLong49 - this.aLong48) / 1000000L);
			this.aLong50 += this.aLong49 - this.aLong48;
			this.aLong48 += this.aLong49 - this.aLong48;
			this.aLong49 += local12;
			return 1;
		}
		@Pc(71) int local71 = 0;
		do {
			local71++;
			this.aLong49 += local12;
		} while (local71 < 10 && this.aLong49 < this.aLong48);
		if (this.aLong48 > this.aLong49) {
			this.aLong49 = this.aLong48;
		}
		return local71;
	}
}
