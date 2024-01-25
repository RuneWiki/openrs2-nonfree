import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class99_Sub3 extends Class99 {

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "J")
	private long aLong224 = 0L;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "J")
	private long aLong225 = 0L;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[J")
	private final long[] aLongArray41 = new long[10];

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	private int anInt8101 = 0;

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
	private int anInt8102 = 1;

	@OriginalMember(owner = "client!rk", name = "j", descriptor = "J")
	private long aLong226 = 0L;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class99_Sub3() {
		this.aLong224 = System.nanoTime();
		this.aLong225 = System.nanoTime();
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)J")
	@Override
	protected long method6865() {
		this.aLong224 += this.method6870();
		return this.aLong224 < this.aLong225 ? (this.aLong225 - this.aLong224) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
	@Override
	public void method6863() {
		this.aLong226 = 0L;
		if (this.aLong225 > this.aLong224) {
			this.aLong224 += this.aLong225 - this.aLong224;
		}
	}

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "(B)J")
	private long method6870() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong226;
		this.aLong226 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray41[this.anInt8101] = local6;
			this.anInt8101 = (this.anInt8101 + 1) % 10;
			if (this.anInt8102 < 1) {
				this.anInt8102++;
			}
		}
		@Pc(43) long local43 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt8102; local53++) {
			local43 += this.aLongArray41[(this.anInt8101 + 10 - local53) % 10];
		}
		return local43 / (long) this.anInt8102;
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)J")
	@Override
	public long method6869() {
		return this.aLong224;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6866(@OriginalArg(0) long arg0) {
		if (this.aLong225 > this.aLong224) {
			this.aLong226 += this.aLong225 - this.aLong224;
			this.aLong224 += this.aLong225 - this.aLong224;
			this.aLong225 += arg0;
			return 1;
		}
		@Pc(43) int local43 = 0;
		do {
			this.aLong225 += arg0;
			local43++;
		} while (local43 < 10 && this.aLong225 < this.aLong224);
		if (this.aLong225 < this.aLong224) {
			this.aLong225 = this.aLong224;
		}
		return local43;
	}
}
