import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
	private int anInt2715;

	@OriginalMember(owner = "client!ud", name = "K", descriptor = "J")
	private long aLong81;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
	private int anInt2721;

	@OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
	private int anInt2722;

	@OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
	private int anInt2723;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class27_Sub2() {
		this.method1924();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	@Override
	public void method1924() {
		this.anInt2723 = 0;
		this.anInt2722 = 256;
		this.anInt2721 = 1;
		this.aLong81 = Static66.method1158();
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			this.aLongArray6[local20] = this.aLong81;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	@Override
	public void method1923() {
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			this.aLongArray6[local11] = 0L;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
	@Override
	public int method1921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2721;
		this.anInt2721 = 1;
		@Pc(14) int local14 = this.anInt2722;
		this.anInt2722 = 300;
		this.aLong81 = Static66.method1158();
		if (this.aLongArray6[this.anInt2715] == 0L) {
			this.anInt2722 = local14;
			this.anInt2721 = local4;
		} else if (this.aLong81 > this.aLongArray6[this.anInt2715]) {
			this.anInt2722 = (int) ((long) (arg0 * 2560) / (this.aLong81 - this.aLongArray6[this.anInt2715]));
		}
		if (this.anInt2722 < 25) {
			this.anInt2722 = 25;
		}
		if (this.anInt2722 > 256) {
			this.anInt2722 = 256;
			this.anInt2721 = (int) ((long) arg0 - (this.aLong81 - this.aLongArray6[this.anInt2715]) / 10L);
		}
		if (this.anInt2721 > arg0) {
			this.anInt2721 = arg0;
		}
		this.aLongArray6[this.anInt2715] = this.aLong81;
		this.anInt2715 = (this.anInt2715 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt2721 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray6[local136] != 0L) {
					this.aLongArray6[local136] += this.anInt2721;
				}
			}
		}
		local136 = 0;
		if (this.anInt2721 < arg1) {
			this.anInt2721 = arg1;
		}
		Static68.method1173((long) this.anInt2721);
		while (this.anInt2723 < 256) {
			this.anInt2723 += this.anInt2722;
			local136++;
		}
		this.anInt2723 &= 0xFF;
		return local136;
	}
}
