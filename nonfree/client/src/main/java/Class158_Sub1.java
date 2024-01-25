import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class158_Sub1 extends Class158 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "J")
	private long aLong153 = 0L;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "J")
	private long aLong154 = 0L;

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
	private int anInt5067 = 0;

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "J")
	private long aLong155 = 0L;

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	private int anInt5068 = 1;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class158_Sub1() {
		this.aLong153 = System.nanoTime();
		this.aLong154 = System.nanoTime();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method5751() {
		this.aLong155 = 0L;
		if (this.aLong153 < this.aLong154) {
			this.aLong153 += this.aLong154 - this.aLong153;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I")
	@Override
	public int method5756(@OriginalArg(0) int arg0) {
		this.aLong153 += this.method4153();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong153 < this.aLong154) {
			Static366.method5214((this.aLong154 - this.aLong153) / 1000000L);
			this.aLong155 += this.aLong154 - this.aLong153;
			this.aLong153 += this.aLong154 - this.aLong153;
			this.aLong154 += local18;
			return 1;
		}
		@Pc(30) int local30 = 0;
		do {
			local30++;
			this.aLong154 += local18;
		} while (local30 < 10 && this.aLong154 < this.aLong153);
		if (this.aLong153 > this.aLong154) {
			this.aLong154 = this.aLong153;
		}
		return local30;
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)J")
	private long method4153() {
		@Pc(8) long local8 = System.nanoTime();
		@Pc(14) long local14 = local8 - this.aLong155;
		this.aLong155 = local8;
		if (local14 > -5000000000L && local14 < 5000000000L) {
			this.aLongArray6[this.anInt5067] = local14;
			if (this.anInt5068 < 1) {
				this.anInt5068++;
			}
			this.anInt5067 = (this.anInt5067 + 1) % 10;
		}
		@Pc(59) long local59 = 0L;
		for (@Pc(61) int local61 = 1; local61 <= this.anInt5068; local61++) {
			local59 += this.aLongArray6[(this.anInt5067 + 10 - local61) % 10];
		}
		return local59 / (long) this.anInt5068;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)J")
	@Override
	public long method5755() {
		return this.aLong153;
	}
}
