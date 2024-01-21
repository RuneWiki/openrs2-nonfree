import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	private int anInt1403;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	private int anInt1409;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	private int anInt1411;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!j", name = "N", descriptor = "I")
	private int anInt1412;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
	public Class8_Sub2() {
		this.method834();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	@Override
	public void method838() {
		for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
			this.aLongArray5[local13] = 0L;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
	@Override
	public void method834() {
		this.anInt1403 = 0;
		this.anInt1412 = 1;
		this.anInt1411 = 256;
		this.aLong41 = Static76.method1306();
		for (@Pc(24) int local24 = 0; local24 < 10; local24++) {
			this.aLongArray5[local24] = this.aLong41;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)I")
	@Override
	public int method831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt1411;
		@Pc(11) int local11 = this.anInt1412;
		this.anInt1411 = 300;
		this.anInt1412 = 1;
		this.aLong41 = Static76.method1306();
		if (this.aLongArray5[this.anInt1409] == 0L) {
			this.anInt1411 = local4;
			this.anInt1412 = local11;
		} else if (this.aLong41 > this.aLongArray5[this.anInt1409]) {
			this.anInt1411 = (int) ((long) (arg0 * 2560) / (this.aLong41 - this.aLongArray5[this.anInt1409]));
		}
		if (this.anInt1411 < 25) {
			this.anInt1411 = 25;
		}
		if (this.anInt1411 > 256) {
			this.anInt1411 = 256;
			this.anInt1412 = (int) ((long) arg0 - (this.aLong41 - this.aLongArray5[this.anInt1409]) / 10L);
		}
		if (arg0 < this.anInt1412) {
			this.anInt1412 = arg0;
		}
		this.aLongArray5[this.anInt1409] = this.aLong41;
		this.anInt1409 = (this.anInt1409 + 1) % 10;
		@Pc(138) int local138;
		if (this.anInt1412 > 1) {
			for (local138 = 0; local138 < 10; local138++) {
				if (this.aLongArray5[local138] != 0L) {
					this.aLongArray5[local138] += this.anInt1412;
				}
			}
		}
		if (arg1 > this.anInt1412) {
			this.anInt1412 = arg1;
		}
		local138 = 0;
		Static34.method698((long) this.anInt1412);
		while (this.anInt1403 < 256) {
			this.anInt1403 += this.anInt1411;
			local138++;
		}
		this.anInt1403 &= 0xFF;
		return local138;
	}
}
