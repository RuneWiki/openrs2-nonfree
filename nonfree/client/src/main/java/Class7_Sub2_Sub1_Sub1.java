import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class7_Sub2_Sub1_Sub1 extends Class7_Sub2_Sub1 {

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
	private int anInt966;

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "Lclient!hk;")
	private Class7_Sub5 aClass7_Sub5_1;

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "S")
	private short aShort20;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "S")
	private short aShort21;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lclient!hk;IIIIIIIIIIIZ)V")
	public Class7_Sub2_Sub1_Sub1(@OriginalArg(0) Class7_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass7_Sub5_1 = arg0;
		super.anInt955 = arg1 << Static142.anInt2785;
		super.anInt965 = arg2 << Static142.anInt2785;
		super.anInt963 = arg3 << Static142.anInt2785;
		super.anInt959 = arg9;
		this.aShort20 = this.aShort25 = (short) arg8;
		super.anInt964 = arg10;
		super.anInt958 = arg11;
		this.aShort24 = (short) arg4;
		this.aShort21 = (short) arg5;
		this.aShort22 = (short) arg6;
		this.anInt967 = arg7;
		super.aByte10 = this.aClass7_Sub5_1.aClass100_1.aByte42;
		this.method748();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
	private void method748() {
		@Pc(4) int local4 = this.aClass7_Sub5_1.aClass7_Sub7_5.anInt3321;
		if (this.aClass7_Sub5_1.aClass7_Sub7_5.aClass7_Sub2_Sub1_Sub1Array2[local4] != null) {
			this.aClass7_Sub5_1.aClass7_Sub7_5.aClass7_Sub2_Sub1_Sub1Array2[local4].method752();
		}
		this.aClass7_Sub5_1.aClass7_Sub7_5.aClass7_Sub2_Sub1_Sub1Array2[local4] = this;
		this.aShort23 = (short) this.aClass7_Sub5_1.aClass7_Sub7_5.anInt3321;
		this.aClass7_Sub5_1.aClass7_Sub7_5.anInt3321 = local4 + 1 & 0x1FFF;
		this.aClass7_Sub5_1.aClass122_3.method2624(this);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!hk;IIIIIIIIIIIZ)V")
	public void method749(@OriginalArg(0) Class7_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass7_Sub5_1 = arg0;
		super.anInt955 = arg1 << Static142.anInt2785;
		super.anInt965 = arg2 << Static142.anInt2785;
		super.anInt963 = arg3 << Static142.anInt2785;
		super.anInt959 = arg9;
		this.aShort20 = this.aShort25 = (short) arg8;
		super.anInt964 = arg10;
		super.anInt958 = arg11;
		this.aShort24 = (short) arg4;
		this.aShort21 = (short) arg5;
		this.aShort22 = (short) arg6;
		this.anInt967 = arg7;
		super.aByte10 = this.aClass7_Sub5_1.aClass100_1.aByte42;
		this.method748();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(JI)V")
	public void method750(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort25 = (short) (this.aShort25 - arg1);
		if (this.aShort25 <= 0) {
			this.method752();
			return;
		}
		@Pc(17) int local17 = super.anInt955 >> Static142.anInt2785;
		@Pc(22) int local22 = super.anInt965 >> Static142.anInt2785;
		@Pc(27) int local27 = super.anInt963 >> Static142.anInt2785;
		@Pc(31) Class7_Sub7 local31 = this.aClass7_Sub5_1.aClass7_Sub7_5;
		@Pc(35) Class95 local35 = this.aClass7_Sub5_1.aClass95_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt2179 != 0) {
			if (this.aShort20 - this.aShort25 <= local35.anInt2219) {
				local65 = (super.anInt959 >> 8 & 0xFF00) + (this.anInt966 >> 16 & 0xFF) + local35.anInt2182 * arg1;
				local82 = (super.anInt959 & 0xFF00) + (this.anInt966 >> 8 & 0xFF) + local35.anInt2180 * arg1;
				local99 = ((super.anInt959 & 0xFF) << 8) + (this.anInt966 & 0xFF) + local35.anInt2198 * arg1;
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
				super.anInt959 &= 0xFF000000;
				super.anInt959 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt966 &= 0xFF000000;
				this.anInt966 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort20 - this.aShort25 <= local35.anInt2173) {
				local65 = (super.anInt959 >> 16 & 0xFF00) + (this.anInt966 >> 24 & 0xFF) + local35.anInt2183 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt959 &= 0xFFFFFF;
				super.anInt959 |= (local65 & 0xFF00) << 16;
				this.anInt966 &= 0xFFFFFF;
				this.anInt966 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2168 != -1 && this.aShort20 - this.aShort25 <= local35.anInt2221) {
			this.anInt967 += local35.anInt2185 * arg1;
		}
		if (local35.anInt2169 != -1 && this.aShort20 - this.aShort25 <= local35.anInt2224) {
			super.anInt964 += local35.anInt2217 * arg1;
		}
		local65 = this.aShort24;
		local82 = this.aShort21;
		local99 = this.aShort22;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt2189 == 1) {
			local313 = local17 - this.aClass7_Sub5_1.anInt2251;
			local319 = local22 - this.aClass7_Sub5_1.anInt2267;
			local325 = local27 - this.aClass7_Sub5_1.anInt2256;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt2214 * local340 * arg1;
			this.anInt967 = (int) ((long) this.anInt967 - ((long) this.anInt967 * local348 >> 18));
		} else if (local35.anInt2189 == 2) {
			local313 = local17 - this.aClass7_Sub5_1.anInt2251;
			local319 = local22 - this.aClass7_Sub5_1.anInt2267;
			local325 = local27 - this.aClass7_Sub5_1.anInt2256;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt2214 * local340 * arg1;
			this.anInt967 = (int) ((long) this.anInt967 - ((long) this.anInt967 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray189 != null) {
			@Pc(426) Class1 local426 = local31.aClass14_12.aClass1_17;
			for (@Pc(429) Class1 local429 = local426.aClass1_247; local429 != local426; local429 = local429.aClass1_247) {
				@Pc(433) Class1_Sub2_Sub17 local433 = (Class1_Sub2_Sub17) local429;
				@Pc(436) Class112 local436 = local433.aClass112_1;
				if (local436.anInt2682 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray189.length; local444++) {
						if (local35.anIntArray189[local444] == local436.anInt2689) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt5764;
						@Pc(473) int local473 = local22 - local433.anInt5755;
						local478 = local27 - local433.anInt5754;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong71) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt5756 + local473 * local436.anInt2683 + local478 * local433.anInt5761) * 65535L / (long) (local436.anInt2691 * local501);
							if (local529 >= (long) local436.anInt2680) {
								local537 = 0;
								if (local436.anInt2679 == 1) {
									local537 = (local501 >> 4) * local436.anInt2690;
								} else if (local436.anInt2679 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt2690;
								}
								if (local436.anInt2681 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt2691;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt2691;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt2691;
									if (local436.anInt2688 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt955 += local643 * arg1 >> 15;
										super.anInt965 += local652 * arg1 >> 15;
										super.anInt963 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt2688 == 0) {
									local65 += (local433.anInt5756 - local537) * arg1;
									local82 += (local436.anInt2683 - local537) * arg1;
									local99 += (local433.anInt5761 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt955 += (local433.anInt5756 - local537) * arg1;
									super.anInt965 += (local436.anInt2683 - local537) * arg1;
									super.anInt963 += (local433.anInt5761 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray190 != null) {
			for (local313 = 0; local313 < local35.anIntArray190.length; local313++) {
				@Pc(743) Class1_Sub2_Sub17 local743 = (Class1_Sub2_Sub17) Static60.aClass6_1.method39((long) local35.anIntArray190[local313]);
				while (local743 != null) {
					@Pc(747) Class112 local747 = local743.aClass112_1;
					local340 = local17 - local743.anInt5764;
					@Pc(757) int local757 = local22 - local743.anInt5755;
					local444 = local27 - local743.anInt5754;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong71) {
						local743 = (Class1_Sub2_Sub17) Static60.aClass6_1.method38();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt5756 + local757 * local747.anInt2683 + local444 * local743.anInt5761) * 65535L / (long) (local747.anInt2691 * local478);
						if (local491 < (long) local747.anInt2680) {
							local743 = (Class1_Sub2_Sub17) Static60.aClass6_1.method38();
						} else {
							local501 = 0;
							if (local747.anInt2679 == 1) {
								local501 = (local478 >> 4) * local747.anInt2690;
							} else if (local747.anInt2679 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt2690;
							}
							if (local747.anInt2681 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt2691;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt2691;
								local537 = (local444 << 15) / local478 * local747.anInt2691;
								if (local747.anInt2688 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt955 += local939 * arg1 >> 15;
									super.anInt965 += local948 * arg1 >> 15;
									super.anInt963 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt2688 == 0) {
								local65 += (local743.anInt5756 - local501) * arg1;
								local82 += (local747.anInt2683 - local501) * arg1;
								local99 += (local743.anInt5761 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt955 += (local743.anInt5756 - local501) * arg1;
								super.anInt965 += (local747.anInt2683 - local501) * arg1;
								super.anInt963 += (local743.anInt5761 - local501) * arg1;
							}
							local743 = (Class1_Sub2_Sub17) Static60.aClass6_1.method38();
						}
					}
				}
			}
		}
		if (local35.anIntArray191 != null) {
			if (local35.anIntArray192 == null) {
				local35.anIntArray192 = new int[local35.anIntArray191.length];
				for (local313 = 0; local313 < local35.anIntArray191.length; local313++) {
					Static275.method4910(local35.anIntArray191[local313]);
					local35.anIntArray192[local313] = ((Class1_Sub14) Static241.aClass207_30.method5555((long) local35.anIntArray191[local313])).anInt1474;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray192.length; local313++) {
				@Pc(1082) Class112 local1082 = Static327.aClass112Array1[local35.anIntArray192[local313]];
				if (local1082.anInt2688 == 0) {
					local65 += local1082.anInt2696 * arg1;
					local82 += local1082.anInt2683 * arg1;
					local99 += local1082.anInt2686 * arg1;
					local303 = true;
				} else {
					super.anInt955 += local1082.anInt2696 * arg1;
					super.anInt965 += local1082.anInt2683 * arg1;
					super.anInt963 += local1082.anInt2686 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort24 = (short) local65;
					this.aShort21 = (short) local82;
					this.aShort22 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt967 <<= 0x1;
			}
		}
		super.anInt955 = (int) ((long) super.anInt955 + ((long) this.aShort24 * (long) this.anInt967 >> 23) * (long) arg1);
		super.anInt965 = (int) ((long) super.anInt965 + ((long) this.aShort21 * (long) this.anInt967 >> 23) * (long) arg1);
		super.anInt963 = (int) ((long) super.anInt963 + ((long) this.aShort22 * (long) this.anInt967 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(J)V")
	public void method751(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt955 >> 19;
		@Pc(9) int local9 = super.anInt963 >> 19;
		@Pc(14) int local14 = super.anInt965 >> Static142.anInt2785;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static97.anInt1852 || local9 < 0 || local9 >= Static3.anInt38) {
			this.method752();
			return;
		}
		@Pc(36) Class7_Sub7 local36 = this.aClass7_Sub5_1.aClass7_Sub7_5;
		@Pc(40) Class95 local40 = this.aClass7_Sub5_1.aClass95_1;
		@Pc(42) Class12[] local42 = Static263.aClass12Array2;
		@Pc(50) int local50 = local42[local36.anInt3323].method2704(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt3323 < 3) {
			local64 = local42[local36.anInt3323 + 1].method2704(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean180) {
			if (local40.anInt2211 == -1 && local14 > local50) {
				this.method752();
				return;
			}
			if (local40.anInt2211 >= 0 && local14 > local42[local40.anInt2211].method2704(local4, local9)) {
				this.method752();
				return;
			}
			if (local40.anInt2216 == -1 && local14 < local64) {
				this.method752();
				return;
			}
			if (local40.anInt2216 >= 0 && local14 < local42[local40.anInt2216 + 1].method2704(local4, local9)) {
				this.method752();
				return;
			}
		}
		if (local4 >= local36.anInt3324 && local4 <= local36.anInt3327 && local9 >= local36.anInt3325 && local9 <= local36.anInt3327 && local14 <= local50 && local14 >= local64) {
			local36.aClass153_2.aClass55_1.method1215(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method2704(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method2704(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method2704(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method2704(local4, local9) - 1024) {
			this.method752();
			return;
		}
		@Pc(202) Class83 local202 = Static347.aClass83ArrayArrayArray3[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static347.aClass83ArrayArrayArray3[0][local4][local9].aClass83_1 != null;
			if (local148 == 3 && local217) {
				this.method752();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static347.aClass83ArrayArrayArray3[local227][local4][local9] == null) {
					local202 = Static347.aClass83ArrayArrayArray3[local227][local4][local9] = new Class83(local227, local4, local9);
					if (local217) {
						local202.aByte27++;
					}
				}
			}
		}
		if (local202.aClass153_1 == null) {
			local202.aClass153_1 = new Class153();
			local202.aByte26 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte26 != (byte) (arg0 & 0xFFL)) {
			local202.aClass153_1 = new Class153();
			local202.aByte26 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass153_1.aClass55_1.method1215(this);
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "()V")
	private void method752() {
		this.aClass7_Sub5_1.aClass7_Sub7_5.aClass7_Sub2_Sub1_Sub1Array2[this.aShort23] = null;
		Static35.aClass7_Sub2_Sub1_Sub1Array1[Static331.anInt3768] = this;
		Static331.anInt3768 = Static331.anInt3768 + 1 & 0x3FF;
		this.method3450();
		this.method740();
	}
}
