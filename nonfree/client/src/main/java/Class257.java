import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class257 {

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
	private int anInt7441;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
	private int anInt7444;

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "I")
	public int anInt7445;

	@OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
	private int anInt7448;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
	private int anInt7450;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "Lclient!f;")
	private Class80 aClass80_23;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	private final int anInt7443;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
	private final int anInt7439;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "I")
	private final int anInt7442;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "Z")
	private final boolean aBoolean478;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
	private final int anInt7449;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
	private final int anInt7440;

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	private final int anInt7447;

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	private final int anInt7446;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt7443 = arg2;
		this.anInt7439 = arg3;
		this.anInt7442 = arg4;
		this.aBoolean478 = arg7;
		this.anInt7449 = arg1;
		this.anInt7440 = arg6;
		this.anInt7447 = arg5;
		this.anInt7446 = arg0;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)Z")
	public boolean method5766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean478) {
			this.anInt7445 = 1073741823;
			local7 = this.anInt7443;
			local12 = this.anInt7439;
			local17 = this.anInt7442;
		} else {
			local7 = this.anInt7443 - arg0;
			local12 = this.anInt7439 - arg1;
			local17 = this.anInt7442 - arg2;
			this.anInt7445 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt7445 == 0) {
				this.anInt7445 = 1;
			}
			local7 = (local7 << 8) / this.anInt7445;
			local12 = (local12 << 8) / this.anInt7445;
			local17 = (local17 << 8) / this.anInt7445;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt7450 = this.anInt7447 * arg3 / (this.aBoolean478 ? 1024 : this.anInt7445);
		} else {
			this.anInt7450 = 0;
		}
		if (this.anInt7450 < 8) {
			this.aClass80_23 = null;
			return false;
		}
		@Pc(143) int local143 = Static100.method1552(this.anInt7450);
		if (local143 > arg3) {
			local143 = Static296.method2396(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt7448) {
			this.anInt7448 = local143;
		}
		this.anInt7441 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 5215.189175235227D) & 0x3FFF;
		this.anInt7444 = (int) (Math.atan2((double) local7, (double) -local17) * 5215.189175235227D) & 0x3FFF;
		this.aClass80_23 = null;
		return true;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!qa;Lclient!vs;)V")
	private void method5768(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class257 arg1) {
		@Pc(6) Class264 local6 = Static358.method4932(Static375.aClass250_74, this.anInt7449);
		if (local6 == null) {
			return;
		}
		arg0.u(Static432.anIntArray644);
		arg0.pa(0, 0, this.anInt7448, this.anInt7448);
		arg0.NA(0, 0, this.anInt7448, this.anInt7448, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean478) {
				local32 = -arg1.anInt7443;
				local34 = -arg1.anInt7439;
				local36 = -arg1.anInt7442;
			} else {
				local32 = this.anInt7443 - arg1.anInt7443;
				local34 = this.anInt7439 - arg1.anInt7439;
				local36 = this.anInt7442 - arg1.anInt7442;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt7441 != 0) {
			local81 = -this.anInt7441 & 0x3FFF;
			local85 = Class4.anIntArray7[local81];
			local89 = Class4.anIntArray6[local81];
			local99 = local34 * local89 - local36 * local85 >> 15;
			local36 = local34 * local85 + local36 * local89 >> 15;
			local34 = local99;
		}
		if (this.anInt7444 != 0) {
			local81 = -this.anInt7444 & 0x3FFF;
			local85 = Class4.anIntArray7[local81];
			local89 = Class4.anIntArray6[local81];
			local99 = local36 * local85 + local32 * local89 >> 15;
			local36 = local36 * local89 - local32 * local85 >> 15;
			local32 = local99;
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class37 local172 = arg0.method4697(local6, 2048, 0, 64, 768);
		local85 = local172.VA() - local172.la();
		local89 = local172.E() - local172.b();
		local99 = local172.la() + local85 / 2;
		@Pc(198) int local198 = local172.b() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.GA(local99, local198, local205, local205);
		arg0.m(arg0.method4715());
		@Pc(218) Class18 local218 = arg0.method4709();
		local218.R(0, 0, arg0.d() - local172.X());
		local172.method4223(local218, null, arg0.d());
		this.aClass80_23 = arg0.method4714(0, 0, this.anInt7448, this.anInt7448, true);
		this.aClass80_23.V(0, 0, 3);
		arg0.pa(Static432.anIntArray644[0], Static432.anIntArray644[1], Static432.anIntArray644[2], Static432.anIntArray644[3]);
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "()V")
	public void method5769() {
		this.aClass80_23 = null;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(Lclient!qa;Lclient!vs;)V")
	private void method5770(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class257 arg1) {
		Static432.method5774(arg0);
		Static432.method5765(arg0);
		arg0.u(Static432.anIntArray644);
		arg0.pa(0, 0, this.anInt7448, this.anInt7448);
		arg0.method4696();
		arg0.NA(0, 0, this.anInt7448, this.anInt7448, this.anInt7440 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean478) {
				local31 = -arg1.anInt7443;
				local33 = -arg1.anInt7439;
				local35 = -arg1.anInt7442;
			} else {
				local31 = arg1.anInt7443 - this.anInt7443;
				local33 = arg1.anInt7439 - this.anInt7439;
				local35 = arg1.anInt7442 - this.anInt7442;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt7441 != 0) {
			local79 = Class4.anIntArray7[this.anInt7441];
			local84 = Class4.anIntArray6[this.anInt7441];
			local94 = local33 * local84 - local35 * local79 >> 15;
			local35 = local33 * local79 + local35 * local84 >> 15;
			local33 = local94;
		}
		if (this.anInt7444 != 0) {
			local79 = Class4.anIntArray7[this.anInt7444];
			local84 = Class4.anIntArray6[this.anInt7444];
			local94 = local35 * local79 + local31 * local84 >> 15;
			local35 = local35 * local84 - local31 * local79 >> 15;
			local31 = local94;
		}
		@Pc(147) Class37 local147 = Static432.aClass37_7.method4221((byte) 0, 51200, true);
		if (arg0.method4716()) {
			local147.YA((short) 0, (short) this.anInt7449);
		} else {
			local147.N((short) 127, Static212.anInterface7_2.method4836(this.anInt7449).aShort49);
			local147.YA((short) 0, (short) -1);
		}
		arg0.ua(1.0F);
		arg0.XA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt7448 * 1024 / (local147.VA() - local147.la());
		if (this.anInt7440 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.GA(this.anInt7448 / 2, this.anInt7448 / 2, local84, local84);
		arg0.m(arg0.method4715());
		@Pc(223) Class18 local223 = arg0.method4715();
		local223.R(0, 0, arg0.d() - local147.X());
		local147.method4223(local223, null, 1024);
		@Pc(245) int local245 = this.anInt7448 * 13 / 16;
		@Pc(252) int local252 = (this.anInt7448 - local245) / 2;
		Static432.aClass80_22.M(local252, local252, local245, local245, 0, this.anInt7440 | 0xFF000000, 1);
		this.aClass80_23 = arg0.method4714(0, 0, this.anInt7448, this.anInt7448, true);
		arg0.method4696();
		arg0.NA(0, 0, this.anInt7448, this.anInt7448, 0, 0);
		Static432.aClass80_24.M(0, 0, this.anInt7448, this.anInt7448, 1, 0, 0);
		this.aClass80_23.V(0, 0, 0);
		arg0.pa(Static432.anIntArray644[0], Static432.anIntArray644[1], Static432.anIntArray644[2], Static432.anIntArray644[3]);
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(Lclient!qa;Lclient!vs;)Z")
	public boolean method5771(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class257 arg1) {
		return this.aClass80_23 != null || this.method5773(arg0, arg1);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!qa;IIIIII)V")
	public void method5772(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass80_23 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt7441 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt7444 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt7450) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt7450) / 2;
		if (local38 < arg4 && local38 + this.anInt7450 > 0 && local51 < arg3 && local51 + this.anInt7450 > 0) {
			this.aClass80_23.method6093(local51 + arg1, local38 + arg2, this.anInt7450, this.anInt7450);
		}
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(Lclient!qa;Lclient!vs;)Z")
	private boolean method5773(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class257 arg1) {
		if (this.aClass80_23 == null) {
			if (this.anInt7446 == 0) {
				if (Static212.anInterface7_2.method4837(this.anInt7449)) {
					@Pc(23) int[] local23 = Static212.anInterface7_2.method4840(0.7F, this.anInt7449, this.anInt7448, this.anInt7448);
					this.aClass80_23 = arg0.method4739(local23, this.anInt7448, this.anInt7448, this.anInt7448);
				}
			} else if (this.anInt7446 == 2) {
				this.method5768(arg0, arg1);
			} else if (this.anInt7446 == 1) {
				this.method5770(arg0, arg1);
			}
		}
		return this.aClass80_23 != null;
	}
}
