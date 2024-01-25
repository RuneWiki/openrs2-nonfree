import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class126_Sub3 extends Class126 {

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	private int anInt5919 = 1;

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "J")
	private long aLong200 = 0L;

	@OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
	private int anInt5920 = 0;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	public Class126_Sub3() {
		this.aLong199 = System.nanoTime();
		this.aLong198 = System.nanoTime();
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)J")
	@Override
	public long method5252() {
		return this.aLong199;
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)I")
	@Override
	public int method5255(@OriginalArg(0) int arg0) {
		@Pc(10) long local10 = (long) arg0 * 1000000L;
		this.aLong199 += this.method5257();
		if (this.aLong198 > this.aLong199) {
			Static105.method2138((this.aLong198 - this.aLong199) / 1000000L);
			this.aLong200 += this.aLong198 - this.aLong199;
			this.aLong199 += this.aLong198 - this.aLong199;
			this.aLong198 += local10;
			return 1;
		}
		@Pc(63) int local63 = 0;
		do {
			local63++;
			this.aLong198 += local10;
		} while (local63 < 10 && this.aLong198 < this.aLong199);
		if (this.aLong198 < this.aLong199) {
			this.aLong198 = this.aLong199;
		}
		return local63;
	}

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	@Override
	public void method5254() {
		if (this.aLong199 < this.aLong198) {
			this.aLong199 += this.aLong198 - this.aLong199;
		}
		this.aLong200 = 0L;
	}

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "(I)J")
	private long method5257() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong200;
		this.aLong200 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray9[this.anInt5920] = local6;
			this.anInt5920 = (this.anInt5920 + 1) % 10;
			if (this.anInt5919 < 1) {
				this.anInt5919++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt5919; local49++) {
			local47 += this.aLongArray9[(this.anInt5920 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt5919;
	}
}
