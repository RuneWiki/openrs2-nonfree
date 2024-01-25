import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
	public int anInt1253 = 99;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIZ)V")
	public Class33_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static20.aClass245_1, Static400.aClass239_5);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ[BILclient!qa;II[Lclient!cl;III)V")
	public void method920(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class37[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(14) Class2_Sub20 local14 = new Class2_Sub20(arg1);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method3695();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method3698();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local14.method3737();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				if (local60 == arg8 && local56 >= arg0 && local56 < arg0 + 8 && local50 >= arg7 && arg7 + 8 > local50) {
					@Pc(104) Class250 local104 = Static406.aClass150_3.method3508(local16);
					@Pc(121) int local121 = Static293.method4562(local104.anInt7185, local72, local104.anInt7150, arg4, local56 & 0x7, local50 & 0x7) + arg5;
					@Pc(138) int local138 = Static2.method53(local104.anInt7185, local72, local50 & 0x7, local104.anInt7150, local56 & 0x7, arg4) + arg2;
					if (local121 > 0 && local138 > 0 && local121 < super.anInt1244 - 1 && local138 < super.anInt1245 - 1) {
						@Pc(163) Class37 local163 = null;
						if (!super.aBoolean106) {
							@Pc(168) int local168 = arg9;
							if ((Static367.aByteArrayArrayArray16[1][local121][local138] & 0x2) == 2) {
								local168 = arg9 - 1;
							}
							if (local168 >= 0) {
								local163 = arg6[local168];
							}
						}
						this.method924(-1, arg3, local138, local163, local72 + arg4 & 0x3, local16, local121, arg9, arg9, local68);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method921(@OriginalArg(0) Class26 arg0) {
		Static18.method252(arg0);
		@Pc(15) int local15;
		@Pc(19) int local19;
		if (super.anInt1247 > 1) {
			for (local15 = 0; super.anInt1244 > local15; local15++) {
				for (local19 = 0; super.anInt1245 > local19; local19++) {
					if ((Static367.aByteArrayArrayArray16[1][local15][local19] & 0x2) == 2) {
						Static257.method3908(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; super.anInt1247 > local15; local15++) {
			for (local19 = 0; local19 <= super.anInt1245; local19++) {
				for (@Pc(59) int local59 = 0; local59 <= super.anInt1244; local59++) {
					@Pc(74) int local74;
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(80) int local80;
					@Pc(128) int local128;
					@Pc(227) int local227;
					@Pc(236) int local236;
					@Pc(256) int local256;
					@Pc(260) int local260;
					if ((super.aByteArrayArrayArray11[local15][local59][local19] & 0x1) != 0) {
						local74 = local19;
						local76 = local19;
						local78 = local15;
						local80 = local15;
						while (local74 > 0 && (super.aByteArrayArrayArray11[local15][local59][local74 - 1] & 0x1) != 0) {
							local74--;
						}
						while (local76 < super.anInt1245 && (super.aByteArrayArrayArray11[local15][local59][local76 + 1] & 0x1) != 0) {
							local76++;
						}
						label164: while (local78 > 0) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray11[local78 - 1][local59][local128] & 0x1) == 0) {
									break label164;
								}
							}
							local78--;
						}
						label153: while (local80 < 3) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray11[local80 + 1][local59][local128] & 0x1) == 0) {
									break label153;
								}
							}
							local80++;
						}
						local128 = (local76 + 1 - local74) * (local80 - (local78 - 1));
						if (local128 >= 2) {
							local227 = super.anIntArrayArrayArray2[local80][local59][local74] - 240;
							local236 = super.anIntArrayArrayArray2[local78][local59][local74];
							Static105.method1624(1, local59 << 7, local59 << 7, local74 << 7, (local76 << 7) + 128, local227, local236);
							for (local256 = local78; local256 <= local80; local256++) {
								for (local260 = local74; local260 <= local76; local260++) {
									super.aByteArrayArrayArray11[local256][local59][local260] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local15][local59][local19] & 0x2) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local15;
						local80 = local15;
						while (local74 > 0 && (super.aByteArrayArrayArray11[local15][local74 - 1][local19] & 0x2) != 0) {
							local74--;
						}
						while (local76 < super.anInt1244 && (super.aByteArrayArrayArray11[local15][local76 + 1][local19] & 0x2) != 0) {
							local76++;
						}
						label217: while (local78 > 0) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray11[local78 - 1][local128][local19] & 0x2) == 0) {
									break label217;
								}
							}
							local78--;
						}
						label206: while (local80 < 3) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray11[local80 + 1][local128][local19] & 0x2) == 0) {
									break label206;
								}
							}
							local80++;
						}
						local128 = (local80 + 1 - local78) * (local76 + 1 - local74);
						if (local128 >= 2) {
							local227 = super.anIntArrayArrayArray2[local80][local74][local19] - 240;
							local236 = super.anIntArrayArrayArray2[local78][local74][local19];
							Static105.method1624(2, local74 << 7, (local76 << 7) + 128, local19 << 7, local19 << 7, local227, local236);
							for (local256 = local78; local256 <= local80; local256++) {
								for (local260 = local74; local260 <= local76; local260++) {
									super.aByteArrayArrayArray11[local256][local260][local19] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray11[local15][local59][local19] & 0x4) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local19;
						local80 = local19;
						while (local78 > 0 && (super.aByteArrayArrayArray11[local15][local59][local78 - 1] & 0x4) != 0) {
							local78--;
						}
						while (super.anInt1245 > local80 && (super.aByteArrayArrayArray11[local15][local59][local80 + 1] & 0x4) != 0) {
							local80++;
						}
						label270: while (local74 > 0) {
							for (local128 = local78; local128 <= local80; local128++) {
								if ((super.aByteArrayArrayArray11[local15][local74 - 1][local128] & 0x4) == 0) {
									break label270;
								}
							}
							local74--;
						}
						label259: while (local76 < super.anInt1244) {
							for (local128 = local78; local128 <= local80; local128++) {
								if ((super.aByteArrayArrayArray11[local15][local76 + 1][local128] & 0x4) == 0) {
									break label259;
								}
							}
							local76++;
						}
						if ((local80 + 1 - local78) * (-local74 + local76 + 1) >= 4) {
							local128 = super.anIntArrayArrayArray2[local15][local74][local78];
							Static105.method1624(4, local74 << 7, (local76 << 7) + 128, local78 << 7, (local80 << 7) + 128, local128, local128);
							for (@Pc(713) int local713 = local74; local713 <= local76; local713++) {
								for (local227 = local78; local227 <= local80; local227++) {
									super.aByteArrayArrayArray11[local15][local713][local227] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray11 = null;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZIILclient!cl;ILclient!qa;)V")
	public void method923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class37 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class26 arg5) {
		@Pc(12) Interface9 local12 = null;
		if (arg4 == 0) {
			local12 = (Interface9) Static334.method4742(arg2, arg0, arg1);
		}
		if (arg4 == 1) {
			local12 = (Interface9) Static242.method3661(arg2, arg0, arg1);
		}
		if (arg4 == 2) {
			local12 = (Interface9) Static80.method1405(arg2, arg0, arg1, np.class);
		}
		if (arg4 == 3) {
			local12 = (Interface9) Static325.method4667(arg2, arg0, arg1);
		}
		if (local12 == null) {
			return;
		}
		@Pc(66) Class250 local66 = Static406.aClass150_3.method3508(local12.method5901());
		@Pc(70) int local70 = local12.method5904();
		@Pc(74) int local74 = local12.method5902();
		if (local66.method5592()) {
			Static335.method1101(arg0, arg1, local66, arg2);
		}
		if (local12.method5905()) {
			local12.method5900(arg5);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				@Pc(102) Class4_Sub1 local102 = Static242.method3661(arg2, arg0, arg1);
				if (local102 instanceof Class4_Sub1_Sub1) {
					((Class4_Sub1_Sub1) local102).aClass4_Sub1_1 = null;
					return;
				}
				Static121.method1758(arg2, arg0, arg1);
				return;
			}
			if (arg4 == 2) {
				@Pc(166) Class4_Sub2 local166 = Static80.method1405(arg2, arg0, arg1, np.class);
				if (local166 instanceof Class4_Sub2_Sub4 && arg0 == local166.aShort88 && local166.aShort89 == arg1) {
					((Class4_Sub2_Sub4) local166).aClass4_Sub2_2 = null;
				} else {
					Static409.method5548(arg2, arg0, arg1, np.class);
				}
				if (local66.anInt7187 == 0 || local66.anInt7185 + arg0 >= super.anInt1244 || super.anInt1245 <= local66.anInt7185 + arg1 || arg0 + local66.anInt7150 >= super.anInt1244 || arg1 + local66.anInt7150 >= super.anInt1245) {
					return;
				}
				arg3.method1058(local66.anInt7150, arg0, !local66.aBoolean611, local66.anInt7185, local74, arg1, local66.aBoolean618);
			} else if (arg4 == 3) {
				@Pc(128) Class4_Sub3 local128 = Static325.method4667(arg2, arg0, arg1);
				if (local128 instanceof Class4_Sub3_Sub2) {
					((Class4_Sub3_Sub2) local128).aClass4_Sub3_2 = null;
				} else {
					Static16.method241(arg2, arg0, arg1);
				}
				if (local66.anInt7187 == 1) {
					arg3.method1066(arg1, arg0);
					return;
				}
			}
			return;
		}
		@Pc(263) Class4_Sub4 local263 = Static334.method4742(arg2, arg0, arg1);
		if (local263 instanceof Class4_Sub4_Sub1) {
			((Class4_Sub4_Sub1) local263).aClass4_Sub4_3 = null;
		} else {
			Static41.method779(arg2, arg0, arg1);
		}
		if (local66.anInt7187 != 0) {
			arg3.method1068(local74, arg0, local70, local66.aBoolean618, !local66.aBoolean611, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!qa;ILclient!cl;IIIIII)V")
	public void method924(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class37 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static399.aClass167_Sub1_1.method4528(Static281.anInt5126) && !Static330.method4706(arg7, arg2, arg6, Static179.anInt6503)) {
			return;
		}
		if (arg8 < this.anInt1253) {
			this.anInt1253 = arg8;
		}
		@Pc(30) Class250 local30 = Static406.aClass150_3.method3508(arg5);
		if (arg1.method2225() && Static399.aClass167_Sub1_1.aBoolean487 && local30.aBoolean609) {
			return;
		}
		@Pc(51) int local51;
		@Pc(54) int local54;
		if (arg4 == 1 || arg4 == 3) {
			local51 = local30.anInt7150;
			local54 = local30.anInt7185;
		} else {
			local51 = local30.anInt7185;
			local54 = local30.anInt7150;
		}
		@Pc(78) int local78;
		@Pc(76) int local76;
		if (super.anInt1244 < arg6 + local51) {
			local76 = arg6 + 1;
			local78 = arg6;
		} else {
			local76 = arg6 + (local51 + 1 >> 1);
			local78 = (local51 >> 1) + arg6;
		}
		@Pc(111) int local111;
		@Pc(109) int local109;
		if (super.anInt1245 < arg2 + local54) {
			local109 = arg2 + 1;
			local111 = arg2;
		} else {
			local111 = arg2 + (local54 >> 1);
			local109 = arg2 + (local54 + 1 >> 1);
		}
		@Pc(148) Class106 local148 = Static372.aClass106Array11[arg7];
		@Pc(173) int local173 = local148.I(local78, local111) + local148.I(local76, local111) + local148.I(local78, local109) + local148.I(local76, local109) >> 2;
		@Pc(181) int local181 = (local51 << 6) + (arg6 << 7);
		@Pc(189) int local189 = (arg2 << 7) + (local54 << 6);
		@Pc(201) boolean local201 = Static265.aBoolean623 && !super.aBoolean106 && local30.aBoolean619;
		if (local30.method5592()) {
			Static354.method4965(local30, null, null, arg6, arg4, arg8, arg2);
		}
		@Pc(236) boolean local236 = arg0 == -1 && local30.anInt7183 == -1 && local30.anIntArray478 == null && local30.anIntArray479 == null && !local30.aBoolean612;
		if (Static337.aBoolean522 && (Static441.method5963(arg9) && local30.anInt7170 != 1 || !(!Static355.method4990(arg9) || local30.anInt7170 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(402) Class4_Sub2 local402;
			@Pc(362) Class4_Sub2_Sub1 local362;
			@Pc(398) int local398;
			if (arg9 == 10 || arg9 == 11) {
				local362 = null;
				if (local236) {
					@Pc(394) Class4_Sub2_Sub1 local394 = new Class4_Sub2_Sub1(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg6, arg6 + local51 - 1, arg2, arg2 + local54 - 1, arg9, arg4, local201);
					local398 = local394.method1841();
					local362 = local394;
					local402 = local394;
				} else {
					local402 = new Class4_Sub2_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg6, arg6 + local51 - 1, arg2, arg2 + local54 - 1, arg9, arg4, arg0);
					local398 = 15;
				}
				@Pc(446) Class4_Sub2 local446 = Static80.method1405(arg8, arg6, arg2, np.class);
				@Pc(448) boolean local448 = false;
				if (local446 instanceof Class4_Sub2_Sub4 && arg6 == local446.aShort88 && arg2 == local446.aShort89) {
					((Class4_Sub2_Sub4) local446).aClass4_Sub2_2 = local402;
					local448 = true;
				}
				if (local448 || Static317.method4544(local402, false)) {
					if (local362 != null && local362.method5905()) {
						local362.method5903(arg1);
					}
					if (local30.aBoolean615 && Static265.aBoolean623) {
						if (local398 > 30) {
							local398 = 30;
						}
						for (@Pc(499) int local499 = 0; local499 <= local51; local499++) {
							for (@Pc(503) int local503 = 0; local503 <= local54; local503++) {
								local148.QA(arg6 + local499, local503 + arg2, local398);
							}
						}
					}
				}
				if (local30.anInt7187 != 0 && arg3 != null) {
					arg3.method1054(!local30.aBoolean611, local30.aBoolean618, local51, arg6, local54, arg2);
				}
			} else {
				@Pc(652) Class4_Sub2 local652;
				if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
					if (local236) {
						local362 = new Class4_Sub2_Sub1(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg6, local51 + arg6 - 1, arg2, arg2 + local54 - 1, arg9, arg4, local201);
						local402 = local362;
						if (local362.method5905()) {
							local362.method5903(arg1);
						}
					} else {
						local402 = new Class4_Sub2_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg6, local51 + arg6 - 1, arg2, local54 + arg2 - 1, arg9, arg4, arg0);
					}
					local652 = Static80.method1405(arg8, arg6, arg2, np.class);
					if (local652 instanceof Class4_Sub2_Sub4 && local652.aShort88 == arg6 && local652.aShort89 == arg2) {
						((Class4_Sub2_Sub4) local652).aClass4_Sub2_2 = local402;
					} else {
						Static317.method4544(local402, false);
					}
					if (Static265.aBoolean623 && !super.aBoolean106 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg8 > 0 && local30.anInt7170 != 0) {
						super.aByteArrayArrayArray11[arg8][arg6][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2] | 0x4);
					}
					if (local30.anInt7187 != 0 && arg3 != null) {
						arg3.method1054(!local30.aBoolean611, local30.aBoolean618, local51, arg6, local54, arg2);
					}
				} else {
					@Pc(781) Class4_Sub4 local781;
					if (arg9 == 0) {
						@Pc(754) int local754 = local30.anInt7170;
						if (Static113.aBoolean195 && local30.anInt7170 == -1) {
							local754 = 1;
						}
						if (local236) {
							@Pc(779) Class4_Sub4_Sub2 local779 = new Class4_Sub4_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4, local201);
							local781 = local779;
							if (local779.method5905()) {
								local779.method5903(arg1);
							}
						} else {
							local781 = new Class4_Sub4_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4, arg0);
						}
						@Pc(812) Class4_Sub4 local812 = Static334.method4742(arg8, arg6, arg2);
						if (local812 instanceof Class4_Sub4_Sub1) {
							((Class4_Sub4_Sub1) local812).aClass4_Sub4_3 = local781;
						} else {
							Static400.method5461(arg8, arg6, arg2, local781, null);
						}
						if (Static265.aBoolean623) {
							if (arg4 == 0) {
								if (local30.aBoolean615) {
									local148.QA(arg6, arg2, 50);
									local148.QA(arg6, arg2 + 1, 50);
								}
								if (local754 == 1 && !super.aBoolean106) {
									super.aByteArrayArrayArray11[arg8][arg6][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2] | 0x1);
								}
							} else if (arg4 == 1) {
								if (local30.aBoolean615) {
									local148.QA(arg6, arg2 + 1, 50);
									local148.QA(arg6 + 1, arg2 + 1, 50);
								}
								if (local754 == 1 && !super.aBoolean106) {
									super.aByteArrayArrayArray11[arg8][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2 + 1] | 0x2);
								}
							} else if (arg4 == 2) {
								if (local30.aBoolean615) {
									local148.QA(arg6 + 1, arg2, 50);
									local148.QA(arg6 + 1, arg2 - -1, 50);
								}
								if (local754 == 1 && !super.aBoolean106) {
									super.aByteArrayArrayArray11[arg8][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6 + 1][arg2] | 0x1);
								}
							} else if (arg4 == 3) {
								if (local30.aBoolean615) {
									local148.QA(arg6, arg2, 50);
									local148.QA(arg6 + 1, arg2, 50);
								}
								if (local754 == 1 && !super.aBoolean106) {
									super.aByteArrayArrayArray11[arg8][arg6][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2] | 0x2);
								}
							}
						}
						if (local30.anInt7187 != 0 && arg3 != null) {
							arg3.method1067(arg4, arg9, local30.aBoolean618, !local30.aBoolean611, arg2, arg6);
						}
						if (local30.anInt7165 != 16) {
							Static390.method5373(arg8, arg6, arg2, local30.anInt7165);
						}
					} else {
						@Pc(1100) Class4_Sub4_Sub2 local1100;
						@Pc(1083) Class4_Sub4 local1083;
						if (arg9 == 1) {
							if (local236) {
								local1100 = new Class4_Sub4_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4, local201);
								if (local1100.method5905()) {
									local1100.method5903(arg1);
								}
								local1083 = local1100;
							} else {
								local1083 = new Class4_Sub4_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4, arg0);
							}
							local781 = Static334.method4742(arg8, arg6, arg2);
							if (local781 instanceof Class4_Sub4_Sub1) {
								((Class4_Sub4_Sub1) local781).aClass4_Sub4_3 = local1083;
							} else {
								Static400.method5461(arg8, arg6, arg2, local1083, null);
							}
							if (local30.aBoolean615 && Static265.aBoolean623) {
								if (arg4 == 0) {
									local148.QA(arg6, arg2 + 1, 50);
								} else if (arg4 == 1) {
									local148.QA(arg6 + 1, arg2 + 1, 50);
								} else if (arg4 == 2) {
									local148.QA(arg6 + 1, arg2, 50);
								} else if (arg4 == 3) {
									local148.QA(arg6, arg2, 50);
								}
							}
							if (local30.anInt7187 != 0 && arg3 != null) {
								arg3.method1067(arg4, arg9, local30.aBoolean618, !local30.aBoolean611, arg2, arg6);
							}
						} else if (arg9 == 2) {
							local398 = arg4 + 1 & 0x3;
							if (local236) {
								@Pc(1239) Class4_Sub4_Sub2 local1239 = new Class4_Sub4_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4 + 4, local201);
								@Pc(1254) Class4_Sub4_Sub2 local1254 = new Class4_Sub4_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg9, local398, local201);
								if (local1239.method5905()) {
									local1239.method5903(arg1);
								}
								if (local1254.method5905()) {
									local1254.method5903(arg1);
								}
								local1083 = local1239;
								local781 = local1254;
							} else {
								local1083 = new Class4_Sub4_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4 + 4, arg0);
								local781 = new Class4_Sub4_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg9, local398, arg0);
							}
							Static400.method5461(arg8, arg6, arg2, local1083, local781);
							if (local30.anInt7170 == 1 && Static265.aBoolean623 && !super.aBoolean106) {
								if (arg4 == 0) {
									super.aByteArrayArrayArray11[arg8][arg6][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2] | 0x1);
									super.aByteArrayArrayArray11[arg8][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2 + 1] | 0x2);
								} else if (arg4 == 1) {
									super.aByteArrayArrayArray11[arg8][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2 + 1] | 0x2);
									super.aByteArrayArrayArray11[arg8][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6 + 1][arg2] | 0x1);
								} else if (arg4 == 2) {
									super.aByteArrayArrayArray11[arg8][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6 + 1][arg2] | 0x1);
									super.aByteArrayArrayArray11[arg8][arg6][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2] | 0x2);
								} else if (arg4 == 3) {
									super.aByteArrayArrayArray11[arg8][arg6][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2] | 0x2);
									super.aByteArrayArrayArray11[arg8][arg6][arg2] = (byte) (super.aByteArrayArrayArray11[arg8][arg6][arg2] | 0x1);
								}
							}
							if (local30.anInt7187 != 0 && arg3 != null) {
								arg3.method1067(arg4, arg9, local30.aBoolean618, !local30.aBoolean611, arg2, arg6);
							}
							if (local30.anInt7165 != 16) {
								Static390.method5373(arg8, arg6, arg2, local30.anInt7165);
							}
						} else if (arg9 == 3) {
							if (local236) {
								local1100 = new Class4_Sub4_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4, local201);
								local1083 = local1100;
								if (local1100.method5905()) {
									local1100.method5903(arg1);
								}
							} else {
								local1083 = new Class4_Sub4_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg9, arg4, arg0);
							}
							local781 = Static334.method4742(arg8, arg6, arg2);
							if (local781 instanceof Class4_Sub4_Sub1) {
								((Class4_Sub4_Sub1) local781).aClass4_Sub4_3 = local1083;
							} else {
								Static400.method5461(arg8, arg6, arg2, local1083, null);
							}
							if (local30.aBoolean615 && Static265.aBoolean623) {
								if (arg4 == 0) {
									local148.QA(arg6, arg2 + 1, 50);
								} else if (arg4 == 1) {
									local148.QA(arg6 + 1, arg2 + 1, 50);
								} else if (arg4 == 2) {
									local148.QA(arg6 + 1, arg2, 50);
								} else if (arg4 == 3) {
									local148.QA(arg6, arg2, 50);
								}
							}
							if (local30.anInt7187 != 0 && arg3 != null) {
								arg3.method1067(arg4, arg9, local30.aBoolean618, !local30.aBoolean611, arg2, arg6);
							}
						} else if (arg9 == 9) {
							if (local236) {
								local362 = new Class4_Sub2_Sub1(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg6, arg6, arg2, arg2, arg9, arg4, local201);
								local402 = local362;
								if (local362.method5905()) {
									local362.method5903(arg1);
								}
							} else {
								local402 = new Class4_Sub2_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg6, arg6 + local51 - 1, arg2, arg2 + local54 - 1, arg9, arg4, arg0);
							}
							local652 = Static80.method1405(arg8, arg6, arg2, np.class);
							if (local652 instanceof Class4_Sub2_Sub4 && local652.aShort88 == arg6 && arg2 == local652.aShort89) {
								((Class4_Sub2_Sub4) local652).aClass4_Sub2_2 = local402;
							} else {
								Static317.method4544(local402, false);
							}
							if (local30.anInt7187 != 0 && arg3 != null) {
								arg3.method1054(!local30.aBoolean611, local30.aBoolean618, local51, arg6, local54, arg2);
							}
							if (local30.anInt7165 != 16) {
								Static390.method5373(arg8, arg6, arg2, local30.anInt7165);
							}
						} else {
							@Pc(1851) Class4_Sub1 local1851;
							if (arg9 == 4) {
								if (local236) {
									@Pc(1870) Class4_Sub1_Sub2 local1870 = new Class4_Sub1_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, 0, 0, 0, arg9, arg4);
									local1851 = local1870;
									if (local1870.method5905()) {
										local1870.method5903(arg1);
									}
								} else {
									local1851 = new Class4_Sub1_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, 0, 0, 0, arg9, arg4, arg0);
								}
								@Pc(1885) Class4_Sub1 local1885 = Static242.method3661(arg8, arg6, arg2);
								if (local1885 instanceof Class4_Sub1_Sub1) {
									((Class4_Sub1_Sub1) local1885).aClass4_Sub1_1 = local1851;
								} else {
									Static151.method2322(arg8, arg6, arg2, local1851, null);
								}
							} else {
								@Pc(1907) int local1907;
								@Pc(1913) Interface9 local1913;
								@Pc(1981) Class4_Sub1_Sub2 local1981;
								@Pc(1996) Class4_Sub1 local1996;
								if (arg9 == 5) {
									local1907 = 17;
									local1913 = (Interface9) Static334.method4742(arg8, arg6, arg2);
									if (local1913 != null) {
										local1907 = Static406.aClass150_3.method3508(local1913.method5901()).anInt7165 + 1;
									}
									if (local236) {
										local1981 = new Class4_Sub1_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, 0, local1907 * Static413.anIntArray485[arg4], Static238.anIntArray311[arg4] * local1907, arg9, arg4);
										if (local1981.method5905()) {
											local1981.method5903(arg1);
										}
										local1851 = local1981;
									} else {
										local1851 = new Class4_Sub1_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, 0, local1907 * Static413.anIntArray485[arg4], Static238.anIntArray311[arg4] * local1907, arg9, arg4, arg0);
									}
									local1996 = Static242.method3661(arg8, arg6, arg2);
									if (local1996 instanceof Class4_Sub1_Sub1) {
										((Class4_Sub1_Sub1) local1996).aClass4_Sub1_1 = local1851;
									} else {
										Static151.method2322(arg8, arg6, arg2, local1851, null);
									}
								} else if (arg9 == 6) {
									local1907 = 9;
									local1913 = (Interface9) Static334.method4742(arg8, arg6, arg2);
									if (local1913 != null) {
										local1907 = Static406.aClass150_3.method3508(local1913.method5901()).anInt7165 / 2 + 1;
									}
									if (local236) {
										local1981 = new Class4_Sub1_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg4, Static413.anIntArray485[arg4] * local1907, local1907 * Static238.anIntArray311[arg4], arg9, arg4 + 4);
										local1851 = local1981;
										if (local1981.method5905()) {
											local1981.method5903(arg1);
										}
									} else {
										local1851 = new Class4_Sub1_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg4, local1907 * Static273.anIntArray335[arg4], local1907 * Static194.anIntArray254[arg4], arg9, arg4 + 4, arg0);
									}
									local1996 = Static242.method3661(arg8, arg6, arg2);
									if (local1996 instanceof Class4_Sub1_Sub1) {
										((Class4_Sub1_Sub1) local1996).aClass4_Sub1_1 = local1851;
									} else {
										Static151.method2322(arg8, arg6, arg2, local1851, null);
									}
								} else if (arg9 == 7) {
									local1907 = arg4 + 2 & 0x3;
									if (local236) {
										@Pc(2158) Class4_Sub1_Sub2 local2158 = new Class4_Sub1_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, local1907, 0, 0, arg9, local1907 + 4);
										local1851 = local2158;
										if (local2158.method5905()) {
											local2158.method5903(arg1);
										}
									} else {
										local1851 = new Class4_Sub1_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, local1907, 0, 0, arg9, local1907 + 4, arg0);
									}
									@Pc(2196) Class4_Sub1 local2196 = Static242.method3661(arg8, arg6, arg2);
									if (local2196 instanceof Class4_Sub1_Sub1) {
										((Class4_Sub1_Sub1) local2196).aClass4_Sub1_1 = local1851;
									} else {
										Static151.method2322(arg8, arg6, arg2, local1851, null);
									}
								} else if (arg9 == 8) {
									local398 = arg4 + 2 & 0x3;
									@Pc(2222) int local2222 = 9;
									@Pc(2228) Interface9 local2228 = (Interface9) Static334.method4742(arg8, arg6, arg2);
									if (local2228 != null) {
										local2222 = Static406.aClass150_3.method3508(local2228.method5901()).anInt7165 / 2 + 1;
									}
									@Pc(2273) Class4_Sub1 local2273;
									@Pc(2294) Class4_Sub1 local2294;
									if (local236) {
										local2273 = new Class4_Sub1_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg4, Static273.anIntArray335[arg4] * local2222, local2222 * Static194.anIntArray254[arg4], arg9, arg4 + 4);
										local2294 = new Class4_Sub1_Sub2(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg4, 0, 0, arg9, local398 + 4);
										if (local2273.method5905()) {
											local2273.method5903(arg1);
										}
										if (local2294.method5905()) {
											local2294.method5903(arg1);
										}
									} else {
										local2273 = new Class4_Sub1_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg4, Static273.anIntArray335[arg4] * local2222, local2222 * Static194.anIntArray254[arg4], arg9, arg4 + 4, arg0);
										local2294 = new Class4_Sub1_Sub3(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg4, 0, 0, arg9, local398 + 4, arg0);
									}
									Static151.method2322(arg8, arg6, arg2, local2273, local2294);
								}
							}
						}
					}
				}
			}
		} else if (Static399.aClass167_Sub1_1.aBoolean491 || local30.anInt7186 != 0 || local30.anInt7187 == 1 || local30.aBoolean616) {
			@Pc(295) Class4_Sub3 local295;
			if (local236) {
				@Pc(311) Class4_Sub3_Sub3 local311 = new Class4_Sub3_Sub3(arg1, local30, arg7, local181, local173, local189, super.aBoolean106, arg4, local201);
				if (local311.method5905()) {
					local311.method5903(arg1);
				}
				local295 = local311;
			} else {
				local295 = new Class4_Sub3_Sub1(arg1, local30, arg8, arg7, local181, local173, local189, super.aBoolean106, arg4, arg0);
			}
			@Pc(326) Class4_Sub3 local326 = Static325.method4667(arg8, arg6, arg2);
			if (local326 instanceof Class4_Sub3_Sub2) {
				((Class4_Sub3_Sub2) local326).aClass4_Sub3_2 = local295;
			} else {
				Static49.method986(arg8, arg6, arg2, local295);
			}
			if (local30.anInt7187 == 1 && arg3 != null) {
				arg3.method1063(arg6, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lclient!cl;[BILclient!qa;I)V")
	public void method925(@OriginalArg(0) int arg0, @OriginalArg(1) Class37[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4) {
		@Pc(14) Class2_Sub20 local14 = new Class2_Sub20(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method3695();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method3698();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(50) int local50 = local31 & 0x3F;
				@Pc(56) int local56 = local31 >> 6 & 0x3F;
				@Pc(60) int local60 = local31 >> 12;
				@Pc(64) int local64 = local14.method3737();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				@Pc(76) int local76 = arg0 + local56;
				@Pc(80) int local80 = arg3 + local50;
				if (local76 > 0 && local80 > 0 && local76 < super.anInt1244 - 1 && local80 < super.anInt1245 - 1) {
					@Pc(104) Class37 local104 = null;
					if (!super.aBoolean106) {
						@Pc(109) int local109 = local60;
						if ((Static367.aByteArrayArrayArray16[1][local76][local80] & 0x2) == 2) {
							local109 = local60 - 1;
						}
						if (local109 >= 0) {
							local104 = arg1[local109];
						}
					}
					this.method924(-1, arg4, local80, local104, local72, local16, local76, local60, local60, local68);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!md;[IIIIILclient!qa;III)V")
	public void method926(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class26 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean106) {
			return;
		}
		@Pc(13) Class68 local13 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(25) int local25 = (arg5 & 0x7) * 8;
		@Pc(31) int local31 = (arg6 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(73) int local73;
			@Pc(113) int local113;
			@Pc(412) int local412;
			while (arg1.aByteArray136.length > arg1.anInt4608) {
				local36 = arg1.method3737();
				if (local36 == 0) {
					local13 = new Class68(arg1);
				} else {
					@Pc(134) int local134;
					@Pc(138) int local138;
					@Pc(181) int local181;
					@Pc(255) int local255;
					if (local36 == 1) {
						local73 = arg1.method3737();
						if (local73 > 0) {
							for (local412 = 0; local412 < local73; local412++) {
								@Pc(421) Class168 local421 = new Class168(arg7, arg1, 0);
								if (local421.anInt4886 == 31) {
									@Pc(432) Class166 local432 = Static48.aClass97_1.method1987(arg1.method3711());
									local421.method3935(local432.anInt4832, local432.anInt4834, local432.anInt4835, local432.anInt4836);
								}
								if (arg7.method2281() > 0) {
									@Pc(449) Class2_Sub7 local449 = local421.aClass2_Sub7_2;
									local255 = local449.method2991() >> 7;
									local134 = local449.method2997() >> 7;
									if (arg9 == local421.anInt4872 && local25 <= local255 && local255 < local25 + 8 && local31 <= local134 && local31 + 8 > local134) {
										local138 = Static280.method4129(local449.method2997() & 0x3FF, arg0, local449.method2991() & 0x3FF) + (arg3 << 7);
										local255 = local138 >> 7;
										local181 = Static315.method4511(local449.method2997() & 0x3FF, arg0, local449.method2991() & 0x3FF) + (arg4 << 7);
										local134 = local181 >> 7;
										if (local255 >= 0 && local134 >= 0 && local255 < super.anInt1244 && super.anInt1245 > local134) {
											local449.method2998(local138, local181, super.anIntArrayArrayArray2[arg9][local255][local134] - local449.method2996());
											if (arg7.method2281() > 0) {
												Static435.method5886(local421);
											}
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local13 == null) {
							local13 = new Class68();
						}
						local13.method1602(arg1);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray9 == null) {
							super.aByteArrayArrayArray9 = new byte[4][][];
						}
						for (local73 = 0; local73 < 4; local73++) {
							@Pc(81) byte local81 = arg1.method3693();
							@Pc(117) int local117;
							if (local81 == 0 && super.aByteArrayArrayArray9[arg8] != null) {
								if (arg9 >= local73) {
									local113 = arg3;
									local117 = arg3 + 7;
									local255 = arg4;
									if (arg4 < 0) {
										local255 = 0;
									} else if (arg4 >= super.anInt1245) {
										local255 = super.anInt1245;
									}
									if (local117 < 0) {
										local117 = 0;
									} else if (local117 >= super.anInt1244) {
										local117 = super.anInt1244;
									}
									if (arg3 < 0) {
										local113 = 0;
									} else if (arg3 >= super.anInt1244) {
										local113 = super.anInt1244;
									}
									local134 = arg4 + 7;
									if (local134 < 0) {
										local134 = 0;
									} else if (super.anInt1245 <= local134) {
										local134 = super.anInt1245;
									}
									while (local113 < local117) {
										while (local255 < local134) {
											super.aByteArrayArrayArray9[arg8][local113][local255] = 0;
											local255++;
										}
										local113++;
									}
								}
							} else if (local81 == 1) {
								if (super.aByteArrayArrayArray9[arg8] == null) {
									super.aByteArrayArrayArray9[arg8] = new byte[super.anInt1244 + 1][super.anInt1245 + 1];
								}
								for (local113 = 0; local113 < 64; local113 += 4) {
									for (local117 = 0; local117 < 64; local117 += 4) {
										@Pc(125) byte local125 = arg1.method3693();
										if (local73 <= arg9) {
											for (local134 = local113; local134 < local113 + 4; local134++) {
												for (local138 = local117; local138 < local117 + 4; local138++) {
													if (local25 <= local134 && local25 + 8 > local134 && local138 >= local31 && local31 + 8 > local31) {
														local181 = arg3 + Static91.method1528(local134 & 0x7, arg0, local138 & 0x7);
														@Pc(193) int local193 = Static268.method4009(local138 & 0x7, arg0, local134 & 0x7) + arg4;
														if (local181 >= 0 && super.anInt1244 > local181 && local193 >= 0 && local193 < super.anInt1245) {
															super.aByteArrayArrayArray9[arg8][local181][local193] = local125;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg2 == null) {
						arg1.anInt4608 += 10;
					} else {
						arg2[0] = arg1.method3711();
						arg2[1] = arg1.method3701();
						arg2[2] = arg1.method3701();
						arg2[3] = arg1.method3701();
						arg2[4] = arg1.method3711();
					}
				}
			}
			if (local13 != null) {
				Static336.method4753(arg3 >> 3, arg4 >> 3, local13);
			}
			if (super.aByteArrayArrayArray9 != null && super.aByteArrayArrayArray9[arg8] != null) {
				local36 = arg3 + 7;
				local73 = arg4 + 7;
				for (local412 = arg3; local412 < local36; local412++) {
					for (local113 = arg4; local113 < local73; local113++) {
						super.aByteArrayArrayArray9[arg8][local412][local113] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILclient!qa;II[ILclient!md;)V")
	public void method927(@OriginalArg(0) int arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class2_Sub20 arg4) {
		if (super.aBoolean106) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(19) Class68 local19 = null;
		while (true) {
			@Pc(35) int local35;
			@Pc(92) int local92;
			@Pc(100) int local100;
			@Pc(104) int local104;
			@Pc(42) int local42;
			label310: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(292) int local292;
					@Pc(296) int local296;
					while (arg4.aByteArray136.length > arg4.anInt4608) {
						local24 = arg4.method3737();
						if (local24 == 0) {
							local19 = new Class68(arg4);
						} else {
							if (local24 == 1) {
								local35 = arg4.method3737();
								continue label310;
							}
							if (local24 == 2) {
								if (local19 == null) {
									local19 = new Class68();
								}
								local19.method1602(arg4);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray9 == null) {
									super.aByteArrayArrayArray9 = new byte[4][][];
								}
								local11 = true;
								for (local35 = 0; local35 < 4; local35++) {
									@Pc(260) byte local260 = arg4.method3693();
									if (local260 == 0 && super.aByteArrayArrayArray9[local35] != null) {
										local292 = arg0;
										local296 = arg0 + 64;
										local92 = arg2;
										if (local296 < 0) {
											local296 = 0;
										} else if (super.anInt1244 <= local296) {
											local296 = super.anInt1244;
										}
										if (arg0 < 0) {
											local292 = 0;
										} else if (super.anInt1244 <= arg0) {
											local292 = super.anInt1244;
										}
										if (arg2 < 0) {
											local92 = 0;
										} else if (super.anInt1245 <= arg2) {
											local92 = super.anInt1245;
										}
										local100 = arg2 + 64;
										if (local100 < 0) {
											local100 = 0;
										} else if (local100 >= super.anInt1245) {
											local100 = super.anInt1245;
										}
										while (local292 < local296) {
											while (local92 < local100) {
												super.aByteArrayArrayArray9[local35][local292][local92] = 0;
												local92++;
											}
											local292++;
										}
									} else if (local260 == 1) {
										if (super.aByteArrayArrayArray9[local35] == null) {
											super.aByteArrayArrayArray9[local35] = new byte[super.anInt1244 + 1][super.anInt1245 + 1];
										}
										for (local292 = 0; local292 < 64; local292 += 4) {
											for (local296 = 0; local296 < 64; local296 += 4) {
												@Pc(304) byte local304 = arg4.method3693();
												for (local100 = arg0 + local292; local100 < arg0 + local292 + 4; local100++) {
													for (local104 = arg2 + local296; local104 < local296 + arg2 + 4; local104++) {
														if (local100 >= 0 && super.anInt1244 > local100 && local104 >= 0 && super.anInt1245 > local104) {
															super.aByteArrayArrayArray9[local35][local100][local104] = local304;
														}
													}
												}
											}
										}
									} else if (local260 == 2) {
										if (super.aByteArrayArrayArray9[local35] == null) {
											super.aByteArrayArrayArray9[local35] = new byte[super.anInt1244 + 1][super.anInt1245 + 1];
										}
										if (local35 > 0) {
											local292 = arg0;
											local296 = arg0 + 64;
											local92 = arg2;
											if (arg0 < 0) {
												local292 = 0;
											} else if (super.anInt1244 <= arg0) {
												local292 = super.anInt1244;
											}
											if (local296 < 0) {
												local296 = 0;
											} else if (super.anInt1244 <= local296) {
												local296 = super.anInt1244;
											}
											local100 = arg2 + 64;
											if (arg2 < 0) {
												local92 = 0;
											} else if (arg2 >= super.anInt1245) {
												local92 = super.anInt1245;
											}
											if (local100 < 0) {
												local100 = 0;
											} else if (local100 >= super.anInt1245) {
												local100 = super.anInt1245;
											}
											while (local292 < local296) {
												while (local92 < local100) {
													super.aByteArrayArrayArray9[local35][local292][local92] = super.aByteArrayArrayArray9[local35 - 1][local292][local92];
													local92++;
												}
												local292++;
											}
										}
									}
								}
							} else if (arg3 == null) {
								arg4.anInt4608 += 10;
							} else {
								arg3[0] = arg4.method3711();
								arg3[1] = arg4.method3701();
								arg3[2] = arg4.method3701();
								arg3[3] = arg4.method3701();
								arg3[4] = arg4.method3711();
							}
						}
					}
					if (local19 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local35 = 0; local35 < 8; local35++) {
								local42 = local24 + (arg0 >> 3);
								local292 = local35 + (arg2 >> 3);
								if (local42 >= 0 && super.anInt1244 >> 3 > local42 && local292 >= 0 && super.anInt1245 >> 3 > local292) {
									Static336.method4753(local42, local292, local19);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray9 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray9[local24] != null) {
								for (local35 = 0; local35 < 16; local35++) {
									for (local42 = 0; local42 < 16; local42++) {
										local292 = (arg0 >> 2) + local35;
										local296 = (arg2 >> 2) + local42;
										if (local292 >= 0 && local292 < 26 && local296 >= 0 && local296 < 26) {
											super.aByteArrayArrayArray9[local24][local292][local296] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local35 <= 0);
			for (local42 = 0; local42 < local35; local42++) {
				@Pc(51) Class168 local51 = new Class168(arg1, arg4, 0);
				if (local51.anInt4886 == 31) {
					@Pc(64) Class166 local64 = Static48.aClass97_1.method1987(arg4.method3711());
					local51.method3935(local64.anInt4832, local64.anInt4834, local64.anInt4835, local64.anInt4836);
				}
				if (arg1.method2281() > 0) {
					@Pc(84) Class2_Sub7 local84 = local51.aClass2_Sub7_2;
					local92 = (arg0 << 7) + local84.method2991();
					local100 = local84.method2997() + (arg2 << 7);
					local104 = local92 >> 7;
					@Pc(108) int local108 = local100 >> 7;
					if (local104 >= 0 && local108 >= 0 && super.anInt1244 > local104 && super.anInt1245 > local108) {
						local84.method2998(local92, local100, super.anIntArrayArrayArray2[local51.anInt4872][local104][local108] - local84.method2996());
						if (arg1.method2281() > 0) {
							Static435.method5886(local51);
						}
					}
				}
			}
		}
	}
}
