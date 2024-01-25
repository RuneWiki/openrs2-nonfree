import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!wq", name = "F", descriptor = "Ljava/lang/String;")
	public static final String aString108;

	@OriginalMember(owner = "client!wq", name = "K", descriptor = "Ljava/lang/String;")
	public static final String aString109;

	@OriginalMember(owner = "client!wq", name = "P", descriptor = "I")
	public int anInt10216 = 99;

	static {
		@Pc(1) String local1 = "Unknown";
		try {
			local1 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(7) Exception local7) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(18) Exception local18) {
		}
		local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(29) Exception local29) {
		}
		aString108 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(40) Exception local40) {
		}
		aString109 = local1.toLowerCase();
		local1 = "Unknown";
		try {
			local1 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(51) Exception local51) {
		}
		local1.toLowerCase();
		local1 = "~/";
		try {
			local1 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(62) Exception local62) {
		}
		new File(local1);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIZ)V")
	public Class45_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static29.aClass77_1, Static3.aClass14_1);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([IZILclient!ud;Lclient!ha;I)V")
	public void method8530(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub34 arg2, @OriginalArg(4) Class87 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean755) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(19) Class121 local19 = null;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(24) int local24;
						@Pc(96) int local96;
						@Pc(489) int local489;
						@Pc(114) int local114;
						@Pc(118) int local118;
						while (arg2.anInt8188 < arg2.aByteArray77.length) {
							local24 = arg2.method6904();
							if (local24 == 0) {
								local19 = new Class121(arg2);
							} else {
								@Pc(120) int local120;
								@Pc(164) int local164;
								@Pc(403) int local403;
								if (local24 == 1) {
									local96 = arg2.method6904();
									if (local96 > 0) {
										for (local489 = 0; local489 < local96; local489++) {
											@Pc(498) Class93 local498 = new Class93(arg3, arg2, 2);
											if (local498.anInt2927 == 31) {
												@Pc(509) Class230 local509 = Static375.aClass58_1.method1364(arg2.method6884());
												local498.method2517(local509.anInt6614, local509.anInt6615, local509.anInt6612, local509.anInt6611);
											}
											if (arg3.method7953() > 0) {
												@Pc(526) Class2_Sub4 local526 = local498.aClass2_Sub4_3;
												local120 = local526.method8150() + (arg1 << 9);
												local164 = (arg4 << 9) + local526.method8151();
												local403 = local120 >> 9;
												@Pc(551) int local551 = local164 >> 9;
												if (local403 >= 0 && local551 >= 0 && local403 < super.anInt10197 && super.anInt10198 > local551) {
													local526.method8148(super.anIntArrayArrayArray22[local498.anInt2922][local403][local551] - local526.method8158(), local164, local120);
													Static489.method6998(local498);
												}
											}
										}
									}
								} else if (local24 == 2) {
									if (local19 == null) {
										local19 = new Class121();
									}
									local19.method3080(arg2);
								} else if (local24 != 128) {
									if (local24 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray14 == null) {
										super.aByteArrayArrayArray14 = new byte[4][][];
									}
									local11 = true;
									for (local96 = 0; local96 < 4; local96++) {
										@Pc(102) byte local102 = arg2.method6908();
										if (local102 == 0 && super.aByteArrayArrayArray14[local96] != null) {
											local114 = arg1;
											local118 = arg1 + 64;
											local120 = arg4;
											if (arg1 < 0) {
												local114 = 0;
											} else if (super.anInt10197 <= arg1) {
												local114 = super.anInt10197;
											}
											if (local118 < 0) {
												local118 = 0;
											} else if (super.anInt10197 <= local118) {
												local118 = super.anInt10197;
											}
											local164 = arg4 + 64;
											if (arg4 < 0) {
												local120 = 0;
											} else if (arg4 >= super.anInt10198) {
												local120 = super.anInt10198;
											}
											if (local164 < 0) {
												local164 = 0;
											} else if (super.anInt10198 <= local164) {
												local164 = super.anInt10198;
											}
											while (local114 < local118) {
												while (local120 < local164) {
													super.aByteArrayArrayArray14[local96][local114][local120] = 0;
													local120++;
												}
												local114++;
											}
										} else if (local102 == 1) {
											if (super.aByteArrayArrayArray14[local96] == null) {
												super.aByteArrayArrayArray14[local96] = new byte[super.anInt10197 + 1][super.anInt10198 + 1];
											}
											for (local114 = 0; local114 < 64; local114 += 4) {
												for (local118 = 0; local118 < 64; local118 += 4) {
													@Pc(393) byte local393 = arg2.method6908();
													for (local164 = arg1 + local114; local164 < arg1 + local114 + 4; local164++) {
														for (local403 = arg4 + local118; local403 < local118 + arg4 + 4; local403++) {
															if (local164 >= 0 && local164 < super.anInt10197 && local403 >= 0 && local403 < super.anInt10198) {
																super.aByteArrayArrayArray14[local96][local164][local403] = local393;
															}
														}
													}
												}
											}
										} else if (local102 == 2) {
											if (super.aByteArrayArrayArray14[local96] == null) {
												super.aByteArrayArrayArray14[local96] = new byte[super.anInt10197 + 1][super.anInt10198 + 1];
											}
											if (local96 > 0) {
												local114 = arg1;
												local118 = arg1 + 64;
												local120 = arg4;
												if (arg1 < 0) {
													local114 = 0;
												} else if (arg1 >= super.anInt10197) {
													local114 = super.anInt10197;
												}
												if (local118 < 0) {
													local118 = 0;
												} else if (local118 >= super.anInt10197) {
													local118 = super.anInt10197;
												}
												if (arg4 < 0) {
													local120 = 0;
												} else if (super.anInt10198 <= arg4) {
													local120 = super.anInt10198;
												}
												local164 = arg4 + 64;
												if (local164 < 0) {
													local164 = 0;
												} else if (local164 >= super.anInt10198) {
													local164 = super.anInt10198;
												}
												while (local118 > local114) {
													while (local120 < local164) {
														super.aByteArrayArrayArray14[local96][local114][local120] = super.aByteArrayArrayArray14[local96 - 1][local114][local120];
														local120++;
													}
													local114++;
												}
											}
										}
									}
								} else if (arg0 == null) {
									arg2.anInt8188 += 10;
								} else {
									arg0[0] = arg2.method6884();
									arg0[1] = arg2.method6856();
									arg0[2] = arg2.method6856();
									arg0[3] = arg2.method6856();
									arg0[4] = arg2.method6884();
								}
							}
						}
						if (local19 != null) {
							for (local24 = 0; local24 < 8; local24++) {
								for (local96 = 0; local96 < 8; local96++) {
									local489 = (arg1 >> 3) + local24;
									local114 = (arg4 >> 3) + local96;
									if (local489 >= 0 && local489 < super.anInt10197 >> 3 && local114 >= 0 && super.anInt10198 >> 3 > local114) {
										Static534.method7467(local114, local19, local489);
									}
								}
							}
						}
						if (!local11 && super.aByteArrayArrayArray14 != null) {
							for (local24 = 0; local24 < 4; local24++) {
								if (super.aByteArrayArrayArray14[local24] != null) {
									for (local96 = 0; local96 < 16; local96++) {
										for (local489 = 0; local489 < 16; local489++) {
											local114 = local96 + (arg1 >> 2);
											local118 = (arg4 >> 2) + local489;
											if (local114 >= 0 && local114 < 26 && local118 >= 0 && local118 < 26) {
												super.aByteArrayArrayArray14[local24][local114][local118] = 0;
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
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIII)Lclient!wk;")
	private Interface27 method8531(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface27 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface27) Static468.method6746(arg2, arg3, arg0);
		}
		if (arg1 == 1) {
			local5 = (Interface27) Static148.method2840(arg2, arg3, arg0);
		}
		if (arg1 == 2) {
			local5 = (Interface27) Static383.method5768(arg2, arg3, arg0, wk.class);
		}
		if (arg1 == 3) {
			local5 = (Interface27) Static263.method4286(arg2, arg3, arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLclient!jn;Lclient!ha;III)V")
	public void method8532(@OriginalArg(0) int arg0, @OriginalArg(2) Class179 arg1, @OriginalArg(3) Class87 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(19) Interface27 local19 = this.method8531(arg3, arg4, arg5, arg0);
		if (local19 == null) {
			return;
		}
		@Pc(28) Class350 local28 = Static619.aClass281_4.method6734(local19.method8326());
		@Pc(32) int local32 = local19.method8329();
		@Pc(36) int local36 = local19.method8328();
		if (local28.method8082()) {
			Static232.method6241(arg5, arg0, local28, arg3);
		}
		if (local19.method8330()) {
			local19.method8325(arg2);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				Static307.method4723(arg5, arg0, arg3);
			} else if (arg4 == 2) {
				Static581.method8036(arg5, arg0, arg3, wk.class);
				if (local28.anInt9665 != 0 && arg0 + local28.anInt9662 < super.anInt10197 && arg3 + local28.anInt9662 < super.anInt10198 && super.anInt10197 > arg0 + local28.anInt9622 && arg3 + local28.anInt9622 < super.anInt10198) {
					arg1.method4341(!local28.aBoolean705, local36, arg3, local28.anInt9662, arg0, local28.anInt9622, local28.aBoolean704);
				}
				if (local32 == 9) {
					if ((local36 & 0x1) != 0) {
						Static47.method939(16, arg3, arg5, arg0);
						return;
					}
					Static47.method939(8, arg3, arg5, arg0);
					return;
				}
				return;
			} else if (arg4 == 3) {
				Static136.method2615(arg5, arg0, arg3);
				if (local28.anInt9665 == 1) {
					arg1.method4351(arg0, arg3);
					return;
				}
			}
			return;
		}
		Static260.method4252(arg5, arg0, arg3);
		if (local28.anInt9665 != 0) {
			arg1.method4352(!local28.aBoolean705, arg0, local36, local28.aBoolean704, arg3, local32);
		}
		if (local28.anInt9612 != 1) {
			return;
		}
		if (local36 != 0) {
			if (local36 != 1) {
				if (local36 == 2) {
					Static47.method939(1, arg3, arg5, arg0 + 1);
				} else if (local36 == 3) {
					Static47.method939(2, arg3, arg5, arg0);
					return;
				}
				return;
			}
			Static47.method939(2, arg3 + 1, arg5, arg0);
			return;
		}
		Static47.method939(1, arg3, arg5, arg0);
		return;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!jn;IIIILclient!ha;IIIBI)V")
	public void method8534(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class87 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 0 && !Static403.method6234(arg3, arg8, arg6, Static576.anInt9519)) {
			return;
		}
		if (this.anInt10216 > arg1) {
			this.anInt10216 = arg1;
		}
		@Pc(35) Class350 local35 = Static619.aClass281_4.method6734(arg2);
		if (Static404.aClass2_Sub13_2.aClass33_Sub4_1.method1808() == 0 && local35.aBoolean700) {
			return;
		}
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (arg9 == 1 || arg9 == 3) {
			local55 = local35.anInt9622;
			local58 = local35.anInt9662;
		} else {
			local58 = local35.anInt9622;
			local55 = local35.anInt9662;
		}
		@Pc(77) int local77;
		@Pc(85) int local85;
		if (super.anInt10197 >= arg3 + local55) {
			local77 = (local55 >> 1) + arg3;
			local85 = (local55 + 1 >> 1) + arg3;
		} else {
			local85 = arg3 + 1;
			local77 = arg3;
		}
		@Pc(100) int local100;
		@Pc(104) int local104;
		if (super.anInt10198 < local58 + arg6) {
			local100 = arg6;
			local104 = arg6 + 1;
		} else {
			local104 = (local58 + 1 >> 1) + arg6;
			local100 = arg6 + (local58 >> 1);
		}
		@Pc(123) Class112 local123 = Static331.aClass112Array3[arg8];
		@Pc(150) int local150 = local123.method7819(local100, local77) + local123.method7819(local100, local85) + local123.method7819(local104, local77) + local123.method7819(local104, local85) >> 2;
		@Pc(158) int local158 = (local55 << 8) + (arg3 << 9);
		@Pc(166) int local166 = (local58 << 8) + (arg6 << 9);
		@Pc(178) boolean local178 = Static192.aBoolean353 && !super.aBoolean755 && local35.aBoolean709;
		if (local35.method8082()) {
			Static541.method7595(arg1, null, local35, null, arg9, arg6, arg3);
		}
		@Pc(213) boolean local213 = arg4 == -1 && local35.anInt9664 == -1 && local35.anIntArray668 == null && local35.anIntArray665 == null && !local35.aBoolean699;
		if (Static161.aBoolean307 && (Static516.method7253(arg7) && local35.anInt9612 != 1 || !(!Static257.method4234(arg7) || local35.anInt9612 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(362) Class11_Sub1_Sub1 local362;
			@Pc(329) Class11_Sub1_Sub1_Sub3 local329;
			@Pc(366) int local366;
			@Pc(426) int local426;
			if (arg7 == 10 || arg7 == 11) {
				local329 = null;
				if (local213) {
					@Pc(360) Class11_Sub1_Sub1_Sub3 local360 = new Class11_Sub1_Sub1_Sub3(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg3, arg3 + local55 - 1, arg6, arg6 + local58 - 1, arg7, arg9, local178);
					local362 = local360;
					local366 = local360.method2443();
					local329 = local360;
				} else {
					local362 = new Class11_Sub1_Sub1_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg3, local55 + arg3 - 1, arg6, arg6 + local58 - 1, arg7, arg9, arg4);
					local366 = 15;
				}
				if (Static381.method5741(local362, false)) {
					if (local329 != null && local329.method8330()) {
						local329.method8327(arg5);
					}
					if (local35.aBoolean698 && Static192.aBoolean353) {
						if (local366 > 30) {
							local366 = 30;
						}
						for (local426 = 0; local426 <= local55; local426++) {
							for (@Pc(429) int local429 = 0; local429 <= local58; local429++) {
								local123.ka(arg3 + local426, arg6 - -local429, local366);
							}
						}
					}
				}
				if (local35.anInt9665 != 0 && arg0 != null) {
					arg0.method4348(!local35.aBoolean705, arg6, arg3, local35.aBoolean704, local58, local55);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local213) {
					local329 = new Class11_Sub1_Sub1_Sub3(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg3, arg3 + local55 - 1, arg6, arg6 + local58 - 1, arg7, arg9, local178);
					local362 = local329;
					if (local329.method8330()) {
						local329.method8327(arg5);
					}
				} else {
					local362 = new Class11_Sub1_Sub1_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg3, local55 + arg3 - 1, arg6, arg6 + local58 - 1, arg7, arg9, arg4);
				}
				Static381.method5741(local362, false);
				if (Static192.aBoolean353 && !super.aBoolean755 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg1 > 0 && local35.anInt9612 != 0) {
					super.aByteArrayArrayArray13[arg1][arg3][arg6] = (byte) (super.aByteArrayArrayArray13[arg1][arg3][arg6] | 0x4);
				}
				if (local35.anInt9665 != 0 && arg0 != null) {
					arg0.method4348(!local35.aBoolean705, arg6, arg3, local35.aBoolean704, local58, local55);
				}
			} else {
				@Pc(666) Class11_Sub1_Sub2 local666;
				if (arg7 == 0) {
					@Pc(639) int local639 = local35.anInt9612;
					if (Static327.aBoolean442 && local35.anInt9612 == -1) {
						local639 = 1;
					}
					if (local213) {
						@Pc(683) Class11_Sub1_Sub2_Sub1 local683 = new Class11_Sub1_Sub2_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9, local178);
						if (local683.method8330()) {
							local683.method8327(arg5);
						}
						local666 = local683;
					} else {
						local666 = new Class11_Sub1_Sub2_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9, arg4);
					}
					Static439.method6539(arg1, arg3, arg6, local666, null);
					if (arg9 == 0) {
						if (Static192.aBoolean353 && local35.aBoolean698) {
							local123.ka(arg3, arg6, 50);
							local123.ka(arg3, arg6 + 1, 50);
						}
						if (local639 == 1 && !super.aBoolean755) {
							Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 1, arg6);
						}
					} else if (arg9 == 1) {
						if (Static192.aBoolean353 && local35.aBoolean698) {
							local123.ka(arg3, arg6 + 1, 50);
							local123.ka(arg3 + 1, arg6 + 1, 50);
						}
						if (local639 == 1 && !super.aBoolean755) {
							Static398.method6031(arg1, local35.anInt9625, -local35.anInt9636, arg3, 2, arg6 + 1);
						}
					} else if (arg9 == 2) {
						if (Static192.aBoolean353 && local35.aBoolean698) {
							local123.ka(arg3 + 1, arg6, 50);
							local123.ka(arg3 + 1, arg6 + 1, 50);
						}
						if (local639 == 1 && !super.aBoolean755) {
							Static398.method6031(arg1, local35.anInt9625, -local35.anInt9636, arg3 + 1, 1, arg6);
						}
					} else if (arg9 == 3) {
						if (Static192.aBoolean353 && local35.aBoolean698) {
							local123.ka(arg3, arg6, 50);
							local123.ka(arg3 + 1, arg6, 50);
						}
						if (local639 == 1 && !super.aBoolean755) {
							Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 2, arg6);
						}
					}
					if (local35.anInt9665 != 0 && arg0 != null) {
						arg0.method4354(arg3, !local35.aBoolean705, arg9, arg6, arg7, local35.aBoolean704);
					}
					if (local35.anInt9660 != 64) {
						Static161.method3022(arg1, arg3, arg6, local35.anInt9660);
					}
				} else {
					@Pc(932) Class11_Sub1_Sub2 local932;
					@Pc(922) Class11_Sub1_Sub2_Sub1 local922;
					if (arg7 == 1) {
						if (local213) {
							local922 = new Class11_Sub1_Sub2_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9, local178);
							if (local922.method8330()) {
								local922.method8327(arg5);
							}
							local932 = local922;
						} else {
							local932 = new Class11_Sub1_Sub2_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9, arg4);
						}
						Static439.method6539(arg1, arg3, arg6, local932, null);
						if (local35.aBoolean698 && Static192.aBoolean353) {
							if (arg9 == 0) {
								local123.ka(arg3, arg6 + 1, 50);
							} else if (arg9 == 1) {
								local123.ka(arg3 + 1, arg6 - -1, 50);
							} else if (arg9 == 2) {
								local123.ka(arg3 + 1, arg6, 50);
							} else if (arg9 == 3) {
								local123.ka(arg3, arg6, 50);
							}
						}
						if (local35.anInt9665 != 0 && arg0 != null) {
							arg0.method4354(arg3, !local35.aBoolean705, arg9, arg6, arg7, local35.aBoolean704);
						}
					} else if (arg7 == 2) {
						local366 = arg9 + 1 & 0x3;
						if (local213) {
							@Pc(1097) Class11_Sub1_Sub2_Sub1 local1097 = new Class11_Sub1_Sub2_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9 + 4, local178);
							@Pc(1113) Class11_Sub1_Sub2_Sub1 local1113 = new Class11_Sub1_Sub2_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, local366, local178);
							if (local1097.method8330()) {
								local1097.method8327(arg5);
							}
							local666 = local1113;
							local932 = local1097;
							if (local1113.method8330()) {
								local1113.method8327(arg5);
							}
						} else {
							local932 = new Class11_Sub1_Sub2_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9 + 4, arg4);
							local666 = new Class11_Sub1_Sub2_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, local366, arg4);
						}
						Static439.method6539(arg1, arg3, arg6, local932, local666);
						if ((local35.anInt9612 == 1 || Static327.aBoolean442 && local35.anInt9612 == -1) && !super.aBoolean755) {
							if (arg9 == 0) {
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 1, arg6);
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 2, arg6 + 1);
							} else if (arg9 == 1) {
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3 + 1, 1, arg6);
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 2, arg6 + 1);
							} else if (arg9 == 2) {
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3 + 1, 1, arg6);
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 2, arg6);
							} else if (arg9 == 3) {
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 1, arg6);
								Static398.method6031(arg1, local35.anInt9625, local35.anInt9636, arg3, 2, arg6);
							}
						}
						if (local35.anInt9665 != 0 && arg0 != null) {
							arg0.method4354(arg3, !local35.aBoolean705, arg9, arg6, arg7, local35.aBoolean704);
						}
						if (local35.anInt9660 != 64) {
							Static161.method3022(arg1, arg3, arg6, local35.anInt9660);
						}
					} else if (arg7 == 3) {
						if (local213) {
							local922 = new Class11_Sub1_Sub2_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9, local178);
							if (local922.method8330()) {
								local922.method8327(arg5);
							}
							local932 = local922;
						} else {
							local932 = new Class11_Sub1_Sub2_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg7, arg9, arg4);
						}
						Static439.method6539(arg1, arg3, arg6, local932, null);
						if (local35.aBoolean698 && Static192.aBoolean353) {
							if (arg9 == 0) {
								local123.ka(arg3, arg6 + 1, 50);
							} else if (arg9 == 1) {
								local123.ka(arg3 + 1, arg6 + 1, 50);
							} else if (arg9 == 2) {
								local123.ka(arg3 + 1, arg6, 50);
							} else if (arg9 == 3) {
								local123.ka(arg3, arg6, 50);
							}
						}
						if (local35.anInt9665 != 0 && arg0 != null) {
							arg0.method4354(arg3, !local35.aBoolean705, arg9, arg6, arg7, local35.aBoolean704);
						}
					} else if (arg7 == 9) {
						if (local213) {
							local329 = new Class11_Sub1_Sub1_Sub3(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg3, arg3, arg6, arg6, arg7, arg9, local178);
							local362 = local329;
							if (local329.method8330()) {
								local329.method8327(arg5);
							}
						} else {
							local362 = new Class11_Sub1_Sub1_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg3, arg3 + local55 - 1, arg6, local58 + arg6 - 1, arg7, arg9, arg4);
						}
						Static381.method5741(local362, false);
						if (local35.anInt9612 == 1 && !super.aBoolean755) {
							@Pc(1528) byte local1528;
							if ((arg9 & 0x1) == 0) {
								local1528 = 8;
							} else {
								local1528 = 16;
							}
							Static398.method6031(arg1, local35.anInt9625, 0, arg3, local1528, arg6);
						}
						if (local35.anInt9665 != 0 && arg0 != null) {
							arg0.method4348(!local35.aBoolean705, arg6, arg3, local35.aBoolean704, local58, local55);
						}
						if (local35.anInt9660 != 64) {
							Static161.method3022(arg1, arg3, arg6, local35.anInt9660);
						}
					} else {
						@Pc(1596) Class11_Sub1_Sub3 local1596;
						if (arg7 == 4) {
							if (local213) {
								@Pc(1614) Class11_Sub1_Sub3_Sub1 local1614 = new Class11_Sub1_Sub3_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, 0, 0, arg7, arg9);
								if (local1614.method8330()) {
									local1614.method8327(arg5);
								}
								local1596 = local1614;
							} else {
								local1596 = new Class11_Sub1_Sub3_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, 0, 0, arg7, arg9, arg4);
							}
							Static479.method8319(arg1, arg3, arg6, local1596, null);
						} else {
							@Pc(1636) int local1636;
							@Pc(1642) Interface27 local1642;
							@Pc(1710) Class11_Sub1_Sub3_Sub1 local1710;
							if (arg7 == 5) {
								local1636 = 65;
								local1642 = (Interface27) Static468.method6746(arg1, arg3, arg6);
								if (local1642 != null) {
									local1636 = Static619.aClass281_4.method6734(local1642.method8326()).anInt9660 + 1;
								}
								if (local213) {
									local1710 = new Class11_Sub1_Sub3_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, Static444.anIntArray537[arg9] * local1636, Static358.anIntArray427[arg9] * local1636, arg7, arg9);
									local1596 = local1710;
									if (local1710.method8330()) {
										local1710.method8327(arg5);
									}
								} else {
									local1596 = new Class11_Sub1_Sub3_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, local1636 * Static444.anIntArray537[arg9], Static358.anIntArray427[arg9] * local1636, arg7, arg9, arg4);
								}
								Static479.method8319(arg1, arg3, arg6, local1596, null);
							} else if (arg7 == 6) {
								local1636 = 33;
								local1642 = (Interface27) Static468.method6746(arg1, arg3, arg6);
								if (local1642 != null) {
									local1636 = Static619.aClass281_4.method6734(local1642.method8326()).anInt9660 / 2 + 1;
								}
								if (local213) {
									local1710 = new Class11_Sub1_Sub3_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, local1636 * Static444.anIntArray537[arg9], local1636 * Static358.anIntArray427[arg9], arg7, arg9 + 4);
									if (local1710.method8330()) {
										local1710.method8327(arg5);
									}
									local1596 = local1710;
								} else {
									local1596 = new Class11_Sub1_Sub3_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, local1636 * Static351.anIntArray423[arg9], local1636 * Static28.anIntArray300[arg9], arg7, arg9 + 4, arg4);
								}
								Static479.method8319(arg1, arg3, arg6, local1596, null);
							} else if (arg7 == 7) {
								local1636 = arg9 + 2 & 0x3;
								if (local213) {
									@Pc(1865) Class11_Sub1_Sub3_Sub1 local1865 = new Class11_Sub1_Sub3_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, 0, 0, arg7, local1636 + 4);
									local1596 = local1865;
									if (local1865.method8330()) {
										local1865.method8327(arg5);
									}
								} else {
									local1596 = new Class11_Sub1_Sub3_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, 0, 0, arg7, local1636 + 4, arg4);
								}
								Static479.method8319(arg1, arg3, arg6, local1596, null);
							} else if (arg7 == 8) {
								local366 = arg9 + 2 & 0x3;
								local426 = 33;
								@Pc(1924) Interface27 local1924 = (Interface27) Static468.method6746(arg1, arg3, arg6);
								if (local1924 != null) {
									local426 = Static619.aClass281_4.method6734(local1924.method8326()).anInt9660 / 2 + 1;
								}
								@Pc(1967) Class11_Sub1_Sub3 local1967;
								@Pc(1986) Class11_Sub1_Sub3 local1986;
								if (local213) {
									local1967 = new Class11_Sub1_Sub3_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, local426 * Static351.anIntArray423[arg9], Static28.anIntArray300[arg9] * local426, arg7, arg9 + 4);
									local1986 = new Class11_Sub1_Sub3_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, 0, 0, arg7, local366 + 4);
									if (local1967.method8330()) {
										local1967.method8327(arg5);
									}
									if (local1986.method8330()) {
										local1986.method8327(arg5);
									}
								} else {
									local1967 = new Class11_Sub1_Sub3_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, Static351.anIntArray423[arg9] * local426, local426 * Static28.anIntArray300[arg9], arg7, arg9 + 4, arg4);
									local1986 = new Class11_Sub1_Sub3_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, 0, 0, arg7, local366 + 4, arg4);
								}
								Static479.method8319(arg1, arg3, arg6, local1967, local1986);
							}
						}
					}
				}
			}
		} else if (Static404.aClass2_Sub13_2.aClass33_Sub17_1.method6029() != 0 || local35.anInt9624 != 0 || local35.anInt9665 == 1 || local35.aBoolean703) {
			@Pc(278) Class11_Sub1_Sub4 local278;
			if (local213) {
				@Pc(294) Class11_Sub1_Sub4_Sub1 local294 = new Class11_Sub1_Sub4_Sub1(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg9, local178);
				if (local294.method8330()) {
					local294.method8327(arg5);
				}
				local278 = local294;
			} else {
				local278 = new Class11_Sub1_Sub4_Sub2(arg5, local35, arg1, arg8, local158, local150, local166, super.aBoolean755, arg9, arg4);
			}
			Static535.method7478(arg1, arg3, arg6, local278);
			if (local35.anInt9665 == 1 && arg0 != null) {
				arg0.method4342(arg6, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIBLclient!ha;IIIILclient!ud;I[I)V")
	public void method8535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class87 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class2_Sub34 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean755) {
			return;
		}
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(19) Class121 local19 = null;
		@Pc(25) int local25 = (arg6 & 0x7) * 8;
		@Pc(31) int local31 = (arg8 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(36) int local36;
						@Pc(70) int local70;
						@Pc(420) int local420;
						@Pc(111) int local111;
						while (arg7.anInt8188 < arg7.aByteArray77.length) {
							local36 = arg7.method6904();
							if (local36 == 0) {
								local19 = new Class121(arg7);
							} else {
								@Pc(251) int local251;
								@Pc(126) int local126;
								@Pc(130) int local130;
								@Pc(169) int local169;
								if (local36 == 1) {
									local70 = arg7.method6904();
									if (local70 > 0) {
										for (local420 = 0; local420 < local70; local420++) {
											@Pc(429) Class93 local429 = new Class93(arg2, arg7, 2);
											if (local429.anInt2927 == 31) {
												@Pc(442) Class230 local442 = Static375.aClass58_1.method1364(arg7.method6884());
												local429.method2517(local442.anInt6614, local442.anInt6615, local442.anInt6612, local442.anInt6611);
											}
											if (arg2.method7953() > 0) {
												@Pc(459) Class2_Sub4 local459 = local429.aClass2_Sub4_3;
												local251 = local459.method8150() >> 9;
												local126 = local459.method8151() >> 9;
												if (arg0 == local429.anInt2922 && local25 <= local251 && local25 + 8 > local251 && local31 <= local126 && local31 + 8 > local126) {
													local130 = (arg4 << 9) + Static587.method8110(arg1, local459.method8150() & 0xFFF, local459.method8151() & 0xFFF);
													local251 = local130 >> 9;
													local169 = Static153.method2909(local459.method8151() & 0xFFF, arg1, local459.method8150() & 0xFFF) + (arg5 << 9);
													local126 = local169 >> 9;
													if (local251 >= 0 && local126 >= 0 && local251 < super.anInt10197 && local126 < super.anInt10198) {
														local459.method8148(super.anIntArrayArrayArray22[arg0][local251][local126] - local459.method8158(), local169, local130);
														Static489.method6998(local429);
													}
												}
											}
										}
									}
								} else if (local36 == 2) {
									if (local19 == null) {
										local19 = new Class121();
									}
									local19.method3080(arg7);
								} else if (local36 != 128) {
									if (local36 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray14 == null) {
										super.aByteArrayArrayArray14 = new byte[4][][];
									}
									for (local70 = 0; local70 < 4; local70++) {
										@Pc(76) byte local76 = arg7.method6908();
										@Pc(115) int local115;
										if (local76 == 0 && super.aByteArrayArrayArray14[arg3] != null) {
											if (arg0 >= local70) {
												local111 = arg4;
												local115 = arg4 + 7;
												local251 = arg5;
												if (arg4 < 0) {
													local111 = 0;
												} else if (arg4 >= super.anInt10197) {
													local111 = super.anInt10197;
												}
												local126 = arg5 + 7;
												if (local115 < 0) {
													local115 = 0;
												} else if (local115 >= super.anInt10197) {
													local115 = super.anInt10197;
												}
												if (arg5 < 0) {
													local251 = 0;
												} else if (super.anInt10198 <= arg5) {
													local251 = super.anInt10198;
												}
												if (local126 < 0) {
													local126 = 0;
												} else if (local126 >= super.anInt10198) {
													local126 = super.anInt10198;
												}
												while (local115 > local111) {
													while (local251 < local126) {
														super.aByteArrayArrayArray14[arg3][local111][local251] = 0;
														local251++;
													}
													local111++;
												}
											}
										} else if (local76 == 1) {
											if (super.aByteArrayArrayArray14[arg3] == null) {
												super.aByteArrayArrayArray14[arg3] = new byte[super.anInt10197 + 1][super.anInt10198 + 1];
											}
											for (local111 = 0; local111 < 64; local111 += 4) {
												for (local115 = 0; local115 < 64; local115 += 4) {
													@Pc(121) byte local121 = arg7.method6908();
													if (local70 <= arg0) {
														for (local126 = local111; local126 < local111 + 4; local126++) {
															for (local130 = local115; local130 < local115 + 4; local130++) {
																if (local25 <= local126 && local126 < local25 + 8 && local130 >= local31 && local31 + 8 > local31) {
																	local169 = arg4 + Static450.method4872(arg1, local126 & 0x7, local130 & 0x7);
																	@Pc(181) int local181 = arg5 + Static371.method5588(local126 & 0x7, local130 & 0x7, arg1);
																	if (local169 >= 0 && local169 < super.anInt10197 && local181 >= 0 && local181 < super.anInt10198) {
																		super.aByteArrayArrayArray14[arg3][local169][local181] = local121;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg9 == null) {
									arg7.anInt8188 += 10;
								} else {
									arg9[0] = arg7.method6884();
									arg9[1] = arg7.method6856();
									arg9[2] = arg7.method6856();
									arg9[3] = arg7.method6856();
									arg9[4] = arg7.method6884();
								}
							}
						}
						if (local19 != null) {
							Static534.method7467(arg5 >> 3, local19, arg4 >> 3);
						}
						if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg3] != null) {
							local36 = arg4 + 7;
							local70 = arg5 + 7;
							for (local420 = arg4; local420 < local36; local420++) {
								for (local111 = arg5; local111 < local70; local111++) {
									super.aByteArrayArrayArray14[arg3][local420][local111] = 0;
								}
							}
						}
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[BB[Lclient!jn;Lclient!ha;I)V")
	public void method8536(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class179[] arg2, @OriginalArg(4) Class87 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub34 local10 = new Class2_Sub34(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method6866();
			if (local24 == 0) {
				return;
			}
			local12 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local10.method6863();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local10.method6904();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(77) int local77 = arg4 + local57;
				@Pc(81) int local81 = arg0 + local51;
				if (local77 > 0 && local81 > 0 && local77 < super.anInt10197 - 1 && local81 < super.anInt10198 - 1) {
					@Pc(102) Class179 local102 = null;
					if (!super.aBoolean755) {
						@Pc(107) int local107 = local61;
						if ((Static244.aByteArrayArrayArray9[1][local77][local81] & 0x2) == 2) {
							local107 = local61 - 1;
						}
						if (local107 >= 0) {
							local102 = arg2[local107];
						}
					}
					this.method8534(local102, local61, local12, local77, -1, arg3, local81, local69, local61, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLclient!ha;I)V")
	public void method8537(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class87 arg1) {
		Static12.method284();
		if (!arg0) {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if (super.anInt10205 > 1) {
				for (local14 = 0; local14 < super.anInt10197; local14++) {
					for (local18 = 0; super.anInt10198 > local18; local18++) {
						if ((Static244.aByteArrayArrayArray9[1][local14][local18] & 0x2) == 2) {
							Static641.method8575(local14, local18);
						}
					}
				}
			}
			for (local14 = 0; local14 < super.anInt10205; local14++) {
				for (local18 = 0; super.anInt10198 >= local18; local18++) {
					for (@Pc(60) int local60 = 0; super.anInt10197 >= local60; local60++) {
						if ((super.aByteArrayArrayArray13[local14][local60][local18] & 0x4) != 0) {
							@Pc(75) int local75 = local60;
							@Pc(77) int local77 = local60;
							@Pc(79) int local79 = local18;
							@Pc(81) int local81 = local18;
							while (local79 > 0 && (super.aByteArrayArrayArray13[local14][local60][local79 - 1] & 0x4) != 0 && local18 - local79 < 10) {
								local79--;
							}
							while (local81 < super.anInt10198 && (super.aByteArrayArrayArray13[local14][local60][local81 + 1] & 0x4) != 0 && local81 - local79 < 10) {
								local81++;
							}
							@Pc(145) int local145;
							label111: while (local75 > 0 && local60 - local75 < 10) {
								for (local145 = local79; local145 <= local81; local145++) {
									if ((super.aByteArrayArrayArray13[local14][local75 - 1][local145] & 0x4) == 0) {
										break label111;
									}
								}
								local75--;
							}
							label98: while (super.anInt10197 > local77 && local77 - local75 < 10) {
								for (local145 = local79; local145 <= local81; local145++) {
									if ((super.aByteArrayArrayArray13[local14][local77 + 1][local145] & 0x4) == 0) {
										break label98;
									}
								}
								local77++;
							}
							if ((local81 + 1 - local79) * (local77 + -local75 + 1) >= 4) {
								local145 = super.anIntArrayArrayArray22[local14][local75][local79];
								Static82.method1526((local81 << 9) + 512, local145, local75 << 9, local145, local79 << 9, (local77 << 9) + 512, local14);
								for (@Pc(262) int local262 = local75; local262 <= local77; local262++) {
									for (@Pc(266) int local266 = local79; local266 <= local81; local266++) {
										super.aByteArrayArrayArray13[local14][local262][local266] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static195.method7903();
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II[BIIILclient!ha;I[Lclient!jn;II)V")
	public void method8538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class87 arg6, @OriginalArg(8) Class179[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(8) Class2_Sub34 local8 = new Class2_Sub34(arg2);
		@Pc(10) int local10 = -1;
		while (true) {
			@Pc(14) int local14 = local8.method6866();
			if (local14 == 0) {
				return;
			}
			local10 += local14;
			@Pc(25) int local25 = 0;
			while (true) {
				@Pc(29) int local29 = local8.method6863();
				if (local29 == 0) {
					break;
				}
				local25 += local29 - 1;
				@Pc(44) int local44 = local25 & 0x3F;
				@Pc(50) int local50 = local25 >> 6 & 0x3F;
				@Pc(54) int local54 = local25 >> 12;
				@Pc(58) int local58 = local8.method6904();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (arg8 == local54 && local50 >= arg0 && local50 < arg0 + 8 && local44 >= arg1 && arg1 + 8 > local44) {
					@Pc(104) Class350 local104 = Static619.aClass281_4.method6734(local10);
					@Pc(121) int local121 = Static626.method8466(local50 & 0x7, arg4, local44 & 0x7, local66, local104.anInt9662, local104.anInt9622) + arg3;
					@Pc(138) int local138 = Static68.method1283(local104.anInt9622, local44 & 0x7, arg4, local66, local50 & 0x7, local104.anInt9662) + arg9;
					if (local121 > 0 && local138 > 0 && super.anInt10197 - 1 > local121 && local138 < super.anInt10198 - 1) {
						@Pc(159) Class179 local159 = null;
						if (!super.aBoolean755) {
							@Pc(164) int local164 = arg5;
							if ((Static244.aByteArrayArrayArray9[1][local121][local138] & 0x2) == 2) {
								local164 = arg5 - 1;
							}
							if (local164 >= 0) {
								local159 = arg7[local164];
							}
						}
						this.method8534(local159, arg5, local10, local121, -1, arg6, local138, local62, arg5, local66 + arg4 & 0x3);
					}
				}
			}
		}
	}
}
