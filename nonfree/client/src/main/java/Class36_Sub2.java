import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class36_Sub2 extends Class36 {

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "J")
	private long aLong115 = 0L;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "J")
	private long aLong116 = 0L;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	private int anInt3858 = 0;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	private int anInt3857 = 1;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "J")
	private long aLong117 = 0L;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method3807(@OriginalArg(1) long arg0) {
		if (this.aLong116 < this.aLong117) {
			this.aLong115 += this.aLong117 - this.aLong116;
			this.aLong116 += this.aLong117 - this.aLong116;
			this.aLong117 += arg0;
			return 1;
		}
		@Pc(12) int local12 = 0;
		do {
			local12++;
			this.aLong117 += arg0;
		} while (local12 < 10 && this.aLong116 > this.aLong117);
		if (this.aLong116 > this.aLong117) {
			this.aLong117 = this.aLong116;
		}
		return local12;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)J")
	private long method3544() {
		@Pc(4) long local4 = Static480.method6763() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong115;
		this.aLong115 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray11[this.anInt3858] = local10;
			if (this.anInt3857 < 10) {
				this.anInt3857++;
			}
			this.anInt3858 = (this.anInt3858 + 1) % 10;
		}
		@Pc(60) long local60 = (long) 0;
		for (@Pc(62) int local62 = 1; local62 <= this.anInt3857; local62++) {
			local60 += this.aLongArray11[(this.anInt3858 + 10 - local62) % 10];
		}
		return local60 / (long) this.anInt3857;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	@Override
	public void method3803() {
		this.aLong115 = 0L;
		if (this.aLong117 > this.aLong116) {
			this.aLong116 += this.aLong117 - this.aLong116;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)J")
	@Override
	protected long method3801() {
		this.aLong116 += this.method3544();
		return this.aLong117 > this.aLong116 ? (this.aLong117 - this.aLong116) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)J")
	@Override
	public long method3804() {
		return this.aLong116;
	}
}
