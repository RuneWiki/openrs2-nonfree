import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class10_Sub3_Sub1_Sub1 extends Class10_Sub3_Sub1 {

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "Lclient!me;")
	private Class10_Sub4 aClass10_Sub4_1;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "S")
	private short aShort16;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "S")
	private short aShort17;

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
	private int anInt2121;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!me;IIIIIIIIIIIZ)V")
	public Class10_Sub3_Sub1_Sub1(@OriginalArg(0) Class10_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass10_Sub4_1 = arg0;
		super.anInt2111 = arg1 << Static6.anInt4020;
		super.anInt2110 = arg2 << Static6.anInt4020;
		super.anInt2119 = arg3 << Static6.anInt4020;
		super.anInt2113 = arg9;
		this.aShort14 = this.aShort16 = (short) arg8;
		super.anInt2117 = arg10;
		super.anInt2115 = arg11;
		this.aShort13 = (short) arg4;
		this.aShort12 = (short) arg5;
		this.aShort17 = (short) arg6;
		this.anInt2121 = arg7;
		super.aByte16 = this.aClass10_Sub4_1.aClass174_1.aByte69;
		this.method1716();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JI)V")
	public void method1715(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort16 = (short) (this.aShort16 - arg1);
		if (this.aShort16 <= 0) {
			this.method1717();
			return;
		}
		@Pc(17) int local17 = super.anInt2111 >> Static6.anInt4020;
		@Pc(22) int local22 = super.anInt2110 >> Static6.anInt4020;
		@Pc(27) int local27 = super.anInt2119 >> Static6.anInt4020;
		@Pc(31) Class10_Sub2 local31 = this.aClass10_Sub4_1.aClass10_Sub2_5;
		@Pc(35) Class190 local35 = this.aClass10_Sub4_1.aClass190_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.lb != 0) {
			if (this.aShort14 - this.aShort16 <= local35.anInt5993) {
				local65 = (super.anInt2113 >> 8 & 0xFF00) + (this.anInt2120 >> 16 & 0xFF) + local35.anInt5986 * arg1;
				local82 = (super.anInt2113 & 0xFF00) + (this.anInt2120 >> 8 & 0xFF) + local35.anInt6025 * arg1;
				local99 = ((super.anInt2113 & 0xFF) << 8) + (this.anInt2120 & 0xFF) + local35.anInt5984 * arg1;
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
				super.anInt2113 &= 0xFF000000;
				super.anInt2113 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt2120 &= 0xFF000000;
				this.anInt2120 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort14 - this.aShort16 <= local35.anInt5990) {
				local65 = (super.anInt2113 >> 16 & 0xFF00) + (this.anInt2120 >> 24 & 0xFF) + local35.anInt6031 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt2113 &= 0xFFFFFF;
				super.anInt2113 |= (local65 & 0xFF00) << 16;
				this.anInt2120 &= 0xFFFFFF;
				this.anInt2120 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt6009 != -1 && this.aShort14 - this.aShort16 <= local35.anInt6022) {
			this.anInt2121 += local35.anInt5994 * arg1;
		}
		if (local35.anInt6020 != -1 && this.aShort14 - this.aShort16 <= local35.anInt6029) {
			super.anInt2117 += local35.anInt6014 * arg1;
		}
		local65 = this.aShort13;
		local82 = this.aShort12;
		local99 = this.aShort17;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt6027 == 1) {
			local313 = local17 - this.aClass10_Sub4_1.anInt3876;
			local319 = local22 - this.aClass10_Sub4_1.anInt3873;
			local325 = local27 - this.aClass10_Sub4_1.anInt3875;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt6032 * local340 * arg1;
			this.anInt2121 = (int) ((long) this.anInt2121 - ((long) this.anInt2121 * local348 >> 18));
		} else if (local35.anInt6027 == 2) {
			local313 = local17 - this.aClass10_Sub4_1.anInt3876;
			local319 = local22 - this.aClass10_Sub4_1.anInt3873;
			local325 = local27 - this.aClass10_Sub4_1.anInt3875;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt6032 * local340 * arg1;
			this.anInt2121 = (int) ((long) this.anInt2121 - ((long) this.anInt2121 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray491 != null) {
			@Pc(426) Class11 local426 = local31.aClass16_12.aClass11_9;
			for (@Pc(429) Class11 local429 = local426.aClass11_251; local429 != local426; local429 = local429.aClass11_251) {
				@Pc(433) Class11_Sub4_Sub20 local433 = (Class11_Sub4_Sub20) local429;
				@Pc(436) Class43 local436 = local433.aClass43_1;
				if (local436.anInt894 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray491.length; local444++) {
						if (local35.anIntArray491[local444] == local436.anInt900) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt6448;
						@Pc(473) int local473 = local22 - local433.anInt6446;
						local478 = local27 - local433.anInt6441;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong27) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt6443 + local473 * local436.anInt906 + local478 * local433.anInt6442) * 65535L / (long) (local436.anInt891 * local501);
							if (local529 >= (long) local436.anInt902) {
								local537 = 0;
								if (local436.anInt898 == 1) {
									local537 = (local501 >> 4) * local436.anInt903;
								} else if (local436.anInt898 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt903;
								}
								if (local436.anInt901 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt891;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt891;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt891;
									if (local436.anInt897 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt2111 += local643 * arg1 >> 15;
										super.anInt2110 += local652 * arg1 >> 15;
										super.anInt2119 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt897 == 0) {
									local65 += (local433.anInt6443 - local537) * arg1;
									local82 += (local436.anInt906 - local537) * arg1;
									local99 += (local433.anInt6442 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt2111 += (local433.anInt6443 - local537) * arg1;
									super.anInt2110 += (local436.anInt906 - local537) * arg1;
									super.anInt2119 += (local433.anInt6442 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray493 != null) {
			for (local313 = 0; local313 < local35.anIntArray493.length; local313++) {
				@Pc(743) Class11_Sub4_Sub20 local743 = (Class11_Sub4_Sub20) Static213.aClass201_1.method5385((long) local35.anIntArray493[local313]);
				while (local743 != null) {
					@Pc(747) Class43 local747 = local743.aClass43_1;
					local340 = local17 - local743.anInt6448;
					@Pc(757) int local757 = local22 - local743.anInt6446;
					local444 = local27 - local743.anInt6441;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong27) {
						local743 = (Class11_Sub4_Sub20) Static213.aClass201_1.method5382();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt6443 + local757 * local747.anInt906 + local444 * local743.anInt6442) * 65535L / (long) (local747.anInt891 * local478);
						if (local491 < (long) local747.anInt902) {
							local743 = (Class11_Sub4_Sub20) Static213.aClass201_1.method5382();
						} else {
							local501 = 0;
							if (local747.anInt898 == 1) {
								local501 = (local478 >> 4) * local747.anInt903;
							} else if (local747.anInt898 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt903;
							}
							if (local747.anInt901 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt891;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt891;
								local537 = (local444 << 15) / local478 * local747.anInt891;
								if (local747.anInt897 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt2111 += local939 * arg1 >> 15;
									super.anInt2110 += local948 * arg1 >> 15;
									super.anInt2119 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt897 == 0) {
								local65 += (local743.anInt6443 - local501) * arg1;
								local82 += (local747.anInt906 - local501) * arg1;
								local99 += (local743.anInt6442 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt2111 += (local743.anInt6443 - local501) * arg1;
								super.anInt2110 += (local747.anInt906 - local501) * arg1;
								super.anInt2119 += (local743.anInt6442 - local501) * arg1;
							}
							local743 = (Class11_Sub4_Sub20) Static213.aClass201_1.method5382();
						}
					}
				}
			}
		}
		if (local35.anIntArray494 != null) {
			if (local35.anIntArray492 == null) {
				local35.anIntArray492 = new int[local35.anIntArray494.length];
				for (local313 = 0; local313 < local35.anIntArray494.length; local313++) {
					Static261.method4536(local35.anIntArray494[local313]);
					local35.anIntArray492[local313] = ((Class11_Sub33) Static270.aClass58_32.method1009((long) local35.anIntArray494[local313])).anInt5153;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray492.length; local313++) {
				@Pc(1082) Class43 local1082 = Static191.aClass43Array3[local35.anIntArray492[local313]];
				if (local1082.anInt897 == 0) {
					local65 += local1082.anInt899 * arg1;
					local82 += local1082.anInt906 * arg1;
					local99 += local1082.anInt895 * arg1;
					local303 = true;
				} else {
					super.anInt2111 += local1082.anInt899 * arg1;
					super.anInt2110 += local1082.anInt906 * arg1;
					super.anInt2119 += local1082.anInt895 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort13 = (short) local65;
					this.aShort12 = (short) local82;
					this.aShort17 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt2121 <<= 0x1;
			}
		}
		super.anInt2111 = (int) ((long) super.anInt2111 + ((long) this.aShort13 * (long) this.anInt2121 >> 23) * (long) arg1);
		super.anInt2110 = (int) ((long) super.anInt2110 + ((long) this.aShort12 * (long) this.anInt2121 >> 23) * (long) arg1);
		super.anInt2119 = (int) ((long) super.anInt2119 + ((long) this.aShort17 * (long) this.anInt2121 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
	private void method1716() {
		@Pc(4) int local4 = this.aClass10_Sub4_1.aClass10_Sub2_5.anInt1230;
		if (this.aClass10_Sub4_1.aClass10_Sub2_5.aClass10_Sub3_Sub1_Sub1Array1[local4] != null) {
			this.aClass10_Sub4_1.aClass10_Sub2_5.aClass10_Sub3_Sub1_Sub1Array1[local4].method1717();
		}
		this.aClass10_Sub4_1.aClass10_Sub2_5.aClass10_Sub3_Sub1_Sub1Array1[local4] = this;
		this.aShort15 = (short) this.aClass10_Sub4_1.aClass10_Sub2_5.anInt1230;
		this.aClass10_Sub4_1.aClass10_Sub2_5.anInt1230 = local4 + 1 & 0x1FFF;
		this.aClass10_Sub4_1.aClass210_10.method5612(this);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
	private void method1717() {
		this.aClass10_Sub4_1.aClass10_Sub2_5.aClass10_Sub3_Sub1_Sub1Array1[this.aShort15] = null;
		Static190.aClass10_Sub3_Sub1_Sub1Array2[Static318.anInt6177] = this;
		Static318.anInt6177 = Static318.anInt6177 + 1 & 0x3FF;
		this.method5452();
		this.method1706();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(J)V")
	public void method1718(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt2111 >> 19;
		@Pc(9) int local9 = super.anInt2119 >> 19;
		@Pc(14) int local14 = super.anInt2110 >> Static6.anInt4020;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static232.anInt4703 || local9 < 0 || local9 >= Static300.anInt5931) {
			this.method1717();
			return;
		}
		@Pc(36) Class10_Sub2 local36 = this.aClass10_Sub4_1.aClass10_Sub2_5;
		@Pc(40) Class190 local40 = this.aClass10_Sub4_1.aClass190_1;
		@Pc(42) Class77[] local42 = Static108.aClass77Array2;
		@Pc(50) int local50 = local42[local36.anInt1232].method4122(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt1232 < 3) {
			local64 = local42[local36.anInt1232 + 1].method4122(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean400) {
			if (local40.anInt6006 == -1 && local14 > local50) {
				this.method1717();
				return;
			}
			if (local40.anInt6006 >= 0 && local14 > local42[local40.anInt6006].method4122(local4, local9)) {
				this.method1717();
				return;
			}
			if (local40.anInt5999 == -1 && local14 < local64) {
				this.method1717();
				return;
			}
			if (local40.anInt5999 >= 0 && local14 < local42[local40.anInt5999 + 1].method4122(local4, local9)) {
				this.method1717();
				return;
			}
		}
		if (local4 >= local36.anInt1235 && local4 <= local36.anInt1234 && local9 >= local36.anInt1236 && local9 <= local36.anInt1234 && local14 <= local50 && local14 >= local64) {
			local36.aClass136_1.aClass104_1.method2129(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method4122(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method4122(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method4122(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method4122(local4, local9) - 1024) {
			this.method1717();
			return;
		}
		@Pc(202) Class106 local202 = Static212.aClass106ArrayArrayArray2[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static212.aClass106ArrayArrayArray2[0][local4][local9].aClass106_1 != null;
			if (local148 == 3 && local217) {
				this.method1717();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static212.aClass106ArrayArrayArray2[local227][local4][local9] == null) {
					local202 = Static212.aClass106ArrayArrayArray2[local227][local4][local9] = new Class106(local227, local4, local9);
					if (local217) {
						local202.aByte26++;
					}
				}
			}
		}
		if (local202.aClass136_2 == null) {
			local202.aClass136_2 = new Class136();
			local202.aByte29 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte29 != (byte) (arg0 & 0xFFL)) {
			local202.aClass136_2 = new Class136();
			local202.aByte29 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass136_2.aClass104_1.method2129(this);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!me;IIIIIIIIIIIZ)V")
	public void method1719(@OriginalArg(0) Class10_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass10_Sub4_1 = arg0;
		super.anInt2111 = arg1 << Static6.anInt4020;
		super.anInt2110 = arg2 << Static6.anInt4020;
		super.anInt2119 = arg3 << Static6.anInt4020;
		super.anInt2113 = arg9;
		this.aShort14 = this.aShort16 = (short) arg8;
		super.anInt2117 = arg10;
		super.anInt2115 = arg11;
		this.aShort13 = (short) arg4;
		this.aShort12 = (short) arg5;
		this.aShort17 = (short) arg6;
		this.anInt2121 = arg7;
		super.aByte16 = this.aClass10_Sub4_1.aClass174_1.aByte69;
		this.method1716();
	}
}
