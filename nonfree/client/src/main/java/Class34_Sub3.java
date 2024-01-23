import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "J")
	private long aLong246 = 0L;

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "J")
	private long aLong247 = 0L;

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "J")
	private long aLong248 = 0L;

	@OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
	private int anInt6156 = 1;

	@OriginalMember(owner = "client!wn", name = "j", descriptor = "[J")
	private long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
	private int anInt6155 = 0;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)I")
	@Override
	public int method5037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static150.method2552((long) arg1);
		this.aLong247 += this.method5038();
		@Pc(16) long local16 = (long) arg0 * 1000000L;
		if (this.aLong247 < this.aLong248) {
			Static150.method2552((this.aLong248 - this.aLong247) / 1000000L);
			this.aLong246 += this.aLong248 - this.aLong247;
			this.aLong247 += this.aLong248 - this.aLong247;
			this.aLong248 += local16;
			return 1;
		}
		@Pc(33) int local33 = 0;
		do {
			this.aLong248 += local16;
			local33++;
		} while (local33 < 10 && this.aLong247 > this.aLong248);
		if (this.aLong248 < this.aLong247) {
			this.aLong248 = this.aLong247;
		}
		return local33;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	@Override
	public void method5034() {
		if (this.aLong247 < this.aLong248) {
			this.aLong247 += this.aLong248 - this.aLong247;
		}
		this.aLong246 = 0L;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)J")
	@Override
	public long method5033() {
		return this.aLong247;
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)J")
	private long method5038() {
		@Pc(4) long local4 = Static128.method2196() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong246;
		this.aLong246 = local4;
		@Pc(15) long local15 = 0L;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray14[this.anInt6155] = local10;
			this.anInt6155 = (this.anInt6155 + 1) % 10;
			if (this.anInt6156 < 10) {
				this.anInt6156++;
			}
		}
		for (@Pc(57) int local57 = 1; local57 <= this.anInt6156; local57++) {
			local15 += this.aLongArray14[(this.anInt6155 + 10 - local57) % 10];
		}
		return local15 / (long) this.anInt6156;
	}
}
