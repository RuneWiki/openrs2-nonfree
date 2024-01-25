import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public abstract class Class90_Sub1 extends Class90 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	protected int anInt4540;

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	protected int anInt4543;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	protected int anInt4546;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "[I")
	private int[] anIntArray581;

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
	protected int anInt4568;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "Lclient!kp;")
	protected final Class2_Sub2 aClass2_Sub2_8;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
	protected final int anInt4565;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	protected final int anInt4558;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!kp;II)V")
	protected Class90_Sub1(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass2_Sub2_8 = arg0;
		this.anInt4565 = arg1;
		this.anInt4558 = arg2;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "()I")
	@Override
	public final int method5467() {
		return this.anInt4543 + this.anInt4558 + this.anInt4546;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFF)V")
	private void method4192(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt4568 + this.anInt4565 + this.anInt4540;
		@Pc(17) int local17 = this.anInt4543 + this.anInt4558 + this.anInt4546;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt4565 || local17 != this.anInt4558) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt4543;
			local65 = local53 * (float) this.anInt4543;
			local71 = local32 * (float) this.anInt4568;
			local77 = local39 * (float) this.anInt4568;
			@Pc(84) float local84 = -local32 * (float) this.anInt4540;
			@Pc(91) float local91 = -local39 * (float) this.anInt4540;
			@Pc(98) float local98 = -local46 * (float) this.anInt4546;
			@Pc(105) float local105 = -local53 * (float) this.anInt4546;
			arg0 += local71 + local59;
			arg1 += local77 + local65;
			arg2 += local84 + local59;
			arg3 += local91 + local65;
			arg4 += local71 + local98;
			arg5 += local77 + local105;
		}
		local32 = arg4 + arg2 - arg0;
		local39 = arg3 + arg5 - arg1;
		if (arg0 < arg2) {
			local46 = arg0;
			local53 = arg2;
		} else {
			local46 = arg2;
			local53 = arg0;
		}
		if (arg4 < local46) {
			local46 = arg4;
		}
		if (local32 < local46) {
			local46 = local32;
		}
		if (arg4 > local53) {
			local53 = arg4;
		}
		if (local32 > local53) {
			local53 = local32;
		}
		if (arg1 < arg3) {
			local59 = arg1;
			local65 = arg3;
		} else {
			local59 = arg3;
			local65 = arg1;
		}
		if (arg5 < local59) {
			local59 = arg5;
		}
		if (local39 < local59) {
			local59 = local39;
		}
		if (arg5 > local65) {
			local65 = arg5;
		}
		if (local39 > local65) {
			local65 = local39;
		}
		if (local46 < (float) this.aClass2_Sub2_8.anInt3517) {
			local46 = this.aClass2_Sub2_8.anInt3517;
		}
		if (local53 > (float) this.aClass2_Sub2_8.anInt3529) {
			local53 = this.aClass2_Sub2_8.anInt3529;
		}
		if (local59 < (float) this.aClass2_Sub2_8.anInt3521) {
			local59 = this.aClass2_Sub2_8.anInt3521;
		}
		if (local65 > (float) this.aClass2_Sub2_8.anInt3514) {
			local65 = this.aClass2_Sub2_8.anInt3514;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static167.anInt4541 = this.aClass2_Sub2_8.anInt3526;
		Static167.anInt4570 = (int) ((float) ((int) local59 * Static167.anInt4541) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static167.anInt4564 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt4565 / local71);
		Static167.anInt4560 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt4558 / local77);
		Static167.anInt4553 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt4565 / local77);
		Static167.anInt4544 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt4558 / local71);
		Static167.anInt4563 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static167.anInt4555 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static167.anInt4569 = (this.anInt4565 >> 1 << 12) + (Static167.anInt4555 * Static167.anInt4553 >> 4);
		Static167.anInt4562 = (this.anInt4558 >> 1 << 12) + (Static167.anInt4555 * Static167.anInt4544 >> 4);
		Static167.anInt4556 = Static167.anInt4563 * Static167.anInt4564 >> 4;
		Static167.anInt4542 = Static167.anInt4563 * Static167.anInt4560 >> 4;
		Static167.anInt4559 = (int) local46;
		Static167.anInt4552 = (int) local53;
		Static167.anInt4549 = (int) local59;
		Static167.anInt4554 = (int) local65;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
	protected abstract void method4193(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "()I")
	@Override
	public final int method5466() {
		return this.anInt4558;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
	@Override
	public final int method5464() {
		return this.anInt4568 + this.anInt4565 + this.anInt4540;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public final void method5465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (this.aClass2_Sub2_8.method3346()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray581 == null) {
			this.anIntArray581 = new int[4];
		}
		this.aClass2_Sub2_8.method3311(this.anIntArray581);
		this.aClass2_Sub2_8.method3291(this.aClass2_Sub2_8.anInt3517, this.aClass2_Sub2_8.anInt3521, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.method5464();
		@Pc(40) int local40 = this.method5467();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.method5455(arg0 + local65 * local37, arg1 + local63, arg4, arg5);
			}
		}
		this.aClass2_Sub2_8.method3250(this.anIntArray581[0], this.anIntArray581[1], this.anIntArray581[2], this.anIntArray581[3]);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void method5463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass2_Sub2_8.method3346()) {
			throw new IllegalStateException();
		}
		this.method4192(arg0, arg1, arg2, arg3, arg4, arg5);
		Static167.anInt4545 = arg7;
		if (arg6 != 0) {
			Static167.anInt4551 = arg7 >>> 24;
			Static167.anInt4548 = 256 - Static167.anInt4551;
			if (arg6 == 1) {
				Static167.anInt4557 = arg7 >> 16 & 0xFF;
				Static167.anInt4567 = arg7 >> 8 & 0xFF;
				Static167.anInt4561 = arg7 & 0xFF;
			} else {
				Static167.anInt4566 = arg7 >>> 24;
				Static167.anInt4550 = 256 - Static167.anInt4566;
				@Pc(63) int local63 = (arg7 & 0xFF00FF) * Static167.anInt4550 & 0xFF00FF00;
				@Pc(71) int local71 = (arg7 & 0xFF00) * Static167.anInt4550 & 0xFF0000;
				Static167.anInt4547 = (local63 | local71) >>> 8;
			}
		}
		if (arg6 == 0) {
			this.method4193(0);
		} else if (arg6 == 1) {
			this.method4193(1);
		} else if (arg6 == 2) {
			this.method4193(2);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIII)V")
	public abstract void method5455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "()I")
	@Override
	public final int method5471() {
		return this.anInt4565;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(FFFFFFLclient!tm;II)V")
	@Override
	protected final void method5460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class97 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass2_Sub2_8.method3346()) {
			throw new IllegalStateException();
		}
		this.method4192(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class97_Sub2 local18 = (Class97_Sub2) arg6;
		this.method4194(local18.anIntArray609, local18.anIntArray608, Static167.anInt4559 - arg7, -arg8 - (Static167.anInt4554 - Static167.anInt4549));
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILclient!tm;II)V")
	public abstract void method5469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4568 = arg0;
		this.anInt4543 = arg1;
		this.anInt4540 = arg2;
		this.anInt4546 = arg3;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "([I[III)V")
	protected abstract void method4194(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);
}
