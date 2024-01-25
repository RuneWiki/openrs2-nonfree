import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "J")
	private long aLong111 = 0L;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "J")
	private long aLong113 = 0L;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	private int anInt3591 = 0;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	private int anInt3590 = 1;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class50_Sub1() {
		this.aLong112 = this.aLong111 = jagmisc.nanoTime();
		if (this.aLong111 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	@Override
	public void method5053() {
		if (this.aLong112 > this.aLong111) {
			this.aLong111 += this.aLong112 - this.aLong111;
		}
		this.aLong113 = 0L;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)J")
	private long method2933() {
		@Pc(7) long local7 = jagmisc.nanoTime();
		@Pc(12) long local12 = local7 - this.aLong113;
		this.aLong113 = local7;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray5[this.anInt3591] = local12;
			this.anInt3591 = (this.anInt3591 + 1) % 10;
			if (this.anInt3590 < 1) {
				this.anInt3590++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt3590; local53++) {
			local51 += this.aLongArray5[(this.anInt3591 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt3590;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)J")
	@Override
	public long method5057() {
		return this.aLong111;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I")
	@Override
	public int method5055(@OriginalArg(1) int arg0) {
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		this.aLong111 += this.method2933();
		if (this.aLong112 > this.aLong111) {
			Static57.method5056((this.aLong112 - this.aLong111) / 1000000L);
			this.aLong113 += this.aLong112 - this.aLong111;
			this.aLong111 += this.aLong112 - this.aLong111;
			this.aLong112 += local12;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			this.aLong112 += local12;
			local32++;
		} while (local32 < 10 && this.aLong111 > this.aLong112);
		if (this.aLong112 < this.aLong111) {
			this.aLong112 = this.aLong111;
		}
		return local32;
	}
}
