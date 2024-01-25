import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class115_Sub3 extends Class115 {

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "J")
	private long aLong172 = 0L;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "J")
	private long aLong173 = 0L;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "J")
	private long aLong174 = 0L;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "[J")
	private final long[] aLongArray9 = new long[10];

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
	private int anInt4952 = 0;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	private int anInt4953 = 1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class115_Sub3() {
		this.aLong172 = System.nanoTime();
		this.aLong173 = System.nanoTime();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)I")
	@Override
	public int method4522(@OriginalArg(1) int arg0) {
		this.aLong172 += this.method4526();
		@Pc(14) long local14 = (long) arg0 * 1000000L;
		if (this.aLong172 < this.aLong173) {
			Static135.method2737((this.aLong173 - this.aLong172) / 1000000L);
			this.aLong174 += this.aLong173 - this.aLong172;
			this.aLong172 += this.aLong173 - this.aLong172;
			this.aLong173 += local14;
			return 1;
		}
		@Pc(32) int local32 = 0;
		do {
			local32++;
			this.aLong173 += local14;
		} while (local32 < 10 && this.aLong173 < this.aLong172);
		if (this.aLong173 < this.aLong172) {
			this.aLong173 = this.aLong172;
		}
		return local32;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)J")
	@Override
	public long method4524() {
		return this.aLong172;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)J")
	private long method4526() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong174;
		this.aLong174 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray9[this.anInt4952] = local7;
			this.anInt4952 = (this.anInt4952 + 1) % 10;
			if (this.anInt4953 < 1) {
				this.anInt4953++;
			}
		}
		@Pc(47) long local47 = 0L;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt4953; local49++) {
			local47 += this.aLongArray9[(this.anInt4952 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt4953;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	@Override
	public void method4523() {
		this.aLong174 = 0L;
		if (this.aLong173 > this.aLong172) {
			this.aLong172 += this.aLong173 - this.aLong172;
		}
	}
}
