import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "J")
	private long aLong8;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "I")
	private int anInt307;

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
	private int anInt308;

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	public Class7_Sub1() {
		this.method1657();
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
	@Override
	public void method1655() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray5[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	@Override
	public void method1657() {
		this.anInt297 = 0;
		this.anInt307 = 256;
		this.anInt300 = 1;
		this.aLong8 = Static82.method1291();
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			this.aLongArray5[local20] = this.aLong8;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI)I")
	@Override
	public int method1652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt307;
		@Pc(17) int local17 = this.anInt300;
		this.anInt307 = 300;
		this.anInt300 = 1;
		this.aLong8 = Static82.method1291();
		if (this.aLongArray5[this.anInt308] == 0L) {
			this.anInt300 = local17;
			this.anInt307 = local14;
		} else if (this.aLong8 > this.aLongArray5[this.anInt308]) {
			this.anInt307 = (int) ((long) (arg1 * 2560) / (this.aLong8 - this.aLongArray5[this.anInt308]));
		}
		if (this.anInt307 < 25) {
			this.anInt307 = 25;
		}
		if (this.anInt307 > 256) {
			this.anInt307 = 256;
			this.anInt300 = (int) ((long) arg1 - (this.aLong8 - this.aLongArray5[this.anInt308]) / 10L);
		}
		if (this.anInt300 > arg1) {
			this.anInt300 = arg1;
		}
		this.aLongArray5[this.anInt308] = this.aLong8;
		this.anInt308 = (this.anInt308 + 1) % 10;
		@Pc(143) int local143;
		if (this.anInt300 > 1) {
			for (local143 = 0; local143 < 10; local143++) {
				if (this.aLongArray5[local143] != 0L) {
					this.aLongArray5[local143] += this.anInt300;
				}
			}
		}
		if (this.anInt300 < arg0) {
			this.anInt300 = arg0;
		}
		Static104.method1701((long) this.anInt300);
		local143 = 0;
		while (this.anInt297 < 256) {
			local143++;
			this.anInt297 += this.anInt307;
		}
		this.anInt297 &= 0xFF;
		return local143;
	}
}
