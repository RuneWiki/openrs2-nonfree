import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "I")
	private int anInt707;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	private int anInt708;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "J")
	private long aLong54;

	@OriginalMember(owner = "client!df", name = "x", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!df", name = "u", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class19_Sub1() {
		this.method1737();
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	@Override
	public void method1737() {
		this.anInt715 = 0;
		this.anInt708 = 256;
		this.anInt707 = 1;
		this.aLong54 = Static26.method596();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray2[local24] = this.aLong54;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	@Override
	public void method1734() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray2[local3] = 0L;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)I")
	@Override
	public int method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt708;
		@Pc(17) int local17 = this.anInt707;
		this.anInt707 = 1;
		this.anInt708 = 300;
		this.aLong54 = Static26.method596();
		if (this.aLongArray2[this.anInt706] == 0L) {
			this.anInt707 = local17;
			this.anInt708 = local14;
		} else if (this.aLongArray2[this.anInt706] < this.aLong54) {
			this.anInt708 = (int) ((long) (arg0 * 2560) / (this.aLong54 - this.aLongArray2[this.anInt706]));
		}
		if (this.anInt708 < 25) {
			this.anInt708 = 25;
		}
		if (this.anInt708 > 256) {
			this.anInt708 = 256;
			this.anInt707 = (int) ((long) arg0 - (this.aLong54 - this.aLongArray2[this.anInt706]) / 10L);
		}
		if (arg0 < this.anInt707) {
			this.anInt707 = arg0;
		}
		this.aLongArray2[this.anInt706] = this.aLong54;
		this.anInt706 = (this.anInt706 + 1) % 10;
		@Pc(132) int local132;
		if (this.anInt707 > 1) {
			for (local132 = 0; local132 < 10; local132++) {
				if (this.aLongArray2[local132] != 0L) {
					this.aLongArray2[local132] += this.anInt707;
				}
			}
		}
		if (this.anInt707 < arg1) {
			this.anInt707 = arg1;
		}
		Static53.method1782((long) this.anInt707);
		local132 = 0;
		while (this.anInt715 < 256) {
			local132++;
			this.anInt715 += this.anInt708;
		}
		this.anInt715 &= 0xFF;
		return local132;
	}
}
