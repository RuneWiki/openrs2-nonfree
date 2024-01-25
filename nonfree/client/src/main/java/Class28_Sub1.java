import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mia")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!mia", name = "d", descriptor = "J")
	private long aLong170 = 0L;

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "J")
	private long aLong171 = 0L;

	@OriginalMember(owner = "client!mia", name = "f", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "J")
	private long aLong172 = 0L;

	@OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
	private int anInt6523 = 0;

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
	private int anInt6524 = 1;

	@OriginalMember(owner = "client!mia", name = "<init>", descriptor = "()V")
	public Class28_Sub1() {
		this.aLong171 = System.nanoTime();
		this.aLong170 = System.nanoTime();
	}

	@OriginalMember(owner = "client!mia", name = "c", descriptor = "(I)V")
	@Override
	public void method8220() {
		this.aLong172 = 0L;
		if (this.aLong171 < this.aLong170) {
			this.aLong171 += this.aLong170 - this.aLong171;
		}
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8217(@OriginalArg(1) long arg0) {
		if (this.aLong170 > this.aLong171) {
			this.aLong172 += this.aLong170 - this.aLong171;
			this.aLong171 += this.aLong170 - this.aLong171;
			this.aLong170 += arg0;
			return 1;
		}
		@Pc(44) int local44 = 0;
		do {
			local44++;
			this.aLong170 += arg0;
		} while (local44 < 10 && this.aLong170 < this.aLong171);
		if (this.aLong171 > this.aLong170) {
			this.aLong170 = this.aLong171;
		}
		return local44;
	}

	@OriginalMember(owner = "client!mia", name = "b", descriptor = "(Z)J")
	private long method5675() {
		@Pc(5) long local5 = System.nanoTime();
		@Pc(10) long local10 = local5 - this.aLong172;
		this.aLong172 = local5;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray8[this.anInt6523] = local10;
			this.anInt6523 = (this.anInt6523 + 1) % 10;
			if (this.anInt6524 < 1) {
				this.anInt6524++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt6524; local52++) {
			local50 += this.aLongArray8[(this.anInt6523 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt6524;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)J")
	@Override
	public long method8214() {
		return this.aLong171;
	}

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Z)J")
	@Override
	protected long method8215() {
		this.aLong171 += this.method5675();
		return this.aLong170 > this.aLong171 ? (this.aLong170 - this.aLong171) / 1000000L : 0L;
	}
}
