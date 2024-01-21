import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class2_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!e", name = "nb", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!e", name = "pb", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!e", name = "X", descriptor = "[[B")
	protected byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!e", name = "bb", descriptor = "I")
	public int anInt636 = 0;

	@OriginalMember(owner = "client!e", name = "W", descriptor = "[I")
	private int[] anIntArray54;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "[I")
	private int[] anIntArray53;

	@OriginalMember(owner = "client!e", name = "ib", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!e", name = "sb", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
	private int anInt637;

	@OriginalMember(owner = "client!e", name = "kb", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray54 = arg1;
		this.anIntArray53 = arg2;
		this.anIntArray55 = arg3;
		this.anIntArray57 = arg4;
		this.method516(arg0);
		this.aByteArrayArray5 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray53[local32] < local28 && this.anIntArray57[local32] != 0) {
				local28 = this.anIntArray53[local32];
			}
			if (this.anIntArray53[local32] + this.anIntArray57[local32] > local30) {
				local30 = this.anIntArray53[local32] + this.anIntArray57[local32];
			}
		}
		this.anInt637 = this.anInt636 - local28;
		this.anInt639 = local30 - this.anInt636;
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method516(arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;IIII)V")
	public final void method505(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method519(arg3, arg4);
			this.method507(arg0, arg1 - this.method514(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;II[I[I)V")
	private void method506(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt636;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt513; local12++) {
			@Pc(20) int local20 = arg0.aByteArray7[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(69) int local69;
				@Pc(78) int local78;
				@Pc(89) int local89;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class10 local40 = arg0.method353(local6 + 1, local12);
					local6 = -1;
					if (local40.method358(Static35.aClass10_308)) {
						local20 = 60;
					} else {
						if (!local40.method358(Static35.aClass10_302)) {
							if (local40.method341(Static35.aClass10_307)) {
								try {
									if (arg3 == null) {
										local69 = 0;
									} else {
										local69 = arg3[local10];
									}
									if (arg4 == null) {
										local78 = 0;
									} else {
										local78 = arg4[local10];
									}
									local10++;
									local89 = local40.method333(4).method332();
									@Pc(93) Class2_Sub1_Sub4_Sub3 local93 = Static35.aClass2_Sub1_Sub4_Sub3Array8[local89];
									local93.method1874(arg1 + local69, local4 + this.anInt636 - local93.anInt2633 + local78);
									arg1 += local93.anInt2634;
									local8 = -1;
								} catch (@Pc(116) Exception local116) {
								}
							} else {
								this.method513(local40);
							}
							continue;
						}
						local20 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray9 != null && local8 != -1) {
						arg1 += this.aByteArray9[(local8 << 8) + local20];
					}
					@Pc(146) int local146 = this.anIntArray55[local20];
					local69 = this.anIntArray57[local20];
					if (arg3 == null) {
						local78 = 0;
					} else {
						local78 = arg3[local10];
					}
					if (arg4 == null) {
						local89 = 0;
					} else {
						local89 = arg4[local10];
					}
					local10++;
					if (local20 == 32) {
						if (Static35.anInt631 > 0) {
							Static35.anInt634 += Static35.anInt631;
							arg1 += Static35.anInt634 >> 8;
							Static35.anInt634 &= 0xFF;
						}
					} else if (Static35.anInt633 == 256) {
						if (Static35.anInt640 != -1) {
							this.method515(local20, arg1 + this.anIntArray54[local20] + local78 + 1, local4 + this.anIntArray53[local20] + 1 + local89, local146, local69, Static35.anInt640);
						}
						this.method534(local20, arg1 + this.anIntArray54[local20] + local78, local4 + this.anIntArray53[local20] + local89, local146, local69, Static35.anInt638);
					} else {
						if (Static35.anInt640 != -1) {
							this.method517(local20, arg1 + this.anIntArray54[local20] + local78 + 1, local4 + this.anIntArray53[local20] + 1 + local89, local146, local69, Static35.anInt640, Static35.anInt633);
						}
						this.method512(local20, arg1 + this.anIntArray54[local20] + local78, local4 + this.anIntArray53[local20] + local89, local146, local69, Static35.anInt638, Static35.anInt633);
					}
					@Pc(303) int local303 = this.anIntArray56[local20];
					if (Static35.anInt641 != -1) {
						Static172.method2029(arg1, local4 + (int) ((double) this.anInt636 * 0.7D), local303, Static35.anInt641);
					}
					if (Static35.anInt643 != -1) {
						Static172.method2029(arg1, local4 + this.anInt636, local303, Static35.anInt643);
					}
					arg1 += local303;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;II)V")
	private void method507(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt636;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt513; local10++) {
			@Pc(18) int local18 = arg0.aByteArray7[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(68) int local68;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class10 local38 = arg0.method353(local6 + 1, local10);
					local6 = -1;
					if (local38.method358(Static35.aClass10_308)) {
						local18 = 60;
					} else {
						if (!local38.method358(Static35.aClass10_302)) {
							if (local38.method341(Static35.aClass10_307)) {
								try {
									local68 = local38.method333(4).method332();
									@Pc(72) Class2_Sub1_Sub4_Sub3 local72 = Static35.aClass2_Sub1_Sub4_Sub3Array8[local68];
									local72.method1874(arg1, local4 + this.anInt636 - local72.anInt2633);
									arg1 += local72.anInt2634;
									local8 = -1;
								} catch (@Pc(91) Exception local91) {
								}
							} else {
								this.method513(local38);
							}
							continue;
						}
						local18 = 62;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray9 != null && local8 != -1) {
						arg1 += this.aByteArray9[(local8 << 8) + local18];
					}
					@Pc(121) int local121 = this.anIntArray55[local18];
					local68 = this.anIntArray57[local18];
					if (local18 == 32) {
						if (Static35.anInt631 > 0) {
							Static35.anInt634 += Static35.anInt631;
							arg1 += Static35.anInt634 >> 8;
							Static35.anInt634 &= 0xFF;
						}
					} else if (Static35.anInt633 == 256) {
						if (Static35.anInt640 != -1) {
							this.method515(local18, arg1 + this.anIntArray54[local18] + 1, local4 + this.anIntArray53[local18] + 1, local121, local68, Static35.anInt640);
						}
						this.method534(local18, arg1 + this.anIntArray54[local18], local4 + this.anIntArray53[local18], local121, local68, Static35.anInt638);
					} else {
						if (Static35.anInt640 != -1) {
							this.method517(local18, arg1 + this.anIntArray54[local18] + 1, local4 + this.anIntArray53[local18] + 1, local121, local68, Static35.anInt640, Static35.anInt633);
						}
						this.method512(local18, arg1 + this.anIntArray54[local18], local4 + this.anIntArray53[local18], local121, local68, Static35.anInt638, Static35.anInt633);
					}
					@Pc(243) int local243 = this.anIntArray56[local18];
					if (Static35.anInt641 != -1) {
						Static172.method2029(arg1, local4 + (int) ((double) this.anInt636 * 0.7D), local243, Static35.anInt641);
					}
					if (Static35.anInt643 != -1) {
						Static172.method2029(arg1, local4 + this.anInt636 + 1, local243, Static35.anInt643);
					}
					arg1 += local243;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;IIIILjava/util/Random;I)I")
	public final int method509(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method528(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt513];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt513; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method506(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Lclient!cd;IIII)V")
	public final void method510(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method519(arg3, arg4);
			this.method507(arg0, arg1 - this.method514(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;)V")
	private void method513(@OriginalArg(0) Class10 arg0) {
		try {
			if (arg0.method341(Static35.aClass10_303)) {
				Static35.anInt638 = arg0.method333(4).method339(16);
				return;
			}
			if (arg0.method358(Static35.aClass10_311)) {
				Static35.anInt638 = Static35.anInt632;
				return;
			}
			if (arg0.method341(Static35.aClass10_304)) {
				Static35.anInt641 = arg0.method333(4).method339(16);
				return;
			}
			if (arg0.method358(Static35.aClass10_305)) {
				Static35.anInt641 = 8388608;
				return;
			}
			if (arg0.method358(Static35.aClass10_313)) {
				Static35.anInt641 = -1;
				return;
			}
			if (arg0.method341(Static35.aClass10_315)) {
				Static35.anInt643 = arg0.method333(2).method339(16);
				return;
			}
			if (arg0.method358(Static35.aClass10_309)) {
				Static35.anInt643 = 0;
				return;
			}
			if (arg0.method358(Static35.aClass10_306)) {
				Static35.anInt643 = -1;
				return;
			}
			if (arg0.method341(Static35.aClass10_310)) {
				Static35.anInt640 = arg0.method333(5).method339(16);
				return;
			}
			if (arg0.method358(Static35.aClass10_314)) {
				Static35.anInt640 = 0;
				return;
			}
			if (arg0.method358(Static35.aClass10_312)) {
				Static35.anInt640 = Static35.anInt635;
				return;
			}
			if (arg0.method358(Static35.aClass10_316)) {
				this.method528(Static35.anInt632, Static35.anInt635, Static35.anInt642);
				return;
			}
		} catch (@Pc(123) Exception local123) {
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Lclient!cd;)I")
	public final int method514(@OriginalArg(0) Class10 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt513; local11++) {
			@Pc(19) int local19 = arg0.aByteArray7[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class10 local39 = arg0.method353(local5 + 1, local11);
					local5 = -1;
					if (local39.method358(Static35.aClass10_308)) {
						local19 = 60;
					} else {
						if (!local39.method358(Static35.aClass10_302)) {
							if (local39.method341(Static35.aClass10_307)) {
								try {
									@Pc(69) int local69 = local39.method333(4).method332();
									local9 += Static35.aClass2_Sub1_Sub4_Sub3Array8[local69].anInt2634;
									local7 = -1;
								} catch (@Pc(80) Exception local80) {
								}
							}
							continue;
						}
						local19 = 62;
					}
				}
				if (local5 == -1) {
					local9 += this.anIntArray56[local19];
					if (this.aByteArray9 != null && local7 != -1) {
						local9 += this.aByteArray9[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(IIIIII)V")
	private void method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static172.anInt2832;
		@Pc(9) int local9 = Static172.anInt2832 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static172.anInt2833) {
			local20 = Static172.anInt2833 - arg2;
			arg4 -= local20;
			arg2 = Static172.anInt2833;
			local13 = local20 * arg3;
			local5 += local20 * Static172.anInt2832;
		}
		if (arg2 + arg4 > Static172.anInt2828) {
			arg4 -= arg2 + arg4 - Static172.anInt2828;
		}
		if (arg1 < Static172.anInt2831) {
			local20 = Static172.anInt2831 - arg1;
			arg3 -= local20;
			arg1 = Static172.anInt2831;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static172.anInt2830) {
			local20 = arg1 + arg3 - Static172.anInt2830;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static35.method521(Static172.anIntArray298, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([B)V")
	private void method516(@OriginalArg(0) byte[] arg0) {
		this.anIntArray56 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray56.length; local9++) {
				this.anIntArray56[local9] = arg0[local9] & 0xFF;
			}
			this.anInt636 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray56[local37] = arg0[local9++] & 0xFF;
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
						this.aByteArray9[(local182 << 8) + local150] = (byte) Static35.method508(local93, local136, local58, this.anIntArray56, local55, local182, local150);
					}
				}
			}
		}
		this.anInt636 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIIIII)V")
	private void method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static172.anInt2832;
		@Pc(9) int local9 = Static172.anInt2832 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static172.anInt2833) {
			local20 = Static172.anInt2833 - arg2;
			arg4 -= local20;
			arg2 = Static172.anInt2833;
			local13 = local20 * arg3;
			local5 += local20 * Static172.anInt2832;
		}
		if (arg2 + arg4 > Static172.anInt2828) {
			arg4 -= arg2 + arg4 - Static172.anInt2828;
		}
		if (arg1 < Static172.anInt2831) {
			local20 = Static172.anInt2831 - arg1;
			arg3 -= local20;
			arg1 = Static172.anInt2831;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static172.anInt2830) {
			local20 = arg1 + arg3 - Static172.anInt2830;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static35.method530(Static172.anIntArray298, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;I)V")
	private void method518(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method340(); local5++) {
			@Pc(11) int local11 = arg0.method357(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static35.anInt631 = (arg1 - this.method514(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	private void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static35.anInt641 = -1;
		Static35.anInt643 = -1;
		Static35.anInt635 = arg1;
		Static35.anInt640 = arg1;
		Static35.anInt632 = arg0;
		Static35.anInt638 = arg0;
		Static35.anInt642 = 256;
		Static35.anInt633 = 256;
		Static35.anInt631 = 0;
		Static35.anInt634 = 0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;IIIIII)V")
	public final void method520(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method519(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt513];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt513; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method506(arg0, arg1 - this.method514(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;IIIIIIIII)I")
	public final int method522(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method533(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;[I[Lclient!cd;)I")
	private int method523(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class10[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class10 local11 = Static161.method2445(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method340();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method357(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class10 local55 = arg0.method353(local19 + 1, local29);
					local19 = -1;
					local11.method351(60);
					local11.method352(local55);
					local11.method351(62);
					if (local55.method358(Static35.aClass10_316)) {
						arg2[local23++] = local11.method353(local7, local11.method340());
						local7 = local11.method340();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method358(Static35.aClass10_308)) {
						local5 += this.method527(60);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method358(Static35.aClass10_302)) {
						local5 += this.method527(62);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method341(Static35.aClass10_307)) {
						try {
							@Pc(173) int local173 = local55.method333(4).method332();
							local5 += Static35.aClass2_Sub1_Sub4_Sub3Array8[local173].anInt2634;
							local21 = -1;
						} catch (@Pc(184) Exception local184) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method351(local35);
						local5 += this.method527(local35);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method340();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method353(local7, local13 - local17);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method340();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method340() > local7) {
			arg2[local23++] = local11.method353(local7, local11.method340());
		}
		return local23;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Lclient!cd;I)I")
	public final int method524(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method523(arg0, new int[] { arg1 }, Static35.aClass10Array4);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method514(Static35.aClass10Array4[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;IIIII)V")
	public final void method526(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method519(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt513];
		@Pc(14) int[] local14 = new int[arg0.anInt513];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt513; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method506(arg0, arg1 - this.method514(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)I")
	private int method527(@OriginalArg(0) int arg0) {
		return this.anIntArray56[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	private void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static35.anInt641 = -1;
		Static35.anInt643 = -1;
		Static35.anInt635 = arg1;
		Static35.anInt640 = arg1;
		Static35.anInt632 = arg0;
		Static35.anInt638 = arg0;
		Static35.anInt642 = arg2;
		Static35.anInt633 = arg2;
		Static35.anInt631 = 0;
		Static35.anInt634 = 0;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Lclient!cd;I)I")
	public final int method529(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1) {
		return this.method523(arg0, new int[] { arg1 }, Static35.aClass10Array4);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(Lclient!cd;IIIII)V")
	public final void method531(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method519(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt513];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt513; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method506(arg0, arg1 - this.method514(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Lclient!cd;IIII)V")
	public final void method532(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method519(arg3, arg4);
			this.method507(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!cd;IIIIIIIIII)I")
	private int method533(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method528(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt636;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt637 + this.anInt639 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method523(arg0, local20, Static35.aClass10Array4);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt637;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt637 + (arg4 - this.anInt637 - this.anInt639 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt639 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt637 - this.anInt639 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt637 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method507(Static35.aClass10Array4[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method507(Static35.aClass10Array4[local118], arg1 + (arg3 - this.method514(Static35.aClass10Array4[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method507(Static35.aClass10Array4[local118], arg1 + arg3 - this.method514(Static35.aClass10Array4[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method507(Static35.aClass10Array4[local118], arg1, local57);
			} else {
				this.method518(Static35.aClass10Array4[local118], arg3);
				this.method507(Static35.aClass10Array4[local118], arg1, local57);
				Static35.anInt631 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);
}
