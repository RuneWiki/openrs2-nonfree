import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "[J")
	private long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
	private int anInt151 = 1;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	private int anInt155 = 256;

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	private int anInt156 = 0;

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "J")
	private long aLong5 = Static111.method1911();

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class4_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong5;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	@Override
	public void method1603() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray1[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)I")
	@Override
	public int method1605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt151;
		this.anInt151 = 1;
		@Pc(10) int local10 = this.anInt155;
		this.anInt155 = 300;
		this.aLong5 = Static111.method1911();
		if (this.aLongArray1[this.anInt152] == 0L) {
			this.anInt151 = local4;
			this.anInt155 = local10;
		} else if (this.aLong5 > this.aLongArray1[this.anInt152]) {
			this.anInt155 = (int) ((long) (arg0 * 2560) / (this.aLong5 - this.aLongArray1[this.anInt152]));
		}
		if (this.anInt155 < 25) {
			this.anInt155 = 25;
		}
		if (this.anInt155 > 256) {
			this.anInt155 = 256;
			this.anInt151 = (int) ((long) arg0 - (this.aLong5 - this.aLongArray1[this.anInt152]) / 10L);
		}
		if (arg0 < this.anInt151) {
			this.anInt151 = arg0;
		}
		this.aLongArray1[this.anInt152] = this.aLong5;
		this.anInt152 = (this.anInt152 + 1) % 10;
		@Pc(130) int local130;
		if (this.anInt151 > 1) {
			for (local130 = 0; local130 < 10; local130++) {
				if (this.aLongArray1[local130] != 0L) {
					this.aLongArray1[local130] += this.anInt151;
				}
			}
		}
		if (this.anInt151 < arg1) {
			this.anInt151 = arg1;
		}
		Static156.method2805((long) this.anInt151);
		local130 = 0;
		while (this.anInt156 < 256) {
			local130++;
			this.anInt156 += this.anInt155;
		}
		this.anInt156 &= 0xFF;
		return local130;
	}
}
