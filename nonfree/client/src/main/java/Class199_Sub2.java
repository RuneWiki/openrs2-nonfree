import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class199_Sub2 extends Class199 {

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "J")
	private long aLong230 = 0L;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "J")
	private long aLong229 = 0L;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	private int anInt6993 = 1;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "[J")
	private final long[] aLongArray14 = new long[10];

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
	private int anInt6994 = 0;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "J")
	private long aLong231 = 0L;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class199_Sub2() {
		this.aLong230 = this.aLong229 = jagmisc.nanoTime();
		if (this.aLong229 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)J")
	private long method5870() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong231;
		this.aLong231 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray14[this.anInt6994] = local7;
			if (this.anInt6993 < 1) {
				this.anInt6993++;
			}
			this.anInt6994 = (this.anInt6994 + 1) % 10;
		}
		@Pc(56) long local56 = 0L;
		for (@Pc(58) int local58 = 1; local58 <= this.anInt6993; local58++) {
			local56 += this.aLongArray14[(this.anInt6994 + 10 - local58) % 10];
		}
		return local56 / (long) this.anInt6993;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
	@Override
	public void method8108() {
		if (this.aLong230 > this.aLong229) {
			this.aLong229 += this.aLong230 - this.aLong229;
		}
		this.aLong231 = 0L;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BJ)I")
	@Override
	protected int method8112(@OriginalArg(1) long arg0) {
		if (this.aLong229 < this.aLong230) {
			this.aLong231 += this.aLong230 - this.aLong229;
			this.aLong229 += this.aLong230 - this.aLong229;
			this.aLong230 += arg0;
			return 1;
		}
		@Pc(51) int local51 = 0;
		do {
			local51++;
			this.aLong230 += arg0;
		} while (local51 < 10 && this.aLong230 < this.aLong229);
		if (this.aLong230 < this.aLong229) {
			this.aLong230 = this.aLong229;
		}
		return local51;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)J")
	@Override
	public long method8105() {
		return this.aLong229;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)J")
	@Override
	protected long method8110() {
		this.aLong229 += this.method5870();
		return this.aLong230 > this.aLong229 ? (this.aLong230 - this.aLong229) / 1000000L : 0L;
	}
}
