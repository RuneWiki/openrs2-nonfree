import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class14_Sub2 extends Class14 {

	@OriginalMember(owner = "client!md", name = "j", descriptor = "J")
	private long aLong128 = 0L;

	@OriginalMember(owner = "client!md", name = "k", descriptor = "J")
	private long aLong129 = 0L;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "[J")
	private long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!md", name = "n", descriptor = "J")
	private long aLong130 = 0L;

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	private int anInt3749 = 0;

	@OriginalMember(owner = "client!md", name = "o", descriptor = "I")
	private int anInt3750 = 1;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
	public Class14_Sub2() {
		this.aLong129 = System.nanoTime();
		this.aLong128 = System.nanoTime();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)J")
	private long method2733() {
		@Pc(1) long local1 = 0L;
		@Pc(3) long local3 = System.nanoTime();
		@Pc(8) long local8 = local3 - this.aLong130;
		this.aLong130 = local3;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray5[this.anInt3749] = local8;
			this.anInt3749 = (this.anInt3749 + 1) % 10;
			if (this.anInt3750 < 1) {
				this.anInt3750++;
			}
		}
		for (@Pc(59) int local59 = 1; local59 <= this.anInt3750; local59++) {
			local1 += this.aLongArray5[(this.anInt3749 + 10 - local59) % 10];
		}
		return local1 / (long) this.anInt3750;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
	@Override
	public void method3261() {
		if (this.aLong129 < this.aLong128) {
			this.aLong129 += this.aLong128 - this.aLong129;
		}
		this.aLong130 = 0L;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIB)I")
	@Override
	public int method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static312.method4734((long) arg1);
		@Pc(14) long local14 = (long) arg0 * 1000000L;
		this.aLong129 += this.method2733();
		if (this.aLong128 > this.aLong129) {
			Static312.method4734((this.aLong128 - this.aLong129) / 1000000L);
			this.aLong130 += this.aLong128 - this.aLong129;
			this.aLong129 += this.aLong128 - this.aLong129;
			this.aLong128 += local14;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong128 += local14;
		} while (local30 < 10 && this.aLong129 > this.aLong128);
		if (this.aLong128 < this.aLong129) {
			this.aLong128 = this.aLong129;
		}
		return local30;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(B)J")
	@Override
	public long method3263() {
		return this.aLong129;
	}
}
