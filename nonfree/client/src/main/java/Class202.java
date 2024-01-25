import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class202 {

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public int anInt6340;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	public int anInt6342;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public int anInt6344;

	@OriginalMember(owner = "client!ug", name = "j", descriptor = "J")
	public long aLong198;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	public int anInt6346;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
	public int anInt6348;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
	private int anInt6350;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public int anInt6351;

	@OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
	public int anInt6352;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
	public int anInt6353;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
	public int anInt6339 = 0;

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Z")
	private boolean aBoolean565 = false;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
	public int anInt6345 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLclient!ef;)V")
	private void method5342(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt6350 = arg1.method3104();
		} else if (arg0 == 2) {
			arg1.method3124();
		} else if (arg0 == 3) {
			this.anInt6352 = arg1.method3135();
			this.anInt6344 = arg1.method3135();
			this.anInt6346 = arg1.method3135();
		} else if (arg0 == 4) {
			this.anInt6347 = arg1.method3124();
			this.anInt6340 = arg1.method3135();
			return;
		} else if (arg0 == 6) {
			this.anInt6348 = arg1.method3124();
			return;
		} else if (arg0 == 8) {
			this.anInt6345 = 1;
			return;
		} else if (arg0 == 9) {
			this.anInt6339 = 1;
			return;
		} else if (arg0 == 10) {
			this.aBoolean565 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!ef;I)V")
	public void method5343(@OriginalArg(0) Class2_Sub12 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3124();
			if (local12 == 0) {
				return;
			}
			this.method5342(local12, arg0);
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public void method5346() {
		this.anInt6342 = Class101.anIntArray235[this.anInt6350 << 3];
		this.anInt6351 = (int) Math.sqrt((double) (this.anInt6352 * this.anInt6352 + this.anInt6344 * this.anInt6344 + this.anInt6346 * this.anInt6346));
		if (this.anInt6340 == 0) {
			this.anInt6340 = 1;
		}
		if (this.anInt6347 == 0) {
			this.aLong198 = 2147483647L;
		} else if (this.anInt6347 == 1) {
			this.aLong198 = this.anInt6351 * 8 / this.anInt6340;
			this.aLong198 *= this.aLong198;
		} else if (this.anInt6347 == 2) {
			this.aLong198 = this.anInt6351 * 8 / this.anInt6340;
		}
		if (this.aBoolean565) {
			this.anInt6351 *= -1;
		}
	}
}
