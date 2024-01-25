import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class66_Sub3 extends Class66 {

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "J")
	private long aLong207 = 0L;

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "J")
	private long aLong208 = 0L;

	@OriginalMember(owner = "client!vr", name = "m", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!vr", name = "p", descriptor = "J")
	private long aLong209 = 0L;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
	private int anInt6745 = 1;

	@OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
	private int anInt6744 = 0;

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class66_Sub3() {
		this.aLong208 = System.nanoTime();
		this.aLong207 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)J")
	@Override
	public long method5844() {
		return this.aLong208;
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
	@Override
	public void method5851() {
		this.aLong209 = 0L;
		if (this.aLong207 > this.aLong208) {
			this.aLong208 += this.aLong207 - this.aLong208;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(BI)I")
	@Override
	public int method5847(@OriginalArg(1) int arg0) {
		this.aLong208 += this.method5852();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong208 < this.aLong207) {
			Static102.method2276((this.aLong207 - this.aLong208) / 1000000L);
			this.aLong209 += this.aLong207 - this.aLong208;
			this.aLong208 += this.aLong207 - this.aLong208;
			this.aLong207 += local19;
			return 1;
		}
		@Pc(71) int local71 = 0;
		do {
			local71++;
			this.aLong207 += local19;
		} while (local71 < 10 && this.aLong207 < this.aLong208);
		if (this.aLong208 > this.aLong207) {
			this.aLong207 = this.aLong208;
		}
		return local71;
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)J")
	private long method5852() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong209;
		this.aLong209 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt6744] = local7;
			this.anInt6744 = (this.anInt6744 + 1) % 10;
			if (this.anInt6745 < 1) {
				this.anInt6745++;
			}
		}
		@Pc(47) long local47 = (long) 0;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt6745; local49++) {
			local47 += this.aLongArray8[(this.anInt6744 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt6745;
	}
}
