import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uga")
public final class Class103_Sub3 extends Class103 {

	@OriginalMember(owner = "client!uga", name = "f", descriptor = "J")
	private long aLong276 = 0L;

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "J")
	private long aLong277 = 0L;

	@OriginalMember(owner = "client!uga", name = "h", descriptor = "I")
	private int anInt9032 = 0;

	@OriginalMember(owner = "client!uga", name = "i", descriptor = "[J")
	private final long[] aLongArray13 = new long[10];

	@OriginalMember(owner = "client!uga", name = "j", descriptor = "J")
	private long aLong278 = 0L;

	@OriginalMember(owner = "client!uga", name = "k", descriptor = "I")
	private int anInt9033 = 1;

	@OriginalMember(owner = "client!uga", name = "<init>", descriptor = "()V")
	public Class103_Sub3() {
		this.aLong277 = this.aLong276 = jagmisc.nanoTime();
		if (this.aLong276 == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V")
	@Override
	public void method7408() {
		this.aLong278 = 0L;
		if (this.aLong276 < this.aLong277) {
			this.aLong276 += this.aLong277 - this.aLong276;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(B)J")
	private long method7415() {
		@Pc(1) long local1 = jagmisc.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong278;
		this.aLong278 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray13[this.anInt9032] = local6;
			if (this.anInt9033 < 1) {
				this.anInt9033++;
			}
			this.anInt9032 = (this.anInt9032 + 1) % 10;
		}
		@Pc(45) long local45 = 0L;
		for (@Pc(47) int local47 = 1; local47 <= this.anInt9033; local47++) {
			local45 += this.aLongArray13[(this.anInt9032 + 10 - local47) % 10];
		}
		return local45 / (long) this.anInt9033;
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(ZJ)I")
	@Override
	protected int method7412(@OriginalArg(1) long arg0) {
		if (this.aLong277 > this.aLong276) {
			this.aLong278 += this.aLong277 - this.aLong276;
			this.aLong276 += this.aLong277 - this.aLong276;
			this.aLong277 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			local16++;
			this.aLong277 += arg0;
		} while (local16 < 10 && this.aLong277 < this.aLong276);
		if (this.aLong277 < this.aLong276) {
			this.aLong277 = this.aLong276;
		}
		return local16;
	}

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "(I)J")
	@Override
	public long method7410() {
		return this.aLong276;
	}

	@OriginalMember(owner = "client!uga", name = "d", descriptor = "(I)J")
	@Override
	protected long method7413() {
		this.aLong276 += this.method7415();
		return this.aLong276 < this.aLong277 ? (this.aLong277 - this.aLong276) / 1000000L : 0L;
	}
}
