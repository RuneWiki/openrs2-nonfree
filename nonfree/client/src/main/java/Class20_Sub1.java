import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
	private int anInt1095;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
	private int anInt1107 = 1;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
	private int anInt1104 = 256;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	private int anInt1100 = 0;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "J")
	private long aLong36 = Static190.method3141();

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
	public Class20_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray2[local22] = this.aLong36;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	@Override
	public void method1108() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray2[local3] = 0L;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I")
	@Override
	public int method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt1104;
		this.anInt1104 = 300;
		@Pc(14) int local14 = this.anInt1107;
		this.anInt1107 = 1;
		this.aLong36 = Static190.method3141();
		if (this.aLongArray2[this.anInt1095] == 0L) {
			this.anInt1104 = local8;
			this.anInt1107 = local14;
		} else if (this.aLongArray2[this.anInt1095] < this.aLong36) {
			this.anInt1104 = (int) ((long) (arg1 * 2560) / (this.aLong36 - this.aLongArray2[this.anInt1095]));
		}
		if (this.anInt1104 < 25) {
			this.anInt1104 = 25;
		}
		if (this.anInt1104 > 256) {
			this.anInt1104 = 256;
			this.anInt1107 = (int) ((long) arg1 - (this.aLong36 - this.aLongArray2[this.anInt1095]) / 10L);
		}
		if (arg1 < this.anInt1107) {
			this.anInt1107 = arg1;
		}
		this.aLongArray2[this.anInt1095] = this.aLong36;
		this.anInt1095 = (this.anInt1095 + 1) % 10;
		@Pc(130) int local130;
		if (this.anInt1107 > 1) {
			for (local130 = 0; local130 < 10; local130++) {
				if (this.aLongArray2[local130] != 0L) {
					this.aLongArray2[local130] += this.anInt1107;
				}
			}
		}
		local130 = 0;
		if (arg0 > this.anInt1107) {
			this.anInt1107 = arg0;
		}
		Static135.method2569((long) this.anInt1107);
		while (this.anInt1100 < 256) {
			this.anInt1100 += this.anInt1104;
			local130++;
		}
		this.anInt1100 &= 0xFF;
		return local130;
	}
}
