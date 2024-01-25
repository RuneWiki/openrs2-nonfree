import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class130_Sub2 extends Class130 {

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "J")
	private long aLong228 = 0L;

	@OriginalMember(owner = "client!qk", name = "d", descriptor = "J")
	private long aLong229 = 0L;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "[J")
	private final long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	private int anInt8341 = 1;

	@OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
	private int anInt8340 = 0;

	@OriginalMember(owner = "client!qk", name = "h", descriptor = "J")
	private long aLong230 = 0L;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class130_Sub2() {
		this.aLong229 = System.nanoTime();
		this.aLong228 = System.nanoTime();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
	@Override
	public void method7417() {
		this.aLong230 = 0L;
		if (this.aLong228 > this.aLong229) {
			this.aLong229 += this.aLong228 - this.aLong229;
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)J")
	@Override
	protected long method7416() {
		this.aLong229 += this.method6989();
		return this.aLong229 < this.aLong228 ? (this.aLong228 - this.aLong229) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(IJ)I")
	@Override
	protected int method7420(@OriginalArg(1) long arg0) {
		if (this.aLong229 < this.aLong228) {
			this.aLong230 += this.aLong228 - this.aLong229;
			this.aLong229 += this.aLong228 - this.aLong229;
			this.aLong228 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			local42++;
			this.aLong228 += arg0;
		} while (local42 < 10 && this.aLong228 < this.aLong229);
		if (this.aLong229 > this.aLong228) {
			this.aLong228 = this.aLong229;
		}
		return local42;
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)J")
	@Override
	public long method7418() {
		return this.aLong229;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)J")
	private long method6989() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong230;
		this.aLong230 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray7[this.anInt8340] = local7;
			this.anInt8340 = (this.anInt8340 + 1) % 10;
			if (this.anInt8341 < 1) {
				this.anInt8341++;
			}
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(51) int local51 = 1; local51 <= this.anInt8341; local51++) {
			local49 += this.aLongArray7[(this.anInt8340 + 10 - local51) % 10];
		}
		return local49 / (long) this.anInt8341;
	}
}
