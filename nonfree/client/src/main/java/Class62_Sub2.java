import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "J")
	private long aLong110 = 0L;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
	private int anInt3404 = 1;

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "J")
	private long aLong111 = 0L;

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
	private int anInt3405 = 0;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
	@Override
	public void method3920() {
		if (this.aLong111 > this.aLong110) {
			this.aLong110 += this.aLong111 - this.aLong110;
		}
		this.aLong112 = 0L;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)I")
	@Override
	public int method3914(@OriginalArg(1) int arg0) {
		this.aLong110 += this.method3106();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong111 > this.aLong110) {
			Static190.method3690((this.aLong111 - this.aLong110) / 1000000L);
			this.aLong112 += this.aLong111 - this.aLong110;
			this.aLong110 += this.aLong111 - this.aLong110;
			this.aLong111 += local12;
			return 1;
		}
		@Pc(27) int local27 = 0;
		do {
			this.aLong111 += local12;
			local27++;
		} while (local27 < 10 && this.aLong111 < this.aLong110);
		if (this.aLong111 < this.aLong110) {
			this.aLong111 = this.aLong110;
		}
		return local27;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)J")
	@Override
	public long method3917() {
		return this.aLong110;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)J")
	private long method3106() {
		@Pc(4) long local4 = Static162.method3252() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong112;
		this.aLong112 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray4[this.anInt3405] = local10;
			this.anInt3405 = (this.anInt3405 + 1) % 10;
			if (this.anInt3404 < 10) {
				this.anInt3404++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt3404; local56++) {
			local49 += this.aLongArray4[(this.anInt3405 + 10 - local56) % 10];
		}
		return local49 / (long) this.anInt3404;
	}
}
