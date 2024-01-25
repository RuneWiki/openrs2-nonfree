import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "J")
	private long aLong8 = 0L;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
	private long aLong9 = 0L;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
	private int anInt852 = 0;

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	private int anInt851 = 1;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "J")
	private long aLong10 = 0L;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class13_Sub1() {
		this.aLong8 = System.nanoTime();
		this.aLong9 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)J")
	private long method756() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong10;
		this.aLong10 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt852] = local7;
			if (this.anInt851 < 1) {
				this.anInt851++;
			}
			this.anInt852 = (this.anInt852 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt851; local59++) {
			local49 += this.aLongArray1[(this.anInt852 + 10 - local59) % 10];
		}
		return local49 / (long) this.anInt851;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)J")
	@Override
	public long method7249() {
		return this.aLong8;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)J")
	@Override
	protected long method7245() {
		this.aLong8 += this.method756();
		return this.aLong9 > this.aLong8 ? (this.aLong9 - this.aLong8) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	@Override
	public void method7248() {
		this.aLong10 = 0L;
		if (this.aLong9 > this.aLong8) {
			this.aLong8 += this.aLong9 - this.aLong8;
		}
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(JI)I")
	@Override
	protected int method7247(@OriginalArg(0) long arg0) {
		if (this.aLong8 < this.aLong9) {
			this.aLong10 += this.aLong9 - this.aLong8;
			this.aLong8 += this.aLong9 - this.aLong8;
			this.aLong9 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			local45++;
			this.aLong9 += arg0;
		} while (local45 < 10 && this.aLong8 > this.aLong9);
		if (this.aLong8 > this.aLong9) {
			this.aLong9 = this.aLong8;
		}
		return local45;
	}
}
