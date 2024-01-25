import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!pg", name = "P", descriptor = "I")
	public int anInt4603 = 99;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIZ)V")
	public Class56_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static13.aClass5_1, Static35.aClass47_1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!vc;IIIILclient!pf;)V")
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class188 arg5) {
		@Pc(15) Interface2 local15 = null;
		if (arg0 == 0) {
			local15 = (Interface2) Static368.method4614(arg3, arg2, arg4);
		}
		if (arg0 == 1) {
			local15 = (Interface2) Static95.method5549(arg3, arg2, arg4);
		}
		if (arg0 == 2) {
			local15 = (Interface2) Static292.method4418(arg3, arg2, arg4, dc.class);
		}
		if (arg0 == 3) {
			local15 = (Interface2) Static102.method2138(arg3, arg2, arg4);
		}
		if (local15 == null) {
			return;
		}
		@Pc(74) Class172 local74 = Static221.aClass118_6.method2858(local15.method5651());
		@Pc(78) int local78 = local15.method5654();
		@Pc(82) int local82 = local15.method5650();
		if (local74.method3789()) {
			Static265.method4090(arg4, local74, arg3, arg2);
		}
		if (local15.method5655()) {
			local15.method5649(arg1);
		}
		if (arg0 == 0) {
			@Pc(110) Class1_Sub1 local110 = Static368.method4614(arg3, arg2, arg4);
			if (local110 instanceof Class1_Sub1_Sub3) {
				((Class1_Sub1_Sub3) local110).aClass1_Sub1_1 = null;
			} else {
				Static368.method4612(arg3, arg2, arg4);
			}
			if (local74.anInt4108 != 0) {
				arg5.method4040(local82, arg2, arg4, !local74.aBoolean317, local74.aBoolean318, local78);
				return;
			}
			return;
		}
		if (arg0 == 1) {
			@Pc(152) Class1_Sub2 local152 = Static95.method5549(arg3, arg2, arg4);
			if (local152 instanceof Class1_Sub2_Sub1) {
				((Class1_Sub2_Sub1) local152).aClass1_Sub2_1 = null;
				return;
			}
			Static382.method5604(arg3, arg2, arg4);
			return;
		}
		if (arg0 == 2) {
			@Pc(181) Class1_Sub5 local181 = Static292.method4418(arg3, arg2, arg4, dc.class);
			if (local181 instanceof Class1_Sub5_Sub3 && arg2 == local181.aShort96 && arg4 == local181.aShort97) {
				((Class1_Sub5_Sub3) local181).aClass1_Sub5_2 = null;
			} else {
				Static322.method4783(arg3, arg2, arg4, dc.class);
			}
			if (local74.anInt4108 != 0 && local74.anInt4106 + arg2 < super.anInt4580 && super.anInt4594 > arg4 + local74.anInt4106 && super.anInt4580 > local74.anInt4113 + arg2 && local74.anInt4113 + arg4 < super.anInt4594) {
				arg5.method4042(local74.anInt4113, local74.anInt4106, arg4, local82, local74.aBoolean318, !local74.aBoolean317, arg2);
				return;
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		@Pc(290) Class1_Sub3 local290 = Static102.method2138(arg3, arg2, arg4);
		if (local290 instanceof Class1_Sub3_Sub3) {
			((Class1_Sub3_Sub3) local290).aClass1_Sub3_1 = null;
		} else {
			Static236.method1933(arg3, arg2, arg4);
		}
		if (local74.anInt4108 == 1) {
			arg5.method4038(arg4, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!pf;Lclient!vc;IIIIIII)V")
	public void method4074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188 arg2, @OriginalArg(3) Class63 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (!Static231.method3740() && !Static90.method1687(arg4, Static130.anInt2658, arg8, arg6)) {
			return;
		}
		if (arg8 < this.anInt4603) {
			this.anInt4603 = arg8;
		}
		@Pc(30) Class172 local30 = Static221.aClass118_6.method2858(arg5);
		if (Static62.anInt1261 == 1 && local30.aBoolean311) {
			return;
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		if (arg0 == 1 || arg0 == 3) {
			local50 = local30.anInt4113;
			local53 = local30.anInt4106;
		} else {
			local50 = local30.anInt4106;
			local53 = local30.anInt4113;
		}
		@Pc(85) int local85;
		@Pc(79) int local79;
		if (super.anInt4580 >= arg6 + local50) {
			local79 = (local50 + 1 >> 1) + arg6;
			local85 = (local50 >> 1) + arg6;
		} else {
			local79 = arg6 + 1;
			local85 = arg6;
		}
		@Pc(105) int local105;
		@Pc(109) int local109;
		if (super.anInt4594 < local53 + arg4) {
			local105 = arg4;
			local109 = arg4 + 1;
		} else {
			local105 = (local53 >> 1) + arg4;
			local109 = (local53 + 1 >> 1) + arg4;
		}
		@Pc(129) Class107 local129 = Static350.aClass107Array4[arg7];
		@Pc(151) int local151 = local129.method4685(local85, local105) + local129.method4685(local79, local105) + local129.method4685(local85, local109) + local129.method4685(local79, local109) >> 2;
		@Pc(159) int local159 = (local50 << 6) + (arg6 << 7);
		@Pc(167) int local167 = (local53 << 6) + (arg4 << 7);
		@Pc(179) boolean local179 = Static285.aBoolean377 && !super.aBoolean341 && local30.aBoolean315;
		if (local30.method3789()) {
			Static185.method3197(null, arg6, arg0, arg4, arg8, null, local30);
		}
		@Pc(213) boolean local213 = arg1 == -1 && local30.anInt4120 == -1 && local30.anIntArray803 == null && local30.anIntArray801 == null && !local30.aBoolean323;
		if (Static137.aBoolean354 && local30.anInt4137 != 1) {
			return;
		}
		if (arg9 != 22) {
			@Pc(363) Class1_Sub5 local363;
			@Pc(329) Class1_Sub5_Sub4 local329;
			@Pc(369) int local369;
			if (arg9 == 10 || arg9 == 11) {
				local329 = null;
				if (local213) {
					@Pc(361) Class1_Sub5_Sub4 local361 = new Class1_Sub5_Sub4(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg6, arg6 + local50 - 1, arg4, arg4 + local53 - 1, arg9, arg0, local179);
					local363 = local361;
					local329 = local361;
					local369 = local361.method4770();
				} else {
					local369 = 15;
					local363 = new Class1_Sub5_Sub5(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg6, local50 + arg6 - 1, arg4, local53 + arg4 - 1, arg9, arg0, arg1);
				}
				@Pc(413) Class1_Sub5 local413 = Static292.method4418(arg8, arg6, arg4, dc.class);
				@Pc(415) boolean local415 = false;
				if (local413 instanceof Class1_Sub5_Sub3 && local413.aShort96 == arg6 && arg4 == local413.aShort97) {
					((Class1_Sub5_Sub3) local413).aClass1_Sub5_2 = local363;
					local415 = true;
				}
				if (local415 || Static356.method5230(local363, false)) {
					if (local329 != null && local329.method5655()) {
						local329.method5648(arg3);
					}
					if (local30.aBoolean325 && Static285.aBoolean377) {
						if (local369 > 30) {
							local369 = 30;
						}
						for (@Pc(466) int local466 = 0; local466 <= local50; local466++) {
							for (@Pc(470) int local470 = 0; local470 <= local53; local470++) {
								local129.method4680(local466 + arg6, local470 + arg4, local369);
							}
						}
					}
				}
				if (local30.anInt4108 != 0 && arg2 != null) {
					arg2.method4055(!local30.aBoolean317, local53, local50, arg4, local30.aBoolean318, arg6);
				}
			} else {
				@Pc(617) Class1_Sub5 local617;
				if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
					if (local213) {
						local329 = new Class1_Sub5_Sub4(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg6, local50 + arg6 - 1, arg4, arg4 + local53 - 1, arg9, arg0, local179);
						local363 = local329;
						if (local329.method5655()) {
							local329.method5648(arg3);
						}
					} else {
						local363 = new Class1_Sub5_Sub5(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg6, local50 + arg6 - 1, arg4, local53 + arg4 - 1, arg9, arg0, arg1);
					}
					local617 = Static292.method4418(arg8, arg6, arg4, dc.class);
					if (local617 instanceof Class1_Sub5_Sub3 && arg6 == local617.aShort96 && local617.aShort97 == arg4) {
						((Class1_Sub5_Sub3) local617).aClass1_Sub5_2 = local363;
					} else {
						Static356.method5230(local363, false);
					}
					if (Static285.aBoolean377 && !super.aBoolean341 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg8 > 0 && local30.anInt4137 != 0) {
						super.aByteArrayArrayArray16[arg8][arg6][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4] | 0x4);
					}
					if (local30.anInt4108 != 0 && arg2 != null) {
						arg2.method4055(!local30.aBoolean317, local53, local50, arg4, local30.aBoolean318, arg6);
					}
				} else {
					@Pc(721) Class1_Sub1_Sub1 local721;
					@Pc(754) Class1_Sub1 local754;
					@Pc(723) Class1_Sub1 local723;
					if (arg9 == 0) {
						if (local213) {
							local721 = new Class1_Sub1_Sub1(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0, local179);
							local723 = local721;
							if (local721.method5655()) {
								local721.method5648(arg3);
							}
						} else {
							local723 = new Class1_Sub1_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0, arg1);
						}
						local754 = Static368.method4614(arg8, arg6, arg4);
						if (local754 instanceof Class1_Sub1_Sub3) {
							((Class1_Sub1_Sub3) local754).aClass1_Sub1_1 = local723;
						} else {
							Static267.method4109(arg8, arg6, arg4, local723, null);
						}
						if (Static285.aBoolean377) {
							if (arg0 == 0) {
								if (local30.aBoolean325) {
									local129.method4680(arg6, arg4, 50);
									local129.method4680(arg6, arg4 + 1, 50);
								}
								if (local30.anInt4137 == 1 && !super.aBoolean341) {
									super.aByteArrayArrayArray16[arg8][arg6][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local30.aBoolean325) {
									local129.method4680(arg6, arg4 + 1, 50);
									local129.method4680(arg6 + 1, arg4 - -1, 50);
								}
								if (local30.anInt4137 == 1 && !super.aBoolean341) {
									super.aByteArrayArrayArray16[arg8][arg6][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local30.aBoolean325) {
									local129.method4680(arg6 + 1, arg4, 50);
									local129.method4680(arg6 + 1, arg4 + 1, 50);
								}
								if (local30.anInt4137 == 1 && !super.aBoolean341) {
									super.aByteArrayArrayArray16[arg8][arg6 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6 + 1][arg4] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local30.aBoolean325) {
									local129.method4680(arg6, arg4, 50);
									local129.method4680(arg6 + 1, arg4, 50);
								}
								if (local30.anInt4137 == 1 && !super.aBoolean341) {
									super.aByteArrayArrayArray16[arg8][arg6][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4] | 0x2);
								}
							}
						}
						if (local30.anInt4108 != 0 && arg2 != null) {
							arg2.method4053(local30.aBoolean318, arg4, arg0, arg6, arg9, !local30.aBoolean317);
						}
						if (local30.anInt4110 != 16) {
							Static335.method4944(arg8, arg6, arg4, local30.anInt4110);
						}
					} else if (arg9 == 1) {
						if (local213) {
							local721 = new Class1_Sub1_Sub1(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0, local179);
							if (local721.method5655()) {
								local721.method5648(arg3);
							}
							local723 = local721;
						} else {
							local723 = new Class1_Sub1_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0, arg1);
						}
						local754 = Static368.method4614(arg8, arg6, arg4);
						if (local754 instanceof Class1_Sub1_Sub3) {
							((Class1_Sub1_Sub3) local754).aClass1_Sub1_1 = local723;
						} else {
							Static267.method4109(arg8, arg6, arg4, local723, null);
						}
						if (local30.aBoolean325 && Static285.aBoolean377) {
							if (arg0 == 0) {
								local129.method4680(arg6, arg4 + 1, 50);
							} else if (arg0 == 1) {
								local129.method4680(arg6 + 1, arg4 + 1, 50);
							} else if (arg0 == 2) {
								local129.method4680(arg6 + 1, arg4, 50);
							} else if (arg0 == 3) {
								local129.method4680(arg6, arg4, 50);
							}
						}
						if (local30.anInt4108 != 0 && arg2 != null) {
							arg2.method4053(local30.aBoolean318, arg4, arg0, arg6, arg9, !local30.aBoolean317);
						}
					} else if (arg9 == 2) {
						local369 = arg0 + 1 & 0x3;
						if (local213) {
							@Pc(1180) Class1_Sub1_Sub1 local1180 = new Class1_Sub1_Sub1(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0 + 4, local179);
							@Pc(1195) Class1_Sub1_Sub1 local1195 = new Class1_Sub1_Sub1(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg9, local369, local179);
							if (local1180.method5655()) {
								local1180.method5648(arg3);
							}
							local754 = local1195;
							local723 = local1180;
							if (local1195.method5655()) {
								local1195.method5648(arg3);
							}
						} else {
							local723 = new Class1_Sub1_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0 + 4, arg1);
							local754 = new Class1_Sub1_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg9, local369, arg1);
						}
						Static267.method4109(arg8, arg6, arg4, local723, local754);
						if (local30.anInt4137 == 1 && Static285.aBoolean377 && !super.aBoolean341) {
							if (arg0 == 0) {
								super.aByteArrayArrayArray16[arg8][arg6][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4] | 0x1);
								super.aByteArrayArrayArray16[arg8][arg6][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4 + 1] | 0x2);
							} else if (arg0 == 1) {
								super.aByteArrayArrayArray16[arg8][arg6][arg4 + 1] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4 + 1] | 0x2);
								super.aByteArrayArrayArray16[arg8][arg6 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6 + 1][arg4] | 0x1);
							} else if (arg0 == 2) {
								super.aByteArrayArrayArray16[arg8][arg6 + 1][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6 + 1][arg4] | 0x1);
								super.aByteArrayArrayArray16[arg8][arg6][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4] | 0x2);
							} else if (arg0 == 3) {
								super.aByteArrayArrayArray16[arg8][arg6][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4] | 0x2);
								super.aByteArrayArrayArray16[arg8][arg6][arg4] = (byte) (super.aByteArrayArrayArray16[arg8][arg6][arg4] | 0x1);
							}
						}
						if (local30.anInt4108 != 0 && arg2 != null) {
							arg2.method4053(local30.aBoolean318, arg4, arg0, arg6, arg9, !local30.aBoolean317);
						}
						if (local30.anInt4110 != 16) {
							Static335.method4944(arg8, arg6, arg4, local30.anInt4110);
						}
					} else if (arg9 == 3) {
						if (local213) {
							local721 = new Class1_Sub1_Sub1(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0, local179);
							local723 = local721;
							if (local721.method5655()) {
								local721.method5648(arg3);
							}
						} else {
							local723 = new Class1_Sub1_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg9, arg0, arg1);
						}
						local754 = Static368.method4614(arg8, arg6, arg4);
						if (local754 instanceof Class1_Sub1_Sub3) {
							((Class1_Sub1_Sub3) local754).aClass1_Sub1_1 = local723;
						} else {
							Static267.method4109(arg8, arg6, arg4, local723, null);
						}
						if (local30.aBoolean325 && Static285.aBoolean377) {
							if (arg0 == 0) {
								local129.method4680(arg6, arg4 + 1, 50);
							} else if (arg0 == 1) {
								local129.method4680(arg6 + 1, arg4 + 1, 50);
							} else if (arg0 == 2) {
								local129.method4680(arg6 + 1, arg4, 50);
							} else if (arg0 == 3) {
								local129.method4680(arg6, arg4, 50);
							}
						}
						if (local30.anInt4108 != 0 && arg2 != null) {
							arg2.method4053(local30.aBoolean318, arg4, arg0, arg6, arg9, !local30.aBoolean317);
						}
					} else if (arg9 == 9) {
						if (local213) {
							local329 = new Class1_Sub5_Sub4(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg6, arg6, arg4, arg4, arg9, arg0, local179);
							local363 = local329;
							if (local329.method5655()) {
								local329.method5648(arg3);
							}
						} else {
							local363 = new Class1_Sub5_Sub5(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg6, arg6 + local50 - 1, arg4, arg4 + local53 - 1, arg9, arg0, arg1);
						}
						local617 = Static292.method4418(arg8, arg6, arg4, dc.class);
						if (local617 instanceof Class1_Sub5_Sub3 && local617.aShort96 == arg6 && local617.aShort97 == arg4) {
							((Class1_Sub5_Sub3) local617).aClass1_Sub5_2 = local363;
						} else {
							Static356.method5230(local363, false);
						}
						if (local30.anInt4108 != 0 && arg2 != null) {
							arg2.method4055(!local30.aBoolean317, local53, local50, arg4, local30.aBoolean318, arg6);
						}
						if (local30.anInt4110 != 16) {
							Static335.method4944(arg8, arg6, arg4, local30.anInt4110);
						}
					} else {
						@Pc(1799) Class1_Sub2 local1799;
						if (arg9 == 4) {
							if (local213) {
								@Pc(1818) Class1_Sub2_Sub3 local1818 = new Class1_Sub2_Sub3(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, 0, 0, 0, arg9, arg0);
								local1799 = local1818;
								if (local1818.method5655()) {
									local1818.method5648(arg3);
								}
							} else {
								local1799 = new Class1_Sub2_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, 0, 0, 0, arg9, arg0, arg1);
							}
							@Pc(1833) Class1_Sub2 local1833 = Static95.method5549(arg8, arg6, arg4);
							if (local1833 instanceof Class1_Sub2_Sub1) {
								((Class1_Sub2_Sub1) local1833).aClass1_Sub2_1 = local1799;
							} else {
								Static140.method2661(arg8, arg6, arg4, local1799, null);
							}
						} else {
							@Pc(1855) int local1855;
							@Pc(1861) Interface2 local1861;
							@Pc(1929) Class1_Sub2_Sub3 local1929;
							@Pc(1944) Class1_Sub2 local1944;
							if (arg9 == 5) {
								local1855 = 16;
								local1861 = (Interface2) Static368.method4614(arg8, arg6, arg4);
								if (local1861 != null) {
									local1855 = Static221.aClass118_6.method2858(local1861.method5651()).anInt4110;
								}
								if (local213) {
									local1929 = new Class1_Sub2_Sub3(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, 0, Static91.anIntArray449[arg0] * local1855, Static45.anIntArray186[arg0] * local1855, arg9, arg0);
									local1799 = local1929;
									if (local1929.method5655()) {
										local1929.method5648(arg3);
									}
								} else {
									local1799 = new Class1_Sub2_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, 0, Static91.anIntArray449[arg0] * local1855, Static45.anIntArray186[arg0] * local1855, arg9, arg0, arg1);
								}
								local1944 = Static95.method5549(arg8, arg6, arg4);
								if (local1944 instanceof Class1_Sub2_Sub1) {
									((Class1_Sub2_Sub1) local1944).aClass1_Sub2_1 = local1799;
								} else {
									Static140.method2661(arg8, arg6, arg4, local1799, null);
								}
							} else if (arg9 == 6) {
								local1855 = 8;
								local1861 = (Interface2) Static368.method4614(arg8, arg6, arg4);
								if (local1861 != null) {
									local1855 = Static221.aClass118_6.method2858(local1861.method5651()).anInt4110 / 2;
								}
								if (local213) {
									local1929 = new Class1_Sub2_Sub3(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg0, local1855 * Static91.anIntArray449[arg0], Static45.anIntArray186[arg0] * local1855, arg9, arg0 + 4);
									local1799 = local1929;
									if (local1929.method5655()) {
										local1929.method5648(arg3);
									}
								} else {
									local1799 = new Class1_Sub2_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg0, Static29.anIntArray130[arg0] * local1855, Static367.anIntArray1313[arg0] * local1855, arg9, arg0 + 4, arg1);
								}
								local1944 = Static95.method5549(arg8, arg6, arg4);
								if (local1944 instanceof Class1_Sub2_Sub1) {
									((Class1_Sub2_Sub1) local1944).aClass1_Sub2_1 = local1799;
								} else {
									Static140.method2661(arg8, arg6, arg4, local1799, null);
								}
							} else if (arg9 == 7) {
								local1855 = arg0 + 2 & 0x3;
								if (local213) {
									@Pc(2106) Class1_Sub2_Sub3 local2106 = new Class1_Sub2_Sub3(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, local1855, 0, 0, arg9, local1855 + 4);
									local1799 = local2106;
									if (local2106.method5655()) {
										local2106.method5648(arg3);
									}
								} else {
									local1799 = new Class1_Sub2_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, local1855, 0, 0, arg9, local1855 + 4, arg1);
								}
								@Pc(2144) Class1_Sub2 local2144 = Static95.method5549(arg8, arg6, arg4);
								if (local2144 instanceof Class1_Sub2_Sub1) {
									((Class1_Sub2_Sub1) local2144).aClass1_Sub2_1 = local1799;
								} else {
									Static140.method2661(arg8, arg6, arg4, local1799, null);
								}
							} else if (arg9 == 8) {
								local369 = arg0 + 2 & 0x3;
								@Pc(2172) int local2172 = 8;
								@Pc(2178) Interface2 local2178 = (Interface2) Static368.method4614(arg8, arg6, arg4);
								if (local2178 != null) {
									local2172 = Static221.aClass118_6.method2858(local2178.method5651()).anInt4110 / 2;
								}
								@Pc(2219) Class1_Sub2 local2219;
								@Pc(2238) Class1_Sub2 local2238;
								if (local213) {
									local2219 = new Class1_Sub2_Sub3(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg0, local2172 * Static29.anIntArray130[arg0], local2172 * Static367.anIntArray1313[arg0], arg9, arg0 + 4);
									local2238 = new Class1_Sub2_Sub3(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg0, 0, 0, arg9, local369 + 4);
									if (local2219.method5655()) {
										local2219.method5648(arg3);
									}
									if (local2238.method5655()) {
										local2238.method5648(arg3);
									}
								} else {
									local2219 = new Class1_Sub2_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg0, local2172 * Static29.anIntArray130[arg0], local2172 * Static367.anIntArray1313[arg0], arg9, arg0 + 4, arg1);
									local2238 = new Class1_Sub2_Sub2(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg0, 0, 0, arg9, local369 + 4, arg1);
								}
								Static140.method2661(arg8, arg6, arg4, local2219, local2238);
							}
						}
					}
				}
			}
		} else if (Static349.aBoolean351 || local30.anInt4140 != 0 || local30.anInt4108 == 1 || local30.aBoolean321) {
			@Pc(260) Class1_Sub3 local260;
			if (local213) {
				@Pc(276) Class1_Sub3_Sub2 local276 = new Class1_Sub3_Sub2(arg3, local30, arg7, local159, local151, local167, super.aBoolean341, arg0, local179);
				if (local276.method5655()) {
					local276.method5648(arg3);
				}
				local260 = local276;
			} else {
				local260 = new Class1_Sub3_Sub1(arg3, local30, arg8, arg7, local159, local151, local167, super.aBoolean341, arg0, arg1);
			}
			@Pc(291) Class1_Sub3 local291 = Static102.method2138(arg8, arg6, arg4);
			if (local291 instanceof Class1_Sub3_Sub3) {
				((Class1_Sub3_Sub3) local291).aClass1_Sub3_1 = local260;
			} else {
				Static262.method4045(arg8, arg6, arg4, local260);
			}
			if (local30.anInt4108 == 1 && arg2 != null) {
				arg2.method4047(arg4, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([Lclient!pf;Lclient!vc;B[BII)V")
	public void method4075(@OriginalArg(0) Class188[] arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub16 local10 = new Class2_Sub16(arg2);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local10.method5319();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method5311();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local10.method5350();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg4 + local54;
				@Pc(78) int local78 = local48 + arg3;
				if (local74 > 0 && local78 > 0 && super.anInt4580 - 1 > local74 && local78 < super.anInt4594 - 1) {
					@Pc(104) Class188 local104 = null;
					if (!super.aBoolean341) {
						@Pc(109) int local109 = local58;
						if ((Static96.aByteArrayArrayArray8[1][local74][local78] & 0x2) == 2) {
							local109 = local58 - 1;
						}
						if (local109 >= 0) {
							local104 = arg0[local109];
						}
					}
					this.method4074(local70, -1, local104, arg1, local78, local20, local74, local58, local58, local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB[IILclient!vc;Lclient!kk;)V")
	public void method4077(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class63 arg3, @OriginalArg(5) Class2_Sub16 arg4) {
		if (super.aBoolean341) {
			return;
		}
		@Pc(15) boolean local15 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(23) Class119 local23 = null;
		while (true) {
			@Pc(28) int local28;
			@Pc(126) int local126;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(513) int local513;
			while (arg4.anInt6145 < arg4.aByteArray112.length) {
				local28 = arg4.method5350();
				if (local28 == 0) {
					local23 = new Class119(arg4);
				} else {
					@Pc(152) int local152;
					if (local28 == 1) {
						local126 = arg4.method5350();
						if (local126 > 0) {
							for (local513 = 0; local513 < local126; local513++) {
								@Pc(520) Class2_Sub17_Sub1 local520 = new Class2_Sub17_Sub1(arg4);
								if (local520.anInt2055 == 31) {
									@Pc(533) Class174 local533 = Static363.aClass228_1.method4978(arg4.method5312());
									local520.method1938(local533.anInt4280, local533.anInt4283, local533.anInt4282, local533.anInt4285);
								}
								local520.anInt2042 += arg2 << 7;
								local520.anInt2037 += arg0 << 7;
								local150 = local520.anInt2042 >> 7;
								local152 = local520.anInt2037 >> 7;
								if (local150 >= 0 && local152 >= 0 && super.anInt4580 > local150 && super.anInt4594 > local152) {
									local520.anInt2041 = super.anIntArrayArrayArray12[local520.anInt2051][local150][local152] - local520.anInt2041;
									if (arg3.method1990() > 0) {
										Static195.method3318(local520);
									}
								}
							}
						}
					} else if (local28 == 2) {
						if (local23 == null) {
							local23 = new Class119();
						}
						local23.method2864(arg4);
					} else if (local28 != 128) {
						if (local28 != 129) {
							throw new IllegalStateException((String) null);
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						for (local126 = 0; local126 < 4; local126++) {
							@Pc(134) byte local134 = arg4.method5330();
							@Pc(172) int local172;
							if (local134 == 0 && super.aByteArrayArrayArray11[local126] != null) {
								local146 = arg2;
								local150 = arg2 + 64;
								local152 = arg0;
								if (arg2 < 0) {
									local146 = 0;
								} else if (super.anInt4580 <= arg2) {
									local146 = super.anInt4580;
								}
								local172 = arg0 + 64;
								if (arg0 < 0) {
									local152 = 0;
								} else if (super.anInt4594 <= arg0) {
									local152 = super.anInt4594;
								}
								if (local150 < 0) {
									local150 = 0;
								} else if (local150 >= super.anInt4580) {
									local150 = super.anInt4580;
								}
								if (local172 < 0) {
									local172 = 0;
								} else if (super.anInt4594 <= local172) {
									local172 = super.anInt4594;
								}
								while (local146 < local150) {
									while (local172 > local152) {
										super.aByteArrayArrayArray11[local126][local146][local152] = 0;
										local152++;
									}
									local146++;
								}
							} else if (local134 == 1) {
								if (super.aByteArrayArrayArray11[local126] == null) {
									super.aByteArrayArrayArray11[local126] = new byte[super.anInt4580 + 1][super.anInt4594 + 1];
								}
								for (local146 = 0; local146 < 64; local146 += 4) {
									for (local150 = 0; local150 < 64; local150 += 4) {
										@Pc(427) byte local427 = arg4.method5330();
										for (local172 = arg2 + local146; local172 < local146 + arg2 + 4; local172++) {
											for (@Pc(437) int local437 = arg0 + local150; local437 < arg0 + local150 + 4; local437++) {
												if (local172 >= 0 && local172 < super.anInt4580 && local437 >= 0 && local437 < super.anInt4594) {
													super.aByteArrayArrayArray11[local126][local172][local437] = local427;
												}
											}
										}
									}
								}
							} else if (local134 == 2) {
								if (super.aByteArrayArrayArray11[local126] == null) {
									super.aByteArrayArrayArray11[local126] = new byte[super.anInt4580 + 1][super.anInt4594 + 1];
								}
								if (local126 > 0) {
									local146 = arg2;
									local150 = arg2 + 64;
									local152 = arg0;
									if (local150 < 0) {
										local150 = 0;
									} else if (super.anInt4580 <= local150) {
										local150 = super.anInt4580;
									}
									if (arg0 < 0) {
										local152 = 0;
									} else if (super.anInt4594 <= arg0) {
										local152 = super.anInt4594;
									}
									if (arg2 < 0) {
										local146 = 0;
									} else if (arg2 >= super.anInt4580) {
										local146 = super.anInt4580;
									}
									local172 = arg0 + 64;
									if (local172 < 0) {
										local172 = 0;
									} else if (local172 >= super.anInt4594) {
										local172 = super.anInt4594;
									}
									while (local150 > local146) {
										while (local172 > local152) {
											super.aByteArrayArrayArray11[local126][local146][local152] = super.aByteArrayArrayArray11[local126 - 1][local146][local152];
											local152++;
										}
										local146++;
									}
								}
							}
						}
						local15 = true;
					} else if (arg1 == null) {
						arg4.anInt6145 += 10;
					} else {
						arg1[0] = arg4.method5312();
						arg1[1] = arg4.method5341();
						arg1[2] = arg4.method5341();
						arg1[3] = arg4.method5341();
						arg1[4] = arg4.method5312();
					}
				}
			}
			if (local23 != null) {
				for (local28 = 0; local28 < 8; local28++) {
					for (local126 = 0; local126 < 8; local126++) {
						local513 = (arg2 >> 3) + local28;
						local146 = local126 + (arg0 >> 3);
						if (local513 >= 0 && local513 < super.anInt4580 >> 3 && local146 >= 0 && super.anInt4594 >> 3 > local146) {
							Static252.method3970(local513, local146, local23);
						}
					}
				}
			}
			if (!local15 && super.aByteArrayArrayArray11 != null) {
				for (local28 = 0; local28 < 4; local28++) {
					if (super.aByteArrayArrayArray11[local28] != null) {
						for (local126 = 0; local126 < 16; local126++) {
							for (local513 = 0; local513 < 16; local513++) {
								local146 = (arg2 >> 2) + local126;
								local150 = (arg0 >> 2) + local513;
								if (local146 >= 0 && local146 < 26 && local150 >= 0 && local150 < 26) {
									super.aByteArrayArrayArray11[local28][local146][local150] = 0;
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

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!vc;I)V")
	public void method4078(@OriginalArg(0) Class63 arg0) {
		Static359.method5246(arg0);
		@Pc(18) int local18;
		@Pc(22) int local22;
		if (super.anInt4586 > 1) {
			for (local18 = 0; local18 < super.anInt4580; local18++) {
				for (local22 = 0; local22 < super.anInt4594; local22++) {
					if ((Static96.aByteArrayArrayArray8[1][local18][local22] & 0x2) == 2) {
						Static48.method807(local18, local22);
					}
				}
			}
		}
		for (local18 = 0; local18 < super.anInt4586; local18++) {
			for (local22 = 0; local22 <= super.anInt4594; local22++) {
				for (@Pc(66) int local66 = 0; local66 <= super.anInt4580; local66++) {
					@Pc(84) int local84;
					@Pc(86) int local86;
					@Pc(88) int local88;
					@Pc(90) int local90;
					@Pc(135) int local135;
					@Pc(233) int local233;
					@Pc(242) int local242;
					@Pc(262) int local262;
					@Pc(266) int local266;
					if ((super.aByteArrayArrayArray16[local18][local66][local22] & 0x1) != 0) {
						local84 = local22;
						local86 = local22;
						local88 = local18;
						local90 = local18;
						while (super.anInt4594 > local86 && (super.aByteArrayArrayArray16[local18][local66][local86 + 1] & 0x1) != 0) {
							local86++;
						}
						while (local84 > 0 && (super.aByteArrayArrayArray16[local18][local66][local84 - 1] & 0x1) != 0) {
							local84--;
						}
						label164: while (local88 > 0) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray16[local88 - 1][local66][local135] & 0x1) == 0) {
									break label164;
								}
							}
							local88--;
						}
						label153: while (local90 < 3) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray16[local90 + 1][local66][local135] & 0x1) == 0) {
									break label153;
								}
							}
							local90++;
						}
						local135 = (local86 + 1 - local84) * (local90 + 1 - local88);
						if (local135 >= 2) {
							local233 = super.anIntArrayArrayArray12[local90][local66][local84] - 240;
							local242 = super.anIntArrayArrayArray12[local88][local66][local84];
							Static16.method308(1, local66 * 128, local66 * 128, local84 * 128, local86 * 128 + 128, local233, local242);
							for (local262 = local88; local262 <= local90; local262++) {
								for (local266 = local84; local266 <= local86; local266++) {
									super.aByteArrayArrayArray16[local262][local66][local266] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local18][local66][local22] & 0x2) != 0) {
						local84 = local66;
						local86 = local66;
						local88 = local18;
						while (local84 > 0 && (super.aByteArrayArrayArray16[local18][local84 - 1][local22] & 0x2) != 0) {
							local84--;
						}
						while (super.anInt4580 > local86 && (super.aByteArrayArrayArray16[local18][local86 + 1][local22] & 0x2) != 0) {
							local86++;
						}
						local90 = local18;
						label217: while (local88 > 0) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray16[local88 - 1][local135][local22] & 0x2) == 0) {
									break label217;
								}
							}
							local88--;
						}
						label206: while (local90 < 3) {
							for (local135 = local84; local135 <= local86; local135++) {
								if ((super.aByteArrayArrayArray16[local90 + 1][local135][local22] & 0x2) == 0) {
									break label206;
								}
							}
							local90++;
						}
						local135 = (local86 + 1 - local84) * (local90 - (local88 - 1));
						if (local135 >= 2) {
							local233 = super.anIntArrayArrayArray12[local90][local84][local22] - 240;
							local242 = super.anIntArrayArrayArray12[local88][local84][local22];
							Static16.method308(2, local84 * 128, local86 * 128 + 128, local22 * 128, local22 * 128, local233, local242);
							for (local262 = local88; local262 <= local90; local262++) {
								for (local266 = local84; local266 <= local86; local266++) {
									super.aByteArrayArrayArray16[local262][local266][local22] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local18][local66][local22] & 0x4) != 0) {
						local84 = local66;
						local86 = local66;
						local88 = local22;
						local90 = local22;
						while (local88 > 0 && (super.aByteArrayArrayArray16[local18][local66][local88 - 1] & 0x4) != 0) {
							local88--;
						}
						while (local90 < super.anInt4594 && (super.aByteArrayArrayArray16[local18][local66][local90 + 1] & 0x4) != 0) {
							local90++;
						}
						label271: while (local84 > 0) {
							for (local135 = local88; local135 <= local90; local135++) {
								if ((super.aByteArrayArrayArray16[local18][local84 - 1][local135] & 0x4) == 0) {
									break label271;
								}
							}
							local84--;
						}
						label260: while (local86 < super.anInt4580) {
							for (local135 = local88; local135 <= local90; local135++) {
								if ((super.aByteArrayArrayArray16[local18][local86 + 1][local135] & 0x4) == 0) {
									break label260;
								}
							}
							local86++;
						}
						if ((local90 + 1 - local88) * (local86 + 1 - local84) >= 4) {
							local135 = super.anIntArrayArrayArray12[local18][local84][local88];
							Static16.method308(4, local84 * 128, local86 * 128 + 128, local88 * 128, local90 * 128 + 128, local135, local135);
							for (@Pc(709) int local709 = local84; local709 <= local86; local709++) {
								for (local233 = local88; local233 <= local90; local233++) {
									super.aByteArrayArrayArray16[local18][local709][local233] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILclient!vc;Lclient!kk;IIIIII[I)V")
	public void method4079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(3) Class2_Sub16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean341) {
			return;
		}
		@Pc(13) Class119 local13 = null;
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(29) int local29 = (arg0 & 0x7) * 8;
		@Pc(35) int local35 = (arg8 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					@Pc(40) int local40;
					@Pc(80) int local80;
					@Pc(422) int local422;
					@Pc(102) int local102;
					while (arg3.anInt6145 < arg3.aByteArray112.length) {
						local40 = arg3.method5350();
						if (local40 == 0) {
							local13 = new Class119(arg3);
						} else {
							@Pc(108) int local108;
							@Pc(164) int local164;
							@Pc(255) int local255;
							@Pc(106) int local106;
							if (local40 == 1) {
								local80 = arg3.method5350();
								if (local80 > 0) {
									for (local422 = 0; local422 < local80; local422++) {
										@Pc(429) Class2_Sub17_Sub1 local429 = new Class2_Sub17_Sub1(arg3);
										if (local429.anInt2055 == 31) {
											@Pc(442) Class174 local442 = Static363.aClass228_1.method4978(arg3.method5312());
											local429.method1938(local442.anInt4280, local442.anInt4283, local442.anInt4282, local442.anInt4285);
										}
										local106 = local429.anInt2042 >> 7;
										local108 = local429.anInt2037 >> 7;
										if (local429.anInt2051 == arg7 && local29 <= local106 && local106 < local29 + 8 && local35 <= local108 && local108 < local35 + 8) {
											local164 = Static25.method469(local429.anInt2042 & 0x3FF, arg6, local429.anInt2037 & 0x3FF) + (arg4 << 7);
											local255 = (arg1 << 7) + Static236.method1934(arg6, local429.anInt2042 & 0x3FF, local429.anInt2037 & 0x3FF);
											local429.anInt2037 = local255;
											local429.anInt2042 = local164;
											local106 = local429.anInt2042 >> 7;
											local108 = local429.anInt2037 >> 7;
											if (local106 >= 0 && local108 >= 0 && super.anInt4580 > local106 && super.anInt4594 > local108) {
												local429.anInt2041 = super.anIntArrayArrayArray12[arg7][local106][local108] - local429.anInt2041;
												if (arg2.method1990() > 0) {
													Static195.method3318(local429);
												}
											}
										}
									}
								}
							} else if (local40 == 2) {
								if (local13 == null) {
									local13 = new Class119();
								}
								local13.method2864(arg3);
							} else if (local40 != 128) {
								if (local40 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								for (local80 = 0; local80 < 4; local80++) {
									@Pc(86) byte local86 = arg3.method5330();
									if (local86 == 0 && super.aByteArrayArrayArray11[arg5] != null) {
										if (local80 <= arg7) {
											local102 = arg4;
											local106 = arg4 + 7;
											local108 = arg1;
											if (arg4 < 0) {
												local102 = 0;
											} else if (arg4 >= super.anInt4580) {
												local102 = super.anInt4580;
											}
											if (arg1 < 0) {
												local108 = 0;
											} else if (arg1 >= super.anInt4594) {
												local108 = super.anInt4594;
											}
											if (local106 < 0) {
												local106 = 0;
											} else if (local106 >= super.anInt4580) {
												local106 = super.anInt4580;
											}
											local164 = arg1 + 7;
											if (local164 < 0) {
												local164 = 0;
											} else if (super.anInt4594 <= local164) {
												local164 = super.anInt4594;
											}
											while (local106 > local102) {
												while (local164 > local108) {
													super.aByteArrayArrayArray11[arg5][local102][local108] = 0;
													local108++;
												}
												local102++;
											}
										}
									} else if (local86 == 1) {
										if (super.aByteArrayArrayArray11[arg5] == null) {
											super.aByteArrayArrayArray11[arg5] = new byte[super.anInt4580 + 1][super.anInt4594 + 1];
										}
										for (local102 = 0; local102 < 64; local102 += 4) {
											for (local106 = 0; local106 < 64; local106 += 4) {
												@Pc(242) byte local242 = arg3.method5330();
												if (arg7 >= local80) {
													for (local164 = local102; local164 < local102 + 4; local164++) {
														for (local255 = local106; local255 < local106 + 4; local255++) {
															if (local29 <= local164 && local29 + 8 > local164 && local255 >= local35 && local35 < local35 + 8) {
																@Pc(294) int local294 = arg4 + Static96.method1915(arg6, local255 & 0x7, local164 & 0x7);
																@Pc(306) int local306 = Static218.method4029(arg6, local255 & 0x7, local164 & 0x7) + arg1;
																if (local294 >= 0 && local294 < super.anInt4580 && local306 >= 0 && local306 < super.anInt4594) {
																	super.aByteArrayArrayArray11[arg5][local294][local306] = local242;
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
								arg3.anInt6145 += 10;
							} else {
								arg9[0] = arg3.method5312();
								arg9[1] = arg3.method5341();
								arg9[2] = arg3.method5341();
								arg9[3] = arg3.method5341();
								arg9[4] = arg3.method5312();
							}
						}
					}
					if (local13 != null) {
						Static252.method3970(arg4 >> 3, arg1 >> 3, local13);
					}
					if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg5] != null) {
						local40 = arg4 + 7;
						local80 = arg1 + 7;
						for (local422 = arg4; local422 < local40; local422++) {
							for (local102 = arg1; local102 < local80; local102++) {
								super.aByteArrayArrayArray11[arg5][local422][local102] = 0;
							}
						}
						return;
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!vc;IIII[Lclient!pf;II[BII)V")
	public void method4080(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class188[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class2_Sub16 local10 = new Class2_Sub16(arg7);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5319();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method5311();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method5350();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg1 == local53 && arg2 <= local49 && local49 < arg2 + 8 && arg6 <= local43 && arg6 + 8 > local43) {
					@Pc(93) Class172 local93 = Static221.aClass118_6.method2858(local12);
					@Pc(110) int local110 = Static70.method1030(local65, local49 & 0x7, local93.anInt4113, local43 & 0x7, arg3, local93.anInt4106) + arg5;
					@Pc(128) int local128 = arg8 + Static345.method5667(local43 & 0x7, local49 & 0x7, local93.anInt4113, arg3, local93.anInt4106, local65);
					if (local110 > 0 && local128 > 0 && super.anInt4580 - 1 > local110 && super.anInt4594 - 1 > local128) {
						@Pc(149) Class188 local149 = null;
						if (!super.aBoolean341) {
							@Pc(154) int local154 = arg9;
							if ((Static96.aByteArrayArrayArray8[1][local110][local128] & 0x2) == 2) {
								local154 = arg9 - 1;
							}
							if (local154 >= 0) {
								local149 = arg4[local154];
							}
						}
						this.method4074(arg3 + local65 & 0x3, -1, local149, arg0, local128, local12, local110, arg9, arg9, local61);
					}
				}
			}
		}
	}
}
