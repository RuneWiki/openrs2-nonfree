import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	private int anInt2565;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
	private int anInt2569;

	@OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
	private int anInt2574;

	@OriginalMember(owner = "client!ra", name = "G", descriptor = "J")
	private long aLong82;

	@OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class14_Sub2() {
		this.method1810();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)I")
	@Override
	public int method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anInt2577;
		this.anInt2577 = 300;
		@Pc(22) int local22 = this.anInt2565;
		this.anInt2565 = 1;
		this.aLong82 = Static124.method2079();
		if (this.aLongArray5[this.anInt2574] == 0L) {
			this.anInt2565 = local22;
			this.anInt2577 = local8;
		} else if (this.aLong82 > this.aLongArray5[this.anInt2574]) {
			this.anInt2577 = (int) ((long) (arg1 * 2560) / (this.aLong82 - this.aLongArray5[this.anInt2574]));
		}
		if (this.anInt2577 < 25) {
			this.anInt2577 = 25;
		}
		if (this.anInt2577 > 256) {
			this.anInt2577 = 256;
			this.anInt2565 = (int) ((long) arg1 - (this.aLong82 - this.aLongArray5[this.anInt2574]) / 10L);
		}
		if (this.anInt2565 > arg1) {
			this.anInt2565 = arg1;
		}
		this.aLongArray5[this.anInt2574] = this.aLong82;
		this.anInt2574 = (this.anInt2574 + 1) % 10;
		@Pc(135) int local135;
		if (this.anInt2565 > 1) {
			for (local135 = 0; local135 < 10; local135++) {
				if (this.aLongArray5[local135] != 0L) {
					this.aLongArray5[local135] -= -((long) this.anInt2565);
				}
			}
		}
		local135 = 0;
		if (this.anInt2565 < arg0) {
			this.anInt2565 = arg0;
		}
		Static96.method1616((long) this.anInt2565);
		while (this.anInt2569 < 256) {
			this.anInt2569 += this.anInt2577;
			local135++;
		}
		this.anInt2569 &= 0xFF;
		return local135;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V")
	@Override
	public void method1810() {
		this.anInt2569 = 0;
		this.anInt2565 = 1;
		this.anInt2577 = 256;
		this.aLong82 = Static124.method2079();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray5[local24] = this.aLong82;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	@Override
	public void method1809() {
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			this.aLongArray5[local5] = 0L;
		}
	}
}
