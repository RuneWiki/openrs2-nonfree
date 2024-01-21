import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	private int anInt1443;

	@OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
	private int anInt1449;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
	private int anInt1451;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
	private int anInt1456;

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "[J")
	private final long[] aLongArray20 = new long[10];

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class22_Sub2() {
		this.method900();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
	@Override
	public int method898(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt1456;
		this.anInt1456 = 300;
		@Pc(14) int local14 = this.anInt1443;
		this.anInt1443 = 1;
		this.aLong35 = Static82.method1454();
		if (this.aLongArray20[this.anInt1449] == 0L) {
			this.anInt1443 = local14;
			this.anInt1456 = local8;
		} else if (this.aLong35 > this.aLongArray20[this.anInt1449]) {
			this.anInt1456 = (int) ((long) (arg0 * 2560) / (this.aLong35 - this.aLongArray20[this.anInt1449]));
		}
		if (this.anInt1456 < 25) {
			this.anInt1456 = 25;
		}
		if (this.anInt1456 > 256) {
			this.anInt1456 = 256;
			this.anInt1443 = (int) ((long) arg0 - (this.aLong35 - this.aLongArray20[this.anInt1449]) / 10L);
		}
		if (arg0 < this.anInt1443) {
			this.anInt1443 = arg0;
		}
		this.aLongArray20[this.anInt1449] = this.aLong35;
		this.anInt1449 = (this.anInt1449 + 1) % 10;
		if (this.anInt1443 > 1) {
			for (@Pc(128) int local128 = 0; local128 < 10; local128++) {
				if (this.aLongArray20[local128] != 0L) {
					this.aLongArray20[local128] -= -((long) this.anInt1443);
				}
			}
		}
		if (this.anInt1443 < arg1) {
			this.anInt1443 = arg1;
		}
		Static39.method862((long) this.anInt1443);
		@Pc(182) int local182 = 0;
		while (this.anInt1451 < 256) {
			this.anInt1451 += this.anInt1456;
			local182++;
		}
		this.anInt1451 &= 0xFF;
		return local182;
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	@Override
	public void method900() {
		this.anInt1451 = 0;
		this.anInt1443 = 1;
		this.anInt1456 = 256;
		this.aLong35 = Static82.method1454();
		for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
			this.aLongArray20[local20] = this.aLong35;
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	@Override
	public void method901() {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			this.aLongArray20[local1] = 0L;
		}
	}
}
