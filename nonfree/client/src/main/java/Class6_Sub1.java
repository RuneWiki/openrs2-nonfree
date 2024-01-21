import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
	private int anInt2309;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
	private int anInt2317 = 1;

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
	private int anInt2314 = 256;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	private int anInt2306 = 0;

	@OriginalMember(owner = "client!ka", name = "D", descriptor = "J")
	private long aLong77 = Static104.method1634();

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class6_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray6[local22] = this.aLong77;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
	@Override
	public void method1719() {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			this.aLongArray6[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I")
	@Override
	public int method1721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt2314;
		@Pc(11) int local11 = this.anInt2317;
		this.anInt2314 = 300;
		this.anInt2317 = 1;
		this.aLong77 = Static104.method1634();
		if (this.aLongArray6[this.anInt2309] == 0L) {
			this.anInt2314 = local8;
			this.anInt2317 = local11;
		} else if (this.aLongArray6[this.anInt2309] < this.aLong77) {
			this.anInt2314 = (int) ((long) (arg1 * 2560) / (this.aLong77 - this.aLongArray6[this.anInt2309]));
		}
		if (this.anInt2314 < 25) {
			this.anInt2314 = 25;
		}
		if (this.anInt2314 > 256) {
			this.anInt2314 = 256;
			this.anInt2317 = (int) ((long) arg1 - (this.aLong77 - this.aLongArray6[this.anInt2309]) / 10L);
		}
		if (this.anInt2317 > arg1) {
			this.anInt2317 = arg1;
		}
		this.aLongArray6[this.anInt2309] = this.aLong77;
		this.anInt2309 = (this.anInt2309 + 1) % 10;
		@Pc(131) int local131;
		if (this.anInt2317 > 1) {
			for (local131 = 0; local131 < 10; local131++) {
				if (this.aLongArray6[local131] != 0L) {
					this.aLongArray6[local131] += this.anInt2317;
				}
			}
		}
		local131 = 0;
		if (arg0 > this.anInt2317) {
			this.anInt2317 = arg0;
		}
		Static117.method1813((long) this.anInt2317);
		while (this.anInt2306 < 256) {
			this.anInt2306 += this.anInt2314;
			local131++;
		}
		this.anInt2306 &= 0xFF;
		return local131;
	}
}
