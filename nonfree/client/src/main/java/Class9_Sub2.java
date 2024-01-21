import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
	private int anInt1146;

	@OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
	private int anInt1153;

	@OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
	private int anInt1158;

	@OriginalMember(owner = "client!hc", name = "W", descriptor = "J")
	private long aLong27;

	@OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
	private int anInt1160;

	@OriginalMember(owner = "client!hc", name = "A", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class9_Sub2() {
		this.method811();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZII)I")
	@Override
	public int method812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt1146;
		@Pc(17) int local17 = this.anInt1158;
		this.anInt1158 = 1;
		this.anInt1146 = 300;
		this.aLong27 = System.currentTimeMillis();
		if (this.aLongArray5[this.anInt1160] == 0L) {
			this.anInt1158 = local17;
			this.anInt1146 = local14;
		} else if (this.aLongArray5[this.anInt1160] < this.aLong27) {
			this.anInt1146 = (int) ((long) (arg1 * 2560) / (this.aLong27 - this.aLongArray5[this.anInt1160]));
		}
		if (this.anInt1146 < 25) {
			this.anInt1146 = 25;
		}
		if (this.anInt1146 > 256) {
			this.anInt1146 = 256;
			this.anInt1158 = (int) ((long) arg1 - (this.aLong27 - this.aLongArray5[this.anInt1160]) / 10L);
		}
		if (arg1 < this.anInt1158) {
			this.anInt1158 = arg1;
		}
		this.aLongArray5[this.anInt1160] = this.aLong27;
		this.anInt1160 = (this.anInt1160 + 1) % 10;
		@Pc(137) int local137;
		if (this.anInt1158 > 1) {
			for (local137 = 0; local137 < 10; local137++) {
				if (this.aLongArray5[local137] != 0L) {
					this.aLongArray5[local137] += this.anInt1158;
				}
			}
		}
		if (this.anInt1158 < arg0) {
			this.anInt1158 = arg0;
		}
		local137 = 0;
		Static51.method1782((long) this.anInt1158);
		while (this.anInt1153 < 256) {
			local137++;
			this.anInt1153 += this.anInt1146;
		}
		this.anInt1153 &= 0xFF;
		return local137;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
	@Override
	public void method811() {
		this.anInt1158 = 1;
		this.anInt1146 = 256;
		this.anInt1153 = 0;
		this.aLong27 = System.currentTimeMillis();
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			this.aLongArray5[local15] = this.aLong27;
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
	@Override
	public void method810() {
		for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
			this.aLongArray5[local12] = 0L;
		}
	}
}
