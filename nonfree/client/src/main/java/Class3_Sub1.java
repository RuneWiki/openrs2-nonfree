import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "J")
	private long aLong1 = 0L;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt33 = 0;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "[J")
	private long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "J")
	private long aLong3 = 0L;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt32 = 1;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "J")
	private long aLong2 = 0L;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
	@Override
	public int method2842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) long local4 = (long) arg1 * 1000000L;
		Static122.method2061((long) arg0);
		this.aLong2 += this.method30();
		if (this.aLong2 < this.aLong1) {
			Static122.method2061((this.aLong1 - this.aLong2) / 1000000L);
			this.aLong3 += this.aLong1 - this.aLong2;
			this.aLong2 += this.aLong1 - this.aLong2;
			this.aLong1 += local4;
			return 1;
		}
		@Pc(70) int local70 = 0;
		do {
			this.aLong1 += local4;
			local70++;
		} while (local70 < 10 && this.aLong2 > this.aLong1);
		if (this.aLong2 > this.aLong1) {
			this.aLong1 = this.aLong2;
		}
		return local70;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)J")
	private long method30() {
		@Pc(10) long local10 = Static133.method2163() * 1000000L;
		@Pc(15) long local15 = local10 - this.aLong3;
		this.aLong3 = local10;
		@Pc(20) long local20 = 0L;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray3[this.anInt33] = local15;
			if (this.anInt32 < 10) {
				this.anInt32++;
			}
			this.anInt33 = (this.anInt33 + 1) % 10;
		}
		for (@Pc(56) int local56 = 1; local56 <= this.anInt32; local56++) {
			local20 += this.aLongArray3[(this.anInt33 + 10 - local56) % 10];
		}
		return local20 / (long) this.anInt32;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)J")
	@Override
	public long method2844() {
		return this.aLong2;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
	@Override
	public void method2841() {
		this.aLong3 = 0L;
		if (this.aLong1 > this.aLong2) {
			this.aLong2 += this.aLong1 - this.aLong2;
		}
	}
}
