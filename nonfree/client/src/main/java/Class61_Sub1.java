import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "J")
	private long aLong54 = 0L;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "J")
	private long aLong53 = 0L;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "J")
	private long aLong55 = 0L;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	private int anInt1649 = 0;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
	private int anInt1650 = 1;

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class61_Sub1() {
		this.aLong53 = System.nanoTime();
		this.aLong54 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)J")
	@Override
	public long method4568() {
		return this.aLong53;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	@Override
	public void method4571() {
		this.aLong55 = 0L;
		if (this.aLong54 > this.aLong53) {
			this.aLong53 += this.aLong54 - this.aLong53;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)J")
	private long method1347() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(6) long local6 = local1 - this.aLong55;
		this.aLong55 = local1;
		if (local6 > -5000000000L && local6 < 5000000000L) {
			this.aLongArray3[this.anInt1649] = local6;
			if (this.anInt1650 < 1) {
				this.anInt1650++;
			}
			this.anInt1649 = (this.anInt1649 + 1) % 10;
		}
		@Pc(52) long local52 = 0L;
		for (@Pc(54) int local54 = 1; local54 <= this.anInt1650; local54++) {
			local52 += this.aLongArray3[(this.anInt1649 + 10 - local54) % 10];
		}
		return local52 / (long) this.anInt1650;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
	@Override
	public int method4572(@OriginalArg(1) int arg0) {
		this.aLong53 += this.method1347();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong54 > this.aLong53) {
			Static435.method5777((this.aLong54 - this.aLong53) / 1000000L);
			this.aLong55 += this.aLong54 - this.aLong53;
			this.aLong53 += this.aLong54 - this.aLong53;
			this.aLong54 += local12;
			return 1;
		}
		@Pc(28) int local28 = 0;
		do {
			local28++;
			this.aLong54 += local12;
		} while (local28 < 10 && this.aLong54 < this.aLong53);
		if (this.aLong53 > this.aLong54) {
			this.aLong54 = this.aLong53;
		}
		return local28;
	}
}
