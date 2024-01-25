import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "J")
	private long aLong37 = 0L;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "J")
	private long aLong36 = 0L;

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "J")
	private long aLong38 = 0L;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	private int anInt1164 = 0;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
	private int anInt1165 = 1;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	private Class67_Sub1() {
		this.aLong37 = System.nanoTime();
		this.aLong36 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(B)J")
	private long method1164() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong38;
		this.aLong38 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray2[this.anInt1164] = local6;
			this.anInt1164 = (this.anInt1164 + 1) % 10;
			if (this.anInt1165 < 1) {
				this.anInt1165++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(66) int local66 = 1; local66 <= this.anInt1165; local66++) {
			local55 += this.aLongArray2[(this.anInt1164 + 10 - local66) % 10];
		}
		return local55 / (long) this.anInt1165;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)J")
	@Override
	protected long method5457() {
		this.aLong37 += this.method1164();
		return this.aLong36 > this.aLong37 ? (this.aLong36 - this.aLong37) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)J")
	@Override
	public long method5453() {
		return this.aLong37;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method5460(@OriginalArg(1) long arg0) {
		if (this.aLong36 > this.aLong37) {
			this.aLong38 += this.aLong36 - this.aLong37;
			this.aLong37 += this.aLong36 - this.aLong37;
			this.aLong36 += arg0;
			return 1;
		}
		@Pc(18) int local18 = 0;
		do {
			this.aLong36 += arg0;
			local18++;
		} while (local18 < 10 && this.aLong37 > this.aLong36);
		if (this.aLong37 > this.aLong36) {
			this.aLong36 = this.aLong37;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	@Override
	public void method5454() {
		if (this.aLong36 > this.aLong37) {
			this.aLong37 += this.aLong36 - this.aLong37;
		}
		this.aLong38 = 0L;
	}
}
