import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "J")
	private long aLong62 = 0L;

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "J")
	private long aLong60 = 0L;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "J")
	private long aLong61 = 0L;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	private int anInt2302 = 0;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
	private int anInt2303 = 1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)J")
	@Override
	public long method6076() {
		return this.aLong60;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)I")
	@Override
	public int method6075(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong60 += this.method1668();
		if (this.aLong62 > this.aLong60) {
			Static289.method4249((this.aLong62 - this.aLong60) / 1000000L);
			this.aLong61 += this.aLong62 - this.aLong60;
			this.aLong60 += this.aLong62 - this.aLong60;
			this.aLong62 += local10;
			return 1;
		}
		@Pc(26) int local26 = 0;
		do {
			local26++;
			this.aLong62 += local10;
		} while (local26 < 10 && this.aLong60 > this.aLong62);
		if (this.aLong60 > this.aLong62) {
			this.aLong62 = this.aLong60;
		}
		return local26;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	@Override
	public void method6077() {
		if (this.aLong62 > this.aLong60) {
			this.aLong60 += this.aLong62 - this.aLong60;
		}
		this.aLong61 = 0L;
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)J")
	private long method1668() {
		@Pc(11) long local11 = Static250.method3737() * 1000000L;
		@Pc(17) long local17 = local11 - this.aLong61;
		this.aLong61 = local11;
		if (local17 > -5000000000L && local17 < 5000000000L) {
			this.aLongArray3[this.anInt2302] = local17;
			this.anInt2302 = (this.anInt2302 + 1) % 10;
			if (this.anInt2303 < 10) {
				this.anInt2303++;
			}
		}
		@Pc(58) long local58 = 0L;
		for (@Pc(60) int local60 = 1; local60 <= this.anInt2303; local60++) {
			local58 += this.aLongArray3[(this.anInt2302 + 10 - local60) % 10];
		}
		return local58 / (long) this.anInt2303;
	}
}
