import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class8_Sub2_Sub1_Sub1 extends Class8_Sub2_Sub1 {

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "S")
	private short aShort18;

	@OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
	private int anInt1229;

	@OriginalMember(owner = "client!cd", name = "I", descriptor = "Lclient!ga;")
	private Class8_Sub4 aClass8_Sub4_1;

	@OriginalMember(owner = "client!cd", name = "H", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!cd", name = "M", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!cd", name = "K", descriptor = "S")
	private short aShort19;

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!cd", name = "N", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	private int anInt1230;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!ga;IIIIIIIIIIIZ)V")
	public Class8_Sub2_Sub1_Sub1(@OriginalArg(0) Class8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass8_Sub4_1 = arg0;
		super.anInt1227 = arg1 << Static231.anInt4760;
		super.anInt1226 = arg2 << Static231.anInt4760;
		super.anInt1223 = arg3 << Static231.anInt4760;
		super.anInt1221 = arg9;
		this.aShort20 = this.aShort17 = (short) arg8;
		super.anInt1220 = arg10;
		super.anInt1225 = arg11;
		this.aShort19 = (short) arg4;
		this.aShort22 = (short) arg5;
		this.aShort21 = (short) arg6;
		this.anInt1230 = arg7;
		super.aByte18 = this.aClass8_Sub4_1.aClass206_1.aByte72;
		this.method891();
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(J)V")
	public void method890(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt1227 >> 19;
		@Pc(9) int local9 = super.anInt1223 >> 19;
		@Pc(14) int local14 = super.anInt1226 >> Static231.anInt4760;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static242.anInt6744 || local9 < 0 || local9 >= Static315.anInt6124) {
			this.method894();
			return;
		}
		@Pc(36) Class8_Sub6 local36 = this.aClass8_Sub4_1.aClass8_Sub6_3;
		@Pc(40) Class177 local40 = this.aClass8_Sub4_1.aClass177_1;
		@Pc(42) Class53[] local42 = Static298.aClass53Array3;
		@Pc(50) int local50 = local42[local36.anInt3561].method2785(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt3561 < 3) {
			local64 = local42[local36.anInt3561 + 1].method2785(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean523) {
			if (local40.anInt5478 == -1 && local14 > local50) {
				this.method894();
				return;
			}
			if (local40.anInt5478 >= 0 && local14 > local42[local40.anInt5478].method2785(local4, local9)) {
				this.method894();
				return;
			}
			if (local40.anInt5457 == -1 && local14 < local64) {
				this.method894();
				return;
			}
			if (local40.anInt5457 >= 0 && local14 < local42[local40.anInt5457 + 1].method2785(local4, local9)) {
				this.method894();
				return;
			}
		}
		if (local4 >= local36.anInt3563 && local4 <= local36.anInt3562 && local9 >= local36.anInt3560 && local9 <= local36.anInt3562 && local14 <= local50 && local14 >= local64) {
			local36.aClass191_1.aClass130_1.method3556(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method2785(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method2785(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method2785(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method2785(local4, local9) - 1024) {
			this.method894();
			return;
		}
		@Pc(202) Class194 local202 = Static77.aClass194ArrayArrayArray1[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static77.aClass194ArrayArrayArray1[0][local4][local9].aClass194_1 != null;
			if (local148 == 3 && local217) {
				this.method894();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static77.aClass194ArrayArrayArray1[local227][local4][local9] == null) {
					local202 = Static77.aClass194ArrayArrayArray1[local227][local4][local9] = new Class194(local227, local4, local9);
					if (local217) {
						local202.aByte64++;
					}
				}
			}
		}
		if (local202.aClass191_2 == null) {
			local202.aClass191_2 = new Class191();
			local202.aByte70 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte70 != (byte) (arg0 & 0xFFL)) {
			local202.aClass191_2 = new Class191();
			local202.aByte70 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass191_2.aClass130_1.method3556(this);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "()V")
	private void method891() {
		@Pc(4) int local4 = this.aClass8_Sub4_1.aClass8_Sub6_3.anInt3557;
		if (this.aClass8_Sub4_1.aClass8_Sub6_3.aClass8_Sub2_Sub1_Sub1Array1[local4] != null) {
			this.aClass8_Sub4_1.aClass8_Sub6_3.aClass8_Sub2_Sub1_Sub1Array1[local4].method894();
		}
		this.aClass8_Sub4_1.aClass8_Sub6_3.aClass8_Sub2_Sub1_Sub1Array1[local4] = this;
		this.aShort18 = (short) this.aClass8_Sub4_1.aClass8_Sub6_3.anInt3557;
		this.aClass8_Sub4_1.aClass8_Sub6_3.anInt3557 = local4 + 1 & 0x1FFF;
		this.aClass8_Sub4_1.aClass217_3.method5678(this);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(JI)V")
	public void method892(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort17 = (short) (this.aShort17 - arg1);
		if (this.aShort17 <= 0) {
			this.method894();
			return;
		}
		@Pc(17) int local17 = super.anInt1227 >> Static231.anInt4760;
		@Pc(22) int local22 = super.anInt1226 >> Static231.anInt4760;
		@Pc(27) int local27 = super.anInt1223 >> Static231.anInt4760;
		@Pc(31) Class8_Sub6 local31 = this.aClass8_Sub4_1.aClass8_Sub6_3;
		@Pc(35) Class177 local35 = this.aClass8_Sub4_1.aClass177_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5444 != 0) {
			if (this.aShort20 - this.aShort17 <= local35.anInt5454) {
				local65 = (super.anInt1221 >> 8 & 0xFF00) + (this.anInt1229 >> 16 & 0xFF) + local35.anInt5455 * arg1;
				local82 = (super.anInt1221 & 0xFF00) + (this.anInt1229 >> 8 & 0xFF) + local35.anInt5452 * arg1;
				local99 = ((super.anInt1221 & 0xFF) << 8) + (this.anInt1229 & 0xFF) + local35.anInt5433 * arg1;
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
				super.anInt1221 &= 0xFF000000;
				super.anInt1221 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt1229 &= 0xFF000000;
				this.anInt1229 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort20 - this.aShort17 <= local35.anInt5445) {
				local65 = (super.anInt1221 >> 16 & 0xFF00) + (this.anInt1229 >> 24 & 0xFF) + local35.anInt5468 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt1221 &= 0xFFFFFF;
				super.anInt1221 |= (local65 & 0xFF00) << 16;
				this.anInt1229 &= 0xFFFFFF;
				this.anInt1229 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.lb != -1 && this.aShort20 - this.aShort17 <= local35.anInt5473) {
			this.anInt1230 += local35.anInt5460 * arg1;
		}
		if (local35.anInt5458 != -1 && this.aShort20 - this.aShort17 <= local35.anInt5440) {
			super.anInt1220 += local35.anInt5466 * arg1;
		}
		local65 = this.aShort19;
		local82 = this.aShort22;
		local99 = this.aShort21;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5436 == 1) {
			local313 = local17 - this.aClass8_Sub4_1.anInt2276;
			local319 = local22 - this.aClass8_Sub4_1.anInt2275;
			local325 = local27 - this.aClass8_Sub4_1.anInt2263;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5437 * local340 * arg1;
			this.anInt1230 = (int) ((long) this.anInt1230 - ((long) this.anInt1230 * local348 >> 18));
		} else if (local35.anInt5436 == 2) {
			local313 = local17 - this.aClass8_Sub4_1.anInt2276;
			local319 = local22 - this.aClass8_Sub4_1.anInt2275;
			local325 = local27 - this.aClass8_Sub4_1.anInt2263;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5437 * local340 * arg1;
			this.anInt1230 = (int) ((long) this.anInt1230 - ((long) this.anInt1230 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray455 != null) {
			@Pc(426) Class1 local426 = local31.aClass16_17.aClass1_25;
			for (@Pc(429) Class1 local429 = local426.aClass1_252; local429 != local426; local429 = local429.aClass1_252) {
				@Pc(433) Class1_Sub4_Sub12 local433 = (Class1_Sub4_Sub12) local429;
				@Pc(436) Class195 local436 = local433.aClass195_1;
				if (local436.anInt6010 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray455.length; local444++) {
						if (local35.anIntArray455[local444] == local436.anInt6007) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2612;
						@Pc(473) int local473 = local22 - local433.anInt2611;
						local478 = local27 - local433.anInt2616;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong181) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2621 + local473 * local436.anInt6012 + local478 * local433.anInt2620) * 65535L / (long) (local436.anInt6022 * local501);
							if (local529 >= (long) local436.anInt6020) {
								local537 = 0;
								if (local436.anInt6025 == 1) {
									local537 = (local501 >> 4) * local436.anInt6005;
								} else if (local436.anInt6025 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6005;
								}
								if (local436.anInt6001 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6022;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6022;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6022;
									if (local436.anInt6026 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt1227 += local643 * arg1 >> 15;
										super.anInt1226 += local652 * arg1 >> 15;
										super.anInt1223 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6026 == 0) {
									local65 += (local433.anInt2621 - local537) * arg1;
									local82 += (local436.anInt6012 - local537) * arg1;
									local99 += (local433.anInt2620 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt1227 += (local433.anInt2621 - local537) * arg1;
									super.anInt1226 += (local436.anInt6012 - local537) * arg1;
									super.anInt1223 += (local433.anInt2620 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray458 != null) {
			for (local313 = 0; local313 < local35.anIntArray458.length; local313++) {
				@Pc(743) Class1_Sub4_Sub12 local743 = (Class1_Sub4_Sub12) Static156.aClass75_1.method2023((long) local35.anIntArray458[local313]);
				while (local743 != null) {
					@Pc(747) Class195 local747 = local743.aClass195_1;
					local340 = local17 - local743.anInt2612;
					@Pc(757) int local757 = local22 - local743.anInt2611;
					local444 = local27 - local743.anInt2616;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong181) {
						local743 = (Class1_Sub4_Sub12) Static156.aClass75_1.method2024();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2621 + local757 * local747.anInt6012 + local444 * local743.anInt2620) * 65535L / (long) (local747.anInt6022 * local478);
						if (local491 < (long) local747.anInt6020) {
							local743 = (Class1_Sub4_Sub12) Static156.aClass75_1.method2024();
						} else {
							local501 = 0;
							if (local747.anInt6025 == 1) {
								local501 = (local478 >> 4) * local747.anInt6005;
							} else if (local747.anInt6025 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6005;
							}
							if (local747.anInt6001 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6022;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6022;
								local537 = (local444 << 15) / local478 * local747.anInt6022;
								if (local747.anInt6026 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt1227 += local939 * arg1 >> 15;
									super.anInt1226 += local948 * arg1 >> 15;
									super.anInt1223 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6026 == 0) {
								local65 += (local743.anInt2621 - local501) * arg1;
								local82 += (local747.anInt6012 - local501) * arg1;
								local99 += (local743.anInt2620 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt1227 += (local743.anInt2621 - local501) * arg1;
								super.anInt1226 += (local747.anInt6012 - local501) * arg1;
								super.anInt1223 += (local743.anInt2620 - local501) * arg1;
							}
							local743 = (Class1_Sub4_Sub12) Static156.aClass75_1.method2024();
						}
					}
				}
			}
		}
		if (local35.anIntArray456 != null) {
			if (local35.anIntArray457 == null) {
				local35.anIntArray457 = new int[local35.anIntArray456.length];
				for (local313 = 0; local313 < local35.anIntArray456.length; local313++) {
					Static91.method1962(local35.anIntArray456[local313]);
					local35.anIntArray457[local313] = ((Class1_Sub13) Static77.aClass197_7.method5157((long) local35.anIntArray456[local313])).anInt1849;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray457.length; local313++) {
				@Pc(1082) Class195 local1082 = Static40.aClass195Array1[local35.anIntArray457[local313]];
				if (local1082.anInt6026 == 0) {
					local65 += local1082.anInt6016 * arg1;
					local82 += local1082.anInt6012 * arg1;
					local99 += local1082.anInt6011 * arg1;
					local303 = true;
				} else {
					super.anInt1227 += local1082.anInt6016 * arg1;
					super.anInt1226 += local1082.anInt6012 * arg1;
					super.anInt1223 += local1082.anInt6011 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort19 = (short) local65;
					this.aShort22 = (short) local82;
					this.aShort21 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt1230 <<= 0x1;
			}
		}
		super.anInt1227 = (int) ((long) super.anInt1227 + ((long) this.aShort19 * (long) this.anInt1230 >> 23) * (long) arg1);
		super.anInt1226 = (int) ((long) super.anInt1226 + ((long) this.aShort22 * (long) this.anInt1230 >> 23) * (long) arg1);
		super.anInt1223 = (int) ((long) super.anInt1223 + ((long) this.aShort21 * (long) this.anInt1230 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ga;IIIIIIIIIIIZ)V")
	public void method893(@OriginalArg(0) Class8_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass8_Sub4_1 = arg0;
		super.anInt1227 = arg1 << Static231.anInt4760;
		super.anInt1226 = arg2 << Static231.anInt4760;
		super.anInt1223 = arg3 << Static231.anInt4760;
		super.anInt1221 = arg9;
		this.aShort20 = this.aShort17 = (short) arg8;
		super.anInt1220 = arg10;
		super.anInt1225 = arg11;
		this.aShort19 = (short) arg4;
		this.aShort22 = (short) arg5;
		this.aShort21 = (short) arg6;
		this.anInt1230 = arg7;
		super.aByte18 = this.aClass8_Sub4_1.aClass206_1.aByte72;
		this.method891();
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
	private void method894() {
		this.aClass8_Sub4_1.aClass8_Sub6_3.aClass8_Sub2_Sub1_Sub1Array1[this.aShort18] = null;
		Static324.aClass8_Sub2_Sub1_Sub1Array2[Static230.anInt4755] = this;
		Static230.anInt4755 = Static230.anInt4755 + 1 & 0x3FF;
		this.method4763();
		this.method885();
	}
}
