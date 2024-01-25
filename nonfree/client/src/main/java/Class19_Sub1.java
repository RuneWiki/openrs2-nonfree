import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!as", name = "h", descriptor = "J")
	private long aLong19 = 0L;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "J")
	private long aLong18 = 0L;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "J")
	private long aLong20 = 0L;

	@OriginalMember(owner = "client!as", name = "j", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	private int anInt384 = 1;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	private int anInt385 = 0;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class19_Sub1() {
		this.aLong19 = System.nanoTime();
		this.aLong18 = System.nanoTime();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(JI)I")
	@Override
	protected int method7649(@OriginalArg(0) long arg0) {
		if (this.aLong18 > this.aLong19) {
			this.aLong20 += this.aLong18 - this.aLong19;
			this.aLong19 += this.aLong18 - this.aLong19;
			this.aLong18 += arg0;
			return 1;
		}
		@Pc(16) int local16 = 0;
		do {
			this.aLong18 += arg0;
			local16++;
		} while (local16 < 10 && this.aLong18 < this.aLong19);
		if (this.aLong18 < this.aLong19) {
			this.aLong18 = this.aLong19;
		}
		return local16;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)J")
	@Override
	protected long method7651() {
		this.aLong19 += this.method311();
		return this.aLong18 <= this.aLong19 ? 0L : (this.aLong18 - this.aLong19) / 1000000L;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
	@Override
	public long method7650() {
		return this.aLong19;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(B)V")
	@Override
	public void method7653() {
		this.aLong20 = 0L;
		if (this.aLong18 > this.aLong19) {
			this.aLong19 += this.aLong18 - this.aLong19;
		}
	}

	@OriginalMember(owner = "client!as", name = "c", descriptor = "(B)J")
	private long method311() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(12) long local12 = local1 - this.aLong20;
		this.aLong20 = local1;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray1[this.anInt385] = local12;
			if (this.anInt384 < 1) {
				this.anInt384++;
			}
			this.anInt385 = (this.anInt385 + 1) % 10;
		}
		@Pc(54) long local54 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt384; local56++) {
			local54 += this.aLongArray1[(this.anInt385 + 10 - local56) % 10];
		}
		return local54 / (long) this.anInt384;
	}
}
