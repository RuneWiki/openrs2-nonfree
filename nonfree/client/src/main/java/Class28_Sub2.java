import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "J")
	private long aLong114 = 0L;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "J")
	private long aLong115 = 0L;

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
	private int anInt3417 = 1;

	@OriginalMember(owner = "client!kl", name = "j", descriptor = "J")
	private long aLong116 = 0L;

	@OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
	private int anInt3418 = 0;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class28_Sub2() {
		this.aLong114 = System.nanoTime();
		this.aLong115 = System.nanoTime();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)J")
	private long method3142() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong116;
		this.aLong116 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray4[this.anInt3418] = local7;
			if (this.anInt3417 < 1) {
				this.anInt3417++;
			}
			this.anInt3418 = (this.anInt3418 + 1) % 10;
		}
		@Pc(48) long local48 = 0L;
		for (@Pc(50) int local50 = 1; local50 <= this.anInt3417; local50++) {
			local48 += this.aLongArray4[(this.anInt3418 + 10 - local50) % 10];
		}
		return local48 / (long) this.anInt3417;
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
	@Override
	public void method4249() {
		this.aLong116 = 0L;
		if (this.aLong115 > this.aLong114) {
			this.aLong114 += this.aLong115 - this.aLong114;
		}
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)J")
	@Override
	public long method4246() {
		return this.aLong114;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)I")
	@Override
	public int method4247(@OriginalArg(1) int arg0) {
		this.aLong114 += this.method3142();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong114 < this.aLong115) {
			Static358.method2028((this.aLong115 - this.aLong114) / 1000000L);
			this.aLong116 += this.aLong115 - this.aLong114;
			this.aLong114 += this.aLong115 - this.aLong114;
			this.aLong115 += local12;
			return 1;
		}
		@Pc(25) int local25 = 0;
		do {
			local25++;
			this.aLong115 += local12;
		} while (local25 < 10 && this.aLong115 < this.aLong114);
		if (this.aLong115 < this.aLong114) {
			this.aLong115 = this.aLong114;
		}
		return local25;
	}
}
