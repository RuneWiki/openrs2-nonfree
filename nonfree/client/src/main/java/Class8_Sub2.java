import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "J")
	private long aLong27 = 0L;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "J")
	private long aLong28 = 0L;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "[J")
	private long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	private int anInt409 = 0;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "J")
	private long aLong29 = 0L;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
	private int anInt410 = 1;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class8_Sub2() {
		this.aLong27 = System.nanoTime();
		this.aLong28 = System.nanoTime();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)J")
	@Override
	public long method330() {
		return this.aLong27;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)J")
	private long method333() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong29;
		this.aLong29 = local1;
		@Pc(12) long local12 = 0L;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray3[this.anInt409] = local7;
			if (this.anInt410 < 1) {
				this.anInt410++;
			}
			this.anInt409 = (this.anInt409 + 1) % 10;
		}
		for (@Pc(56) int local56 = 1; local56 <= this.anInt410; local56++) {
			local12 += this.aLongArray3[(this.anInt409 + 10 - local56) % 10];
		}
		return local12 / (long) this.anInt410;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	@Override
	public int method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static230.method4022((long) arg0);
		@Pc(8) long local8 = (long) arg1 * 1000000L;
		this.aLong27 += this.method333();
		if (this.aLong27 < this.aLong28) {
			Static230.method4022((this.aLong28 - this.aLong27) / 1000000L);
			this.aLong29 += this.aLong28 - this.aLong27;
			this.aLong27 += this.aLong28 - this.aLong27;
			this.aLong28 += local8;
			return 1;
		}
		@Pc(33) int local33 = 0;
		do {
			this.aLong28 += local8;
			local33++;
		} while (local33 < 10 && this.aLong27 > this.aLong28);
		if (this.aLong27 > this.aLong28) {
			this.aLong28 = this.aLong27;
		}
		return local33;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	@Override
	public void method325() {
		if (this.aLong28 > this.aLong27) {
			this.aLong27 += this.aLong28 - this.aLong27;
		}
		this.aLong29 = 0L;
	}
}
