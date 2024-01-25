import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class11_Sub3 extends Class11 {

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
	private int anInt6390 = 1;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	private int anInt6389 = 0;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class11_Sub3() {
		this.aLong199 = System.nanoTime();
		this.aLong200 = System.nanoTime();
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)J")
	private long method4920() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong201;
		this.aLong201 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray8[this.anInt6389] = local12;
			this.anInt6389 = (this.anInt6389 + 1) % 10;
			if (this.anInt6390 < 1) {
				this.anInt6390++;
			}
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt6390; local54++) {
			local52 += this.aLongArray8[(this.anInt6389 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt6390;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)J")
	@Override
	public long method4913() {
		return this.aLong199;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)V")
	@Override
	public void method4916() {
		this.aLong201 = 0L;
		if (this.aLong200 > this.aLong199) {
			this.aLong199 += this.aLong200 - this.aLong199;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
	@Override
	public int method4919(@OriginalArg(1) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong199 += this.method4920();
		if (this.aLong200 > this.aLong199) {
			Static252.method2874((this.aLong200 - this.aLong199) / 1000000L);
			this.aLong201 += this.aLong200 - this.aLong199;
			this.aLong199 += this.aLong200 - this.aLong199;
			this.aLong200 += local11;
			return 1;
		}
		@Pc(27) int local27 = 0;
		do {
			local27++;
			this.aLong200 += local11;
		} while (local27 < 10 && this.aLong200 < this.aLong199);
		if (this.aLong200 < this.aLong199) {
			this.aLong200 = this.aLong199;
		}
		return local27;
	}
}
