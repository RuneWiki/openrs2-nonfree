import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class10_Sub3 extends Class10 {

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "J")
	private long aLong152 = 0L;

	@OriginalMember(owner = "client!nk", name = "h", descriptor = "J")
	private long aLong151 = 0L;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
	private int anInt4255 = 0;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	private int anInt4254 = 1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)I")
	@Override
	public int method3935(@OriginalArg(1) int arg0) {
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		this.aLong153 += this.method3940();
		if (this.aLong152 > this.aLong153) {
			Static20.method408((this.aLong152 - this.aLong153) / 1000000L);
			this.aLong151 += this.aLong152 - this.aLong153;
			this.aLong153 += this.aLong152 - this.aLong153;
			this.aLong152 += local12;
			return 1;
		}
		@Pc(34) int local34 = 0;
		do {
			local34++;
			this.aLong152 += local12;
		} while (local34 < 10 && this.aLong153 > this.aLong152);
		if (this.aLong152 < this.aLong153) {
			this.aLong152 = this.aLong153;
		}
		return local34;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
	@Override
	public void method3939() {
		this.aLong151 = 0L;
		if (this.aLong152 > this.aLong153) {
			this.aLong153 += this.aLong152 - this.aLong153;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)J")
	private long method3940() {
		@Pc(4) long local4 = Static340.method5863() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong151;
		this.aLong151 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray6[this.anInt4255] = local9;
			this.anInt4255 = (this.anInt4255 + 1) % 10;
			if (this.anInt4254 < 10) {
				this.anInt4254++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt4254; local57++) {
			local48 += this.aLongArray6[(this.anInt4255 + 10 - local57) % 10];
		}
		return local48 / (long) this.anInt4254;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)J")
	@Override
	public long method3937() {
		return this.aLong153;
	}
}
