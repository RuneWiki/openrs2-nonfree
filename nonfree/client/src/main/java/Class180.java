import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class180 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "I")
	public int anInt5331;

	@OriginalMember(owner = "client!np", name = "b", descriptor = "I")
	public int anInt5332;

	@OriginalMember(owner = "client!np", name = "c", descriptor = "I")
	public int anInt5333;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "I")
	private int anInt5334;

	@OriginalMember(owner = "client!np", name = "j", descriptor = "I")
	public int anInt5340;

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	public int anInt5341;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	public int anInt5342;

	@OriginalMember(owner = "client!np", name = "o", descriptor = "I")
	public int anInt5344;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	public int anInt5345;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "I")
	public int anInt5346;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "J")
	public long aLong144;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	public int anInt5347 = 0;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "I")
	public int anInt5343 = 0;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "Z")
	private boolean aBoolean334 = false;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLclient!ia;)V")
	public void method4084(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1171();
			if (local15 == 0) {
				return;
			}
			this.method4088(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public void method4087() {
		this.anInt5346 = Class90_Sub1.anIntArray303[this.anInt5334 << 3];
		this.anInt5344 = (int) Math.sqrt((double) (this.anInt5332 * this.anInt5332 + this.anInt5340 * this.anInt5340 + this.anInt5345 * this.anInt5345));
		if (this.anInt5341 == 0) {
			this.anInt5341 = 1;
		}
		if (this.anInt5333 == 0) {
			this.aLong144 = 2147483647L;
		} else if (this.anInt5333 == 1) {
			this.aLong144 = this.anInt5344 * 8 / this.anInt5341;
			this.aLong144 *= this.aLong144;
		} else if (this.anInt5333 == 2) {
			this.aLong144 = this.anInt5344 * 8 / this.anInt5341;
		}
		if (this.aBoolean334) {
			this.anInt5344 *= -1;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!ia;I)V")
	private void method4088(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt5334 = arg1.method1177();
		} else if (arg0 == 2) {
			arg1.method1171();
		} else if (arg0 == 3) {
			this.anInt5340 = arg1.method1188();
			this.anInt5345 = arg1.method1188();
			this.anInt5332 = arg1.method1188();
		} else if (arg0 == 4) {
			this.anInt5333 = arg1.method1171();
			this.anInt5341 = arg1.method1188();
		} else if (arg0 == 6) {
			this.anInt5342 = arg1.method1171();
		} else if (arg0 == 8) {
			this.anInt5347 = 1;
		} else if (arg0 == 9) {
			this.anInt5343 = 1;
		} else if (arg0 == 10) {
			this.aBoolean334 = true;
		}
	}
}
