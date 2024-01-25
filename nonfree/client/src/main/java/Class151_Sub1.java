import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class151_Sub1 extends Class151 {

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "J")
	private long aLong113 = 0L;

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
	private int anInt3890 = 0;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
	private int anInt3891 = 1;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "J")
	private long aLong114 = 0L;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class151_Sub1() {
		this.aLong112 = System.nanoTime();
		this.aLong113 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	@Override
	public void method6452() {
		this.aLong114 = 0L;
		if (this.aLong113 > this.aLong112) {
			this.aLong112 += this.aLong113 - this.aLong112;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)J")
	private long method3485() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong114;
		this.aLong114 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray8[this.anInt3890] = local7;
			this.anInt3890 = (this.anInt3890 + 1) % 10;
			if (this.anInt3891 < 1) {
				this.anInt3891++;
			}
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt3891; local50++) {
			local48 += this.aLongArray8[(this.anInt3890 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt3891;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)J")
	@Override
	protected long method6455() {
		this.aLong112 += this.method3485();
		return this.aLong113 > this.aLong112 ? (this.aLong113 - this.aLong112) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)J")
	@Override
	public long method6451() {
		return this.aLong112;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(JI)I")
	@Override
	protected int method6453(@OriginalArg(0) long arg0) {
		if (this.aLong112 < this.aLong113) {
			this.aLong114 += this.aLong113 - this.aLong112;
			this.aLong112 += this.aLong113 - this.aLong112;
			this.aLong113 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong113 += arg0;
		} while (local42 < 10 && this.aLong113 < this.aLong112);
		if (this.aLong112 > this.aLong113) {
			this.aLong113 = this.aLong112;
		}
		return local42;
	}
}
