import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	private int anInt49;

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
	private int anInt57;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "J")
	private long aLong1;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
	private int anInt63;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
	private int anInt64;

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
	public Class2_Sub1() {
		this.method1327();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	@Override
	public void method1327() {
		this.anInt64 = 0;
		this.anInt63 = 256;
		this.anInt49 = 1;
		this.aLong1 = System.currentTimeMillis();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray1[local24] = this.aLong1;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)I")
	@Override
	public int method1324(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt49;
		this.anInt49 = 1;
		@Pc(14) int local14 = this.anInt63;
		this.anInt63 = 300;
		this.aLong1 = System.currentTimeMillis();
		if (this.aLongArray1[this.anInt57] == 0L) {
			this.anInt49 = local8;
			this.anInt63 = local14;
		} else if (this.aLong1 > this.aLongArray1[this.anInt57]) {
			this.anInt63 = (int) ((long) (arg0 * 2560) / (this.aLong1 - this.aLongArray1[this.anInt57]));
		}
		if (this.anInt63 < 25) {
			this.anInt63 = 25;
		}
		if (this.anInt63 > 256) {
			this.anInt63 = 256;
			this.anInt49 = (int) ((long) arg0 - (this.aLong1 - this.aLongArray1[this.anInt57]) / 10L);
		}
		if (arg0 < this.anInt49) {
			this.anInt49 = arg0;
		}
		this.aLongArray1[this.anInt57] = this.aLong1;
		this.anInt57 = (this.anInt57 + 1) % 10;
		@Pc(140) int local140;
		if (this.anInt49 > 1) {
			for (local140 = 0; local140 < 10; local140++) {
				if (this.aLongArray1[local140] != 0L) {
					this.aLongArray1[local140] += this.anInt49;
				}
			}
		}
		if (arg1 > this.anInt49) {
			this.anInt49 = arg1;
		}
		local140 = 0;
		Static24.method505((long) this.anInt49);
		while (this.anInt64 < 256) {
			this.anInt64 += this.anInt63;
			local140++;
		}
		this.anInt64 &= 0xFF;
		return local140;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	@Override
	public void method1326() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray1[local3] = 0L;
		}
	}
}
