import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class159_Sub3 extends Class159 {

	@OriginalMember(owner = "client!vu", name = "i", descriptor = "J")
	private long aLong218 = 0L;

	@OriginalMember(owner = "client!vu", name = "k", descriptor = "J")
	private long aLong220 = 0L;

	@OriginalMember(owner = "client!vu", name = "m", descriptor = "I")
	private int anInt7415 = 1;

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "J")
	private long aLong219 = 0L;

	@OriginalMember(owner = "client!vu", name = "l", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	private int anInt7416 = 0;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5789(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong218 += this.method5793();
		if (this.aLong219 > this.aLong218) {
			Static135.method2458((this.aLong219 - this.aLong218) / 1000000L);
			this.aLong220 += this.aLong219 - this.aLong218;
			this.aLong218 += this.aLong219 - this.aLong218;
			this.aLong219 += local4;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			this.aLong219 += local4;
			local69++;
		} while (local69 < 10 && this.aLong219 < this.aLong218);
		if (this.aLong218 > this.aLong219) {
			this.aLong219 = this.aLong218;
		}
		return local69;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)J")
	@Override
	public long method5791() {
		return this.aLong218;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)J")
	private long method5793() {
		@Pc(4) long local4 = Static150.method2672() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong220;
		this.aLong220 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray8[this.anInt7416] = local10;
			if (this.anInt7415 < 10) {
				this.anInt7415++;
			}
			this.anInt7416 = (this.anInt7416 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt7415; local56++) {
			local49 += this.aLongArray8[(this.anInt7416 + 10 - local56) % 10];
		}
		return local49 / (long) this.anInt7415;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
	@Override
	public void method5790() {
		if (this.aLong218 < this.aLong219) {
			this.aLong218 += this.aLong219 - this.aLong218;
		}
		this.aLong220 = 0L;
	}
}
