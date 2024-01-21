import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public abstract class Class2_Sub2_Sub2_Sub1 extends Class2_Sub2_Sub2 {

	@OriginalMember(owner = "client!bf", name = "R", descriptor = "[Lclient!df;")
	private Class2_Sub2_Sub2_Sub2[] aClass2_Sub2_Sub2_Sub2Array2;

	@OriginalMember(owner = "client!bf", name = "ab", descriptor = "[I")
	private int[] anIntArray65;

	@OriginalMember(owner = "client!bf", name = "Fb", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!bf", name = "Gb", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!bf", name = "bb", descriptor = "[[B")
	protected byte[][] aByteArrayArray5 = new byte[256][];

	@OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
	public int anInt774 = 0;

	@OriginalMember(owner = "client!bf", name = "db", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!bf", name = "tb", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!bf", name = "xb", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!bf", name = "Q", descriptor = "[I")
	private int[] anIntArray64;

	@OriginalMember(owner = "client!bf", name = "Bb", descriptor = "I")
	private int anInt781;

	@OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
	private int anInt770;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B[I[I[I[I[I[[B)V")
	public Class2_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[][] arg6) {
		this.anIntArray66 = arg1;
		this.anIntArray67 = arg2;
		this.anIntArray68 = arg3;
		this.anIntArray64 = arg4;
		this.method624(arg0);
		this.aByteArrayArray5 = arg6;
		@Pc(28) int local28 = Integer.MAX_VALUE;
		@Pc(30) int local30 = Integer.MIN_VALUE;
		for (@Pc(32) int local32 = 0; local32 < 256; local32++) {
			if (this.anIntArray67[local32] < local28 && this.anIntArray64[local32] != 0) {
				local28 = this.anIntArray67[local32];
			}
			if (this.anIntArray67[local32] + this.anIntArray64[local32] > local30) {
				local30 = this.anIntArray67[local32] + this.anIntArray64[local32];
			}
		}
		this.anInt781 = this.anInt774 - local28;
		this.anInt770 = local30 - this.anInt774;
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
	public Class2_Sub2_Sub2_Sub1(@OriginalArg(0) byte[] arg0) {
		this.method624(arg0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	private void method607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static16.anInt773 = -1;
		Static16.anInt772 = -1;
		Static16.anInt779 = arg1;
		Static16.anInt775 = arg1;
		Static16.anInt777 = arg0;
		Static16.anInt771 = arg0;
		Static16.anInt776 = arg2;
		Static16.anInt780 = arg2;
		Static16.anInt769 = 0;
		Static16.anInt778 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
	private void method608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(5) int local5 = arg1 + arg2 * Static10.anInt2275;
		@Pc(9) int local9 = Static10.anInt2275 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static10.anInt2273) {
			local20 = Static10.anInt2273 - arg2;
			arg4 -= local20;
			arg2 = Static10.anInt2273;
			local13 = local20 * arg3;
			local5 += local20 * Static10.anInt2275;
		}
		if (arg2 + arg4 > Static10.anInt2277) {
			arg4 -= arg2 + arg4 - Static10.anInt2277;
		}
		if (arg1 < Static10.anInt2274) {
			local20 = Static10.anInt2274 - arg1;
			arg3 -= local20;
			arg1 = Static10.anInt2274;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static10.anInt2276) {
			local20 = arg1 + arg3 - Static10.anInt2276;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static16.method636(Static10.anIntArray214, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11, arg6);
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(IIIIIII)V")
	protected abstract void method609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;IIII)V")
	public final void method610(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method616(arg3, arg4);
			this.method615(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;)V")
	private void method611(@OriginalArg(0) Class49 arg0) {
		try {
			if (arg0.method1660(Static16.aClass49_408)) {
				Static16.anInt771 = arg0.method1665(4).method1644(16);
				return;
			}
			if (arg0.method1676(Static16.aClass49_400)) {
				Static16.anInt771 = Static16.anInt777;
				return;
			}
			if (arg0.method1660(Static16.aClass49_410)) {
				Static16.anInt780 = arg0.method1665(6).method1648();
				return;
			}
			if (arg0.method1676(Static16.aClass49_396)) {
				Static16.anInt780 = Static16.anInt776;
				return;
			}
			if (arg0.method1660(Static16.aClass49_411)) {
				Static16.anInt773 = arg0.method1665(4).method1644(16);
				return;
			}
			if (arg0.method1676(Static16.aClass49_399)) {
				Static16.anInt773 = 8388608;
				return;
			}
			if (arg0.method1676(Static16.aClass49_412)) {
				Static16.anInt773 = -1;
				return;
			}
			if (arg0.method1660(Static16.aClass49_404)) {
				Static16.anInt772 = arg0.method1665(2).method1644(16);
				return;
			}
			if (arg0.method1676(Static16.aClass49_402)) {
				Static16.anInt772 = 0;
				return;
			}
			if (arg0.method1676(Static16.aClass49_397)) {
				Static16.anInt772 = -1;
				return;
			}
			if (arg0.method1660(Static16.aClass49_405)) {
				Static16.anInt775 = arg0.method1665(5).method1644(16);
				return;
			}
			if (arg0.method1676(Static16.aClass49_401)) {
				Static16.anInt775 = 0;
				return;
			}
			if (arg0.method1676(Static16.aClass49_398)) {
				Static16.anInt775 = Static16.anInt779;
				return;
			}
			if (arg0.method1676(Static16.aClass49_416)) {
				this.method607(Static16.anInt777, Static16.anInt779, Static16.anInt776);
				return;
			}
		} catch (@Pc(144) Exception local144) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;IIIIIIIIII)I")
	private int method612(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		this.method607(arg5, arg6, 256);
		if (arg9 == 0) {
			arg9 = this.anInt774;
		}
		@Pc(20) int[] local20 = new int[] { arg3 };
		if (arg4 < this.anInt781 + this.anInt770 + arg9 && arg4 < arg9 + arg9) {
			local20 = null;
		}
		@Pc(42) int local42 = this.method628(arg0, local20, Static16.aClass49Array5);
		if (arg8 == 3 && local42 == 1) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		@Pc(118) int local118;
		if (arg8 == 0) {
			local57 = arg2 + this.anInt781;
		} else if (arg8 == 1) {
			local57 = arg2 + this.anInt781 + (arg4 - this.anInt781 - this.anInt770 - (local42 - 1) * arg9) / 2;
		} else if (arg8 == 2) {
			local57 = arg2 + arg4 - this.anInt770 - (local42 - 1) * arg9;
		} else {
			local118 = (arg4 - this.anInt781 - this.anInt770 - (local42 - 1) * arg9) / (local42 + 1);
			if (local118 < 0) {
				local118 = 0;
			}
			local57 = arg2 + this.anInt781 + local118;
			arg9 += local118;
		}
		for (local118 = 0; local118 < local42; local118++) {
			if (arg7 == 0) {
				this.method615(Static16.aClass49Array5[local118], arg1, local57);
			} else if (arg7 == 1) {
				this.method615(Static16.aClass49Array5[local118], arg1 + (arg3 - this.method614(Static16.aClass49Array5[local118])) / 2, local57);
			} else if (arg7 == 2) {
				this.method615(Static16.aClass49Array5[local118], arg1 + arg3 - this.method614(Static16.aClass49Array5[local118]), local57);
			} else if (local118 == local42 - 1) {
				this.method615(Static16.aClass49Array5[local118], arg1, local57);
			} else {
				this.method619(Static16.aClass49Array5[local118], arg3);
				this.method615(Static16.aClass49Array5[local118], arg1, local57);
				Static16.anInt769 = 0;
			}
			local57 += arg9;
		}
		return local42;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;IIIILjava/util/Random;I)I")
	public final int method613(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) Random arg3, @OriginalArg(6) int arg4) {
		if (arg0 == null) {
			return 0;
		}
		arg3.setSeed((long) arg4);
		this.method607(16777215, 0, (arg3.nextInt() & 0x1F) + 192);
		@Pc(21) int[] local21 = new int[arg0.anInt2058];
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2058; local25++) {
			local21[local25] = local23;
			if ((arg3.nextInt() & 0x3) == 0) {
				local23++;
			}
		}
		this.method617(arg0, arg1, arg2, local21, null);
		return local23;
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!lf;)I")
	public final int method614(@OriginalArg(0) Class49 arg0) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg0.anInt2058; local11++) {
			@Pc(19) int local19 = arg0.aByteArray28[local11] & 0xFF;
			if (local19 == 60) {
				local5 = local11;
			} else {
				if (local19 == 62 && local5 != -1) {
					@Pc(39) Class49 local39 = arg0.method1661(local11, local5 + 1);
					local5 = -1;
					if (local39.method1676(Static16.aClass49_406)) {
						local19 = 60;
					} else if (local39.method1676(Static16.aClass49_409)) {
						local19 = 62;
					} else if (local39.method1676(Static16.aClass49_415)) {
						local19 = 160;
					} else if (local39.method1676(Static16.aClass49_414)) {
						local19 = 173;
					} else if (local39.method1676(Static16.aClass49_413)) {
						local19 = 215;
					} else if (local39.method1676(Static16.aClass49_403)) {
						local19 = 128;
					} else if (local39.method1676(Static16.aClass49_417)) {
						local19 = 169;
					} else {
						if (!local39.method1676(Static16.aClass49_407)) {
							if (local39.method1660(Static16.aClass49_395)) {
								try {
									@Pc(117) int local117 = local39.method1665(4).method1648();
									local9 += this.aClass2_Sub2_Sub2_Sub2Array2[local117].anInt880;
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
					local9 += this.anIntArray69[local19];
					if (this.aByteArray9 != null && local7 != -1) {
						local9 += this.aByteArray9[(local7 << 8) + local19];
					}
					local7 = local19;
				}
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;II)V")
	private void method615(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg2 - this.anInt774;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		for (@Pc(10) int local10 = 0; local10 < arg0.anInt2058; local10++) {
			@Pc(18) int local18 = arg0.aByteArray28[local10] & 0xFF;
			if (local18 == 60) {
				local6 = local10;
			} else {
				@Pc(116) int local116;
				if (local18 == 62 && local6 != -1) {
					@Pc(38) Class49 local38 = arg0.method1661(local10, local6 + 1);
					local6 = -1;
					if (local38.method1676(Static16.aClass49_406)) {
						local18 = 60;
					} else if (local38.method1676(Static16.aClass49_409)) {
						local18 = 62;
					} else if (local38.method1676(Static16.aClass49_415)) {
						local18 = 160;
					} else if (local38.method1676(Static16.aClass49_414)) {
						local18 = 173;
					} else if (local38.method1676(Static16.aClass49_413)) {
						local18 = 215;
					} else if (local38.method1676(Static16.aClass49_403)) {
						local18 = 128;
					} else if (local38.method1676(Static16.aClass49_417)) {
						local18 = 169;
					} else {
						if (!local38.method1676(Static16.aClass49_407)) {
							if (local38.method1660(Static16.aClass49_395)) {
								try {
									local116 = local38.method1665(4).method1648();
									@Pc(121) Class2_Sub2_Sub2_Sub2 local121 = this.aClass2_Sub2_Sub2_Sub2Array2[local116];
									@Pc(132) int local132 = this.anIntArray65 == null ? local121.anInt883 : this.anIntArray65[local116];
									if (Static16.anInt780 == 256) {
										local121.method722(arg1, local4 + this.anInt774 - local132);
									} else {
										local121.method725(arg1, local4 + this.anInt774 - local132, Static16.anInt780);
									}
									arg1 += local121.anInt880;
									local8 = -1;
								} catch (@Pc(164) Exception local164) {
								}
							} else {
								this.method611(local38);
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
					@Pc(194) int local194 = this.anIntArray68[local18];
					local116 = this.anIntArray64[local18];
					if (local18 == 32) {
						if (Static16.anInt769 > 0) {
							Static16.anInt778 += Static16.anInt769;
							arg1 += Static16.anInt778 >> 8;
							Static16.anInt778 &= 0xFF;
						}
					} else if (Static16.anInt780 == 256) {
						if (Static16.anInt775 != -1) {
							this.method629(local18, arg1 + this.anIntArray66[local18] + 1, local4 + this.anIntArray67[local18] + 1, local194, local116, Static16.anInt775);
						}
						this.method630(local18, arg1 + this.anIntArray66[local18], local4 + this.anIntArray67[local18], local194, local116, Static16.anInt771);
					} else {
						if (Static16.anInt775 != -1) {
							this.method608(local18, arg1 + this.anIntArray66[local18] + 1, local4 + this.anIntArray67[local18] + 1, local194, local116, Static16.anInt775, Static16.anInt780);
						}
						this.method609(local18, arg1 + this.anIntArray66[local18], local4 + this.anIntArray67[local18], local194, local116, Static16.anInt771, Static16.anInt780);
					}
					@Pc(316) int local316 = this.anIntArray69[local18];
					if (Static16.anInt773 != -1) {
						Static10.method1853(arg1, local4 + (int) ((double) this.anInt774 * 0.7D), local316, Static16.anInt773);
					}
					if (Static16.anInt772 != -1) {
						Static10.method1853(arg1, local4 + this.anInt774 + 1, local316, Static16.anInt772);
					}
					arg1 += local316;
					local8 = local18;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
	private void method616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static16.anInt773 = -1;
		Static16.anInt772 = -1;
		Static16.anInt779 = arg1;
		Static16.anInt775 = arg1;
		Static16.anInt777 = arg0;
		Static16.anInt771 = arg0;
		Static16.anInt776 = 256;
		Static16.anInt780 = 256;
		Static16.anInt769 = 0;
		Static16.anInt778 = 0;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;II[I[I)V")
	private void method617(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4) {
		@Pc(4) int local4 = arg2 - this.anInt774;
		@Pc(6) int local6 = -1;
		@Pc(8) int local8 = -1;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2058; local12++) {
			@Pc(20) int local20 = arg0.aByteArray28[local12] & 0xFF;
			if (local20 == 60) {
				local6 = local12;
			} else {
				@Pc(117) int local117;
				@Pc(126) int local126;
				@Pc(137) int local137;
				if (local20 == 62 && local6 != -1) {
					@Pc(40) Class49 local40 = arg0.method1661(local12, local6 + 1);
					local6 = -1;
					if (local40.method1676(Static16.aClass49_406)) {
						local20 = 60;
					} else if (local40.method1676(Static16.aClass49_409)) {
						local20 = 62;
					} else if (local40.method1676(Static16.aClass49_415)) {
						local20 = 160;
					} else if (local40.method1676(Static16.aClass49_414)) {
						local20 = 173;
					} else if (local40.method1676(Static16.aClass49_413)) {
						local20 = 215;
					} else if (local40.method1676(Static16.aClass49_403)) {
						local20 = 128;
					} else if (local40.method1676(Static16.aClass49_417)) {
						local20 = 169;
					} else {
						if (!local40.method1676(Static16.aClass49_407)) {
							if (local40.method1660(Static16.aClass49_395)) {
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
									local137 = local40.method1665(4).method1648();
									@Pc(142) Class2_Sub2_Sub2_Sub2 local142 = this.aClass2_Sub2_Sub2_Sub2Array2[local137];
									@Pc(153) int local153 = this.anIntArray65 == null ? local142.anInt883 : this.anIntArray65[local137];
									if (Static16.anInt780 == 256) {
										local142.method722(arg1 + local117, local4 + this.anInt774 - local153 + local126);
									} else {
										local142.method725(arg1 + local117, local4 + this.anInt774 - local153 + local126, Static16.anInt780);
									}
									arg1 += local142.anInt880;
									local8 = -1;
								} catch (@Pc(193) Exception local193) {
								}
							} else {
								this.method611(local40);
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
					@Pc(223) int local223 = this.anIntArray68[local20];
					local117 = this.anIntArray64[local20];
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
						if (Static16.anInt769 > 0) {
							Static16.anInt778 += Static16.anInt769;
							arg1 += Static16.anInt778 >> 8;
							Static16.anInt778 &= 0xFF;
						}
					} else if (Static16.anInt780 == 256) {
						if (Static16.anInt775 != -1) {
							this.method629(local20, arg1 + this.anIntArray66[local20] + local126 + 1, local4 + this.anIntArray67[local20] + 1 + local137, local223, local117, Static16.anInt775);
						}
						this.method630(local20, arg1 + this.anIntArray66[local20] + local126, local4 + this.anIntArray67[local20] + local137, local223, local117, Static16.anInt771);
					} else {
						if (Static16.anInt775 != -1) {
							this.method608(local20, arg1 + this.anIntArray66[local20] + local126 + 1, local4 + this.anIntArray67[local20] + 1 + local137, local223, local117, Static16.anInt775, Static16.anInt780);
						}
						this.method609(local20, arg1 + this.anIntArray66[local20] + local126, local4 + this.anIntArray67[local20] + local137, local223, local117, Static16.anInt771, Static16.anInt780);
					}
					@Pc(380) int local380 = this.anIntArray69[local20];
					if (Static16.anInt773 != -1) {
						Static10.method1853(arg1, local4 + (int) ((double) this.anInt774 * 0.7D), local380, Static16.anInt773);
					}
					if (Static16.anInt772 != -1) {
						Static10.method1853(arg1, local4 + this.anInt774, local380, Static16.anInt772);
					}
					arg1 += local380;
					local8 = local20;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;I)V")
	private void method619(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.method1653(); local5++) {
			@Pc(11) int local11 = arg0.method1646(local5);
			if (local11 == 60) {
				local3 = true;
			} else if (local11 == 62) {
				local3 = false;
			} else if (!local3 && local11 == 32) {
				local1++;
			}
		}
		if (local1 > 0) {
			Static16.anInt769 = (arg1 - this.method614(arg0) << 8) / local1;
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!lf;IIII)V")
	public final void method620(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method616(arg3, arg4);
			this.method615(arg0, arg1 - this.method614(arg0), arg2);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;IIIII)V")
	public final void method621(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method616(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2058];
		@Pc(14) int[] local14 = new int[arg0.anInt2058];
		for (@Pc(16) int local16 = 0; local16 < arg0.anInt2058; local16++) {
			local10[local16] = (int) (Math.sin((double) local16 / 5.0D + (double) arg4 / 5.0D) * 5.0D);
			local14[local16] = (int) (Math.sin((double) local16 / 3.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method617(arg0, arg1 - this.method614(arg0) / 2, arg2, local10, local14);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!lf;IIIII)V")
	public final void method622(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == null) {
			return;
		}
		this.method616(arg3, 0);
		@Pc(10) int[] local10 = new int[arg0.anInt2058];
		for (@Pc(12) int local12 = 0; local12 < arg0.anInt2058; local12++) {
			local10[local12] = (int) (Math.sin((double) local12 / 2.0D + (double) arg4 / 5.0D) * 5.0D);
		}
		this.method617(arg0, arg1 - this.method614(arg0) / 2, arg2, null, local10);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(Lclient!lf;I)I")
	public final int method623(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.method628(arg0, new int[] { arg1 }, Static16.aClass49Array5);
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < local10; local14++) {
			@Pc(21) int local21 = this.method614(Static16.aClass49Array5[local14]);
			if (local21 > local12) {
				local12 = local21;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([B)V")
	private void method624(@OriginalArg(0) byte[] arg0) {
		this.anIntArray69 = new int[256];
		@Pc(9) int local9;
		if (arg0.length == 257) {
			for (local9 = 0; local9 < this.anIntArray69.length; local9++) {
				this.anIntArray69[local9] = arg0[local9] & 0xFF;
			}
			this.anInt774 = arg0[256] & 0xFF;
			return;
		}
		local9 = 0;
		for (@Pc(37) int local37 = 0; local37 < 256; local37++) {
			this.anIntArray69[local37] = arg0[local9++] & 0xFF;
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
						this.aByteArray9[(local182 << 8) + local150] = (byte) Static16.method634(local93, local136, local58, this.anIntArray69, local55, local182, local150);
					}
				}
			}
		}
		this.anInt774 = local58[32] + local55[32];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;IIIIII)V")
	public final void method625(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method616(arg3, 0);
		@Pc(13) double local13 = 7.0D - (double) arg5 / 8.0D;
		if (local13 < 0.0D) {
			local13 = 0.0D;
		}
		@Pc(23) int[] local23 = new int[arg0.anInt2058];
		for (@Pc(25) int local25 = 0; local25 < arg0.anInt2058; local25++) {
			local23[local25] = (int) (Math.sin((double) local25 / 1.5D + (double) arg4) * local13);
		}
		this.method617(arg0, arg1 - this.method614(arg0) / 2, arg2, null, local23);
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
	private int method626(@OriginalArg(0) int arg0) {
		return this.anIntArray69[arg0 & 0xFF];
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Lclient!lf;I)I")
	public final int method627(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1) {
		return this.method628(arg0, new int[] { arg1 }, Static16.aClass49Array5);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;[I[Lclient!lf;)I")
	private int method628(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class49[] arg2) {
		if (arg0 == null) {
			return 0;
		}
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(11) Class49 local11 = Static162.method2742(100);
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = 0;
		@Pc(17) byte local17 = 0;
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = -1;
		@Pc(23) int local23 = 0;
		@Pc(27) int local27 = arg0.method1653();
		for (@Pc(29) int local29 = 0; local29 < local27; local29++) {
			@Pc(35) int local35 = arg0.method1646(local29);
			if (local35 == 60) {
				local19 = local29;
			} else {
				if (local35 == 62 && local19 != -1) {
					@Pc(55) Class49 local55 = arg0.method1661(local29, local19 + 1);
					local19 = -1;
					local11.method1669(60);
					local11.method1662(local55);
					local11.method1669(62);
					if (local55.method1676(Static16.aClass49_416)) {
						arg2[local23++] = local11.method1661(local11.method1653(), local7);
						local7 = local11.method1653();
						local5 = 0;
						local13 = -1;
						local21 = -1;
					} else if (local55.method1676(Static16.aClass49_406)) {
						local5 += this.method626(60);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 60];
						}
						local21 = 60;
					} else if (local55.method1676(Static16.aClass49_409)) {
						local5 += this.method626(62);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 62];
						}
						local21 = 62;
					} else if (local55.method1676(Static16.aClass49_415)) {
						local5 += this.method626(160);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 160];
						}
						local21 = 160;
					} else if (local55.method1676(Static16.aClass49_414)) {
						local5 += this.method626(173);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 173];
						}
						local21 = 173;
					} else if (local55.method1676(Static16.aClass49_413)) {
						local5 += this.method626(215);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 215];
						}
						local21 = 215;
					} else if (local55.method1676(Static16.aClass49_403)) {
						local5 += this.method626(128);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 128];
						}
						local21 = 128;
					} else if (local55.method1676(Static16.aClass49_417)) {
						local5 += this.method626(169);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 169];
						}
						local21 = 169;
					} else if (local55.method1676(Static16.aClass49_407)) {
						local5 += this.method626(174);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + 174];
						}
						local21 = 174;
					} else if (local55.method1660(Static16.aClass49_395)) {
						try {
							@Pc(359) int local359 = local55.method1665(4).method1648();
							local5 += this.aClass2_Sub2_Sub2_Sub2Array2[local359].anInt880;
							local21 = -1;
						} catch (@Pc(371) Exception local371) {
						}
					}
					local35 = -1;
				}
				if (local19 == -1) {
					if (local35 != -1) {
						local11.method1669(local35);
						local5 += this.method626(local35);
						if (this.aByteArray9 != null && local21 != -1) {
							local5 += this.aByteArray9[(local21 << 8) + local35];
						}
						local21 = local35;
					}
					if (local35 == 32) {
						local13 = local11.method1653();
						local15 = local5;
						local17 = 1;
					}
					if (arg1 != null && local5 > arg1[local23 < arg1.length ? local23 : arg1.length - 1] && local13 >= 0) {
						arg2[local23++] = local11.method1661(local13 - local17, local7);
						local7 = local13;
						local13 = -1;
						local5 -= local15;
						local21 = -1;
					}
					if (local35 == 45) {
						local13 = local11.method1653();
						local15 = local5;
						local17 = 0;
					}
				}
			}
		}
		if (local11.method1653() > local7) {
			arg2[local23++] = local11.method1661(local11.method1653(), local7);
		}
		return local23;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(IIIIII)V")
	private void method629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(5) int local5 = arg1 + arg2 * Static10.anInt2275;
		@Pc(9) int local9 = Static10.anInt2275 - arg3;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(20) int local20;
		if (arg2 < Static10.anInt2273) {
			local20 = Static10.anInt2273 - arg2;
			arg4 -= local20;
			arg2 = Static10.anInt2273;
			local13 = local20 * arg3;
			local5 += local20 * Static10.anInt2275;
		}
		if (arg2 + arg4 > Static10.anInt2277) {
			arg4 -= arg2 + arg4 - Static10.anInt2277;
		}
		if (arg1 < Static10.anInt2274) {
			local20 = Static10.anInt2274 - arg1;
			arg3 -= local20;
			arg1 = Static10.anInt2274;
			local13 += local20;
			local5 += local20;
			local11 = local20;
			local9 += local20;
		}
		if (arg1 + arg3 > Static10.anInt2276) {
			local20 = arg1 + arg3 - Static10.anInt2276;
			arg3 -= local20;
			local11 += local20;
			local9 += local20;
		}
		if (arg3 > 0 && arg4 > 0) {
			Static16.method632(Static10.anIntArray214, this.aByteArrayArray5[arg0], arg5, local13, local5, arg3, arg4, local9, local11);
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(IIIIII)V")
	protected abstract void method630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(Lclient!lf;IIII)V")
	public final void method631(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method616(arg3, arg4);
			this.method615(arg0, arg1 - this.method614(arg0) / 2, arg2);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!lf;IIIIIIIII)I")
	public final int method633(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		return this.method612(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Lclient!df;[I)V")
	public final void method637(@OriginalArg(0) Class2_Sub2_Sub2_Sub2[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg1 != null && arg1.length != arg0.length) {
			throw new IllegalArgumentException();
		}
		this.aClass2_Sub2_Sub2_Sub2Array2 = arg0;
		this.anIntArray65 = arg1;
	}
}
