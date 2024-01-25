import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "J")
	private long aLong26 = 0L;

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "J")
	private long aLong24 = 0L;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "J")
	private long aLong25 = 0L;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
	private int anInt707 = 0;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
	private int anInt708 = 1;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)I")
	@Override
	public int method4247(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong24 += this.method610();
		if (this.aLong25 > this.aLong24) {
			Static358.method2028((this.aLong25 - this.aLong24) / 1000000L);
			this.aLong26 += this.aLong25 - this.aLong24;
			this.aLong24 += this.aLong25 - this.aLong24;
			this.aLong25 += local4;
			return 1;
		}
		@Pc(64) int local64 = 0;
		do {
			local64++;
			this.aLong25 += local4;
		} while (local64 < 10 && this.aLong25 < this.aLong24);
		if (this.aLong25 < this.aLong24) {
			this.aLong25 = this.aLong24;
		}
		return local64;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)J")
	private long method610() {
		@Pc(4) long local4 = Static39.method699() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong26;
		this.aLong26 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray2[this.anInt707] = local10;
			this.anInt707 = (this.anInt707 + 1) % 10;
			if (this.anInt708 < 10) {
				this.anInt708++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt708; local59++) {
			local57 += this.aLongArray2[(this.anInt707 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt708;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)J")
	@Override
	public long method4246() {
		return this.aLong24;
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
	@Override
	public void method4249() {
		if (this.aLong24 < this.aLong25) {
			this.aLong24 += this.aLong25 - this.aLong24;
		}
		this.aLong26 = 0L;
	}
}
