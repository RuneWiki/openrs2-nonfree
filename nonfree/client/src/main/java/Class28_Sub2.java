import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class28_Sub2 extends Class28 {

	@OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
	private int anInt4100;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "[J")
	private final long[] aLongArray49 = new long[10];

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
	private int anInt4095 = 0;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	private int anInt4093 = 1;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
	private int anInt4092 = 256;

	@OriginalMember(owner = "client!wf", name = "v", descriptor = "J")
	private long aLong146 = Static149.method2559();

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
	public Class28_Sub2() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray49[local22] = this.aLong146;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZII)I")
	@Override
	public int method3135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt4092;
		@Pc(11) int local11 = this.anInt4093;
		this.anInt4093 = 1;
		this.anInt4092 = 300;
		this.aLong146 = Static149.method2559();
		if (this.aLongArray49[this.anInt4100] == 0L) {
			this.anInt4093 = local11;
			this.anInt4092 = local8;
		} else if (this.aLongArray49[this.anInt4100] < this.aLong146) {
			this.anInt4092 = (int) ((long) (arg1 * 2560) / (this.aLong146 - this.aLongArray49[this.anInt4100]));
		}
		if (this.anInt4092 < 25) {
			this.anInt4092 = 25;
		}
		if (this.anInt4092 > 256) {
			this.anInt4092 = 256;
			this.anInt4093 = (int) ((long) arg1 - (this.aLong146 - this.aLongArray49[this.anInt4100]) / 10L);
		}
		if (this.anInt4093 > arg1) {
			this.anInt4093 = arg1;
		}
		this.aLongArray49[this.anInt4100] = this.aLong146;
		this.anInt4100 = (this.anInt4100 + 1) % 10;
		@Pc(137) int local137;
		if (this.anInt4093 > 1) {
			for (local137 = 0; local137 < 10; local137++) {
				if (this.aLongArray49[local137] != 0L) {
					this.aLongArray49[local137] += this.anInt4093;
				}
			}
		}
		if (arg0 > this.anInt4093) {
			this.anInt4093 = arg0;
		}
		Static52.method1025((long) this.anInt4093);
		local137 = 0;
		while (this.anInt4095 < 256) {
			local137++;
			this.anInt4095 += this.anInt4092;
		}
		this.anInt4095 &= 0xFF;
		return local137;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	@Override
	public void method3131() {
		for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
			this.aLongArray49[local1] = 0L;
		}
	}
}
