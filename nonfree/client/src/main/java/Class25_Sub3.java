import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "J")
	private long aLong205 = 0L;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	private int anInt5708 = 1;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "I")
	private int anInt5709 = 0;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "[J")
	private long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	public Class25_Sub3() {
		this.aLong203 = System.nanoTime();
		this.aLong204 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
	@Override
	public void method4579() {
		if (this.aLong204 > this.aLong203) {
			this.aLong203 += this.aLong204 - this.aLong203;
		}
		this.aLong205 = 0L;
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)J")
	private long method4582() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong205;
		@Pc(9) long local9 = 0L;
		this.aLong205 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt5709] = local7;
			this.anInt5709 = (this.anInt5709 + 1) % 10;
			if (this.anInt5708 < 1) {
				this.anInt5708++;
			}
		}
		for (@Pc(49) int local49 = 1; local49 <= this.anInt5708; local49++) {
			local9 += this.aLongArray12[(this.anInt5709 + 10 - local49) % 10];
		}
		return local9 / (long) this.anInt5708;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)I")
	@Override
	public int method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static193.method3169((long) arg0);
		this.aLong203 += this.method4582();
		@Pc(16) long local16 = (long) arg1 * 1000000L;
		if (this.aLong204 > this.aLong203) {
			Static193.method3169((this.aLong204 - this.aLong203) / 1000000L);
			this.aLong205 += this.aLong204 - this.aLong203;
			this.aLong203 += this.aLong204 - this.aLong203;
			this.aLong204 += local16;
			return 1;
		}
		@Pc(73) int local73 = 0;
		do {
			local73++;
			this.aLong204 += local16;
		} while (local73 < 10 && this.aLong203 > this.aLong204);
		if (this.aLong203 > this.aLong204) {
			this.aLong204 = this.aLong203;
		}
		return local73;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)J")
	@Override
	public long method4580() {
		return this.aLong203;
	}
}
