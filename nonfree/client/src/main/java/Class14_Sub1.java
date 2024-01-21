import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dd")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!dd", name = "I", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
	private int anInt636 = 0;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	private int anInt633 = 1;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	private int anInt631 = 256;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "J")
	private long aLong15 = Static125.method2075();

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class14_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray2[local22] = this.aLong15;
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)I")
	@Override
	public int method892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt631;
		this.anInt631 = 300;
		@Pc(14) int local14 = this.anInt633;
		this.anInt633 = 1;
		this.aLong15 = Static125.method2075();
		if (this.aLongArray2[this.anInt640] == 0L) {
			this.anInt631 = local8;
			this.anInt633 = local14;
		} else if (this.aLongArray2[this.anInt640] < this.aLong15) {
			this.anInt631 = (int) ((long) (arg0 * 2560) / (this.aLong15 - this.aLongArray2[this.anInt640]));
		}
		if (this.anInt631 < 25) {
			this.anInt631 = 25;
		}
		if (this.anInt631 > 256) {
			this.anInt631 = 256;
			this.anInt633 = (int) ((long) arg0 - (this.aLong15 - this.aLongArray2[this.anInt640]) / 10L);
		}
		if (arg0 < this.anInt633) {
			this.anInt633 = arg0;
		}
		this.aLongArray2[this.anInt640] = this.aLong15;
		this.anInt640 = (this.anInt640 + 1) % 10;
		@Pc(129) int local129;
		if (this.anInt633 > 1) {
			for (local129 = 0; local129 < 10; local129++) {
				if (this.aLongArray2[local129] != 0L) {
					this.aLongArray2[local129] -= -((long) this.anInt633);
				}
			}
		}
		if (this.anInt633 < arg1) {
			this.anInt633 = arg1;
		}
		local129 = 0;
		Static85.method1582((long) this.anInt633);
		while (this.anInt636 < 256) {
			this.anInt636 += this.anInt631;
			local129++;
		}
		this.anInt636 &= 0xFF;
		return local129;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	@Override
	public void method897() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray2[local3] = 0L;
		}
	}
}
