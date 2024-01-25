import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	private int anInt2101 = 0;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "I")
	private int anInt2102 = 1;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "J")
	private long aLong79 = 0L;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "J")
	private long aLong78 = 0L;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "J")
	private long aLong80 = 0L;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)J")
	@Override
	public long method5399() {
		return this.aLong78;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	@Override
	public void method5394() {
		if (this.aLong79 > this.aLong78) {
			this.aLong78 += this.aLong79 - this.aLong78;
		}
		this.aLong80 = 0L;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5397(@OriginalArg(0) int arg0) {
		@Pc(9) long local9 = (long) arg0 * 1000000L;
		this.aLong78 += this.method1699();
		if (this.aLong79 > this.aLong78) {
			Static134.method2241((this.aLong79 - this.aLong78) / 1000000L);
			this.aLong80 += this.aLong79 - this.aLong78;
			this.aLong78 += this.aLong79 - this.aLong78;
			this.aLong79 += local9;
			return 1;
		}
		@Pc(29) int local29 = 0;
		do {
			this.aLong79 += local9;
			local29++;
		} while (local29 < 10 && this.aLong79 < this.aLong78);
		if (this.aLong79 < this.aLong78) {
			this.aLong79 = this.aLong78;
		}
		return local29;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)J")
	private long method1699() {
		@Pc(4) long local4 = Static53.method898() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong80;
		this.aLong80 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt2101] = local10;
			if (this.anInt2102 < 10) {
				this.anInt2102++;
			}
			this.anInt2101 = (this.anInt2101 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt2102; local51++) {
			local49 += this.aLongArray4[(this.anInt2101 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt2102;
	}
}
