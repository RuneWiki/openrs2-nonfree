import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "J")
	private long aLong26 = 0L;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	private int anInt781 = 1;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[J")
	private long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	private int anInt782 = 0;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "J")
	private long aLong27 = 0L;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "J")
	private long aLong28 = 0L;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)J")
	@Override
	public long method1357() {
		return this.aLong28;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	@Override
	public void method1352() {
		if (this.aLong28 < this.aLong26) {
			this.aLong28 += this.aLong26 - this.aLong28;
		}
		this.aLong27 = 0L;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZII)I")
	@Override
	public int method1355(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static162.method2645((long) arg1);
		this.aLong28 += this.method551();
		@Pc(24) long local24 = (long) arg0 * 1000000L;
		if (this.aLong26 > this.aLong28) {
			Static162.method2645((this.aLong26 - this.aLong28) / 1000000L);
			this.aLong27 += this.aLong26 - this.aLong28;
			this.aLong28 += this.aLong26 - this.aLong28;
			this.aLong26 += local24;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			local32++;
			this.aLong26 += local24;
		} while (local32 < 10 && this.aLong28 > this.aLong26);
		if (this.aLong26 < this.aLong28) {
			this.aLong26 = this.aLong28;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)J")
	private long method551() {
		@Pc(4) long local4 = Static71.method1143() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong27;
		@Pc(11) long local11 = 0L;
		this.aLong27 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray2[this.anInt782] = local9;
			if (this.anInt781 < 10) {
				this.anInt781++;
			}
			this.anInt782 = (this.anInt782 + 1) % 10;
		}
		for (@Pc(53) int local53 = 1; local53 <= this.anInt781; local53++) {
			local11 += this.aLongArray2[(this.anInt782 + 10 - local53) % 10];
		}
		return local11 / (long) this.anInt781;
	}
}
