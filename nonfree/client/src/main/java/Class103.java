import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class103 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	private int anInt3355;

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
	public int anInt3356;

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
	public int anInt3360;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
	public int anInt3361;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	public int anInt3362;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
	public int anInt3364;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
	public int anInt3365;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "J")
	public long aLong85;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	public int anInt3367;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	public int anInt3369;

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	public int anInt3370;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
	public int anInt3366 = 0;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
	public int anInt3363 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!rg;I)V")
	private void method3022(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		if (arg0 == 1) {
			this.anInt3355 = arg1.method8571();
		} else if (arg0 == 2) {
			arg1.method8604();
		} else if (arg0 == 3) {
			this.anInt3361 = arg1.method8579();
			this.anInt3362 = arg1.method8579();
			this.anInt3364 = arg1.method8579();
		} else if (arg0 == 4) {
			this.anInt3370 = arg1.method8604();
			this.anInt3356 = arg1.method8579();
		} else if (arg0 == 6) {
			this.anInt3360 = arg1.method8604();
		} else if (arg0 == 8) {
			this.anInt3366 = 1;
		} else if (arg0 == 9) {
			this.anInt3363 = 1;
		} else if (arg0 == 10) {
			this.aBoolean242 = true;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLclient!rg;)V")
	public void method3023(@OriginalArg(1) Class6_Sub40 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8604();
			if (local9 == 0) {
				return;
			}
			this.method3022(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
	public void method3025() {
		this.anInt3365 = Class100_Sub1.anIntArray429[this.anInt3355 << 3];
		@Pc(23) long local23 = (long) this.anInt3361;
		@Pc(27) long local27 = (long) this.anInt3362;
		@Pc(31) long local31 = (long) this.anInt3364;
		this.anInt3369 = (int) Math.sqrt((double) (local27 * local27 + local23 * local23 + local31 * local31));
		if (this.anInt3356 == 0) {
			this.anInt3356 = 1;
		}
		if (this.anInt3370 == 0) {
			this.aLong85 = 2147483647L;
		} else if (this.anInt3370 == 1) {
			this.aLong85 = (long) (this.anInt3369 * 8 / this.anInt3356);
			this.aLong85 *= this.aLong85;
		} else if (this.anInt3370 == 2) {
			this.aLong85 = (long) (this.anInt3369 * 8 / this.anInt3356);
		}
		if (this.aBoolean242) {
			this.anInt3369 *= -1;
		}
	}
}
