import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
	private int anInt978;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
	private int anInt974 = 256;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
	private int anInt971 = 1;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	private int anInt976 = 0;

	@OriginalMember(owner = "client!ef", name = "w", descriptor = "J")
	private long aLong34 = Static86.method1251();

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class20_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray3[local22] = this.aLong34;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	@Override
	public void method1226() {
		for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
			this.aLongArray3[local11] = 0L;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII)I")
	@Override
	public int method1229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt971;
		@Pc(11) int local11 = this.anInt974;
		this.anInt971 = 1;
		this.anInt974 = 300;
		this.aLong34 = Static86.method1251();
		if (this.aLongArray3[this.anInt978] == 0L) {
			this.anInt971 = local8;
			this.anInt974 = local11;
		} else if (this.aLongArray3[this.anInt978] < this.aLong34) {
			this.anInt974 = (int) ((long) (arg0 * 2560) / (this.aLong34 - this.aLongArray3[this.anInt978]));
		}
		if (this.anInt974 < 25) {
			this.anInt974 = 25;
		}
		if (this.anInt974 > 256) {
			this.anInt974 = 256;
			this.anInt971 = (int) ((long) arg0 - (this.aLong34 - this.aLongArray3[this.anInt978]) / 10L);
		}
		if (this.anInt971 > arg0) {
			this.anInt971 = arg0;
		}
		this.aLongArray3[this.anInt978] = this.aLong34;
		this.anInt978 = (this.anInt978 + 1) % 10;
		@Pc(125) int local125;
		if (this.anInt971 > 1) {
			for (local125 = 0; local125 < 10; local125++) {
				if (this.aLongArray3[local125] != 0L) {
					this.aLongArray3[local125] -= -((long) this.anInt971);
				}
			}
		}
		if (this.anInt971 < arg1) {
			this.anInt971 = arg1;
		}
		Static135.method2059((long) this.anInt971);
		local125 = 0;
		while (this.anInt976 < 256) {
			this.anInt976 += this.anInt974;
			local125++;
		}
		this.anInt976 &= 0xFF;
		return local125;
	}
}
