import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class66_Sub2 extends Class66 {

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "J")
	private long aLong188 = 0L;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "J")
	private long aLong187 = 0L;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
	private int anInt6241 = 0;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
	private int anInt6240 = 1;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "J")
	private long aLong189 = 0L;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)J")
	@Override
	public long method5844() {
		return this.aLong188;
	}

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)V")
	@Override
	public void method5851() {
		if (this.aLong188 < this.aLong189) {
			this.aLong188 += this.aLong189 - this.aLong188;
		}
		this.aLong187 = 0L;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)J")
	private long method5431() {
		@Pc(4) long local4 = Static51.method1197() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong187;
		this.aLong187 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray6[this.anInt6241] = local10;
			this.anInt6241 = (this.anInt6241 + 1) % 10;
			if (this.anInt6240 < 10) {
				this.anInt6240++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt6240; local58++) {
			local51 += this.aLongArray6[(this.anInt6241 + 10 - local58) % 10];
		}
		return local51 / (long) this.anInt6240;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)I")
	@Override
	public int method5847(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong188 += this.method5431();
		if (this.aLong188 < this.aLong189) {
			Static102.method2276((this.aLong189 - this.aLong188) / 1000000L);
			this.aLong187 += this.aLong189 - this.aLong188;
			this.aLong188 += this.aLong189 - this.aLong188;
			this.aLong189 += local4;
			return 1;
		}
		@Pc(65) int local65 = 0;
		do {
			local65++;
			this.aLong189 += local4;
		} while (local65 < 10 && this.aLong188 > this.aLong189);
		if (this.aLong188 > this.aLong189) {
			this.aLong189 = this.aLong188;
		}
		return local65;
	}
}
