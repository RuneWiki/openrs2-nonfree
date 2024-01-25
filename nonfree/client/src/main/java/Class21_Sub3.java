import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "J")
	private long aLong211 = 0L;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	private int anInt6793 = 0;

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[J")
	private final long[] aLongArray36 = new long[10];

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "J")
	private long aLong212 = 0L;

	@OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
	private int anInt6794 = 1;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
	public Class21_Sub3() {
		this.aLong211 = this.aLong210 = jagmisc.nanoTime();
		if (this.aLong210 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)J")
	@Override
	public long method5371() {
		return this.aLong210;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)I")
	@Override
	public int method5373(@OriginalArg(0) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong210 += this.method5374();
		if (this.aLong210 < this.aLong211) {
			Static140.method2004((this.aLong211 - this.aLong210) / 1000000L);
			this.aLong212 += this.aLong211 - this.aLong210;
			this.aLong210 += this.aLong211 - this.aLong210;
			this.aLong211 += local4;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			local31++;
			this.aLong211 += local4;
		} while (local31 < 10 && this.aLong211 < this.aLong210);
		if (this.aLong210 > this.aLong211) {
			this.aLong211 = this.aLong210;
		}
		return local31;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)J")
	private long method5374() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong212;
		this.aLong212 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray36[this.anInt6793] = local7;
			if (this.anInt6794 < 1) {
				this.anInt6794++;
			}
			this.anInt6793 = (this.anInt6793 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt6794; local56++) {
			local54 += this.aLongArray36[(this.anInt6793 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt6794;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	@Override
	public void method5369() {
		this.aLong212 = 0L;
		if (this.aLong211 > this.aLong210) {
			this.aLong210 += this.aLong211 - this.aLong210;
		}
	}
}
