import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
	private int anInt4107;

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "[J")
	private long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
	private int anInt4106 = 1;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
	private int anInt4104 = 256;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	private int anInt4110 = 0;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "J")
	private long aLong157 = Static179.method2941();

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class92_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray8[local22] = this.aLong157;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)I")
	@Override
	public int method3384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt4104;
		this.anInt4104 = 300;
		@Pc(14) int local14 = this.anInt4106;
		this.anInt4106 = 1;
		this.aLong157 = Static179.method2941();
		if (this.aLongArray8[this.anInt4107] == 0L) {
			this.anInt4106 = local14;
			this.anInt4104 = local8;
		} else if (this.aLong157 > this.aLongArray8[this.anInt4107]) {
			this.anInt4104 = (int) ((long) (arg0 * 2560) / (this.aLong157 - this.aLongArray8[this.anInt4107]));
		}
		if (this.anInt4104 < 25) {
			this.anInt4104 = 25;
		}
		if (this.anInt4104 > 256) {
			this.anInt4104 = 256;
			this.anInt4106 = (int) ((long) arg0 - (this.aLong157 - this.aLongArray8[this.anInt4107]) / 10L);
		}
		if (this.anInt4106 > arg0) {
			this.anInt4106 = arg0;
		}
		this.aLongArray8[this.anInt4107] = this.aLong157;
		this.anInt4107 = (this.anInt4107 + 1) % 10;
		@Pc(130) int local130;
		if (this.anInt4106 > 1) {
			for (local130 = 0; local130 < 10; local130++) {
				if (this.aLongArray8[local130] != 0L) {
					this.aLongArray8[local130] += this.anInt4106;
				}
			}
		}
		local130 = 0;
		if (arg1 > this.anInt4106) {
			this.anInt4106 = arg1;
		}
		Static204.method3250((long) this.anInt4106);
		while (this.anInt4110 < 256) {
			this.anInt4110 += this.anInt4104;
			local130++;
		}
		this.anInt4110 &= 0xFF;
		return local130;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	@Override
	public void method3385() {
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			this.aLongArray8[local11] = 0L;
		}
	}
}
