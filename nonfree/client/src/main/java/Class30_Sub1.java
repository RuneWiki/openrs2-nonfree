import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!vc", name = "k", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	private int anInt5592 = 1;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	private int anInt5593 = 0;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "[J")
	private long[] aLongArray12 = new long[10];

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class30_Sub1() {
		this.aLong182 = System.nanoTime();
		this.aLong183 = System.nanoTime();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	@Override
	public void method4521() {
		this.aLong184 = 0;
		if (this.aLong182 < this.aLong183) {
			this.aLong182 += this.aLong183 - this.aLong182;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)J")
	@Override
	public long method4522() {
		return this.aLong182;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)J")
	private long method4289() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(8) long local8 = 0L;
		@Pc(13) long local13 = local6 - this.aLong184;
		this.aLong184 = local6;
		if (local13 > 0L && local13 < 5000000000L) {
			this.aLongArray12[this.anInt5593] = local13;
			if (this.anInt5592 < 1) {
				this.anInt5592++;
			}
			this.anInt5593 = (this.anInt5593 + 1) % 10;
		}
		for (@Pc(53) int local53 = 1; local53 <= this.anInt5592; local53++) {
			local8 += this.aLongArray12[(this.anInt5593 + 10 - local53) % 10];
		}
		return local8 / (long) this.anInt5592;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)I")
	@Override
	public int method4519(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static275.method4233((long) arg0);
		this.aLong182 += this.method4289();
		@Pc(21) long local21 = (long) arg1 * 1000000L;
		if (this.aLong182 < this.aLong183) {
			Static275.method4233((this.aLong183 - this.aLong182) / 1000000L);
			this.aLong184 += this.aLong183 - this.aLong182;
			this.aLong182 += this.aLong183 - this.aLong182;
			this.aLong183 += local21;
			return 1;
		}
		@Pc(73) int local73 = 0;
		do {
			this.aLong183 += local21;
			local73++;
		} while (local73 < 10 && this.aLong183 < this.aLong182);
		if (this.aLong183 < this.aLong182) {
			this.aLong183 = this.aLong182;
		}
		return local73;
	}
}
