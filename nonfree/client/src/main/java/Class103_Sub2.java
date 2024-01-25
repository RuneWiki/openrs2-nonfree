import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!og", name = "f", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!og", name = "g", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!og", name = "j", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "I")
	private int anInt6746 = 1;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	private int anInt6747 = 0;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	public Class103_Sub2() {
		this.aLong199 = System.nanoTime();
		this.aLong198 = System.nanoTime();
	}

	@OriginalMember(owner = "client!og", name = "d", descriptor = "(I)J")
	@Override
	protected long method7413() {
		this.aLong199 += this.method5656();
		return this.aLong198 > this.aLong199 ? (this.aLong198 - this.aLong199) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method7412(@OriginalArg(1) long arg0) {
		if (this.aLong199 < this.aLong198) {
			this.aLong200 += this.aLong198 - this.aLong199;
			this.aLong199 += this.aLong198 - this.aLong199;
			this.aLong198 += arg0;
			return 1;
		}
		@Pc(18) int local18 = 0;
		do {
			local18++;
			this.aLong198 += arg0;
		} while (local18 < 10 && this.aLong199 > this.aLong198);
		if (this.aLong198 < this.aLong199) {
			this.aLong198 = this.aLong199;
		}
		return local18;
	}

	@OriginalMember(owner = "client!og", name = "e", descriptor = "(I)J")
	private long method5656() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong200;
		this.aLong200 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray5[this.anInt6747] = local7;
			if (this.anInt6746 < 1) {
				this.anInt6746++;
			}
			this.anInt6747 = (this.anInt6747 + 1) % 10;
		}
		@Pc(46) long local46 = 0L;
		for (@Pc(48) int local48 = 1; local48 <= this.anInt6746; local48++) {
			local46 += this.aLongArray5[(this.anInt6747 + 10 - local48) % 10];
		}
		return local46 / (long) this.anInt6746;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	@Override
	public void method7408() {
		this.aLong200 = 0L;
		if (this.aLong199 < this.aLong198) {
			this.aLong199 += this.aLong198 - this.aLong199;
		}
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(I)J")
	@Override
	public long method7410() {
		return this.aLong199;
	}
}
