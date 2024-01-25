import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class37_Sub3 extends Class37 {

	@OriginalMember(owner = "client!rn", name = "i", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	private int anInt6030 = 1;

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "[J")
	private final long[] aLongArray8 = new long[10];

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	private int anInt6029 = 0;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	public Class37_Sub3() {
		this.aLong182 = System.nanoTime();
		this.aLong181 = System.nanoTime();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)J")
	private long method4754() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong183;
		this.aLong183 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray8[this.anInt6029] = local12;
			this.anInt6029 = (this.anInt6029 + 1) % 10;
			if (this.anInt6030 < 1) {
				this.anInt6030++;
			}
		}
		@Pc(50) long local50 = 0L;
		for (@Pc(52) int local52 = 1; local52 <= this.anInt6030; local52++) {
			local50 += this.aLongArray8[(this.anInt6029 + 10 - local52) % 10];
		}
		return local50 / (long) this.anInt6030;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)J")
	@Override
	public long method4748() {
		return this.aLong182;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
	@Override
	public void method4749() {
		this.aLong183 = 0L;
		if (this.aLong181 > this.aLong182) {
			this.aLong182 += this.aLong181 - this.aLong182;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I")
	@Override
	public int method4753(@OriginalArg(0) int arg0) {
		this.aLong182 += this.method4754();
		@Pc(19) long local19 = (long) arg0 * 1000000L;
		if (this.aLong181 > this.aLong182) {
			Static223.method4582((this.aLong181 - this.aLong182) / 1000000L);
			this.aLong183 += this.aLong181 - this.aLong182;
			this.aLong182 += this.aLong181 - this.aLong182;
			this.aLong181 += local19;
			return 1;
		}
		@Pc(71) int local71 = 0;
		do {
			local71++;
			this.aLong181 += local19;
		} while (local71 < 10 && this.aLong182 > this.aLong181);
		if (this.aLong181 < this.aLong182) {
			this.aLong181 = this.aLong182;
		}
		return local71;
	}
}
