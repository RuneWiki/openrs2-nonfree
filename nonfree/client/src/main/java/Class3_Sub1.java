import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	private int anInt47;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
	private int anInt55 = 256;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	private int anInt49 = 1;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
	private int anInt54 = 0;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "J")
	private long aLong1 = Static27.method497();

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray1[local22] = this.aLong1;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	@Override
	public void method1484() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray1[local3] = 0L;
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)I")
	@Override
	public int method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt55;
		@Pc(13) int local13 = this.anInt49;
		this.anInt55 = 300;
		this.anInt49 = 1;
		this.aLong1 = Static27.method497();
		if (this.aLongArray1[this.anInt47] == 0L) {
			this.anInt55 = local10;
			this.anInt49 = local13;
		} else if (this.aLong1 > this.aLongArray1[this.anInt47]) {
			this.anInt55 = (int) ((long) (arg1 * 2560) / (this.aLong1 - this.aLongArray1[this.anInt47]));
		}
		if (this.anInt55 < 25) {
			this.anInt55 = 25;
		}
		if (this.anInt55 > 256) {
			this.anInt55 = 256;
			this.anInt49 = (int) ((long) arg1 - (this.aLong1 - this.aLongArray1[this.anInt47]) / 10L);
		}
		if (this.anInt49 > arg1) {
			this.anInt49 = arg1;
		}
		this.aLongArray1[this.anInt47] = this.aLong1;
		this.anInt47 = (this.anInt47 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt49 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray1[local136] != 0L) {
					this.aLongArray1[local136] += this.anInt49;
				}
			}
		}
		if (arg0 > this.anInt49) {
			this.anInt49 = arg0;
		}
		local136 = 0;
		Static107.method1511((long) this.anInt49);
		while (this.anInt54 < 256) {
			local136++;
			this.anInt54 += this.anInt55;
		}
		this.anInt54 &= 0xFF;
		return local136;
	}
}
