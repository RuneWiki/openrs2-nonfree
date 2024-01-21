import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class37_Sub1 extends Class37 {

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	private int anInt1354;

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
	private int anInt1356;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
	private int anInt1358;

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "I")
	private int anInt1363;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "[J")
	private final long[] aLongArray3 = new long[10];

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class37_Sub1() {
		this.method1695();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)I")
	@Override
	public int method1696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt1363;
		@Pc(11) int local11 = this.anInt1354;
		this.anInt1354 = 300;
		this.anInt1363 = 1;
		this.aLong46 = Static3.method125();
		if (this.aLongArray3[this.anInt1356] == 0L) {
			this.anInt1354 = local11;
			this.anInt1363 = local8;
		} else if (this.aLong46 > this.aLongArray3[this.anInt1356]) {
			this.anInt1354 = (int) ((long) (arg1 * 2560) / (this.aLong46 - this.aLongArray3[this.anInt1356]));
		}
		if (this.anInt1354 < 25) {
			this.anInt1354 = 25;
		}
		if (this.anInt1354 > 256) {
			this.anInt1354 = 256;
			this.anInt1363 = (int) ((long) arg1 - (this.aLong46 - this.aLongArray3[this.anInt1356]) / 10L);
		}
		if (this.anInt1363 > arg1) {
			this.anInt1363 = arg1;
		}
		this.aLongArray3[this.anInt1356] = this.aLong46;
		this.anInt1356 = (this.anInt1356 + 1) % 10;
		@Pc(137) int local137;
		if (this.anInt1363 > 1) {
			for (local137 = 0; local137 < 10; local137++) {
				if (this.aLongArray3[local137] != 0L) {
					this.aLongArray3[local137] += this.anInt1363;
				}
			}
		}
		if (arg0 > this.anInt1363) {
			this.anInt1363 = arg0;
		}
		Static74.method1220((long) this.anInt1363);
		local137 = 0;
		while (this.anInt1358 < 256) {
			local137++;
			this.anInt1358 += this.anInt1354;
		}
		this.anInt1358 &= 0xFF;
		return local137;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	@Override
	public void method1695() {
		this.anInt1354 = 256;
		this.anInt1363 = 1;
		this.anInt1358 = 0;
		this.aLong46 = Static3.method125();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray3[local24] = this.aLong46;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	@Override
	public void method1691() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray3[local3] = 0L;
		}
	}
}
