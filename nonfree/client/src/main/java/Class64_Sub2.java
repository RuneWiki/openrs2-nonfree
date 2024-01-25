import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oca")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!oca", name = "f", descriptor = "J")
	private long aLong174 = 0L;

	@OriginalMember(owner = "client!oca", name = "g", descriptor = "J")
	private long aLong175 = 0L;

	@OriginalMember(owner = "client!oca", name = "h", descriptor = "J")
	private long aLong176 = 0L;

	@OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
	private int anInt6866 = 1;

	@OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
	private int anInt6867 = 0;

	@OriginalMember(owner = "client!oca", name = "k", descriptor = "[J")
	private final long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V")
	public Class64_Sub2() {
		this.aLong175 = System.nanoTime();
		this.aLong174 = System.nanoTime();
	}

	@OriginalMember(owner = "client!oca", name = "d", descriptor = "(I)J")
	@Override
	public long method6923() {
		return this.aLong175;
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)J")
	@Override
	protected long method6918() {
		this.aLong175 += this.method5975();
		return this.aLong175 < this.aLong174 ? (this.aLong174 - this.aLong175) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!oca", name = "e", descriptor = "(I)J")
	private long method5975() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong176;
		this.aLong176 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray12[this.anInt6867] = local7;
			if (this.anInt6866 < 1) {
				this.anInt6866++;
			}
			this.anInt6867 = (this.anInt6867 + 1) % 10;
		}
		@Pc(49) long local49 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt6866; local57++) {
			local49 += this.aLongArray12[(this.anInt6867 + 10 - local57) % 10];
		}
		return local49 / (long) this.anInt6866;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
	@Override
	public void method6920() {
		if (this.aLong174 > this.aLong175) {
			this.aLong175 += this.aLong174 - this.aLong175;
		}
		this.aLong176 = (long) 0;
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(JI)I")
	@Override
	protected int method6919(@OriginalArg(0) long arg0) {
		if (this.aLong175 < this.aLong174) {
			this.aLong176 += this.aLong174 - this.aLong175;
			this.aLong175 += this.aLong174 - this.aLong175;
			this.aLong174 += arg0;
			return 1;
		}
		@Pc(42) int local42 = 0;
		do {
			this.aLong174 += arg0;
			local42++;
		} while (local42 < 10 && this.aLong175 > this.aLong174);
		if (this.aLong175 > this.aLong174) {
			this.aLong174 = this.aLong175;
		}
		return local42;
	}
}
