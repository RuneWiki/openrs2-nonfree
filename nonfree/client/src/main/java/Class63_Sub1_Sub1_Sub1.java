import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class63_Sub1_Sub1_Sub1 extends Class63_Sub1_Sub1 {

	@OriginalMember(owner = "client!pr", name = "B", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!pr", name = "J", descriptor = "I")
	private int anInt4819;

	@OriginalMember(owner = "client!pr", name = "I", descriptor = "Lclient!wg;")
	private Class63_Sub8 aClass63_Sub8_1;

	@OriginalMember(owner = "client!pr", name = "G", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!pr", name = "C", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!pr", name = "E", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!pr", name = "F", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!pr", name = "H", descriptor = "I")
	private int anInt4818;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!wg;IIIIIIIIIIIZ)V")
	public Class63_Sub1_Sub1_Sub1(@OriginalArg(0) Class63_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass63_Sub8_1 = arg0;
		super.anInt4812 = arg1 << Static67.anInt1689;
		super.anInt4814 = arg2 << Static67.anInt1689;
		super.anInt4810 = arg3 << Static67.anInt1689;
		super.anInt4817 = arg9;
		this.aShort59 = this.aShort63 = (short) arg8;
		super.anInt4816 = arg10;
		super.anInt4811 = arg11;
		this.aShort61 = (short) arg4;
		this.aShort60 = (short) arg5;
		this.aShort62 = (short) arg6;
		this.anInt4818 = arg7;
		super.aByte53 = this.aClass63_Sub8_1.aClass140_2.aByte49;
		this.method4355();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(J)V")
	public void method4352(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt4812 >> 19;
		@Pc(9) int local9 = super.anInt4810 >> 19;
		@Pc(14) int local14 = super.anInt4814 >> Static67.anInt1689;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static12.anInt378 || local9 < 0 || local9 >= Static248.anInt4822) {
			this.method4356();
			return;
		}
		@Pc(36) Class63_Sub5 local36 = this.aClass63_Sub8_1.aClass63_Sub5_7;
		@Pc(40) Class168 local40 = this.aClass63_Sub8_1.aClass168_1;
		@Pc(42) Class3[] local42 = Static130.aClass3Array2;
		@Pc(50) int local50 = local42[local36.anInt4707].method5638(local4, local9);
		@Pc(64) int local64;
		if (local36.anInt4707 < 3) {
			local64 = local42[local36.anInt4707 + 1].method5638(local4, local9);
		} else {
			local64 = local50 - 1024;
		}
		if (local40.aBoolean388) {
			if (local40.anInt5138 == -1 && local14 > local50) {
				this.method4356();
				return;
			}
			if (local40.anInt5138 >= 0 && local14 > local42[local40.anInt5138].method5638(local4, local9)) {
				this.method4356();
				return;
			}
			if (local40.anInt5145 == -1 && local14 < local64) {
				this.method4356();
				return;
			}
			if (local40.anInt5145 >= 0 && local14 < local42[local40.anInt5145 + 1].method5638(local4, local9)) {
				this.method4356();
				return;
			}
		}
		if (local4 >= local36.anInt4703 && local4 <= local36.anInt4705 && local9 >= local36.anInt4706 && local9 <= local36.anInt4705 && local14 <= local50 && local14 >= local64) {
			local36.aClass21_2.aClass166_1.method4435(this);
			return;
		}
		@Pc(148) byte local148 = 3;
		if (local14 > local42[1].method5638(local4, local9)) {
			local148 = 0;
		} else if (local14 > local42[2].method5638(local4, local9)) {
			local148 = 1;
		} else if (local14 > local42[3].method5638(local4, local9)) {
			local148 = 2;
		} else if (local14 < local42[3].method5638(local4, local9) - 1024) {
			this.method4356();
			return;
		}
		@Pc(202) Class51 local202 = Static138.aClass51ArrayArrayArray1[local148][local4][local9];
		if (local202 == null) {
			@Pc(217) boolean local217 = Static138.aClass51ArrayArrayArray1[0][local4][local9].aClass51_1 != null;
			if (local148 == 3 && local217) {
				this.method4356();
				return;
			}
			for (@Pc(227) int local227 = 1; local227 <= local148; local227++) {
				if (Static138.aClass51ArrayArrayArray1[local227][local4][local9] == null) {
					local202 = Static138.aClass51ArrayArrayArray1[local227][local4][local9] = new Class51(local227, local4, local9);
					if (local217) {
						local202.aByte9++;
					}
				}
			}
		}
		if (local202.aClass21_1 == null) {
			local202.aClass21_1 = new Class21();
			local202.aByte15 = (byte) (arg0 & 0xFFL);
		} else if (local202.aByte15 != (byte) (arg0 & 0xFFL)) {
			local202.aClass21_1 = new Class21();
			local202.aByte15 = (byte) (arg0 & 0xFFL);
		}
		local202.aClass21_1.aClass166_1.method4435(this);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(JI)V")
	public void method4353(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort63 = (short) (this.aShort63 - arg1);
		if (this.aShort63 <= 0) {
			this.method4356();
			return;
		}
		@Pc(17) int local17 = super.anInt4812 >> Static67.anInt1689;
		@Pc(22) int local22 = super.anInt4814 >> Static67.anInt1689;
		@Pc(27) int local27 = super.anInt4810 >> Static67.anInt1689;
		@Pc(31) Class63_Sub5 local31 = this.aClass63_Sub8_1.aClass63_Sub5_7;
		@Pc(35) Class168 local35 = this.aClass63_Sub8_1.aClass168_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt5133 != 0) {
			if (this.aShort59 - this.aShort63 <= local35.anInt5135) {
				local65 = (super.anInt4817 >> 8 & 0xFF00) + (this.anInt4819 >> 16 & 0xFF) + local35.anInt5104 * arg1;
				local82 = (super.anInt4817 & 0xFF00) + (this.anInt4819 >> 8 & 0xFF) + local35.anInt5114 * arg1;
				local99 = ((super.anInt4817 & 0xFF) << 8) + (this.anInt4819 & 0xFF) + local35.anInt5134 * arg1;
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
				super.anInt4817 &= 0xFF000000;
				super.anInt4817 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt4819 &= 0xFF000000;
				this.anInt4819 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort59 - this.aShort63 <= local35.anInt5152) {
				local65 = (super.anInt4817 >> 16 & 0xFF00) + (this.anInt4819 >> 24 & 0xFF) + local35.anInt5117 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt4817 &= 0xFFFFFF;
				super.anInt4817 |= (local65 & 0xFF00) << 16;
				this.anInt4819 &= 0xFFFFFF;
				this.anInt4819 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt5119 != -1 && this.aShort59 - this.aShort63 <= local35.anInt5151) {
			this.anInt4818 += local35.anInt5141 * arg1;
		}
		if (local35.anInt5148 != -1 && this.aShort59 - this.aShort63 <= local35.anInt5153) {
			super.anInt4816 += local35.anInt5111 * arg1;
		}
		local65 = this.aShort61;
		local82 = this.aShort60;
		local99 = this.aShort62;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt5106 == 1) {
			local313 = local17 - this.aClass63_Sub8_1.anInt6430;
			local319 = local22 - this.aClass63_Sub8_1.anInt6428;
			local325 = local27 - this.aClass63_Sub8_1.anInt6429;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt5125 * local340 * arg1;
			this.anInt4818 = (int) ((long) this.anInt4818 - ((long) this.anInt4818 * local348 >> 18));
		} else if (local35.anInt5106 == 2) {
			local313 = local17 - this.aClass63_Sub8_1.anInt6430;
			local319 = local22 - this.aClass63_Sub8_1.anInt6428;
			local325 = local27 - this.aClass63_Sub8_1.anInt6429;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt5125 * local340 * arg1;
			this.anInt4818 = (int) ((long) this.anInt4818 - ((long) this.anInt4818 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray390 != null) {
			@Pc(426) Class5 local426 = local31.aClass211_23.aClass5_235;
			for (@Pc(429) Class5 local429 = local426.aClass5_247; local429 != local426; local429 = local429.aClass5_247) {
				@Pc(433) Class5_Sub9_Sub13 local433 = (Class5_Sub9_Sub13) local429;
				@Pc(436) Class163 local436 = local433.aClass163_1;
				if (local436.anInt4845 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray390.length; local444++) {
						if (local35.anIntArray390[local444] == local436.anInt4846) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt3135;
						@Pc(473) int local473 = local22 - local433.anInt3136;
						local478 = local27 - local433.anInt3139;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong168) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt3138 + local473 * local436.anInt4852 + local478 * local433.anInt3140) * 65535L / (long) (local436.anInt4844 * local501);
							if (local529 >= (long) local436.anInt4850) {
								local537 = 0;
								if (local436.anInt4858 == 1) {
									local537 = (local501 >> 4) * local436.anInt4851;
								} else if (local436.anInt4858 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt4851;
								}
								if (local436.anInt4860 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt4844;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt4844;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt4844;
									if (local436.anInt4853 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt4812 += local643 * arg1 >> 15;
										super.anInt4814 += local652 * arg1 >> 15;
										super.anInt4810 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt4853 == 0) {
									local65 += (local433.anInt3138 - local537) * arg1;
									local82 += (local436.anInt4852 - local537) * arg1;
									local99 += (local433.anInt3140 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt4812 += (local433.anInt3138 - local537) * arg1;
									super.anInt4814 += (local436.anInt4852 - local537) * arg1;
									super.anInt4810 += (local433.anInt3140 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray392 != null) {
			for (local313 = 0; local313 < local35.anIntArray392.length; local313++) {
				@Pc(743) Class5_Sub9_Sub13 local743 = (Class5_Sub9_Sub13) Static222.aClass164_1.method4408((long) local35.anIntArray392[local313]);
				while (local743 != null) {
					@Pc(747) Class163 local747 = local743.aClass163_1;
					local340 = local17 - local743.anInt3135;
					@Pc(757) int local757 = local22 - local743.anInt3136;
					local444 = local27 - local743.anInt3139;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong168) {
						local743 = (Class5_Sub9_Sub13) Static222.aClass164_1.method4409();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt3138 + local757 * local747.anInt4852 + local444 * local743.anInt3140) * 65535L / (long) (local747.anInt4844 * local478);
						if (local491 < (long) local747.anInt4850) {
							local743 = (Class5_Sub9_Sub13) Static222.aClass164_1.method4409();
						} else {
							local501 = 0;
							if (local747.anInt4858 == 1) {
								local501 = (local478 >> 4) * local747.anInt4851;
							} else if (local747.anInt4858 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt4851;
							}
							if (local747.anInt4860 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt4844;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt4844;
								local537 = (local444 << 15) / local478 * local747.anInt4844;
								if (local747.anInt4853 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt4812 += local939 * arg1 >> 15;
									super.anInt4814 += local948 * arg1 >> 15;
									super.anInt4810 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt4853 == 0) {
								local65 += (local743.anInt3138 - local501) * arg1;
								local82 += (local747.anInt4852 - local501) * arg1;
								local99 += (local743.anInt3140 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt4812 += (local743.anInt3138 - local501) * arg1;
								super.anInt4814 += (local747.anInt4852 - local501) * arg1;
								super.anInt4810 += (local743.anInt3140 - local501) * arg1;
							}
							local743 = (Class5_Sub9_Sub13) Static222.aClass164_1.method4409();
						}
					}
				}
			}
		}
		if (local35.anIntArray393 != null) {
			if (local35.anIntArray391 == null) {
				local35.anIntArray391 = new int[local35.anIntArray393.length];
				for (local313 = 0; local313 < local35.anIntArray393.length; local313++) {
					Static316.method5377(local35.anIntArray393[local313]);
					local35.anIntArray391[local313] = ((Class5_Sub37) Static148.aClass42_26.method1052((long) local35.anIntArray393[local313])).anInt5532;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray391.length; local313++) {
				@Pc(1082) Class163 local1082 = Static230.aClass163Array1[local35.anIntArray391[local313]];
				if (local1082.anInt4853 == 0) {
					local65 += local1082.anInt4859 * arg1;
					local82 += local1082.anInt4852 * arg1;
					local99 += local1082.anInt4857 * arg1;
					local303 = true;
				} else {
					super.anInt4812 += local1082.anInt4859 * arg1;
					super.anInt4814 += local1082.anInt4852 * arg1;
					super.anInt4810 += local1082.anInt4857 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort61 = (short) local65;
					this.aShort60 = (short) local82;
					this.aShort62 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt4818 <<= 0x1;
			}
		}
		super.anInt4812 = (int) ((long) super.anInt4812 + ((long) this.aShort61 * (long) this.anInt4818 >> 23) * (long) arg1);
		super.anInt4814 = (int) ((long) super.anInt4814 + ((long) this.aShort60 * (long) this.anInt4818 >> 23) * (long) arg1);
		super.anInt4810 = (int) ((long) super.anInt4810 + ((long) this.aShort62 * (long) this.anInt4818 >> 23) * (long) arg1);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!wg;IIIIIIIIIIIZ)V")
	public void method4354(@OriginalArg(0) Class63_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass63_Sub8_1 = arg0;
		super.anInt4812 = arg1 << Static67.anInt1689;
		super.anInt4814 = arg2 << Static67.anInt1689;
		super.anInt4810 = arg3 << Static67.anInt1689;
		super.anInt4817 = arg9;
		this.aShort59 = this.aShort63 = (short) arg8;
		super.anInt4816 = arg10;
		super.anInt4811 = arg11;
		this.aShort61 = (short) arg4;
		this.aShort60 = (short) arg5;
		this.aShort62 = (short) arg6;
		this.anInt4818 = arg7;
		super.aByte53 = this.aClass63_Sub8_1.aClass140_2.aByte49;
		this.method4355();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "()V")
	private void method4355() {
		@Pc(4) int local4 = this.aClass63_Sub8_1.aClass63_Sub5_7.anInt4701;
		if (this.aClass63_Sub8_1.aClass63_Sub5_7.aClass63_Sub1_Sub1_Sub1Array2[local4] != null) {
			this.aClass63_Sub8_1.aClass63_Sub5_7.aClass63_Sub1_Sub1_Sub1Array2[local4].method4356();
		}
		this.aClass63_Sub8_1.aClass63_Sub5_7.aClass63_Sub1_Sub1_Sub1Array2[local4] = this;
		this.aShort58 = (short) this.aClass63_Sub8_1.aClass63_Sub5_7.anInt4701;
		this.aClass63_Sub8_1.aClass63_Sub5_7.anInt4701 = local4 + 1 & 0x1FFF;
		this.aClass63_Sub8_1.aClass24_7.method620(this);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
	private void method4356() {
		this.aClass63_Sub8_1.aClass63_Sub5_7.aClass63_Sub1_Sub1_Sub1Array2[this.aShort58] = null;
		Static68.aClass63_Sub1_Sub1_Sub1Array1[Static255.anInt4977] = this;
		Static255.anInt4977 = Static255.anInt4977 + 1 & 0x3FF;
		this.method5690();
		this.method4349();
	}
}
