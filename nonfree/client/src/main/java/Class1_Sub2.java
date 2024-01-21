import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	private int anInt2966;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "[J")
	private final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
	private int anInt2963 = 1;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	private int anInt2964 = 0;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	private int anInt2969 = 256;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "J")
	private long aLong108 = Static177.method2758();

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class1_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray10[local22] = this.aLong108;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	@Override
	public void method2037() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray10[local3] = 0L;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
	@Override
	public int method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anInt2963;
		this.anInt2963 = 1;
		@Pc(14) int local14 = this.anInt2969;
		this.anInt2969 = 300;
		this.aLong108 = Static177.method2758();
		if (this.aLongArray10[this.anInt2966] == 0L) {
			this.anInt2963 = local4;
			this.anInt2969 = local14;
		} else if (this.aLongArray10[this.anInt2966] < this.aLong108) {
			this.anInt2969 = (int) ((long) (arg1 * 2560) / (this.aLong108 - this.aLongArray10[this.anInt2966]));
		}
		if (this.anInt2969 < 25) {
			this.anInt2969 = 25;
		}
		if (this.anInt2969 > 256) {
			this.anInt2969 = 256;
			this.anInt2963 = (int) ((long) arg1 - (this.aLong108 - this.aLongArray10[this.anInt2966]) / 10L);
		}
		if (arg1 < this.anInt2963) {
			this.anInt2963 = arg1;
		}
		this.aLongArray10[this.anInt2966] = this.aLong108;
		this.anInt2966 = (this.anInt2966 + 1) % 10;
		@Pc(131) int local131;
		if (this.anInt2963 > 1) {
			for (local131 = 0; local131 < 10; local131++) {
				if (this.aLongArray10[local131] != 0L) {
					this.aLongArray10[local131] += this.anInt2963;
				}
			}
		}
		local131 = 0;
		if (this.anInt2963 < arg0) {
			this.anInt2963 = arg0;
		}
		Static176.method2744((long) this.anInt2963);
		while (this.anInt2964 < 256) {
			local131++;
			this.anInt2964 += this.anInt2969;
		}
		this.anInt2964 &= 0xFF;
		return local131;
	}
}
