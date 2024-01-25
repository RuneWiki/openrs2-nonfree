import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public abstract class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	protected int anInt7454;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	protected int anInt7469;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	protected int anInt7474;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "[I")
	private int[] anIntArray512;

	@OriginalMember(owner = "client!af", name = "C", descriptor = "I")
	protected int anInt7475;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!cd;")
	protected final Class34_Sub1 aClass34_Sub1_11;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "I")
	protected final int anInt7461;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	protected final int anInt7463;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lclient!cd;II)V")
	protected Class6_Sub1(@OriginalArg(0) Class34_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass34_Sub1_11 = arg0;
		this.anInt7461 = arg1;
		this.anInt7463 = arg2;
	}

	@OriginalMember(owner = "client!af", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass34_Sub1_11.method793()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray512 == null) {
			this.anIntArray512 = new int[4];
		}
		this.aClass34_Sub1_11.MA(this.anIntArray512);
		this.aClass34_Sub1_11.HA(this.aClass34_Sub1_11.anInt805, this.aClass34_Sub1_11.anInt782, arg0 + arg2, arg1 + arg3);
		@Pc(37) int local37 = this.RA();
		@Pc(40) int local40 = this.Q();
		@Pc(48) int local48 = (arg2 + local37 - 1) / local37;
		@Pc(56) int local56 = (arg3 + local40 - 1) / local40;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			@Pc(63) int local63 = local58 * local40;
			for (@Pc(65) int local65 = 0; local65 < local48; local65++) {
				this.W(arg0 + local65 * local37, arg1 + local63, arg4, arg5, arg6);
			}
		}
		this.aClass34_Sub1_11.ba(this.anIntArray512[0], this.anIntArray512[1], this.anIntArray512[2], this.anIntArray512[3]);
	}

	@OriginalMember(owner = "client!af", name = "ya", descriptor = "(IIIIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([I[III)V")
	protected abstract void method5900(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!af", name = "ha", descriptor = "(IIII)V")
	@Override
	public final void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7454 = arg0;
		this.anInt7475 = arg1;
		this.anInt7469 = arg2;
		this.anInt7474 = arg3;
	}

	@OriginalMember(owner = "client!af", name = "W", descriptor = "(IIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
	protected abstract void method5901(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected final void method5897(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class104 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass34_Sub1_11.method793()) {
			throw new IllegalStateException();
		}
		this.method5902(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class104_Sub1 local18 = (Class104_Sub1) arg6;
		this.method5900(local18.anIntArray180, local18.anIntArray179, Static6.anInt7464 - arg7, -arg8 - (Static6.anInt7468 - Static6.anInt7460));
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(FFFFFF)V")
	private void method5902(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7454 + this.anInt7461 + this.anInt7469;
		@Pc(17) int local17 = this.anInt7475 + this.anInt7463 + this.anInt7474;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7461 || local17 != this.anInt7463) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7475;
			local65 = local53 * (float) this.anInt7475;
			local71 = local32 * (float) this.anInt7454;
			local77 = local39 * (float) this.anInt7454;
			@Pc(84) float local84 = -local32 * (float) this.anInt7469;
			@Pc(91) float local91 = -local39 * (float) this.anInt7469;
			@Pc(98) float local98 = -local46 * (float) this.anInt7474;
			@Pc(105) float local105 = -local53 * (float) this.anInt7474;
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
		if (local46 < (float) this.aClass34_Sub1_11.anInt805) {
			local46 = this.aClass34_Sub1_11.anInt805;
		}
		if (local53 > (float) this.aClass34_Sub1_11.lb) {
			local53 = this.aClass34_Sub1_11.lb;
		}
		if (local59 < (float) this.aClass34_Sub1_11.anInt782) {
			local59 = this.aClass34_Sub1_11.anInt782;
		}
		if (local65 > (float) this.aClass34_Sub1_11.anInt800) {
			local65 = this.aClass34_Sub1_11.anInt800;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static6.anInt7451 = this.aClass34_Sub1_11.anInt790;
		Static6.anInt7466 = (int) ((float) ((int) local59 * Static6.anInt7451) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static6.anInt7456 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7461 / local71);
		Static6.anInt7455 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7463 / local77);
		Static6.anInt7452 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7461 / local77);
		Static6.anInt7449 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7463 / local71);
		Static6.anInt7479 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static6.anInt7472 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static6.anInt7457 = (this.anInt7461 >> 1 << 12) + (Static6.anInt7472 * Static6.anInt7452 >> 4);
		Static6.anInt7477 = (this.anInt7463 >> 1 << 12) + (Static6.anInt7472 * Static6.anInt7449 >> 4);
		Static6.anInt7471 = Static6.anInt7479 * Static6.anInt7456 >> 4;
		Static6.anInt7470 = Static6.anInt7479 * Static6.anInt7455 >> 4;
		Static6.anInt7464 = (int) local46;
		Static6.anInt7453 = (int) local53;
		Static6.anInt7460 = (int) local59;
		Static6.anInt7468 = (int) local65;
	}

	@OriginalMember(owner = "client!af", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass34_Sub1_11.method793()) {
			throw new IllegalStateException();
		}
		this.method5902(arg0, arg1, arg2, arg3, arg4, arg5);
		Static6.anInt7478 = arg7;
		if (arg6 != 1) {
			Static6.anInt7476 = arg7 >>> 24;
			Static6.anInt7473 = 256 - Static6.anInt7476;
			if (arg6 == 0) {
				Static6.anInt7450 = arg7 >> 16 & 0xFF;
				Static6.anInt7467 = arg7 >> 8 & 0xFF;
				Static6.anInt7465 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static6.anInt7462 = arg7 >>> 24;
				Static6.anInt7459 = 256 - Static6.anInt7462;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static6.anInt7459 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static6.anInt7459 & 0xFF0000;
				Static6.anInt7458 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method5901(1);
		} else if (arg6 == 0) {
			this.method5901(0);
		} else if (arg6 == 3) {
			this.method5901(3);
		} else if (arg6 == 2) {
			this.method5901(2);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!ta;II)V")
	public abstract void method5892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "()I")
	@Override
	public final int Q() {
		return this.anInt7475 + this.anInt7463 + this.anInt7474;
	}

	@OriginalMember(owner = "client!af", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		return this.anInt7461;
	}

	@OriginalMember(owner = "client!af", name = "RA", descriptor = "()I")
	@Override
	public final int RA() {
		return this.anInt7454 + this.anInt7461 + this.anInt7469;
	}

	@OriginalMember(owner = "client!af", name = "ZA", descriptor = "()I")
	@Override
	public final int ZA() {
		return this.anInt7463;
	}
}
