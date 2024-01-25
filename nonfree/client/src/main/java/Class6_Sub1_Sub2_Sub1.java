import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class6_Sub1_Sub2_Sub1 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!sv", name = "H", descriptor = "I")
	private int anInt8132;

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "S")
	private short aShort134;

	@OriginalMember(owner = "client!sv", name = "G", descriptor = "Lclient!nn;")
	private Class6_Sub6 aClass6_Sub6_1;

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "S")
	private short aShort135;

	@OriginalMember(owner = "client!sv", name = "O", descriptor = "S")
	private short aShort138;

	@OriginalMember(owner = "client!sv", name = "N", descriptor = "S")
	private short aShort137;

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "S")
	private short aShort133;

	@OriginalMember(owner = "client!sv", name = "M", descriptor = "S")
	private short aShort136;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
	private int anInt8133;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!nn;IIIIIIIIIIIZZ)V")
	public Class6_Sub1_Sub2_Sub1(@OriginalArg(0) Class6_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass6_Sub6_1 = arg0;
		super.anInt8123 = arg1 << 12;
		super.anInt8129 = arg2 << 12;
		super.anInt8124 = arg3 << 12;
		super.anInt8125 = arg9;
		this.aShort138 = this.aShort135 = (short) arg8;
		super.anInt8122 = arg10;
		super.anInt8127 = arg11;
		super.aBoolean597 = arg13;
		this.aShort137 = (short) arg4;
		this.aShort133 = (short) arg5;
		this.aShort136 = (short) arg6;
		this.anInt8133 = arg7;
		super.aByte101 = this.aClass6_Sub6_1.aClass192_2.aByte80;
		this.method6818();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(JI)V")
	public void method6815(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort135 = (short) (this.aShort135 - arg1);
		if (this.aShort135 <= 0) {
			this.method6817();
			return;
		}
		@Pc(17) int local17 = super.anInt8123 >> 12;
		@Pc(22) int local22 = super.anInt8129 >> 12;
		@Pc(27) int local27 = super.anInt8124 >> 12;
		@Pc(31) Class6_Sub7 local31 = this.aClass6_Sub6_1.aClass6_Sub7_7;
		@Pc(35) Class44 local35 = this.aClass6_Sub6_1.aClass44_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt1481 != 0) {
			if (this.aShort138 - this.aShort135 <= local35.anInt1520) {
				local65 = (super.anInt8125 >> 8 & 0xFF00) + (this.anInt8132 >> 16 & 0xFF) + local35.anInt1487 * arg1;
				local82 = (super.anInt8125 & 0xFF00) + (this.anInt8132 >> 8 & 0xFF) + local35.anInt1495 * arg1;
				local99 = ((super.anInt8125 & 0xFF) << 8) + (this.anInt8132 & 0xFF) + local35.anInt1503 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt8125 &= 0xFF000000;
				super.anInt8125 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt8132 &= 0xFF000000;
				this.anInt8132 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort138 - this.aShort135 <= local35.anInt1507) {
				local65 = (super.anInt8125 >> 16 & 0xFF00) + (this.anInt8132 >> 24 & 0xFF) + local35.anInt1508 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt8125 &= 0xFFFFFF;
				super.anInt8125 |= (local65 & 0xFF00) << 16;
				this.anInt8132 &= 0xFFFFFF;
				this.anInt8132 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1482 != -1 && this.aShort138 - this.aShort135 <= local35.anInt1510) {
			this.anInt8133 += local35.anInt1499 * arg1;
		}
		if (local35.anInt1524 != -1 && this.aShort138 - this.aShort135 <= local35.anInt1501) {
			super.anInt8122 += local35.anInt1486 * arg1;
		}
		local65 = this.aShort137;
		local82 = this.aShort133;
		local99 = this.aShort136;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt1519 == 1) {
			local313 = local17 - this.aClass6_Sub6_1.anInt6053;
			local319 = local22 - this.aClass6_Sub6_1.anInt6069;
			local325 = local27 - this.aClass6_Sub6_1.anInt6047;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt1502 * local340 * arg1;
			this.anInt8133 = (int) ((long) this.anInt8133 - ((long) this.anInt8133 * local348 >> 18));
		} else if (local35.anInt1519 == 2) {
			local313 = local17 - this.aClass6_Sub6_1.anInt6053;
			local319 = local22 - this.aClass6_Sub6_1.anInt6069;
			local325 = local27 - this.aClass6_Sub6_1.anInt6047;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt1502 * local340 * arg1;
			this.anInt8133 = (int) ((long) this.anInt8133 - ((long) this.anInt8133 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray123 != null) {
			@Pc(426) Class2 local426 = local31.aClass249_58.aClass2_224;
			for (@Pc(429) Class2 local429 = local426.aClass2_284; local429 != local426; local429 = local429.aClass2_284) {
				@Pc(433) Class2_Sub13_Sub9 local433 = (Class2_Sub13_Sub9) local429;
				@Pc(436) Class274 local436 = local433.aClass274_1;
				if (local436.anInt8378 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray123.length; local444++) {
						if (local35.anIntArray123[local444] == local436.anInt8367) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt4582;
						@Pc(473) int local473 = local22 - local433.anInt4583;
						local478 = local27 - local433.anInt4580;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong208) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt4581 + local473 * local436.anInt8366 + local478 * local433.anInt4584) * 65535L / (long) (local436.anInt8373 * local501);
							if (local529 >= (long) local436.anInt8372) {
								local537 = 0;
								if (local436.anInt8370 == 1) {
									local537 = (local501 >> 4) * local436.anInt8368;
								} else if (local436.anInt8370 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt8368;
								}
								if (local436.anInt8362 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt8373;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt8373;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt8373;
									if (local436.anInt8363 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt8123 += local643 * arg1 >> 15;
										super.anInt8129 += local652 * arg1 >> 15;
										super.anInt8124 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt8363 == 0) {
									local65 += (local433.anInt4581 - local537) * arg1;
									local82 += (local436.anInt8366 - local537) * arg1;
									local99 += (local433.anInt4584 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt8123 += (local433.anInt4581 - local537) * arg1;
									super.anInt8129 += (local436.anInt8366 - local537) * arg1;
									super.anInt8124 += (local433.anInt4584 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray124 != null) {
			for (local313 = 0; local313 < local35.anIntArray124.length; local313++) {
				@Pc(743) Class2_Sub13_Sub9 local743 = (Class2_Sub13_Sub9) Static367.aClass314_1.method7754((long) local35.anIntArray124[local313]);
				while (local743 != null) {
					@Pc(747) Class274 local747 = local743.aClass274_1;
					local340 = local17 - local743.anInt4582;
					@Pc(757) int local757 = local22 - local743.anInt4583;
					local444 = local27 - local743.anInt4580;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong208) {
						local743 = (Class2_Sub13_Sub9) Static367.aClass314_1.method7750();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt4581 + local757 * local747.anInt8366 + local444 * local743.anInt4584) * 65535L / (long) (local747.anInt8373 * local478);
						if (local491 < (long) local747.anInt8372) {
							local743 = (Class2_Sub13_Sub9) Static367.aClass314_1.method7750();
						} else {
							local501 = 0;
							if (local747.anInt8370 == 1) {
								local501 = (local478 >> 4) * local747.anInt8368;
							} else if (local747.anInt8370 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt8368;
							}
							if (local747.anInt8362 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt8373;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt8373;
								local537 = (local444 << 15) / local478 * local747.anInt8373;
								if (local747.anInt8363 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt8123 += local939 * arg1 >> 15;
									super.anInt8129 += local948 * arg1 >> 15;
									super.anInt8124 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt8363 == 0) {
								local65 += (local743.anInt4581 - local501) * arg1;
								local82 += (local747.anInt8366 - local501) * arg1;
								local99 += (local743.anInt4584 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt8123 += (local743.anInt4581 - local501) * arg1;
								super.anInt8129 += (local747.anInt8366 - local501) * arg1;
								super.anInt8124 += (local743.anInt4584 - local501) * arg1;
							}
							local743 = (Class2_Sub13_Sub9) Static367.aClass314_1.method7750();
						}
					}
				}
			}
		}
		if (local35.anIntArray121 != null) {
			if (local35.anIntArray122 == null) {
				local35.anIntArray122 = new int[local35.anIntArray121.length];
				for (local313 = 0; local313 < local35.anIntArray121.length; local313++) {
					Static121.method2325(local35.anIntArray121[local313]);
					local35.anIntArray122[local313] = ((Class2_Sub32) Static21.aClass127_8.method3205((long) local35.anIntArray121[local313])).anInt5391;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray122.length; local313++) {
				@Pc(1082) Class274 local1082 = Static184.aClass274Array1[local35.anIntArray122[local313]];
				if (local1082.anInt8363 == 0) {
					local65 += local1082.anInt8369 * arg1;
					local82 += local1082.anInt8366 * arg1;
					local99 += local1082.anInt8361 * arg1;
					local303 = true;
				} else {
					super.anInt8123 += local1082.anInt8369 * arg1;
					super.anInt8129 += local1082.anInt8366 * arg1;
					super.anInt8124 += local1082.anInt8361 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort137 = (short) local65;
					this.aShort133 = (short) local82;
					this.aShort136 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt8133 <<= 0x1;
			}
		}
		super.anInt8123 = (int) ((long) super.anInt8123 + ((long) this.aShort137 * (long) this.anInt8133 >> 23) * (long) arg1);
		super.anInt8129 = (int) ((long) super.anInt8129 + ((long) this.aShort133 * (long) this.anInt8133 >> 23) * (long) arg1);
		super.anInt8124 = (int) ((long) super.anInt8124 + ((long) this.aShort136 * (long) this.anInt8133 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!nn;IIIIIIIIIIIZZ)V")
	public void method6816(@OriginalArg(0) Class6_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass6_Sub6_1 = arg0;
		super.anInt8123 = arg1 << 12;
		super.anInt8129 = arg2 << 12;
		super.anInt8124 = arg3 << 12;
		super.anInt8125 = arg9;
		this.aShort138 = this.aShort135 = (short) arg8;
		super.anInt8122 = arg10;
		super.anInt8127 = arg11;
		super.aBoolean597 = arg13;
		this.aShort137 = (short) arg4;
		this.aShort133 = (short) arg5;
		this.aShort136 = (short) arg6;
		this.anInt8133 = arg7;
		super.aByte101 = this.aClass6_Sub6_1.aClass192_2.aByte80;
		this.method6818();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()V")
	public void method6817() {
		this.aClass6_Sub6_1.aClass6_Sub7_7.aClass6_Sub1_Sub2_Sub1Array2[this.aShort134] = null;
		Static150.aClass6_Sub1_Sub2_Sub1Array1[Static443.anInt8057] = this;
		Static443.anInt8057 = Static443.anInt8057 + 1 & 0x3FF;
		this.method7058();
		this.method6809();
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "()V")
	private void method6818() {
		@Pc(4) int local4 = this.aClass6_Sub6_1.aClass6_Sub7_7.anInt7623;
		if (this.aClass6_Sub6_1.aClass6_Sub7_7.aClass6_Sub1_Sub2_Sub1Array2[local4] != null) {
			this.aClass6_Sub6_1.aClass6_Sub7_7.aClass6_Sub1_Sub2_Sub1Array2[local4].method6817();
		}
		this.aClass6_Sub6_1.aClass6_Sub7_7.aClass6_Sub1_Sub2_Sub1Array2[local4] = this;
		this.aShort134 = (short) this.aClass6_Sub6_1.aClass6_Sub7_7.anInt7623;
		this.aClass6_Sub6_1.aClass6_Sub7_7.anInt7623 = local4 + 1 & 0x1FFF;
		this.aClass6_Sub6_1.aClass107_4.method2830(this);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!qa;J)V")
	public void method6819(@OriginalArg(0) Class39 arg0, @OriginalArg(1) long arg1) {
		@Pc(6) int local6 = super.anInt8123 >> Static175.anInt3259 + 12;
		@Pc(13) int local13 = super.anInt8124 >> Static175.anInt3259 + 12;
		@Pc(18) int local18 = super.anInt8129 >> 12;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static515.anInt3809 || local13 < 0 || local13 >= Static315.anInt5693) {
			this.method6817();
			return;
		}
		@Pc(40) Class6_Sub7 local40 = this.aClass6_Sub6_1.aClass6_Sub7_7;
		@Pc(44) Class44 local44 = this.aClass6_Sub6_1.aClass44_1;
		@Pc(46) Class75[] local46 = Static532.aClass75Array3;
		@Pc(49) int local49 = local40.anInt7630;
		@Pc(58) Class262 local58 = Static399.aClass262ArrayArrayArray2[local40.anInt7630][local6][local13];
		if (local58 != null) {
			local49 = local58.aByte96;
		}
		@Pc(70) int local70 = local46[local49].ba(local6, local13);
		@Pc(84) int local84;
		if (local49 < Static323.anInt6015 - 1) {
			local84 = local46[local49 + 1].ba(local6, local13);
		} else {
			local84 = local70 - (0x8 << Static175.anInt3259);
		}
		if (local44.aBoolean111) {
			if (local44.anInt1490 == -1 && local18 > local70) {
				this.method6817();
				return;
			}
			if (local44.anInt1490 >= 0 && local18 > local46[local44.anInt1490].ba(local6, local13)) {
				this.method6817();
				return;
			}
			if (local44.anInt1506 == -1 && local18 < local84) {
				this.method6817();
				return;
			}
			if (local44.anInt1506 >= 0 && local18 < local46[local44.anInt1506 + 1].ba(local6, local13)) {
				this.method6817();
				return;
			}
		}
		if (local6 >= local40.anInt7627 && local6 <= local40.anInt7629 && local13 >= local40.anInt7625 && local13 <= local40.anInt7628 && local18 <= local70 && local18 >= local84) {
			local40.aClass208_1.aClass210_1.method5360(this);
			return;
		}
		@Pc(172) int local172;
		for (local172 = Static323.anInt6015 - 1; local172 > 0 && local18 > local46[local172].ba(local6, local13); local172--) {
		}
		if (local172 == 0 && local18 > local46[0].ba(local6, local13)) {
			this.method6817();
		} else if (local172 == Static323.anInt6015 - 1 && local46[local172].ba(local6, local13) - local18 > 0x8 << Static175.anInt3259) {
			this.method6817();
		} else {
			local58 = Static399.aClass262ArrayArrayArray2[local172][local6][local13];
			@Pc(275) int local275;
			if (local58 == null) {
				if (local172 == 0 || Static399.aClass262ArrayArrayArray2[0][local6][local13] == null) {
					local58 = Static399.aClass262ArrayArrayArray2[0][local6][local13] = new Class262(0, local6, local13);
				}
				@Pc(265) boolean local265 = Static399.aClass262ArrayArrayArray2[0][local6][local13].aClass262_1 != null;
				if (local172 == 3 && local265) {
					this.method6817();
					return;
				}
				for (local275 = 1; local275 <= local172; local275++) {
					if (Static399.aClass262ArrayArrayArray2[local275][local6][local13] == null) {
						local58 = Static399.aClass262ArrayArrayArray2[local275][local6][local13] = new Class262(local275, local6, local13);
						if (local265) {
							local58.aByte96++;
						}
					}
				}
			}
			if (local44.aBoolean107) {
				@Pc(320) int local320 = super.anInt8123 >> 12;
				local275 = super.anInt8124 >> 12;
				@Pc(334) Class68 local334;
				if (local58.aClass1_Sub2_3 != null) {
					local334 = local58.aClass1_Sub2_3.method7676(arg0);
					if (local334 != null && local334.method1936(local18, local275, local320)) {
						this.method6817();
						return;
					}
				}
				if (local58.aClass1_Sub2_2 != null) {
					local334 = local58.aClass1_Sub2_2.method7676(arg0);
					if (local334 != null && local334.method1936(local18, local275, local320)) {
						this.method6817();
						return;
					}
				}
				if (local58.aClass1_Sub4_1 != null) {
					local334 = local58.aClass1_Sub4_1.method7676(arg0);
					if (local334 != null && local334.method1936(local18, local275, local320)) {
						this.method6817();
						return;
					}
				}
				for (@Pc(391) Class187 local391 = local58.aClass187_3; local391 != null; local391 = local391.aClass187_1) {
					@Pc(398) Class68 local398 = local391.aClass1_Sub1_1.method7676(arg0);
					if (local398 != null && local398.method1936(local18, local275, local320)) {
						this.method6817();
						return;
					}
				}
			}
			if (local58.aClass208_2 == null) {
				local58.aClass208_2 = new Class208();
				local58.aByte97 = (byte) (arg1 & 0xFFL);
			} else if (local58.aByte97 != (byte) (arg1 & 0xFFL)) {
				local58.aClass208_2.aClass210_1.method5354();
				local58.aClass208_2.aBoolean470 = false;
				local58.aByte97 = (byte) (arg1 & 0xFFL);
			}
			local58.aClass208_2.aClass210_1.method5360(this);
		}
	}
}
