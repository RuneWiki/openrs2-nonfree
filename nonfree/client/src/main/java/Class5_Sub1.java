import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
	private int anInt542;

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	private int anInt538 = 1;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	private int anInt539 = 256;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
	private int anInt537 = 0;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "J")
	private long aLong35 = Static70.method1106();

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
	public Class5_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong35;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	@Override
	public void method929() {
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			this.aLongArray1[local15] = 0L;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I")
	@Override
	public int method931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt539;
		this.anInt539 = 300;
		@Pc(19) int local19 = this.anInt538;
		this.anInt538 = 1;
		this.aLong35 = Static70.method1106();
		if (this.aLongArray1[this.anInt542] == 0L) {
			this.anInt539 = local13;
			this.anInt538 = local19;
		} else if (this.aLongArray1[this.anInt542] < this.aLong35) {
			this.anInt539 = (int) ((long) (arg1 * 2560) / (this.aLong35 - this.aLongArray1[this.anInt542]));
		}
		if (this.anInt539 < 25) {
			this.anInt539 = 25;
		}
		if (this.anInt539 > 256) {
			this.anInt539 = 256;
			this.anInt538 = (int) ((long) arg1 - (this.aLong35 - this.aLongArray1[this.anInt542]) / 10L);
		}
		if (this.anInt538 > arg1) {
			this.anInt538 = arg1;
		}
		this.aLongArray1[this.anInt542] = this.aLong35;
		this.anInt542 = (this.anInt542 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt538 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray1[local136] != 0L) {
					this.aLongArray1[local136] += this.anInt538;
				}
			}
		}
		if (this.anInt538 < arg0) {
			this.anInt538 = arg0;
		}
		local136 = 0;
		Static155.method2675((long) this.anInt538);
		while (this.anInt537 < 256) {
			this.anInt537 += this.anInt539;
			local136++;
		}
		this.anInt537 &= 0xFF;
		return local136;
	}
}
