import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!of", name = "i", descriptor = "J")
	private long aLong165 = 0L;

	@OriginalMember(owner = "client!of", name = "j", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "[J")
	private final long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!of", name = "n", descriptor = "I")
	private int anInt6617 = 0;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	private int anInt6616 = 1;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class47_Sub2() {
		this.aLong165 = System.nanoTime();
		this.aLong166 = System.nanoTime();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(B)J")
	private long method5895() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong167;
		this.aLong167 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray11[this.anInt6617] = local6;
			if (this.anInt6616 < 1) {
				this.anInt6616++;
			}
			this.anInt6617 = (this.anInt6617 + 1) % 10;
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(56) int local56 = 1; local56 <= this.anInt6616; local56++) {
			local47 += this.aLongArray11[(this.anInt6617 + 10 - local56) % 10];
		}
		return local47 / (long) this.anInt6616;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(JB)I")
	@Override
	protected int method8503(@OriginalArg(0) long arg0) {
		if (this.aLong166 > this.aLong165) {
			this.aLong167 += this.aLong166 - this.aLong165;
			this.aLong165 += this.aLong166 - this.aLong165;
			this.aLong166 += arg0;
			return 1;
		}
		@Pc(14) int local14 = 0;
		do {
			this.aLong166 += arg0;
			local14++;
		} while (local14 < 10 && this.aLong166 < this.aLong165);
		if (this.aLong165 > this.aLong166) {
			this.aLong166 = this.aLong165;
		}
		return local14;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)J")
	@Override
	protected long method8501() {
		this.aLong165 += this.method5895();
		return this.aLong165 < this.aLong166 ? (this.aLong166 - this.aLong165) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)J")
	@Override
	public long method8504() {
		return this.aLong165;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	@Override
	public void method8500() {
		this.aLong167 = 0L;
		if (this.aLong165 < this.aLong166) {
			this.aLong165 += this.aLong166 - this.aLong165;
		}
	}
}
