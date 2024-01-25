import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class199_Sub1 extends Class199 {

	@OriginalMember(owner = "client!jm", name = "V", descriptor = "I")
	public int anInt4700 = 99;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(IIIZ)V")
	public Class199_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static433.aClass231_36, Static101.aClass100_12);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIIIIILclient!ha;Lclient!lka;)V")
	public void method4274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class145 arg8, @OriginalArg(10) Class226 arg9) {
		if (Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 0 && !Static208.method4773(arg4, arg7, arg1, Static597.anInt9295)) {
			return;
		}
		if (this.anInt4700 > arg3) {
			this.anInt4700 = arg3;
		}
		@Pc(44) Class81 local44 = Static148.aClass153_3.method3342(arg0);
		if (Static650.aClass2_Sub30_29.aClass11_Sub4_1.method1189() == 0 && local44.aBoolean211) {
			return;
		}
		@Pc(69) int local69;
		@Pc(72) int local72;
		if (arg6 == 1 || arg6 == 3) {
			local72 = local44.anInt1902;
			local69 = local44.anInt1881;
		} else {
			local69 = local44.anInt1902;
			local72 = local44.anInt1881;
		}
		@Pc(101) int local101;
		@Pc(95) int local95;
		if (super.anInt4687 >= arg7 + local69) {
			local95 = arg7 + (local69 + 1 >> 1);
			local101 = (local69 >> 1) + arg7;
		} else {
			local101 = arg7;
			local95 = arg7 + 1;
		}
		@Pc(126) int local126;
		@Pc(124) int local124;
		if (local72 + arg4 > super.anInt4695) {
			local124 = arg4 + 1;
			local126 = arg4;
		} else {
			local124 = (local72 + 1 >> 1) + arg4;
			local126 = (local72 >> 1) + arg4;
		}
		@Pc(146) Class133 local146 = Static158.aClass133Array4[arg1];
		@Pc(178) int local178 = local146.method8217(local101, local126) + local146.method8217(local95, local126) + local146.method8217(local101, local124) + local146.method8217(local95, local124) >> 2;
		@Pc(187) int local187 = (arg7 << 9) + (local69 << 8);
		@Pc(196) int local196 = (arg4 << 9) + (local72 << 8);
		@Pc(213) boolean local213 = Static620.aBoolean886 && !super.aBoolean406 && local44.aBoolean210;
		if (local44.method1625()) {
			Static255.method3624(arg4, (Class4_Sub2_Sub1_Sub2_Sub1) null, arg6, (Class4_Sub2_Sub1_Sub2_Sub2) null, local44, arg7, arg3);
		}
		@Pc(259) boolean local259 = arg5 == -1 && !local44.method1636() && local44.anIntArray143 == null && !local44.aBoolean217 && !local44.aBoolean218;
		if (Static515.aBoolean709 && (Static478.method6877(arg2) && local44.anInt1899 != 1 || !(!Static411.method6031(arg2) || local44.anInt1899 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(436) Class4_Sub2_Sub1 local436;
			@Pc(399) Class4_Sub2_Sub1_Sub4 local399;
			@Pc(434) int local434;
			@Pc(505) int local505;
			if (arg2 == 10 || arg2 == 11) {
				local399 = null;
				if (local259) {
					@Pc(430) Class4_Sub2_Sub1_Sub4 local430 = new Class4_Sub2_Sub1_Sub4(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg7, local69 + arg7 - 1, arg4, arg4 + local72 - 1, arg2, arg6, local213);
					local434 = local430.method8288();
					local436 = local430;
					local399 = local430;
				} else {
					local434 = 15;
					local436 = new Class4_Sub2_Sub1_Sub5(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg7, local69 + arg7 - 1, arg4, arg4 + local72 - 1, arg2, arg6, arg5);
				}
				if (Static432.method6282(local436, false)) {
					if (local399 != null && local399.method8990((byte) -73)) {
						local399.method8989(arg8, 25054);
					}
					if (local44.aBoolean214 && Static620.aBoolean886) {
						if (local434 > 30) {
							local434 = 30;
						}
						for (local505 = 0; local505 <= local69; local505++) {
							for (@Pc(509) int local509 = 0; local509 <= local72; local509++) {
								local146.ka(arg7 + local505, arg4 + local509, local434);
							}
						}
					}
				}
				if (local44.anInt1893 != 0 && arg9 != null) {
					arg9.method5270(local44.aBoolean216, local69, local72, arg7, arg4, !local44.aBoolean223);
				}
			} else if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
				if (local259) {
					local399 = new Class4_Sub2_Sub1_Sub4(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg7, arg7 + local69 - 1, arg4, arg4 + local72 - 1, arg2, arg6, local213);
					local436 = local399;
					if (local399.method8990((byte) -73)) {
						local399.method8989(arg8, 25054);
					}
				} else {
					local436 = new Class4_Sub2_Sub1_Sub5(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg7, local69 + arg7 - 1, arg4, local72 + arg4 - 1, arg2, arg6, arg5);
				}
				Static432.method6282(local436, false);
				if (Static620.aBoolean886 && !super.aBoolean406 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg3 > 0 && local44.anInt1899 != 0) {
					super.aByteArrayArrayArray14[arg3][arg7][arg4] = (byte) (super.aByteArrayArrayArray14[arg3][arg7][arg4] | 0x4);
				}
				if (local44.anInt1893 != 0 && arg9 != null) {
					arg9.method5270(local44.aBoolean216, local69, local72, arg7, arg4, !local44.aBoolean223);
				}
			} else {
				@Pc(814) Class4_Sub2_Sub3 local814;
				if (arg2 == 0) {
					@Pc(772) int local772 = local44.anInt1899;
					if (Static335.aBoolean439 && local44.anInt1899 == -1) {
						local772 = 1;
					}
					if (local259) {
						@Pc(800) Class4_Sub2_Sub3_Sub1 local800 = new Class4_Sub2_Sub3_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6, local213);
						if (local800.method8990((byte) -73)) {
							local800.method8989(arg8, 25054);
						}
						local814 = local800;
					} else {
						local814 = new Class4_Sub2_Sub3_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6, arg5);
					}
					Static136.method1982(arg3, arg7, arg4, local814, (Class4_Sub2_Sub3) null);
					if (arg6 == 0) {
						if (Static620.aBoolean886 && local44.aBoolean214) {
							local146.ka(arg7, arg4, 50);
							local146.ka(arg7, arg4 + 1, 50);
						}
						if (local772 == 1 && !super.aBoolean406) {
							Static694.method9346(1, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7);
						}
					} else if (arg6 == 1) {
						if (Static620.aBoolean886 && local44.aBoolean214) {
							local146.ka(arg7, arg4 + 1, 50);
							local146.ka(arg7 + 1, arg4 - -1, 50);
						}
						if (local772 == 1 && !super.aBoolean406) {
							Static694.method9346(2, arg4 + 1, -local44.anInt1868, local44.anInt1884, arg3, arg7);
						}
					} else if (arg6 == 2) {
						if (Static620.aBoolean886 && local44.aBoolean214) {
							local146.ka(arg7 + 1, arg4, 50);
							local146.ka(arg7 + 1, arg4 + 1, 50);
						}
						if (local772 == 1 && !super.aBoolean406) {
							Static694.method9346(1, arg4, -local44.anInt1868, local44.anInt1884, arg3, arg7 + 1);
						}
					} else if (arg6 == 3) {
						if (Static620.aBoolean886 && local44.aBoolean214) {
							local146.ka(arg7, arg4, 50);
							local146.ka(arg7 + 1, arg4, 50);
						}
						if (local772 == 1 && !super.aBoolean406) {
							Static694.method9346(2, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7);
						}
					}
					if (local44.anInt1893 != 0 && arg9 != null) {
						arg9.method5284(arg6, arg7, !local44.aBoolean223, arg2, arg4, local44.aBoolean216);
					}
					if (local44.anInt1879 != 64) {
						Static82.method1229(arg3, arg7, arg4, local44.anInt1879);
					}
				} else {
					@Pc(1135) Class4_Sub2_Sub3 local1135;
					@Pc(1123) Class4_Sub2_Sub3_Sub1 local1123;
					if (arg2 == 1) {
						if (local259) {
							local1123 = new Class4_Sub2_Sub3_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6, local213);
							if (local1123.method8990((byte) -73)) {
								local1123.method8989(arg8, 25054);
							}
							local1135 = local1123;
						} else {
							local1135 = new Class4_Sub2_Sub3_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6, arg5);
						}
						Static136.method1982(arg3, arg7, arg4, local1135, (Class4_Sub2_Sub3) null);
						if (local44.aBoolean214 && Static620.aBoolean886) {
							if (arg6 == 0) {
								local146.ka(arg7, arg4 + 1, 50);
							} else if (arg6 == 1) {
								local146.ka(arg7 + 1, arg4 + 1, 50);
							} else if (arg6 == 2) {
								local146.ka(arg7 + 1, arg4, 50);
							} else if (arg6 == 3) {
								local146.ka(arg7, arg4, 50);
							}
						}
						if (local44.anInt1893 != 0 && arg9 != null) {
							arg9.method5284(arg6, arg7, !local44.aBoolean223, arg2, arg4, local44.aBoolean216);
						}
					} else if (arg2 == 2) {
						local434 = arg6 + 1 & 0x3;
						if (local259) {
							@Pc(1327) Class4_Sub2_Sub3_Sub1 local1327 = new Class4_Sub2_Sub3_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6 + 4, local213);
							@Pc(1343) Class4_Sub2_Sub3_Sub1 local1343 = new Class4_Sub2_Sub3_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, local434, local213);
							if (local1327.method8990((byte) -73)) {
								local1327.method8989(arg8, 25054);
							}
							if (local1343.method8990((byte) -73)) {
								local1343.method8989(arg8, 25054);
							}
							local814 = local1343;
							local1135 = local1327;
						} else {
							local1135 = new Class4_Sub2_Sub3_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6 + 4, arg5);
							local814 = new Class4_Sub2_Sub3_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, local434, arg5);
						}
						Static136.method1982(arg3, arg7, arg4, local1135, local814);
						if ((local44.anInt1899 == 1 || Static335.aBoolean439 && local44.anInt1899 == -1) && !super.aBoolean406) {
							if (arg6 == 0) {
								Static694.method9346(1, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7);
								Static694.method9346(2, arg4 + 1, local44.anInt1868, local44.anInt1884, arg3, arg7);
							} else if (arg6 == 1) {
								Static694.method9346(1, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7 + 1);
								Static694.method9346(2, arg4 + 1, local44.anInt1868, local44.anInt1884, arg3, arg7);
							} else if (arg6 == 2) {
								Static694.method9346(1, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7 + 1);
								Static694.method9346(2, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7);
							} else if (arg6 == 3) {
								Static694.method9346(1, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7);
								Static694.method9346(2, arg4, local44.anInt1868, local44.anInt1884, arg3, arg7);
							}
						}
						if (local44.anInt1893 != 0 && arg9 != null) {
							arg9.method5284(arg6, arg7, !local44.aBoolean223, arg2, arg4, local44.aBoolean216);
						}
						if (local44.anInt1879 != 64) {
							Static82.method1229(arg3, arg7, arg4, local44.anInt1879);
						}
					} else if (arg2 == 3) {
						if (local259) {
							local1123 = new Class4_Sub2_Sub3_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6, local213);
							local1135 = local1123;
							if (local1123.method8990((byte) -73)) {
								local1123.method8989(arg8, 25054);
							}
						} else {
							local1135 = new Class4_Sub2_Sub3_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg2, arg6, arg5);
						}
						Static136.method1982(arg3, arg7, arg4, local1135, (Class4_Sub2_Sub3) null);
						if (local44.aBoolean214 && Static620.aBoolean886) {
							if (arg6 == 0) {
								local146.ka(arg7, arg4 + 1, 50);
							} else if (arg6 == 1) {
								local146.ka(arg7 + 1, arg4 + 1, 50);
							} else if (arg6 == 2) {
								local146.ka(arg7 + 1, arg4, 50);
							} else if (arg6 == 3) {
								local146.ka(arg7, arg4, 50);
							}
						}
						if (local44.anInt1893 != 0 && arg9 != null) {
							arg9.method5284(arg6, arg7, !local44.aBoolean223, arg2, arg4, local44.aBoolean216);
						}
					} else if (arg2 == 9) {
						if (local259) {
							local399 = new Class4_Sub2_Sub1_Sub4(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg7, arg7, arg4, arg4, arg2, arg6, local213);
							if (local399.method8990((byte) -73)) {
								local399.method8989(arg8, 25054);
							}
							local436 = local399;
						} else {
							local436 = new Class4_Sub2_Sub1_Sub5(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg7, local69 + arg7 - 1, arg4, local72 + arg4 - 1, arg2, arg6, arg5);
						}
						Static432.method6282(local436, false);
						if (local44.anInt1899 == 1 && !super.aBoolean406) {
							@Pc(1814) byte local1814;
							if ((arg6 & 0x1) == 0) {
								local1814 = 8;
							} else {
								local1814 = 16;
							}
							Static694.method9346(local1814, arg4, 0, local44.anInt1884, arg3, arg7);
						}
						if (local44.anInt1893 != 0 && arg9 != null) {
							arg9.method5270(local44.aBoolean216, local69, local72, arg7, arg4, !local44.aBoolean223);
						}
						if (local44.anInt1879 != 64) {
							Static82.method1229(arg3, arg7, arg4, local44.anInt1879);
						}
					} else {
						@Pc(1899) Class4_Sub2_Sub4 local1899;
						if (arg2 == 4) {
							if (local259) {
								@Pc(1918) Class4_Sub2_Sub4_Sub2 local1918 = new Class4_Sub2_Sub4_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, 0, 0, arg2, arg6);
								if (local1918.method8990((byte) -73)) {
									local1918.method8989(arg8, 25054);
								}
								local1899 = local1918;
							} else {
								local1899 = new Class4_Sub2_Sub4_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, 0, 0, arg2, arg6, arg5);
							}
							Static268.method3773(arg3, arg7, arg4, local1899, (Class4_Sub2_Sub4) null);
						} else {
							@Pc(1942) int local1942;
							@Pc(1948) Interface25 local1948;
							@Pc(1987) Class4_Sub2_Sub4_Sub2 local1987;
							if (arg2 == 5) {
								local1942 = 65;
								local1948 = (Interface25) Static91.method1414(arg3, arg7, arg4);
								if (local1948 != null) {
									local1942 = Static148.aClass153_3.method3342(local1948.method8986()).anInt1879 + 1;
								}
								if (local259) {
									local1987 = new Class4_Sub2_Sub4_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, local1942 * Static287.anIntArray324[arg6], local1942 * Static604.anIntArray685[arg6], arg2, arg6);
									local1899 = local1987;
									if (local1987.method8990((byte) -73)) {
										local1987.method8989(arg8, 25054);
									}
								} else {
									local1899 = new Class4_Sub2_Sub4_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, local1942 * Static287.anIntArray324[arg6], local1942 * Static604.anIntArray685[arg6], arg2, arg6, arg5);
								}
								Static268.method3773(arg3, arg7, arg4, local1899, (Class4_Sub2_Sub4) null);
							} else if (arg2 == 6) {
								local1942 = 33;
								local1948 = (Interface25) Static91.method1414(arg3, arg7, arg4);
								if (local1948 != null) {
									local1942 = Static148.aClass153_3.method3342(local1948.method8986()).anInt1879 / 2 + 1;
								}
								if (local259) {
									local1987 = new Class4_Sub2_Sub4_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, local1942 * Static287.anIntArray324[arg6], local1942 * Static604.anIntArray685[arg6], arg2, arg6 + 4);
									if (local1987.method8990((byte) -73)) {
										local1987.method8989(arg8, 25054);
									}
									local1899 = local1987;
								} else {
									local1899 = new Class4_Sub2_Sub4_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, local1942 * Static727.anIntArray767[arg6], Static230.anIntArray282[arg6] * local1942, arg2, arg6 + 4, arg5);
								}
								Static268.method3773(arg3, arg7, arg4, local1899, (Class4_Sub2_Sub4) null);
							} else if (arg2 == 7) {
								local1942 = arg6 + 2 & 0x3;
								if (local259) {
									@Pc(2173) Class4_Sub2_Sub4_Sub2 local2173 = new Class4_Sub2_Sub4_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, 0, 0, arg2, local1942 + 4);
									local1899 = local2173;
									if (local2173.method8990((byte) -73)) {
										local2173.method8989(arg8, 25054);
									}
								} else {
									local1899 = new Class4_Sub2_Sub4_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, 0, 0, arg2, local1942 + 4, arg5);
								}
								Static268.method3773(arg3, arg7, arg4, local1899, (Class4_Sub2_Sub4) null);
							} else if (arg2 == 8) {
								local434 = arg6 + 2 & 0x3;
								local505 = 33;
								@Pc(2231) Interface25 local2231 = (Interface25) Static91.method1414(arg3, arg7, arg4);
								if (local2231 != null) {
									local505 = Static148.aClass153_3.method3342(local2231.method8986()).anInt1879 / 2 + 1;
								}
								@Pc(2277) Class4_Sub2_Sub4 local2277;
								@Pc(2299) Class4_Sub2_Sub4 local2299;
								if (local259) {
									local2277 = new Class4_Sub2_Sub4_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, local505 * Static727.anIntArray767[arg6], Static230.anIntArray282[arg6] * local505, arg2, arg6 + 4);
									local2299 = new Class4_Sub2_Sub4_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, 0, 0, arg2, local434 + 4);
									if (local2277.method8990((byte) -73)) {
										local2277.method8989(arg8, 25054);
									}
									if (local2299.method8990((byte) -73)) {
										local2299.method8989(arg8, 25054);
									}
								} else {
									local2277 = new Class4_Sub2_Sub4_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, local505 * Static727.anIntArray767[arg6], Static230.anIntArray282[arg6] * local505, arg2, arg6 + 4, arg5);
									local2299 = new Class4_Sub2_Sub4_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, 0, 0, arg2, local434 + 4, arg5);
								}
								Static268.method3773(arg3, arg7, arg4, local2277, local2299);
							}
						}
					}
				}
			}
		} else if (Static650.aClass2_Sub30_29.aClass11_Sub25_1.method7993() != 0 || local44.anInt1873 != 0 || local44.anInt1893 == 1 || local44.aBoolean222) {
			@Pc(349) Class4_Sub2_Sub2 local349;
			if (local259) {
				@Pc(337) Class4_Sub2_Sub2_Sub1 local337 = new Class4_Sub2_Sub2_Sub1(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg6, local213);
				if (local337.method8990((byte) -73)) {
					local337.method8989(arg8, 25054);
				}
				local349 = local337;
			} else {
				local349 = new Class4_Sub2_Sub2_Sub2(arg8, local44, arg3, arg1, local187, local178, local196, super.aBoolean406, arg6, arg5);
			}
			Static376.method5448(arg3, arg7, arg4, local349);
			if (local44.anInt1893 == 1 && arg9 != null) {
				arg9.method5278(arg4, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IIIII)Lclient!vi;")
	public Interface25 method4275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Interface25 local12 = null;
		if (arg3 == 0) {
			local12 = (Interface25) Static91.method1414(arg0, arg1, arg2);
		}
		if (arg3 == 1) {
			local12 = (Interface25) Static366.method5263(arg0, arg1, arg2);
		}
		if (arg3 == 2) {
			local12 = (Interface25) Static140.method2072(arg0, arg1, arg2, Static307.aClass27 == null ? (Static307.aClass27 = a("vi")) : Static307.aClass27);
		}
		if (arg3 == 3) {
			local12 = (Interface25) Static441.method6382(arg0, arg1, arg2);
		}
		return local12;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!ha;Z)V")
	public void method4276(@OriginalArg(1) Class145 arg0, @OriginalArg(2) boolean arg1) {
		Static66.method998();
		if (!arg1) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			if (super.anInt4694 > 1) {
				for (local16 = 0; super.anInt4687 > local16; local16++) {
					for (local20 = 0; super.anInt4695 > local20; local20++) {
						if ((Static392.aByteArrayArrayArray16[1][local16][local20] & 0x2) == 2) {
							Static77.method1190(local16, local20);
						}
					}
				}
			}
			for (local16 = 0; local16 < super.anInt4694; local16++) {
				for (local20 = 0; super.anInt4695 >= local20; local20++) {
					for (@Pc(74) int local74 = 0; super.anInt4687 >= local74; local74++) {
						if ((super.aByteArrayArrayArray14[local16][local74][local20] & 0x4) != 0) {
							@Pc(91) int local91 = local74;
							@Pc(93) int local93 = local74;
							@Pc(95) int local95 = local20;
							@Pc(97) int local97 = local20;
							while (local95 > 0 && (super.aByteArrayArrayArray14[local16][local74][local95 - 1] & 0x4) != 0 && local20 - local95 < 10) {
								local95--;
							}
							while (super.anInt4695 > local97 && (super.aByteArrayArrayArray14[local16][local74][local97 + 1] & 0x4) != 0 && local97 - local95 < 10) {
								local97++;
							}
							@Pc(180) int local180;
							label111: while (local91 > 0 && local74 - local91 < 10) {
								for (local180 = local95; local180 <= local97; local180++) {
									if ((super.aByteArrayArrayArray14[local16][local91 - 1][local180] & 0x4) == 0) {
										break label111;
									}
								}
								local91--;
							}
							label98: while (super.anInt4687 > local93 && local93 - local91 < 10) {
								for (local180 = local95; local180 <= local97; local180++) {
									if ((super.aByteArrayArrayArray14[local16][local93 + 1][local180] & 0x4) == 0) {
										break label98;
									}
								}
								local93++;
							}
							if ((local97 + 1 - local95) * (local93 + 1 - local91) >= 4) {
								local180 = super.anIntArrayArrayArray17[local16][local91][local95];
								Static468.method6727(local16, local95 << 9, local180, (local93 << 9) + 512, (local97 << 9) + 512, local180, local91 << 9);
								for (@Pc(332) int local332 = local91; local332 <= local93; local332++) {
									for (@Pc(336) int local336 = local95; local336 <= local97; local336++) {
										super.aByteArrayArrayArray14[local16][local332][local336] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static605.method8286();
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIILclient!et;Lclient!ha;IB)V")
	public void method4278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub20 arg6, @OriginalArg(7) Class145 arg7, @OriginalArg(8) int arg8) {
		if (super.aBoolean406) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) Class264 local19 = null;
		@Pc(25) int local25 = (arg0 & 0x7) * 8;
		@Pc(31) int local31 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(110) int local110;
			@Pc(132) int local132;
			@Pc(477) int local477;
			while (arg6.anInt9723 < arg6.aByteArray111.length) {
				local36 = arg6.method8581(-17416);
				if (local36 != 0) {
					@Pc(198) int local198;
					@Pc(306) int local306;
					@Pc(356) int local356;
					@Pc(138) int local138;
					if (local36 == 1) {
						local110 = arg6.method8581(-17416);
						if (local110 > 0) {
							for (local477 = 0; local477 < local110; local477++) {
								@Pc(488) Class248 local488 = new Class248(arg7, arg6, 2);
								if (local488.anInt6690 == 31) {
									@Pc(499) Class12 local499 = Static298.aClass266_1.method6368(arg6.method8575());
									local488.method6009(local499.anInt234, local499.anInt229, local499.anInt230, local499.anInt235);
								}
								if (arg7.method9694() > 0) {
									@Pc(516) Class2_Sub7 local516 = local488.aClass2_Sub7_3;
									local138 = local516.method8171() >> 9;
									local198 = local516.method8172() >> 9;
									if (arg8 == local488.anInt6688 && local25 <= local138 && local25 + 8 > local138 && local198 >= local31 && local31 + 8 > local198) {
										local306 = Static571.method7939(local516.method8172() & 0xFFF, arg2, local516.method8171() & 0xFFF) + (arg1 << 9);
										local356 = Static43.method586(local516.method8171() & 0xFFF, arg2, local516.method8172() & 0xFFF) + (arg3 << 9);
										local138 = local306 >> 9;
										local198 = local356 >> 9;
										if (local138 >= 0 && local198 >= 0 && local138 < super.anInt4687 && super.anInt4695 > local198) {
											local516.method8165(local356, local306, super.anIntArrayArrayArray17[arg8][local138][local198] - local516.method8174());
											Static561.method7807(local488);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local19 == null) {
							local19 = new Class264();
						}
						local19.method6284(arg6);
					} else if (local36 == 128) {
						if (local19 == null) {
							local19 = new Class264();
						}
						local19.method6287(arg6);
					} else if (local36 == 129) {
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local110 = 0; local110 < 4; local110++) {
							@Pc(116) byte local116 = arg6.method8536();
							@Pc(136) int local136;
							if (local116 == 0 && super.aByteArrayArrayArray15[arg5] != null) {
								if (arg8 >= local110) {
									local132 = arg1;
									local136 = arg1 + 7;
									local138 = arg3;
									if (arg3 < 0) {
										local138 = 0;
									} else if (arg3 >= super.anInt4695) {
										local138 = super.anInt4695;
									}
									if (arg1 < 0) {
										local132 = 0;
									} else if (arg1 >= super.anInt4687) {
										local132 = super.anInt4687;
									}
									if (local136 < 0) {
										local136 = 0;
									} else if (super.anInt4687 <= local136) {
										local136 = super.anInt4687;
									}
									local198 = arg3 + 7;
									if (local198 < 0) {
										local198 = 0;
									} else if (super.anInt4695 <= local198) {
										local198 = super.anInt4695;
									}
									while (local132 < local136) {
										while (local198 > local138) {
											super.aByteArrayArrayArray15[arg5][local132][local138] = 0;
											local138++;
										}
										local132++;
									}
								}
							} else if (local116 == 1) {
								if (super.aByteArrayArrayArray15[arg5] == null) {
									super.aByteArrayArrayArray15[arg5] = new byte[super.anInt4687 + 1][super.anInt4695 + 1];
								}
								for (local132 = 0; local132 < 64; local132 += 4) {
									for (local136 = 0; local136 < 64; local136 += 4) {
										@Pc(293) byte local293 = arg6.method8536();
										if (local110 <= arg8) {
											for (local198 = local132; local198 < local132 + 4; local198++) {
												for (local306 = local136; local306 < local136 + 4; local306++) {
													if (local198 >= local25 && local25 + 8 > local198 && local31 <= local306 && local306 < local31 + 8) {
														local356 = Static683.method9206(local198 & 0x7, local306 & 0x7, arg2) + arg1;
														@Pc(368) int local368 = Static666.method9085(local198 & 0x7, arg2, local306 & 0x7) + arg3;
														if (local356 >= 0 && super.anInt4687 > local356 && local368 >= 0 && super.anInt4695 > local368) {
															super.aByteArrayArrayArray15[arg5][local356][local368] = local293;
															local17 = true;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else {
						throw new IllegalStateException("");
					}
				} else if (local19 == null) {
					local19 = new Class264(arg6);
				} else {
					local19.method6283(arg6);
				}
			}
			if (local19 != null) {
				Static208.method4775(arg1 >> 3, arg3 >> 3, local19);
			}
			if (!local17 && super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg5] != null) {
				local36 = arg1 + 7;
				local110 = arg3 + 7;
				for (local477 = arg1; local477 < local36; local477++) {
					for (local132 = arg3; local132 < local110; local132++) {
						super.aByteArrayArrayArray15[arg5][local477][local132] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!et;ILclient!ha;)V")
	public void method4279(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class145 arg3) {
		if (super.aBoolean406) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(14) Class264 local14 = null;
		while (true) {
			@Pc(35) int local35;
			@Pc(87) int local87;
			@Pc(95) int local95;
			@Pc(99) int local99;
			@Pc(39) int local39;
			label308: do {
				while (true) {
					@Pc(19) int local19;
					@Pc(255) int local255;
					@Pc(259) int local259;
					while (arg1.aByteArray111.length > arg1.anInt9723) {
						local19 = arg1.method8581(-17416);
						if (local19 != 0) {
							if (local19 == 1) {
								local35 = arg1.method8581(-17416);
								continue label308;
							}
							if (local19 == 2) {
								if (local14 == null) {
									local14 = new Class264();
								}
								local14.method6284(arg1);
							} else if (local19 == 128) {
								if (local14 == null) {
									local14 = new Class264();
								}
								local14.method6287(arg1);
							} else if (local19 == 129) {
								if (super.aByteArrayArrayArray15 == null) {
									super.aByteArrayArrayArray15 = new byte[4][][];
								}
								local12 = true;
								for (local35 = 0; local35 < 4; local35++) {
									@Pc(215) byte local215 = arg1.method8536();
									if (local215 == 0 && super.aByteArrayArrayArray15[local35] != null) {
										local255 = arg0;
										local259 = arg0 + 64;
										local87 = arg2;
										if (local259 < 0) {
											local259 = 0;
										} else if (super.anInt4687 <= local259) {
											local259 = super.anInt4687;
										}
										local95 = arg2 + 64;
										if (arg0 < 0) {
											local255 = 0;
										} else if (arg0 >= super.anInt4687) {
											local255 = super.anInt4687;
										}
										if (arg2 < 0) {
											local87 = 0;
										} else if (super.anInt4695 <= arg2) {
											local87 = super.anInt4695;
										}
										if (local95 < 0) {
											local95 = 0;
										} else if (local95 >= super.anInt4695) {
											local95 = super.anInt4695;
										}
										while (local259 > local255) {
											while (local87 < local95) {
												super.aByteArrayArrayArray15[local35][local255][local87] = 0;
												local87++;
											}
											local255++;
										}
									} else if (local215 == 1) {
										if (super.aByteArrayArrayArray15[local35] == null) {
											super.aByteArrayArrayArray15[local35] = new byte[super.anInt4687 + 1][super.anInt4695 + 1];
										}
										for (local255 = 0; local255 < 64; local255 += 4) {
											for (local259 = 0; local259 < 64; local259 += 4) {
												@Pc(267) byte local267 = arg1.method8536();
												for (local95 = local255 + arg0; local95 < local255 + arg0 + 4; local95++) {
													for (local99 = arg2 + local259; local99 < arg2 + local259 + 4; local99++) {
														if (local95 >= 0 && super.anInt4687 > local95 && local99 >= 0 && local99 < super.anInt4695) {
															super.aByteArrayArrayArray15[local35][local95][local99] = local267;
														}
													}
												}
											}
										}
									} else if (local215 == 2) {
										if (super.aByteArrayArrayArray15[local35] == null) {
											super.aByteArrayArrayArray15[local35] = new byte[super.anInt4687 + 1][super.anInt4695 + 1];
										}
										if (local35 > 0) {
											local255 = arg0;
											local259 = arg0 + 64;
											local87 = arg2;
											local95 = arg2 + 64;
											if (arg2 < 0) {
												local87 = 0;
											} else if (arg2 >= super.anInt4695) {
												local87 = super.anInt4695;
											}
											if (local259 < 0) {
												local259 = 0;
											} else if (local259 >= super.anInt4687) {
												local259 = super.anInt4687;
											}
											if (arg0 < 0) {
												local255 = 0;
											} else if (arg0 >= super.anInt4687) {
												local255 = super.anInt4687;
											}
											if (local95 < 0) {
												local95 = 0;
											} else if (super.anInt4695 <= local95) {
												local95 = super.anInt4695;
											}
											while (local255 < local259) {
												while (local87 < local95) {
													super.aByteArrayArrayArray15[local35][local255][local87] = super.aByteArrayArrayArray15[local35 - 1][local255][local87];
													local87++;
												}
												local255++;
											}
										}
									}
								}
							} else {
								throw new IllegalStateException("");
							}
						} else if (local14 == null) {
							local14 = new Class264(arg1);
						} else {
							local14.method6283(arg1);
						}
					}
					if (local14 != null) {
						for (local19 = 0; local19 < 8; local19++) {
							for (local35 = 0; local35 < 8; local35++) {
								local39 = (arg0 >> 3) + local19;
								local255 = local35 + (arg2 >> 3);
								if (local39 >= 0 && local39 < super.anInt4687 >> 3 && local255 >= 0 && super.anInt4695 >> 3 > local255) {
									Static208.method4775(local39, local255, local14);
								}
							}
						}
					}
					if (!local12 && super.aByteArrayArrayArray15 != null) {
						for (local19 = 0; local19 < 4; local19++) {
							if (super.aByteArrayArrayArray15[local19] != null) {
								for (local35 = 0; local35 < 16; local35++) {
									for (local39 = 0; local39 < 16; local39++) {
										local255 = (arg0 >> 2) + local35;
										local259 = (arg2 >> 2) + local39;
										if (local255 >= 0 && local255 < 26 && local259 >= 0 && local259 < 26) {
											super.aByteArrayArrayArray15[local19][local255][local259] = 0;
										}
									}
								}
							}
						}
					}
					return;
				}
			} while (local35 <= 0);
			for (local39 = 0; local39 < local35; local39++) {
				@Pc(48) Class248 local48 = new Class248(arg3, arg1, 2);
				if (local48.anInt6690 == 31) {
					@Pc(59) Class12 local59 = Static298.aClass266_1.method6368(arg1.method8575());
					local48.method6009(local59.anInt234, local59.anInt229, local59.anInt230, local59.anInt235);
				}
				if (arg3.method9694() > 0) {
					@Pc(79) Class2_Sub7 local79 = local48.aClass2_Sub7_3;
					local87 = (arg0 << 9) + local79.method8171();
					local95 = (arg2 << 9) + local79.method8172();
					local99 = local87 >> 9;
					@Pc(103) int local103 = local95 >> 9;
					if (local99 >= 0 && local103 >= 0 && super.anInt4687 > local99 && local103 < super.anInt4695) {
						local79.method8165(local95, local87, super.anIntArrayArrayArray17[local48.anInt6688][local99][local103] - local79.method8174());
						Static561.method7807(local48);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII[Lclient!lka;Lclient!ha;[BB)V")
	public void method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class226[] arg7, @OriginalArg(8) Class145 arg8, @OriginalArg(9) byte[] arg9) {
		@Pc(18) Class2_Sub20 local18 = new Class2_Sub20(arg9);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method8528();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method8592(255);
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local18.method8581(-17416);
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg1 && arg5 <= local57 && arg5 + 8 > local57 && local51 >= arg4 && arg4 + 8 > local51) {
					@Pc(107) Class81 local107 = Static148.aClass153_3.method3342(local20);
					@Pc(125) int local125 = arg2 + Static271.method3806(local107.anInt1881, local107.anInt1902, local73, local57 & 0x7, local51 & 0x7, arg0);
					@Pc(142) int local142 = Static518.method7348(local107.anInt1881, local107.anInt1902, local57 & 0x7, local51 & 0x7, arg0, local73) + arg3;
					if (local125 > 0 && local142 > 0 && super.anInt4687 - 1 > local125 && local142 < super.anInt4695 - 1) {
						@Pc(170) Class226 local170 = null;
						if (!super.aBoolean406) {
							@Pc(175) int local175 = arg6;
							if ((Static392.aByteArrayArrayArray16[1][local125][local142] & 0x2) == 2) {
								local175 = arg6 - 1;
							}
							if (local175 >= 0) {
								local170 = arg7[local175];
							}
						}
						this.method4274(local20, arg6, local69, arg6, local142, -1, local73 + arg0 & 0x3, local125, arg8, local170);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILclient!ha;[B[Lclient!lka;I)V")
	public void method4281(@OriginalArg(0) int arg0, @OriginalArg(2) Class145 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class226[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub20 local10 = new Class2_Sub20(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method8528();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method8592(255);
				if (local30 == 0) {
					break;
				}
				local24 += local30 - 1;
				@Pc(45) int local45 = local24 & 0x3F;
				@Pc(51) int local51 = local24 >> 6 & 0x3F;
				@Pc(55) int local55 = local24 >> 12;
				@Pc(59) int local59 = local10.method8581(-17416);
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = local51 + arg4;
				@Pc(76) int local76 = local45 + arg0;
				if (local71 > 0 && local76 > 0 && super.anInt4687 - 1 > local71 && local76 < super.anInt4695 - 1) {
					@Pc(103) Class226 local103 = null;
					if (!super.aBoolean406) {
						@Pc(108) int local108 = local55;
						if ((Static392.aByteArrayArrayArray16[1][local71][local76] & 0x2) == 2) {
							local108 = local55 - 1;
						}
						if (local108 >= 0) {
							local103 = arg3[local108];
						}
					}
					this.method4274(local12, local55, local63, local55, local76, -1, local67, local71, arg1, local103);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILclient!ha;ILclient!lka;IIB)V")
	public void method4283(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(18) Interface25 local18 = this.method4275(arg4, arg2, arg0, arg5);
		if (local18 == null) {
			return;
		}
		@Pc(29) Class81 local29 = Static148.aClass153_3.method3342(local18.method8986());
		@Pc(33) int local33 = local18.method8991((byte) 56);
		@Pc(37) int local37 = local18.method8992();
		if (local29.method1625()) {
			Static241.method3427(arg0, local29, arg2, arg4);
		}
		if (local18.method8990((byte) -73)) {
			local18.method8987(arg1, true);
		}
		if (arg5 == 0) {
			Static66.method1004(arg4, arg2, arg0);
			if (local29.anInt1893 != 0) {
				arg3.method5269(!local29.aBoolean223, arg0, local29.aBoolean216, local37, local33, arg2);
			}
			if (local29.anInt1899 == 1) {
				if (local37 == 0) {
					Static48.method630(1, arg4, arg2, arg0);
					return;
				}
				if (local37 == 1) {
					Static48.method630(2, arg4, arg2, arg0 + 1);
				} else if (local37 == 2) {
					Static48.method630(1, arg4, arg2 + 1, arg0);
					return;
				} else if (local37 == 3) {
					Static48.method630(2, arg4, arg2, arg0);
					return;
				}
				return;
			}
			return;
		}
		if (arg5 == 1) {
			Static477.method6861(arg4, arg2, arg0);
			return;
		}
		if (arg5 == 2) {
			Static620.method8974(arg4, arg2, arg0, Static307.aClass27 == null ? (Static307.aClass27 = a("vi")) : Static307.aClass27);
			if (local29.anInt1893 != 0 && super.anInt4687 > arg2 + local29.anInt1902 && local29.anInt1902 + arg0 < super.anInt4695 && super.anInt4687 > arg2 + local29.anInt1881 && super.anInt4695 > arg0 + local29.anInt1881) {
				arg3.method5274(arg0, local29.anInt1902, local29.aBoolean216, local37, !local29.aBoolean223, arg2, local29.anInt1881);
			}
			if (local33 == 9) {
				if ((local37 & 0x1) != 0) {
					Static48.method630(16, arg4, arg2, arg0);
					return;
				}
				Static48.method630(8, arg4, arg2, arg0);
				return;
			}
			return;
		}
		if (arg5 != 3) {
			return;
		}
		Static591.method8377(arg4, arg2, arg0);
		if (local29.anInt1893 == 1) {
			arg3.method5282(arg2, arg0);
			return;
		}
	}
}
