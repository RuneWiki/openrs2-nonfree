import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class90_Sub2_Sub2 extends Class90_Sub2 {

	@OriginalMember(owner = "client!sp", name = "xb", descriptor = "I")
	private int anInt8521;

	@OriginalMember(owner = "client!sp", name = "Gb", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!sp", name = "Qb", descriptor = "I")
	private int anInt8536;

	@OriginalMember(owner = "client!sp", name = "Ob", descriptor = "Z")
	public boolean aBoolean553 = true;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class90_Sub2_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	@Override
	public Class46 method7477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class46_Sub1_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7472(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			super.aCanvas12 = null;
			super.aClass6_Sub13_3 = null;
			if (super.aClass71_51 == null) {
				super.anInt8497 = super.anInt8489 = 1;
				super.anIntArray602 = null;
				this.anInt8521 = this.anInt8536 = 1;
				this.method6755();
			}
			return;
		}
		@Pc(38) Class6_Sub13 local38 = (Class6_Sub13) super.aClass234_43.method5464((long) arg0.hashCode());
		if (local38 == null) {
			return;
		}
		super.aCanvas12 = arg0;
		super.aClass6_Sub13_3 = local38;
		if (super.aClass71_51 != null) {
			return;
		}
		super.anIntArray602 = local38.anIntArray420;
		super.anInt8489 = local38.anInt5412;
		super.anInt8497 = local38.anInt5409;
		if (this.anInt8521 != super.anInt8497 || super.anInt8489 != this.anInt8536) {
			this.anInt8536 = super.anInt8489;
			this.anInt8521 = super.anInt8497;
			this.anIntArray603 = new int[this.anInt8536 * this.anInt8521];
		}
		this.method6755();
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(Z)V")
	@Override
	public void method7500(@OriginalArg(0) boolean arg0) {
		this.aBoolean553 = arg0;
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)V")
	@Override
	public void method7478(@OriginalArg(0) int arg0) {
		super.anInt8504 = arg0;
		super.aClass38Array3 = new Class38_Sub2[super.anInt8504];
		for (@Pc(15) int local15 = 0; super.anInt8504 > local15; local15++) {
			super.aClass38Array3[local15] = new Class38_Sub2(this);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!vd;")
	@Override
	public Class38 method6761(@OriginalArg(0) Runnable arg0) {
		for (@Pc(7) int local7 = 0; local7 < super.anInt8504; local7++) {
			if (arg0 == super.aClass38Array3[local7].aRunnable3) {
				return super.aClass38Array3[local7];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "()V")
	@Override
	public void method7521() {
		@Pc(29) int local29;
		@Pc(36) int local36;
		@Pc(38) int local38;
		if (super.anInt8486 == 0 && super.anInt8491 == super.anInt8497 && super.anInt8509 == 0 && super.anInt8489 == super.anInt8494) {
			local29 = this.anIntArray603.length;
			local36 = local29 - local29 & 0x7;
			local38 = 0;
			while (local38 < local36) {
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
			}
			while (local29 > local38) {
				this.anIntArray603[local38++] = Integer.MAX_VALUE;
			}
			return;
		}
		local29 = -super.anInt8486 + super.anInt8491;
		local36 = -super.anInt8509 + super.anInt8494;
		local38 = super.anInt8497 - local29;
		@Pc(140) int local140 = super.anInt8509 * super.anInt8497 + super.anInt8486;
		@Pc(144) int local144 = local29 >> 3;
		@Pc(148) int local148 = local29 & 0x7;
		local29 = local140 - 1;
		for (@Pc(155) int local155 = -local36; local155 < 0; local155++) {
			@Pc(161) int local161;
			if (local144 > 0) {
				local161 = local144;
				do {
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local161--;
				} while (local161 > 0);
			}
			if (local148 > 0) {
				local161 = local148;
				do {
					local29++;
					this.anIntArray603[local29] = Integer.MAX_VALUE;
					local161--;
				} while (local161 > 0);
			}
			local29 += local38;
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface2_15.method3085(arg6).aBoolean231) {
			this.method6768(arg2, arg1, arg3, arg9, arg0, arg7);
			return;
		}
		if (arg6 != super.anInt8513) {
			@Pc(40) Class71 local40 = (Class71) super.aClass330_60.method7677((long) arg6);
			if (local40 == null) {
				@Pc(46) int[] local46 = this.method6757(arg6);
				if (local46 == null) {
					return;
				}
				@Pc(57) int local57 = this.method6764(arg6) ? 64 : 128;
				local40 = this.method7471(local46, local57, local57, local57);
				super.aClass330_60.method7676(local40, (long) arg6);
			}
			super.aClass71_52 = local40;
			super.anInt8513 = arg6;
		}
		this.method6769((Class71_Sub2_Sub3) super.aClass71_52, arg7, arg8, arg0 - arg3, arg3 << 1, arg4 << 1, arg9, arg1 - arg4, arg2);
	}

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "(I)V")
	@Override
	public void method7491(@OriginalArg(0) int arg0) {
		super.aClass38Array3[arg0].method5974(Thread.currentThread());
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7526(@OriginalArg(0) Canvas arg0) {
		@Pc(12) Class6_Sub13 local12 = (Class6_Sub13) super.aClass234_43.method5464((long) arg0.hashCode());
		if (local12 == null) {
			return;
		}
		local12.method7948();
		local12 = Static484.method6801(arg0);
		super.aClass234_43.method5466((long) arg0.hashCode(), local12);
		if (arg0 != super.aCanvas12 || super.aClass71_51 != null) {
			return;
		}
		super.anInt8489 = local12.anInt5412;
		super.anIntArray602 = local12.anIntArray420;
		super.aClass6_Sub13_3 = local12;
		super.anInt8497 = local12.anInt5409;
		if (super.anInt8497 != this.anInt8521 || super.anInt8489 != this.anInt8536) {
			this.anInt8521 = super.anInt8497;
			this.anInt8536 = super.anInt8489;
			this.anIntArray603 = new int[this.anInt8536 * this.anInt8521];
		}
		this.method6755();
		return;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([Lclient!ba;Lclient!hfa;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7524(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) Class60_Sub6[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				((Class24_Sub1) arg0[local7]).method7406(arg2, arg3 == null ? null : arg3[local7], arg1, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class38_Sub2 local10 = (Class38_Sub2) this.method6761(Thread.currentThread());
		@Pc(13) Class28 local13 = local10.aClass28_2;
		@Pc(17) int local17 = arg2 - arg0;
		@Pc(21) int local21 = arg3 - arg1;
		@Pc(28) int local28 = local17 < 0 ? -local17 : local17;
		@Pc(38) int local38 = local21 >= 0 ? local21 : -local21;
		@Pc(40) int local40 = local28;
		if (local38 > local28) {
			local40 = local38;
		}
		if (local40 == 0) {
			return;
		}
		@Pc(54) int local54 = (local17 << 16) / local40;
		@Pc(60) int local60 = (local21 << 16) / local40;
		local17 += local54 >> 16;
		local21 += local60 >> 16;
		if (local54 >= local60) {
			local54 = -local54;
		} else {
			local60 = -local60;
		}
		@Pc(89) int local89 = arg5 * local60 >> 17;
		@Pc(97) int local97 = arg5 * local60 + 1 >> 17;
		@Pc(103) int local103 = local54 * arg5 >> 17;
		@Pc(111) int local111 = arg5 * local54 + 1 >> 17;
		@Pc(116) int local116 = arg0 - local13.method556();
		@Pc(121) int local121 = arg1 - local13.method555();
		@Pc(125) int local125 = local116 + local89;
		@Pc(130) int local130 = local116 - local97;
		@Pc(137) int local137 = local17 + local116 - local97;
		@Pc(143) int local143 = local116 + local17 + local89;
		@Pc(148) int local148 = local121 + local103;
		@Pc(153) int local153 = local121 - local111;
		@Pc(159) int local159 = local21 + local121 - local111;
		@Pc(165) int local165 = local103 + local121 + local21;
		local13.anInt648 = 0;
		local13.aBoolean38 = local125 < 0 || local125 > local13.anInt643 || local130 < 0 || local13.anInt643 < local130 || local137 < 0 || local13.anInt643 < local137;
		local13.method548(local148, local153, local159, local125, local130, local137, 0, 0, 0, arg4);
		local13.aBoolean38 = local125 < 0 || local125 > local13.anInt643 || local137 < 0 || local137 > local13.anInt643 || local143 < 0 || local13.anInt643 < local143;
		local13.method548(local148, local159, local165, local125, local137, local143, 0, 0, 0, arg4);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7512() {
		@Pc(10) Class38_Sub2 local10 = (Class38_Sub2) this.method6761(Thread.currentThread());
		@Pc(13) Class28 local13 = local10.aClass28_2;
		local13.aBoolean41 = false;
		local13.aBoolean38 = local13.anInt643 < 5 || local13.anInt643 < 75 || local13.anInt643 < 15;
		@Pc(55) int local55 = 15 - super.anInt8506;
		@Pc(60) int local60 = 75 - super.anInt8506;
		@Pc(65) int local65 = 10 - super.anInt8500;
		@Pc(70) int local70 = 50 - super.anInt8500;
		@Pc(75) int local75 = 5 - super.anInt8506;
		@Pc(80) int local80 = 90 - super.anInt8500;
		local13.anInt648 = 0;
		local13.aBoolean42 = false;
		local13.method554(local65, local70, local80, local75, local60, local55, 100, 100, 100, -65536, -65536, -65536);
		local13.aBoolean41 = true;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!rc;I)V")
	@Override
	public void method7476(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) Class60_Sub6[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			if (arg0[local7] != null) {
				arg0[local7].method7393(arg1, arg2 == null ? null : arg2[local7], arg3);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZIIIIII)V")
	private void method6768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg0 << 8;
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(19) int local19 = arg1 - arg2;
		if (local19 < super.anInt8509) {
			local19 = super.anInt8509;
		}
		@Pc(37) int local37 = arg1 + arg2 + 1;
		if (local37 > super.anInt8494) {
			local37 = super.anInt8494;
		}
		@Pc(50) int local50 = local19;
		@Pc(58) int local58 = arg2 * arg2;
		@Pc(60) int local60 = 0;
		@Pc(64) int local64 = arg1 - local19;
		@Pc(68) int local68 = local64 * local64;
		@Pc(73) int local73 = local68 - local64;
		if (local37 < arg1) {
			arg1 = local37;
		}
		@Pc(86) int local86 = arg5 >>> 24;
		@Pc(144) int local144;
		@Pc(159) int local159;
		@Pc(173) int local173;
		@Pc(176) int local176;
		if (arg3 == 0 || arg3 == 1 && local86 == 255) {
			while (local50 < arg1) {
				while (local73 <= local58 || local68 <= local58) {
					local68 += local60 + local60;
					local73 += local60++ + local60;
				}
				local144 = arg4 + 1 - local60;
				if (local144 < super.anInt8486) {
					local144 = super.anInt8486;
				}
				local159 = local60 + arg4;
				if (local159 > super.anInt8491) {
					local159 = super.anInt8491;
				}
				local173 = local144 + super.anInt8497 * local50;
				for (local176 = local144; local176 < local159; local176++) {
					if (this.anIntArray603[local173] > local9) {
						super.anIntArray602[local173] = arg5;
					}
					local173++;
				}
				local50++;
				local68 -= local64-- + local64;
				local73 -= local64 + local64;
			}
			local60 = arg2;
			local64 = local50 - arg1;
			local73 = local64 * local64 + local58;
			local68 = local73 - arg2;
			local73 -= local64;
			while (local50 < local37) {
				while (local73 > local58 && local58 < local68) {
					local73 -= local60-- + local60;
					local68 -= local60 + local60;
				}
				local144 = arg4 - local60;
				if (local144 < super.anInt8486) {
					local144 = super.anInt8486;
				}
				local159 = local60 + arg4;
				if (local159 > super.anInt8491 - 1) {
					local159 = super.anInt8491 - 1;
				}
				local173 = local50 * super.anInt8497 + local144;
				local50++;
				local73 += local64 + local64;
				for (local176 = local144; local176 <= local159; local176++) {
					if (local9 < this.anIntArray603[local173]) {
						super.anIntArray602[local173] = arg5;
					}
					local173++;
				}
				local68 += local64++ + local64;
			}
			return;
		}
		@Pc(189) int local189;
		@Pc(194) int local194;
		if (arg3 == 1) {
			@Pc(455) int local455 = (local86 << 24) + ((local86 * (arg5 & 0xFF00) & 0xFF00C6) >> 8) + (local86 * (arg5 & 0xFF00FF) >> 8 & 0xFF00FF);
			local144 = 256 - local86;
			while (arg1 > local50) {
				while (local58 >= local73 || local68 <= local58) {
					local68 += local60 + local60;
					local73 += local60++ + local60;
				}
				local159 = arg4 + 1 - local60;
				if (local159 < super.anInt8486) {
					local159 = super.anInt8486;
				}
				local173 = local60 + arg4;
				if (local173 > super.anInt8491) {
					local173 = super.anInt8491;
				}
				local176 = super.anInt8497 * local50 + local159;
				local50++;
				local68 -= local64-- + local64;
				for (local189 = local159; local189 < local173; local189++) {
					if (local9 < this.anIntArray603[local176]) {
						local194 = super.anIntArray602[local176];
						@Pc(571) int local571 = ((local194 & 0xFF00FF) * local144 >> 8 & 0xFF00FF) + (((local194 & 0xFF00) * local144 & 0xFF0071) >> 8);
						super.anIntArray602[local176] = local455 + local571;
					}
					local176++;
				}
				local73 -= local64 + local64;
			}
			local60 = arg2;
			local64 = -local64;
			local73 = local58 + local64 * local64;
			local68 = local73 - arg2;
			local73 -= local64;
			while (local37 > local50) {
				while (local73 > local58 && local68 > local58) {
					local73 -= local60-- + local60;
					local68 -= local60 + local60;
				}
				local159 = arg4 - local60;
				if (local159 < super.anInt8486) {
					local159 = super.anInt8486;
				}
				local173 = arg4 + local60;
				if (local173 > super.anInt8491 - 1) {
					local173 = super.anInt8491 - 1;
				}
				local176 = local159 + super.anInt8497 * local50;
				for (local189 = local159; local189 <= local173; local189++) {
					if (local9 < this.anIntArray603[local176]) {
						local194 = super.anIntArray602[local176];
						local194 = (local144 * (local194 & 0xFF00) >> 8 & 0xFF00) + ((local194 & 0xFF00FF) * local144 >> 8 & 0xFF00FF);
						super.anIntArray602[local176] = local194 + local455;
					}
					local176++;
				}
				local50++;
				local73 += local64 + local64;
				local68 += local64++ + local64;
			}
		} else if (arg3 == 2) {
			@Pc(202) int local202;
			while (arg1 > local50) {
				while (local58 >= local73 || local58 >= local68) {
					local68 += local60 + local60;
					local73 += local60++ + local60;
				}
				local144 = arg4 + 1 - local60;
				if (local144 < super.anInt8486) {
					local144 = super.anInt8486;
				}
				local159 = local60 + arg4;
				if (local159 > super.anInt8491) {
					local159 = super.anInt8491;
				}
				local173 = local144 + local50 * super.anInt8497;
				local50++;
				for (local176 = local144; local176 < local159; local176++) {
					if (local9 < this.anIntArray603[local173]) {
						local189 = super.anIntArray602[local173];
						local194 = arg5 + local189;
						local202 = (local189 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local189 = (local202 & 0x1000100) + (local194 - local202 & 0x10000);
						super.anIntArray602[local173] = local189 - (local189 >>> 8) | -local189 + local194;
					}
					local173++;
				}
				local68 -= local64-- + local64;
				local73 -= local64 + local64;
			}
			local60 = arg2;
			local64 = -local64;
			local73 = local58 + local64 * local64;
			local68 = local73 - arg2;
			local73 -= local64;
			while (local37 > local50) {
				while (local58 < local73 && local58 < local68) {
					local73 -= local60-- + local60;
					local68 -= local60 + local60;
				}
				local144 = arg4 - local60;
				if (local144 < super.anInt8486) {
					local144 = super.anInt8486;
				}
				local159 = arg4 + local60;
				if (local159 > super.anInt8491 - 1) {
					local159 = super.anInt8491 - 1;
				}
				local173 = local144 + local50 * super.anInt8497;
				local50++;
				local73 += local64 + local64;
				for (local176 = local144; local176 <= local159; local176++) {
					if (this.anIntArray603[local173] > local9) {
						local189 = super.anIntArray602[local173];
						local194 = arg5 + local189;
						local202 = (local189 & 0xFF00FF) + (arg5 & 0xFF00FF);
						local189 = (local194 - local202 & 0x10000) + (local202 & 0x1000100);
						super.anIntArray602[local173] = local194 - local189 | -(local189 >>> 8) + local189;
					}
					local173++;
				}
				local68 += local64++ + local64;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!cq;IIII)V")
	@Override
	public void method6754(@OriginalArg(0) Class60_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg0.anInt2704;
		@Pc(12) int local12 = arg4 << 1;
		if (local6 == -1) {
			this.method6768(arg3, arg2, arg4, 1, arg1, arg0.anInt2703);
			return;
		}
		if (local6 != super.anInt8513) {
			@Pc(42) Class71 local42 = (Class71) super.aClass330_60.method7677((long) local6);
			if (local42 == null) {
				@Pc(48) int[] local48 = this.method6757(local6);
				if (local48 == null) {
					return;
				}
				@Pc(59) int local59 = this.method6764(local6) ? 64 : 128;
				local42 = this.method7471(local48, local59, local59, local59);
				super.aClass330_60.method7676(local42, (long) local6);
			}
			super.aClass71_52 = local42;
			super.anInt8513 = local6;
		}
		local12++;
		this.method6769((Class71_Sub2_Sub3) super.aClass71_52, arg0.anInt2703, 0, arg1 - arg4, local12, local12, 1, arg2 - arg4, arg3);
	}

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "()Z")
	@Override
	public boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	@Override
	public void method7468(@OriginalArg(0) int arg0) {
		super.aClass38Array3[arg0].method5974(null);
	}

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "()V")
	@Override
	protected void method6760() {
		super.anInt8490 = super.anInt8491 - super.anInt8508;
		super.anInt8506 = super.anInt8486 - super.anInt8508;
		super.anInt8492 = super.anInt8494 - super.anInt8488;
		super.anInt8500 = super.anInt8509 - super.anInt8488;
		for (@Pc(37) int local37 = 0; super.anInt8504 > local37; local37++) {
			@Pc(46) Class28 local46 = ((Class38_Sub2) super.aClass38Array3[local37]).aClass28_2;
			local46.anInt646 = -super.anInt8509 + super.anInt8488;
			local46.anInt643 = super.anInt8491 - super.anInt8486;
			local46.anInt645 = -super.anInt8486 + super.anInt8508;
			local46.anInt647 = -super.anInt8509 + super.anInt8494;
		}
		@Pc(93) int local93 = super.anInt8509 * super.anInt8497 + super.anInt8486;
		for (@Pc(96) int local96 = super.anInt8509; super.anInt8494 > local96; local96++) {
			for (@Pc(100) int local100 = 0; super.anInt8504 > local100; local100++) {
				((Class38_Sub2) super.aClass38Array3[local100]).aClass28_2.anIntArray25[local96 - super.anInt8509] = local93;
			}
			local93 += super.anInt8497;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!hn;IIII)Lclient!ba;")
	@Override
	public Class24 method7464(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class24_Sub1_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZLclient!vs;IIIIIIII)V")
	private void method6769(@OriginalArg(1) Class71_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 <= 0 || arg5 <= 0) {
			return;
		}
		@Pc(17) int local17 = arg8 << 8;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(32) int local32 = arg0.anInt9716 + arg0.anInt9728 + arg0.anInt9729;
		@Pc(42) int local42 = arg0.anInt9726 + arg0.anInt9720 + arg0.anInt9710;
		@Pc(48) int local48 = (local32 << 16) / arg4;
		@Pc(54) int local54 = (local42 << 16) / arg5;
		@Pc(71) int local71;
		if (arg0.anInt9716 > 0) {
			local71 = ((arg0.anInt9716 << 16) + local48 - 1) / local48;
			arg3 += local71;
			local19 = local48 * local71 - (arg0.anInt9716 << 16);
		}
		if (local32 > arg0.anInt9728) {
			arg4 = ((arg0.anInt9728 << 16) + local48 - local19 - 1) / local48;
		}
		if (arg0.anInt9720 > 0) {
			local71 = ((arg0.anInt9720 << 16) + local54 - 1) / local54;
			local21 = local71 * local54 - (arg0.anInt9720 << 16);
			arg7 += local71;
		}
		if (local42 > arg0.anInt9710) {
			arg5 = (local54 + (arg0.anInt9710 << 16) - local21 - 1) / local54;
		}
		local71 = super.anInt8497 * arg7 + arg3;
		if (super.anInt8494 < arg7 + arg5) {
			arg5 -= arg5 + arg7 - super.anInt8494;
		}
		@Pc(189) int local189 = super.anInt8497 - arg4;
		@Pc(203) int local203;
		if (super.anInt8509 > arg7) {
			local203 = super.anInt8509 - arg7;
			local21 += local203 * local54;
			local71 += local203 * super.anInt8497;
			arg5 -= local203;
		}
		if (arg3 + arg4 > super.anInt8491) {
			local203 = arg4 + arg3 - super.anInt8491;
			arg4 -= local203;
			local189 += local203;
		}
		if (arg3 < super.anInt8486) {
			local203 = super.anInt8486 - arg3;
			local189 += local203;
			arg4 -= local203;
			local71 += local203;
			local19 += local48 * local203;
		}
		@Pc(300) int local300;
		@Pc(309) int local309;
		@Pc(316) int local316;
		@Pc(337) int local337;
		@Pc(347) int local347;
		@Pc(351) int local351;
		@Pc(359) int local359;
		@Pc(626) int local626;
		@Pc(661) int local661;
		@Pc(665) int local665;
		@Pc(588) int local588;
		if (arg6 != 0) {
			@Pc(673) int local673;
			@Pc(827) int local827;
			@Pc(835) int local835;
			if (arg6 == 1) {
				if (arg2 == 1) {
					local203 = local19;
					for (local300 = -arg5; local300 < 0; local300++) {
						local309 = arg0.anInt9728 * (local21 >> 16);
						for (local316 = -arg4; local316 < 0; local316++) {
							if (this.anIntArray603[local71] > local17) {
								local337 = arg0.anIntArray707[local309 + (local19 >> 16)];
								local347 = local337 >>> 24;
								local351 = 256 - local347;
								local359 = super.anIntArray602[local71];
								super.anIntArray602[local71] = ((local337 & 0xFF00FF) * local347 + local351 * (local359 & 0xFF00FF) >> 8 & 0xFFFF00FF) + (local351 * (local359 >>> 8 & 0xFF00FF) + local347 * ((-16711936 & local337) >>> 8) & 0xFF00FF00);
							}
							local71++;
							local19 += local48;
						}
						local21 += local54;
						local71 += local189;
						local19 = local203;
					}
				} else if (arg2 == 0) {
					local203 = local19;
					if ((arg1 & 0xFFFFFF) == 16777215) {
						for (local300 = -arg5; local300 < 0; local300++) {
							local309 = (local21 >> 16) * arg0.anInt9728;
							local21 += local54;
							for (local316 = -arg4; local316 < 0; local316++) {
								if (local17 < this.anIntArray603[local71]) {
									local337 = arg0.anIntArray707[(local19 >> 16) + local309];
									local347 = (arg1 >>> 24) * (local337 >>> 24) >> 8;
									local351 = 256 - local347;
									local359 = super.anIntArray602[local71];
									super.anIntArray602[local71] = (local347 * (local337 & 0xFF00FF) + (local359 & 0xFF00FF) * local351 & 0xFF00FF00) + (local351 * (local359 & 0xFF00) + (local337 & 0xFF00) * local347 & 0xFF0000) >> 8;
								}
								local71++;
								local19 += local48;
							}
							local71 += local189;
							local19 = local203;
						}
					} else {
						local300 = arg1 >> 16 & 0xFF;
						local309 = arg1 >> 8 & 0xFF;
						local316 = arg1 & 0xFF;
						for (local337 = -arg5; local337 < 0; local337++) {
							local347 = (local21 >> 16) * arg0.anInt9728;
							local21 += local54;
							for (local351 = -arg4; local351 < 0; local351++) {
								if (local17 < this.anIntArray603[local71]) {
									local359 = arg0.anIntArray707[local347 + (local19 >> 16)];
									local626 = (local359 >>> 24) * (arg1 >>> 24) >> 8;
									local661 = 256 - local626;
									if (local626 == 255) {
										local665 = local300 * (local359 & 0xFF0000) & 0xFF000000;
										local673 = local309 * (local359 & 0xFF00) & 0xFF0000;
										local827 = local316 * (local359 & 0xFF) & 0xFF00;
										super.anIntArray602[local71] = (local673 | local665 | local827) >>> 8;
									} else {
										local665 = local300 * (local359 & 0xFF0000) & 0xFF000000;
										local673 = (local359 & 0xFF00) * local309 & 0xFF0000;
										local827 = local316 * (local359 & 0xFF) & 0xFF00;
										local359 = (local827 | local673 | local665) >>> 8;
										local835 = super.anIntArray602[local71];
										super.anIntArray602[local71] = ((local835 & 0xFF00FF) * local661 + (local359 & 0xFF00FF) * local626 & 0xFF00FF00) + ((local835 & 0xFF00) * local661 + (local359 & 0xFF00) * local626 & 0xFF0000) >> 8;
									}
								}
								local71++;
								local19 += local48;
							}
							local71 += local189;
							local19 = local203;
						}
					}
				} else if (arg2 == 3) {
					local203 = local19;
					for (local300 = -arg5; local300 < 0; local300++) {
						local309 = (local21 >> 16) * arg0.anInt9728;
						local21 += local54;
						for (local316 = -arg4; local316 < 0; local316++) {
							if (this.anIntArray603[local71] > local17) {
								local337 = arg0.anIntArray707[(local19 >> 16) + local309];
								local347 = local337 + arg1;
								local351 = (arg1 & 0xFF00FF) + (local337 & 0xFF00FF);
								local359 = (local351 & 0x1000100) + (local347 - local351 & 0x10000);
								local359 = local347 - local359 | -(local359 >>> 8) + local359;
								local626 = (local359 >>> 24) * (arg1 >>> 24) >> 8;
								local661 = 256 - local626;
								if (local626 != 255) {
									local337 = local359;
									local359 = super.anIntArray602[local71];
									local359 = ((local337 & 0xFF00FF) * local626 + (local359 & 0xFF00FF) * local661 & 0xFF00FF00) + ((local359 & 0xFF00) * local661 + local626 * (local337 & 0xFF00) & 0xFF0000) >> 8;
								}
								super.anIntArray602[local71] = local359;
							}
							local19 += local48;
							local71++;
						}
						local19 = local203;
						local71 += local189;
					}
				} else if (arg2 == 2) {
					local203 = arg1 >>> 24;
					local300 = 256 - local203;
					local309 = (arg1 & 0xFF00FF) * local300 & 0xFF00FF00;
					local316 = (arg1 & 0xFF00) * local300 & 0xFF0000;
					local588 = (local309 | local316) >>> 8;
					local337 = local19;
					for (local347 = -arg5; local347 < 0; local347++) {
						local351 = arg0.anInt9728 * (local21 >> 16);
						local21 += local54;
						for (local359 = -arg4; local359 < 0; local359++) {
							if (this.anIntArray603[local71] > local17) {
								local626 = arg0.anIntArray707[local351 + (local19 >> 16)];
								local661 = local626 >>> 24;
								local309 = (local626 & 0xFF00FF) * local203 & 0xFF00FF00;
								local665 = 256 - local661;
								local316 = (local626 & 0xFF00) * local203 & 0xFF0000;
								local626 = ((local309 | local316) >>> 8) + local588;
								local673 = super.anIntArray602[local71];
								super.anIntArray602[local71] = ((local673 & 0xFF00) * local665 + local661 * (local626 & 0xFF00) & 0xFF0000) + (local661 * (local626 & 0xFF00FF) + ((local673 & 0xFF00FF) * local665) & 0xFF00FF00) >> 8;
							}
							local71++;
							local19 += local48;
						}
						local71 += local189;
						local19 = local337;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (arg6 != 2) {
				throw new IllegalArgumentException();
			} else if (arg2 == 1) {
				local203 = local19;
				for (local300 = -arg5; local300 < 0; local300++) {
					local309 = arg0.anInt9728 * (local21 >> 16);
					local21 += local54;
					for (local316 = -arg4; local316 < 0; local316++) {
						if (local17 < this.anIntArray603[local71]) {
							local337 = arg0.anIntArray707[(local19 >> 16) + local309];
							if (local337 != 0) {
								local347 = super.anIntArray602[local71];
								local351 = local347 + local337;
								local359 = (local347 & 0xFF00FF) + (local337 & 0xFF00FF);
								local347 = (local351 - local359 & 0x10000) + (local359 & 0x1000100);
								super.anIntArray602[local71] = local351 - local347 | -(local347 >>> 8) + local347;
							}
						}
						local19 += local48;
						local71++;
					}
					local71 += local189;
					local19 = local203;
				}
			} else if (arg2 == 0) {
				local203 = local19;
				local300 = arg1 >> 16 & 0xFF;
				local309 = arg1 >> 8 & 0xFF;
				local316 = arg1 & 0xFF;
				for (local337 = -arg5; local337 < 0; local337++) {
					local347 = arg0.anInt9728 * (local21 >> 16);
					for (local351 = -arg4; local351 < 0; local351++) {
						if (local17 < this.anIntArray603[local71]) {
							local359 = arg0.anIntArray707[(local19 >> 16) + local347];
							if (local359 != 0) {
								local626 = (local359 & 0xFF0000) * local300 & 0xFF000000;
								local661 = local309 * (local359 & 0xFF00) & 0xFF0000;
								local665 = (local359 & 0xFF) * local316 & 0xFF00;
								local359 = (local665 | local661 | local626) >>> 8;
								local673 = super.anIntArray602[local71];
								local827 = local673 + local359;
								local835 = (local673 & 0xFF00FF) + (local359 & 0xFF00FF);
								local673 = (local835 & 0x1000100) + (local827 - local835 & 0x10000);
								super.anIntArray602[local71] = local827 - local673 | local673 - (local673 >>> 8);
							}
						}
						local19 += local48;
						local71++;
					}
					local21 += local54;
					local71 += local189;
					local19 = local203;
				}
			} else if (arg2 == 3) {
				local203 = local19;
				for (local300 = -arg5; local300 < 0; local300++) {
					local309 = arg0.anInt9728 * (local21 >> 16);
					local21 += local54;
					for (local316 = -arg4; local316 < 0; local316++) {
						if (this.anIntArray603[local71] > local17) {
							local337 = arg0.anIntArray707[(local19 >> 16) + local309];
							local347 = local337 + arg1;
							local351 = (local337 & 0xFF00FF) + (arg1 & 0xFF00FF);
							local359 = (local347 - local351 & 0x10000) + (local351 & 0x1000100);
							local337 = local347 - local359 | -(local359 >>> 8) + local359;
							local359 = super.anIntArray602[local71];
							local347 = local359 + local337;
							local351 = (local337 & 0xFF00FF) + (local359 & 0xFF00FF);
							local359 = (local347 - local351 & 0x10000) + (local351 & 0x1000100);
							super.anIntArray602[local71] = local347 - local359 | -(local359 >>> 8) + local359;
						}
						local19 += local48;
						local71++;
					}
					local71 += local189;
					local19 = local203;
				}
			} else if (arg2 == 2) {
				local203 = arg1 >>> 24;
				local300 = 256 - local203;
				local309 = local300 * (arg1 & 0xFF00FF) & 0xFF00FF00;
				local316 = (arg1 & 0xFF00) * local300 & 0xFF0000;
				local588 = (local309 | local316) >>> 8;
				local337 = local19;
				for (local347 = -arg5; local347 < 0; local347++) {
					local351 = arg0.anInt9728 * (local21 >> 16);
					for (local359 = -arg4; local359 < 0; local359++) {
						if (local17 < this.anIntArray603[local71]) {
							local626 = arg0.anIntArray707[local351 + (local19 >> 16)];
							if (local626 != 0) {
								local316 = local203 * (local626 & 0xFF00) & 0xFF0000;
								local309 = (local626 & 0xFF00FF) * local203 & 0xFF00FF00;
								local626 = ((local309 | local316) >>> 8) + local588;
								local661 = super.anIntArray602[local71];
								local665 = local661 + local626;
								local673 = (local626 & 0xFF00FF) + (local661 & 0xFF00FF);
								local661 = (local665 - local673 & 0x10000) + (local673 & 0x1000100);
								super.anIntArray602[local71] = local661 - (local661 >>> 8) | local665 + -local661;
							}
						}
						local71++;
						local19 += local48;
					}
					local21 += local54;
					local19 = local337;
					local71 += local189;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (arg2 == 1) {
			local203 = local19;
			for (local300 = -arg5; local300 < 0; local300++) {
				local309 = arg0.anInt9728 * (local21 >> 16);
				local21 += local54;
				for (local316 = -arg4; local316 < 0; local316++) {
					if (this.anIntArray603[local71] > local17) {
						super.anIntArray602[local71] = arg0.anIntArray707[local309 + (local19 >> 16)];
					}
					local19 += local48;
					local71++;
				}
				local19 = local203;
				local71 += local189;
			}
		} else if (arg2 == 0) {
			local203 = arg1 >> 16 & 0xFF;
			local300 = arg1 >> 8 & 0xFF;
			local309 = arg1 & 0xFF;
			local316 = local19;
			for (local337 = -arg5; local337 < 0; local337++) {
				local347 = arg0.anInt9728 * (local21 >> 16);
				local21 += local54;
				for (local351 = -arg4; local351 < 0; local351++) {
					if (local17 < this.anIntArray603[local71]) {
						local359 = arg0.anIntArray707[(local19 >> 16) + local347];
						local626 = (local359 & 0xFF0000) * local203 & 0xFF000000;
						local661 = local300 * (local359 & 0xFF00) & 0xFF0000;
						local665 = local309 * (local359 & 0xFF) & 0xFF00;
						super.anIntArray602[local71] = (local661 | local626 | local665) >>> 8;
					}
					local19 += local48;
					local71++;
				}
				local19 = local316;
				local71 += local189;
			}
		} else if (arg2 == 3) {
			local203 = local19;
			for (local300 = -arg5; local300 < 0; local300++) {
				local309 = arg0.anInt9728 * (local21 >> 16);
				local21 += local54;
				for (local316 = -arg4; local316 < 0; local316++) {
					if (this.anIntArray603[local71] > local17) {
						local337 = arg0.anIntArray707[local309 + (local19 >> 16)];
						local347 = arg1 + local337;
						local351 = (local337 & 0xFF00FF) + (arg1 & 0xFF00FF);
						local359 = (local347 - local351 & 0x10000) + (local351 & 0x1000100);
						super.anIntArray602[local71] = local359 - (local359 >>> 8) | local347 - local359;
					}
					local71++;
					local19 += local48;
				}
				local71 += local189;
				local19 = local203;
			}
		} else if (arg2 == 2) {
			local203 = arg1 >>> 24;
			local300 = 256 - local203;
			local309 = local300 * (arg1 & 0xFF00FF) & 0xFF00FF00;
			local316 = local300 * (arg1 & 0xFF00) & 0xFF0000;
			local588 = (local309 | local316) >>> 8;
			local337 = local19;
			for (local347 = -arg5; local347 < 0; local347++) {
				local351 = arg0.anInt9728 * (local21 >> 16);
				local21 += local54;
				for (local359 = -arg4; local359 < 0; local359++) {
					if (local17 < this.anIntArray603[local71]) {
						local626 = arg0.anIntArray707[local351 + (local19 >> 16)];
						local316 = (local626 & 0xFF00) * local203 & 0xFF0000;
						local309 = local203 * (local626 & 0xFF00FF) & 0xFF00FF00;
						super.anIntArray602[local71] = ((local309 | local316) >>> 8) + local588;
					}
					local71++;
					local19 += local48;
				}
				local19 = local337;
				local71 += local189;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
