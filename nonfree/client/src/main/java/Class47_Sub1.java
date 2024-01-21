import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class47_Sub1 extends Class47 {

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
	private int anInt1728;

	@OriginalMember(owner = "client!lb", name = "D", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
	private int anInt1733 = 0;

	@OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
	private int anInt1724 = 256;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
	private int anInt1729 = 1;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "J")
	private long aLong58 = Static102.method1742();

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
	public Class47_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray5[local22] = this.aLong58;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	@Override
	public void method1290() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray5[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIB)I")
	@Override
	public int method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anInt1724;
		this.anInt1724 = 300;
		@Pc(14) int local14 = this.anInt1729;
		this.anInt1729 = 1;
		this.aLong58 = Static102.method1742();
		if (this.aLongArray5[this.anInt1728] == 0L) {
			this.anInt1724 = local4;
			this.anInt1729 = local14;
		} else if (this.aLongArray5[this.anInt1728] < this.aLong58) {
			this.anInt1724 = (int) ((long) (arg0 * 2560) / (this.aLong58 - this.aLongArray5[this.anInt1728]));
		}
		if (this.anInt1724 < 25) {
			this.anInt1724 = 25;
		}
		if (this.anInt1724 > 256) {
			this.anInt1724 = 256;
			this.anInt1729 = (int) ((long) arg0 - (this.aLong58 - this.aLongArray5[this.anInt1728]) / 10L);
		}
		if (arg0 < this.anInt1729) {
			this.anInt1729 = arg0;
		}
		this.aLongArray5[this.anInt1728] = this.aLong58;
		this.anInt1728 = (this.anInt1728 + 1) % 10;
		@Pc(131) int local131;
		if (this.anInt1729 > 1) {
			for (local131 = 0; local131 < 10; local131++) {
				if (this.aLongArray5[local131] != 0L) {
					this.aLongArray5[local131] += this.anInt1729;
				}
			}
		}
		local131 = 0;
		if (arg1 > this.anInt1729) {
			this.anInt1729 = arg1;
		}
		Static118.method1893((long) this.anInt1729);
		while (this.anInt1733 < 256) {
			this.anInt1733 += this.anInt1724;
			local131++;
		}
		this.anInt1733 &= 0xFF;
		return local131;
	}
}
