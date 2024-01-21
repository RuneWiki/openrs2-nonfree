import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class55_Sub1 extends Class55 {

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
	private int anInt2097;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
	private int anInt2108;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
	private int anInt2109;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class55_Sub1() {
		this.method2208();
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	@Override
	public void method2208() {
		this.anInt2108 = 1;
		this.anInt2109 = 0;
		this.anInt2096 = 256;
		this.aLong104 = Static23.method431();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray5[local24] = this.aLong104;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
	@Override
	public int method2211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt2096;
		this.anInt2096 = 300;
		@Pc(14) int local14 = this.anInt2108;
		this.anInt2108 = 1;
		this.aLong104 = Static23.method431();
		if (this.aLongArray5[this.anInt2097] == 0L) {
			this.anInt2096 = local4;
			this.anInt2108 = local14;
		} else if (this.aLong104 > this.aLongArray5[this.anInt2097]) {
			this.anInt2096 = (int) ((long) (arg1 * 2560) / (this.aLong104 - this.aLongArray5[this.anInt2097]));
		}
		if (this.anInt2096 < 25) {
			this.anInt2096 = 25;
		}
		if (this.anInt2096 > 256) {
			this.anInt2096 = 256;
			this.anInt2108 = (int) ((long) arg1 - (this.aLong104 - this.aLongArray5[this.anInt2097]) / 10L);
		}
		if (arg1 < this.anInt2108) {
			this.anInt2108 = arg1;
		}
		this.aLongArray5[this.anInt2097] = this.aLong104;
		this.anInt2097 = (this.anInt2097 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt2108 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray5[local136] != 0L) {
					this.aLongArray5[local136] += this.anInt2108;
				}
			}
		}
		if (this.anInt2108 < arg0) {
			this.anInt2108 = arg0;
		}
		Static125.method2177((long) this.anInt2108);
		local136 = 0;
		while (this.anInt2109 < 256) {
			local136++;
			this.anInt2109 += this.anInt2096;
		}
		this.anInt2109 &= 0xFF;
		return local136;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	@Override
	public void method2209() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray5[local7] = 0L;
		}
	}
}
