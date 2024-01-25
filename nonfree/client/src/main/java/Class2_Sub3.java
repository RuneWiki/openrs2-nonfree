import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "J")
	private long aLong301 = 0L;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "[J")
	private final long[] aLongArray20 = new long[10];

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "I")
	private int anInt10514 = 0;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "J")
	private long aLong302 = 0L;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "J")
	private long aLong300 = 0L;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "I")
	private int anInt10515 = 1;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(B)J")
	private long method8991() {
		@Pc(4) long local4 = Static26.method382() * 1000000L;
		@Pc(10) long local10 = local4 - this.aLong301;
		this.aLong301 = local4;
		if (local10 > -5000000000L && local10 < 5000000000L) {
			this.aLongArray20[this.anInt10514] = local10;
			if (this.anInt10515 < 10) {
				this.anInt10515++;
			}
			this.anInt10514 = (this.anInt10514 + 1) % 10;
		}
		@Pc(65) long local65 = 0L;
		for (@Pc(67) int local67 = 1; local67 <= this.anInt10515; local67++) {
			local65 += this.aLongArray20[(this.anInt10514 + 10 - local67) % 10];
		}
		return local65 / (long) this.anInt10515;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8990(@OriginalArg(1) long arg0) {
		if (this.aLong300 > this.aLong302) {
			this.aLong301 += this.aLong300 - this.aLong302;
			this.aLong302 += this.aLong300 - this.aLong302;
			this.aLong300 += arg0;
			return 1;
		}
		@Pc(15) int local15 = 0;
		do {
			local15++;
			this.aLong300 += arg0;
		} while (local15 < 10 && this.aLong300 < this.aLong302);
		if (this.aLong300 < this.aLong302) {
			this.aLong300 = this.aLong302;
		}
		return local15;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	@Override
	public void method8987() {
		if (this.aLong300 > this.aLong302) {
			this.aLong302 += this.aLong300 - this.aLong302;
		}
		this.aLong301 = 0L;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)J")
	@Override
	protected long method8983() {
		this.aLong302 += this.method8991();
		return this.aLong300 > this.aLong302 ? (this.aLong300 - this.aLong302) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)J")
	@Override
	public long method8989() {
		return this.aLong302;
	}
}
