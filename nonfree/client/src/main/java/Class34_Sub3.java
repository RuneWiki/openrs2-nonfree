import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class34_Sub3 extends Class34 {

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
	private int anInt4229 = 1;

	@OriginalMember(owner = "client!nn", name = "l", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
	private int anInt4230 = 0;

	@OriginalMember(owner = "client!nn", name = "k", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!nn", name = "m", descriptor = "J")
	private long aLong168 = 0L;

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)I")
	@Override
	public int method3922(@OriginalArg(0) int arg0) {
		this.aLong166 += this.method3929();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong166 < this.aLong167) {
			Static37.method613((this.aLong167 - this.aLong166) / 1000000L);
			this.aLong168 += this.aLong167 - this.aLong166;
			this.aLong166 += this.aLong167 - this.aLong166;
			this.aLong167 += local18;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong167 += local18;
		} while (local30 < 10 && this.aLong166 > this.aLong167);
		if (this.aLong166 > this.aLong167) {
			this.aLong167 = this.aLong166;
		}
		return local30;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)V")
	@Override
	public void method3928() {
		if (this.aLong166 < this.aLong167) {
			this.aLong166 += this.aLong167 - this.aLong166;
		}
		this.aLong168 = 0L;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)J")
	@Override
	public long method3925() {
		return this.aLong166;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)J")
	private long method3929() {
		@Pc(4) long local4 = Static288.method4512() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong168;
		this.aLong168 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray6[this.anInt4230] = local10;
			if (this.anInt4229 < 10) {
				this.anInt4229++;
			}
			this.anInt4230 = (this.anInt4230 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt4229; local51++) {
			local49 += this.aLongArray6[(this.anInt4230 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt4229;
	}
}
