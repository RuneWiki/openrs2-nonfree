import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!o", name = "s", descriptor = "I")
	private int anInt2171;

	@OriginalMember(owner = "client!o", name = "w", descriptor = "I")
	private int anInt2174;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "I")
	private int anInt2177;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	private int anInt2182;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class56_Sub1() {
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)I")
	@Override
	public int method2002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt2171;
		@Pc(12) int local12 = this.anInt2182;
		this.anInt2182 = 1;
		this.anInt2171 = 300;
		this.aLong58 = Static89.method1607();
		if (this.aLongArray4[this.anInt2177] == 0L) {
			this.anInt2182 = local12;
			this.anInt2171 = local9;
		} else if (this.aLong58 > this.aLongArray4[this.anInt2177]) {
			this.anInt2171 = (int) ((long) (arg1 * 2560) / (this.aLong58 - this.aLongArray4[this.anInt2177]));
		}
		if (this.anInt2171 < 25) {
			this.anInt2171 = 25;
		}
		if (this.anInt2171 > 256) {
			this.anInt2171 = 256;
			this.anInt2182 = (int) ((long) arg1 - (this.aLong58 - this.aLongArray4[this.anInt2177]) / 10L);
		}
		if (arg1 < this.anInt2182) {
			this.anInt2182 = arg1;
		}
		this.aLongArray4[this.anInt2177] = this.aLong58;
		this.anInt2177 = (this.anInt2177 + 1) % 10;
		@Pc(138) int local138;
		if (this.anInt2182 > 1) {
			for (local138 = 0; local138 < 10; local138++) {
				if (this.aLongArray4[local138] != 0L) {
					this.aLongArray4[local138] += this.anInt2182;
				}
			}
		}
		local138 = 0;
		if (this.anInt2182 < arg0) {
			this.anInt2182 = arg0;
		}
		Static53.method2063((long) this.anInt2182);
		while (this.anInt2174 < 256) {
			local138++;
			this.anInt2174 += this.anInt2171;
		}
		this.anInt2174 &= 0xFF;
		return local138;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	@Override
	public void method2004() {
		this.anInt2182 = 1;
		this.anInt2171 = 256;
		this.anInt2174 = 0;
		this.aLong58 = Static89.method1607();
		for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
			this.aLongArray4[local25] = this.aLong58;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
	@Override
	public void method2001() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray4[local3] = 0L;
		}
	}
}
