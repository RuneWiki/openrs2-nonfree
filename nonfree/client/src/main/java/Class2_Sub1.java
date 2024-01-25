import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "J")
	private long aLong2 = 0L;

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "J")
	private long aLong3 = 0L;

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "I")
	private int anInt15 = 0;

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
	private int anInt16 = 1;

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "J")
	private long aLong4 = 0L;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	private Class2_Sub1() {
		this.aLong3 = System.nanoTime();
		this.aLong2 = System.nanoTime();
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)J")
	@Override
	public long method8989() {
		return this.aLong3;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IJ)I")
	@Override
	protected int method8990(@OriginalArg(1) long arg0) {
		if (this.aLong3 < this.aLong2) {
			this.aLong4 += this.aLong2 - this.aLong3;
			this.aLong3 += this.aLong2 - this.aLong3;
			this.aLong2 += arg0;
			return 1;
		}
		@Pc(45) int local45 = 0;
		do {
			this.aLong2 += arg0;
			local45++;
		} while (local45 < 10 && this.aLong2 < this.aLong3);
		if (this.aLong3 > this.aLong2) {
			this.aLong2 = this.aLong3;
		}
		return local45;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)J")
	@Override
	protected long method8983() {
		this.aLong3 += this.method38();
		return this.aLong3 < this.aLong2 ? (this.aLong2 - this.aLong3) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)J")
	private long method38() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong4;
		this.aLong4 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray1[this.anInt15] = local6;
			this.anInt15 = (this.anInt15 + 1) % 10;
			if (this.anInt16 < 1) {
				this.anInt16++;
			}
		}
		@Pc(51) long local51 = 0L;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt16; local53++) {
			local51 += this.aLongArray1[(this.anInt15 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt16;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	@Override
	public void method8987() {
		if (this.aLong3 < this.aLong2) {
			this.aLong3 += this.aLong2 - this.aLong3;
		}
		this.aLong4 = 0L;
	}
}
