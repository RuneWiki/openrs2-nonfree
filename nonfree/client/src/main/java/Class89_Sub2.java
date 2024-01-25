import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class89_Sub2 extends Class89 {

	@OriginalMember(owner = "client!haa", name = "h", descriptor = "I")
	private int anInt3941 = 1;

	@OriginalMember(owner = "client!haa", name = "j", descriptor = "J")
	private long aLong107 = 0L;

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "I")
	private int anInt3942 = 0;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "J")
	private long aLong108 = 0L;

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "J")
	private long aLong109 = 0L;

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6696() {
		if (this.aLong107 > this.aLong108) {
			this.aLong108 += this.aLong107 - this.aLong108;
		}
		this.aLong109 = 0L;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)J")
	@Override
	public long method6694() {
		return this.aLong108;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)J")
	private long method3457() {
		@Pc(4) long local4 = Static76.method1679() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong109;
		this.aLong109 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray7[this.anInt3942] = local10;
			this.anInt3942 = (this.anInt3942 + 1) % 10;
			if (this.anInt3941 < 10) {
				this.anInt3941++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt3941; local51++) {
			local49 += this.aLongArray7[(this.anInt3942 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt3941;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(B)J")
	@Override
	protected long method6692() {
		this.aLong108 += this.method3457();
		return this.aLong108 < this.aLong107 ? (this.aLong107 - this.aLong108) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method6700(@OriginalArg(1) long arg0) {
		if (this.aLong107 > this.aLong108) {
			this.aLong109 += this.aLong107 - this.aLong108;
			this.aLong108 += this.aLong107 - this.aLong108;
			this.aLong107 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			local14++;
			this.aLong107 += arg0;
		} while (local14 < 10 && this.aLong108 > this.aLong107);
		if (this.aLong108 > this.aLong107) {
			this.aLong107 = this.aLong108;
		}
		return local14;
	}
}
