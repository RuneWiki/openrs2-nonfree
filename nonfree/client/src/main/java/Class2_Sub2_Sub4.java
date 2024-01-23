import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public abstract class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "[Lclient!lj;")
	private Class60[] aClass60Array11;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
	public int anInt1008 = 0;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "[I")
	private int[] anIntArray83;

	@OriginalMember(owner = "client!cc", name = "tb", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "[I")
	private int[] anIntArray82;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
	private int anInt1009;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
	private int anInt1013;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class2_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray83 = arg1;
		this.anIntArray87 = arg2;
		this.anIntArray84 = arg3;
		this.anIntArray82 = arg4;
		this.method778(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray87[local25] < local21 && this.anIntArray82[local25] != 0) {
				local21 = this.anIntArray87[local25];
			}
			if (this.anIntArray87[local25] + this.anIntArray82[local25] > local23) {
				local23 = this.anIntArray87[local25] + this.anIntArray82[local25];
			}
		}
		this.anInt1009 = this.anInt1008 - local21;
		this.anInt1013 = local23 - this.anInt1008;
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) byte[] arg0) {
		this.method778(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;II)V")
	private void method767(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1008;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2012; local10++) {
			@Pc(18) int local18 = arg0.aByteArray26[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class41 local38 = arg0.method1412(local6 + 1, local10);
					local6 = -1;
					if (local38.method1386(Static24.aClass41_324)) {
						local18 = 60;
					} else if (local38.method1386(Static24.aClass41_318)) {
						local18 = 62;
					} else if (local38.method1386(Static24.aClass41_313)) {
						local18 = 160;
					} else if (local38.method1386(Static24.aClass41_320)) {
						local18 = 173;
					} else if (local38.method1386(Static24.aClass41_309)) {
						local18 = 215;
					} else if (local38.method1386(Static24.aClass41_307)) {
						local18 = 128;
					} else if (local38.method1386(Static24.aClass41_317)) {
						local18 = 169;
					} else {
						if (!local38.method1386(Static24.aClass41_310)) {
							if (local38.method1408(Static24.aClass41_329)) {
								try {
									local116 = local38.method1424(4).method1392();
									@Pc(121) Class60 local121 = this.aClass60Array11[local116];
									@Pc(132) int local132 = this.anIntArray85 == null ? local121.anInt3995 : this.anIntArray85[local116];
									if (Static24.anInt1018 == 256) {
										local121.method2740(arg1, local4 + this.anInt1008 - local132);
									} else {
										local121.method2741(arg1, local4 + this.anInt1008 - local132, Static24.anInt1018);
									}
									arg1 += local121.anInt3990;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method785(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray9 != null && local8 != -1) {
						arg1 += this.aByteArray9[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray84[local18];
					local116 = this.anIntArray82[local18];
					if (local18 == 32) {
						if (Static24.anInt1016 > 0) {
							Static24.anInt1007 += Static24.anInt1016;
							arg1 += Static24.anInt1007 >> 8;
							Static24.anInt1007 &= 0xFF;
						}
					} else if (Static24.anInt1018 == 256) {
						if (Static24.anInt1014 != -1) {
							this.method772(local18, arg1 + this.anIntArray83[local18] + 1, local4 + this.anIntArray87[local18] + 1, local194, local116, Static24.anInt1014);
						}
						this.method773(local18, arg1 + this.anIntArray83[local18], local4 + this.anIntArray87[local18], local194, local116, Static24.anInt1017);
					} else {
						if (Static24.anInt1014 != -1) {
							this.method790(local18, arg1 + this.anIntArray83[local18] + 1, local4 + this.anIntArray87[local18] + 1, local194, local116, Static24.anInt1014, Static24.anInt1018);
						}
						this.method777(local18, arg1 + this.anIntArray83[local18], local4 + this.anIntArray87[local18], local194, local116, Static24.anInt1017, Static24.anInt1018);
					}
					@Pc(316) int local316 = this.anIntArray86[local18];
					if (Static24.anInt1015 != -1) {
						Static64.method1175(arg1, local4 + (int) ((double) this.anInt1008 * 0.7D), local316, Static24.anInt1015);
					}
					if (Static24.anInt1006 != -1) {
						Static64.method1175(arg1, local4 + this.anInt1008 + 1, local316, Static24.anInt1006);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;I)V")
	private void method768(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1393(); local5++) {
			@Pc(11) int local11 = arg0.method1388(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static24.anInt1016 = (arg1 - this.method788(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)I")
	private int method769(@OriginalArg(0) int arg0) {
		return this.anIntArray86[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;[I[Lclient!i;)I")
	private int method770(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class41[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class41 local11 = Static148.method2319(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1393();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1388(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class41 local55 = arg0.method1412(local19 + 1, local29);
					local19 = -1;
					local11.method1427(60);
					local11.method1405(local55);
					local11.method1427(62);
					if (local55.method1386(Static24.aClass41_308)) {
						arg2[local23++] = local11.method1412(local7, local11.method1393());
						local7 = local11.method1393();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1386(Static24.aClass41_324)) {
						local5 += this.method769(60);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1386(Static24.aClass41_318)) {
						local5 += this.method769(62);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1386(Static24.aClass41_313)) {
						local5 += this.method769(160);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1386(Static24.aClass41_320)) {
						local5 += this.method769(173);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1386(Static24.aClass41_309)) {
						local5 += this.method769(215);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1386(Static24.aClass41_307)) {
						local5 += this.method769(128);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1386(Static24.aClass41_317)) {
						local5 += this.method769(169);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1386(Static24.aClass41_310)) {
						local5 += this.method769(174);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1408(Static24.aClass41_329)) {
						try {
							@Pc(359) int local359 = local55.method1424(4).method1392();
							local5 += this.aClass60Array11[local359].anInt3990;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1427(local35);
						local5 += this.method769(local35);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1393();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1412(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1393();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1393() > local7) {
			arg2[local23++] = local11.method1412(local7, local11.method1393());
		}
		return local23;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;IIII)V")
	public final void method771(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method791(arg3, arg4);
			this.method767(arg0, arg1 - this.method788(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;IIIII)V")
	public final void method774(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method791(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2012];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2012; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method781(arg0, arg1 - this.method788(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!i;IIIII)V")
	public final void method775(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method791(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2012];
		@Pc(14) int[] local14 = new int[arg0.anInt2012];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2012; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method781(arg0, arg1 - this.method788(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	private void method776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static24.anInt1015 = -1;
		Static24.anInt1006 = -1;
		Static24.anInt1012 = arg1;
		Static24.anInt1014 = arg1;
		Static24.anInt1010 = arg0;
		Static24.anInt1017 = arg0;
		Static24.anInt1011 = arg2;
		Static24.anInt1018 = arg2;
		Static24.anInt1016 = 0;
		Static24.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([B)V")
	private void method778(@OriginalArg(0) byte[] arg0) {
		this.anIntArray86 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray86.length; local9++) {
				this.anIntArray86[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1008 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray86[local37] = arg0[local9++] & 0xFF;
		}
		@Pc(55) int[] local55 = new int[256];
		@Pc(58) int[] local58 = new int[256];
		for (@Pc(60) int local60 = 0; local60 < 256; local60++) {
			local55[local60] = arg0[local9++] & 0xFF;
		}
		for (@Pc(76) int local76 = 0; local76 < 256; local76++) {
			local58[local76] = arg0[local9++] & 0xFF;
		}
		@Pc(93) byte[][] local93 = new byte[256][];
		@Pc(107) int local107;
		for (@Pc(95) int local95 = 0; local95 < 256; local95++) {
			local93[local95] = new byte[local55[local95]];
			@Pc(105) byte local105 = 0;
			for (local107 = 0; local107 < local93[local95].length; local107++) {
				local105 += arg0[local9++];
				local93[local95][local107] = local105;
			}
		}
		@Pc(136) byte[][] local136 = new byte[256][];
		@Pc(150) int local150;
		for (local107 = 0; local107 < 256; local107++) {
			local136[local107] = new byte[local55[local107]];
			@Pc(148) byte local148 = 0;
			for (local150 = 0; local150 < local136[local107].length; local150++) {
				local148 += arg0[local9++];
				local136[local107][local150] = local148;
			}
		}
		this.aByteArray9 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray9[(local182 << 8) + local150] = (byte) Static24.method787(local93, local136, local58, this.anIntArray86, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1008 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([Lclient!lj;[I)V")
	public final void method779(@OriginalArg(0) Class60[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass60Array11 = arg0;
		this.anIntArray85 = arg1;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!i;IIII)V")
	public final void method780(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method791(arg3, arg4);
			this.method767(arg0, arg1 - this.method788(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;II[I[I)V")
	private void method781(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1008;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2012; local12++) {
			@Pc(20) int local20 = arg0.aByteArray26[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class41 local40 = arg0.method1412(local6 + 1, local12);
					local6 = -1;
					if (local40.method1386(Static24.aClass41_324)) {
						local20 = 60;
					} else if (local40.method1386(Static24.aClass41_318)) {
						local20 = 62;
					} else if (local40.method1386(Static24.aClass41_313)) {
						local20 = 160;
					} else if (local40.method1386(Static24.aClass41_320)) {
						local20 = 173;
					} else if (local40.method1386(Static24.aClass41_309)) {
						local20 = 215;
					} else if (local40.method1386(Static24.aClass41_307)) {
						local20 = 128;
					} else if (local40.method1386(Static24.aClass41_317)) {
						local20 = 169;
					} else {
						if (!local40.method1386(Static24.aClass41_310)) {
							if (local40.method1408(Static24.aClass41_329)) {
								try {
									if (arg3 == null) {
										local117 = 0;
									} else {
										local117 = arg3[local10];
									}
									if (arg4 == null) {
										local126 = 0;
									} else {
										local126 = arg4[local10];
									}
									local10++;
									local137 = local40.method1424(4).method1392();
									@Pc(142) Class60 local142 = this.aClass60Array11[local137];
									@Pc(153) int local153 = this.anIntArray85 == null ? local142.anInt3995 : this.anIntArray85[local137];
									if (Static24.anInt1018 == 256) {
										local142.method2740(arg1 + local117, local4 + this.anInt1008 - local153 + local126);
									} else {
										local142.method2741(arg1 + local117, local4 + this.anInt1008 - local153 + local126, Static24.anInt1018);
									}
									arg1 += local142.anInt3990;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method785(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray9 != null && local8 != -1) {
						arg1 += this.aByteArray9[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray84[local20];
					local117 = this.anIntArray82[local20];
					if (arg3 == null) {
						local126 = 0;
					} else {
						local126 = arg3[local10];
					}
					if (arg4 == null) {
						local137 = 0;
					} else {
						local137 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static24.anInt1016 > 0) {
							Static24.anInt1007 += Static24.anInt1016;
							arg1 += Static24.anInt1007 >> 8;
							Static24.anInt1007 &= 0xFF;
						}
					} else if (Static24.anInt1018 == 256) {
						if (Static24.anInt1014 != -1) {
							this.method772(local20, arg1 + this.anIntArray83[local20] + local126 + 1, local4 + this.anIntArray87[local20] + 1 + local137, local223, local117, Static24.anInt1014);
						}
						this.method773(local20, arg1 + this.anIntArray83[local20] + local126, local4 + this.anIntArray87[local20] + local137, local223, local117, Static24.anInt1017);
					} else {
						if (Static24.anInt1014 != -1) {
							this.method790(local20, arg1 + this.anIntArray83[local20] + local126 + 1, local4 + this.anIntArray87[local20] + 1 + local137, local223, local117, Static24.anInt1014, Static24.anInt1018);
						}
						this.method777(local20, arg1 + this.anIntArray83[local20] + local126, local4 + this.anIntArray87[local20] + local137, local223, local117, Static24.anInt1017, Static24.anInt1018);
					}
					@Pc(380) int local380 = this.anIntArray86[local20];
					if (Static24.anInt1015 != -1) {
						Static64.method1175(arg1, local4 + (int) ((double) this.anInt1008 * 0.7D), local380, Static24.anInt1015);
					}
					if (Static24.anInt1006 != -1) {
						Static64.method1175(arg1, local4 + this.anInt1008, local380, Static24.anInt1006);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;IIIIIIIIII)I")
	private int method782(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method776(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1008;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1009 + this.anInt1013 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method770(arg0, local20, Static24.aClass41Array13);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1009;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1009 + (arg4 - this.anInt1009 - this.anInt1013 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1013 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1009 - this.anInt1013 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1009 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method767(Static24.aClass41Array13[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method767(Static24.aClass41Array13[local118], arg1 + (arg3 - this.method788(Static24.aClass41Array13[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method767(Static24.aClass41Array13[local118], arg1 + arg3 - this.method788(Static24.aClass41Array13[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method767(Static24.aClass41Array13[local118], arg1, local57);
			} else {
				this.method768(Static24.aClass41Array13[local118], arg3);
				this.method767(Static24.aClass41Array13[local118], arg1, local57);
				Static24.anInt1016 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;IIIIIIIII)I")
	public final int method783(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method782(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lclient!i;IIII)V")
	public final void method784(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method791(arg3, arg4);
			this.method767(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;)V")
	private void method785(@OriginalArg(0) Class41 arg0) {
		try {
			if (arg0.method1408(Static24.aClass41_322)) {
				Static24.anInt1017 = arg0.method1424(4).method1396(16);
				return;
			}
			if (arg0.method1386(Static24.aClass41_326)) {
				Static24.anInt1017 = Static24.anInt1010;
				return;
			}
			if (arg0.method1408(Static24.aClass41_319)) {
				Static24.anInt1018 = arg0.method1424(6).method1392();
				return;
			}
			if (arg0.method1386(Static24.aClass41_325)) {
				Static24.anInt1018 = Static24.anInt1011;
				return;
			}
			if (arg0.method1408(Static24.aClass41_314)) {
				Static24.anInt1015 = arg0.method1424(4).method1396(16);
				return;
			}
			if (arg0.method1386(Static24.aClass41_328)) {
				Static24.anInt1015 = 8388608;
				return;
			}
			if (arg0.method1386(Static24.aClass41_323)) {
				Static24.anInt1015 = -1;
				return;
			}
			if (arg0.method1408(Static24.aClass41_316)) {
				Static24.anInt1006 = arg0.method1424(2).method1396(16);
				return;
			}
			if (arg0.method1386(Static24.aClass41_327)) {
				Static24.anInt1006 = 0;
				return;
			}
			if (arg0.method1386(Static24.aClass41_315)) {
				Static24.anInt1006 = -1;
				return;
			}
			if (arg0.method1408(Static24.aClass41_312)) {
				Static24.anInt1014 = arg0.method1424(5).method1396(16);
				return;
			}
			if (arg0.method1386(Static24.aClass41_321)) {
				Static24.anInt1014 = 0;
				return;
			}
			if (arg0.method1386(Static24.aClass41_311)) {
				Static24.anInt1014 = Static24.anInt1012;
				return;
			}
			if (arg0.method1386(Static24.aClass41_308)) {
				this.method776(Static24.anInt1010, Static24.anInt1012, Static24.anInt1011);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!i;I)I")
	public final int method786(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method770(arg0, new int[] { arg1 }, Static24.aClass41Array13);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method788(Static24.aClass41Array13[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!i;)I")
	public final int method788(@OriginalArg(0) Class41 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2012; local11++) {
			@Pc(19) int local19 = arg0.aByteArray26[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class41 local39 = arg0.method1412(local5 + 1, local11);
					local5 = -1;
					if (local39.method1386(Static24.aClass41_324)) {
						local19 = 60;
					} else if (local39.method1386(Static24.aClass41_318)) {
						local19 = 62;
					} else if (local39.method1386(Static24.aClass41_313)) {
						local19 = 160;
					} else if (local39.method1386(Static24.aClass41_320)) {
						local19 = 173;
					} else if (local39.method1386(Static24.aClass41_309)) {
						local19 = 215;
					} else if (local39.method1386(Static24.aClass41_307)) {
						local19 = 128;
					} else if (local39.method1386(Static24.aClass41_317)) {
						local19 = 169;
					} else {
						if (!local39.method1386(Static24.aClass41_310)) {
							if (local39.method1408(Static24.aClass41_329)) {
								try {
									@Pc(117) int local117 = local39.method1424(4).method1392();
									local9 += this.aClass60Array11[local117].anInt3990;
									local7 = -1;
								} catch (@Pc(129) Exception local129) {
								}
							}
							continue;
						}
						local19 = 174;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray86[local19];
					if (this.aByteArray9 != null && local7 != -1) {
						local9 += this.aByteArray9[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	private void method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static24.anInt1015 = -1;
		Static24.anInt1006 = -1;
		Static24.anInt1012 = arg1;
		Static24.anInt1014 = arg1;
		Static24.anInt1010 = arg0;
		Static24.anInt1017 = arg0;
		Static24.anInt1011 = 256;
		Static24.anInt1018 = 256;
		Static24.anInt1016 = 0;
		Static24.anInt1007 = 0;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(Lclient!i;I)I")
	public final int method793(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1) {
		return this.method770(arg0, new int[] { arg1 }, Static24.aClass41Array13);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;IIIIII)V")
	public final void method794(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method791(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2012];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2012; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method781(arg0, arg1 - this.method788(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!i;IIIILjava/util/Random;I)I")
	public final int method795(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method776(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2012];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2012; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method781(arg0, arg1, arg2, local21, null);
		return local23;
	}
}
