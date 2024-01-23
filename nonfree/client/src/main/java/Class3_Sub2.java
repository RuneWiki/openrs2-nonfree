import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
	private long aLong129 = 0L;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	private int anInt3574 = 0;

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "[J")
	private long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
	private int anInt3575 = 1;

	@OriginalMember(owner = "client!nh", name = "o", descriptor = "J")
	private long aLong131 = 0L;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class3_Sub2() {
		this.aLong130 = System.nanoTime();
		this.aLong129 = System.nanoTime();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	@Override
	public void method2841() {
		this.aLong131 = 0L;
		if (this.aLong130 < this.aLong129) {
			this.aLong130 += this.aLong129 - this.aLong130;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)J")
	@Override
	public long method2844() {
		return this.aLong130;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)J")
	private long method2847() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong131;
		this.aLong131 = local1;
		@Pc(12) long local12 = 0L;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray9[this.anInt3574] = local7;
			this.anInt3574 = (this.anInt3574 + 1) % 10;
			if (this.anInt3575 < 1) {
				this.anInt3575++;
			}
		}
		for (@Pc(56) int local56 = 1; local56 <= this.anInt3575; local56++) {
			local12 += this.aLongArray9[(this.anInt3574 + 10 - local56) % 10];
		}
		return local12 / (long) this.anInt3575;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)I")
	@Override
	public int method2842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static122.method2061((long) arg0);
		this.aLong130 += this.method2847();
		@Pc(27) long local27 = (long) arg1 * 1000000L;
		if (this.aLong130 < this.aLong129) {
			Static122.method2061((this.aLong129 - this.aLong130) / 1000000L);
			this.aLong131 += this.aLong129 - this.aLong130;
			this.aLong130 += this.aLong129 - this.aLong130;
			this.aLong129 += local27;
			return 1;
		}
		@Pc(35) int local35 = 0;
		do {
			local35++;
			this.aLong129 += local27;
		} while (local35 < 10 && this.aLong129 < this.aLong130);
		if (this.aLong130 > this.aLong129) {
			this.aLong129 = this.aLong130;
		}
		return local35;
	}
}
