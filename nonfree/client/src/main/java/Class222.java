import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class222 {

	@OriginalMember(owner = "client!or", name = "b", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!or", name = "g", descriptor = "[Lclient!gl;")
	public Class109[] aClass109Array6;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "[S")
	public short[] aShortArray150;

	@OriginalMember(owner = "client!or", name = "l", descriptor = "[S")
	public short[] aShortArray151;

	@OriginalMember(owner = "client!or", name = "m", descriptor = "[Lclient!fca;")
	public Class83[] aClass83Array6;

	@OriginalMember(owner = "client!or", name = "n", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!or", name = "p", descriptor = "[I")
	public int[] anIntArray569;

	@OriginalMember(owner = "client!or", name = "q", descriptor = "[I")
	public int[] anIntArray570;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "[S")
	public short[] aShortArray152;

	@OriginalMember(owner = "client!or", name = "t", descriptor = "[I")
	public int[] anIntArray571;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "[I")
	public int[] anIntArray572;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!or", name = "w", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!or", name = "y", descriptor = "[I")
	public int[] anIntArray574;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "[S")
	public short[] aShortArray153;

	@OriginalMember(owner = "client!or", name = "C", descriptor = "[S")
	public short[] aShortArray154;

	@OriginalMember(owner = "client!or", name = "F", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!or", name = "H", descriptor = "[S")
	public short[] aShortArray155;

	@OriginalMember(owner = "client!or", name = "J", descriptor = "[I")
	public int[] anIntArray575;

	@OriginalMember(owner = "client!or", name = "K", descriptor = "[Lclient!gt;")
	public Class114[] aClass114Array1;

	@OriginalMember(owner = "client!or", name = "M", descriptor = "[I")
	public int[] anIntArray576;

	@OriginalMember(owner = "client!or", name = "Q", descriptor = "[S")
	public short[] aShortArray156;

	@OriginalMember(owner = "client!or", name = "R", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "[I")
	public int[] anIntArray577;

	@OriginalMember(owner = "client!or", name = "V", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!or", name = "Y", descriptor = "[S")
	public short[] aShortArray157;

	@OriginalMember(owner = "client!or", name = "Z", descriptor = "[I")
	public int[] anIntArray578;

	@OriginalMember(owner = "client!or", name = "bb", descriptor = "[S")
	public short[] aShortArray158;

	@OriginalMember(owner = "client!or", name = "db", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!or", name = "eb", descriptor = "[S")
	public short[] aShortArray159;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public int anInt6692 = 0;

	@OriginalMember(owner = "client!or", name = "d", descriptor = "I")
	public int anInt6691 = 0;

	@OriginalMember(owner = "client!or", name = "W", descriptor = "I")
	public int anInt6708 = 0;

	@OriginalMember(owner = "client!or", name = "ab", descriptor = "I")
	public int anInt6710 = 12;

	@OriginalMember(owner = "client!or", name = "D", descriptor = "B")
	public byte aByte55 = 0;

	@OriginalMember(owner = "client!or", name = "fb", descriptor = "I")
	public int anInt6712 = 0;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "([B)V")
	public Class222(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5597(arg0);
		} else {
			this.method5612(arg0);
		}
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(III)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.aByteArray71 = new byte[arg2];
			this.aShortArray156 = new short[arg2];
			this.aByteArray72 = new byte[arg2];
			this.anIntArray572 = new int[arg2];
			this.anIntArray569 = new int[arg2];
			this.aShortArray157 = new short[arg2];
			this.anIntArray573 = new int[arg2];
			this.aByteArray68 = new byte[arg2];
			this.aShortArray151 = new short[arg2];
			this.anIntArray576 = new int[arg2];
			this.anIntArray568 = new int[arg2];
			this.anIntArray571 = new int[arg2];
		}
		this.aByteArray70 = new byte[arg1];
		this.aByteArray67 = new byte[arg1];
		this.aShortArray159 = new short[arg1];
		this.anIntArray575 = new int[arg0];
		this.aShortArray155 = new short[arg1];
		this.anIntArray578 = new int[arg0];
		this.aShortArray150 = new short[arg1];
		this.aByteArray66 = new byte[arg1];
		this.aShortArray153 = new short[arg1];
		this.aShortArray154 = new short[arg1];
		this.anIntArray570 = new int[arg0];
		this.anIntArray577 = new int[arg1];
		this.anIntArray574 = new int[arg0];
		this.aByteArray69 = new byte[arg1];
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "([Lclient!or;I)V")
	public Class222(@OriginalArg(0) Class222[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6692 = 0;
		this.anInt6691 = 0;
		this.anInt6712 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte55 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class222 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt6692 += local59.anInt6692;
				this.anInt6691 += local59.anInt6691;
				this.anInt6712 += local59.anInt6712;
				local38 |= local59.aByteArray69 != null;
				if (local59.aClass109Array6 != null) {
					local34 += local59.aClass109Array6.length;
				}
				if (local59.aClass83Array6 != null) {
					local32 += local59.aClass83Array6.length;
				}
				if (local59.aClass114Array1 != null) {
					local36 += local59.aClass114Array1.length;
				}
				local44 |= local59.aByteArray66 != null;
				local48 |= local59.anIntArray577 != null;
				if (local59.aByteArray70 == null) {
					if (this.aByte55 == -1) {
						this.aByte55 = local59.aByte55;
					}
					if (local59.aByte55 != this.aByte55) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray159 != null;
				local42 |= local59.aByteArray67 != null;
			}
		}
		this.anIntArray578 = new int[this.anInt6692];
		if (local40) {
			this.aByteArray70 = new byte[this.anInt6712];
		}
		if (local38) {
			this.aByteArray69 = new byte[this.anInt6712];
		}
		if (local42) {
			this.aByteArray67 = new byte[this.anInt6712];
		}
		if (local32 > 0) {
			this.aClass83Array6 = new Class83[local32];
		}
		if (local34 > 0) {
			this.aClass109Array6 = new Class109[local34];
		}
		if (local48) {
			this.anIntArray577 = new int[this.anInt6712];
		}
		this.anIntArray574 = new int[this.anInt6692];
		if (local46) {
			this.aShortArray159 = new short[this.anInt6712];
		}
		this.aShortArray150 = new short[this.anInt6712];
		if (local36 > 0) {
			this.aClass114Array1 = new Class114[local36];
		}
		this.aShortArray158 = new short[this.anInt6712];
		if (this.anInt6691 > 0) {
			this.aByteArray68 = new byte[this.anInt6691];
			this.aShortArray157 = new short[this.anInt6691];
			this.anIntArray571 = new int[this.anInt6691];
			this.anIntArray573 = new int[this.anInt6691];
			this.aByteArray71 = new byte[this.anInt6691];
			this.aByteArray72 = new byte[this.anInt6691];
			this.anIntArray569 = new int[this.anInt6691];
			this.aShortArray151 = new short[this.anInt6691];
			this.anIntArray572 = new int[this.anInt6691];
			this.anIntArray576 = new int[this.anInt6691];
			this.aShortArray156 = new short[this.anInt6691];
			this.anIntArray568 = new int[this.anInt6691];
		}
		if (local44) {
			this.aByteArray66 = new byte[this.anInt6712];
		}
		this.aShortArray152 = new short[this.anInt6692];
		this.aShortArray153 = new short[this.anInt6712];
		this.aShortArray154 = new short[this.anInt6712];
		this.aShortArray155 = new short[this.anInt6712];
		this.anIntArray575 = new int[this.anInt6692];
		this.anIntArray570 = new int[this.anInt6692];
		local34 = 0;
		this.anInt6691 = 0;
		this.anInt6712 = 0;
		local32 = 0;
		this.anInt6692 = 0;
		local36 = 0;
		@Pc(618) int local618;
		@Pc(629) int local629;
		for (@Pc(382) int local382 = 0; local382 < arg1; local382++) {
			@Pc(389) short local389 = (short) (0x1 << local382);
			@Pc(393) Class222 local393 = arg0[local382];
			if (local393 != null) {
				@Pc(400) int local400;
				if (local393.aClass114Array1 != null) {
					for (local400 = 0; local400 < local393.aClass114Array1.length; local400++) {
						@Pc(407) Class114 local407 = local393.aClass114Array1[local400];
						this.aClass114Array1[local36++] = local407.method3211(this.anInt6712 + local407.anInt3857);
					}
				}
				for (local400 = 0; local400 < local393.anInt6712; local400++) {
					if (local38 && local393.aByteArray69 != null) {
						this.aByteArray69[this.anInt6712] = local393.aByteArray69[local400];
					}
					if (local40) {
						if (local393.aByteArray70 == null) {
							this.aByteArray70[this.anInt6712] = local393.aByte55;
						} else {
							this.aByteArray70[this.anInt6712] = local393.aByteArray70[local400];
						}
					}
					if (local42 && local393.aByteArray67 != null) {
						this.aByteArray67[this.anInt6712] = local393.aByteArray67[local400];
					}
					if (local46) {
						if (local393.aShortArray159 == null) {
							this.aShortArray159[this.anInt6712] = -1;
						} else {
							this.aShortArray159[this.anInt6712] = local393.aShortArray159[local400];
						}
					}
					if (local48) {
						if (local393.anIntArray577 == null) {
							this.anIntArray577[this.anInt6712] = -1;
						} else {
							this.anIntArray577[this.anInt6712] = local393.anIntArray577[local400];
						}
					}
					this.aShortArray150[this.anInt6712] = (short) this.method5603(local393.aShortArray150[local400], local389, local393);
					this.aShortArray155[this.anInt6712] = (short) this.method5603(local393.aShortArray155[local400], local389, local393);
					this.aShortArray153[this.anInt6712] = (short) this.method5603(local393.aShortArray153[local400], local389, local393);
					this.aShortArray158[this.anInt6712] = local389;
					this.aShortArray154[this.anInt6712] = local393.aShortArray154[local400];
					this.anInt6712++;
				}
				@Pc(605) int local605;
				if (local393.aClass83Array6 != null) {
					for (local605 = 0; local605 < local393.aClass83Array6.length; local605++) {
						local618 = this.method5603(local393.aClass83Array6[local605].anInt2680, local389, local393);
						local629 = this.method5603(local393.aClass83Array6[local605].anInt2681, local389, local393);
						@Pc(640) int local640 = this.method5603(local393.aClass83Array6[local605].anInt2687, local389, local393);
						this.aClass83Array6[local32] = local393.aClass83Array6[local605].method2261(local618, local629, local640);
						local32++;
					}
				}
				if (local393.aClass109Array6 != null) {
					for (local605 = 0; local605 < local393.aClass109Array6.length; local605++) {
						local618 = this.method5603(local393.aClass109Array6[local605].anInt3776, local389, local393);
						this.aClass109Array6[local34] = local393.aClass109Array6[local605].method3132(local618);
						local34++;
					}
				}
			}
		}
		@Pc(702) int local702 = 0;
		this.anInt6708 = this.anInt6692;
		for (@Pc(708) int local708 = 0; local708 < arg1; local708++) {
			@Pc(715) short local715 = (short) (0x1 << local708);
			@Pc(719) Class222 local719 = arg0[local708];
			if (local719 != null) {
				for (local618 = 0; local618 < local719.anInt6712; local618++) {
					if (local44) {
						this.aByteArray66[local702++] = (byte) (local719.aByteArray66 == null || local719.aByteArray66[local618] == -1 ? -1 : this.anInt6691 + local719.aByteArray66[local618]);
					}
				}
				for (local629 = 0; local629 < local719.anInt6691; local629++) {
					@Pc(772) byte local772 = this.aByteArray71[this.anInt6691] = local719.aByteArray71[local629];
					if (local772 == 0) {
						this.aShortArray157[this.anInt6691] = (short) this.method5603(local719.aShortArray157[local629], local715, local719);
						this.aShortArray156[this.anInt6691] = (short) this.method5603(local719.aShortArray156[local629], local715, local719);
						this.aShortArray151[this.anInt6691] = (short) this.method5603(local719.aShortArray151[local629], local715, local719);
					}
					if (local772 >= 1 && local772 <= 3) {
						this.aShortArray157[this.anInt6691] = local719.aShortArray157[local629];
						this.aShortArray156[this.anInt6691] = local719.aShortArray156[local629];
						this.aShortArray151[this.anInt6691] = local719.aShortArray151[local629];
						this.anIntArray568[this.anInt6691] = local719.anIntArray568[local629];
						this.anIntArray569[this.anInt6691] = local719.anIntArray569[local629];
						this.anIntArray573[this.anInt6691] = local719.anIntArray573[local629];
						this.aByteArray68[this.anInt6691] = local719.aByteArray68[local629];
						this.aByteArray72[this.anInt6691] = local719.aByteArray72[local629];
						this.anIntArray571[this.anInt6691] = local719.anIntArray571[local629];
					}
					if (local772 == 2) {
						this.anIntArray576[this.anInt6691] = local719.anIntArray576[local629];
						this.anIntArray572[this.anInt6691] = local719.anIntArray572[local629];
					}
					this.anInt6691++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIII)I")
	public int method5595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6692; local7++) {
			if (arg0 == this.anIntArray578[local7] && arg2 == this.anIntArray574[local7] && this.anIntArray570[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray578[this.anInt6692] = arg0;
		this.anIntArray574[this.anInt6692] = arg2;
		this.anIntArray570[this.anInt6692] = arg1;
		this.anInt6708 = this.anInt6692 + 1;
		return this.anInt6692++;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(SIBIBBIBS)I")
	public int method5596(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray150[this.anInt6712] = (short) arg1;
		this.aShortArray155[this.anInt6712] = (short) arg6;
		this.aShortArray153[this.anInt6712] = (short) arg3;
		this.aByteArray69[this.anInt6712] = arg2;
		this.aByteArray66[this.anInt6712] = arg5;
		this.aShortArray154[this.anInt6712] = arg0;
		this.aByteArray67[this.anInt6712] = arg4;
		this.aShortArray159[this.anInt6712] = arg7;
		return this.anInt6712++;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([BZ)V")
	private void method5597(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub27 local10 = new Class3_Sub27(arg0);
		@Pc(15) Class3_Sub27 local15 = new Class3_Sub27(arg0);
		@Pc(20) Class3_Sub27 local20 = new Class3_Sub27(arg0);
		@Pc(25) Class3_Sub27 local25 = new Class3_Sub27(arg0);
		@Pc(30) Class3_Sub27 local30 = new Class3_Sub27(arg0);
		@Pc(35) Class3_Sub27 local35 = new Class3_Sub27(arg0);
		@Pc(40) Class3_Sub27 local40 = new Class3_Sub27(arg0);
		local10.anInt9191 = arg0.length - 23;
		this.anInt6692 = local10.method7591();
		this.anInt6712 = local10.method7591();
		this.anInt6691 = local10.method7548();
		@Pc(65) int local65 = local10.method7548();
		@Pc(81) boolean local81 = (local65 & 0x1) == 1;
		@Pc(90) boolean local90 = (local65 & 0x2) == 2;
		@Pc(101) boolean local101 = (local65 & 0x4) == 4;
		@Pc(110) boolean local110 = (local65 & 0x8) == 8;
		if (local110) {
			local10.anInt9191 -= 7;
			this.anInt6710 = local10.method7548();
			local10.anInt9191 += 6;
		}
		@Pc(133) int local133 = local10.method7548();
		@Pc(137) int local137 = local10.method7548();
		@Pc(141) int local141 = local10.method7548();
		@Pc(145) int local145 = local10.method7548();
		@Pc(149) int local149 = local10.method7548();
		@Pc(153) int local153 = local10.method7591();
		@Pc(157) int local157 = local10.method7591();
		@Pc(161) int local161 = local10.method7591();
		@Pc(165) int local165 = local10.method7591();
		@Pc(169) int local169 = local10.method7591();
		@Pc(171) int local171 = 0;
		@Pc(173) int local173 = 0;
		@Pc(175) int local175 = 0;
		@Pc(188) int local188;
		if (this.anInt6691 > 0) {
			this.aByteArray71 = new byte[this.anInt6691];
			local10.anInt9191 = 0;
			for (local188 = 0; local188 < this.anInt6691; local188++) {
				@Pc(199) byte local199 = this.aByteArray71[local188] = local10.method7584();
				if (local199 >= 1 && local199 <= 3) {
					local173++;
				}
				if (local199 == 2) {
					local175++;
				}
				if (local199 == 0) {
					local171++;
				}
			}
		}
		local188 = this.anInt6691;
		@Pc(227) int local227 = local188;
		local188 += this.anInt6692;
		@Pc(234) int local234 = local188;
		if (local81) {
			local188 += this.anInt6712;
		}
		@Pc(243) int local243 = local188;
		local188 += this.anInt6712;
		@Pc(250) int local250 = local188;
		if (local133 == 255) {
			local188 += this.anInt6712;
		}
		@Pc(260) int local260 = local188;
		if (local141 == 1) {
			local188 += this.anInt6712;
		}
		@Pc(272) int local272 = local188;
		if (local149 == 1) {
			local188 += this.anInt6692;
		}
		@Pc(282) int local282 = local188;
		if (local137 == 1) {
			local188 += this.anInt6712;
		}
		@Pc(292) int local292 = local188;
		local188 += local165;
		@Pc(298) int local298 = local188;
		if (local145 == 1) {
			local188 += this.anInt6712 * 2;
		}
		@Pc(312) int local312 = local188;
		local188 += local169;
		@Pc(318) int local318 = local188;
		local188 += this.anInt6712 * 2;
		@Pc(327) int local327 = local188;
		local188 += local153;
		@Pc(333) int local333 = local188;
		local188 += local157;
		@Pc(339) int local339 = local188;
		local188 += local161;
		@Pc(345) int local345 = local188;
		local188 += local171 * 6;
		@Pc(353) int local353 = local188;
		local188 += local173 * 6;
		@Pc(361) byte local361 = 6;
		if (this.anInt6710 == 14) {
			local361 = 7;
		} else if (this.anInt6710 >= 15) {
			local361 = 9;
		}
		@Pc(377) int local377 = local188;
		local188 += local361 * local173;
		@Pc(385) int local385 = local188;
		local188 += local173;
		@Pc(391) int local391 = local188;
		local188 += local173;
		@Pc(397) int local397 = local188;
		local188 += local175 * 2 + local173;
		if (local81) {
			this.aByteArray69 = new byte[this.anInt6712];
		}
		if (this.anInt6691 > 0) {
			if (local173 > 0) {
				this.anIntArray571 = new int[local173];
				this.anIntArray573 = new int[local173];
				this.anIntArray568 = new int[local173];
				this.anIntArray569 = new int[local173];
				this.aByteArray72 = new byte[local173];
				this.aByteArray68 = new byte[local173];
			}
			this.aShortArray151 = new short[this.anInt6691];
			this.aShortArray156 = new short[this.anInt6691];
			if (local175 > 0) {
				this.anIntArray572 = new int[local175];
				this.anIntArray576 = new int[local175];
			}
			this.aShortArray157 = new short[this.anInt6691];
		}
		if (local133 == 255) {
			this.aByteArray70 = new byte[this.anInt6712];
		} else {
			this.aByte55 = (byte) local133;
		}
		this.aShortArray153 = new short[this.anInt6712];
		this.anIntArray570 = new int[this.anInt6692];
		this.aShortArray154 = new short[this.anInt6712];
		this.anIntArray574 = new int[this.anInt6692];
		if (local149 == 1) {
			this.anIntArray575 = new int[this.anInt6692];
		}
		if (local137 == 1) {
			this.aByteArray67 = new byte[this.anInt6712];
		}
		local10.anInt9191 = local227;
		if (local145 == 1) {
			this.aShortArray159 = new short[this.anInt6712];
		}
		this.anIntArray578 = new int[this.anInt6692];
		this.aShortArray155 = new short[this.anInt6712];
		this.aShortArray150 = new short[this.anInt6712];
		if (local145 == 1 && this.anInt6691 > 0) {
			this.aByteArray66 = new byte[this.anInt6712];
		}
		if (local141 == 1) {
			this.anIntArray577 = new int[this.anInt6712];
		}
		local15.anInt9191 = local327;
		local20.anInt9191 = local333;
		local25.anInt9191 = local339;
		local30.anInt9191 = local272;
		@Pc(584) int local584 = 0;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(596) int local596;
		for (@Pc(590) int local590 = 0; local590 < this.anInt6692; local590++) {
			local596 = local10.method7548();
			@Pc(598) int local598 = 0;
			if ((local596 & 0x1) != 0) {
				local598 = local15.method7564();
			}
			@Pc(608) int local608 = 0;
			if ((local596 & 0x2) != 0) {
				local608 = local20.method7564();
			}
			@Pc(621) int local621 = 0;
			if ((local596 & 0x4) != 0) {
				local621 = local25.method7564();
			}
			this.anIntArray578[local590] = local584 + local598;
			this.anIntArray574[local590] = local608 + local586;
			this.anIntArray570[local590] = local588 + local621;
			local586 = this.anIntArray574[local590];
			local588 = this.anIntArray570[local590];
			local584 = this.anIntArray578[local590];
			if (local149 == 1) {
				this.anIntArray575[local590] = local30.method7548();
			}
		}
		local10.anInt9191 = local318;
		local15.anInt9191 = local234;
		local20.anInt9191 = local250;
		local25.anInt9191 = local282;
		local30.anInt9191 = local260;
		local35.anInt9191 = local298;
		local40.anInt9191 = local312;
		for (local596 = 0; local596 < this.anInt6712; local596++) {
			this.aShortArray154[local596] = (short) local10.method7591();
			if (local81) {
				this.aByteArray69[local596] = local15.method7584();
			}
			if (local133 == 255) {
				this.aByteArray70[local596] = local20.method7584();
			}
			if (local137 == 1) {
				this.aByteArray67[local596] = local25.method7584();
			}
			if (local141 == 1) {
				this.anIntArray577[local596] = local30.method7548();
			}
			if (local145 == 1) {
				this.aShortArray159[local596] = (short) (local35.method7591() - 1);
			}
			if (this.aByteArray66 != null) {
				if (this.aShortArray159[local596] == -1) {
					this.aByteArray66[local596] = -1;
				} else {
					this.aByteArray66[local596] = (byte) (local40.method7548() - 1);
				}
			}
		}
		local10.anInt9191 = local292;
		this.anInt6708 = -1;
		local15.anInt9191 = local243;
		@Pc(816) short local816 = 0;
		@Pc(818) short local818 = 0;
		@Pc(820) short local820 = 0;
		@Pc(822) short local822 = 0;
		@Pc(830) int local830;
		for (@Pc(824) int local824 = 0; local824 < this.anInt6712; local824++) {
			local830 = local15.method7548();
			if (local830 == 1) {
				local816 = (short) (local10.method7564() + local822);
				local818 = (short) (local10.method7564() + local816);
				local820 = (short) (local818 + local10.method7564());
				local822 = local820;
				this.aShortArray150[local824] = local816;
				this.aShortArray155[local824] = local818;
				this.aShortArray153[local824] = local820;
				if (this.anInt6708 < local816) {
					this.anInt6708 = local816;
				}
				if (local818 > this.anInt6708) {
					this.anInt6708 = local818;
				}
				if (this.anInt6708 < local820) {
					this.anInt6708 = local820;
				}
			}
			if (local830 == 2) {
				local818 = local820;
				local820 = (short) (local822 + local10.method7564());
				this.aShortArray150[local824] = local816;
				local822 = local820;
				this.aShortArray155[local824] = local818;
				this.aShortArray153[local824] = local820;
				if (local820 > this.anInt6708) {
					this.anInt6708 = local820;
				}
			}
			if (local830 == 3) {
				local816 = local820;
				local820 = (short) (local10.method7564() + local822);
				this.aShortArray150[local824] = local816;
				local822 = local820;
				this.aShortArray155[local824] = local818;
				this.aShortArray153[local824] = local820;
				if (local820 > this.anInt6708) {
					this.anInt6708 = local820;
				}
			}
			if (local830 == 4) {
				@Pc(993) short local993 = local816;
				local816 = local818;
				local818 = local993;
				local820 = (short) (local822 + local10.method7564());
				local822 = local820;
				this.aShortArray150[local824] = local816;
				this.aShortArray155[local824] = local993;
				this.aShortArray153[local824] = local820;
				if (this.anInt6708 < local820) {
					this.anInt6708 = local820;
				}
			}
		}
		local10.anInt9191 = local345;
		this.anInt6708++;
		local15.anInt9191 = local353;
		local20.anInt9191 = local377;
		local25.anInt9191 = local385;
		local30.anInt9191 = local391;
		local35.anInt9191 = local397;
		@Pc(1072) int local1072;
		for (local830 = 0; local830 < this.anInt6691; local830++) {
			local1072 = this.aByteArray71[local830] & 0xFF;
			if (local1072 == 0) {
				this.aShortArray157[local830] = (short) local10.method7591();
				this.aShortArray156[local830] = (short) local10.method7591();
				this.aShortArray151[local830] = (short) local10.method7591();
			}
			if (local1072 == 1) {
				this.aShortArray157[local830] = (short) local15.method7591();
				this.aShortArray156[local830] = (short) local15.method7591();
				this.aShortArray151[local830] = (short) local15.method7591();
				if (this.anInt6710 < 15) {
					this.anIntArray568[local830] = local20.method7591();
					if (this.anInt6710 >= 14) {
						this.anIntArray569[local830] = local20.method7551();
					} else {
						this.anIntArray569[local830] = local20.method7591();
					}
					this.anIntArray573[local830] = local20.method7591();
				} else {
					this.anIntArray568[local830] = local20.method7551();
					this.anIntArray569[local830] = local20.method7551();
					this.anIntArray573[local830] = local20.method7551();
				}
				this.aByteArray68[local830] = local25.method7584();
				this.aByteArray72[local830] = local30.method7584();
				this.anIntArray571[local830] = local35.method7584();
			}
			if (local1072 == 2) {
				this.aShortArray157[local830] = (short) local15.method7591();
				this.aShortArray156[local830] = (short) local15.method7591();
				this.aShortArray151[local830] = (short) local15.method7591();
				if (this.anInt6710 < 15) {
					this.anIntArray568[local830] = local20.method7591();
					if (this.anInt6710 < 14) {
						this.anIntArray569[local830] = local20.method7591();
					} else {
						this.anIntArray569[local830] = local20.method7551();
					}
					this.anIntArray573[local830] = local20.method7591();
				} else {
					this.anIntArray568[local830] = local20.method7551();
					this.anIntArray569[local830] = local20.method7551();
					this.anIntArray573[local830] = local20.method7551();
				}
				this.aByteArray68[local830] = local25.method7584();
				this.aByteArray72[local830] = local30.method7584();
				this.anIntArray571[local830] = local35.method7584();
				this.anIntArray576[local830] = local35.method7584();
				this.anIntArray572[local830] = local35.method7584();
			}
			if (local1072 == 3) {
				this.aShortArray157[local830] = (short) local15.method7591();
				this.aShortArray156[local830] = (short) local15.method7591();
				this.aShortArray151[local830] = (short) local15.method7591();
				if (this.anInt6710 < 15) {
					this.anIntArray568[local830] = local20.method7591();
					if (this.anInt6710 >= 14) {
						this.anIntArray569[local830] = local20.method7551();
					} else {
						this.anIntArray569[local830] = local20.method7591();
					}
					this.anIntArray573[local830] = local20.method7591();
				} else {
					this.anIntArray568[local830] = local20.method7551();
					this.anIntArray569[local830] = local20.method7551();
					this.anIntArray573[local830] = local20.method7551();
				}
				this.aByteArray68[local830] = local25.method7584();
				this.aByteArray72[local830] = local30.method7584();
				this.anIntArray571[local830] = local35.method7584();
			}
		}
		local10.anInt9191 = local188;
		@Pc(1480) int local1480;
		@Pc(1486) int local1486;
		@Pc(1490) int local1490;
		@Pc(1553) int local1553;
		if (local90) {
			local1072 = local10.method7548();
			if (local1072 > 0) {
				this.aClass83Array6 = new Class83[local1072];
				for (local1480 = 0; local1480 < local1072; local1480++) {
					local1486 = local10.method7591();
					local1490 = local10.method7591();
					@Pc(1498) byte local1498;
					if (local133 == 255) {
						local1498 = this.aByteArray70[local1490];
					} else {
						local1498 = (byte) local133;
					}
					this.aClass83Array6[local1480] = new Class83(local1486, this.aShortArray150[local1490], this.aShortArray155[local1490], this.aShortArray153[local1490], local1498);
				}
			}
			local1480 = local10.method7548();
			if (local1480 > 0) {
				this.aClass109Array6 = new Class109[local1480];
				for (local1486 = 0; local1486 < local1480; local1486++) {
					local1490 = local10.method7591();
					local1553 = local10.method7591();
					this.aClass109Array6[local1486] = new Class109(local1490, local1553);
				}
			}
		}
		if (!local101) {
			return;
		}
		local1072 = local10.method7548();
		if (local1072 <= 0) {
			return;
		}
		this.aClass114Array1 = new Class114[local1072];
		for (local1480 = 0; local1480 < local1072; local1480++) {
			local1486 = local10.method7591();
			local1490 = local10.method7591();
			local1553 = local10.method7548();
			@Pc(1602) byte local1602 = local10.method7584();
			this.aClass114Array1[local1480] = new Class114(local1486, local1490, local1553, local1602);
		}
		return;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)[[I")
	public int[][] method5598() {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass114Array1.length; local20++) {
			@Pc(28) int local28 = this.aClass114Array1[local20].anInt3856;
			if (local28 >= 0) {
				if (local18 < local28) {
					local18 = local28;
				}
				@Pc(39) int local39 = local16[local28]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local18 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local18; local59++) {
			local57[local59] = new int[local16[local59]];
			local16[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass114Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass114Array1[local78].anInt3856;
			if (local86 >= 0) {
				local57[local86][local16[local86]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)[[I")
	public int[][] method5599() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6712; local12++) {
			@Pc(19) int local19 = this.anIntArray577[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(43) int[][] local43 = new int[local10 + 1][];
		for (@Pc(45) int local45 = 0; local45 <= local10; local45++) {
			local43[local45] = new int[local8[local45]];
			local8[local45] = 0;
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt6712; local69++) {
			@Pc(76) int local76 = this.anIntArray577[local69];
			if (local76 >= 0) {
				local43[local76][local8[local76]++] = local69;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(IIII)V")
	public void method5600(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg0 != 0) {
			local11 = Class5.anIntArray761[arg0];
			local15 = Class5.anIntArray760[arg0];
			for (local17 = 0; local17 < this.anInt6692; local17++) {
				local35 = this.anIntArray574[local17] * local11 + this.anIntArray578[local17] * local15 >> 14;
				this.anIntArray574[local17] = this.anIntArray574[local17] * local15 - this.anIntArray578[local17] * local11 >> 14;
				this.anIntArray578[local17] = local35;
			}
		}
		if (arg1 != 0) {
			local11 = Class5.anIntArray761[arg1];
			local15 = Class5.anIntArray760[arg1];
			for (local17 = 0; local17 < this.anInt6692; local17++) {
				local35 = local15 * this.anIntArray574[local17] - local11 * this.anIntArray570[local17] >> 14;
				this.anIntArray570[local17] = local15 * this.anIntArray570[local17] + local11 * this.anIntArray574[local17] >> 14;
				this.anIntArray574[local17] = local35;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local11 = Class5.anIntArray761[arg2];
		local15 = Class5.anIntArray760[arg2];
		for (local17 = 0; local17 < this.anInt6692; local17++) {
			local35 = this.anIntArray578[local17] * local15 + local11 * this.anIntArray570[local17] >> 14;
			this.anIntArray570[local17] = local15 * this.anIntArray570[local17] - this.anIntArray578[local17] * local11 >> 14;
			this.anIntArray578[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(SSB)V")
	public void method5601(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray159 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt6712; local15++) {
			if (this.aShortArray159[local15] == arg1) {
				this.aShortArray159[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ISLclient!or;B)I")
	private int method5603(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) Class222 arg2) {
		@Pc(10) int local10 = arg2.anIntArray578[arg0];
		@Pc(15) int local15 = arg2.anIntArray574[arg0];
		@Pc(20) int local20 = arg2.anIntArray570[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt6692; local22++) {
			if (this.anIntArray578[local22] == local10 && this.anIntArray574[local22] == local15 && this.anIntArray570[local22] == local20) {
				this.aShortArray152[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray578[this.anInt6692] = local10;
		this.anIntArray574[this.anInt6692] = local15;
		this.anIntArray570[this.anInt6692] = local20;
		this.aShortArray152[this.anInt6692] = arg1;
		this.anIntArray575[this.anInt6692] = arg2.anIntArray575 == null ? -1 : arg2.anIntArray575[arg0];
		return this.anInt6692++;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIZ)V")
	public void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt6692; local13++) {
			this.anIntArray578[local13] += arg0;
			this.anIntArray574[local13] += arg2;
			this.anIntArray570[local13] += arg1;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	public void method5605() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt6692; local14++) {
			this.anIntArray578[local14] <<= 0x2;
			this.anIntArray574[local14] <<= 0x2;
			this.anIntArray570[local14] <<= 0x2;
		}
		if (this.anInt6691 <= 0 || this.anIntArray568 == null) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray568.length; local60++) {
			this.anIntArray568[local60] <<= 0x2;
			this.anIntArray569[local60] <<= 0x2;
			if (this.aByteArray71[local60] != 1) {
				this.anIntArray573[local60] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)[[I")
	public int[][] method5607(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt6692 : this.anInt6708;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray575[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < local18; local84++) {
			@Pc(91) int local91 = this.anIntArray575[local84];
			if (local91 >= 0) {
				local54[local91][local8[local91]++] = local84;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(SIS)V")
	public void method5608(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6712; local3++) {
			if (this.aShortArray154[local3] == arg0) {
				this.aShortArray154[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I[B)V")
	private void method5612(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub27 local14 = new Class3_Sub27(arg0);
		@Pc(19) Class3_Sub27 local19 = new Class3_Sub27(arg0);
		@Pc(24) Class3_Sub27 local24 = new Class3_Sub27(arg0);
		@Pc(29) Class3_Sub27 local29 = new Class3_Sub27(arg0);
		@Pc(34) Class3_Sub27 local34 = new Class3_Sub27(arg0);
		local14.anInt9191 = arg0.length - 18;
		this.anInt6692 = local14.method7591();
		this.anInt6712 = local14.method7591();
		this.anInt6691 = local14.method7548();
		@Pc(59) int local59 = local14.method7548();
		@Pc(65) int local65 = local14.method7548();
		@Pc(71) int local71 = local14.method7548();
		@Pc(75) int local75 = local14.method7548();
		@Pc(79) int local79 = local14.method7548();
		@Pc(83) int local83 = local14.method7591();
		@Pc(89) int local89 = local14.method7591();
		@Pc(93) int local93 = local14.method7591();
		@Pc(97) int local97 = local14.method7591();
		@Pc(106) int local106 = this.anInt6692;
		@Pc(108) int local108 = local106;
		local106 += this.anInt6712;
		@Pc(115) int local115 = local106;
		if (local65 == 255) {
			local106 += this.anInt6712;
		}
		@Pc(125) int local125 = local106;
		if (local75 == 1) {
			local106 += this.anInt6712;
		}
		@Pc(135) int local135 = local106;
		if (local59 == 1) {
			local106 += this.anInt6712;
		}
		@Pc(145) int local145 = local106;
		if (local79 == 1) {
			local106 += this.anInt6692;
		}
		@Pc(155) int local155 = local106;
		if (local71 == 1) {
			local106 += this.anInt6712;
		}
		@Pc(167) int local167 = local106;
		local106 += local97;
		@Pc(173) int local173 = local106;
		local106 += this.anInt6712 * 2;
		@Pc(182) int local182 = local106;
		local106 += this.anInt6691 * 6;
		@Pc(191) int local191 = local106;
		local106 += local83;
		@Pc(197) int local197 = local106;
		local106 += local89;
		local14.anInt9191 = 0;
		this.aShortArray150 = new short[this.anInt6712];
		this.anIntArray570 = new int[this.anInt6692];
		this.anIntArray578 = new int[this.anInt6692];
		this.aShortArray153 = new short[this.anInt6712];
		if (local59 == 1) {
			this.aShortArray159 = new short[this.anInt6712];
			this.aByteArray69 = new byte[this.anInt6712];
			this.aByteArray66 = new byte[this.anInt6712];
		}
		if (this.anInt6691 > 0) {
			this.aShortArray157 = new short[this.anInt6691];
			this.aShortArray151 = new short[this.anInt6691];
			this.aByteArray71 = new byte[this.anInt6691];
			this.aShortArray156 = new short[this.anInt6691];
		}
		if (local75 == 1) {
			this.anIntArray577 = new int[this.anInt6712];
		}
		this.anIntArray574 = new int[this.anInt6692];
		this.aShortArray155 = new short[this.anInt6712];
		if (local71 == 1) {
			this.aByteArray67 = new byte[this.anInt6712];
		}
		this.aShortArray154 = new short[this.anInt6712];
		if (local65 == 255) {
			this.aByteArray70 = new byte[this.anInt6712];
		} else {
			this.aByte55 = (byte) local65;
		}
		if (local79 == 1) {
			this.anIntArray575 = new int[this.anInt6692];
		}
		local19.anInt9191 = local191;
		local24.anInt9191 = local197;
		local29.anInt9191 = local106;
		local34.anInt9191 = local145;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(348) int local348 = 0; local348 < this.anInt6692; local348++) {
			local356 = local14.method7548();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method7564();
			}
			@Pc(371) int local371 = 0;
			if ((local356 & 0x2) != 0) {
				local371 = local24.method7564();
			}
			@Pc(384) int local384 = 0;
			if ((local356 & 0x4) != 0) {
				local384 = local29.method7564();
			}
			this.anIntArray578[local348] = local342 + local358;
			this.anIntArray574[local348] = local344 + local371;
			this.anIntArray570[local348] = local346 + local384;
			local342 = this.anIntArray578[local348];
			local344 = this.anIntArray574[local348];
			local346 = this.anIntArray570[local348];
			if (local79 == 1) {
				this.anIntArray575[local348] = local34.method7548();
			}
		}
		local14.anInt9191 = local173;
		local19.anInt9191 = local135;
		local24.anInt9191 = local115;
		local29.anInt9191 = local155;
		local34.anInt9191 = local125;
		for (local356 = 0; local356 < this.anInt6712; local356++) {
			this.aShortArray154[local356] = (short) local14.method7591();
			if (local59 == 1) {
				local358 = local19.method7548();
				if ((local358 & 0x1) == 1) {
					this.aByteArray69[local356] = 1;
					local7 = true;
				} else {
					this.aByteArray69[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray66[local356] = (byte) (local358 >> 2);
					this.aShortArray159[local356] = this.aShortArray154[local356];
					this.aShortArray154[local356] = 127;
					if (this.aShortArray159[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray66[local356] = -1;
					this.aShortArray159[local356] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray70[local356] = local24.method7584();
			}
			if (local71 == 1) {
				this.aByteArray67[local356] = local29.method7584();
			}
			if (local75 == 1) {
				this.anIntArray577[local356] = local34.method7548();
			}
		}
		this.anInt6708 = -1;
		local14.anInt9191 = local167;
		local19.anInt9191 = local108;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(619) int local619;
		for (@Pc(611) int local611 = 0; local611 < this.anInt6712; local611++) {
			local619 = local19.method7548();
			if (local619 == 1) {
				local603 = (short) (local609 + local14.method7564());
				local605 = (short) (local603 + local14.method7564());
				local607 = (short) (local14.method7564() + local605);
				this.aShortArray150[local611] = local603;
				local609 = local607;
				this.aShortArray155[local611] = local605;
				this.aShortArray153[local611] = local607;
				if (local603 > this.anInt6708) {
					this.anInt6708 = local603;
				}
				if (this.anInt6708 < local605) {
					this.anInt6708 = local605;
				}
				if (this.anInt6708 < local607) {
					this.anInt6708 = local607;
				}
			}
			if (local619 == 2) {
				local605 = local607;
				local607 = (short) (local609 + local14.method7564());
				this.aShortArray150[local611] = local603;
				local609 = local607;
				this.aShortArray155[local611] = local605;
				this.aShortArray153[local611] = local607;
				if (this.anInt6708 < local607) {
					this.anInt6708 = local607;
				}
			}
			if (local619 == 3) {
				local603 = local607;
				local607 = (short) (local14.method7564() + local609);
				local609 = local607;
				this.aShortArray150[local611] = local603;
				this.aShortArray155[local611] = local605;
				this.aShortArray153[local611] = local607;
				if (this.anInt6708 < local607) {
					this.anInt6708 = local607;
				}
			}
			if (local619 == 4) {
				@Pc(776) short local776 = local603;
				local603 = local605;
				local605 = local776;
				local607 = (short) (local609 + local14.method7564());
				local609 = local607;
				this.aShortArray150[local611] = local603;
				this.aShortArray155[local611] = local776;
				this.aShortArray153[local611] = local607;
				if (this.anInt6708 < local607) {
					this.anInt6708 = local607;
				}
			}
		}
		local14.anInt9191 = local182;
		this.anInt6708++;
		for (local619 = 0; local619 < this.anInt6691; local619++) {
			this.aByteArray71[local619] = 0;
			this.aShortArray157[local619] = (short) local14.method7591();
			this.aShortArray156[local619] = (short) local14.method7591();
			this.aShortArray151[local619] = (short) local14.method7591();
		}
		if (this.aByteArray66 != null) {
			@Pc(874) boolean local874 = false;
			for (@Pc(876) int local876 = 0; local876 < this.anInt6712; local876++) {
				@Pc(885) int local885 = this.aByteArray66[local876] & 0xFF;
				if (local885 != 255) {
					if (this.aShortArray150[local876] == (this.aShortArray157[local885] & 0xFFFF) && this.aShortArray155[local876] == (this.aShortArray156[local885] & 0xFFFF) && this.aShortArray153[local876] == (this.aShortArray151[local885] & 0xFFFF)) {
						this.aByteArray66[local876] = -1;
					} else {
						local874 = true;
					}
				}
			}
			if (!local874) {
				this.aByteArray66 = null;
			}
		}
		if (!local7) {
			this.aByteArray69 = null;
		}
		if (!local9) {
			this.aShortArray159 = null;
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(SSBBSBSBSS)B")
	public byte method5613() {
		if (this.anInt6691 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray71[this.anInt6691] = 3;
		this.aShortArray157[this.anInt6691] = 0;
		this.aShortArray156[this.anInt6691] = 32767;
		this.aShortArray151[this.anInt6691] = 0;
		this.anIntArray568[this.anInt6691] = 1024;
		this.anIntArray569[this.anInt6691] = 1024;
		this.anIntArray573[this.anInt6691] = 1024;
		this.aByteArray68[this.anInt6691] = 0;
		this.aByteArray72[this.anInt6691] = 0;
		this.anIntArray571[this.anInt6691] = 0;
		return (byte) this.anInt6691++;
	}
}
