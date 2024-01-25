import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "J")
	private long aLong144 = 0L;

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
	private int anInt4129 = 1;

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "J")
	private long aLong146 = 0L;

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
	private int anInt4130 = 0;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	@Override
	public void method5343() {
		if (this.aLong144 > this.aLong145) {
			this.aLong145 += this.aLong144 - this.aLong145;
		}
		this.aLong146 = 0L;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)J")
	@Override
	public long method5345() {
		return this.aLong145;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)J")
	private long method3475() {
		@Pc(4) long local4 = Static274.method4763() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong146;
		this.aLong146 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray3[this.anInt4130] = local9;
			this.anInt4130 = (this.anInt4130 + 1) % 10;
			if (this.anInt4129 < 10) {
				this.anInt4129++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt4129; local52++) {
			local50 += this.aLongArray3[(this.anInt4130 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt4129;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)I")
	@Override
	public int method5342(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong145 += this.method3475();
		if (this.aLong145 < this.aLong144) {
			Static270.method5481((this.aLong144 - this.aLong145) / 1000000L);
			this.aLong146 += this.aLong144 - this.aLong145;
			this.aLong145 += this.aLong144 - this.aLong145;
			this.aLong144 += local4;
			return 1;
		}
		@Pc(68) int local68 = 0;
		do {
			local68++;
			this.aLong144 += local4;
		} while (local68 < 10 && this.aLong145 > this.aLong144);
		if (this.aLong145 > this.aLong144) {
			this.aLong144 = this.aLong145;
		}
		return local68;
	}
}
