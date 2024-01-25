import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
	private int anInt459 = 0;

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ai", name = "i", descriptor = "J")
	private long aLong10 = 0L;

	@OriginalMember(owner = "client!ai", name = "h", descriptor = "J")
	private long aLong9 = 0L;

	@OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
	private int anInt460 = 1;

	@OriginalMember(owner = "client!ai", name = "j", descriptor = "J")
	private long aLong11 = 0L;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)J")
	@Override
	protected long method5281() {
		this.aLong9 += this.method290();
		return this.aLong10 > this.aLong9 ? (this.aLong10 - this.aLong9) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
	@Override
	public void method5283() {
		if (this.aLong9 < this.aLong10) {
			this.aLong9 += this.aLong10 - this.aLong9;
		}
		this.aLong11 = 0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(JB)I")
	@Override
	protected int method5280(@OriginalArg(0) long arg0) {
		if (this.aLong9 < this.aLong10) {
			this.aLong11 += this.aLong10 - this.aLong9;
			this.aLong9 += this.aLong10 - this.aLong9;
			this.aLong10 += arg0;
			return 1;
		}
		@Pc(19) int local19 = 0;
		do {
			local19++;
			this.aLong10 += arg0;
		} while (local19 < 10 && this.aLong10 < this.aLong9);
		if (this.aLong10 < this.aLong9) {
			this.aLong10 = this.aLong9;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)J")
	@Override
	public long method5279() {
		return this.aLong9;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)J")
	private long method290() {
		@Pc(4) long local4 = Static548.method7437() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong11;
		this.aLong11 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray1[this.anInt459] = local10;
			this.anInt459 = (this.anInt459 + 1) % 10;
			if (this.anInt460 < 10) {
				this.anInt460++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt460; local51++) {
			local49 += this.aLongArray1[(this.anInt459 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt460;
	}
}
