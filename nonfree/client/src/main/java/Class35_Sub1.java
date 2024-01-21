import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
	private int anInt1462;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	private int anInt1451 = 256;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
	private int anInt1453 = 1;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
	private int anInt1461 = 0;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "J")
	private long aLong66 = Static124.method1828();

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class35_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray4[local22] = this.aLong66;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIB)I")
	@Override
	public int method2687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anInt1451;
		this.anInt1451 = 300;
		@Pc(14) int local14 = this.anInt1453;
		this.anInt1453 = 1;
		this.aLong66 = Static124.method1828();
		if (this.aLongArray4[this.anInt1462] == 0L) {
			this.anInt1453 = local14;
			this.anInt1451 = local4;
		} else if (this.aLongArray4[this.anInt1462] < this.aLong66) {
			this.anInt1451 = (int) ((long) (arg1 * 2560) / (this.aLong66 - this.aLongArray4[this.anInt1462]));
		}
		if (this.anInt1451 < 25) {
			this.anInt1451 = 25;
		}
		if (this.anInt1451 > 256) {
			this.anInt1451 = 256;
			this.anInt1453 = (int) ((long) arg1 - (this.aLong66 - this.aLongArray4[this.anInt1462]) / 10L);
		}
		if (this.anInt1453 > arg1) {
			this.anInt1453 = arg1;
		}
		this.aLongArray4[this.anInt1462] = this.aLong66;
		this.anInt1462 = (this.anInt1462 + 1) % 10;
		@Pc(140) int local140;
		if (this.anInt1453 > 1) {
			for (local140 = 0; local140 < 10; local140++) {
				if (this.aLongArray4[local140] != 0L) {
					this.aLongArray4[local140] -= -((long) this.anInt1453);
				}
			}
		}
		if (this.anInt1453 < arg0) {
			this.anInt1453 = arg0;
		}
		Static199.method3292((long) this.anInt1453);
		local140 = 0;
		while (this.anInt1461 < 256) {
			this.anInt1461 += this.anInt1451;
			local140++;
		}
		this.anInt1461 &= 0xFF;
		return local140;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	@Override
	public void method2689() {
		for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
			this.aLongArray4[local13] = 0L;
		}
	}
}
