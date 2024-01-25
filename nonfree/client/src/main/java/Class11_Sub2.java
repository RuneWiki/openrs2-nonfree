import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!ru", name = "i", descriptor = "J")
	private long aLong177 = 0L;

	@OriginalMember(owner = "client!ru", name = "j", descriptor = "J")
	private long aLong178 = 0L;

	@OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
	private int anInt5891 = 1;

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "J")
	private long aLong179 = 0L;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
	private int anInt5892 = 0;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
	public Class11_Sub2() {
		this.aLong178 = this.aLong177 = jagmisc.nanoTime();
		if (this.aLong177 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)J")
	private long method4581() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong179;
		this.aLong179 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray7[this.anInt5892] = local6;
			if (this.anInt5891 < 1) {
				this.anInt5891++;
			}
			this.anInt5892 = (this.anInt5892 + 1) % 10;
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt5891; local54++) {
			local45 += this.aLongArray7[(this.anInt5892 + 10 - local54) % 10];
		}
		return local45 / (long) this.anInt5891;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(B)V")
	@Override
	public void method4916() {
		this.aLong179 = 0L;
		if (this.aLong178 > this.aLong177) {
			this.aLong177 += this.aLong178 - this.aLong177;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)I")
	@Override
	public int method4919(@OriginalArg(1) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong177 += this.method4581();
		if (this.aLong177 < this.aLong178) {
			Static252.method2874((this.aLong178 - this.aLong177) / 1000000L);
			this.aLong179 += this.aLong178 - this.aLong177;
			this.aLong177 += this.aLong178 - this.aLong177;
			this.aLong178 += local11;
			return 1;
		}
		@Pc(71) int local71 = 0;
		do {
			local71++;
			this.aLong178 += local11;
		} while (local71 < 10 && this.aLong178 < this.aLong177);
		if (this.aLong178 < this.aLong177) {
			this.aLong178 = this.aLong177;
		}
		return local71;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)J")
	@Override
	public long method4913() {
		return this.aLong177;
	}
}
