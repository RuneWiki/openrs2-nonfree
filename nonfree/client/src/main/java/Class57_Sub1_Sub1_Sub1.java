import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class57_Sub1_Sub1_Sub1 extends Class57_Sub1_Sub1 {

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
	private int anInt2805;

	@OriginalMember(owner = "client!hq", name = "L", descriptor = "S")
	private short aShort44;

	@OriginalMember(owner = "client!hq", name = "J", descriptor = "Lclient!mq;")
	private Class57_Sub7 aClass57_Sub7_1;

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "S")
	private short aShort45;

	@OriginalMember(owner = "client!hq", name = "N", descriptor = "S")
	private short aShort46;

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "S")
	private short aShort43;

	@OriginalMember(owner = "client!hq", name = "F", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!hq", name = "G", descriptor = "S")
	private short aShort42;

	@OriginalMember(owner = "client!hq", name = "K", descriptor = "I")
	private int anInt2806;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!mq;IIIIIIIIIIIZ)V")
	public Class57_Sub1_Sub1_Sub1(@OriginalArg(0) Class57_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass57_Sub7_1 = arg0;
		super.anInt2801 = arg1 << Static233.anInt5025;
		super.anInt2802 = arg2 << Static233.anInt5025;
		super.anInt2800 = arg3 << Static233.anInt5025;
		super.anInt2799 = arg9;
		this.aShort46 = this.aShort45 = (short) arg8;
		super.anInt2797 = arg10;
		super.anInt2796 = arg11;
		this.aShort43 = (short) arg4;
		this.aShort41 = (short) arg5;
		this.aShort42 = (short) arg6;
		this.anInt2806 = arg7;
		super.aByte33 = this.aClass57_Sub7_1.aClass197_1.aByte67;
		this.method2543();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "()V")
	private void method2541() {
		this.aClass57_Sub7_1.aClass57_Sub6_3.aClass57_Sub1_Sub1_Sub1Array1[this.aShort44] = null;
		Static269.aClass57_Sub1_Sub1_Sub1Array4[Static122.anInt2597] = this;
		Static122.anInt2597 = Static122.anInt2597 + 1 & 0x3FF;
		this.method5452();
		this.method2539();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(J)V")
	public void method2542(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt2801 >> 19;
		@Pc(9) int local9 = super.anInt2800 >> 19;
		@Pc(14) int local14 = super.anInt2802 >> Static233.anInt5025;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static344.anInt6692 || local9 < 0 || local9 >= Static63.anInt1129) {
			this.method2541();
			return;
		}
		@Pc(36) Class57_Sub6 local36 = this.aClass57_Sub7_1.aClass57_Sub6_3;
		@Pc(40) Class78 local40 = this.aClass57_Sub7_1.aClass78_1;
		@Pc(42) Class105[] local42 = Static9.aClass105Array1;
		@Pc(50) int local50 = local42[local36.anInt4436].method4453(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt4436 < Static32.anInt516 - 1) {
			local66 = local42[local36.anInt4436 + 1].method4453(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean218) {
			if (local40.anInt2240 == -1 && local14 > local50) {
				this.method2541();
				return;
			}
			if (local40.anInt2240 >= 0 && local14 > local42[local40.anInt2240].method4453(local4, local9)) {
				this.method2541();
				return;
			}
			if (local40.anInt2239 == -1 && local14 < local66) {
				this.method2541();
				return;
			}
			if (local40.anInt2239 >= 0 && local14 < local42[local40.anInt2239 + 1].method4453(local4, local9)) {
				this.method2541();
				return;
			}
		}
		if (local4 >= local36.anInt4438 && local4 <= local36.anInt4433 && local9 >= local36.anInt4437 && local9 <= local36.anInt4435 && local14 <= local50 && local14 >= local66) {
			local36.aClass214_2.aClass55_1.method1297(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static32.anInt516 - 1; local152 > 0 && local14 > local42[local152].method4453(local4, local9); local152--) {
		}
		if (local152 == Static32.anInt516 - 1 && local42[local152].method4453(local4, local9) - local14 > 1024) {
			this.method2541();
			return;
		}
		@Pc(190) Class51 local190 = Static196.aClass51ArrayArrayArray3[local152][local4][local9];
		if (local190 == null) {
			@Pc(205) boolean local205 = Static196.aClass51ArrayArrayArray3[0][local4][local9].aClass51_1 != null;
			if (local152 == 3 && local205) {
				this.method2541();
				return;
			}
			for (@Pc(215) int local215 = 1; local215 <= local152; local215++) {
				if (Static196.aClass51ArrayArrayArray3[local215][local4][local9] == null) {
					local190 = Static196.aClass51ArrayArrayArray3[local215][local4][local9] = new Class51(local215, local4, local9);
					if (local205) {
						local190.aByte9++;
					}
				}
			}
		}
		if (local190.aClass214_1 == null) {
			local190.aClass214_1 = new Class214();
			local190.aByte11 = (byte) (arg0 & 0xFFL);
		} else if (local190.aByte11 != (byte) (arg0 & 0xFFL)) {
			local190.aClass214_1 = new Class214();
			local190.aByte11 = (byte) (arg0 & 0xFFL);
		}
		local190.aClass214_1.aClass55_1.method1297(this);
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "()V")
	private void method2543() {
		@Pc(4) int local4 = this.aClass57_Sub7_1.aClass57_Sub6_3.anInt4431;
		if (this.aClass57_Sub7_1.aClass57_Sub6_3.aClass57_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass57_Sub7_1.aClass57_Sub6_3.aClass57_Sub1_Sub1_Sub1Array1[local4].method2541();
		}
		this.aClass57_Sub7_1.aClass57_Sub6_3.aClass57_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort44 = (short) this.aClass57_Sub7_1.aClass57_Sub6_3.anInt4431;
		this.aClass57_Sub7_1.aClass57_Sub6_3.anInt4431 = local4 + 1 & 0x1FFF;
		this.aClass57_Sub7_1.aClass193_7.method5222(this);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(JI)V")
	public void method2544(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort45 = (short) (this.aShort45 - arg1);
		if (this.aShort45 <= 0) {
			this.method2541();
			return;
		}
		@Pc(17) int local17 = super.anInt2801 >> Static233.anInt5025;
		@Pc(22) int local22 = super.anInt2802 >> Static233.anInt5025;
		@Pc(27) int local27 = super.anInt2800 >> Static233.anInt5025;
		@Pc(31) Class57_Sub6 local31 = this.aClass57_Sub7_1.aClass57_Sub6_3;
		@Pc(35) Class78 local35 = this.aClass57_Sub7_1.aClass78_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt2225 != 0) {
			if (this.aShort46 - this.aShort45 <= local35.anInt2222) {
				local65 = (super.anInt2799 >> 8 & 0xFF00) + (this.anInt2805 >> 16 & 0xFF) + local35.anInt2227 * arg1;
				local82 = (super.anInt2799 & 0xFF00) + (this.anInt2805 >> 8 & 0xFF) + local35.anInt2252 * arg1;
				local99 = ((super.anInt2799 & 0xFF) << 8) + (this.anInt2805 & 0xFF) + local35.anInt2219 * arg1;
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
				super.anInt2799 &= 0xFF000000;
				super.anInt2799 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2805 &= 0xFF000000;
				this.anInt2805 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort46 - this.aShort45 <= local35.anInt2251) {
				local65 = (super.anInt2799 >> 16 & 0xFF00) + (this.anInt2805 >> 24 & 0xFF) + local35.anInt2269 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2799 &= 0xFFFFFF;
				super.anInt2799 |= (local65 & 0xFF00) << 16;
				this.anInt2805 &= 0xFFFFFF;
				this.anInt2805 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt2241 != -1 && this.aShort46 - this.aShort45 <= local35.anInt2255) {
			this.anInt2806 += local35.anInt2238 * arg1;
		}
		if (local35.anInt2244 != -1 && this.aShort46 - this.aShort45 <= local35.anInt2257) {
			super.anInt2797 += local35.anInt2242 * arg1;
		}
		local65 = this.aShort43;
		local82 = this.aShort41;
		local99 = this.aShort42;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt2218 == 1) {
			local313 = local17 - this.aClass57_Sub7_1.anInt4554;
			local319 = local22 - this.aClass57_Sub7_1.anInt4567;
			local325 = local27 - this.aClass57_Sub7_1.anInt4542;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt2264 * local340 * arg1;
			this.anInt2806 = (int) ((long) this.anInt2806 - ((long) this.anInt2806 * local348 >> 18));
		} else if (local35.anInt2218 == 2) {
			local313 = local17 - this.aClass57_Sub7_1.anInt4554;
			local319 = local22 - this.aClass57_Sub7_1.anInt4567;
			local325 = local27 - this.aClass57_Sub7_1.anInt4542;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt2264 * local340 * arg1;
			this.anInt2806 = (int) ((long) this.anInt2806 - ((long) this.anInt2806 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray180 != null) {
			@Pc(426) Class2 local426 = local31.aClass180_26.aClass2_207;
			for (@Pc(429) Class2 local429 = local426.aClass2_251; local429 != local426; local429 = local429.aClass2_251) {
				@Pc(433) Class2_Sub9_Sub19 local433 = (Class2_Sub9_Sub19) local429;
				@Pc(436) Class202 local436 = local433.aClass202_1;
				if (local436.anInt6348 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray180.length; local444++) {
						if (local35.anIntArray180[local444] == local436.anInt6353) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt5725;
						@Pc(473) int local473 = local22 - local433.anInt5718;
						local478 = local27 - local433.anInt5719;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong198) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt5720 + local473 * local436.anInt6344 + local478 * local433.anInt5727) * 65535L / (long) (local436.anInt6351 * local501);
							if (local529 >= (long) local436.anInt6342) {
								local537 = 0;
								if (local436.anInt6347 == 1) {
									local537 = (local501 >> 4) * local436.anInt6340;
								} else if (local436.anInt6347 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt6340;
								}
								if (local436.anInt6339 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt6351;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt6351;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt6351;
									if (local436.anInt6345 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2801 += local643 * arg1 >> 15;
										super.anInt2802 += local652 * arg1 >> 15;
										super.anInt2800 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt6345 == 0) {
									local65 += (local433.anInt5720 - local537) * arg1;
									local82 += (local436.anInt6344 - local537) * arg1;
									local99 += (local433.anInt5727 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2801 += (local433.anInt5720 - local537) * arg1;
									super.anInt2802 += (local436.anInt6344 - local537) * arg1;
									super.anInt2800 += (local433.anInt5727 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray177 != null) {
			for (local313 = 0; local313 < local35.anIntArray177.length; local313++) {
				@Pc(743) Class2_Sub9_Sub19 local743 = (Class2_Sub9_Sub19) Static176.aClass65_1.method1746((long) local35.anIntArray177[local313]);
				while (local743 != null) {
					@Pc(747) Class202 local747 = local743.aClass202_1;
					local340 = local17 - local743.anInt5725;
					@Pc(757) int local757 = local22 - local743.anInt5718;
					local444 = local27 - local743.anInt5719;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong198) {
						local743 = (Class2_Sub9_Sub19) Static176.aClass65_1.method1741();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt5720 + local757 * local747.anInt6344 + local444 * local743.anInt5727) * 65535L / (long) (local747.anInt6351 * local478);
						if (local491 < (long) local747.anInt6342) {
							local743 = (Class2_Sub9_Sub19) Static176.aClass65_1.method1741();
						} else {
							local501 = 0;
							if (local747.anInt6347 == 1) {
								local501 = (local478 >> 4) * local747.anInt6340;
							} else if (local747.anInt6347 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt6340;
							}
							if (local747.anInt6339 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt6351;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt6351;
								local537 = (local444 << 15) / local478 * local747.anInt6351;
								if (local747.anInt6345 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2801 += local939 * arg1 >> 15;
									super.anInt2802 += local948 * arg1 >> 15;
									super.anInt2800 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt6345 == 0) {
								local65 += (local743.anInt5720 - local501) * arg1;
								local82 += (local747.anInt6344 - local501) * arg1;
								local99 += (local743.anInt5727 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2801 += (local743.anInt5720 - local501) * arg1;
								super.anInt2802 += (local747.anInt6344 - local501) * arg1;
								super.anInt2800 += (local743.anInt5727 - local501) * arg1;
							}
							local743 = (Class2_Sub9_Sub19) Static176.aClass65_1.method1741();
						}
					}
				}
			}
		}
		if (local35.anIntArray181 != null) {
			if (local35.anIntArray179 == null) {
				local35.anIntArray179 = new int[local35.anIntArray181.length];
				for (local313 = 0; local313 < local35.anIntArray181.length; local313++) {
					Static355.method5672(local35.anIntArray181[local313]);
					local35.anIntArray179[local313] = ((Class2_Sub23) Static218.aClass41_27.method902((long) local35.anIntArray181[local313])).anInt3818;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray179.length; local313++) {
				@Pc(1082) Class202 local1082 = Static16.aClass202Array1[local35.anIntArray179[local313]];
				if (local1082.anInt6345 == 0) {
					local65 += local1082.anInt6352 * arg1;
					local82 += local1082.anInt6344 * arg1;
					local99 += local1082.anInt6346 * arg1;
					local303 = true;
				} else {
					super.anInt2801 += local1082.anInt6352 * arg1;
					super.anInt2802 += local1082.anInt6344 * arg1;
					super.anInt2800 += local1082.anInt6346 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort43 = (short) local65;
					this.aShort41 = (short) local82;
					this.aShort42 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2806 <<= 0x1;
			}
		}
		super.anInt2801 = (int) ((long) super.anInt2801 + ((long) this.aShort43 * (long) this.anInt2806 >> 23) * (long) arg1);
		super.anInt2802 = (int) ((long) super.anInt2802 + ((long) this.aShort41 * (long) this.anInt2806 >> 23) * (long) arg1);
		super.anInt2800 = (int) ((long) super.anInt2800 + ((long) this.aShort42 * (long) this.anInt2806 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!mq;IIIIIIIIIIIZ)V")
	public void method2545(@OriginalArg(0) Class57_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass57_Sub7_1 = arg0;
		super.anInt2801 = arg1 << Static233.anInt5025;
		super.anInt2802 = arg2 << Static233.anInt5025;
		super.anInt2800 = arg3 << Static233.anInt5025;
		super.anInt2799 = arg9;
		this.aShort46 = this.aShort45 = (short) arg8;
		super.anInt2797 = arg10;
		super.anInt2796 = arg11;
		this.aShort43 = (short) arg4;
		this.aShort41 = (short) arg5;
		this.aShort42 = (short) arg6;
		this.anInt2806 = arg7;
		super.aByte33 = this.aClass57_Sub7_1.aClass197_1.aByte67;
		this.method2543();
	}
}
