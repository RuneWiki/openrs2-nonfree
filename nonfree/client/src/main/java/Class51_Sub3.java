import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class51_Sub3 extends Class51 {

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "J")
	private long aLong208 = 0L;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "J")
	private long aLong209 = 0L;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	private int anInt6027 = 0;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
	private int anInt6028 = 1;

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class51_Sub3() {
		this.aLong208 = System.nanoTime();
		this.aLong209 = System.nanoTime();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)I")
	@Override
	public int method4764(@OriginalArg(0) int arg0) {
		this.aLong208 += this.method4766();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong209 > this.aLong208) {
			Static328.method5696((this.aLong209 - this.aLong208) / 1000000L);
			this.aLong210 += this.aLong209 - this.aLong208;
			this.aLong208 += this.aLong209 - this.aLong208;
			this.aLong209 += local18;
			return 1;
		}
		@Pc(66) int local66 = 0;
		do {
			this.aLong209 += local18;
			local66++;
		} while (local66 < 10 && this.aLong209 < this.aLong208);
		if (this.aLong209 < this.aLong208) {
			this.aLong209 = this.aLong208;
		}
		return local66;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
	@Override
	public void method4765() {
		this.aLong210 = 0L;
		if (this.aLong208 < this.aLong209) {
			this.aLong208 += this.aLong209 - this.aLong208;
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)J")
	@Override
	public long method4763() {
		return this.aLong208;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)J")
	private long method4766() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong210;
		this.aLong210 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray6[this.anInt6027] = local7;
			this.anInt6027 = (this.anInt6027 + 1) % 10;
			if (this.anInt6028 < 1) {
				this.anInt6028++;
			}
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt6028; local60++) {
			local58 += this.aLongArray6[(this.anInt6027 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt6028;
	}
}
