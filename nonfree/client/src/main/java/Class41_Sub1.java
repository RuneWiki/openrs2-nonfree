import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public abstract class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
	protected int anInt7488;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	protected int anInt7492;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "[I")
	private int[] anIntArray613;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	protected int anInt7495;

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
	protected int anInt7507;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "Lclient!f;")
	protected final Class75_Sub1 aClass75_Sub1_11;

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
	protected final int anInt7481;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
	protected final int anInt7505;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lclient!f;II)V")
	protected Class41_Sub1(@OriginalArg(0) Class75_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass75_Sub1_11 = arg0;
		this.anInt7481 = arg1;
		this.anInt7505 = arg2;
	}

	@OriginalMember(owner = "client!cl", name = "W", descriptor = "(IIIII)V")
	public abstract void W(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFF)V")
	private void method6092(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		@Pc(8) int local8 = this.anInt7495 + this.anInt7481 + this.anInt7492;
		@Pc(17) int local17 = this.anInt7507 + this.anInt7505 + this.anInt7488;
		@Pc(32) float local32;
		@Pc(39) float local39;
		@Pc(46) float local46;
		@Pc(53) float local53;
		@Pc(59) float local59;
		@Pc(65) float local65;
		@Pc(71) float local71;
		@Pc(77) float local77;
		if (local8 != this.anInt7481 || local17 != this.anInt7505) {
			local32 = (arg2 - arg0) / (float) local8;
			local39 = (arg3 - arg1) / (float) local8;
			local46 = (arg4 - arg0) / (float) local17;
			local53 = (arg5 - arg1) / (float) local17;
			local59 = local46 * (float) this.anInt7507;
			local65 = local53 * (float) this.anInt7507;
			local71 = local32 * (float) this.anInt7495;
			local77 = local39 * (float) this.anInt7495;
			@Pc(84) float local84 = -local32 * (float) this.anInt7492;
			@Pc(91) float local91 = -local39 * (float) this.anInt7492;
			@Pc(98) float local98 = -local46 * (float) this.anInt7488;
			@Pc(105) float local105 = -local53 * (float) this.anInt7488;
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
		if (local46 < (float) this.aClass75_Sub1_11.anInt1742) {
			local46 = this.aClass75_Sub1_11.anInt1742;
		}
		if (local53 > (float) this.aClass75_Sub1_11.anInt1762) {
			local53 = this.aClass75_Sub1_11.anInt1762;
		}
		if (local59 < (float) this.aClass75_Sub1_11.anInt1747) {
			local59 = this.aClass75_Sub1_11.anInt1747;
		}
		if (local65 > (float) this.aClass75_Sub1_11.anInt1744) {
			local65 = this.aClass75_Sub1_11.anInt1744;
		}
		local53 = local46 - local53;
		if (local53 >= 0.0F) {
			return;
		}
		local65 = local59 - local65;
		if (local65 >= 0.0F) {
			return;
		}
		Static52.anInt7498 = this.aClass75_Sub1_11.anInt1769;
		Static52.anInt7502 = (int) ((float) ((int) local59 * Static52.anInt7498) + local46);
		local71 = (arg2 - arg0) * (arg5 - arg1) - (arg3 - arg1) * (arg4 - arg0);
		local77 = (arg4 - arg0) * (arg3 - arg1) - (arg5 - arg1) * (arg2 - arg0);
		Static52.anInt7503 = (int) ((arg5 - arg1) * 4096.0F * (float) this.anInt7481 / local71);
		Static52.anInt7480 = (int) ((arg3 - arg1) * 4096.0F * (float) this.anInt7505 / local77);
		Static52.anInt7494 = (int) ((arg4 - arg0) * 4096.0F * (float) this.anInt7481 / local77);
		Static52.anInt7487 = (int) ((arg2 - arg0) * 4096.0F * (float) this.anInt7505 / local71);
		Static52.anInt7496 = (int) (local46 * 16.0F + 8.0F - (arg0 + arg2 + arg4 + local32) / 4.0F * 16.0F);
		Static52.anInt7490 = (int) (local59 * 16.0F + 8.0F - (arg1 + arg3 + arg5 + local39) / 4.0F * 16.0F);
		Static52.anInt7483 = (this.anInt7481 >> 1 << 12) + (Static52.anInt7490 * Static52.anInt7494 >> 4);
		Static52.anInt7482 = (this.anInt7505 >> 1 << 12) + (Static52.anInt7490 * Static52.anInt7487 >> 4);
		Static52.anInt7484 = Static52.anInt7496 * Static52.anInt7503 >> 4;
		Static52.anInt7499 = Static52.anInt7496 * Static52.anInt7480 >> 4;
		Static52.anInt7501 = (int) local46;
		Static52.anInt7486 = (int) local53;
		Static52.anInt7491 = (int) local59;
		Static52.anInt7500 = (int) local65;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([I[III)V")
	protected abstract void method6093(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!cl", name = "la", descriptor = "(IIIIIII)V")
	@Override
	public final void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass75_Sub1_11.method1724()) {
			throw new IllegalStateException();
		}
		if (this.anIntArray613 == null) {
			this.anIntArray613 = new int[4];
		}
		this.aClass75_Sub1_11.MA(this.anIntArray613);
		this.aClass75_Sub1_11.HA(this.aClass75_Sub1_11.anInt1742, this.aClass75_Sub1_11.anInt1747, arg0 + arg2, arg1 + arg3);
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
		this.aClass75_Sub1_11.ba(this.anIntArray613[0], this.anIntArray613[1], this.anIntArray613[2], this.anIntArray613[3]);
	}

	@OriginalMember(owner = "client!cl", name = "ya", descriptor = "(IIIIIII)V")
	public abstract void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cl", name = "ha", descriptor = "(IIII)V")
	@Override
	public final void ha(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7495 = arg0;
		this.anInt7507 = arg1;
		this.anInt7492 = arg2;
		this.anInt7488 = arg3;
	}

	@OriginalMember(owner = "client!cl", name = "ZA", descriptor = "()I")
	@Override
	public final int ZA() {
		return this.anInt7505;
	}

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "(FFFFFFIII)V")
	@Override
	protected final void H(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass75_Sub1_11.method1724()) {
			throw new IllegalStateException();
		}
		this.method6092(arg0, arg1, arg2, arg3, arg4, arg5);
		Static52.anInt7493 = arg7;
		if (arg6 != 1) {
			Static52.anInt7506 = arg7 >>> 24;
			Static52.anInt7479 = 256 - Static52.anInt7506;
			if (arg6 == 0) {
				Static52.anInt7489 = arg7 >> 16 & 0xFF;
				Static52.anInt7509 = arg7 >> 8 & 0xFF;
				Static52.anInt7504 = arg7 & 0xFF;
			} else if (arg6 == 2) {
				Static52.anInt7485 = arg7 >>> 24;
				Static52.anInt7508 = 256 - Static52.anInt7485;
				@Pc(66) int local66 = (arg7 & 0xFF00FF) * Static52.anInt7508 & 0xFF00FF00;
				@Pc(74) int local74 = (arg7 & 0xFF00) * Static52.anInt7508 & 0xFF0000;
				Static52.anInt7497 = (local66 | local74) >>> 8;
			}
		}
		if (arg6 == 1) {
			this.method6094(1);
		} else if (arg6 == 0) {
			this.method6094(0);
		} else if (arg6 == 3) {
			this.method6094(3);
		} else if (arg6 == 2) {
			this.method6094(2);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(FFFFFFLclient!ta;II)V")
	@Override
	protected final void method6091(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class102 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (this.aClass75_Sub1_11.method1724()) {
			throw new IllegalStateException();
		}
		this.method6092(arg0, arg1, arg2, arg3, arg4, arg5);
		@Pc(18) Class102_Sub2 local18 = (Class102_Sub2) arg6;
		this.method6093(local18.anIntArray499, local18.anIntArray498, Static52.anInt7501 - arg7, -arg8 - (Static52.anInt7500 - Static52.anInt7491));
	}

	@OriginalMember(owner = "client!cl", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		return this.anInt7481;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILclient!ta;II)V")
	public abstract void method6082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
	protected abstract void method6094(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cl", name = "RA", descriptor = "()I")
	@Override
	public final int RA() {
		return this.anInt7495 + this.anInt7481 + this.anInt7492;
	}

	@OriginalMember(owner = "client!cl", name = "Q", descriptor = "()I")
	@Override
	public final int Q() {
		return this.anInt7507 + this.anInt7505 + this.anInt7488;
	}
}
