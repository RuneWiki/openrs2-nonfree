import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class10_Sub8_Sub1_Sub1 extends Class10_Sub8_Sub1 {

	@OriginalMember(owner = "client!si", name = "A", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!si", name = "C", descriptor = "I")
	private int anInt5305;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "Lclient!j;")
	private Class10_Sub5 aClass10_Sub5_1;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!si", name = "y", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!si", name = "G", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!si", name = "z", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!si", name = "E", descriptor = "I")
	private int anInt5306;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!j;IIIIIIIIIIIZ)V")
	public Class10_Sub8_Sub1_Sub1(@OriginalArg(0) Class10_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass10_Sub5_1 = arg0;
		super.anInt5294 = arg1 << Static168.anInt3227;
		super.anInt5295 = arg2 << Static168.anInt3227;
		super.anInt5296 = arg3 << Static168.anInt3227;
		super.anInt5301 = arg9;
		this.aShort70 = this.aShort71 = (short) arg8;
		super.anInt5302 = arg10;
		super.anInt5303 = arg11;
		this.aShort67 = (short) arg4;
		this.aShort72 = (short) arg5;
		this.aShort68 = (short) arg6;
		this.anInt5306 = arg7;
		super.aByte53 = this.aClass10_Sub5_1.aClass176_1.aByte47;
		this.method4619();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(JI)V")
	public void method4615(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort71 = (short) (this.aShort71 - arg1);
		if (this.aShort71 <= 0) {
			this.method4618();
			return;
		}
		@Pc(17) int local17 = super.anInt5294 >> Static168.anInt3227;
		@Pc(22) int local22 = super.anInt5295 >> Static168.anInt3227;
		@Pc(27) int local27 = super.anInt5296 >> Static168.anInt3227;
		@Pc(31) Class10_Sub1 local31 = this.aClass10_Sub5_1.aClass10_Sub1_5;
		@Pc(35) Class120 local35 = this.aClass10_Sub5_1.aClass120_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt3075 != 0) {
			if (this.aShort70 - this.aShort71 <= local35.anInt3093) {
				local65 = (super.anInt5301 >> 8 & 0xFF00) + (this.anInt5305 >> 16 & 0xFF) + local35.anInt3099 * arg1;
				local82 = (super.anInt5301 & 0xFF00) + (this.anInt5305 >> 8 & 0xFF) + local35.anInt3061 * arg1;
				local99 = ((super.anInt5301 & 0xFF) << 8) + (this.anInt5305 & 0xFF) + local35.anInt3084 * arg1;
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
				super.anInt5301 &= 0xFF000000;
				super.anInt5301 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt5305 &= 0xFF000000;
				this.anInt5305 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort70 - this.aShort71 <= local35.anInt3064) {
				local65 = (super.anInt5301 >> 16 & 0xFF00) + (this.anInt5305 >> 24 & 0xFF) + local35.anInt3077 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt5301 &= 0xFFFFFF;
				super.anInt5301 |= (local65 & 0xFF00) << 16;
				this.anInt5305 &= 0xFFFFFF;
				this.anInt5305 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt3088 != -1 && this.aShort70 - this.aShort71 <= local35.anInt3057) {
			this.anInt5306 += local35.anInt3104 * arg1;
		}
		if (local35.anInt3091 != -1 && this.aShort70 - this.aShort71 <= local35.anInt3105) {
			super.anInt5302 += local35.anInt3058 * arg1;
		}
		local65 = this.aShort67;
		local82 = this.aShort72;
		local99 = this.aShort68;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt3094 == 1) {
			local313 = local17 - this.aClass10_Sub5_1.anInt3016;
			local319 = local22 - this.aClass10_Sub5_1.anInt2998;
			local325 = local27 - this.aClass10_Sub5_1.anInt3004;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt3085 * local340 * arg1;
			this.anInt5306 = (int) ((long) this.anInt5306 - ((long) this.anInt5306 * local348 >> 18));
		} else if (local35.anInt3094 == 2) {
			local313 = local17 - this.aClass10_Sub5_1.anInt3016;
			local319 = local22 - this.aClass10_Sub5_1.anInt2998;
			local325 = local27 - this.aClass10_Sub5_1.anInt3004;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt3085 * local340 * arg1;
			this.anInt5306 = (int) ((long) this.anInt5306 - ((long) this.anInt5306 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray612 != null) {
			@Pc(426) Class2 local426 = local31.aClass30_3.aClass2_41;
			for (@Pc(429) Class2 local429 = local426.aClass2_243; local429 != local426; local429 = local429.aClass2_243) {
				@Pc(433) Class2_Sub10_Sub7 local433 = (Class2_Sub10_Sub7) local429;
				@Pc(436) Class41 local436 = local433.aClass41_1;
				if (local436.anInt1047 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray612.length; local444++) {
						if (local35.anIntArray612[local444] == local436.anInt1049) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt1731;
						@Pc(473) int local473 = local22 - local433.anInt1725;
						local478 = local27 - local433.anInt1730;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong37) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt1729 + local473 * local436.anInt1048 + local478 * local433.anInt1726) * 65535L / (long) (local436.anInt1051 * local501);
							if (local529 >= (long) local436.anInt1041) {
								local537 = 0;
								if (local436.anInt1045 == 1) {
									local537 = (local501 >> 4) * local436.anInt1054;
								} else if (local436.anInt1045 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt1054;
								}
								if (local436.anInt1042 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt1051;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt1051;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt1051;
									if (local436.anInt1056 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt5294 += local643 * arg1 >> 15;
										super.anInt5295 += local652 * arg1 >> 15;
										super.anInt5296 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt1056 == 0) {
									local65 += (local433.anInt1729 - local537) * arg1;
									local82 += (local436.anInt1048 - local537) * arg1;
									local99 += (local433.anInt1726 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt5294 += (local433.anInt1729 - local537) * arg1;
									super.anInt5295 += (local436.anInt1048 - local537) * arg1;
									super.anInt5296 += (local433.anInt1726 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray611 != null) {
			for (local313 = 0; local313 < local35.anIntArray611.length; local313++) {
				@Pc(743) Class2_Sub10_Sub7 local743 = (Class2_Sub10_Sub7) Static146.aClass164_1.method3635((long) local35.anIntArray611[local313]);
				while (local743 != null) {
					@Pc(747) Class41 local747 = local743.aClass41_1;
					local340 = local17 - local743.anInt1731;
					@Pc(757) int local757 = local22 - local743.anInt1725;
					local444 = local27 - local743.anInt1730;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong37) {
						local743 = (Class2_Sub10_Sub7) Static146.aClass164_1.method3637();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt1729 + local757 * local747.anInt1048 + local444 * local743.anInt1726) * 65535L / (long) (local747.anInt1051 * local478);
						if (local491 < (long) local747.anInt1041) {
							local743 = (Class2_Sub10_Sub7) Static146.aClass164_1.method3637();
						} else {
							local501 = 0;
							if (local747.anInt1045 == 1) {
								local501 = (local478 >> 4) * local747.anInt1054;
							} else if (local747.anInt1045 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt1054;
							}
							if (local747.anInt1042 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt1051;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt1051;
								local537 = (local444 << 15) / local478 * local747.anInt1051;
								if (local747.anInt1056 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt5294 += local939 * arg1 >> 15;
									super.anInt5295 += local948 * arg1 >> 15;
									super.anInt5296 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt1056 == 0) {
								local65 += (local743.anInt1729 - local501) * arg1;
								local82 += (local747.anInt1048 - local501) * arg1;
								local99 += (local743.anInt1726 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt5294 += (local743.anInt1729 - local501) * arg1;
								super.anInt5295 += (local747.anInt1048 - local501) * arg1;
								super.anInt5296 += (local743.anInt1726 - local501) * arg1;
							}
							local743 = (Class2_Sub10_Sub7) Static146.aClass164_1.method3637();
						}
					}
				}
			}
		}
		if (local35.anIntArray610 != null) {
			if (local35.anIntArray613 == null) {
				local35.anIntArray613 = new int[local35.anIntArray610.length];
				for (local313 = 0; local313 < local35.anIntArray610.length; local313++) {
					Static141.method2668(local35.anIntArray610[local313]);
					local35.anIntArray613[local313] = ((Class2_Sub14) Static235.aClass246_23.method5613((long) local35.anIntArray610[local313])).anInt1455;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray613.length; local313++) {
				@Pc(1082) Class41 local1082 = Static195.aClass41Array1[local35.anIntArray613[local313]];
				if (local1082.anInt1056 == 0) {
					local65 += local1082.anInt1055 * arg1;
					local82 += local1082.anInt1048 * arg1;
					local99 += local1082.anInt1040 * arg1;
					local303 = true;
				} else {
					super.anInt5294 += local1082.anInt1055 * arg1;
					super.anInt5295 += local1082.anInt1048 * arg1;
					super.anInt5296 += local1082.anInt1040 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort67 = (short) local65;
					this.aShort72 = (short) local82;
					this.aShort68 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt5306 <<= 0x1;
			}
		}
		super.anInt5294 = (int) ((long) super.anInt5294 + ((long) this.aShort67 * (long) this.anInt5306 >> 23) * (long) arg1);
		super.anInt5295 = (int) ((long) super.anInt5295 + ((long) this.aShort72 * (long) this.anInt5306 >> 23) * (long) arg1);
		super.anInt5296 = (int) ((long) super.anInt5296 + ((long) this.aShort68 * (long) this.anInt5306 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!j;IIIIIIIIIIIZ)V")
	public void method4616(@OriginalArg(0) Class10_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass10_Sub5_1 = arg0;
		super.anInt5294 = arg1 << Static168.anInt3227;
		super.anInt5295 = arg2 << Static168.anInt3227;
		super.anInt5296 = arg3 << Static168.anInt3227;
		super.anInt5301 = arg9;
		this.aShort70 = this.aShort71 = (short) arg8;
		super.anInt5302 = arg10;
		super.anInt5303 = arg11;
		this.aShort67 = (short) arg4;
		this.aShort72 = (short) arg5;
		this.aShort68 = (short) arg6;
		this.anInt5306 = arg7;
		super.aByte53 = this.aClass10_Sub5_1.aClass176_1.aByte47;
		this.method4619();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(J)V")
	public void method4617(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt5294 >> 19;
		@Pc(9) int local9 = super.anInt5296 >> 19;
		@Pc(14) int local14 = super.anInt5295 >> Static168.anInt3227;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static12.anInt312 || local9 < 0 || local9 >= Static341.anInt5833) {
			this.method4618();
			return;
		}
		@Pc(36) Class10_Sub1 local36 = this.aClass10_Sub5_1.aClass10_Sub1_5;
		@Pc(40) Class120 local40 = this.aClass10_Sub5_1.aClass120_1;
		@Pc(42) Class107[] local42 = Static350.aClass107Array4;
		@Pc(50) int local50 = local42[local36.anInt286].method4685(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt286 < Static12.anInt311 - 1) {
			local66 = local42[local36.anInt286 + 1].method4685(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean236) {
			if (local40.anInt3079 == -1 && local14 > local50) {
				this.method4618();
				return;
			}
			if (local40.anInt3079 >= 0 && local14 > local42[local40.anInt3079].method4685(local4, local9)) {
				this.method4618();
				return;
			}
			if (local40.anInt3065 == -1 && local14 < local66) {
				this.method4618();
				return;
			}
			if (local40.anInt3065 >= 0 && local14 < local42[local40.anInt3065 + 1].method4685(local4, local9)) {
				this.method4618();
				return;
			}
		}
		if (local4 >= local36.anInt284 && local4 <= local36.anInt285 && local9 >= local36.anInt283 && local9 <= local36.anInt282 && local14 <= local50 && local14 >= local66) {
			local36.aClass186_1.aClass148_1.method3329(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static12.anInt311 - 1; local152 > 0 && local14 > local42[local152].method4685(local4, local9); local152--) {
		}
		if (local152 == Static12.anInt311 - 1 && local42[local152].method4685(local4, local9) - local14 > 1024) {
			this.method4618();
			return;
		}
		@Pc(190) Class251 local190 = Static64.aClass251ArrayArrayArray1[local152][local4][local9];
		if (local190 == null) {
			@Pc(205) boolean local205 = Static64.aClass251ArrayArrayArray1[0][local4][local9].aClass251_1 != null;
			if (local152 == 3 && local205) {
				this.method4618();
				return;
			}
			for (@Pc(215) int local215 = 1; local215 <= local152; local215++) {
				if (Static64.aClass251ArrayArrayArray1[local215][local4][local9] == null) {
					local190 = Static64.aClass251ArrayArrayArray1[local215][local4][local9] = new Class251(local215, local4, local9);
					if (local205) {
						local190.aByte71++;
					}
				}
			}
		}
		if (local190.aClass186_2 == null) {
			local190.aClass186_2 = new Class186();
			local190.aByte75 = (byte) (arg0 & 0xFFL);
		} else if (local190.aByte75 != (byte) (arg0 & 0xFFL)) {
			local190.aClass186_2 = new Class186();
			local190.aByte75 = (byte) (arg0 & 0xFFL);
		}
		local190.aClass186_2.aClass148_1.method3329(this);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "()V")
	private void method4618() {
		this.aClass10_Sub5_1.aClass10_Sub1_5.aClass10_Sub8_Sub1_Sub1Array1[this.aShort69] = null;
		Static299.aClass10_Sub8_Sub1_Sub1Array2[Static319.anInt5426] = this;
		Static319.anInt5426 = Static319.anInt5426 + 1 & 0x3FF;
		this.method4605();
		this.method4608();
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "()V")
	private void method4619() {
		@Pc(4) int local4 = this.aClass10_Sub5_1.aClass10_Sub1_5.anInt279;
		if (this.aClass10_Sub5_1.aClass10_Sub1_5.aClass10_Sub8_Sub1_Sub1Array1[local4] != null) {
			this.aClass10_Sub5_1.aClass10_Sub1_5.aClass10_Sub8_Sub1_Sub1Array1[local4].method4618();
		}
		this.aClass10_Sub5_1.aClass10_Sub1_5.aClass10_Sub8_Sub1_Sub1Array1[local4] = this;
		this.aShort69 = (short) this.aClass10_Sub5_1.aClass10_Sub1_5.anInt279;
		this.aClass10_Sub5_1.aClass10_Sub1_5.anInt279 = local4 + 1 & 0x1FFF;
		this.aClass10_Sub5_1.aClass154_5.method3481(this);
	}
}
