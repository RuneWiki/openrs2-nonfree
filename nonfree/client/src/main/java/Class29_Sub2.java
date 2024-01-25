import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "J")
	private long aLong42 = 0L;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "J")
	private long aLong41 = 0L;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "J")
	private long aLong43 = 0L;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	private int anInt829 = 1;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	private int anInt830 = 0;

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	private Class29_Sub2() {
		this.aLong42 = System.nanoTime();
		this.aLong41 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)J")
	private long method834() {
		@Pc(9) long local9 = System.nanoTime();
		@Pc(15) long local15 = local9 - this.aLong43;
		this.aLong43 = local9;
		if (local15 > -5000000000L && local15 < 5000000000L) {
			this.aLongArray4[this.anInt830] = local15;
			if (this.anInt829 < 1) {
				this.anInt829++;
			}
			this.anInt830 = (this.anInt830 + 1) % 10;
		}
		@Pc(60) long local60 = 0L;
		for (@Pc(62) int local62 = 1; local62 <= this.anInt829; local62++) {
			local60 += this.aLongArray4[(this.anInt830 + 10 - local62) % 10];
		}
		return local60 / (long) this.anInt829;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8354(@OriginalArg(1) long arg0) {
		if (this.aLong42 < this.aLong41) {
			this.aLong43 += this.aLong41 - this.aLong42;
			this.aLong42 += this.aLong41 - this.aLong42;
			this.aLong41 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			this.aLong41 += arg0;
			local45++;
		} while (local45 < 10 && this.aLong42 > this.aLong41);
		if (this.aLong42 > this.aLong41) {
			this.aLong41 = this.aLong42;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	@Override
	public void method8349() {
		this.aLong43 = 0L;
		if (this.aLong41 > this.aLong42) {
			this.aLong42 += this.aLong41 - this.aLong42;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)J")
	@Override
	protected long method8353() {
		this.aLong42 += this.method834();
		return this.aLong42 < this.aLong41 ? (this.aLong41 - this.aLong42) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(Z)J")
	@Override
	public long method8356() {
		return this.aLong42;
	}
}
