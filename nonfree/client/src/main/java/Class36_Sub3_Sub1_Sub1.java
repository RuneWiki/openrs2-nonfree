import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class36_Sub3_Sub1_Sub1 extends Class36_Sub3_Sub1 {

	@OriginalMember(owner = "client!ff", name = "F", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
	private int anInt2042;

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "Lclient!pq;")
	private Class36_Sub6 aClass36_Sub6_1;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!ff", name = "G", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "I")
	private int anInt2041;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Lclient!pq;IIIIIIIIIIIZZ)V")
	public Class36_Sub3_Sub1_Sub1(@OriginalArg(0) Class36_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass36_Sub6_1 = arg0;
		super.anInt2038 = arg1 << Static415.anInt7293;
		super.anInt2031 = arg2 << Static415.anInt7293;
		super.anInt2028 = arg3 << Static415.anInt7293;
		super.anInt2029 = arg9;
		this.aShort38 = this.aShort39 = (short) arg8;
		super.anInt2034 = arg10;
		super.anInt2036 = arg11;
		super.aBoolean163 = arg13;
		this.aShort40 = (short) arg4;
		this.aShort36 = (short) arg5;
		this.aShort37 = (short) arg6;
		this.anInt2041 = arg7;
		super.aByte26 = this.aClass36_Sub6_1.aClass203_1.aByte90;
		this.method1678();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(JI)V")
	public void method1674(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort39 = (short) (this.aShort39 - arg1);
		if (this.aShort39 <= 0) {
			this.method1676();
			return;
		}
		@Pc(17) int local17 = super.anInt2038 >> Static415.anInt7293;
		@Pc(22) int local22 = super.anInt2031 >> Static415.anInt7293;
		@Pc(27) int local27 = super.anInt2028 >> Static415.anInt7293;
		@Pc(31) Class36_Sub7 local31 = this.aClass36_Sub6_1.aClass36_Sub7_5;
		@Pc(35) Class210 local35 = this.aClass36_Sub6_1.aClass210_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt6400 != 0) {
			if (this.aShort38 - this.aShort39 <= local35.anInt6372) {
				local65 = (super.anInt2029 >> 8 & 0xFF00) + (this.anInt2042 >> 16 & 0xFF) + local35.anInt6398 * arg1;
				local82 = (super.anInt2029 & 0xFF00) + (this.anInt2042 >> 8 & 0xFF) + local35.anInt6384 * arg1;
				local99 = ((super.anInt2029 & 0xFF) << 8) + (this.anInt2042 & 0xFF) + local35.anInt6387 * arg1;
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
				super.anInt2029 &= 0xFF000000;
				super.anInt2029 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2042 &= 0xFF000000;
				this.anInt2042 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort38 - this.aShort39 <= local35.anInt6390) {
				local65 = (super.anInt2029 >> 16 & 0xFF00) + (this.anInt2042 >> 24 & 0xFF) + local35.anInt6392 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2029 &= 0xFFFFFF;
				super.anInt2029 |= (local65 & 0xFF00) << 16;
				this.anInt2042 &= 0xFFFFFF;
				this.anInt2042 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6382 != -1 && this.aShort38 - this.aShort39 <= local35.anInt6417) {
			this.anInt2041 += local35.anInt6386 * arg1;
		}
		if (local35.anInt6391 != -1 && this.aShort38 - this.aShort39 <= local35.anInt6407) {
			super.anInt2034 += local35.anInt6411 * arg1;
		}
		local65 = this.aShort40;
		local82 = this.aShort36;
		local99 = this.aShort37;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6379 == 1) {
			local313 = local17 - this.aClass36_Sub6_1.anInt5308;
			local319 = local22 - this.aClass36_Sub6_1.anInt5286;
			local325 = local27 - this.aClass36_Sub6_1.anInt5291;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6410 * local340 * arg1;
			this.anInt2041 = (int) ((long) this.anInt2041 - ((long) this.anInt2041 * local348 >> 18));
		} else if (local35.anInt6379 == 2) {
			local313 = local17 - this.aClass36_Sub6_1.anInt5308;
			local319 = local22 - this.aClass36_Sub6_1.anInt5286;
			local325 = local27 - this.aClass36_Sub6_1.anInt5291;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6410 * local340 * arg1;
			this.anInt2041 = (int) ((long) this.anInt2041 - ((long) this.anInt2041 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray464 != null) {
			@Pc(426) Class1 local426 = local31.aClass142_44.aClass1_143;
			for (@Pc(429) Class1 local429 = local426.aClass1_262; local429 != local426; local429 = local429.aClass1_262) {
				@Pc(433) Class1_Sub1_Sub8 local433 = (Class1_Sub1_Sub8) local429;
				@Pc(436) Class18 local436 = local433.aClass18_1;
				if (local436.anInt314 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray464.length; local444++) {
						if (local35.anIntArray464[local444] == local436.anInt321) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2761;
						@Pc(473) int local473 = local22 - local433.anInt2759;
						local478 = local27 - local433.anInt2757;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong16) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2756 + local473 * local436.anInt319 + local478 * local433.anInt2762) * 65535L / (long) (local436.anInt312 * local501);
							if (local529 >= (long) local436.anInt311) {
								local537 = 0;
								if (local436.anInt315 == 1) {
									local537 = (local501 >> 4) * local436.anInt320;
								} else if (local436.anInt315 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt320;
								}
								if (local436.anInt316 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt312;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt312;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt312;
									if (local436.anInt309 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2038 += local643 * arg1 >> 15;
										super.anInt2031 += local652 * arg1 >> 15;
										super.anInt2028 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt309 == 0) {
									local65 += (local433.anInt2756 - local537) * arg1;
									local82 += (local436.anInt319 - local537) * arg1;
									local99 += (local433.anInt2762 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2038 += (local433.anInt2756 - local537) * arg1;
									super.anInt2031 += (local436.anInt319 - local537) * arg1;
									super.anInt2028 += (local433.anInt2762 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray463 != null) {
			for (local313 = 0; local313 < local35.anIntArray463.length; local313++) {
				@Pc(743) Class1_Sub1_Sub8 local743 = (Class1_Sub1_Sub8) Static415.aClass23_1.method380((long) local35.anIntArray463[local313]);
				while (local743 != null) {
					@Pc(747) Class18 local747 = local743.aClass18_1;
					local340 = local17 - local743.anInt2761;
					@Pc(757) int local757 = local22 - local743.anInt2759;
					local444 = local27 - local743.anInt2757;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong16) {
						local743 = (Class1_Sub1_Sub8) Static415.aClass23_1.method382();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2756 + local757 * local747.anInt319 + local444 * local743.anInt2762) * 65535L / (long) (local747.anInt312 * local478);
						if (local491 < (long) local747.anInt311) {
							local743 = (Class1_Sub1_Sub8) Static415.aClass23_1.method382();
						} else {
							local501 = 0;
							if (local747.anInt315 == 1) {
								local501 = (local478 >> 4) * local747.anInt320;
							} else if (local747.anInt315 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt320;
							}
							if (local747.anInt316 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt312;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt312;
								local537 = (local444 << 15) / local478 * local747.anInt312;
								if (local747.anInt309 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2038 += local939 * arg1 >> 15;
									super.anInt2031 += local948 * arg1 >> 15;
									super.anInt2028 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt309 == 0) {
								local65 += (local743.anInt2756 - local501) * arg1;
								local82 += (local747.anInt319 - local501) * arg1;
								local99 += (local743.anInt2762 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2038 += (local743.anInt2756 - local501) * arg1;
								super.anInt2031 += (local747.anInt319 - local501) * arg1;
								super.anInt2028 += (local743.anInt2762 - local501) * arg1;
							}
							local743 = (Class1_Sub1_Sub8) Static415.aClass23_1.method382();
						}
					}
				}
			}
		}
		if (local35.anIntArray462 != null) {
			if (local35.anIntArray465 == null) {
				local35.anIntArray465 = new int[local35.anIntArray462.length];
				for (local313 = 0; local313 < local35.anIntArray462.length; local313++) {
					Static448.method5970(local35.anIntArray462[local313]);
					local35.anIntArray465[local313] = ((Class1_Sub37) Static365.aClass51_30.method930((long) local35.anIntArray462[local313])).anInt6451;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray465.length; local313++) {
				@Pc(1082) Class18 local1082 = Static341.aClass18Array1[local35.anIntArray465[local313]];
				if (local1082.anInt309 == 0) {
					local65 += local1082.anInt322 * arg1;
					local82 += local1082.anInt319 * arg1;
					local99 += local1082.anInt306 * arg1;
					local303 = true;
				} else {
					super.anInt2038 += local1082.anInt322 * arg1;
					super.anInt2031 += local1082.anInt319 * arg1;
					super.anInt2028 += local1082.anInt306 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort40 = (short) local65;
					this.aShort36 = (short) local82;
					this.aShort37 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2041 <<= 0x1;
			}
		}
		super.anInt2038 = (int) ((long) super.anInt2038 + ((long) this.aShort40 * (long) this.anInt2041 >> 23) * (long) arg1);
		super.anInt2031 = (int) ((long) super.anInt2031 + ((long) this.aShort36 * (long) this.anInt2041 >> 23) * (long) arg1);
		super.anInt2028 = (int) ((long) super.anInt2028 + ((long) this.aShort37 * (long) this.anInt2041 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(J)V")
	public void method1675(@OriginalArg(0) long arg0) {
		@Pc(6) int local6 = super.anInt2038 >> Static58.anInt1051 + 12;
		@Pc(13) int local13 = super.anInt2028 >> Static58.anInt1051 + 12;
		@Pc(18) int local18 = super.anInt2031 >> Static415.anInt7293;
		if (local18 > 0 || local18 < -262144 || local6 < 0 || local6 >= Static251.anInt4344 || local13 < 0 || local13 >= Static219.anInt3872) {
			this.method1676();
			return;
		}
		@Pc(40) Class36_Sub7 local40 = this.aClass36_Sub6_1.aClass36_Sub7_5;
		@Pc(44) Class210 local44 = this.aClass36_Sub6_1.aClass210_1;
		@Pc(46) Class70[] local46 = Static256.aClass70Array2;
		@Pc(54) int local54 = local46[local40.anInt6158].I(local6, local13);
		@Pc(70) int local70;
		if (local40.anInt6158 < Static29.anInt482 - 1) {
			local70 = local46[local40.anInt6158 + 1].I(local6, local13);
		} else {
			local70 = local54 - (0x8 << Static58.anInt1051);
		}
		if (local44.aBoolean514) {
			if (local44.anInt6401 == -1 && local18 > local54) {
				this.method1676();
				return;
			}
			if (local44.anInt6401 >= 0 && local18 > local46[local44.anInt6401].I(local6, local13)) {
				this.method1676();
				return;
			}
			if (local44.anInt6385 == -1 && local18 < local70) {
				this.method1676();
				return;
			}
			if (local44.anInt6385 >= 0 && local18 < local46[local44.anInt6385 + 1].I(local6, local13)) {
				this.method1676();
				return;
			}
		}
		if (local6 >= local40.anInt6161 && local6 <= local40.anInt6159 && local13 >= local40.anInt6157 && local13 <= local40.anInt6156 && local18 <= local54 && local18 >= local70) {
			local40.aClass101_2.aClass95_1.method1882(this);
			return;
		}
		@Pc(158) int local158;
		for (local158 = Static29.anInt482 - 1; local158 > 0 && local18 > local46[local158].I(local6, local13); local158--) {
		}
		if (local158 == 0 && local18 > local46[0].I(local6, local13)) {
			this.method1676();
		} else if (local158 == Static29.anInt482 - 1 && local46[local158].I(local6, local13) - local18 > 0x8 << Static58.anInt1051) {
			this.method1676();
		} else {
			@Pc(211) Class137 local211 = Static131.aClass137ArrayArrayArray2[local158][local6][local13];
			if (local211 == null) {
				if (local158 == 0) {
					local211 = Static131.aClass137ArrayArrayArray2[0][local6][local13] = new Class137(0, local6, local13);
				}
				@Pc(243) boolean local243 = Static131.aClass137ArrayArrayArray2[0][local6][local13].aClass137_1 != null;
				if (local158 == 3 && local243) {
					this.method1676();
					return;
				}
				for (@Pc(253) int local253 = 1; local253 <= local158; local253++) {
					if (Static131.aClass137ArrayArrayArray2[local253][local6][local13] == null) {
						local211 = Static131.aClass137ArrayArrayArray2[local253][local6][local13] = new Class137(local253, local6, local13);
						if (local243) {
							local211.aByte44++;
						}
					}
				}
			}
			if (local211.aClass101_1 == null) {
				local211.aClass101_1 = new Class101();
				local211.aByte46 = (byte) (arg0 & 0xFFL);
			} else if (local211.aByte46 != (byte) (arg0 & 0xFFL)) {
				local211.aClass101_1.aClass95_1.method1889();
				local211.aClass101_1.aBoolean192 = false;
				local211.aByte46 = (byte) (arg0 & 0xFFL);
			}
			local211.aClass101_1.aClass95_1.method1882(this);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "()V")
	private void method1676() {
		this.aClass36_Sub6_1.aClass36_Sub7_5.aClass36_Sub3_Sub1_Sub1Array3[this.aShort35] = null;
		Static220.aClass36_Sub3_Sub1_Sub1Array2[Static336.anInt6116] = this;
		Static336.anInt6116 = Static336.anInt6116 + 1 & 0x3FF;
		this.method5131();
		this.method1667();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!pq;IIIIIIIIIIIZZ)V")
	public void method1677(@OriginalArg(0) Class36_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) boolean arg13) {
		this.aClass36_Sub6_1 = arg0;
		super.anInt2038 = arg1 << Static415.anInt7293;
		super.anInt2031 = arg2 << Static415.anInt7293;
		super.anInt2028 = arg3 << Static415.anInt7293;
		super.anInt2029 = arg9;
		this.aShort38 = this.aShort39 = (short) arg8;
		super.anInt2034 = arg10;
		super.anInt2036 = arg11;
		super.aBoolean163 = arg13;
		this.aShort40 = (short) arg4;
		this.aShort36 = (short) arg5;
		this.aShort37 = (short) arg6;
		this.anInt2041 = arg7;
		super.aByte26 = this.aClass36_Sub6_1.aClass203_1.aByte90;
		this.method1678();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "()V")
	private void method1678() {
		@Pc(4) int local4 = this.aClass36_Sub6_1.aClass36_Sub7_5.anInt6154;
		if (this.aClass36_Sub6_1.aClass36_Sub7_5.aClass36_Sub3_Sub1_Sub1Array3[local4] != null) {
			this.aClass36_Sub6_1.aClass36_Sub7_5.aClass36_Sub3_Sub1_Sub1Array3[local4].method1676();
		}
		this.aClass36_Sub6_1.aClass36_Sub7_5.aClass36_Sub3_Sub1_Sub1Array3[local4] = this;
		this.aShort35 = (short) this.aClass36_Sub6_1.aClass36_Sub7_5.anInt6154;
		this.aClass36_Sub6_1.aClass36_Sub7_5.anInt6154 = local4 + 1 & 0x1FFF;
		this.aClass36_Sub6_1.aClass242_5.method5501(this);
	}
}
