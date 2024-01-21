import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class33_Sub2 extends Class33 {

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
	private int anInt2279;

	@OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
	private int anInt2283;

	@OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
	private int anInt2284;

	@OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
	private int anInt2286;

	@OriginalMember(owner = "client!oe", name = "K", descriptor = "[J")
	private final long[] aLongArray25 = new long[10];

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class33_Sub2() {
		this.method1517();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
	@Override
	public int method1520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt2286;
		this.anInt2286 = 300;
		@Pc(14) int local14 = this.anInt2279;
		this.anInt2279 = 1;
		this.aLong61 = Static38.method694();
		if (this.aLongArray25[this.anInt2284] == 0L) {
			this.anInt2286 = local8;
			this.anInt2279 = local14;
		} else if (this.aLongArray25[this.anInt2284] < this.aLong61) {
			this.anInt2286 = (int) ((long) (arg1 * 2560) / (this.aLong61 - this.aLongArray25[this.anInt2284]));
		}
		if (this.anInt2286 < 25) {
			this.anInt2286 = 25;
		}
		if (this.anInt2286 > 256) {
			this.anInt2286 = 256;
			this.anInt2279 = (int) ((long) arg1 - (this.aLong61 - this.aLongArray25[this.anInt2284]) / 10L);
		}
		if (this.anInt2279 > arg1) {
			this.anInt2279 = arg1;
		}
		this.aLongArray25[this.anInt2284] = this.aLong61;
		this.anInt2284 = (this.anInt2284 + 1) % 10;
		@Pc(130) int local130;
		if (this.anInt2279 > 1) {
			for (local130 = 0; local130 < 10; local130++) {
				if (this.aLongArray25[local130] != 0L) {
					this.aLongArray25[local130] -= -((long) this.anInt2279);
				}
			}
		}
		local130 = 0;
		if (this.anInt2279 < arg0) {
			this.anInt2279 = arg0;
		}
		Static68.method1266((long) this.anInt2279);
		while (this.anInt2283 < 256) {
			local130++;
			this.anInt2283 += this.anInt2286;
		}
		this.anInt2283 &= 0xFF;
		return local130;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	@Override
	public void method1517() {
		this.anInt2283 = 0;
		this.anInt2286 = 256;
		this.anInt2279 = 1;
		this.aLong61 = Static38.method694();
		for (@Pc(27) int local27 = 0; local27 < 10; local27++) {
			this.aLongArray25[local27] = this.aLong61;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
	@Override
	public void method1516() {
		for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
			this.aLongArray25[local3] = 0L;
		}
	}
}
