import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	private int anInt2386;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "J")
	private long aLong76;

	@OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
	private int anInt2392;

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
	private int anInt2393;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
	private int anInt2396;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class7_Sub2() {
		this.method1653();
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	@Override
	public void method1651() {
		for (@Pc(14) int local14 = 0; local14 < 10; local14++) {
			this.aLongArray6[local14] = 0L;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)I")
	@Override
	public int method1654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt2396;
		this.anInt2396 = 300;
		@Pc(22) int local22 = this.anInt2393;
		this.anInt2393 = 1;
		this.aLong76 = System.currentTimeMillis();
		if (this.aLongArray6[this.anInt2392] == 0L) {
			this.anInt2393 = local22;
			this.anInt2396 = local16;
		} else if (this.aLong76 > this.aLongArray6[this.anInt2392]) {
			this.anInt2396 = (int) ((long) (arg1 * 2560) / (this.aLong76 - this.aLongArray6[this.anInt2392]));
		}
		if (this.anInt2396 < 25) {
			this.anInt2396 = 25;
		}
		if (this.anInt2396 > 256) {
			this.anInt2396 = 256;
			this.anInt2393 = (int) ((long) arg1 - (this.aLong76 - this.aLongArray6[this.anInt2392]) / 10L);
		}
		if (this.anInt2393 > arg1) {
			this.anInt2393 = arg1;
		}
		this.aLongArray6[this.anInt2392] = this.aLong76;
		this.anInt2392 = (this.anInt2392 + 1) % 10;
		@Pc(134) int local134;
		if (this.anInt2393 > 1) {
			for (local134 = 0; local134 < 10; local134++) {
				if (this.aLongArray6[local134] != 0L) {
					this.aLongArray6[local134] += this.anInt2393;
				}
			}
		}
		if (arg0 > this.anInt2393) {
			this.anInt2393 = arg0;
		}
		Static9.method179((long) this.anInt2393);
		local134 = 0;
		while (this.anInt2386 < 256) {
			this.anInt2386 += this.anInt2396;
			local134++;
		}
		this.anInt2386 &= 0xFF;
		return local134;
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(I)V")
	@Override
	public void method1653() {
		this.anInt2393 = 1;
		this.anInt2396 = 256;
		this.anInt2386 = 0;
		this.aLong76 = System.currentTimeMillis();
		for (@Pc(28) int local28 = 0; local28 < 10; local28++) {
			this.aLongArray6[local28] = this.aLong76;
		}
	}
}
