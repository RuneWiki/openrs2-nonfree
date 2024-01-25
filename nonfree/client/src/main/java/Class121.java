import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class121 {

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
	public int anInt3345;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
	public int anInt3346;

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
	private int anInt3347;

	@OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
	public int anInt3348;

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
	public int anInt3349;

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
	public int anInt3350;

	@OriginalMember(owner = "client!gca", name = "j", descriptor = "I")
	public int anInt3353;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
	public int anInt3356;

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
	public int anInt3358;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "J")
	public long aLong94;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
	public int anInt3361;

	@OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
	public int anInt3355 = 0;

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
	public int anInt3359 = 0;

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "Z")
	private boolean aBoolean245 = false;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	public void method2884() {
		this.anInt3361 = Class3_Sub13.anIntArray146[this.anInt3347 << 3];
		@Pc(17) long local17 = (long) this.anInt3353;
		@Pc(21) long local21 = (long) this.anInt3356;
		@Pc(25) long local25 = (long) this.anInt3348;
		this.anInt3345 = (int) Math.sqrt((double) (local25 * local25 + local17 * local17 + local21 * local21));
		if (this.anInt3349 == 0) {
			this.anInt3349 = 1;
		}
		if (this.anInt3350 == 0) {
			this.aLong94 = 2147483647L;
		} else if (this.anInt3350 == 1) {
			this.aLong94 = (long) (this.anInt3345 * 8 / this.anInt3349);
			this.aLong94 *= this.aLong94;
		} else if (this.anInt3350 == 2) {
			this.aLong94 = (long) (this.anInt3345 * 8 / this.anInt3349);
		}
		if (this.aBoolean245) {
			this.anInt3345 *= -1;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!dc;)V")
	public void method2885(@OriginalArg(1) Class3_Sub9 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5633();
			if (local11 == 0) {
				return;
			}
			this.method2886(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!dc;B)V")
	private void method2886(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt3347 = arg1.method5610();
		} else if (arg0 == 2) {
			arg1.method5633();
		} else if (arg0 == 3) {
			this.anInt3353 = arg1.method5585();
			this.anInt3356 = arg1.method5585();
			this.anInt3348 = arg1.method5585();
		} else if (arg0 == 4) {
			this.anInt3350 = arg1.method5633();
			this.anInt3349 = arg1.method5585();
		} else if (arg0 == 6) {
			this.anInt3358 = arg1.method5633();
		} else if (arg0 == 8) {
			this.anInt3355 = 1;
		} else if (arg0 == 9) {
			this.anInt3359 = 1;
		} else if (arg0 == 10) {
			this.aBoolean245 = true;
		}
	}
}
