import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	private int anInt1838;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "[J")
	private final long[] aLongArray4 = new long[10];

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
	private int anInt1835 = 1;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
	private int anInt1836 = 256;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
	private int anInt1837 = 0;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "J")
	private long aLong52 = Static1.method2();

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class29_Sub1() {
		for (@Pc(22) int local22 = 0; local22 < 10; local22++) {
			this.aLongArray4[local22] = this.aLong52;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	@Override
	public int method3259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt1836;
		this.anInt1836 = 300;
		@Pc(19) int local19 = this.anInt1835;
		this.anInt1835 = 1;
		this.aLong52 = Static1.method2();
		if (this.aLongArray4[this.anInt1838] == 0L) {
			this.anInt1836 = local4;
			this.anInt1835 = local19;
		} else if (this.aLong52 > this.aLongArray4[this.anInt1838]) {
			this.anInt1836 = (int) ((long) (arg1 * 2560) / (this.aLong52 - this.aLongArray4[this.anInt1838]));
		}
		if (this.anInt1836 < 25) {
			this.anInt1836 = 25;
		}
		if (this.anInt1836 > 256) {
			this.anInt1836 = 256;
			this.anInt1835 = (int) ((long) arg1 - (this.aLong52 - this.aLongArray4[this.anInt1838]) / 10L);
		}
		if (arg1 < this.anInt1835) {
			this.anInt1835 = arg1;
		}
		this.aLongArray4[this.anInt1838] = this.aLong52;
		this.anInt1838 = (this.anInt1838 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt1835 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray4[local136] != 0L) {
					this.aLongArray4[local136] -= -((long) this.anInt1835);
				}
			}
		}
		if (this.anInt1835 < arg0) {
			this.anInt1835 = arg0;
		}
		local136 = 0;
		Static85.method1993((long) this.anInt1835);
		while (this.anInt1837 < 256) {
			local136++;
			this.anInt1837 += this.anInt1836;
		}
		this.anInt1837 &= 0xFF;
		return local136;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	@Override
	public void method3261() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray4[local3] = 0L;
		}
	}
}
