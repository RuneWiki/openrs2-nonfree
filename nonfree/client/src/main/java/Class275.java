import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public class Class275 {

	@OriginalMember(owner = "client!pw", name = "x", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "[I")
	private final int[] anIntArray621 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "[I")
	private final int[] anIntArray622 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "Lclient!ob;")
	private final Class242 aClass242_6;

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "I")
	protected final int anInt9069;

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
	protected final int anInt9067;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	public final int anInt9071;

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "Z")
	public final boolean aBoolean674;

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "Lclient!eq;")
	private final Class96 aClass96_6;

	@OriginalMember(owner = "client!pw", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!pw", name = "u", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(IIIZLclient!eq;Lclient!ob;)V")
	protected Class275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) Class242 arg5) {
		this.aClass242_6 = arg5;
		this.anInt9069 = arg1;
		this.anInt9067 = arg2;
		this.anInt9071 = arg0;
		this.aBoolean674 = arg3;
		this.aClass96_6 = arg4;
		this.aByteArrayArrayArray18 = new byte[this.anInt9071][this.anInt9069][this.anInt9067];
		this.aByteArrayArrayArray13 = new byte[this.anInt9071][this.anInt9069][this.anInt9067];
		this.aByteArrayArrayArray14 = new byte[this.anInt9071][this.anInt9069][this.anInt9067];
		this.aByteArrayArrayArray16 = new byte[this.anInt9071][this.anInt9069][this.anInt9067];
		this.aByteArrayArrayArray15 = new byte[this.anInt9071][this.anInt9069 + 1][this.anInt9067 + 1];
		this.anIntArrayArrayArray20 = new int[this.anInt9071][this.anInt9069 + 1][this.anInt9067 + 1];
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIII)V")
	public final void method7609(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9071; local3++) {
			this.method7610(local3, arg0, 64, 64, arg1);
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIII)V")
	public final void method7610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = arg1; local15 < arg1 + arg2; local15++) {
			for (local19 = arg4; local19 < arg3 + arg4; local19++) {
				if (local19 >= 0 && local19 < this.anInt9069 && local15 >= 0 && this.anInt9067 > local15) {
					this.anIntArrayArrayArray20[arg0][local19][local15] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray20[arg0 - 1][local19][local15] - 960;
				}
			}
		}
		if (arg4 > 0 && this.anInt9069 > arg4) {
			for (local19 = arg1 + 1; local19 < arg1 + arg2; local19++) {
				if (local19 >= 0 && local19 < this.anInt9067) {
					this.anIntArrayArrayArray20[arg0][arg4][local19] = this.anIntArrayArrayArray20[arg0][arg4 - 1][local19];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt9067) {
			for (local19 = arg4 + 1; local19 < arg4 + arg3; local19++) {
				if (local19 >= 0 && local19 < this.anInt9069) {
					this.anIntArrayArrayArray20[arg0][local19][arg1] = this.anIntArrayArrayArray20[arg0][local19][arg1 - 1];
				}
			}
		}
		if (arg4 < 0 || arg1 < 0 || this.anInt9069 <= arg4 || arg1 >= this.anInt9067) {
			return;
		}
		if (arg0 != 0) {
			if (arg4 > 0 && this.anIntArrayArrayArray20[arg0 - 1][arg4 - 1][arg1] != this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1]) {
				this.anIntArrayArrayArray20[arg0][arg4][arg1] = this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray20[arg0][arg4][arg1 - 1] != this.anIntArrayArrayArray20[arg0 - 1][arg4][arg1 - 1]) {
				this.anIntArrayArrayArray20[arg0][arg4][arg1] = this.anIntArrayArrayArray20[arg0][arg4][arg1 - 1];
				return;
			}
			if (arg4 > 0 && arg1 > 0 && this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1 - 1] != this.anIntArrayArrayArray20[arg0 - 1][arg4 - 1][arg1 - 1]) {
				this.anIntArrayArrayArray20[arg0][arg4][arg1] = this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1] != 0) {
			this.anIntArrayArrayArray20[arg0][arg4][arg1] = this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray20[arg0][arg4][arg1 - 1] != 0) {
			this.anIntArrayArrayArray20[arg0][arg4][arg1] = this.anIntArrayArrayArray20[arg0][arg4][arg1 - 1];
			return;
		}
		if (arg4 > 0 && arg1 > 0 && this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1 - 1] != 0) {
			this.anIntArrayArrayArray20[arg0][arg4][arg1] = this.anIntArrayArrayArray20[arg0][arg4 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ha;Lclient!s;Lclient!s;B)V")
	public final void method7611(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class76 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt9069][this.anInt9067];
		if (Static32.anIntArray67 == null || this.anInt9067 != Static32.anIntArray67.length) {
			Static535.anIntArray593 = new int[this.anInt9067];
			Static32.anIntArray67 = new int[this.anInt9067];
			Static183.anIntArray211 = new int[this.anInt9067];
			Static562.anIntArray628 = new int[this.anInt9067];
			Static594.anIntArray659 = new int[this.anInt9067];
		}
		@Pc(49) int local49;
		for (@Pc(40) int local40 = 0; local40 < this.anInt9071; local40++) {
			for (local49 = 0; local49 < this.anInt9067; local49++) {
				Static32.anIntArray67[local49] = 0;
				Static183.anIntArray211[local49] = 0;
				Static535.anIntArray593[local49] = 0;
				Static562.anIntArray628[local49] = 0;
				Static594.anIntArray659[local49] = 0;
			}
			for (@Pc(82) int local82 = -5; local82 < this.anInt9069; local82++) {
				@Pc(92) int local92;
				@Pc(111) int local111;
				@Pc(183) int local183;
				for (@Pc(86) int local86 = 0; local86 < this.anInt9067; local86++) {
					local92 = local82 + 5;
					@Pc(160) int local160;
					if (local92 < this.anInt9069) {
						local111 = this.aByteArrayArrayArray14[local40][local92][local86] & 0xFF;
						if (local111 > 0) {
							@Pc(124) Class368 local124 = this.aClass242_6.method5365(local111 - 1);
							Static32.anIntArray67[local86] += local124.anInt9868;
							Static183.anIntArray211[local86] += local124.anInt9871;
							Static535.anIntArray593[local86] += local124.anInt9865;
							Static562.anIntArray628[local86] += local124.anInt9870;
							local160 = Static594.anIntArray659[local86]++;
						}
					}
					local111 = local82 - 5;
					if (local111 >= 0) {
						local183 = this.aByteArrayArrayArray14[local40][local111][local86] & 0xFF;
						if (local183 > 0) {
							@Pc(193) Class368 local193 = this.aClass242_6.method5365(local183 - 1);
							Static32.anIntArray67[local86] -= local193.anInt9868;
							Static183.anIntArray211[local86] -= local193.anInt9871;
							Static535.anIntArray593[local86] -= local193.anInt9865;
							Static562.anIntArray628[local86] -= local193.anInt9870;
							local160 = Static594.anIntArray659[local86]--;
						}
					}
				}
				if (local82 >= 0) {
					local92 = 0;
					local111 = 0;
					local183 = 0;
					@Pc(247) int local247 = 0;
					@Pc(249) int local249 = 0;
					for (@Pc(251) int local251 = -5; local251 < this.anInt9067; local251++) {
						@Pc(257) int local257 = local251 + 5;
						if (this.anInt9067 > local257) {
							local92 += Static32.anIntArray67[local257];
							local247 += Static562.anIntArray628[local257];
							local183 += Static535.anIntArray593[local257];
							local249 += Static594.anIntArray659[local257];
							local111 += Static183.anIntArray211[local257];
						}
						@Pc(299) int local299 = local251 - 5;
						if (local299 >= 0) {
							local183 -= Static535.anIntArray593[local299];
							local247 -= Static562.anIntArray628[local299];
							local111 -= Static183.anIntArray211[local299];
							local249 -= Static594.anIntArray659[local299];
							local92 -= Static32.anIntArray67[local299];
						}
						if (local251 >= 0 && local247 > 0 && local249 > 0) {
							local11[local82][local251] = Static66.method8419(local183 / local249, local111 / local249, local92 * 256 / local247);
						}
					}
				}
			}
			if (Static236.aBoolean275) {
				this.method7616(local40 == 0 ? arg1 : null, local40, arg0, local40 == 0 ? arg2 : null, Static314.aClass76Array2[local40], local11);
			} else {
				this.method7619(local40 == 0 ? arg1 : null, Static314.aClass76Array2[local40], local11, arg0, local40 == 0 ? arg2 : null, local40);
			}
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray16[local40] = null;
			this.aByteArrayArrayArray18[local40] = null;
		}
		if (!this.aBoolean674) {
			if (Static51.anInt1073 != 0) {
				Static582.method7928();
			}
			if (Static335.aBoolean381) {
				Static45.method740();
			}
		}
		for (local49 = 0; local49 < this.anInt9071; local49++) {
			Static314.aClass76Array2[local49].YA();
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILclient!vj;III[Lclient!nt;IIZI)V")
	public final void method7612(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class240[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean674) {
			@Pc(18) Class240 local18 = arg5[arg3];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static15.method229(local20 & 0x7, local24 & 0x7, arg0) + arg7;
					local50 = arg8 + Static454.method6225(local24 & 0x7, arg0, local20 & 0x7);
					if (local38 > 0 && this.anInt9069 - 1 > local38 && local50 > 0 && local50 < this.anInt9067 - 1) {
						local18.method5186(local50, local38);
					}
				}
			}
		}
		@Pc(92) int local92 = (arg2 & 0x7) * 8;
		@Pc(98) int local98 = (arg4 & 0xFFFFFFF8) << 3;
		local20 = (arg2 & 0xFFFFFFF8) << 3;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (arg0 == 1) {
			local112 = 1;
		} else if (arg0 == 2) {
			local112 = 1;
			local110 = 1;
		} else if (arg0 == 3) {
			local110 = 1;
		}
		for (local50 = 0; local50 < this.anInt9071; local50++) {
			for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
				for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
					if (arg6 == local50 && local11 <= local141 && local11 + 8 >= local141 && local145 >= local92 && local92 + 8 >= local145) {
						@Pc(216) int local216;
						@Pc(229) int local229;
						if (local11 + 8 == local141 || local92 + 8 == local145) {
							if (arg0 == 0) {
								local216 = arg7 + local141 - local11;
								local229 = local145 + arg8 - local92;
							} else if (arg0 == 1) {
								local216 = local145 + arg7 - local92;
								local229 = arg8 + local11 + 8 - local141;
							} else if (arg0 == 2) {
								local229 = local92 + arg8 + 8 - local145;
								local216 = arg7 + local11 + 8 - local141;
							} else {
								local229 = local141 + arg8 - local11;
								local216 = local92 + arg7 + 8 - local145;
							}
							this.method7618(local141 + local98, 0, true, arg3, 0, local229, 0, arg1, local145 + local20, local216);
						} else {
							local216 = arg7 + Static15.method229(local141 & 0x7, local145 & 0x7, arg0);
							local229 = arg8 + Static454.method6225(local145 & 0x7, arg0, local141 & 0x7);
							this.method7618(local98 + local141, arg0, false, arg3, local112, local229, local110, arg1, local20 + local145, local216);
						}
						if (local141 == 63 || local145 == 63) {
							@Pc(362) byte local362 = 1;
							if (local141 == 63 && local145 == 63) {
								local362 = 3;
							}
							for (@Pc(374) int local374 = 0; local374 < local362; local374++) {
								@Pc(378) int local378 = local141;
								@Pc(380) int local380 = local145;
								if (local374 == 0) {
									local378 = local141 == 63 ? 64 : local141;
									local380 = local145 == 63 ? 64 : local145;
								} else if (local374 == 1) {
									local378 = 64;
								} else if (local374 == 2) {
									local380 = 64;
								}
								@Pc(428) int local428;
								@Pc(421) int local421;
								if (arg0 == 0) {
									local421 = arg8 + local380 - local92;
									local428 = local378 + arg7 - local11;
								} else if (arg0 == 1) {
									local428 = arg7 + local380 - local92;
									local421 = arg8 + local11 + 8 - local378;
								} else if (arg0 == 2) {
									local421 = arg8 + local92 + 8 - local380;
									local428 = local11 + arg7 + 8 - local378;
								} else {
									local428 = local92 + arg7 + 8 - local380;
									local421 = arg8 + local378 - local11;
								}
								if (local428 >= 0 && local428 < this.anInt9069 && local421 >= 0 && this.anInt9067 > local421) {
									this.anIntArrayArrayArray20[arg3][local428][local421] = this.anIntArrayArrayArray20[arg3][local110 + local216][local112 + local229];
								}
							}
						}
					} else {
						this.method7618(0, 0, false, 0, 0, -1, 0, arg1, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II[[BILclient!ha;II[[BLclient!bd;I[ZI[[BLclient!vt;)V")
	private void method7613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class95 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) Class26 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) Class368 arg12) {
		@Pc(18) boolean[] local18 = arg7 != null && arg7.aBoolean61 ? Static597.aBooleanArrayArray9[arg10] : Static5.aBooleanArrayArray1[arg10];
		@Pc(37) int local37;
		@Pc(50) Class26 local50;
		@Pc(68) byte local68;
		@Pc(84) int local84;
		@Pc(89) int local89;
		if (arg5 > 0) {
			if (arg0 > 0) {
				local37 = arg2[arg0 - 1][arg5 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass96_6.method2121(local37 - 1);
					if (local50.anInt743 != -1 && local50.aBoolean61) {
						local68 = arg6[arg0 - 1][arg5 - 1];
						local84 = arg11[arg0 - 1][arg5 - 1] * 2 + 4 & 0x7;
						local89 = Static548.method7557(arg4, local50);
						if (Static362.aBooleanArrayArray6[local68][local84]) {
							Static611.anIntArray676[0] = local50.anInt743;
							Static379.anIntArray435[0] = local89;
							Static179.anIntArray229[0] = local50.anInt751;
							Static500.anIntArray573[0] = local50.anInt747;
							Static275.anIntArray292[0] = local50.anInt749;
							Static305.anIntArray336[0] = 256;
						}
					}
				}
			}
			if (arg8 - 1 > arg0) {
				local37 = arg2[arg0 + 1][arg5 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass96_6.method2121(local37 - 1);
					if (local50.anInt743 != -1 && local50.aBoolean61) {
						local68 = arg6[arg0 + 1][arg5 - 1];
						local84 = arg11[arg0 + 1][arg5 - 1] * 2 + 6 & 0x7;
						local89 = Static548.method7557(arg4, local50);
						if (Static362.aBooleanArrayArray6[local68][local84]) {
							Static611.anIntArray676[2] = local50.anInt743;
							Static379.anIntArray435[2] = local89;
							Static179.anIntArray229[2] = local50.anInt751;
							Static500.anIntArray573[2] = local50.anInt747;
							Static275.anIntArray292[2] = local50.anInt749;
							Static305.anIntArray336[2] = 512;
						}
					}
				}
			}
		}
		if (arg1 - 1 > arg5) {
			if (arg0 > 0) {
				local37 = arg2[arg0 - 1][arg5 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass96_6.method2121(local37 - 1);
					if (local50.anInt743 != -1 && local50.aBoolean61) {
						local68 = arg6[arg0 - 1][arg5 + 1];
						local84 = arg11[arg0 - 1][arg5 + 1] * 2 + 2 & 0x7;
						local89 = Static548.method7557(arg4, local50);
						if (Static362.aBooleanArrayArray6[local68][local84]) {
							Static611.anIntArray676[6] = local50.anInt743;
							Static379.anIntArray435[6] = local89;
							Static179.anIntArray229[6] = local50.anInt751;
							Static500.anIntArray573[6] = local50.anInt747;
							Static275.anIntArray292[6] = local50.anInt749;
							Static305.anIntArray336[6] = 64;
						}
					}
				}
			}
			if (arg8 - 1 > arg0) {
				local37 = arg2[arg0 + 1][arg5 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass96_6.method2121(local37 - 1);
					if (local50.anInt743 != -1 && local50.aBoolean61) {
						local68 = arg6[arg0 + 1][arg5 + 1];
						local84 = --(arg11[arg0 + 1][arg5 + 1] * 2) & 0x7;
						local89 = Static548.method7557(arg4, local50);
						if (Static362.aBooleanArrayArray6[local68][local84]) {
							Static611.anIntArray676[4] = local50.anInt743;
							Static379.anIntArray435[4] = local89;
							Static179.anIntArray229[4] = local50.anInt751;
							Static500.anIntArray573[4] = local50.anInt747;
							Static275.anIntArray292[4] = local50.anInt749;
							Static305.anIntArray336[4] = 128;
						}
					}
				}
			}
		}
		@Pc(509) int local509;
		@Pc(514) int local514;
		@Pc(516) int local516;
		@Pc(498) byte local498;
		if (arg5 > 0) {
			local37 = arg2[arg0][arg5 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass96_6.method2121(local37 - 1);
				if (local50.anInt743 != -1) {
					local68 = arg6[arg0][arg5 - 1];
					local498 = arg11[arg0][arg5 - 1];
					if (local50.aBoolean61) {
						local89 = 2;
						local509 = local498 * 2 + 4;
						local514 = Static548.method7557(arg4, local50);
						for (local516 = 0; local516 < 3; local516++) {
							local89 &= 0x7;
							local509 &= 0x7;
							if (Static362.aBooleanArrayArray6[local68][local509] && Static275.anIntArray292[local89] <= local50.anInt749) {
								Static611.anIntArray676[local89] = local50.anInt743;
								Static379.anIntArray435[local89] = local514;
								Static179.anIntArray229[local89] = local50.anInt751;
								Static500.anIntArray573[local89] = local50.anInt747;
								if (local50.anInt749 == Static275.anIntArray292[local89]) {
									Static305.anIntArray336[local89] |= 0x20;
								} else {
									Static305.anIntArray336[local89] = 32;
								}
								Static275.anIntArray292[local89] = local50.anInt749;
							}
							local509++;
							local89--;
						}
						if (!local18[arg3 & 0x3]) {
							arg9[0] = Static597.aBooleanArrayArray9[local68][local498 + 2 & 0x3];
						}
					} else if (!local18[arg3 & 0x3]) {
						arg9[0] = Static5.aBooleanArrayArray1[local68][local498 + 2 & 0x3];
					}
				}
			}
		}
		if (arg1 - 1 > arg5) {
			local37 = arg2[arg0][arg5 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass96_6.method2121(local37 - 1);
				if (local50.anInt743 != -1) {
					local68 = arg6[arg0][arg5 + 1];
					local498 = arg11[arg0][arg5 + 1];
					if (local50.aBoolean61) {
						local89 = 4;
						local509 = local498 * 2 + 2;
						local514 = Static548.method7557(arg4, local50);
						for (local516 = 0; local516 < 3; local516++) {
							local509 &= 0x7;
							local89 &= 0x7;
							if (Static362.aBooleanArrayArray6[local68][local509] && Static275.anIntArray292[local89] <= local50.anInt749) {
								Static611.anIntArray676[local89] = local50.anInt743;
								Static379.anIntArray435[local89] = local514;
								Static179.anIntArray229[local89] = local50.anInt751;
								Static500.anIntArray573[local89] = local50.anInt747;
								if (local50.anInt749 == Static275.anIntArray292[local89]) {
									Static305.anIntArray336[local89] |= 0x10;
								} else {
									Static305.anIntArray336[local89] = 16;
								}
								Static275.anIntArray292[local89] = local50.anInt749;
							}
							local89++;
							local509--;
						}
						if (!local18[arg3 + 2 & 0x3]) {
							arg9[2] = Static597.aBooleanArrayArray9[local68][local498 & 0x3];
						}
					} else if (!local18[arg3 + 2 & 0x3]) {
						arg9[2] = Static5.aBooleanArrayArray1[local68][local498 & 0x3];
					}
				}
			}
		}
		if (arg0 > 0) {
			local37 = arg2[arg0 - 1][arg5] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass96_6.method2121(local37 - 1);
				if (local50.anInt743 != -1) {
					local68 = arg6[arg0 - 1][arg5];
					local498 = arg11[arg0 - 1][arg5];
					if (local50.aBoolean61) {
						local89 = 6;
						local509 = local498 * 2 + 4;
						local514 = Static548.method7557(arg4, local50);
						for (local516 = 0; local516 < 3; local516++) {
							local89 &= 0x7;
							local509 &= 0x7;
							if (Static362.aBooleanArrayArray6[local68][local509] && local50.anInt749 >= Static275.anIntArray292[local89]) {
								Static611.anIntArray676[local89] = local50.anInt743;
								Static379.anIntArray435[local89] = local514;
								Static179.anIntArray229[local89] = local50.anInt751;
								Static500.anIntArray573[local89] = local50.anInt747;
								if (local50.anInt749 == Static275.anIntArray292[local89]) {
									Static305.anIntArray336[local89] |= 0x8;
								} else {
									Static305.anIntArray336[local89] = 8;
								}
								Static275.anIntArray292[local89] = local50.anInt749;
							}
							local89++;
							local509--;
						}
						if (!local18[arg3 + 3 & 0x3]) {
							arg9[3] = Static597.aBooleanArrayArray9[local68][local498 + 1 & 0x3];
						}
					} else if (!local18[arg3 + 3 & 0x3]) {
						arg9[3] = Static5.aBooleanArrayArray1[local68][local498 + 1 & 0x3];
					}
				}
			}
		}
		if (arg8 - 1 > arg0) {
			local37 = arg2[arg0 + 1][arg5] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass96_6.method2121(local37 - 1);
				if (local50.anInt743 != -1) {
					local68 = arg6[arg0 + 1][arg5];
					local498 = arg11[arg0 + 1][arg5];
					if (local50.aBoolean61) {
						local89 = 4;
						local509 = local498 * 2 + 6;
						local514 = Static548.method7557(arg4, local50);
						for (local516 = 0; local516 < 3; local516++) {
							local89 &= 0x7;
							local509 &= 0x7;
							if (Static362.aBooleanArrayArray6[local68][local509] && Static275.anIntArray292[local89] <= local50.anInt749) {
								Static611.anIntArray676[local89] = local50.anInt743;
								Static379.anIntArray435[local89] = local514;
								Static179.anIntArray229[local89] = local50.anInt751;
								Static500.anIntArray573[local89] = local50.anInt747;
								if (Static275.anIntArray292[local89] == local50.anInt749) {
									Static305.anIntArray336[local89] |= 0x4;
								} else {
									Static305.anIntArray336[local89] = 4;
								}
								Static275.anIntArray292[local89] = local50.anInt749;
							}
							local89--;
							local509++;
						}
						if (!local18[arg3 + 1 & 0x3]) {
							arg9[1] = Static597.aBooleanArrayArray9[local68][local498 + 3 & 0x3];
						}
					} else if (!local18[arg3 + 1 & 0x3]) {
						arg9[1] = Static5.aBooleanArrayArray1[local68][local498 + 3 & 0x3];
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		local37 = Static548.method7557(arg4, arg7);
		if (!arg7.aBoolean61) {
			return;
		}
		for (@Pc(1184) int local1184 = 0; local1184 < 8; local1184++) {
			@Pc(1195) int local1195 = local1184 - arg3 * 2 & 0x7;
			if (Static362.aBooleanArrayArray6[arg10][local1184] && arg7.anInt749 >= Static275.anIntArray292[local1195]) {
				Static611.anIntArray676[local1195] = arg7.anInt743;
				Static379.anIntArray435[local1195] = local37;
				Static179.anIntArray229[local1195] = arg7.anInt751;
				Static500.anIntArray573[local1195] = arg7.anInt747;
				if (Static275.anIntArray292[local1195] == arg7.anInt749) {
					Static305.anIntArray336[local1195] |= 0x2;
				} else {
					Static305.anIntArray336[local1195] = 2;
				}
				Static275.anIntArray292[local1195] = arg7.anInt749;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!ha;[Lclient!nt;I[[[I)V")
	public final void method7614(@OriginalArg(0) Class95 arg0, @OriginalArg(1) Class240[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean674) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt9069; local10++) {
					for (local14 = 0; local14 < this.anInt9067; local14++) {
						if ((Static27.aByteArrayArrayArray1[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static27.aByteArrayArrayArray1[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method5181(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt9071; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean674) {
				if (Static432.aBoolean529) {
					local14 = 8;
				}
				if (Static335.aBoolean381) {
					local10 = 2;
				}
				if (Static51.anInt1073 != 0) {
					local10 |= 0x1;
					if (Static127.aBoolean164 | local6 == 0) {
						local14 |= 0x10;
					}
				}
			}
			if (Static335.aBoolean381) {
				local14 |= 0x7;
			}
			if (!Static187.aBoolean235) {
				local14 |= 0x20;
			}
			@Pc(164) int[][] local164 = arg2 == null || local6 >= arg2.length ? this.anIntArrayArrayArray20[local6] : arg2[local6];
			Static280.method3894(local6, arg0.method6934(this.anInt9069, this.anInt9067, this.anIntArrayArrayArray20[local6], local164, local10, local14));
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(B[[II)V")
	public final void method7615(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray20[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt9069 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt9067 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!s;ILclient!ha;Lclient!s;ILclient!s;[[I)V")
	private void method7616(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(5) Class76 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(16) byte[][] local16 = this.aByteArrayArrayArray16[arg1];
		@Pc(21) byte[][] local21 = this.aByteArrayArrayArray18[arg1];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray14[arg1];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray13[arg1];
		for (@Pc(33) int local33 = 0; local33 < this.anInt9069; local33++) {
			@Pc(51) int local51 = this.anInt9069 - 1 <= local33 ? local33 : local33 + 1;
			for (@Pc(53) int local53 = 0; local53 < this.anInt9067; local53++) {
				@Pc(71) int local71 = local53 < this.anInt9067 - 1 ? local53 + 1 : local53;
				if (Static566.anInt9254 == -1 || Static76.method1081(arg1, local33, local53, Static566.anInt9254)) {
					@Pc(87) boolean local87 = false;
					@Pc(89) boolean local89 = false;
					@Pc(92) boolean[] local92 = new boolean[4];
					@Pc(98) int local98 = local16[local33][local53];
					@Pc(104) int local104 = local21[local33][local53];
					@Pc(112) int local112 = local31[local33][local53] & 0xFF;
					@Pc(120) int local120 = local26[local33][local53] & 0xFF;
					@Pc(128) int local128 = local26[local33][local71] & 0xFF;
					@Pc(136) int local136 = local26[local51][local71] & 0xFF;
					@Pc(144) int local144 = local26[local51][local53] & 0xFF;
					if (local112 != 0 || local120 != 0) {
						@Pc(163) Class26 local163 = local112 == 0 ? null : this.aClass96_6.method2121(local112 - 1);
						if (local98 == 0 && local163 == null) {
							local98 = 12;
						}
						@Pc(181) Class368 local181 = local120 == 0 ? null : this.aClass242_6.method5365(local120 - 1);
						@Pc(183) Class26 local183 = local163;
						if (local163 != null) {
							if (local163.anInt743 == -1 && local163.anInt741 == -1) {
								local183 = local163;
								local163 = null;
							} else if (local181 != null && local98 != 0) {
								local89 = local163.aBoolean61;
							}
						}
						@Pc(294) int local294;
						@Pc(313) int local313;
						@Pc(378) int local378;
						@Pc(388) int local388;
						if ((local98 == 0 || local98 == 12) && local33 > 0 && local53 > 0 && this.anInt9069 > local33 && this.anInt9067 > local53) {
							@Pc(258) int local258 = local26[local51][local53 - 1] == local120 ? 1 : -1;
							@Pc(277) int local277 = local120 == local26[local51][local71] ? 1 : -1;
							local294 = local120 == local26[local33 - 1][local53 - 1] ? 1 : -1;
							local313 = local26[local33 - 1][local71] == local120 ? 1 : -1;
							if (local120 == local26[local33][local53 - 1]) {
								local258++;
								local294++;
							} else {
								local258--;
								local294--;
							}
							if (local120 == local26[local51][local53]) {
								local277++;
								local258++;
							} else {
								local277--;
								local258--;
							}
							if (local26[local33][local71] == local120) {
								local313++;
								local277++;
							} else {
								local277--;
								local313--;
							}
							if (local120 == local26[local33 - 1][local53]) {
								local313++;
								local294++;
							} else {
								local294--;
								local313--;
							}
							local378 = local294 - local277;
							if (local378 < 0) {
								local378 = -local378;
							}
							local388 = local258 - local313;
							if (local388 < 0) {
								local388 = -local388;
							}
							if (local388 == local378) {
								local378 = arg4.method7396(local53, local33) - arg4.method7396(local71, local51);
								if (local378 < 0) {
									local378 = -local378;
								}
								local388 = arg4.method7396(local53, local51) - arg4.method7396(local71, local33);
								if (local388 < 0) {
									local388 = -local388;
								}
							}
							local104 = local378 < local388 ? 1 : 0;
						}
						for (local294 = 0; local294 < 13; local294++) {
							Static275.anIntArray292[local294] = -1;
							Static305.anIntArray336[local294] = 1;
						}
						@Pc(472) boolean[] local472 = local163 != null && local163.aBoolean61 ? Static597.aBooleanArrayArray9[local98] : Static5.aBooleanArrayArray1[local98];
						this.method7613(local33, this.anInt9067, local31, local104, arg2, local53, local16, local163, this.anInt9069, local92, local98, local21, local181);
						@Pc(501) boolean local501 = local163 != null && local163.anInt743 != local163.anInt741;
						if (!local501) {
							for (local313 = 0; local313 < 8; local313++) {
								if (Static275.anIntArray292[local313] >= 0 && Static379.anIntArray435[local313] != Static611.anIntArray676[local313]) {
									local501 = true;
									break;
								}
							}
						}
						if (!local472[local104 + 1 & 0x3]) {
							local92[1] = Static376.method5061(local92[1], (Static305.anIntArray336[2] & Static305.anIntArray336[4]) == 0);
						}
						if (!local472[local104 + 3 & 0x3]) {
							local92[3] = Static376.method5061(local92[3], (Static305.anIntArray336[6] & Static305.anIntArray336[0]) == 0);
						}
						if (!local472[local104 & 0x3]) {
							local92[0] = Static376.method5061(local92[0], (Static305.anIntArray336[2] & Static305.anIntArray336[0]) == 0);
						}
						if (!local472[local104 + 2 & 0x3]) {
							local92[2] = Static376.method5061(local92[2], (Static305.anIntArray336[4] & Static305.anIntArray336[6]) == 0);
						}
						if (!local89 && (local98 == 0 || local98 == 12)) {
							if (local92[0] && !local92[1] && !local92[2] && local92[3]) {
								local92[0] = local92[3] = false;
								local104 = 0;
								local98 = local98 == 0 ? 13 : 14;
							} else if (local92[0] && local92[1] && !local92[2] && !local92[3]) {
								local104 = 3;
								local98 = local98 == 0 ? 13 : 14;
								local92[0] = local92[1] = false;
							} else if (!local92[0] && local92[1] && local92[2] && !local92[3]) {
								local98 = local98 == 0 ? 13 : 14;
								local104 = 2;
								local92[1] = local92[2] = false;
							} else if (!local92[0] && !local92[1] && local92[2] && local92[3]) {
								local104 = 1;
								local98 = local98 == 0 ? 13 : 14;
								local92[2] = local92[3] = false;
							}
						}
						@Pc(808) boolean local808 = !local89 && !local92[0] && !local92[2] && !local92[1] && !local92[3];
						@Pc(810) int[] local810 = null;
						@Pc(840) int[] local840;
						@Pc(816) int[] local816;
						@Pc(828) int[] local828;
						if (local808) {
							local816 = Static230.anIntArrayArray19[local98];
							local388 = local163 == null ? 0 : Static298.anIntArray330[local98];
							local828 = Static547.anIntArrayArray61[local98];
							local378 = local181 == null ? 0 : Static402.anIntArray468[local98];
							local840 = Static133.anIntArrayArray8[local98];
						} else if (local89) {
							local388 = local163 == null ? 0 : Static135.anIntArray164[local98];
							local840 = Static571.anIntArrayArray66[local98];
							local828 = Static41.anIntArrayArray2[local98];
							local816 = Static525.anIntArrayArray39[local98];
							local378 = local181 == null ? 0 : Static24.anIntArray59[local98];
							local810 = Static10.anIntArrayArray1[local98];
						} else {
							local816 = Static430.anIntArrayArray51[local98];
							local378 = local181 == null ? 0 : Static55.anIntArray90[local98];
							local828 = Static466.anIntArrayArray48[local98];
							local388 = local163 == null ? 0 : Static128.anIntArray162[local98];
							local840 = Static403.anIntArrayArray41[local98];
							local810 = Static207.anIntArrayArray11[local98];
						}
						@Pc(913) int local913 = local378 + local388;
						if (local913 <= 0) {
							Static91.method1437(arg1, local33, local53);
						} else {
							if (local92[0]) {
								local913++;
							}
							if (local92[2]) {
								local913++;
							}
							if (local92[1]) {
								local913++;
							}
							if (local92[3]) {
								local913++;
							}
							@Pc(946) int local946 = 0;
							@Pc(948) int local948 = 0;
							@Pc(952) int local952 = local913 * 3;
							@Pc(959) int[] local959 = local501 ? new int[local952] : null;
							@Pc(962) int[] local962 = new int[local952];
							@Pc(965) int[] local965 = new int[local952];
							@Pc(968) int[] local968 = new int[local952];
							@Pc(971) int[] local971 = new int[local952];
							@Pc(974) int[] local974 = new int[local952];
							@Pc(981) int[] local981 = arg0 == null ? null : new int[local952];
							@Pc(990) int[] local990 = arg0 == null && arg3 == null ? null : new int[local952];
							@Pc(992) int local992 = -1;
							@Pc(994) int local994 = -1;
							@Pc(996) int local996 = 256;
							@Pc(1064) byte local1064;
							@Pc(1012) int local1012;
							@Pc(1014) int local1014;
							@Pc(1249) int local1249;
							@Pc(1255) int local1255;
							@Pc(1264) int local1264;
							@Pc(1269) int local1269;
							@Pc(1279) int local1279;
							@Pc(1274) int local1274;
							@Pc(1283) int local1283;
							@Pc(1342) int local1342;
							@Pc(1348) int local1348;
							if (local163 != null) {
								local996 = local163.anInt747;
								local992 = local163.anInt743;
								local994 = local163.anInt751;
								local1012 = Static548.method7557(arg2, local163);
								for (local1014 = 0; local1014 < local388; local1014++) {
									if (local92[-local104 & 0x3] && local810[0] == local946) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 1;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 1;
										Static540.anIntArray602[4] = local816[local946];
										Static540.anIntArray602[5] = local828[local946];
										local1064 = 6;
									} else if (local92[2 - local104 & 0x3] && local810[2] == local946) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 5;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 5;
										Static540.anIntArray602[4] = local816[local946];
										Static540.anIntArray602[5] = local828[local946];
										local1064 = 6;
									} else if (local92[1 - local104 & 0x3] && local810[1] == local946) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 3;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 3;
										Static540.anIntArray602[4] = local816[local946];
										local1064 = 6;
										Static540.anIntArray602[5] = local828[local946];
									} else if (local92[3 - local104 & 0x3] && local810[3] == local946) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 7;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 7;
										Static540.anIntArray602[4] = local816[local946];
										Static540.anIntArray602[5] = local828[local946];
										local1064 = 6;
									} else {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = local816[local946];
										local1064 = 3;
										Static540.anIntArray602[2] = local828[local946];
									}
									local946++;
									for (local1249 = 0; local1249 < local1064; local1249++) {
										local1255 = Static540.anIntArray602[local1249];
										local1264 = local1255 - local104 * 2 & 0x7;
										local1269 = this.anIntArray622[local1255];
										local1274 = this.anIntArray621[local1255];
										if (local104 == 1) {
											local1279 = local1274;
											local1283 = 512 - local1269;
										} else if (local104 == 2) {
											local1279 = 512 - local1269;
											local1283 = 512 - local1274;
										} else if (local104 == 3) {
											local1279 = 512 - local1274;
											local1283 = local1269;
										} else {
											local1279 = local1269;
											local1283 = local1274;
										}
										local962[local948] = local1279;
										local965[local948] = local1283;
										if (local981 != null && Static362.aBooleanArrayArray6[local98][local1255]) {
											local1342 = (local33 << 9) + local1279;
											local1348 = local1283 + (local53 << 9);
											local981[local948] = arg0.method7398(local1342, local1348) - arg4.method7398(local1342, local1348);
										}
										if (local990 != null) {
											if (arg0 != null && !Static362.aBooleanArrayArray6[local98][local1255]) {
												local1342 = (local33 << 9) + local1279;
												local1348 = local1283 + (local53 << 9);
												local990[local948] = arg4.method7398(local1342, local1348) - arg0.method7398(local1342, local1348);
											} else if (arg3 != null && !Static449.aBooleanArrayArray7[local98][local1255]) {
												local1342 = (local33 << 9) + local1279;
												local1348 = local1283 + (local53 << 9);
												local990[local948] = arg3.method7398(local1342, local1348) - arg4.method7398(local1342, local1348);
											}
										}
										if (local1255 < 8 && local163.anInt749 < Static275.anIntArray292[local1264]) {
											if (local959 != null) {
												local959[local948] = Static379.anIntArray435[local1264];
											}
											local974[local948] = Static500.anIntArray573[local1264];
											local971[local948] = Static179.anIntArray229[local1264];
											local968[local948] = Static611.anIntArray676[local1264];
										} else {
											if (local959 != null) {
												local959[local948] = local1012;
											}
											local971[local948] = local163.anInt751;
											local974[local948] = local163.anInt747;
											local968[local948] = local992;
										}
										local948++;
									}
								}
								if (!this.aBoolean674 && arg1 == 0) {
									Static624.method8356(local33, local53, local163.anInt746, local163.anInt750 * 8, local163.anInt745);
								}
								if (local98 != 12 && local163.anInt743 != -1 && local163.aBoolean59) {
									local87 = true;
								}
							} else if (local808) {
								local946 = Static298.anIntArray330[local98];
							} else if (local89) {
								local946 = Static135.anIntArray164[local98];
							} else {
								local946 = Static128.anIntArray162[local98];
							}
							if (local181 != null) {
								if (local144 == 0) {
									local144 = local120;
								}
								if (local128 == 0) {
									local128 = local120;
								}
								if (local136 == 0) {
									local136 = local120;
								}
								@Pc(1602) Class368 local1602 = this.aClass242_6.method5365(local120 - 1);
								@Pc(1610) Class368 local1610 = this.aClass242_6.method5365(local128 - 1);
								@Pc(1620) Class368 local1620 = this.aClass242_6.method5365(local136 - 1);
								@Pc(1628) Class368 local1628 = this.aClass242_6.method5365(local144 - 1);
								for (local1264 = 0; local1264 < local378; local1264++) {
									if (local92[-local104 & 0x3] && local810[0] == local946) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 1;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 1;
										Static540.anIntArray602[4] = local816[local946];
										local1064 = 6;
										Static540.anIntArray602[5] = local828[local946];
									} else if (local92[2 - local104 & 0x3] && local946 == local810[2]) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 5;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 5;
										Static540.anIntArray602[4] = local816[local946];
										local1064 = 6;
										Static540.anIntArray602[5] = local828[local946];
									} else if (local92[1 - local104 & 0x3] && local946 == local810[1]) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 3;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 3;
										Static540.anIntArray602[4] = local816[local946];
										local1064 = 6;
										Static540.anIntArray602[5] = local828[local946];
									} else if (local92[3 - local104 & 0x3] && local810[3] == local946) {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = 7;
										Static540.anIntArray602[2] = local828[local946];
										Static540.anIntArray602[3] = 7;
										Static540.anIntArray602[4] = local816[local946];
										local1064 = 6;
										Static540.anIntArray602[5] = local828[local946];
									} else {
										Static540.anIntArray602[0] = local840[local946];
										Static540.anIntArray602[1] = local816[local946];
										Static540.anIntArray602[2] = local828[local946];
										local1064 = 3;
									}
									local946++;
									for (local1269 = 0; local1269 < local1064; local1269++) {
										local1279 = Static540.anIntArray602[local1269];
										local1274 = local1279 - local104 * 2 & 0x7;
										local1283 = this.anIntArray622[local1279];
										local1348 = this.anIntArray621[local1279];
										@Pc(1906) int local1906;
										if (local104 == 1) {
											local1906 = 512 - local1283;
											local1342 = local1348;
										} else if (local104 == 2) {
											local1342 = 512 - local1283;
											local1906 = 512 - local1348;
										} else if (local104 == 3) {
											local1342 = 512 - local1348;
											local1906 = local1283;
										} else {
											local1906 = local1348;
											local1342 = local1283;
										}
										local962[local948] = local1342;
										local965[local948] = local1906;
										@Pc(1955) int local1955;
										@Pc(1961) int local1961;
										if (local981 != null && Static362.aBooleanArrayArray6[local98][local1279]) {
											local1955 = (local33 << 9) + local1342;
											local1961 = local1906 + (local53 << 9);
											local981[local948] = arg0.method7398(local1955, local1961) - arg4.method7398(local1955, local1961);
										}
										if (local990 != null) {
											if (arg0 != null && !Static362.aBooleanArrayArray6[local98][local1279]) {
												local1955 = (local33 << 9) + local1342;
												local1961 = local1906 + (local53 << 9);
												local990[local948] = arg4.method7398(local1955, local1961) - arg0.method7398(local1955, local1961);
											} else if (arg3 != null && !Static449.aBooleanArrayArray7[local98][local1279]) {
												local1955 = (local33 << 9) + local1342;
												local1961 = (local53 << 9) + local1906;
												local990[local948] = arg3.method7398(local1955, local1961) - arg4.method7398(local1955, local1961);
											}
										}
										if (local1279 < 8 && Static275.anIntArray292[local1274] >= 0) {
											if (local959 != null) {
												local959[local948] = Static379.anIntArray435[local1274];
											}
											local974[local948] = Static500.anIntArray573[local1274];
											local971[local948] = Static179.anIntArray229[local1274];
											local968[local948] = Static611.anIntArray676[local1274];
										} else {
											if (local89 && Static362.aBooleanArrayArray6[local98][local1279]) {
												local971[local948] = local994;
												local974[local948] = local996;
												local968[local948] = local992;
											} else if (local1342 == 0 && local1906 == 0) {
												local968[local948] = arg5[local33][local53];
												local971[local948] = local1602.anInt9872;
												local974[local948] = local1602.anInt9863;
											} else if (local1342 == 0 && local1906 == 512) {
												local968[local948] = arg5[local33][local71];
												local971[local948] = local1610.anInt9872;
												local974[local948] = local1610.anInt9863;
											} else if (local1342 == 512 && local1906 == 512) {
												local968[local948] = arg5[local51][local71];
												local971[local948] = local1620.anInt9872;
												local974[local948] = local1620.anInt9863;
											} else if (local1342 == 512 && local1906 == 0) {
												local968[local948] = arg5[local51][local53];
												local971[local948] = local1628.anInt9872;
												local974[local948] = local1628.anInt9863;
											} else {
												if (local1342 >= 256) {
													if (local1906 >= 256) {
														local971[local948] = local1620.anInt9872;
														local974[local948] = local1620.anInt9863;
													} else {
														local971[local948] = local1628.anInt9872;
														local974[local948] = local1628.anInt9863;
													}
												} else if (local1906 >= 256) {
													local971[local948] = local1610.anInt9872;
													local974[local948] = local1610.anInt9863;
												} else {
													local971[local948] = local1602.anInt9872;
													local974[local948] = local1602.anInt9863;
												}
												local1955 = Static218.method8363(arg5[local51][local53], local1342 << 7 >> 9, arg5[local33][local53]);
												local1961 = Static218.method8363(arg5[local51][local71], local1342 << 7 >> 9, arg5[local33][local71]);
												local968[local948] = Static218.method8363(local1961, local1906 << 7 >> 9, local1955);
											}
											if (local959 != null) {
												local959[local948] = local968[local948];
											}
										}
										local948++;
									}
								}
								if (local98 != 0 && local181.aBoolean727) {
									local87 = true;
								}
							}
							local1012 = arg4.method7396(local53, local33);
							local1014 = arg4.method7396(local53, local51);
							local1249 = arg4.method7396(local71, local51);
							local1255 = arg4.method7396(local71, local33);
							@Pc(2379) boolean local2379 = Static181.method2642(local53, local33);
							if (local2379 && arg1 > 1 || !local2379 && arg1 > 0) {
								@Pc(2395) boolean local2395 = true;
								if (local181 != null && !local181.aBoolean726) {
									local2395 = false;
								} else if (local120 == 0 && local98 != 0) {
									local2395 = false;
								} else if (local112 > 0 && local183 != null && !local183.aBoolean60) {
									local2395 = false;
								}
								if (local2395 && local1014 == local1012 && local1249 == local1012 && local1255 == local1012) {
									this.aByteArrayArrayArray15[arg1][local33][local53] = (byte) (this.aByteArrayArrayArray15[arg1][local33][local53] | 0x4);
								}
							}
							local1269 = 0;
							local1279 = 0;
							local1274 = 0;
							if (this.aBoolean674) {
								local1269 = Static624.method8354(local33, local53);
								local1279 = Static106.method1594(local33, local53);
								local1274 = Static186.method4310(local33, local53);
							}
							arg4.U(local33, local53, local962, local981, local965, local990, local968, local959, local971, local974, local1269, local1279, local1274, local87);
							Static91.method1437(arg1, local33, local53);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIB[Lclient!nt;Lclient!vj;II)V")
	public final void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class240[] arg2, @OriginalArg(4) Class2_Sub22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (!this.aBoolean674) {
			for (local18 = 0; local18 < 4; local18++) {
				@Pc(24) Class240 local24 = arg2[local18];
				for (local26 = 0; local26 < 64; local26++) {
					for (local30 = 0; local30 < 64; local30++) {
						local36 = arg1 + local26;
						@Pc(40) int local40 = local30 + arg0;
						if (local36 >= 0 && this.anInt9069 > local36 && local40 >= 0 && this.anInt9067 > local40) {
							local24.method5186(local40, local36);
						}
					}
				}
			}
		}
		local18 = arg5 + arg1;
		@Pc(89) int local89 = arg4 + arg0;
		for (local26 = 0; local26 < this.anInt9071; local26++) {
			for (local30 = 0; local30 < 64; local30++) {
				for (local36 = 0; local36 < 64; local36++) {
					this.method7618(local30 + local18, 0, false, local26, 0, arg0 + local36, 0, arg3, local36 + local89, arg1 + local30);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIZBIIIILclient!vj;II)V")
	private void method7618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub22 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg4 = 1;
		} else if (arg1 == 2) {
			arg6 = 1;
			arg4 = 1;
		} else if (arg1 == 3) {
			arg6 = 1;
		}
		@Pc(69) int local69;
		if (arg9 < 0 || arg9 >= this.anInt9069 || arg5 < 0 || arg5 >= this.anInt9067) {
			while (true) {
				local69 = arg7.method8547();
				if (local69 == 0) {
					return;
				}
				if (local69 == 1) {
					arg7.method8547();
					return;
				}
				if (local69 <= 49) {
					arg7.method8547();
				}
			}
			return;
		}
		if (!this.aBoolean674 && !arg2) {
			Static27.aByteArrayArrayArray1[arg3][arg9][arg5] = 0;
		}
		while (true) {
			local69 = arg7.method8547();
			if (local69 == 0) {
				if (this.aBoolean674) {
					this.anIntArrayArrayArray20[0][arg9 + arg6][arg4 + arg5] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray20[0][arg9 + arg6][arg4 + arg5] = -Static601.method8115(arg0 + 932731, arg8 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray20[arg3][arg9 + arg6][arg5 + arg4] = this.anIntArrayArrayArray20[arg3 - 1][arg9 + arg6][arg5 + arg4] - 960;
					return;
				}
			}
			if (local69 == 1) {
				@Pc(158) int local158 = arg7.method8547();
				if (this.aBoolean674) {
					this.anIntArrayArrayArray20[0][arg6 + arg9][arg5 + arg4] = local158 * 8 << 2;
					return;
				}
				if (local158 == 1) {
					local158 = 0;
				}
				if (arg3 != 0) {
					this.anIntArrayArrayArray20[arg3][arg9 + arg6][arg4 + arg5] = this.anIntArrayArrayArray20[arg3 - 1][arg9 + arg6][arg4 + arg5] - (local158 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray20[0][arg9 + arg6][arg4 + arg5] = -local158 * 8 << 2;
				return;
			}
			if (local69 <= 49) {
				if (arg2) {
					arg7.method8547();
				} else {
					this.aByteArrayArrayArray13[arg3][arg9][arg5] = arg7.method8548();
					this.aByteArrayArrayArray16[arg3][arg9][arg5] = (byte) ((local69 - 2) / 4);
					this.aByteArrayArrayArray18[arg3][arg9][arg5] = (byte) (arg1 + local69 - 2 & 0x3);
				}
			} else if (local69 <= 81) {
				if (!this.aBoolean674 && !arg2) {
					Static27.aByteArrayArrayArray1[arg3][arg9][arg5] = (byte) (local69 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray14[arg3][arg9][arg5] = (byte) (local69 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lclient!s;Lclient!s;[[IILclient!ha;Lclient!s;I)V")
	private void method7619(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) Class76 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9069; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt9067; local7++) {
				if (Static566.anInt9254 == -1 || Static76.method1081(arg5, local3, local7, Static566.anInt9254)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray16[arg5][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray18[arg5][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray13[arg5][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray14[arg5][local3][local7] & 0xFF;
					@Pc(77) Class26 local77 = local51 == 0 ? null : this.aClass96_6.method2121(local51 - 1);
					@Pc(92) Class368 local92 = local62 == 0 ? null : this.aClass242_6.method5365(local62 - 1);
					if (local31 == 0 && local77 == null) {
						local31 = 12;
					}
					@Pc(103) int local103 = 0;
					@Pc(105) int local105 = 0;
					if (local31 != 0) {
						local103 = local92 == null ? 0 : Static402.anIntArray468[local31];
						local105 = local77 == null ? 0 : Static298.anIntArray330[local31];
					} else if (local77 != null) {
						local105 = Static298.anIntArray330[local31];
					} else if (local92 != null) {
						local103 = Static298.anIntArray330[local31];
					}
					@Pc(146) int local146 = local103 + local105;
					@Pc(148) int local148 = 0;
					if (local146 != 0) {
						@Pc(160) int local160 = local77 == null ? -1 : local77.anInt751;
						@Pc(167) int local167 = local92 == null ? -1 : local92.anInt9872;
						@Pc(170) int[] local170 = new int[local146];
						@Pc(173) int[] local173 = new int[local146];
						@Pc(176) int[] local176 = new int[local146];
						@Pc(179) int[] local179 = new int[local146];
						@Pc(181) boolean local181 = false;
						@Pc(183) boolean local183 = false;
						@Pc(201) int local201;
						if (local77 == null || local77.anInt743 == -1 && local77.anInt741 == -1 && local160 == -1) {
							local183 = true;
							for (local201 = 0; local201 < local105; local201++) {
								local170[local148] = -1;
								local148++;
							}
						} else {
							for (local201 = 0; local201 < local105; local201++) {
								local176[local148] = local160;
								local179[local148] = local77.anInt747;
								if (local77.anInt743 == -1) {
									local170[local148] = -1;
								} else {
									local170[local148] = local77.anInt743;
								}
								if (local77.anInt741 == -1) {
									local173[local148] = -1;
								} else {
									local173[local148] = local77.anInt741;
									local181 = true;
								}
								local148++;
							}
							if (!this.aBoolean674 && arg5 == 0) {
								Static624.method8356(local3, local7, local77.anInt746, local77.anInt750 * 8, local77.anInt745);
							}
						}
						if (!local181) {
							local173 = null;
						}
						if (local92 == null) {
							if (local183) {
								continue;
							}
							for (local201 = 0; local201 < local103; local201++) {
								local170[local148] = -1;
								local148++;
							}
						} else {
							for (local201 = 0; local201 < local103; local201++) {
								local176[local148] = local167;
								local179[local148] = local92.anInt9863;
								local170[local148] = arg2[local3][local7];
								if (local173 != null) {
									local173[local148] = -1;
								}
								local148++;
							}
						}
						local201 = this.anIntArray622.length;
						@Pc(350) int[] local350 = new int[local201];
						@Pc(353) int[] local353 = new int[local201];
						@Pc(360) int[] local360 = arg0 == null ? null : new int[local201];
						@Pc(369) int[] local369 = arg0 == null && arg4 == null ? null : new int[local201];
						@Pc(378) int local378;
						@Pc(383) int local383;
						@Pc(467) int local467;
						@Pc(475) int local475;
						for (@Pc(371) int local371 = 0; local371 < local201; local371++) {
							local378 = this.anIntArray622[local371];
							local383 = this.anIntArray621[local371];
							if (local40 == 0) {
								local350[local371] = local378;
								local353[local371] = local383;
							} else if (local40 == 1) {
								local350[local371] = local383;
								local353[local371] = 512 - local378;
							} else if (local40 == 2) {
								local350[local371] = 512 - local378;
								local353[local371] = 512 - local383;
							} else if (local40 == 3) {
								local350[local371] = 512 - local383;
								local353[local371] = local378;
							}
							if (local360 != null && Static362.aBooleanArrayArray6[local31][local371]) {
								local467 = local350[local371] + (local3 << 9);
								local475 = local353[local371] + (local7 << 9);
								local360[local371] = arg0.method7398(local467, local475) - arg1.method7398(local467, local475);
							}
							if (local369 != null) {
								if (arg0 != null && !Static362.aBooleanArrayArray6[local31][local371]) {
									local467 = (local3 << 9) + local350[local371];
									local475 = (local7 << 9) + local353[local371];
									local369[local371] = arg1.method7398(local467, local475) - arg0.method7398(local467, local475);
								} else if (arg4 != null && !Static449.aBooleanArrayArray7[local31][local371]) {
									local467 = (local3 << 9) + local350[local371];
									local475 = local353[local371] + (local7 << 9);
									local369[local371] = arg4.method7398(local467, local475) - arg1.method7398(local467, local475);
								}
							}
						}
						local378 = arg1.method7396(local7, local3);
						local383 = arg1.method7396(local7, local3 + 1);
						local467 = arg1.method7396(local7 + 1, local3 + 1);
						local475 = arg1.method7396(local7 + 1, local3);
						@Pc(620) boolean local620 = Static181.method2642(local7, local3);
						if (local620 && arg5 > 1 || !local620 && arg5 > 0) {
							@Pc(633) boolean local633 = true;
							if (local92 != null && !local92.aBoolean726) {
								local633 = false;
							} else if (local62 == 0 && local31 != 0) {
								local633 = false;
							} else if (local51 > 0 && local77 != null && !local77.aBoolean60) {
								local633 = false;
							}
							if (local633 && local378 == local383 && local378 == local467 && local475 == local378) {
								this.aByteArrayArrayArray15[arg5][local3][local7] = (byte) (this.aByteArrayArrayArray15[arg5][local3][local7] | 0x4);
							}
						}
						@Pc(694) int local694 = 0;
						@Pc(696) int local696 = 0;
						@Pc(698) int local698 = 0;
						if (this.aBoolean674) {
							local694 = Static624.method8354(local3, local7);
							local696 = Static106.method1594(local3, local7);
							local698 = Static186.method4310(local3, local7);
						}
						arg1.method7399(local3, local7, local350, local360, local353, local369, Static133.anIntArrayArray8[local31], Static230.anIntArrayArray19[local31], Static547.anIntArrayArray61[local31], local170, local173, local176, local179, local694, local696, local698);
						Static91.method1437(arg5, local3, local7);
					}
				}
			}
		}
	}
}
