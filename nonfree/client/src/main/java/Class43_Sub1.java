import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "J")
	private long aLong36 = 0L;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "J")
	private long aLong37 = 0L;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
	private int anInt1185 = 0;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "J")
	private long aLong38 = 0L;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "I")
	private int anInt1186 = 1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class43_Sub1() {
		this.aLong37 = System.nanoTime();
		this.aLong36 = System.nanoTime();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	@Override
	public void method3556() {
		if (this.aLong37 < this.aLong36) {
			this.aLong37 += this.aLong36 - this.aLong37;
		}
		this.aLong38 = 0L;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)J")
	private long method1184() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong38;
		this.aLong38 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray1[this.anInt1185] = local12;
			if (this.anInt1186 < 1) {
				this.anInt1186++;
			}
			this.anInt1185 = (this.anInt1185 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt1186; local58++) {
			local56 += this.aLongArray1[(this.anInt1185 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt1186;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)J")
	@Override
	protected long method3561() {
		this.aLong37 += this.method1184();
		return this.aLong37 >= this.aLong36 ? 0L : (this.aLong36 - this.aLong37) / 1000000L;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)I")
	@Override
	protected int method3558(@OriginalArg(0) long arg0) {
		if (this.aLong37 < this.aLong36) {
			this.aLong38 += this.aLong36 - this.aLong37;
			this.aLong37 += this.aLong36 - this.aLong37;
			this.aLong36 += arg0;
			return 1;
		}
		@Pc(17) int local17 = 0;
		do {
			local17++;
			this.aLong36 += arg0;
		} while (local17 < 10 && this.aLong36 < this.aLong37);
		if (this.aLong37 > this.aLong36) {
			this.aLong36 = this.aLong37;
		}
		return local17;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)J")
	@Override
	public long method3557() {
		return this.aLong37;
	}
}
