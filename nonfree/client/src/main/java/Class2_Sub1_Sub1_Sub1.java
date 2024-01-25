import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class2_Sub1_Sub1_Sub1 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!qk", name = "H", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
	private int anInt5241;

	@OriginalMember(owner = "client!qk", name = "G", descriptor = "Lclient!lg;")
	private Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!qk", name = "J", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!qk", name = "N", descriptor = "S")
	private short aShort85;

	@OriginalMember(owner = "client!qk", name = "M", descriptor = "S")
	private short aShort84;

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!qk", name = "I", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
	private int anInt5240;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lclient!lg;IIIIIIIIIIIZ)V")
	public Class2_Sub1_Sub1_Sub1(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass2_Sub3_1 = arg0;
		super.anInt5239 = arg1 << Static350.anInt6634;
		super.anInt5231 = arg2 << Static350.anInt6634;
		super.anInt5234 = arg3 << Static350.anInt6634;
		super.anInt5235 = arg9;
		this.aShort85 = this.aShort82 = (short) arg8;
		super.anInt5237 = arg10;
		super.anInt5233 = arg11;
		this.aShort84 = (short) arg4;
		this.aShort83 = (short) arg5;
		this.aShort81 = (short) arg6;
		this.anInt5240 = arg7;
		super.aByte62 = this.aClass2_Sub3_1.aClass89_2.aByte33;
		this.method4527();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(J)V")
	public void method4524(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt5239 >> 19;
		@Pc(9) int local9 = super.anInt5234 >> 19;
		@Pc(14) int local14 = super.anInt5231 >> Static350.anInt6634;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static198.anInt4128 || local9 < 0 || local9 >= Static15.anInt1162) {
			this.method4528();
			return;
		}
		@Pc(36) Class2_Sub4 local36 = this.aClass2_Sub3_1.aClass2_Sub4_4;
		@Pc(40) Class192 local40 = this.aClass2_Sub3_1.aClass192_1;
		@Pc(42) Class60[] local42 = Static261.aClass60Array2;
		@Pc(50) int local50 = local42[local36.anInt4422].method2264(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt4422 < 3) {
			local64 = local42[local36.anInt4422 + 1].method2264(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean431) {
			if (local40.anInt5812 == -1 && local14 > local50) {
				this.method4528();
				return;
			}
			if (local40.anInt5812 >= 0 && local14 > local42[local40.anInt5812].method2264(local4, local9)) {
				this.method4528();
				return;
			}
			if (local40.anInt5842 == -1 && local14 < local64) {
				this.method4528();
				return;
			}
			if (local40.anInt5842 >= 0 && local14 < local42[local40.anInt5842 + 1].method2264(local4, local9)) {
				this.method4528();
				return;
			}
		}
		if (local4 >= local36.anInt4421 && local4 <= local36.anInt4423 && local9 >= local36.anInt4420 && local9 <= local36.anInt4423 && local14 <= local50 && local14 >= local64) {
			local36.aClass176_2.aClass195_1.method5115(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method2264(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method2264(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method2264(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method2264(local4, local9) - 1024) {
			this.method4528();
			return;
		}
		@Pc(202) Class128 local202 = Static273.aClass128ArrayArrayArray4[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static273.aClass128ArrayArrayArray4[0][local4][local9].aClass128_1 != null;
			if (local148 == 3 && local217) {
				this.method4528();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static273.aClass128ArrayArrayArray4[local227][local4][local9] == null) {
					local202 = Static273.aClass128ArrayArrayArray4[local227][local4][local9] = new Class128(local227, local4, local9);
					if (local217) {
						local202.aByte49++;
					}
				}
			}
		}
		if (local202.aClass176_1 == null) {
			local202.aClass176_1 = new Class176();
			local202.aByte52 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte52 != (byte) (arg0 & 0xFFL)) {
			local202.aClass176_1 = new Class176();
			local202.aByte52 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass176_1.aClass195_1.method5115(this);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!lg;IIIIIIIIIIIZ)V")
	public void method4525(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass2_Sub3_1 = arg0;
		super.anInt5239 = arg1 << Static350.anInt6634;
		super.anInt5231 = arg2 << Static350.anInt6634;
		super.anInt5234 = arg3 << Static350.anInt6634;
		super.anInt5235 = arg9;
		this.aShort85 = this.aShort82 = (short) arg8;
		super.anInt5237 = arg10;
		super.anInt5233 = arg11;
		this.aShort84 = (short) arg4;
		this.aShort83 = (short) arg5;
		this.aShort81 = (short) arg6;
		this.anInt5240 = arg7;
		super.aByte62 = this.aClass2_Sub3_1.aClass89_2.aByte33;
		this.method4527();
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(JI)V")
	public void method4526(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort82 = (short) (this.aShort82 - arg1);
		if (this.aShort82 <= 0) {
			this.method4528();
			return;
		}
		@Pc(17) int local17 = super.anInt5239 >> Static350.anInt6634;
		@Pc(22) int local22 = super.anInt5231 >> Static350.anInt6634;
		@Pc(27) int local27 = super.anInt5234 >> Static350.anInt6634;
		@Pc(31) Class2_Sub4 local31 = this.aClass2_Sub3_1.aClass2_Sub4_4;
		@Pc(35) Class192 local35 = this.aClass2_Sub3_1.aClass192_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5831 != 0) {
			if (this.aShort85 - this.aShort82 <= local35.anInt5814) {
				local65 = (super.anInt5235 >> 8 & 0xFF00) + (this.anInt5241 >> 16 & 0xFF) + local35.anInt5827 * arg1;
				local82 = (super.anInt5235 & 0xFF00) + (this.anInt5241 >> 8 & 0xFF) + local35.anInt5836 * arg1;
				local99 = ((super.anInt5235 & 0xFF) << 8) + (this.anInt5241 & 0xFF) + local35.anInt5853 * arg1;
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
				super.anInt5235 &= 0xFF000000;
				super.anInt5235 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5241 &= 0xFF000000;
				this.anInt5241 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort85 - this.aShort82 <= local35.anInt5822) {
				local65 = (super.anInt5235 >> 16 & 0xFF00) + (this.anInt5241 >> 24 & 0xFF) + local35.anInt5824 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5235 &= 0xFFFFFF;
				super.anInt5235 |= (local65 & 0xFF00) << 16;
				this.anInt5241 &= 0xFFFFFF;
				this.anInt5241 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5863 != -1 && this.aShort85 - this.aShort82 <= local35.anInt5844) {
			this.anInt5240 += local35.anInt5825 * arg1;
		}
		if (local35.anInt5849 != -1 && this.aShort85 - this.aShort82 <= local35.anInt5862) {
			super.anInt5237 += local35.anInt5819 * arg1;
		}
		local65 = this.aShort84;
		local82 = this.aShort83;
		local99 = this.aShort81;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5815 == 1) {
			local313 = local17 - this.aClass2_Sub3_1.anInt3817;
			local319 = local22 - this.aClass2_Sub3_1.anInt3802;
			local325 = local27 - this.aClass2_Sub3_1.anInt3799;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5818 * local340 * arg1;
			this.anInt5240 = (int) ((long) this.anInt5240 - ((long) this.anInt5240 * local348 >> 18));
		} else if (local35.anInt5815 == 2) {
			local313 = local17 - this.aClass2_Sub3_1.anInt3817;
			local319 = local22 - this.aClass2_Sub3_1.anInt3802;
			local325 = local27 - this.aClass2_Sub3_1.anInt3799;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5818 * local340 * arg1;
			this.anInt5240 = (int) ((long) this.anInt5240 - ((long) this.anInt5240 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray466 != null) {
			@Pc(426) Class4 local426 = local31.aClass116_39.aClass4_121;
			for (@Pc(429) Class4 local429 = local426.aClass4_252; local429 != local426; local429 = local429.aClass4_252) {
				@Pc(433) Class4_Sub4_Sub3 local433 = (Class4_Sub4_Sub3) local429;
				@Pc(436) Class208 local436 = local433.aClass208_1;
				if (local436.anInt6383 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray466.length; local444++) {
						if (local35.anIntArray466[local444] == local436.anInt6369) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2068;
						@Pc(473) int local473 = local22 - local433.anInt2062;
						local478 = local27 - local433.anInt2069;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong209) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2065 + local473 * local436.anInt6376 + local478 * local433.anInt2060) * 65535L / (long) (local436.anInt6374 * local501);
							if (local529 >= (long) local436.anInt6378) {
								local537 = 0;
								if (local436.anInt6380 == 1) {
									local537 = (local501 >> 4) * local436.anInt6379;
								} else if (local436.anInt6380 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6379;
								}
								if (local436.anInt6370 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6374;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6374;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6374;
									if (local436.anInt6375 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5239 += local643 * arg1 >> 15;
										super.anInt5231 += local652 * arg1 >> 15;
										super.anInt5234 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6375 == 0) {
									local65 += (local433.anInt2065 - local537) * arg1;
									local82 += (local436.anInt6376 - local537) * arg1;
									local99 += (local433.anInt2060 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt5239 += (local433.anInt2065 - local537) * arg1;
									super.anInt5231 += (local436.anInt6376 - local537) * arg1;
									super.anInt5234 += (local433.anInt2060 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray468 != null) {
			for (local313 = 0; local313 < local35.anIntArray468.length; local313++) {
				@Pc(743) Class4_Sub4_Sub3 local743 = (Class4_Sub4_Sub3) Static288.aClass131_1.method3724((long) local35.anIntArray468[local313]);
				while (local743 != null) {
					@Pc(747) Class208 local747 = local743.aClass208_1;
					local340 = local17 - local743.anInt2068;
					@Pc(757) int local757 = local22 - local743.anInt2062;
					local444 = local27 - local743.anInt2069;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong209) {
						local743 = (Class4_Sub4_Sub3) Static288.aClass131_1.method3723();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2065 + local757 * local747.anInt6376 + local444 * local743.anInt2060) * 65535L / (long) (local747.anInt6374 * local478);
						if (local491 < (long) local747.anInt6378) {
							local743 = (Class4_Sub4_Sub3) Static288.aClass131_1.method3723();
						} else {
							local501 = 0;
							if (local747.anInt6380 == 1) {
								local501 = (local478 >> 4) * local747.anInt6379;
							} else if (local747.anInt6380 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6379;
							}
							if (local747.anInt6370 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6374;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6374;
								local537 = (local444 << 15) / local478 * local747.anInt6374;
								if (local747.anInt6375 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5239 += local939 * arg1 >> 15;
									super.anInt5231 += local948 * arg1 >> 15;
									super.anInt5234 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6375 == 0) {
								local65 += (local743.anInt2065 - local501) * arg1;
								local82 += (local747.anInt6376 - local501) * arg1;
								local99 += (local743.anInt2060 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt5239 += (local743.anInt2065 - local501) * arg1;
								super.anInt5231 += (local747.anInt6376 - local501) * arg1;
								super.anInt5234 += (local743.anInt2060 - local501) * arg1;
							}
							local743 = (Class4_Sub4_Sub3) Static288.aClass131_1.method3723();
						}
					}
				}
			}
		}
		if (local35.anIntArray469 != null) {
			if (local35.anIntArray465 == null) {
				local35.anIntArray465 = new int[local35.anIntArray469.length];
				for (local313 = 0; local313 < local35.anIntArray469.length; local313++) {
					Static198.method3733(local35.anIntArray469[local313]);
					local35.anIntArray465[local313] = ((Class4_Sub8) Static74.aClass43_10.method1273((long) local35.anIntArray469[local313])).anInt492;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray465.length; local313++) {
				@Pc(1082) Class208 local1082 = Static318.aClass208Array1[local35.anIntArray465[local313]];
				if (local1082.anInt6375 == 0) {
					local65 += local1082.anInt6373 * arg1;
					local82 += local1082.anInt6376 * arg1;
					local99 += local1082.anInt6372 * arg1;
					local303 = true;
				} else {
					super.anInt5239 += local1082.anInt6373 * arg1;
					super.anInt5231 += local1082.anInt6376 * arg1;
					super.anInt5234 += local1082.anInt6372 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort84 = (short) local65;
					this.aShort83 = (short) local82;
					this.aShort81 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5240 <<= 0x1;
			}
		}
		super.anInt5239 = (int) ((long) super.anInt5239 + ((long) this.aShort84 * (long) this.anInt5240 >> 23) * (long) arg1);
		super.anInt5231 = (int) ((long) super.anInt5231 + ((long) this.aShort83 * (long) this.anInt5240 >> 23) * (long) arg1);
		super.anInt5234 = (int) ((long) super.anInt5234 + ((long) this.aShort81 * (long) this.anInt5240 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "()V")
	private void method4527() {
		@Pc(4) int local4 = this.aClass2_Sub3_1.aClass2_Sub4_4.anInt4418;
		if (this.aClass2_Sub3_1.aClass2_Sub4_4.aClass2_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass2_Sub3_1.aClass2_Sub4_4.aClass2_Sub1_Sub1_Sub1Array1[local4].method4528();
		}
		this.aClass2_Sub3_1.aClass2_Sub4_4.aClass2_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort80 = (short) this.aClass2_Sub3_1.aClass2_Sub4_4.anInt4418;
		this.aClass2_Sub3_1.aClass2_Sub4_4.anInt4418 = local4 + 1 & 0x1FFF;
		this.aClass2_Sub3_1.aClass32_7.method844(this);
	}

	@OriginalMember(owner = "client!qk", name = "b", descriptor = "()V")
	private void method4528() {
		this.aClass2_Sub3_1.aClass2_Sub4_4.aClass2_Sub1_Sub1_Sub1Array1[this.aShort80] = null;
		Static305.aClass2_Sub1_Sub1_Sub1Array4[Static276.anInt5506] = this;
		Static276.anInt5506 = Static276.anInt5506 + 1 & 0x3FF;
		this.method5419();
		this.method4516();
	}
}
