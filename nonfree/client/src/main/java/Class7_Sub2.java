import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
	private int anInt318;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "J")
	private long aLong15;

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
	private int anInt325;

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "[J")
	private final long[] aLongArray2 = new long[10];

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class7_Sub2() {
		this.method242();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
	@Override
	public void method242() {
		this.anInt325 = 256;
		this.anInt318 = 1;
		this.anInt314 = 0;
		this.aLong15 = System.currentTimeMillis();
		for (@Pc(25) int local25 = 0; local25 < 10; local25++) {
			this.aLongArray2[local25] = this.aLong15;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
	@Override
	public void method244() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray2[local3] = 0L;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I")
	@Override
	public int method241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) int local4 = this.anInt325;
		this.anInt325 = 300;
		@Pc(14) int local14 = this.anInt318;
		this.anInt318 = 1;
		this.aLong15 = System.currentTimeMillis();
		if (this.aLongArray2[this.anInt316] == 0L) {
			this.anInt325 = local4;
			this.anInt318 = local14;
		} else if (this.aLongArray2[this.anInt316] < this.aLong15) {
			this.anInt325 = (int) ((long) (arg1 * 2560) / (this.aLong15 - this.aLongArray2[this.anInt316]));
		}
		if (this.anInt325 < 25) {
			this.anInt325 = 25;
		}
		if (this.anInt325 > 256) {
			this.anInt325 = 256;
			this.anInt318 = (int) ((long) arg1 - (this.aLong15 - this.aLongArray2[this.anInt316]) / 10L);
		}
		if (this.anInt318 > arg1) {
			this.anInt318 = arg1;
		}
		this.aLongArray2[this.anInt316] = this.aLong15;
		this.anInt316 = (this.anInt316 + 1) % 10;
		@Pc(129) int local129;
		if (this.anInt318 > 1) {
			for (local129 = 0; local129 < 10; local129++) {
				if (this.aLongArray2[local129] != 0L) {
					this.aLongArray2[local129] += this.anInt318;
				}
			}
		}
		local129 = 0;
		if (arg0 > this.anInt318) {
			this.anInt318 = arg0;
		}
		Static93.method1123((long) this.anInt318);
		while (this.anInt314 < 256) {
			this.anInt314 += this.anInt325;
			local129++;
		}
		this.anInt314 &= 0xFF;
		return local129;
	}
}
