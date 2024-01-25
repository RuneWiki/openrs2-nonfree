import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class44_Sub3 extends Class44 {

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "J")
	private long aLong118 = 0L;

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "J")
	private long aLong117 = 0L;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "J")
	private long aLong119 = 0L;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
	private int anInt3840 = 0;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
	private int anInt3841 = 1;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "()V")
	public Class44_Sub3() {
		this.aLong118 = this.aLong117 = jagmisc.nanoTime();
		if (this.aLong117 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)J")
	@Override
	public long method3068() {
		return this.aLong117;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	@Override
	public void method3065() {
		this.aLong119 = 0L;
		if (this.aLong118 > this.aLong117) {
			this.aLong117 += this.aLong118 - this.aLong117;
		}
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)J")
	private long method3069() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong119;
		this.aLong119 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt3840] = local7;
			if (this.anInt3841 < 1) {
				this.anInt3841++;
			}
			this.anInt3840 = (this.anInt3840 + 1) % 10;
		}
		@Pc(47) long local47 = (long) 0;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt3841; local49++) {
			local47 += this.aLongArray7[(this.anInt3840 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt3841;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)I")
	@Override
	public int method3067(@OriginalArg(1) int arg0) {
		@Pc(4) long local4 = (long) arg0 * 1000000L;
		this.aLong117 += this.method3069();
		if (this.aLong118 > this.aLong117) {
			Static360.method4758((this.aLong118 - this.aLong117) / 1000000L);
			this.aLong119 += this.aLong118 - this.aLong117;
			this.aLong117 += this.aLong118 - this.aLong117;
			this.aLong118 += local4;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			this.aLong118 += local4;
			local69++;
		} while (local69 < 10 && this.aLong117 > this.aLong118);
		if (this.aLong117 > this.aLong118) {
			this.aLong118 = this.aLong117;
		}
		return local69;
	}
}
