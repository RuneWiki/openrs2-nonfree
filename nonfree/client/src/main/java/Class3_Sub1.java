import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "J")
	private long aLong1 = 0L;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "J")
	private long aLong2 = 0L;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	private int anInt68 = 1;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "J")
	private long aLong3 = 0L;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	private int anInt69 = 0;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3_Sub1() {
		this.aLong1 = System.nanoTime();
		this.aLong2 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method6617(@OriginalArg(1) long arg0) {
		if (this.aLong1 < this.aLong2) {
			this.aLong3 += this.aLong2 - this.aLong1;
			this.aLong1 += this.aLong2 - this.aLong1;
			this.aLong2 += arg0;
			return 1;
		}
		@Pc(18) int local18 = 0;
		do {
			this.aLong2 += arg0;
			local18++;
		} while (local18 < 10 && this.aLong2 < this.aLong1);
		if (this.aLong1 > this.aLong2) {
			this.aLong2 = this.aLong1;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)J")
	@Override
	protected long method6622() {
		this.aLong1 += this.method100();
		return this.aLong2 <= this.aLong1 ? 0L : (this.aLong2 - this.aLong1) / 1000000L;
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)J")
	@Override
	public long method6619() {
		return this.aLong1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)J")
	private long method100() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong3;
		this.aLong3 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray1[this.anInt69] = local6;
			this.anInt69 = (this.anInt69 + 1) % 10;
			if (this.anInt68 < 1) {
				this.anInt68++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt68; local49++) {
			local47 += this.aLongArray1[(this.anInt69 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt68;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V")
	@Override
	public void method6623() {
		this.aLong3 = 0L;
		if (this.aLong2 > this.aLong1) {
			this.aLong1 += this.aLong2 - this.aLong1;
		}
	}
}
