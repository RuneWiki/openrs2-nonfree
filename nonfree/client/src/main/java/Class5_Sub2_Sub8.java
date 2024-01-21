import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public abstract class Class5_Sub2_Sub8 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ig", name = "J", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!ig", name = "S", descriptor = "[Lclient!jc;")
	private Class47[] aClass47Array8;

	@OriginalMember(owner = "client!ig", name = "bb", descriptor = "[I")
	private int[] anIntArray165;

	@OriginalMember(owner = "client!ig", name = "db", descriptor = "[I")
	private int[] anIntArray166;

	@OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
	public int anInt1726 = 0;

	@OriginalMember(owner = "client!ig", name = "rb", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!ig", name = "qb", descriptor = "[I")
	private int[] anIntArray168;

	@OriginalMember(owner = "client!ig", name = "gb", descriptor = "[I")
	private int[] anIntArray167;

	@OriginalMember(owner = "client!ig", name = "V", descriptor = "[I")
	private int[] anIntArray164;

	@OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
	private int anInt1729;

	@OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
	private int anInt1725;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B[I[I[I[I)V")
	protected Class5_Sub2_Sub8(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		this.anIntArray169 = arg1;
		this.anIntArray168 = arg2;
		this.anIntArray167 = arg3;
		this.anIntArray164 = arg4;
		this.method1338(arg0);
		@Pc(21) int local21 = Integer.MAX_VALUE;
		@Pc(23) int local23 = Integer.MIN_VALUE;
		for (@Pc(25) int local25 = 0; local25 < 256; local25++) {
			if (this.anIntArray168[local25] < local21 && this.anIntArray164[local25] != 0) {
				local21 = this.anIntArray168[local25];
			}
			if (this.anIntArray168[local25] + this.anIntArray164[local25] > local23) {
				local23 = this.anIntArray168[local25] + this.anIntArray164[local25];
			}
		}
		this.anInt1729 = this.anInt1726 - local21;
		this.anInt1725 = local23 - this.anInt1726;
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "([B)V")
	public Class5_Sub2_Sub8(@OriginalArg(0) byte[] arg0) {
		this.method1338(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;IIIILjava/util/Random;I)I")
	public final int method1332(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method1342(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt712];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt712; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method1335(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;)I")
	public final int method1333(@OriginalArg(0) Class20 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt712; local11++) {
			@Pc(19) int local19 = arg0.aByteArray10[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class20 local39 = arg0.method559(local11, local5 + 1);
					local5 = -1;
					if (local39.method594(Static81.aClass20_643)) {
						local19 = 60;
					} else if (local39.method594(Static81.aClass20_634)) {
						local19 = 62;
					} else if (local39.method594(Static81.aClass20_647)) {
						local19 = 160;
					} else if (local39.method594(Static81.aClass20_629)) {
						local19 = 173;
					} else if (local39.method594(Static81.aClass20_630)) {
						local19 = 215;
					} else if (local39.method594(Static81.aClass20_640)) {
						local19 = 128;
					} else if (local39.method594(Static81.aClass20_641)) {
						local19 = 169;
					} else {
						if (!local39.method594(Static81.aClass20_632)) {
							if (local39.method587(Static81.aClass20_635)) {
								try {
									@Pc(117) int local117 = local39.method549(4).method553();
									local9 += this.aClass47Array8[local117].anInt2706;
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
					local9 += this.anIntArray165[local19];
					if (this.aByteArray23 != null && local7 != -1) {
						local9 += this.aByteArray23[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;IIII)V")
	public final void method1334(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1356(arg3, arg4);
			this.method1348(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;II[I[I)V")
	private void method1335(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt1726;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt712; local12++) {
			@Pc(20) int local20 = arg0.aByteArray10[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class20 local40 = arg0.method559(local12, local6 + 1);
					local6 = -1;
					if (local40.method594(Static81.aClass20_643)) {
						local20 = 60;
					} else if (local40.method594(Static81.aClass20_634)) {
						local20 = 62;
					} else if (local40.method594(Static81.aClass20_647)) {
						local20 = 160;
					} else if (local40.method594(Static81.aClass20_629)) {
						local20 = 173;
					} else if (local40.method594(Static81.aClass20_630)) {
						local20 = 215;
					} else if (local40.method594(Static81.aClass20_640)) {
						local20 = 128;
					} else if (local40.method594(Static81.aClass20_641)) {
						local20 = 169;
					} else {
						if (!local40.method594(Static81.aClass20_632)) {
							if (local40.method587(Static81.aClass20_635)) {
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
									local137 = local40.method549(4).method553();
									@Pc(142) Class47 local142 = this.aClass47Array8[local137];
									@Pc(153) int local153 = this.anIntArray166 == null ? local142.anInt2705 : this.anIntArray166[local137];
									if (Static81.anInt1724 == 256) {
										local142.method2016(arg1 + local117, local4 + this.anInt1726 - local153 + local126);
									} else {
										local142.method2014(arg1 + local117, local4 + this.anInt1726 - local153 + local126, Static81.anInt1724);
									}
									arg1 += local142.anInt2706;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method1359(local40);
							}
							continue;
						}
						local20 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray23 != null && local8 != -1) {
						arg1 += this.aByteArray23[(local8 << 8) + local20];
					}
					@Pc(223) int local223 = this.anIntArray167[local20];
					local117 = this.anIntArray164[local20];
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
						if (Static81.anInt1735 > 0) {
							Static81.anInt1728 += Static81.anInt1735;
							arg1 += Static81.anInt1728 >> 8;
							Static81.anInt1728 &= 0xFF;
						}
					} else if (Static81.anInt1724 == 256) {
						if (Static81.anInt1732 != -1) {
							this.method1346(local20, arg1 + this.anIntArray169[local20] + local126 + 1, local4 + this.anIntArray168[local20] + 1 + local137, local223, local117, Static81.anInt1732);
						}
						this.method1347(local20, arg1 + this.anIntArray169[local20] + local126, local4 + this.anIntArray168[local20] + local137, local223, local117, Static81.anInt1733);
					} else {
						if (Static81.anInt1732 != -1) {
							this.method1357(local20, arg1 + this.anIntArray169[local20] + local126 + 1, local4 + this.anIntArray168[local20] + 1 + local137, local223, local117, Static81.anInt1732, Static81.anInt1724);
						}
						this.method1344(local20, arg1 + this.anIntArray169[local20] + local126, local4 + this.anIntArray168[local20] + local137, local223, local117, Static81.anInt1733, Static81.anInt1724);
					}
					@Pc(380) int local380 = this.anIntArray165[local20];
					if (Static81.anInt1727 != -1) {
						Static42.method809(arg1, local4 + (int) ((double) this.anInt1726 * 0.7D), local380, Static81.anInt1727);
					}
					if (Static81.anInt1730 != -1) {
						Static42.method809(arg1, local4 + this.anInt1726, local380, Static81.anInt1730);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([B)V")
	private void method1338(@OriginalArg(0) byte[] arg0) {
		this.anIntArray165 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray165.length; local9++) {
				this.anIntArray165[local9] = arg0[local9] & 0xFF;
			}
			this.anInt1726 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray165[local37] = arg0[local9++] & 0xFF;
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
		this.aByteArray23 = new byte[65536];
		for (@Pc(182) int local182 = 0; local182 < 256; local182++) {
			if (local182 != 32 && local182 != 160) {
				for (local150 = 0; local150 < 256; local150++) {
					if (local150 != 32 && local150 != 160) {
						this.aByteArray23[(local182 << 8) + local150] = (byte) Static81.method1337(local93, local136, local58, this.anIntArray165, local55, local182, local150);
					}
				}
			}
		}
		this.anInt1726 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;IIIII)V")
	public final void method1339(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1356(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt712];
		@Pc(14) int[] local14 = new int[arg0.anInt712];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt712; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1335(arg0, arg1 - this.method1333(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;I)V")
	private void method1340(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method582(); local5++) {
			@Pc(11) int local11 = arg0.method577(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static81.anInt1735 = (arg1 - this.method1333(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!dc;IIIII)V")
	public final void method1341(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method1356(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt712];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt712; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method1335(arg0, arg1 - this.method1333(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
	private void method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static81.anInt1727 = -1;
		Static81.anInt1730 = -1;
		Static81.anInt1731 = arg1;
		Static81.anInt1732 = arg1;
		Static81.anInt1734 = arg0;
		Static81.anInt1733 = arg0;
		Static81.anInt1736 = arg2;
		Static81.anInt1724 = arg2;
		Static81.anInt1735 = 0;
		Static81.anInt1728 = 0;
	}

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I")
	private int method1343(@OriginalArg(0) int arg0) {
		return this.anIntArray165[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V")
	protected abstract void method1344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "([Lclient!jc;[I)V")
	public final void method1345(@OriginalArg(0) Class47[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass47Array8 = arg0;
		this.anIntArray166 = arg1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIII)V")
	protected abstract void method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIIII)V")
	protected abstract void method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;II)V")
	private void method1348(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt1726;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt712; local10++) {
			@Pc(18) int local18 = arg0.aByteArray10[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class20 local38 = arg0.method559(local10, local6 + 1);
					local6 = -1;
					if (local38.method594(Static81.aClass20_643)) {
						local18 = 60;
					} else if (local38.method594(Static81.aClass20_634)) {
						local18 = 62;
					} else if (local38.method594(Static81.aClass20_647)) {
						local18 = 160;
					} else if (local38.method594(Static81.aClass20_629)) {
						local18 = 173;
					} else if (local38.method594(Static81.aClass20_630)) {
						local18 = 215;
					} else if (local38.method594(Static81.aClass20_640)) {
						local18 = 128;
					} else if (local38.method594(Static81.aClass20_641)) {
						local18 = 169;
					} else {
						if (!local38.method594(Static81.aClass20_632)) {
							if (local38.method587(Static81.aClass20_635)) {
								try {
									local116 = local38.method549(4).method553();
									@Pc(121) Class47 local121 = this.aClass47Array8[local116];
									@Pc(132) int local132 = this.anIntArray166 == null ? local121.anInt2705 : this.anIntArray166[local116];
									if (Static81.anInt1724 == 256) {
										local121.method2016(arg1, local4 + this.anInt1726 - local132);
									} else {
										local121.method2014(arg1, local4 + this.anInt1726 - local132, Static81.anInt1724);
									}
									arg1 += local121.anInt2706;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method1359(local38);
							}
							continue;
						}
						local18 = 174;
					}
				}
				if (local6 == -1) {
					if (this.aByteArray23 != null && local8 != -1) {
						arg1 += this.aByteArray23[(local8 << 8) + local18];
					}
					@Pc(194) int local194 = this.anIntArray167[local18];
					local116 = this.anIntArray164[local18];
					if (local18 == 32) {
						if (Static81.anInt1735 > 0) {
							Static81.anInt1728 += Static81.anInt1735;
							arg1 += Static81.anInt1728 >> 8;
							Static81.anInt1728 &= 0xFF;
						}
					} else if (Static81.anInt1724 == 256) {
						if (Static81.anInt1732 != -1) {
							this.method1346(local18, arg1 + this.anIntArray169[local18] + 1, local4 + this.anIntArray168[local18] + 1, local194, local116, Static81.anInt1732);
						}
						this.method1347(local18, arg1 + this.anIntArray169[local18], local4 + this.anIntArray168[local18], local194, local116, Static81.anInt1733);
					} else {
						if (Static81.anInt1732 != -1) {
							this.method1357(local18, arg1 + this.anIntArray169[local18] + 1, local4 + this.anIntArray168[local18] + 1, local194, local116, Static81.anInt1732, Static81.anInt1724);
						}
						this.method1344(local18, arg1 + this.anIntArray169[local18], local4 + this.anIntArray168[local18], local194, local116, Static81.anInt1733, Static81.anInt1724);
					}
					@Pc(316) int local316 = this.anIntArray165[local18];
					if (Static81.anInt1727 != -1) {
						Static42.method809(arg1, local4 + (int) ((double) this.anInt1726 * 0.7D), local316, Static81.anInt1727);
					}
					if (Static81.anInt1730 != -1) {
						Static42.method809(arg1, local4 + this.anInt1726 + 1, local316, Static81.anInt1730);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;IIIIIIIII)I")
	public final int method1349(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method1360(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!dc;IIII)V")
	public final void method1350(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1356(arg3, arg4);
			this.method1348(arg0, arg1 - this.method1333(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!dc;I)I")
	public final int method1351(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method1355(arg0, new int[] { arg1 }, Static81.aClass20Array11);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method1333(Static81.aClass20Array11[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Lclient!dc;IIII)V")
	public final void method1352(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method1356(arg3, arg4);
			this.method1348(arg0, arg1 - this.method1333(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Lclient!dc;I)I")
	public final int method1353(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1) {
		return this.method1355(arg0, new int[] { arg1 }, Static81.aClass20Array11);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;IIIIII)V")
	public final void method1354(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method1356(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt712];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt712; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method1335(arg0, arg1 - this.method1333(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;[I[Lclient!dc;)I")
	private int method1355(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class20[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class20 local11 = Static161.method2451(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method582();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method577(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class20 local55 = arg0.method559(local29, local19 + 1);
					local19 = -1;
					local11.method567(60);
					local11.method568(local55);
					local11.method567(62);
					if (local55.method594(Static81.aClass20_644)) {
						arg2[local23++] = local11.method559(local11.method582(), local7);
						local7 = local11.method582();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method594(Static81.aClass20_643)) {
						local5 += this.method1343(60);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method594(Static81.aClass20_634)) {
						local5 += this.method1343(62);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method594(Static81.aClass20_647)) {
						local5 += this.method1343(160);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method594(Static81.aClass20_629)) {
						local5 += this.method1343(173);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method594(Static81.aClass20_630)) {
						local5 += this.method1343(215);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method594(Static81.aClass20_640)) {
						local5 += this.method1343(128);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method594(Static81.aClass20_641)) {
						local5 += this.method1343(169);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method594(Static81.aClass20_632)) {
						local5 += this.method1343(174);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method587(Static81.aClass20_635)) {
						try {
							@Pc(359) int local359 = local55.method549(4).method553();
							local5 += this.aClass47Array8[local359].anInt2706;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method567(local35);
						local5 += this.method1343(local35);
						if (this.aByteArray23 != null && local21 != -1) {
							local5 += this.aByteArray23[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method582();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method559(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method582();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method582() > local7) {
			arg2[local23++] = local11.method559(local11.method582(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	private void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static81.anInt1727 = -1;
		Static81.anInt1730 = -1;
		Static81.anInt1731 = arg1;
		Static81.anInt1732 = arg1;
		Static81.anInt1734 = arg0;
		Static81.anInt1733 = arg0;
		Static81.anInt1736 = 256;
		Static81.anInt1724 = 256;
		Static81.anInt1735 = 0;
		Static81.anInt1728 = 0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(Lclient!dc;)V")
	private void method1359(@OriginalArg(0) Class20 arg0) {
		try {
			if (arg0.method587(Static81.aClass20_633)) {
				Static81.anInt1733 = arg0.method549(4).method570(16);
				return;
			}
			if (arg0.method594(Static81.aClass20_639)) {
				Static81.anInt1733 = Static81.anInt1734;
				return;
			}
			if (arg0.method587(Static81.aClass20_645)) {
				Static81.anInt1724 = arg0.method549(6).method553();
				return;
			}
			if (arg0.method594(Static81.aClass20_637)) {
				Static81.anInt1724 = Static81.anInt1736;
				return;
			}
			if (arg0.method587(Static81.aClass20_631)) {
				Static81.anInt1727 = arg0.method549(4).method570(16);
				return;
			}
			if (arg0.method594(Static81.aClass20_627)) {
				Static81.anInt1727 = 8388608;
				return;
			}
			if (arg0.method594(Static81.aClass20_636)) {
				Static81.anInt1727 = -1;
				return;
			}
			if (arg0.method587(Static81.aClass20_642)) {
				Static81.anInt1730 = arg0.method549(2).method570(16);
				return;
			}
			if (arg0.method594(Static81.aClass20_649)) {
				Static81.anInt1730 = 0;
				return;
			}
			if (arg0.method594(Static81.aClass20_638)) {
				Static81.anInt1730 = -1;
				return;
			}
			if (arg0.method587(Static81.aClass20_628)) {
				Static81.anInt1732 = arg0.method549(5).method570(16);
				return;
			}
			if (arg0.method594(Static81.aClass20_648)) {
				Static81.anInt1732 = 0;
				return;
			}
			if (arg0.method594(Static81.aClass20_646)) {
				Static81.anInt1732 = Static81.anInt1731;
				return;
			}
			if (arg0.method594(Static81.aClass20_644)) {
				this.method1342(Static81.anInt1734, Static81.anInt1731, Static81.anInt1736);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!dc;IIIIIIIIII)I")
	private int method1360(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method1342(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt1726;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt1729 + this.anInt1725 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method1355(arg0, local20, Static81.aClass20Array11);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt1729;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt1729 + (arg4 - this.anInt1729 - this.anInt1725 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt1725 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt1729 - this.anInt1725 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt1729 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method1348(Static81.aClass20Array11[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method1348(Static81.aClass20Array11[local118], arg1 + (arg3 - this.method1333(Static81.aClass20Array11[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method1348(Static81.aClass20Array11[local118], arg1 + arg3 - this.method1333(Static81.aClass20Array11[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method1348(Static81.aClass20Array11[local118], arg1, local57);
			} else {
				this.method1340(Static81.aClass20Array11[local118], arg3);
				this.method1348(Static81.aClass20Array11[local118], arg1, local57);
				Static81.anInt1735 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}
}
