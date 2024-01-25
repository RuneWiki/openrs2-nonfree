import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class234_Sub1 extends Class234 {

	@OriginalMember(owner = "client!wca", name = "K", descriptor = "I")
	public int anInt9519 = 99;

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(IIIZ)V")
	public Class234_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static7.aClass90_1, Static441.aClass92_4);
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIILclient!r;IIIILclient!nn;)V")
	public void method7746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class78 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class240 arg9) {
		if (!Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239) && !Static271.method3983(Static398.anInt7155, arg7, arg1, arg0)) {
			return;
		}
		if (arg8 < this.anInt9519) {
			this.anInt9519 = arg8;
		}
		@Pc(36) Class178 local36 = Static347.aClass122_4.method2770(arg6);
		if (arg4.method6810() && Static86.aClass1_Sub30_Sub1_1.aBoolean475 && local36.aBoolean350) {
			return;
		}
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (arg5 == 1 || arg5 == 3) {
			local55 = local36.anInt4627;
			local58 = local36.anInt4634;
		} else {
			local55 = local36.anInt4634;
			local58 = local36.anInt4627;
		}
		@Pc(86) int local86;
		@Pc(80) int local80;
		if (local58 + arg1 <= super.anInt9511) {
			local80 = (local58 + 1 >> 1) + arg1;
			local86 = (local58 >> 1) + arg1;
		} else {
			local80 = arg1 + 1;
			local86 = arg1;
		}
		@Pc(114) int local114;
		@Pc(108) int local108;
		if (super.anInt9505 >= local55 + arg0) {
			local108 = arg0 + (local55 + 1 >> 1);
			local114 = arg0 + (local55 >> 1);
		} else {
			local114 = arg0;
			local108 = arg0 + 1;
		}
		@Pc(126) Class129 local126 = Static310.aClass129Array5[arg7];
		@Pc(154) int local154 = local126.method6481(local114, local86) + local126.method6481(local114, local80) + local126.method6481(local108, local86) + local126.method6481(local108, local80) >> 2;
		@Pc(162) int local162 = (local58 << 8) + (arg1 << 9);
		@Pc(171) int local171 = (arg0 << 9) + (local55 << 8);
		@Pc(183) boolean local183 = Static189.aBoolean270 && !super.aBoolean709 && local36.aBoolean351;
		if (local36.method3711()) {
			Static224.method3330(local36, arg1, null, null, arg0, arg5, arg8);
		}
		@Pc(217) boolean local217 = arg2 == -1 && local36.anInt4669 == -1 && local36.anIntArray256 == null && local36.anIntArray252 == null && !local36.aBoolean357;
		if (Static34.aBoolean44 && (Static281.method4189(arg3) && local36.anInt4626 != 1 || !(!Static512.method7152(arg3) || local36.anInt4626 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(373) Class11_Sub1_Sub1 local373;
			@Pc(335) Class11_Sub1_Sub1_Sub2 local335;
			@Pc(369) int local369;
			@Pc(430) int local430;
			if (arg3 == 10 || arg3 == 11) {
				local335 = null;
				if (local217) {
					@Pc(365) Class11_Sub1_Sub1_Sub2 local365 = new Class11_Sub1_Sub1_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg1, local58 + arg1 - 1, arg0, local55 + arg0 - 1, arg3, arg5, local183);
					local369 = local365.method439();
					local335 = local365;
					local373 = local365;
				} else {
					local373 = new Class11_Sub1_Sub1_Sub5(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg1, local58 + arg1 - 1, arg0, local55 + arg0 - 1, arg3, arg5, arg2);
					local369 = 15;
				}
				if (Static89.method1396(local373, false)) {
					if (local335 != null && local335.method7229()) {
						local335.method7226(arg4);
					}
					if (local36.aBoolean353 && Static189.aBoolean270) {
						if (local369 > 30) {
							local369 = 30;
						}
						for (local430 = 0; local430 <= local58; local430++) {
							for (@Pc(434) int local434 = 0; local434 <= local55; local434++) {
								local126.a(local430 + arg1, local434 + arg0, local369);
							}
						}
					}
				}
				if (local36.anInt4666 != 0 && arg9 != null) {
					arg9.method5250(arg1, arg0, local58, !local36.aBoolean346, local55, local36.aBoolean356);
				}
			} else if ((arg3 < 12 || arg3 > 17) && (arg3 < 18 || arg3 > 21)) {
				@Pc(670) Class11_Sub1_Sub3 local670;
				if (arg3 == 0) {
					@Pc(644) int local644 = local36.anInt4626;
					if (Static221.aBoolean288 && local36.anInt4626 == -1) {
						local644 = 1;
					}
					if (local217) {
						@Pc(688) Class11_Sub1_Sub3_Sub1 local688 = new Class11_Sub1_Sub3_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5, local183);
						if (local688.method7229()) {
							local688.method7226(arg4);
						}
						local670 = local688;
					} else {
						local670 = new Class11_Sub1_Sub3_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5, arg2);
					}
					Static9.method234(arg8, arg1, arg0, local670, null);
					if (arg5 == 0) {
						if (Static189.aBoolean270 && local36.aBoolean353) {
							local126.a(arg1, arg0, 50);
							local126.a(arg1, arg0 + 1, 50);
						}
						if (local644 == 1 && !super.aBoolean709) {
							Static587.method7879(local36.anInt4642, arg8, arg1, 1, arg0, local36.anInt4658);
						}
					} else if (arg5 == 1) {
						if (Static189.aBoolean270 && local36.aBoolean353) {
							local126.a(arg1, arg0 + 1, 50);
							local126.a(arg1 + 1, arg0 + 1, 50);
						}
						if (local644 == 1 && !super.aBoolean709) {
							Static587.method7879(-local36.anInt4642, arg8, arg1, 2, arg0 + 1, local36.anInt4658);
						}
					} else if (arg5 == 2) {
						if (Static189.aBoolean270 && local36.aBoolean353) {
							local126.a(arg1 + 1, arg0, 50);
							local126.a(arg1 + 1, arg0 + 1, 50);
						}
						if (local644 == 1 && !super.aBoolean709) {
							Static587.method7879(-local36.anInt4642, arg8, arg1 + 1, 1, arg0, local36.anInt4658);
						}
					} else if (arg5 == 3) {
						if (Static189.aBoolean270 && local36.aBoolean353) {
							local126.a(arg1, arg0, 50);
							local126.a(arg1 + 1, arg0, 50);
						}
						if (local644 == 1 && !super.aBoolean709) {
							Static587.method7879(local36.anInt4642, arg8, arg1, 2, arg0, local36.anInt4658);
						}
					}
					if (local36.anInt4666 != 0 && arg9 != null) {
						arg9.method5253(!local36.aBoolean346, arg5, arg3, arg1, local36.aBoolean356, arg0);
					}
					if (local36.anInt4680 != 64) {
						Static55.method957(arg8, arg1, arg0, local36.anInt4680);
					}
				} else {
					@Pc(947) Class11_Sub1_Sub3_Sub1 local947;
					@Pc(929) Class11_Sub1_Sub3 local929;
					if (arg3 == 1) {
						if (local217) {
							local947 = new Class11_Sub1_Sub3_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5, local183);
							if (local947.method7229()) {
								local947.method7226(arg4);
							}
							local929 = local947;
						} else {
							local929 = new Class11_Sub1_Sub3_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5, arg2);
						}
						Static9.method234(arg8, arg1, arg0, local929, null);
						if (local36.aBoolean353 && Static189.aBoolean270) {
							if (arg5 == 0) {
								local126.a(arg1, arg0 + 1, 50);
							} else if (arg5 == 1) {
								local126.a(arg1 + 1, arg0 + 1, 50);
							} else if (arg5 == 2) {
								local126.a(arg1 + 1, arg0, 50);
							} else if (arg5 == 3) {
								local126.a(arg1, arg0, 50);
							}
						}
						if (local36.anInt4666 != 0 && arg9 != null) {
							arg9.method5253(!local36.aBoolean346, arg5, arg3, arg1, local36.aBoolean356, arg0);
						}
					} else if (arg3 == 2) {
						local369 = arg5 + 1 & 0x3;
						if (local217) {
							@Pc(1071) Class11_Sub1_Sub3_Sub1 local1071 = new Class11_Sub1_Sub3_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5 + 4, local183);
							@Pc(1087) Class11_Sub1_Sub3_Sub1 local1087 = new Class11_Sub1_Sub3_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, local369, local183);
							if (local1071.method7229()) {
								local1071.method7226(arg4);
							}
							local670 = local1087;
							if (local1087.method7229()) {
								local1087.method7226(arg4);
							}
							local929 = local1071;
						} else {
							local929 = new Class11_Sub1_Sub3_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5 + 4, arg2);
							local670 = new Class11_Sub1_Sub3_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, local369, arg2);
						}
						Static9.method234(arg8, arg1, arg0, local929, local670);
						if ((local36.anInt4626 == 1 || Static221.aBoolean288 && local36.anInt4626 == -1) && !super.aBoolean709) {
							if (arg5 == 0) {
								Static587.method7879(local36.anInt4642, arg8, arg1, 1, arg0, local36.anInt4658);
								Static587.method7879(local36.anInt4642, arg8, arg1, 2, arg0 + 1, local36.anInt4658);
							} else if (arg5 == 1) {
								Static587.method7879(local36.anInt4642, arg8, arg1 + 1, 1, arg0, local36.anInt4658);
								Static587.method7879(local36.anInt4642, arg8, arg1, 2, arg0 + 1, local36.anInt4658);
							} else if (arg5 == 2) {
								Static587.method7879(local36.anInt4642, arg8, arg1 + 1, 1, arg0, local36.anInt4658);
								Static587.method7879(local36.anInt4642, arg8, arg1, 2, arg0, local36.anInt4658);
							} else if (arg5 == 3) {
								Static587.method7879(local36.anInt4642, arg8, arg1, 1, arg0, local36.anInt4658);
								Static587.method7879(local36.anInt4642, arg8, arg1, 2, arg0, local36.anInt4658);
							}
						}
						if (local36.anInt4666 != 0 && arg9 != null) {
							arg9.method5253(!local36.aBoolean346, arg5, arg3, arg1, local36.aBoolean356, arg0);
						}
						if (local36.anInt4680 != 64) {
							Static55.method957(arg8, arg1, arg0, local36.anInt4680);
						}
					} else if (arg3 == 3) {
						if (local217) {
							local947 = new Class11_Sub1_Sub3_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5, local183);
							local929 = local947;
							if (local947.method7229()) {
								local947.method7226(arg4);
							}
						} else {
							local929 = new Class11_Sub1_Sub3_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg3, arg5, arg2);
						}
						Static9.method234(arg8, arg1, arg0, local929, null);
						if (local36.aBoolean353 && Static189.aBoolean270) {
							if (arg5 == 0) {
								local126.a(arg1, arg0 + 1, 50);
							} else if (arg5 == 1) {
								local126.a(arg1 + 1, arg0 + 1, 50);
							} else if (arg5 == 2) {
								local126.a(arg1 + 1, arg0, 50);
							} else if (arg5 == 3) {
								local126.a(arg1, arg0, 50);
							}
						}
						if (local36.anInt4666 != 0 && arg9 != null) {
							arg9.method5253(!local36.aBoolean346, arg5, arg3, arg1, local36.aBoolean356, arg0);
						}
					} else if (arg3 == 9) {
						if (local217) {
							local335 = new Class11_Sub1_Sub1_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg1, arg1, arg0, arg0, arg3, arg5, local183);
							local373 = local335;
							if (local335.method7229()) {
								local335.method7226(arg4);
							}
						} else {
							local373 = new Class11_Sub1_Sub1_Sub5(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg1, local58 + arg1 - 1, arg0, local55 + arg0 - 1, arg3, arg5, arg2);
						}
						Static89.method1396(local373, false);
						if (local36.anInt4666 != 0 && arg9 != null) {
							arg9.method5250(arg1, arg0, local58, !local36.aBoolean346, local55, local36.aBoolean356);
						}
						if (local36.anInt4680 != 64) {
							Static55.method957(arg8, arg1, arg0, local36.anInt4680);
						}
					} else {
						@Pc(1574) Class11_Sub1_Sub5 local1574;
						if (arg3 == 4) {
							if (local217) {
								@Pc(1572) Class11_Sub1_Sub5_Sub2 local1572 = new Class11_Sub1_Sub5_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, 0, 0, arg3, arg5);
								local1574 = local1572;
								if (local1572.method7229()) {
									local1572.method7226(arg4);
								}
							} else {
								local1574 = new Class11_Sub1_Sub5_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, 0, 0, arg3, arg5, arg2);
							}
							Static218.method3256(arg8, arg1, arg0, local1574, null);
						} else {
							@Pc(1618) int local1618;
							@Pc(1624) Interface15 local1624;
							@Pc(1663) Class11_Sub1_Sub5_Sub2 local1663;
							if (arg3 == 5) {
								local1618 = 65;
								local1624 = (Interface15) Static316.method4694(arg8, arg1, arg0);
								if (local1624 != null) {
									local1618 = Static347.aClass122_4.method2770(local1624.method7232()).anInt4680 + 1;
								}
								if (local217) {
									local1663 = new Class11_Sub1_Sub5_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, local1618 * Static478.anIntArray268[arg5], local1618 * Static43.anIntArray44[arg5], arg3, arg5);
									local1574 = local1663;
									if (local1663.method7229()) {
										local1663.method7226(arg4);
									}
								} else {
									local1574 = new Class11_Sub1_Sub5_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, Static478.anIntArray268[arg5] * local1618, local1618 * Static43.anIntArray44[arg5], arg3, arg5, arg2);
								}
								Static218.method3256(arg8, arg1, arg0, local1574, null);
							} else if (arg3 == 6) {
								local1618 = 33;
								local1624 = (Interface15) Static316.method4694(arg8, arg1, arg0);
								if (local1624 != null) {
									local1618 = Static347.aClass122_4.method2770(local1624.method7232()).anInt4680 / 2 + 1;
								}
								if (local217) {
									local1663 = new Class11_Sub1_Sub5_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, local1618 * Static478.anIntArray268[arg5], Static43.anIntArray44[arg5] * local1618, arg3, arg5 + 4);
									local1574 = local1663;
									if (local1663.method7229()) {
										local1663.method7226(arg4);
									}
								} else {
									local1574 = new Class11_Sub1_Sub5_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, Static459.anIntArray504[arg5] * local1618, Static306.anIntArray270[arg5] * local1618, arg3, arg5 + 4, arg2);
								}
								Static218.method3256(arg8, arg1, arg0, local1574, null);
							} else if (arg3 == 7) {
								local1618 = arg5 + 2 & 0x3;
								if (local217) {
									@Pc(1863) Class11_Sub1_Sub5_Sub2 local1863 = new Class11_Sub1_Sub5_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, 0, 0, arg3, local1618 + 4);
									local1574 = local1863;
									if (local1863.method7229()) {
										local1863.method7226(arg4);
									}
								} else {
									local1574 = new Class11_Sub1_Sub5_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, 0, 0, arg3, local1618 + 4, arg2);
								}
								Static218.method3256(arg8, arg1, arg0, local1574, null);
							} else if (arg3 == 8) {
								local369 = arg5 + 2 & 0x3;
								local430 = 33;
								@Pc(1903) Interface15 local1903 = (Interface15) Static316.method4694(arg8, arg1, arg0);
								if (local1903 != null) {
									local430 = Static347.aClass122_4.method2770(local1903.method7232()).anInt4680 / 2 + 1;
								}
								@Pc(1946) Class11_Sub1_Sub5 local1946;
								@Pc(1965) Class11_Sub1_Sub5 local1965;
								if (local217) {
									local1946 = new Class11_Sub1_Sub5_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, Static459.anIntArray504[arg5] * local430, Static306.anIntArray270[arg5] * local430, arg3, arg5 + 4);
									local1965 = new Class11_Sub1_Sub5_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, 0, 0, arg3, local369 + 4);
									if (local1946.method7229()) {
										local1946.method7226(arg4);
									}
									if (local1965.method7229()) {
										local1965.method7226(arg4);
									}
								} else {
									local1946 = new Class11_Sub1_Sub5_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, local430 * Static459.anIntArray504[arg5], local430 * Static306.anIntArray270[arg5], arg3, arg5 + 4, arg2);
									local1965 = new Class11_Sub1_Sub5_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, 0, 0, arg3, local369 + 4, arg2);
								}
								Static218.method3256(arg8, arg1, arg0, local1946, local1965);
							}
						}
					}
				}
			} else {
				if (local217) {
					local335 = new Class11_Sub1_Sub1_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg1, local58 + arg1 - 1, arg0, arg0 + local55 - 1, arg3, arg5, local183);
					if (local335.method7229()) {
						local335.method7226(arg4);
					}
					local373 = local335;
				} else {
					local373 = new Class11_Sub1_Sub1_Sub5(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg1, local58 + arg1 - 1, arg0, arg0 + local55 - 1, arg3, arg5, arg2);
				}
				Static89.method1396(local373, false);
				if (Static189.aBoolean270 && !super.aBoolean709 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg8 > 0 && local36.anInt4626 != 0) {
					super.aByteArrayArrayArray14[arg8][arg1][arg0] = (byte) (super.aByteArrayArrayArray14[arg8][arg1][arg0] | 0x4);
				}
				if (local36.anInt4666 != 0 && arg9 != null) {
					arg9.method5250(arg1, arg0, local58, !local36.aBoolean346, local55, local36.aBoolean356);
				}
			}
		} else if (Static86.aClass1_Sub30_Sub1_1.aBoolean487 || local36.anInt4662 != 0 || local36.anInt4666 == 1 || local36.aBoolean358) {
			@Pc(277) Class11_Sub1_Sub4 local277;
			if (local217) {
				@Pc(294) Class11_Sub1_Sub4_Sub1 local294 = new Class11_Sub1_Sub4_Sub1(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg5, local183);
				local277 = local294;
				if (local294.method7229()) {
					local294.method7226(arg4);
				}
			} else {
				local277 = new Class11_Sub1_Sub4_Sub2(arg4, local36, arg8, arg7, local162, local154, local171, super.aBoolean709, arg5, arg2);
			}
			Static436.method6199(arg8, arg1, arg0, local277);
			if (local36.anInt4666 == 1 && arg9 != null) {
				arg9.method5264(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(IILclient!nn;IIILclient!r;)V")
	public void method7749(@OriginalArg(0) int arg0, @OriginalArg(2) Class240 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class78 arg5) {
		@Pc(10) Interface15 local10 = null;
		if (arg2 == 0) {
			local10 = (Interface15) Static316.method4694(arg4, arg0, arg3);
		}
		if (arg2 == 1) {
			local10 = (Interface15) Static175.method2781(arg4, arg0, arg3);
		}
		if (arg2 == 2) {
			local10 = (Interface15) Static432.method6172(arg4, arg0, arg3, kj.class);
		}
		if (arg2 == 3) {
			local10 = (Interface15) Static481.method6668(arg4, arg0, arg3);
		}
		if (local10 == null) {
			return;
		}
		@Pc(66) Class178 local66 = Static347.aClass122_4.method2770(local10.method7232());
		@Pc(70) int local70 = local10.method7227();
		@Pc(74) int local74 = local10.method7230();
		if (local66.method3711()) {
			Static542.method7384(arg3, arg4, local66, arg0);
		}
		if (local10.method7229()) {
			local10.method7231(arg5);
		}
		if (arg2 == 0) {
			Static294.method4374(arg4, arg0, arg3);
			if (local66.anInt4666 != 0) {
				arg1.method5255(arg0, arg3, !local66.aBoolean346, local70, local66.aBoolean356, local74);
			}
			if (local66.anInt4626 == 1) {
				if (local74 != 0) {
					if (local74 == 1) {
						Static561.method7583(arg3 + 1, arg4, arg0, 2);
						return;
					}
					if (local74 == 2) {
						Static561.method7583(arg3, arg4, arg0 + 1, 1);
					} else if (local74 == 3) {
						Static561.method7583(arg3, arg4, arg0, 2);
						return;
					}
					return;
				}
				Static561.method7583(arg3, arg4, arg0, 1);
				return;
			}
		} else if (arg2 == 1) {
			Static163.method2694(arg4, arg0, arg3);
		} else if (arg2 == 2) {
			Static574.method7730(arg4, arg0, arg3, kj.class);
			if (local66.anInt4666 != 0 && arg0 + local66.anInt4627 < super.anInt9511 && arg3 + local66.anInt4627 < super.anInt9505 && super.anInt9511 > arg0 + local66.anInt4634 && super.anInt9505 > local66.anInt4634 + arg3) {
				arg1.method5256(arg3, !local66.aBoolean346, arg0, local74, local66.anInt4627, local66.aBoolean356, local66.anInt4634);
				return;
			}
			return;
		} else if (arg2 == 3) {
			Static524.method1218(arg4, arg0, arg3);
			if (local66.anInt4666 == 1) {
				arg1.method5259(arg3, arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!ac;IIII[IIIIILclient!r;)V")
	public void method7750(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class78 arg9) {
		if (super.aBoolean709) {
			return;
		}
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(19) Class130 local19 = null;
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(35) int local35 = (arg1 & 0x7) * 8;
		while (true) {
			@Pc(40) int local40;
			@Pc(70) int local70;
			@Pc(111) int local111;
			@Pc(437) int local437;
			while (arg0.aByteArray104.length > arg0.anInt9802) {
				local40 = arg0.method7974();
				if (local40 == 0) {
					local19 = new Class130(arg0);
				} else {
					@Pc(132) int local132;
					@Pc(136) int local136;
					@Pc(174) int local174;
					@Pc(261) int local261;
					if (local40 == 1) {
						local70 = arg0.method7974();
						if (local70 > 0) {
							for (local437 = 0; local437 < local70; local437++) {
								@Pc(446) Class49 local446 = new Class49(arg9, arg0, 2);
								if (local446.anInt1426 == 31) {
									@Pc(457) Class336 local457 = Static400.aClass351_1.method7559(arg0.method7945());
									local446.method1226(local457.anInt8986, local457.anInt8984, local457.anInt8988, local457.anInt8987);
								}
								if (arg9.method6777() > 0) {
									@Pc(474) Class1_Sub24 local474 = local446.aClass1_Sub24_1;
									local261 = local474.method7609() >> 9;
									local132 = local474.method7608() >> 9;
									if (local446.anInt1425 == arg6 && local261 >= local25 && local25 + 8 > local261 && local35 <= local132 && local132 < local35 + 8) {
										local136 = (arg7 << 9) + Static21.method473(local474.method7609() & 0xFFF, arg4, local474.method7608() & 0xFFF);
										local261 = local136 >> 9;
										local174 = (arg8 << 9) + Static28.method559(local474.method7609() & 0xFFF, arg4, local474.method7608() & 0xFFF);
										local132 = local174 >> 9;
										if (local261 >= 0 && local132 >= 0 && super.anInt9511 > local261 && local132 < super.anInt9505) {
											local474.method7606(local136, local174, super.anIntArrayArrayArray19[arg6][local261][local132] - local474.method7612());
											Static275.method4007(local446);
										}
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local19 == null) {
							local19 = new Class130();
						}
						local19.method3011(arg0);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray18 == null) {
							super.aByteArrayArrayArray18 = new byte[4][][];
						}
						for (local70 = 0; local70 < 4; local70++) {
							@Pc(76) byte local76 = arg0.method7963();
							@Pc(115) int local115;
							if (local76 == 0 && super.aByteArrayArrayArray18[arg3] != null) {
								if (local70 <= arg6) {
									local111 = arg7;
									local115 = arg7 + 7;
									local261 = arg8;
									if (arg7 < 0) {
										local111 = 0;
									} else if (super.anInt9511 <= arg7) {
										local111 = super.anInt9511;
									}
									local132 = arg8 + 7;
									if (local115 < 0) {
										local115 = 0;
									} else if (super.anInt9511 <= local115) {
										local115 = super.anInt9511;
									}
									if (arg8 < 0) {
										local261 = 0;
									} else if (arg8 >= super.anInt9505) {
										local261 = super.anInt9505;
									}
									if (local132 < 0) {
										local132 = 0;
									} else if (local132 >= super.anInt9505) {
										local132 = super.anInt9505;
									}
									while (local111 < local115) {
										while (local261 < local132) {
											super.aByteArrayArrayArray18[arg3][local111][local261] = 0;
											local261++;
										}
										local111++;
									}
								}
							} else if (local76 == 1) {
								if (super.aByteArrayArrayArray18[arg3] == null) {
									super.aByteArrayArrayArray18[arg3] = new byte[super.anInt9511 + 1][super.anInt9505 + 1];
								}
								for (local111 = 0; local111 < 64; local111 += 4) {
									for (local115 = 0; local115 < 64; local115 += 4) {
										@Pc(123) byte local123 = arg0.method7963();
										if (local70 <= arg6) {
											for (local132 = local111; local132 < local111 + 4; local132++) {
												for (local136 = local115; local136 < local115 + 4; local136++) {
													if (local132 >= local25 && local25 + 8 > local132 && local35 <= local136 && local35 + 8 > local35) {
														local174 = Static267.method3892(local136 & 0x7, arg4, local132 & 0x7) + arg7;
														@Pc(187) int local187 = arg8 + Static53.method7904(local132 & 0x7, local136 & 0x7, arg4);
														if (local174 >= 0 && local174 < super.anInt9511 && local187 >= 0 && super.anInt9505 > local187) {
															super.aByteArrayArrayArray18[arg3][local174][local187] = local123;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg5 == null) {
						arg0.anInt9802 += 10;
					} else {
						arg5[0] = arg0.method7945();
						arg5[1] = arg0.method7975();
						arg5[2] = arg0.method7975();
						arg5[3] = arg0.method7975();
						arg5[4] = arg0.method7945();
					}
				}
			}
			if (local19 != null) {
				Static120.method2181(arg7 >> 3, arg8 >> 3, local19);
			}
			if (super.aByteArrayArrayArray18 != null && super.aByteArrayArrayArray18[arg3] != null) {
				local40 = arg7 + 7;
				local70 = arg8 + 7;
				for (local437 = arg7; local437 < local40; local437++) {
					for (local111 = arg8; local111 < local70; local111++) {
						super.aByteArrayArrayArray18[arg3][local437][local111] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!r;BZ)V")
	public void method7751(@OriginalArg(0) Class78 arg0, @OriginalArg(2) boolean arg1) {
		Static99.method1472();
		if (!arg1) {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if (super.anInt9510 > 1) {
				for (local14 = 0; local14 < super.anInt9511; local14++) {
					for (local18 = 0; super.anInt9505 > local18; local18++) {
						if ((Static85.aByteArrayArrayArray1[1][local14][local18] & 0x2) == 2) {
							Static452.method6354(local14, local18);
						}
					}
				}
			}
			for (local14 = 0; super.anInt9510 > local14; local14++) {
				for (local18 = 0; local18 <= super.anInt9505; local18++) {
					for (@Pc(58) int local58 = 0; local58 <= super.anInt9511; local58++) {
						if ((super.aByteArrayArrayArray14[local14][local58][local18] & 0x4) != 0) {
							@Pc(73) int local73 = local58;
							@Pc(75) int local75 = local58;
							@Pc(77) int local77 = local18;
							@Pc(79) int local79 = local18;
							while (local77 > 0 && (super.aByteArrayArrayArray14[local14][local58][local77 - 1] & 0x4) != 0 && local18 - local77 < 10) {
								local77--;
							}
							while (local79 < super.anInt9505 && (super.aByteArrayArrayArray14[local14][local58][local79 + 1] & 0x4) != 0 && local79 - local77 < 10) {
								local79++;
							}
							@Pc(144) int local144;
							label111: while (local73 > 0 && local58 - local73 < 10) {
								for (local144 = local77; local144 <= local79; local144++) {
									if ((super.aByteArrayArrayArray14[local14][local73 - 1][local144] & 0x4) == 0) {
										break label111;
									}
								}
								local73--;
							}
							label98: while (super.anInt9511 > local75 && local75 - local73 < 10) {
								for (local144 = local77; local144 <= local79; local144++) {
									if ((super.aByteArrayArrayArray14[local14][local75 + 1][local144] & 0x4) == 0) {
										break label98;
									}
								}
								local75++;
							}
							if ((local79 + 1 - local77) * (local75 + 1 - local73) >= 4) {
								local144 = super.anIntArrayArrayArray19[local14][local73][local77];
								Static406.method5828(local14, local73 << 9, local144, (local79 << 9) + 512, (local75 << 9) + 512, local144, local77 << 9);
								for (@Pc(270) int local270 = local73; local270 <= local75; local270++) {
									for (@Pc(274) int local274 = local77; local274 <= local79; local274++) {
										super.aByteArrayArrayArray14[local14][local270][local274] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static200.method3092();
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([IIIILclient!ac;Lclient!r;)V")
	public void method7753(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub3 arg3, @OriginalArg(5) Class78 arg4) {
		if (super.aBoolean709) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class130 local13 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		while (true) {
			@Pc(30) int local30;
			@Pc(46) int local46;
			@Pc(243) int local243;
			@Pc(247) int local247;
			@Pc(50) int local50;
			while (arg3.aByteArray104.length > arg3.anInt9802) {
				local30 = arg3.method7974();
				if (local30 == 0) {
					local13 = new Class130(arg3);
				} else {
					@Pc(99) int local99;
					@Pc(110) int local110;
					@Pc(114) int local114;
					if (local30 == 1) {
						local46 = arg3.method7974();
						if (local46 > 0) {
							for (local50 = 0; local50 < local46; local50++) {
								@Pc(59) Class49 local59 = new Class49(arg4, arg3, 2);
								if (local59.anInt1426 == 31) {
									@Pc(72) Class336 local72 = Static400.aClass351_1.method7559(arg3.method7945());
									local59.method1226(local72.anInt8986, local72.anInt8984, local72.anInt8988, local72.anInt8987);
								}
								if (arg4.method6777() > 0) {
									@Pc(91) Class1_Sub24 local91 = local59.aClass1_Sub24_1;
									local99 = local91.method7609() + (arg1 << 9);
									local110 = local91.method7608() + (arg2 << 9);
									local114 = local99 >> 9;
									@Pc(118) int local118 = local110 >> 9;
									if (local114 >= 0 && local118 >= 0 && super.anInt9511 > local114 && local118 < super.anInt9505) {
										local91.method7606(local99, local110, super.anIntArrayArrayArray19[local59.anInt1425][local114][local118] - local91.method7612());
										Static275.method4007(local59);
									}
								}
							}
						}
					} else if (local30 == 2) {
						if (local13 == null) {
							local13 = new Class130();
						}
						local13.method3011(arg3);
					} else if (local30 != 128) {
						if (local30 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray18 == null) {
							super.aByteArrayArrayArray18 = new byte[4][][];
						}
						for (local46 = 0; local46 < 4; local46++) {
							@Pc(211) byte local211 = arg3.method7963();
							if (local211 == 0 && super.aByteArrayArrayArray18[local46] != null) {
								local243 = arg1;
								local247 = arg1 + 64;
								local99 = arg2;
								if (arg2 < 0) {
									local99 = 0;
								} else if (super.anInt9505 <= arg2) {
									local99 = super.anInt9505;
								}
								if (arg1 < 0) {
									local243 = 0;
								} else if (super.anInt9511 <= arg1) {
									local243 = super.anInt9511;
								}
								if (local247 < 0) {
									local247 = 0;
								} else if (super.anInt9511 <= local247) {
									local247 = super.anInt9511;
								}
								local110 = arg2 + 64;
								if (local110 < 0) {
									local110 = 0;
								} else if (super.anInt9505 <= local110) {
									local110 = super.anInt9505;
								}
								while (local243 < local247) {
									while (local110 > local99) {
										super.aByteArrayArrayArray18[local46][local243][local99] = 0;
										local99++;
									}
									local243++;
								}
							} else if (local211 == 1) {
								if (super.aByteArrayArrayArray18[local46] == null) {
									super.aByteArrayArrayArray18[local46] = new byte[super.anInt9511 + 1][super.anInt9505 + 1];
								}
								for (local243 = 0; local243 < 64; local243 += 4) {
									for (local247 = 0; local247 < 64; local247 += 4) {
										@Pc(253) byte local253 = arg3.method7963();
										for (local110 = arg1 + local243; local110 < arg1 + local243 + 4; local110++) {
											for (local114 = arg2 + local247; local114 < local247 + arg2 + 4; local114++) {
												if (local110 >= 0 && local110 < super.anInt9511 && local114 >= 0 && super.anInt9505 > local114) {
													super.aByteArrayArrayArray18[local46][local110][local114] = local253;
												}
											}
										}
									}
								}
							} else if (local211 == 2) {
								if (super.aByteArrayArrayArray18[local46] == null) {
									super.aByteArrayArrayArray18[local46] = new byte[super.anInt9511 + 1][super.anInt9505 + 1];
								}
								if (local46 > 0) {
									local243 = arg1;
									local247 = arg1 + 64;
									local99 = arg2;
									if (arg2 < 0) {
										local99 = 0;
									} else if (arg2 >= super.anInt9505) {
										local99 = super.anInt9505;
									}
									if (local247 < 0) {
										local247 = 0;
									} else if (local247 >= super.anInt9511) {
										local247 = super.anInt9511;
									}
									if (arg1 < 0) {
										local243 = 0;
									} else if (arg1 >= super.anInt9511) {
										local243 = super.anInt9511;
									}
									local110 = arg2 + 64;
									if (local110 < 0) {
										local110 = 0;
									} else if (local110 >= super.anInt9505) {
										local110 = super.anInt9505;
									}
									while (local243 < local247) {
										while (local110 > local99) {
											super.aByteArrayArrayArray18[local46][local243][local99] = super.aByteArrayArrayArray18[local46 - 1][local243][local99];
											local99++;
										}
										local243++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg0 == null) {
						arg3.anInt9802 += 10;
					} else {
						arg0[0] = arg3.method7945();
						arg0[1] = arg3.method7975();
						arg0[2] = arg3.method7975();
						arg0[3] = arg3.method7975();
						arg0[4] = arg3.method7945();
					}
				}
			}
			if (local13 != null) {
				for (local30 = 0; local30 < 8; local30++) {
					for (local46 = 0; local46 < 8; local46++) {
						local50 = local30 + (arg1 >> 3);
						local243 = local46 + (arg2 >> 3);
						if (local50 >= 0 && super.anInt9511 >> 3 > local50 && local243 >= 0 && super.anInt9505 >> 3 > local243) {
							Static120.method2181(local50, local243, local13);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray18 != null) {
				for (local30 = 0; local30 < 4; local30++) {
					if (super.aByteArrayArrayArray18[local30] != null) {
						for (local46 = 0; local46 < 16; local46++) {
							for (local50 = 0; local50 < 16; local50++) {
								local243 = (arg1 >> 2) + local46;
								local247 = local50 + (arg2 >> 2);
								if (local243 >= 0 && local243 < 26 && local247 >= 0 && local247 < 26) {
									super.aByteArrayArrayArray18[local30][local243][local247] = 0;
								}
							}
						}
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([Lclient!nn;[BILclient!r;II)V")
	public void method7754(@OriginalArg(0) Class240[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class78 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) Class1_Sub3 local18 = new Class1_Sub3(arg1);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method7935();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method7971();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local18.method7974();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg3 + local54;
				@Pc(78) int local78 = arg4 + local48;
				if (local74 > 0 && local78 > 0 && local74 < super.anInt9511 - 1 && super.anInt9505 - 1 > local78) {
					@Pc(100) Class240 local100 = null;
					if (!super.aBoolean709) {
						@Pc(105) int local105 = local58;
						if ((Static85.aByteArrayArrayArray1[1][local74][local78] & 0x2) == 2) {
							local105 = local58 - 1;
						}
						if (local105 >= 0) {
							local100 = arg0[local105];
						}
					}
					this.method7746(local78, local74, -1, local66, arg2, local70, local20, local58, local58, local100);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "([Lclient!nn;IIII[BILclient!r;III)V")
	public void method7755(@OriginalArg(0) Class240[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class78 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class1_Sub3 local10 = new Class1_Sub3(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method7935();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method7971();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method7974();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (local53 == arg8 && arg5 <= local49 && arg5 + 8 > local49 && arg2 <= local43 && arg2 + 8 > local43) {
					@Pc(89) Class178 local89 = Static347.aClass122_4.method2770(local12);
					@Pc(106) int local106 = arg9 + Static499.method7032(local89.anInt4627, arg1, local49 & 0x7, local65, local43 & 0x7, local89.anInt4634);
					@Pc(123) int local123 = arg7 + Static405.method5818(arg1, local49 & 0x7, local65, local43 & 0x7, local89.anInt4634, local89.anInt4627);
					if (local106 > 0 && local123 > 0 && local106 < super.anInt9511 - 1 && super.anInt9505 - 1 > local123) {
						@Pc(151) Class240 local151 = null;
						if (!super.aBoolean709) {
							@Pc(156) int local156 = arg3;
							if ((Static85.aByteArrayArrayArray1[1][local106][local123] & 0x2) == 2) {
								local156 = arg3 - 1;
							}
							if (local156 >= 0) {
								local151 = arg0[local156];
							}
						}
						this.method7746(local123, local106, -1, local61, arg6, arg1 + local65 & 0x3, local12, arg3, arg3, local151);
					}
				}
			}
		}
	}
}
