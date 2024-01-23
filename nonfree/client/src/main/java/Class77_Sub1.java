import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
	private int anInt2823 = 1;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "J")
	private long aLong106 = 0L;

	@OriginalMember(owner = "client!jg", name = "g", descriptor = "J")
	private long aLong107 = 0L;

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "[J")
	private long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "J")
	private long aLong108 = 0L;

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
	private int anInt2824 = 0;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I")
	@Override
	public int method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static48.method934((long) arg0);
		@Pc(17) long local17 = (long) arg1 * 1000000L;
		@Pc(21) long local21 = this.method2183();
		this.aLong108 += local21;
		if (this.aLong108 >= this.aLong106) {
			@Pc(39) int local39 = 0;
			do {
				this.aLong106 += local17;
				local39++;
			} while (local39 < 10 && this.aLong108 > this.aLong106);
			if (this.aLong108 > this.aLong106) {
				this.aLong106 = this.aLong108;
			}
			return local39;
		}
		while (this.aLong106 > this.aLong108) {
			@Pc(92) long local92 = this.aLong106 - this.aLong108;
			if (local21 < local92) {
				local92 = local21;
			}
			if (local92 < 1000000L) {
				local92 = 1000000L;
			}
			Static48.method934((local92 + 500000L) / 1000000L);
			local21 = this.method2183();
			this.aLong108 += local21;
		}
		this.aLong106 += local17;
		return 1;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	@Override
	public void method4027() {
		this.aLong107 = 0L;
		if (this.aLong108 < this.aLong106) {
			this.aLong108 += this.aLong106 - this.aLong108;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)J")
	@Override
	public long method4029() {
		return this.aLong108;
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)J")
	private long method2183() {
		@Pc(4) long local4 = Static294.method4413() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong107;
		this.aLong107 = local4;
		@Pc(15) long local15 = 0L;
		if (local10 > 0L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt2824] = local10;
			this.anInt2824 = (this.anInt2824 + 1) % 10;
			if (this.anInt2823 < 10) {
				this.anInt2823++;
			}
		}
		for (@Pc(50) int local50 = 1; local50 <= this.anInt2823; local50++) {
			local15 += this.aLongArray4[(this.anInt2824 + 10 - local50) % 10];
		}
		return local15 / (long) this.anInt2823;
	}
}
